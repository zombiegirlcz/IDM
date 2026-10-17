package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.internal.e3;
import com.fourthline.vision.internal.ra;
import com.fourthline.vision.internal.s9;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class r9 extends l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextRecognizer f36760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3 f36761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h3 f36762c;
    private final v9 d;
    private final a e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36763a = new a("FAIL", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f36764b = new a("DISABLE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f36765c;
        private static final /* synthetic */ EnumEntries d;

        private static final /* synthetic */ a[] $values() {
            return new a[]{f36763a, f36764b};
        }

        static {
            a[] aVarArr$values = $values();
            f36765c = aVarArr$values;
            d = vc.s.n(aVarArr$values);
        }

        private a(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return d;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36765c.clone();
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f9 f36767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Continuation f36768c;
        final /* synthetic */ Function1 d;

        public b(f9 f9Var, Continuation<? super List<? extends e3>> continuation, Function1<? super e3.c, ? extends List<? extends e3>> function1) {
            this.f36767b = f9Var;
            this.f36768c = continuation;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Text) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Text text) {
            h3 h3Var = r9.this.f36762c;
            f3 f3Var = r9.this.f36761b;
            Intrinsics.h(text);
            e3.c cVarCorrect = h3Var.correct(f3Var.buildDetectionRoot(text), s9.getSize(this.f36767b.getImage()));
            Continuation continuation = this.f36768c;
            m.Companion companion = yhm.m.INSTANCE;
            continuation.resumeWith(this.d.invoke(cVarCorrect));
        }
    }

    public static final class c implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f36769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r9 f36770b;

        public c(Continuation<? super List<? extends e3>> continuation, r9 r9Var) {
            this.f36769a = continuation;
            this.f36770b = r9Var;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception e) {
            Throwable gVar;
            Intrinsics.checkNotNullParameter(e, "e");
            Continuation continuation = this.f36769a;
            m.Companion companion = yhm.m.INSTANCE;
            if (this.f36770b.e == a.f36764b) {
                gVar = ra.d.f36776b;
            } else if (e9.isMissingModelsException(e)) {
                gVar = new ra.g(zhm.u.c(DocumentScannerStepWarning.RECOGNITION_MODELS_NOT_DOWNLOADED), null, 2, null);
            } else {
                gVar = e;
                if (!this.f36770b.d.get().booleanValue()) {
                    gVar = new ra.g(zhm.u.c(DocumentScannerStepWarning.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE), null, 2, null);
                }
            }
            continuation.resumeWith(yhm.o.a(gVar));
        }
    }

    public r9(@NotNull TextRecognizer detector, @NotNull f3 detectionAdapter, @NotNull h3 detectionCorrector, @NotNull v9 playServicesAvailable, @NotNull a failureStrategy) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(detectionAdapter, "detectionAdapter");
        Intrinsics.checkNotNullParameter(detectionCorrector, "detectionCorrector");
        Intrinsics.checkNotNullParameter(playServicesAvailable, "playServicesAvailable");
        Intrinsics.checkNotNullParameter(failureStrategy, "failureStrategy");
        this.f36760a = detector;
        this.f36761b = detectionAdapter;
        this.f36762c = detectionCorrector;
        this.d = playServicesAvailable;
        this.e = failureStrategy;
    }

    @Override // com.fourthline.vision.internal.l9
    public Object awaitDetection(@NotNull f9 f9Var, @NotNull Function1<? super e3.c, ? extends List<? extends e3>> function1, @NotNull Continuation<? super List<? extends e3>> frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        this.f36760a.process(f9Var.getImage()).addOnSuccessListener(new s9.a(new b(f9Var, cVar, function1))).addOnFailureListener(new c(cVar, this));
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f36760a.close();
    }

    public /* synthetic */ r9(TextRecognizer textRecognizer, f3 f3Var, h3 h3Var, v9 v9Var, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textRecognizer, f3Var, h3Var, v9Var, (i & 16) != 0 ? a.f36763a : aVar);
    }
}

package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.fourthline.vision.internal.e3;
import com.fourthline.vision.internal.ra;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class z9 extends l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BarcodeScanner f37188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v9 f37189b;

    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f37190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f37191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z9 f37192c;

        public a(Continuation<? super List<? extends e3>> continuation, Function1<? super e3.c, ? extends List<? extends e3>> function1, z9 z9Var) {
            this.f37190a = continuation;
            this.f37191b = function1;
            this.f37192c = z9Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((List<fh.a>) obj2);
            return Unit.f186387a;
        }

        public final void invoke(List<fh.a> list) {
            Continuation continuation = this.f37190a;
            m.Companion companion = yhm.m.INSTANCE;
            Function1 function1 = this.f37191b;
            z9 z9Var = this.f37192c;
            Intrinsics.h(list);
            continuation.resumeWith(function1.invoke(z9Var.textDetection(list)));
        }
    }

    public static final class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f37193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z9 f37194b;

        public b(Continuation<? super List<? extends e3>> continuation, z9 z9Var) {
            this.f37193a = continuation;
            this.f37194b = z9Var;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception e) {
            Throwable th10;
            Intrinsics.checkNotNullParameter(e, "e");
            Continuation continuation = this.f37193a;
            m.Companion companion = yhm.m.INSTANCE;
            if (e9.isMissingModelsException(e)) {
                th10 = ra.b.f36772b;
            } else {
                th10 = e;
                if (!this.f37194b.f37189b.get().booleanValue()) {
                    th10 = ra.c.f36774b;
                }
            }
            continuation.resumeWith(yhm.o.a(th10));
        }
    }

    public static final class c implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f37195a;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f37195a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
        public final /* synthetic */ void onSuccess(Object obj2) {
            this.f37195a.invoke(obj2);
        }
    }

    public z9(@NotNull BarcodeScanner detector, @NotNull v9 playServicesAvailable) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(playServicesAvailable, "playServicesAvailable");
        this.f37188a = detector;
        this.f37189b = playServicesAvailable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e3.c textDetection(List<? extends fh.a> list) {
        e3.d dVar;
        Rect rect;
        ArrayList arrayList = new ArrayList();
        for (fh.a aVar : list) {
            String strA = aVar.f135117a.a();
            if (strA == null || (rect = aVar.f135118b) == null) {
                dVar = null;
            } else {
                fa rectangle = ga.toRectangle(rect);
                dVar = new e3.d(strA, rectangle, zhm.u.c(new e3.a(strA, rectangle, null, 4, null)));
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return new e3.c(arrayList);
    }

    @Override // com.fourthline.vision.internal.l9
    public Object awaitDetection(@NotNull f9 f9Var, @NotNull Function1<? super e3.c, ? extends List<? extends e3>> function1, @NotNull Continuation<? super List<? extends e3>> frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        this.f37188a.process(f9Var.getImage()).addOnSuccessListener(new c(new a(cVar, function1, this))).addOnFailureListener(new b(cVar, this));
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f37188a.close();
    }
}

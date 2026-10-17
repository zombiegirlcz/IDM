package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.fourthline.vision.internal.ra;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.face.FaceDetector;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public abstract class k implements j6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f36430c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FaceDetector f36431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v9 f36432b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f36433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f36434b;

        public b(Continuation<? super T> continuation, Function1<? super List<? extends mh.a>, ? extends T> function1) {
            this.f36433a = continuation;
            this.f36434b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((List<mh.a>) obj2);
            return Unit.f186387a;
        }

        public final void invoke(List<mh.a> list) {
            Continuation continuation = this.f36433a;
            m.Companion companion = yhm.m.INSTANCE;
            Function1 function1 = this.f36434b;
            Intrinsics.h(list);
            continuation.resumeWith(function1.invoke(list));
        }
    }

    public static final class c implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f36435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f36436b;

        public c(Continuation<? super T> continuation, k kVar) {
            this.f36435a = continuation;
            this.f36436b = kVar;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception e) {
            Throwable th10;
            Intrinsics.checkNotNullParameter(e, "e");
            Continuation continuation = this.f36435a;
            m.Companion companion = yhm.m.INSTANCE;
            if (e9.isMissingModelsException(e)) {
                th10 = ra.b.f36772b;
            } else {
                th10 = e;
                if (!this.f36436b.f36432b.get().booleanValue()) {
                    th10 = ra.c.f36774b;
                }
            }
            continuation.resumeWith(yhm.o.a(th10));
        }
    }

    public static final class d implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f36437a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f36437a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
        public final /* synthetic */ void onSuccess(Object obj2) {
            this.f36437a.invoke(obj2);
        }
    }

    public k(@NotNull FaceDetector detector, @NotNull v9 playServicesAvailable) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(playServicesAvailable, "playServicesAvailable");
        this.f36431a = detector;
        this.f36432b = playServicesAvailable;
    }

    private final int decreaseBy(int i, float f) {
        return (int) (i * (1 - f));
    }

    public final boolean areEyesOpen(@NotNull mh.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Float fC = aVar.c();
        Float fB = aVar.b();
        return fC != null && fB != null && fC.floatValue() >= 0.6f && fB.floatValue() >= 0.6f;
    }

    public final <T extends List<? extends h6>> Object awaitDetection(@NotNull f9 f9Var, @NotNull Function1<? super List<? extends mh.a>, ? extends T> function1, @NotNull Continuation<? super T> frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        this.f36431a.process(f9Var.getImage()).addOnSuccessListener(new d(new b(cVar, function1))).addOnFailureListener(new c(cVar, this));
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f36431a.close();
    }

    @NotNull
    public final fa toFaceBox(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return fa.copy$default(ga.toRectangle(rect), decreaseBy(rect.left, -0.1f), decreaseBy(rect.top, 0.1f), decreaseBy(rect.right, 0.1f), 0, 8, null);
    }
}

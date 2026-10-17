package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class x implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f37082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f37083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37084c;
    private final Rect d;
    private final Matrix e;
    private Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Job f37085g;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37087b;
        final /* synthetic */ Function0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Rect> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = function0;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            a aVar = x.this.new a(this.d, continuation);
            aVar.f37087b = obj2;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f37087b
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r6.f37086a
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                yhm.o.b(r7)
                goto L2f
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                yhm.o.b(r7)
            L1c:
                boolean r7 = skm.e0.y(r0)
                if (r7 == 0) goto L67
                r6.f37087b = r0
                r6.f37086a = r3
                r4 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r7 = skm.k0.b(r4, r6)
                if (r7 != r1) goto L2f
                return r1
            L2f:
                com.fourthline.vision.internal.x r7 = com.fourthline.vision.internal.x.this
                android.graphics.Matrix r7 = com.fourthline.vision.internal.x.access$getCameraPreviewToScreenCoordsMatrix$p(r7)
                kotlin.jvm.functions.Function0 r2 = r6.d
                java.lang.Object r2 = r2.invoke()
                android.graphics.Rect r2 = (android.graphics.Rect) r2
                android.graphics.Rect r7 = com.fourthline.vision.internal.h8.copyAndMapRect(r7, r2)
                com.fourthline.vision.internal.x r2 = com.fourthline.vision.internal.x.this
                com.fourthline.vision.internal.x.access$get_TAG$p(r2)
                kotlin.jvm.functions.Function0 r2 = r6.d
                java.lang.Object r2 = r2.invoke()
                java.util.Objects.toString(r2)
                com.fourthline.vision.internal.x r2 = com.fourthline.vision.internal.x.this
                com.fourthline.vision.internal.x.access$get_TAG$p(r2)
                java.util.Objects.toString(r7)
                com.fourthline.vision.internal.x r2 = com.fourthline.vision.internal.x.this
                com.fourthline.vision.internal.s r2 = com.fourthline.vision.internal.x.access$getCamera2$p(r2)
                com.fourthline.vision.internal.x r4 = com.fourthline.vision.internal.x.this
                android.graphics.Rect r4 = com.fourthline.vision.internal.x.access$getCameraPreviewRect$p(r4)
                r2.changeFocusArea$fourthline_vision_release(r7, r4)
                goto L1c
            L67:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public x(@NotNull s camera2, @NotNull CoroutineScope coroutineScope) {
        String name;
        Intrinsics.checkNotNullParameter(camera2, "camera2");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f37082a = coroutineScope;
        this.f37083b = camera2;
        if (x.class.isAnonymousClass()) {
            name = x.class.getName();
            if (name.length() > 23) {
                name = name.substring(name.length() - 23, name.length());
                Intrinsics.checkNotNullExpressionValue(name, "substring(...)");
            }
        } else {
            name = "x";
        }
        this.f37084c = name;
        this.d = new Rect();
        this.e = new Matrix();
        this.f = new aem.v(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect contentDetectionAreaProvider$lambda$0() {
        return new Rect();
    }

    private final void onContentDetectionAreaFactoryChange(Function0<Rect> function0) {
        stop();
        this.f37085g = skm.e0.C(this, null, null, new a(function0, null), 3);
    }

    @NotNull
    public final Function0<Rect> getContentDetectionAreaProvider() {
        return this.f;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f37082a.getF74819h();
    }

    public final void setContentDetectionAreaProvider(@NotNull Function0<Rect> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        onContentDetectionAreaFactoryChange(value);
    }

    public final void setup(@NotNull Rect screenRect, @NotNull Rect cameraPreviewRect) {
        Intrinsics.checkNotNullParameter(screenRect, "screenRect");
        Intrinsics.checkNotNullParameter(cameraPreviewRect, "cameraPreviewRect");
        this.d.set(cameraPreviewRect);
        this.e.setTranslate((cameraPreviewRect.width() - screenRect.width()) * 0.5f, (cameraPreviewRect.height() - screenRect.height()) * 0.5f);
    }

    public final void stop() {
        Job job2 = this.f37085g;
        if (job2 != null) {
            job2.f(null);
        }
    }
}

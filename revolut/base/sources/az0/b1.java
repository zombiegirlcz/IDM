package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class b1 extends gim.i implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ Function1 B;
    public int u;
    public final /* synthetic */ QrCodeImage v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f11294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f11295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f11296y;
    public final /* synthetic */ ImageView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(QrCodeImage qrCodeImage, w0 w0Var, Context context, Function0 function0, ImageView imageView, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.v = qrCodeImage;
        this.f11294w = w0Var;
        this.f11295x = context;
        this.f11296y = function0;
        this.z = imageView;
        this.A = function1;
        this.B = function12;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b1(this.v, this.f11294w, this.f11295x, this.f11296y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 2
            r3 = 1
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r4 = r7.v
            android.content.Context r5 = r7.f11295x
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L53
            goto L4a
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L53
            goto L38
        L20:
            yhm.o.b(r8)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance r8 = r4.f59993b     // Catch: java.lang.Exception -> L53
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type r8 = r8.f59970a     // Catch: java.lang.Exception -> L53
            boolean r1 = r8 instanceof com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Classic     // Catch: java.lang.Exception -> L53
            az0.w0 r6 = r7.f11294w
            if (r1 == 0) goto L3b
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Classic r8 = (com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Classic) r8     // Catch: java.lang.Exception -> L53
            r7.u = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r8 = az0.w0.g(r6, r5, r4, r8, r7)     // Catch: java.lang.Exception -> L53
            if (r8 != r0) goto L38
            goto L49
        L38:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8     // Catch: java.lang.Exception -> L53
            goto L5b
        L3b:
            boolean r1 = r8 instanceof com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Rounded     // Catch: java.lang.Exception -> L53
            if (r1 == 0) goto L4d
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded r8 = (com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Rounded) r8     // Catch: java.lang.Exception -> L53
            r7.u = r2     // Catch: java.lang.Exception -> L53
            java.lang.Object r8 = az0.w0.h(r6, r5, r4, r8, r7)     // Catch: java.lang.Exception -> L53
            if (r8 != r0) goto L4a
        L49:
            return r0
        L4a:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8     // Catch: java.lang.Exception -> L53
            goto L5b
        L4d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L53
            r8.<init>()     // Catch: java.lang.Exception -> L53
            throw r8     // Catch: java.lang.Exception -> L53
        L53:
            kotlin.jvm.functions.Function0 r8 = r7.f11296y
            if (r8 == 0) goto L5a
            r8.invoke()
        L5a:
            r8 = 0
        L5b:
            if (r8 == 0) goto L86
            com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations r0 = r4.d
            if (r0 != 0) goto L70
            android.widget.ImageView r0 = r7.z
            if (r0 == 0) goto L68
            r0.setImageDrawable(r8)
        L68:
            kotlin.jvm.functions.Function1 r0 = r7.A
            if (r0 == 0) goto L86
            r0.invoke(r8)
            goto L86
        L70:
            com.bumptech.glide.n r0 = com.bumptech.glide.b.d(r5)
            com.bumptech.glide.j r8 = r0.q(r8)
            java.lang.String r0 = "load(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            com.bumptech.glide.j r8 = te0.w.d(r8, r5, r4)
            kotlin.jvm.functions.Function1 r0 = r7.B
            r0.invoke(r8)
        L86:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

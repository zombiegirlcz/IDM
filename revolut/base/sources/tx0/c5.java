package tx0;

import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class c5 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ Drawable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WallpaperAssetSwitcher f275098w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(Drawable drawable, WallpaperAssetSwitcher wallpaperAssetSwitcher, Continuation continuation) {
        super(2, continuation);
        this.v = drawable;
        this.f275098w = wallpaperAssetSwitcher;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c5(this.v, this.f275098w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c5) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
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
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            yhm.o.b(r8)
            goto L8f
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher r8 = r7.f275098w
            r1 = 0
            android.graphics.drawable.Drawable r3 = r7.v
            if (r3 == 0) goto L60
            android.content.Context r4 = r8.getContext()
            java.lang.String r5 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = "drawable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            ix0.t0 r3 = ix0.s0.g(r4, r3)
            if (r3 == 0) goto L60
            int r3 = r3.f169308a
            r5 = 3
            float[] r5 = new float[r5]
            android.graphics.Color.colorToHSV(r3, r5)
            boolean r3 = kli.a.q(r4)
            if (r3 == 0) goto L4b
            r3 = 1053609165(0x3ecccccd, float:0.4)
            goto L4e
        L4b:
            r3 = 1061997773(0x3f4ccccd, float:0.8)
        L4e:
            r4 = 2
            r6 = r5[r4]
            float r3 = java.lang.Math.min(r6, r3)
            r5[r4] = r3
            int r3 = android.graphics.Color.HSVToColor(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L61
        L60:
            r3 = r1
        L61:
            if (r3 == 0) goto L79
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground r4 = new com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground
            com.revolut.core.ui_kit_core.displayers.image.models.ColorImage r5 = new com.revolut.core.ui_kit_core.displayers.image.models.ColorImage
            com.revolut.core.ui_kit_core.displayers.image.models.ColorImage$ColorInteger r6 = new com.revolut.core.ui_kit_core.displayers.image.models.ColorImage$ColorInteger
            int r3 = r3.intValue()
            r6.<init>(r3)
            r5.<init>(r6, r1)
            r3 = 14
            r4.<init>(r5, r1, r1, r3)
            goto L7b
        L79:
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$TransparentBackground r4 = com.revolut.core.ui_kit.models.NavBarWithContainerBackground.TransparentBackground.f57882a
        L7b:
            skm.p0 r3 = skm.p0.f264001a
            tkm.e r3 = zkm.o.f323119a
            tna.p r5 = new tna.p
            r6 = 25
            r5.<init>(r8, r4, r1, r6)
            r7.u = r2
            java.lang.Object r8 = skm.e0.J(r3, r5, r7)
            if (r8 != r0) goto L8f
            return r0
        L8f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.c5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

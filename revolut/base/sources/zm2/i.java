package zm2;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function1 {
    public em2.e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f323328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bitmap f323329x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Bitmap bitmap, Continuation continuation) {
        super(1, continuation);
        this.f323328w = jVar;
        this.f323329x = bitmap;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f323328w, this.f323329x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            zm2.j r1 = r9.f323328w
            bn2.f r0 = r1.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L28
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1c
            em2.e r2 = r9.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L18
            goto L82
        L18:
            r0 = move-exception
        L19:
            r10 = r0
            goto L89
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            yhm.o.b(r10)
            goto L44
        L28:
            yhm.o.b(r10)
            r9.v = r5
            r0.getClass()
            b96.d r10 = new b96.d
            r3 = 20
            android.graphics.Bitmap r5 = r9.f323329x
            r10.<init>(r0, r5, r6, r3)
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r3, r10, r9)
            if (r10 != r2) goto L44
            goto L80
        L44:
            java.lang.String r10 = (java.lang.String) r10
            r0.getClass()
            java.lang.String r3 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            km2.i r0 = r0.f17007b
            em2.e r10 = r0.b(r10)
            if (r10 == 0) goto Lb9
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L65
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r0 = fm2.a.a(r10)     // Catch: java.lang.Throwable -> L65
            boolean r3 = r0 instanceof com.revolut.core.ui_kit.models.NavBarWithContainerBackground.ImageBackground     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L68
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground r0 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground.ImageBackground) r0     // Catch: java.lang.Throwable -> L65
            com.revolut.core.ui_kit_core.displayers.image.Image r0 = r0.f57879a     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r0 = move-exception
            r2 = r10
            goto L19
        L68:
            r0 = r6
        L69:
            boolean r3 = r0 instanceof com.revolut.core.ui_kit_core.displayers.image.models.WallpaperImage     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L70
            com.revolut.core.ui_kit_core.displayers.image.models.WallpaperImage r0 = (com.revolut.core.ui_kit_core.displayers.image.models.WallpaperImage) r0     // Catch: java.lang.Throwable -> L65
            goto L71
        L70:
            r0 = r6
        L71:
            if (r0 == 0) goto L85
            az0.w1 r3 = r1.f323330p     // Catch: java.lang.Throwable -> L65
            r9.u = r10     // Catch: java.lang.Throwable -> L65
            r9.v = r4     // Catch: java.lang.Throwable -> L65
            r4 = 0
            java.lang.Object r0 = r3.c(r0, r4, r9)     // Catch: java.lang.Throwable -> L65
            if (r0 != r2) goto L81
        L80:
            return r2
        L81:
            r2 = r10
        L82:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L18
            goto L86
        L85:
            r2 = r10
        L86:
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L18
            goto L8f
        L89:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r10)
        L8f:
            java.lang.Throwable r10 = yhm.m.a(r6)
            if (r10 == 0) goto Lae
            boolean r0 = r10 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lad
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r3 = rd0.c.WARNING
            java.lang.String r0 = "prefetch of wallpaper failed: "
            java.lang.String r5 = v1.c.u(r0, r10)
            r7 = 0
            r8 = 16
            java.lang.String r4 = "UploadBackgroundControllerModel"
            r6 = 0
            rd0.d.b(r3, r4, r5, r6, r7, r8)
            goto Lae
        Lad:
            throw r10
        Lae:
            zm2.f r10 = new zm2.f
            r10.<init>(r2)
            r1.C2(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lb9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zm2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package fn5;

import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import kotlin.jvm.internal.Intrinsics;
import nhe.p;
import yfe.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends yfe.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ii5.g f136531l;

    public c(ii5.g cryptoPermissionModelExtension) {
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        this.f136531l = cryptoPermissionModelExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f136531l, null);
    }

    @Override // yfe.c
    public final /* bridge */ /* synthetic */ Object b3(h.c cVar, p pVar) {
        return d3(pVar);
    }

    @Override // yfe.c
    public final Object c3(h.a aVar, p pVar) {
        A2(new MainContainerScreenDestination.JustShow(ibb.c.d.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14));
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fn5.a
            if (r0 == 0) goto L13
            r0 = r6
            fn5.a r0 = (fn5.a) r0
            int r1 = r0.f136530w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136530w = r1
            goto L18
        L13:
            fn5.a r0 = new fn5.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136530w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L4b
        L27:
            r6 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            ii5.g r6 = r5.f136531l     // Catch: java.lang.Exception -> L27
            fn5.b r2 = new fn5.b     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Exception -> L27
            r0.f136530w = r3     // Catch: java.lang.Exception -> L27
            r4 = 3
            java.lang.Object r6 = vh5.a.b3(r6, r2, r0, r4)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L4b
            return r1
        L46:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L50
            r3 = 0
        L4b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L50:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn5.c.d3(gim.c):java.lang.Object");
    }
}

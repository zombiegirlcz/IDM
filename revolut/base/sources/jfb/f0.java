package jfb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReverywhereWebAppScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ReverywhereWebAppScreen reverywhereWebAppScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reverywhereWebAppScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u
            com.revolut.core.ui_kit.delegates.FullScreenStateDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.FullScreenStateDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r4)
            com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen r4 = r3.v
            jfb.h0 r4 = r4.R2()
            java.lang.String r0 = r0.f52373a
            com.revolut.feature.retail.reverywhere.impl.web_app.d r4 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) r4
            r4.getClass()
            java.lang.String r1 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r0.hashCode()
            r2 = 57569588(0x36e7134, float:7.0071865E-37)
            if (r1 == r2) goto L5e
            r2 = 750190437(0x2cb6ff65, float:5.2011056E-12)
            if (r1 == r2) goto L55
            r2 = 1860730819(0x6ee87fc3, float:3.5977488E28)
            if (r1 == r2) goto L2f
            goto L6b
        L2f:
            java.lang.String r1 = "REVERYWHERE_APP_APPLINK_ERROR_STATE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6b
            cli.y r0 = r4.B
            je5.n r1 = new je5.n
            r2 = 11
            r1.<init>(r2)
            r4.H2(r0, r1)
            jfb.s0 r0 = new jfb.s0
            r1 = 2
            r2 = 0
            r0.<init>(r4, r2, r1)
            yi5.b r1 = new yi5.b
            r2 = 26
            r1.<init>(r2)
            r4.l2(r0, r1)
            goto L6b
        L55:
            java.lang.String r1 = "REVERYWHERE_APP_TOKEN_ERROR_STATE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L6b
        L5e:
            java.lang.String r1 = "REVERYWHERE_APP_UNKNOWN_ERROR_STATE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L6b
        L67:
            r0 = 0
            r4.J2(r0)
        L6b:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jfb.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package wk4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SetDateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SetDateScreen setDateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = setDateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen r8 = r7.v
            wk4.d r8 = r8.T2()
            java.lang.String r0 = r0.f52613a
            wk4.m r8 = (wk4.m) r8
            r8.getClass()
            j60.a r1 = r8.f298248q
            java.lang.String r2 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            int r2 = r0.hashCode()
            r3 = -1874020349(0xffffffff904cb803, float:-4.0373664E-29)
            r4 = 3
            r5 = 0
            r6 = 0
            if (r2 == r3) goto L4d
            r3 = -1786285072(0xffffffff958773f0, float:-5.470898E-26)
            if (r2 == r3) goto L3d
            r8 = -1746368665(0xffffffff97e88767, float:-1.5026829E-24)
            if (r2 == r8) goto L34
            goto L59
        L34:
            java.lang.String r8 = "ID_BUTTON_GOT_IT"
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L56
            goto L59
        L3d:
            java.lang.String r2 = "ID_BUTTON_CONTINUE"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
            goto L59
        L46:
            j60.a.v(r1, r6, r5, r4)
            r8.y2()
            goto L59
        L4d:
            java.lang.String r8 = "ID_BUTTON_CANCEL"
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L56
            goto L59
        L56:
            j60.a.v(r1, r6, r5, r4)
        L59:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wk4.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package aj6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.AccountsSelectionAuScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountsSelectionAuScreen f5405w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AccountsSelectionAuScreen accountsSelectionAuScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5405w = accountsSelectionAuScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f5405w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f5405w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.u
            r1 = 0
            com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.AccountsSelectionAuScreen r2 = r6.f5405w
            switch(r0) {
                case 0: goto L36;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r6.v
            ty0.a r0 = (ty0.a) r0
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            aj6.p r7 = r2.e3()
            java.lang.String r0 = r0.f275445a
            aj6.x r7 = (aj6.x) r7
            r7.getClass()
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "CDR_POLICY_CLICK_ID"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L33
            com.revolut.kompot.common.ExternalDestination$Browser r0 = new com.revolut.kompot.common.ExternalDestination$Browser
            java.lang.String r2 = "https://www.revolut.com/en-AU/legal/cdrpolicy"
            r0.<init>(r2, r1)
            r7.C1(r0)
        L33:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L36:
            java.lang.Object r0 = r6.v
            kotlin.Pair r0 = (kotlin.Pair) r0
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            aj6.p r7 = r2.e3()
            java.lang.Object r2 = r0.f186385a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.f186386b
            aj6.x r7 = (aj6.x) r7
            cli.y r3 = r7.u
            java.lang.String r4 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            boolean r4 = r0 instanceof java.lang.String
            if (r4 != 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L5d
            goto La3
        L5d:
            java.util.Set r0 = aj6.x.v
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L70
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L70
            goto L91
        L70:
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.a0.H(r2, r4, r5)
            if (r4 == 0) goto L74
            a31.g r0 = new a31.g
            r2 = 27
            r0.<init>(r2, r1, r7)
            r7.H2(r3, r0)
            goto La3
        L91:
            java.lang.String r0 = "loan_list_item_"
            boolean r0 = kotlin.text.a0.H(r2, r0, r5)
            if (r0 == 0) goto La3
            a31.g r0 = new a31.g
            r2 = 28
            r0.<init>(r2, r1, r7)
            r7.H2(r3, r0)
        La3:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aj6.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

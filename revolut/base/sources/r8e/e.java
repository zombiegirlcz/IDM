package r8e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupMembersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupMembersScreen groupMembersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupMembersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen r6 = r5.v
            r8e.i r6 = r6.T2()
            java.lang.String r1 = r0.f53228a
            java.lang.Object r0 = r0.u
            r8e.n r6 = (r8e.n) r6
            r6.getClass()
            java.lang.String r2 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r0 instanceof com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData
            if (r2 == 0) goto L7a
            int r2 = r1.hashCode()
            r3 = -1318579942(0xffffffffb168111a, float:-3.3770164E-9)
            r4 = 0
            if (r2 == r3) goto L57
            r3 = 1610352096(0x5ffc05e0, float:3.6320335E19)
            if (r2 == r3) goto L47
            r3 = 1610358111(0x5ffc1d5f, float:3.6333562E19)
            if (r2 == r3) goto L36
            goto L5f
        L36:
            java.lang.String r2 = "ACTION_ID_REMOVE"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L5f
        L3f:
            rsi.d r1 = new rsi.d
            com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData r0 = (com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData) r0
            r1.<init>(r0)
            goto L68
        L47:
            java.lang.String r2 = "ACTION_ID_REMIND"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5f
            rsi.c r1 = new rsi.c
            com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData r0 = (com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData) r0
            r1.<init>(r0)
            goto L68
        L57:
            java.lang.String r2 = "ACTION_ID_TOGGLE_WITHDRAW"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L61
        L5f:
            r1 = r4
            goto L68
        L61:
            rsi.e r1 = new rsi.e
            com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData r0 = (com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData) r0
            r1.<init>(r0)
        L68:
            if (r1 == 0) goto L7a
            r8e.l r0 = new r8e.l
            r2 = 0
            r0.<init>(r6, r1, r4, r2)
            yi5.b r1 = new yi5.b
            r2 = 26
            r1.<init>(r2)
            r6.l2(r0, r1)
        L7a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r8e.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

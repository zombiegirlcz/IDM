package zs2;

import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yui.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InviteContactsScreen f324791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InviteContactsScreen inviteContactsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324791w = inviteContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f324791w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f324791w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InviteContactsScreen inviteContactsScreen = this.f324791w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = inviteContactsScreen.d();
                Intrinsics.h(query);
                com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar2 = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) lVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar2.H2(aVar2.z, new v(query, 29));
                aVar2.I2();
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = InviteContactsScreen.W;
                ScreenContentRecyclerView inviteContactsActions = inviteContactsScreen.d3().f273946b;
                Intrinsics.checkNotNullExpressionValue(inviteContactsActions, "inviteContactsActions");
                inviteContactsActions.setVisibility(!bool.booleanValue() ? 0 : 8);
                break;
        }
        return Unit.f186387a;
    }
}

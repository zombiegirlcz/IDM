package ull;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheet;
import gim.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ua2.r;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountsToApplyChangesBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AccountsToApplyChangesBottomSheet accountsToApplyChangesBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = accountsToApplyChangesBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.S.getValue();
        Intrinsics.h(model);
        g gVar = (g) eVar;
        y yVar = gVar.o;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        UserInfoAccount userInfoAccount = obj3 instanceof UserInfoAccount ? (UserInfoAccount) obj3 : null;
        if (userInfoAccount == null) {
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Parcel's type is not expected");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        } else {
            List list = ((b) ((j2) yVar.f22677a).getValue()).f281051c;
            gVar.H2(yVar, new r(1, list.contains(userInfoAccount) ? d0.A0(list, userInfoAccount) : d0.F0(userInfoAccount, list)));
        }
        return Unit.f186387a;
    }
}

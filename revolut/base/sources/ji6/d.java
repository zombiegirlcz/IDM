package ji6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import do3.q;
import gim.i;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f174376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f174377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar, String str, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f174376w = str;
        this.f174377x = linkedHashSet;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f174376w, this.f174377x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objT;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            c cVar = new c(aVar2, this.f174377x, null, 1);
            this.u = 1;
            objT = q.t(aVar2, cVar, this);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objT = obj2;
        }
        pi6.c cVar2 = (pi6.c) objT;
        if (cVar2 instanceof pi6.a) {
            String str = ((pi6.a) cVar2).f236435a;
            l.a1(aVar2, aVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.oba_authorize_accounts_brexit_error_title, null, null, 14), new TextLocalisedClause(R$string.oba_authorize_accounts_brexit_error_subtitle, u.c(this.f174376w), null, 12), str != null ? new TextLocalisedClause(R$string.oba_authorize_accounts_brexit_error_take_me_back_button, null, null, 14) : null, null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new f(str, aVar2, null), 3);
            return Unit.f186387a;
        }
        if (!(cVar2 instanceof pi6.b)) {
            throw new NoWhenBranchMatchedException();
        }
        h.D2(aVar2.f72498s);
        Object obj3 = ((pi6.b) cVar2).f236436a;
        Intrinsics.checkNotNullExpressionValue(obj3, "<get-result>(...)");
        return aVar2.C1(new ExternalDestination.Browser((String) obj3, null));
    }
}

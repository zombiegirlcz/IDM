package v6e;

import com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f286348b;

    public /* synthetic */ c(j jVar, int i) {
        this.f286347a = i;
        this.f286348b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286347a) {
            case 0:
                NaviCommand naviCommand = (NaviCommand) obj2;
                sri.m mVar = this.f286348b.f286355a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Subaccount subaccount = (Subaccount) pair.f186385a;
                return g6e.g.b(this.f286348b.f286356b, subaccount, x8e.a.c(subaccount, (do3.n) pair.f186386b), null, null, null, null, 508);
            default:
                Subaccount subaccount2 = (Subaccount) obj2;
                Intrinsics.checkNotNullParameter(subaccount2, "it");
                ((r) this.f286348b.f286356b).getClass();
                Intrinsics.checkNotNullParameter(subaccount2, "subaccount");
                return u0.f(new SubaccountAddMoneyDestination(subaccount2.getF88959a().f234881a));
        }
    }
}

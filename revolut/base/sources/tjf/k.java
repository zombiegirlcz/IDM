package tjf;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.globalsearch.api.R$string;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.fc;
import tof.va;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f271671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f271672c;

    public /* synthetic */ k(n nVar, String str, int i) {
        this.f271670a = i;
        this.f271671b = nVar;
        this.f271672c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271670a) {
            case 0:
                if (!((Boolean) obj2).booleanValue()) {
                    efm.r rVarJust = efm.r.just(zi0.c.P(zhm.f0.f322471a, false, null, 3));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                n nVar = this.f271671b;
                l0 l0Var = nVar.f271685c;
                efm.r rVarSwitchMap = l0Var.g(false, io3.l.CREDIT, io3.i.INTERNAL).switchMap(new tid.a(new k(nVar, this.f271672c, 1), 15));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return ue0.e.E(rVarSwitchMap, l0Var.b(R$string.search_block_recent_transactions_title, "CREDIT_TRANSACTIONS_SECTION_LIST_ID"));
            default:
                Set pocketIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
                n nVar2 = this.f271671b;
                return nim.a.w(shf.a.a(nVar2.f271685c, fc.a(nVar2.e, new va(pocketIds)), this.f271672c, 4, null, null, SyslogConstants.LOG_CLOCK), new e(nVar2, 1));
        }
    }
}

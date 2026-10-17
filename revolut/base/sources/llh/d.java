package llh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f196808b;

    public /* synthetic */ d(f fVar, int i) {
        this.f196807a = i;
        this.f196808b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f196807a) {
            case 0:
                WealthAccount.Robo account = (WealthAccount.Robo) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                boolean zQ2 = account.Q2();
                f fVar = this.f196808b;
                if (!zQ2) {
                    return new ufm.i(clc.b.a(fVar.f196813b, 2), new v(29, new d(fVar, 1)), 0);
                }
                return w.o0(kotlin.coroutines.g.f186406a, new e(account, fVar, null));
            default:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((llc.b) this.f196808b.f196814c).a(it8);
        }
    }
}

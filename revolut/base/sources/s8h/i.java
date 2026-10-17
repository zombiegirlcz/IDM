package s8h;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f261010b;

    public /* synthetic */ i(m mVar, int i) {
        this.f261009a = i;
        this.f261010b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261009a) {
            case 0:
                NaviCommand destination = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.f261010b.f261023c.c(destination);
                return Boolean.TRUE;
            case 1:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return rd0.e.c(((d4f.p) this.f261010b.f261021a).i(new z2f.c(it8), w4l.h.f294642c), skm.p0.f264003c);
            default:
                dfl.i0 transaction = (dfl.i0) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                WealthAccountType accountType = transaction.b();
                oc.f fVar = this.f261010b.f261022b;
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                return nim.a.w(rd0.e.c(fVar.a(accountType).b().a(zhm.u.c(transaction)), skm.p0.f264003c), new h(0));
        }
    }
}

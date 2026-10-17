package pd3;

import a83.o0;
import al4.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od3.f0;
import od3.q;
import om4.s3;
import pb2.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f235050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd3.d f235051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f235052c;

    public b(j creditCardEntryPointDetailsInteractor, nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f235050a = creditCardEntryPointDetailsInteractor;
        this.f235051b = cashbackTransactionsFilterProvider;
        this.f235052c = transactionsContentProvider;
    }

    @Override // pd3.a
    public final f0 a() {
        return new q(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // pd3.a
    public final Flow b() {
        return new t38.e(nim.a.v(((s3) this.f235050a).v(), new v(this, 7)), 24, rd0.e.b(whf.b.a(this.f235052c, this.f235051b.b(uc3.d.CREDIT), null, null, null, 14)), new o0(3, 16, null));
    }
}

package w72;

import cli.k;
import cli.l;
import cli.m;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsFlowContract$State;
import com.revolut.feature.kyc_documents_scan.ui.onfido.a;
import com.revolut.feature.kyc_documents_scan.ui.onfido.b;
import ip0.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295460a;

    public /* synthetic */ g(int i) {
        this.f295460a = i;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        switch (this.f295460a) {
            case 0:
                b it8 = (b) jVar;
                Intrinsics.checkNotNullParameter(it8, "it");
                return m.f25030a;
            case 1:
                k it9 = (k) jVar;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new x22.a(u.c(new c0("ACTIONS_ID", new u.a(2, 2), 0, 0, 60)));
            case 2:
                Intrinsics.checkNotNullParameter((CreditApplicationAgreementsFlowContract$State) jVar, "<unused var>");
                return l.f25029a;
            case 3:
                k it10 = (k) jVar;
                Intrinsics.checkNotNullParameter(it10, "it");
                return l.f25029a;
            case 4:
                yi8.b it11 = (yi8.b) jVar;
                Intrinsics.checkNotNullParameter(it11, "it");
                return yi8.d.f314267a;
            case 5:
                k it12 = (k) jVar;
                Intrinsics.checkNotNullParameter(it12, "it");
                return l.f25029a;
            case 6:
                com.revolut.feature.kyc_documents_scan.ui.onfido.a domain = (com.revolut.feature.kyc_documents_scan.ui.onfido.a) jVar;
                Intrinsics.checkNotNullParameter(domain, "domain");
                if (domain instanceof a.C0514a) {
                    return b.a.f77957a;
                }
                if (domain instanceof yy8.b) {
                    return new yy8.e(((yy8.b) domain).f317864a);
                }
                throw new NoWhenBranchMatchedException();
            default:
                zn8.b it13 = (zn8.b) jVar;
                Intrinsics.checkNotNullParameter(it13, "it");
                return l.f25029a;
        }
    }
}

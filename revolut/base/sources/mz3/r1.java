package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.DummyCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;

/* JADX INFO: loaded from: classes22.dex */
public final class r1 implements sv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210668a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mri.w f210669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f210670c;

    public r1(mri.w revolutJobInteractor, vx4.a loanProductCommandFactory) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(loanProductCommandFactory, "loanProductCommandFactory");
        this.f210669b = revolutJobInteractor;
        this.f210670c = loanProductCommandFactory;
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        efm.d0 d0VarM;
        switch (this.f210668a) {
            case 0:
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
                ufm.i iVar = new ufm.i(new pfm.z(pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, null, 4)), 0, new i(payload, 16), null), new s(new a7(this, 19), 12), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.F(iVar, DummyCommand.f98635a);
            default:
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
                it3.d dVar = payload.f66247a;
                Object obj3 = dVar.e;
                if (!(obj3 instanceof hs3.y)) {
                    List list = dVar.f;
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof hs3.y) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        obj2 = (hs3.v) next;
                    } else {
                        obj2 = null;
                    }
                } else {
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.ExitMetadata");
                    }
                    obj2 = (hs3.y) obj3;
                }
                hs3.y yVar = (hs3.y) obj2;
                pfm.h hVarN = pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, null, 7));
                String str = dVar.f168323a;
                ft3.j1 j1Var = yVar != null ? yVar.f154972b : null;
                String str2 = yVar != null ? yVar.f154971a : null;
                if (str2 == null) {
                    d0VarM = efm.d0.l(new IllegalStateException(j6.a.q("Facility id must not be null for this application ", str)));
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "error(...)");
                } else {
                    int i = j1Var == null ? -1 : r2.f210671a[j1Var.ordinal()];
                    if (i == 1 || i == 2) {
                        d0VarM = efm.d0.m(((hz3.c) this.f210670c).a(j1Var, str2));
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                    } else {
                        d0VarM = efm.d0.l(new IllegalStateException("Not supported for " + j1Var));
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "error(...)");
                    }
                }
                rfm.f0 f0VarF = hVarN.f(d0VarM);
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return ue0.e.F(f0VarF, DummyCommand.f98635a);
        }
    }

    public r1(hz3.c creditApplicationCommandsFactory, mri.w revolutJobInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        this.f210670c = creditApplicationCommandsFactory;
        this.f210669b = revolutJobInteractor;
    }
}

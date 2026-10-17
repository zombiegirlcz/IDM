package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class i2 implements sv3.b {

    @NotNull
    public static final h2 Companion = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mri.w f210609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vx4.a f210610b;

    public i2(mri.w revolutJobInteractor, vx4.a loanProductCommandFactory) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(loanProductCommandFactory, "loanProductCommandFactory");
        this.f210609a = revolutJobInteractor;
        this.f210610b = loanProductCommandFactory;
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        ufm.b bVarM;
        efm.d0 d0VarL;
        Map map;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.y)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.y) {
                        break;
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
        String str = (yVar == null || (map = yVar.f154973c) == null) ? null : (String) map.get("insurancePolicyId");
        pfm.h hVarN = pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, null, 6));
        String str2 = dVar.f168323a;
        String str3 = yVar != null ? yVar.f154971a : null;
        if (str3 == null) {
            d0VarL = efm.d0.l(new IllegalStateException(j6.a.q("Facility id must not be null for this application ", str2)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
        } else {
            vx4.a aVar = this.f210610b;
            if (str != null) {
                bVarM = efm.d0.m(new CompositeCommand(aVar.b(str3), zh9.u0.f(new InsuranceCreditNavigationDestination(new Facility.Loan(str3), str, null))));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            } else {
                bVarM = efm.d0.m(aVar.b(str3));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            }
            d0VarL = bVarM;
        }
        rfm.f0 f0VarF = hVarN.f(d0VarL);
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return ue0.e.F(f0VarF, DummyCommand.f98635a);
    }
}

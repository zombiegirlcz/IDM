package k37;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m37.g f180649a;

    public x(m37.g componentFactory) {
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        this.f180649a = componentFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        q qVar = (q) iii.c.f(domainState.f180629b, new s(4), new k1f.n(8), new j75.i(this, domainState, 25));
        boolean z = qVar instanceof n;
        TextLocalisedClause textLocalisedClause = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_tax_profile_payment_breakdown_action_continue, null, null, 14);
        Data data = domainState.f180629b;
        f fVar = (f) data.getContent();
        if (fVar != null && z) {
            wi0.b bVarY = do3.q.y(fVar.f180627c);
            wi0.b.Companion.getClass();
            if (bVarY.equals(wi0.b.p0)) {
                int i = R$string.freelancer_tax_profile_common_disclaimer_footer_gb;
                int i2 = R$string.freelancer_tax_profile_common_disclaimer_footer_tax_authorities_gb;
                int i3 = R$attr.uikit_colorAccent;
                String str = fVar.f180625a.f117250b;
                textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(new TextLocalisedClause(i2, null, new Click(12, Integer.valueOf(i3), (Object) (str != null ? new w(str) : null), "CLAUSE_ID_FOOTER_DISCLAIMER_TAX_AUTHORITY", false), 10)), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_common_disclaimer_footer, null, null, 14);
            }
        }
        return new r(qVar, new m(textLocalisedClause2, textLocalisedClause, z), (List) iii.c.f(data, new s(this, 3), new k1f.n(7), new joa.j(this, domainState, 14)));
    }
}

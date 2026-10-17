package qa9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import java.util.ArrayList;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f244011a;

    public y(z countryResidenceStateMapperConfiguration) {
        Intrinsics.checkNotNullParameter(countryResidenceStateMapperConfiguration, "countryResidenceStateMapperConfiguration");
        this.f244011a = countryResidenceStateMapperConfiguration;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wi0.b bVar = domainState.f243986a;
        wi0.b bVar2 = domainState.f243986a;
        boolean z3 = domainState.f243989g;
        boolean z4 = domainState.d;
        boolean z6 = domainState.f243988c;
        t89.c cVar = domainState.f243987b;
        boolean z11 = domainState.f243989g;
        z zVar = this.f244011a;
        ArrayList arrayListC = zVar.c(bVar, cVar, z6, z4, z11);
        boolean z12 = cVar.f268862a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z12 ? R$string.credit_pcw_signup_consents_title : (z3 && com.bumptech.glide.d.s(bVar2)) ? R$string.signup_registration_country_title_terms : R$string.signup_registration_country_new_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(domainState.i ? R$string.credit_pcw_signup_consents_subtitle : (z3 && com.bumptech.glide.d.s(bVar2)) ? R$string.signup_registration_country_subtitle_terms : R$string.signup_registration_country_subtitle, null, null, 14);
        Clause clauseB = zVar.b(domainState.f243986a, domainState.i, domainState.f243988c, domainState.e, domainState.f243989g, domainState.f243990h);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause((z3 && com.bumptech.glide.d.s(bVar2)) ? R$string.common_action_accept_and_continue : com.bumptech.glide.d.x(bVar) ? R$string.signup_disclosure_usa_agree_and_continue : (com.bumptech.glide.d.u(bVar) || com.bumptech.glide.d.o(bVar)) ? R$string.common_action_accept_and_continue : R$string.common_action_sign_up, null, null, 14);
        boolean z29 = domainState.f243988c;
        boolean z31 = domainState.d;
        boolean z41 = domainState.f;
        if (bVar == null) {
            z31 = false;
        } else {
            if (com.bumptech.glide.d.x(bVar) && z12) {
                z = z41;
                return new n(arrayListC, textLocalisedClause, textLocalisedClause2, clauseB, textLocalisedClause3, z);
            }
            if (!z29) {
                z31 = true;
            }
        }
        z = z31;
        return new n(arrayListC, textLocalisedClause, textLocalisedClause2, clauseB, textLocalisedClause3, z);
    }
}

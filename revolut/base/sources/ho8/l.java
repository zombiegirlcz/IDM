package ho8;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_settings.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {

    @NotNull
    public static final k Companion = new k();

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(t1.z(domainState.f154241a, domainState.f154242b, domainState.e, domainState.d, domainState.f, domainState.f154243c, domainState.f154244g, domainState.f154245h), new hmc.a(20), new hkb.e(13), new gzb.d(this, 16));
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) domainState.d.getContent();
        return new g(juniorBankingProfile != null ? new TextLocalisedClause(R$string.rev_u18_account_settings_coparent_list_screen_subtitle, u.c(juniorBankingProfile.f77099b), null, 12) : null, list);
    }
}

package com.revolut.sso.impl.ui.post_authentication;

import bjl.p0;
import com.revolut.core.account.region.domain.model.AccountRegion;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreenContract$InputData;
import com.revolut.sso.impl.ui.post_authentication.PostAuthenticationFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rol.b;
import rol.c;
import rqk.k;
import yki.i;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final gnl.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PostAuthenticationFlowContract$InputData f106681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z80.b f106682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f106683r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f106684s;

    public a(gnl.a countriesProvider, PostAuthenticationFlowContract$InputData inputData, z80.b phoneToolsProvider, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(countriesProvider, "countriesProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.o = countriesProvider;
        this.f106681p = inputData;
        this.f106682q = phoneToolsProvider;
        this.f106683r = revolutSsoDependenciesProvider;
        this.f106684s = d.a(this, new rl8.d(this, 6));
    }

    @Override // yki.j
    public final void M0() {
        wi0.b bVarA;
        if (((jte.d) ((k) this.f106683r).f).c(RevolutSsoApi$Toggles.SsoCountrySelection.f105882c)) {
            PostAuthenticationFlowContract$InputData postAuthenticationFlowContract$InputData = this.f106681p;
            String str = postAuthenticationFlowContract$InputData.f106679b.f;
            AccountRegion.INSTANCE.getClass();
            if (Intrinsics.f(str, "undefined")) {
                Claim claim = postAuthenticationFlowContract$InputData.f106678a;
                if (claim instanceof Claim.Phone) {
                    bVarA = this.f106682q.e(((Claim.Phone) claim).f106131a);
                } else {
                    bVarA = null;
                }
                if (bVarA == null) {
                    bVarA = this.o.a();
                }
                h.t2(this, this.f106684s, new PostAuthenticationFlowContract$Step.CountrySelection(new CountrySelectionScreenContract$InputData(bVarA)), false, null, false, 14);
                return;
            }
        }
        C2(c.f256035a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106684s;
    }
}

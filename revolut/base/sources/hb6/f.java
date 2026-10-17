package hb6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import gna.i;
import h43.q;
import hb4.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationBreakdownContract$InputData f150617a;

    public f(DonationBreakdownContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f150617a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f150613a, new k(this, 2), new q(29), new i(this, 21)), new lw0.a(new TextLocalisedClause(R$string.donations_donation_breakdown_title, null, null, 14), null, null, null, false, 30));
    }
}

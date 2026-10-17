package e6i;

import aah.m;
import g6i.i;
import kotlin.jvm.internal.Intrinsics;
import n7i.o;
import n7i.z;
import q06.l;
import q6i.n;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f123006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0h.a f123007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f123008c;
    public final n d;
    public final z e;
    public final l61.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f123009g;

    public b(m wealthDisclaimersMapper, z0h.a wealthClauseDestinationProvider, o investDisclaimerProvider, n moveMoneyCryptoBuyDisclaimerProvider, z moveMoneyCreditCardDisclaimerProvider, l61.a userCompanyInteractor, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(wealthClauseDestinationProvider, "wealthClauseDestinationProvider");
        Intrinsics.checkNotNullParameter(investDisclaimerProvider, "investDisclaimerProvider");
        Intrinsics.checkNotNullParameter(moveMoneyCryptoBuyDisclaimerProvider, "moveMoneyCryptoBuyDisclaimerProvider");
        Intrinsics.checkNotNullParameter(moveMoneyCreditCardDisclaimerProvider, "moveMoneyCreditCardDisclaimerProvider");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f123006a = wealthDisclaimersMapper;
        this.f123007b = wealthClauseDestinationProvider;
        this.f123008c = investDisclaimerProvider;
        this.d = moveMoneyCryptoBuyDisclaimerProvider;
        this.e = moveMoneyCreditCardDisclaimerProvider;
        this.f = userCompanyInteractor;
        this.f123009g = deeplinkRouter;
    }

    public final i a() {
        return new i(this.f123006a, this.f123007b, this.f123008c, this.d, this.e, this.f, this.f123009g);
    }
}

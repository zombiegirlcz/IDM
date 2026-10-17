package aye;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f11150a;

    public p(je6.h externalInstitutionLogoMapper, sze.d imageFactory) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
        this.f11150a = externalInstitutionLogoMapper;
    }

    public static TextLocalisedClause a(yte.m mVar) {
        int i = mVar == null ? -1 : o.f11149a[mVar.ordinal()];
        if (i == 1 || i == 2) {
            return new TextLocalisedClause(R$string.topup_stored_method_details_content_upi, null, null, 14);
        }
        if (i == 3 || i == 4) {
            return new TextLocalisedClause(R$string.topup_stored_method_details_content_net_banking, null, null, 14);
        }
        return null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f11136a, new auj.o(this, 21), new axd.e(this, 3), new a15.n(this, domainState, 28));
    }
}

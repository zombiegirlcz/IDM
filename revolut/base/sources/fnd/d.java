package fnd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import he3.j;
import java.util.LinkedHashMap;
import java.util.List;
import je6.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lnd.t0;
import org.jetbrains.annotations.NotNull;
import thf.m;
import tof.a3;
import tof.i5;
import wsg.n;
import yld.i;
import z92.f;
import zhm.d0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cmd.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f136675l = v.k("transaction.description.internal.transfer.to.charity", "transaction.description.internal.transfer.to.recipient", "transaction.description.internal.transfer.from.sender", "transaction.description.gift.transfer.via.transfer.link.to.beneficiary", "transaction.description.transfer.to.beneficiary", "transaction.description.transfer.via.transfer.link.to.beneficiary");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f136676m = "transaction.description.rev.payment.to.merchant";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f136677n = "To ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f136678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f136679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.d f136680c;
    public final thf.c d;
    public final n e;
    public final t0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g6e.b f136681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f136682h;
    public final cm4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m93.d f136683j;
    public final gte.a k;

    public d(n8b.a countryInteractor, m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper, thf.c transactionCategoryResourcesMapper, n walletInteractor, t0 proCategoryGroupMapper, g6e.b subAccountBackgroundInteractor, h externalInstitutionLogoMapper, cm4.a creditCardItemMapper, m93.d cardThumbnailImageProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(proCategoryGroupMapper, "proCategoryGroupMapper");
        Intrinsics.checkNotNullParameter(subAccountBackgroundInteractor, "subAccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(creditCardItemMapper, "creditCardItemMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f136678a = countryInteractor;
        this.f136679b = transactionTextResourcesMapper;
        this.f136680c = transactionIconResourcesMapper;
        this.d = transactionCategoryResourcesMapper;
        this.e = walletInteractor;
        this.f = proCategoryGroupMapper;
        this.f136681g = subAccountBackgroundInteractor;
        this.f136682h = externalInstitutionLogoMapper;
        this.i = creditCardItemMapper;
        this.f136683j = cardThumbnailImageProvider;
        this.k = featureToggleInteractor;
    }

    public static CompositeClause e(Clause clause, io3.d dVar) {
        return new CompositeClause(v.k(clause, new CurrencyClause(f.l(dVar), null, null, 6)), new DotDividerClause((Integer) null), null, null, 12);
    }

    public final i b(j jVar) {
        return new i(jVar, new TextLocalisedClause(R$string.analytics_spendings_filter_accounts, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_coins, null, null, 6), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x03cc A[PHI: r6
      0x03cc: PHI (r6v45 java.lang.String) = (r6v35 java.lang.String), (r6v37 java.lang.String), (r6v48 java.lang.String) binds: [B:187:0x03e0, B:191:0x03e8, B:175:0x03c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yld.i c(he3.j r32, java.util.List r33, boolean r34, java.lang.String r35, com.revolut.feature.spending_analytics.api.models.GroupingExtraData r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fnd.d.c(he3.j, java.util.List, boolean, java.lang.String, com.revolut.feature.spending_analytics.api.models.GroupingExtraData):yld.i");
    }

    public final String d(a3 a3Var, LinkedHashMap linkedHashMap) {
        List list;
        i5 i5Var = a3Var.Z;
        String str = null;
        String str2 = i5Var != null ? i5Var.f272801a : null;
        if (i5Var != null && (list = i5Var.f272802b) != null) {
            str = (String) d0.d0(list);
        }
        if (d0.T(f136675l, str2) && str != null && str.length() != 0) {
            return str;
        }
        if (Intrinsics.f(str2, f136676m) && str != null) {
            String str3 = f136677n;
            if (a0.H(str, str3, false) && str.length() > str3.length()) {
                return kotlin.text.d0.e0(str, str3);
            }
        }
        return m.a(this.f136679b, a3Var, linkedHashMap, r0.g(), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}

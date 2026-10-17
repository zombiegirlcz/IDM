package dtd;

import ang.f;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.product_article.CustomAssetSmartEstimationProductArticleKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f117431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f117432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zja.a f117433c;
    public final gte.a d;
    public final mk0.a e;

    static {
        Intrinsics.checkNotNullParameter("CUSTOM_ASSETS_SMART_ESTIMATION_AGREED", "id");
    }

    public d(l61.a userCompanyInteractor, f userInteractor, zja.a productArticleInteractor, gte.a featureToggleInteractor, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f117431a = userCompanyInteractor;
        this.f117432b = userInteractor;
        this.f117433c = productArticleInteractor;
        this.d = featureToggleInteractor;
        this.e = personalisationStorage;
    }

    public static CustomAssetSmartEstimationProductArticleKey c(l71.d dVar, wi0.b bVar) {
        if (l71.f.g(dVar)) {
            return CustomAssetSmartEstimationProductArticleKey.PT;
        }
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.L0)) {
            return CustomAssetSmartEstimationProductArticleKey.IE;
        }
        if (Intrinsics.f(bVar, wi0.b.I0)) {
            return CustomAssetSmartEstimationProductArticleKey.HU;
        }
        if (Intrinsics.f(bVar, wi0.b.p0)) {
            return CustomAssetSmartEstimationProductArticleKey.UK;
        }
        if (com.bumptech.glide.d.p(bVar)) {
            return CustomAssetSmartEstimationProductArticleKey.EEA;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2 A[Catch: all -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, all -> 0x0033, blocks: (B:14:0x002e, B:57:0x00ee, B:60:0x00f7, B:64:0x0109, B:23:0x004f, B:42:0x00ae, B:44:0x00b2, B:46:0x00b6, B:50:0x00c8, B:53:0x00d2, B:26:0x0059, B:33:0x007d, B:38:0x008d, B:29:0x0060), top: B:73:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7 A[Catch: all -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, all -> 0x0033, blocks: (B:14:0x002e, B:57:0x00ee, B:60:0x00f7, B:64:0x0109, B:23:0x004f, B:42:0x00ae, B:44:0x00b2, B:46:0x00b6, B:50:0x00c8, B:53:0x00d2, B:26:0x0059, B:33:0x007d, B:38:0x008d, B:29:0x0060), top: B:73:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r11) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dtd.d.a(gim.c):java.lang.Object");
    }

    public final boolean b() {
        if (((jte.d) this.d).c(AnalyticsFeatureApi$Toggles.ForceShowProductArticles.f87394c)) {
            return true;
        }
        Boolean bool = (Boolean) this.e.a(new tk0.b("CUSTOM_ASSETS_SMART_ESTIMATION_AGREED"));
        return !(bool != null ? bool.booleanValue() : false);
    }
}

package qz9;

import e7l.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.b f250448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f250449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw9.d f250450c;
    public final qd0.b d;

    public t(fk3.b configurationRepository, wsg.n walletInteractor, cw9.d paymentsProductFeatureChecker, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f250448a = configurationRepository;
        this.f250449b = walletInteractor;
        this.f250450c = paymentsProductFeatureChecker;
        this.d = languageProvider;
    }

    public final efm.r a(String text, String countryCode) {
        efm.r rVarW;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List listN0 = d0.n0(text, new String[]{" "}, 0, 6);
        if (listN0.size() > 2 || listN0.isEmpty()) {
            od0.i.Companion.getClass();
            return w.h(od0.i.f224256b);
        }
        String strD = a0.D(text, " ", "", false);
        int length = countryCode.length();
        g.b bVar = g.b.f123407a;
        fk3.b bVar2 = this.f250448a;
        if (length == 0) {
            rVarW = nim.a.w(((ik3.g) bVar2).a(bVar, false), new ijj.p(17));
        } else {
            ik3.g gVar = (ik3.g) bVar2;
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            efm.r rVarA = gVar.a(bVar, false);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            rVarW = nim.a.w(kli.a.h(rVarA, gVar.i.f(countryCode, false)), new ijj.p(14));
        }
        efm.r map = m70.a.g(rVarW, new qsk.d(28), null, 2).map(new qsa.a(29, new b(17)));
        Intrinsics.checkNotNullExpressionValue(map, "getCurrenciesSymbols(...)");
        efm.r map2 = w.l(map, m70.a.g(osg.b.d(this.f250449b), null, null, 3)).map(new qsa.a(27, new qpb.a(strD, this)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }
}

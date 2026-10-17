package k24;

import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import efm.d0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements o {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ju3.c b(wi0.b bVar) {
        Companion.getClass();
        ju3.a aVar = ju3.a.MANUAL_UNDERWRITING;
        j24.b.Companion.getClass();
        Pair pair = new Pair(aVar, j24.b.D);
        ju3.a aVar2 = ju3.a.DOCUMENTS_AGREEMENTS;
        AgreementsScreenConfig.INSTANCE.getClass();
        return new ju3.c(r0.k(pair, new Pair(aVar2, AgreementsScreenConfig.Companion.a()), new Pair(ju3.a.IDENTITY_VERIFICATION, j24.b.d)), bVar);
    }

    @Override // k24.o
    public final d0 a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ufm.c cVar = new ufm.c(new k24.a(9, countryCode), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

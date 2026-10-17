package k24;

import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import efm.d0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static Map a() {
            ju3.a aVar = ju3.a.IDENTITY_VERIFICATION;
            j24.b.Companion.getClass();
            return r0.k(new Pair(aVar, j24.b.f170676c), new Pair(ju3.a.MANUAL_UNDERWRITING, j24.b.D));
        }
    }

    public static ju3.c b(wi0.b bVar, AgreementsScreenConfig agreementsScreenConfig) {
        ju3.a aVar = ju3.a.CONSENTS_V1;
        j24.b.Companion.getClass();
        Map mapK = r0.k(new Pair(aVar, j24.b.C), new Pair(ju3.a.DOCUMENTS_AGREEMENTS, agreementsScreenConfig));
        Companion.getClass();
        return new ju3.c(r0.p(mapK, a.a()), bVar);
    }

    @Override // k24.o
    public final d0 a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ufm.c cVar = new ufm.c(new k24.a(countryCode, this), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

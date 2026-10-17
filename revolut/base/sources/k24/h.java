package k24;

import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import efm.d0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static Map a() {
            ju3.a aVar = ju3.a.DOCUMENTS_AGREEMENTS;
            AgreementsScreenConfig.INSTANCE.getClass();
            Pair pair = new Pair(aVar, AgreementsScreenConfig.Companion.a());
            ju3.a aVar2 = ju3.a.MANUAL_UNDERWRITING;
            j24.b.Companion.getClass();
            return r0.k(pair, new Pair(aVar2, j24.b.D), new Pair(ju3.a.IDENTITY_VERIFICATION, j24.b.f170675b));
        }
    }

    @Override // k24.o
    public final d0 a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ufm.c cVar = new ufm.c(new k24.a(this, countryCode, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

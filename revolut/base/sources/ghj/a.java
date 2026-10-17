package ghj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final C0831a Companion = new C0831a();

    /* JADX INFO: renamed from: ghj.a$a, reason: collision with other inner class name */
    public static final class C0831a {
        private C0831a() {
        }
    }

    public static EsimHyperText a(EsimTerms esimTerms, PaymentMethod.Pocket pocket) {
        e eVar;
        EsimHyperText esimHyperText;
        Intrinsics.checkNotNullParameter(esimTerms, "esimTerms");
        if (pocket == null || (eVar = pocket.f84379g) == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "EsimDynamicTermsAssetTypeExtractor", "Pocket is null, can not define asset type. Falling back to default terms content", null, h0Var);
            return esimTerms.f100526a;
        }
        int i = b.f143943a[eVar.ordinal()];
        if (i == 1) {
            esimHyperText = esimTerms.f100526a;
        } else if (i == 2) {
            esimHyperText = esimTerms.f100527b;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            esimHyperText = esimTerms.f100528c;
        }
        if (esimHyperText != null) {
            return esimHyperText;
        }
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
        d.a(c.ERROR, "EsimDynamicTermsAssetTypeExtractor", "Terms for asset type " + eVar + " are null, falling back to default terms", null, h0Var2);
        return esimTerms.f100526a;
    }
}

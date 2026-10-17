package bn4;

import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.m;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.q f17057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f17058b;

    public b(al4.q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f17057a = creditCardProductInteractor;
        this.f17058b = y0.b("credit-card/cancel-account");
    }

    @Override // xii.b
    public final Set a() {
        return this.f17058b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = (String) e0.E(kotlin.coroutines.g.f186406a, new aza.g(this, null, 18));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        String str = (String) objA;
        if (str == null) {
            return null;
        }
        return new CreditCardCancellationDestination(str, CreditCardCancellationDestination.CancellationType.FacilityOwnerCancelOwnCard.f68903a);
    }
}

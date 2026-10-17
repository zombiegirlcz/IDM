package orb;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f228085a;

    public c(l4i.a amountConverter, o7.b orderQuoteInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        this.f228085a = orderQuoteInteractor;
    }

    public final vkm.d a(nel.n nVar, bfl.g gVar, qrb.b bVar, BigDecimal bigDecimal) {
        vf0.h hVar;
        f8l.b bVar2;
        f8l.b bVar3;
        xi0.a aVar = xi0.b.Companion;
        String str = nVar.f214596b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        xi0.b bVar4 = nVar.i;
        int i = b.f228084b[gVar.ordinal()];
        if (i == 1) {
            int i2 = b.f228083a[bVar.ordinal()];
            if (i2 == 1) {
                bVar2 = f8l.b.FROM;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = f8l.b.TO;
            }
            hVar = new vf0.h(bVar4, bVarA, bVar2, f8l.b.TO);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = b.f228083a[bVar.ordinal()];
            if (i3 == 1) {
                bVar3 = f8l.b.TO;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3 = f8l.b.FROM;
            }
            hVar = new vf0.h(bVarA, bVar4, bVar3, f8l.b.FROM);
        }
        return o7.b.u(this.f228085a, new OrderQuoteParams((xi0.b) hVar.f288433a, (xi0.b) hVar.f288434b, f8l.e.MARKET, bigDecimal, (f8l.b) hVar.f288435c, (f8l.b) hVar.d, null, false, null, null, null, null, null, null, 16128));
    }
}

package wxg;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoboPortfolioInfo f300979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f300980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f300981c;
    public final BigDecimal d;
    public final float e;

    public j(RoboPortfolioInfo portfolio, mwg.c robo) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(robo, "robo");
        dj0.d value = robo.f209444c;
        xi0.b currency = value.f115083b;
        BigDecimal quantity = robo.f209443b;
        float f = robo.d;
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f300979a = portfolio;
        this.f300980b = currency;
        this.f300981c = value;
        this.d = quantity;
        this.e = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f300979a, jVar.f300979a) && Intrinsics.f(this.f300980b, jVar.f300980b) && Intrinsics.f(this.f300981c, jVar.f300981c) && Intrinsics.f(this.d, jVar.d) && Float.compare(this.e, jVar.e) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.e;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f300981c;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + t61.a.d(this.d, v7.c(h30.l.j(this.f300980b, this.f300979a.hashCode() * 31, 31), 31, this.f300981c), 31);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.d;
    }
}

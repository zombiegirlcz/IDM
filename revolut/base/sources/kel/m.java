package kel;

import ip0.v7;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f183170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f183171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f183172c;
    public final BigDecimal d;

    public m(ej0.b openingPrice, dj0.d margin, dj0.d exposure, BigDecimal leverage) {
        Intrinsics.checkNotNullParameter(openingPrice, "openingPrice");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        this.f183170a = openingPrice;
        this.f183171b = margin;
        this.f183172c = exposure;
        this.d = leverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f183170a, mVar.f183170a) && Intrinsics.f(this.f183171b, mVar.f183171b) && Intrinsics.f(this.f183172c, mVar.f183172c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f183170a.hashCode() * 31, 31, this.f183171b), 31, this.f183172c);
    }
}

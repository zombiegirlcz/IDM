package yv0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;
import mx0.o2;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f317079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2 f317080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah0.a f317081c;
    public final Float d;
    public final HotelsProperty e;

    public l(Clause clause, o2 pinStyle, ah0.a location, Float f, HotelsProperty hotelsProperty) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(pinStyle, "pinStyle");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f317079a = clause;
        this.f317080b = pinStyle;
        this.f317081c = location;
        this.d = f;
        this.e = hotelsProperty;
    }

    @Override // yv0.k
    public final Object a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f317079a.equals(lVar.f317079a) && this.f317080b == lVar.f317080b && this.f317081c.equals(lVar.f317081c) && this.d.equals(lVar.d) && this.e.equals(lVar.e);
    }

    @Override // yv0.k
    public final ah0.a getPosition() {
        return this.f317081c;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f317081c.hashCode() + ((this.f317080b.hashCode() + (this.f317079a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}

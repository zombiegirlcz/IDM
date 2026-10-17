package ueg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;
import mx0.o2;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah0.a f279385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2 f279386c;
    public final Clause d;
    public final Float e;
    public final HotelsProperty f;

    public e0(String id10, ah0.a position, o2 pinStyle, Clause priceClause, Float f, HotelsProperty property) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(pinStyle, "pinStyle");
        Intrinsics.checkNotNullParameter(priceClause, "priceClause");
        Intrinsics.checkNotNullParameter(property, "property");
        this.f279384a = id10;
        this.f279385b = position;
        this.f279386c = pinStyle;
        this.d = priceClause;
        this.e = f;
        this.f = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f279384a, e0Var.f279384a) && Intrinsics.f(this.f279385b, e0Var.f279385b) && this.f279386c == e0Var.f279386c && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e) && Intrinsics.f(this.f, e0Var.f);
    }

    public final int hashCode() {
        int iA = p.a.a((this.f279386c.hashCode() + ((this.f279385b.hashCode() + (this.f279384a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Float f = this.e;
        return this.f.hashCode() + ((iA + (f == null ? 0 : f.hashCode())) * 31);
    }
}

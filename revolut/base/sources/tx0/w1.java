package tx0;

import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountryImage f275259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountryClause f275260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f275261c;

    public w1(CountryImage startImage, CountryClause text) {
        v1 state = v1.ACTIVE;
        Intrinsics.checkNotNullParameter(startImage, "startImage");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f275259a = startImage;
        this.f275260b = text;
        this.f275261c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f275259a, w1Var.f275259a) && Intrinsics.f(this.f275260b, w1Var.f275260b) && this.f275261c == w1Var.f275261c;
    }

    public final int hashCode() {
        return (this.f275261c.hashCode() + ((this.f275260b.hashCode() + (this.f275259a.hashCode() * 31)) * 31)) * 31;
    }
}

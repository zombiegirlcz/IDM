package o17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f221327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f221328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f221329c;
    public final Image d;
    public final List e;

    public n(Clause clause, MoneyClause moneyClause, TimeClause timeClause, LayeredImage layeredImage, List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f221327a = clause;
        this.f221328b = moneyClause;
        this.f221329c = timeClause;
        this.d = layeredImage;
        this.e = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f221327a, nVar.f221327a) && Intrinsics.f(this.f221328b, nVar.f221328b) && Intrinsics.f(this.f221329c, nVar.f221329c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f221327a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f221328b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f221329c;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Image image = this.d;
        return this.e.hashCode() + ((iHashCode3 + (image != null ? image.hashCode() : 0)) * 31);
    }
}

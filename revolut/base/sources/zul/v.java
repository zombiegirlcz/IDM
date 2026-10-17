package zul;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f325555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f325556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f325557c;
    public final Clause d;
    public final boolean e;

    public v(InstrumentImage instrumentImage, TextLocalisedClause titleClause, TextClause textClause, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f325555a = instrumentImage;
        this.f325556b = titleClause;
        this.f325557c = textClause;
        this.d = clause;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f325555a, vVar.f325555a) && this.f325556b.equals(vVar.f325556b) && Intrinsics.f(this.f325557c, vVar.f325557c) && Intrinsics.f(this.d, vVar.d) && this.e == vVar.e;
    }

    public final int hashCode() {
        Image image = this.f325555a;
        int iA = t61.a.a((image == null ? 0 : image.hashCode()) * 31, 31, this.f325556b);
        Clause clause = this.f325557c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}

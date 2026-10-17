package sx2;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.card_design.api.model.SkipConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagViewData f266310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mxl.j f266311c;
    public final jx2.o d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TagViewData f266312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f266313h;
    public final q0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SkipConfig f266314j;

    public m0(List items, TagViewData tagViewData, mxl.j jVar, jx2.o nextButtonStyle, Clause clause, boolean z, TagViewData tagViewData2, AnalyticsContext analyticsContext, q0 q0Var, SkipConfig skipConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButtonStyle, "nextButtonStyle");
        this.f266309a = items;
        this.f266310b = tagViewData;
        this.f266311c = jVar;
        this.d = nextButtonStyle;
        this.e = clause;
        this.f = z;
        this.f266312g = tagViewData2;
        this.f266313h = analyticsContext;
        this.i = q0Var;
        this.f266314j = skipConfig;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof m0)) {
            return null;
        }
        m0 m0Var = (m0) oldState;
        return new l0(!Intrinsics.f(m0Var.f266311c, this.f266311c), !Intrinsics.f(m0Var.d, this.d), !Intrinsics.f(m0Var.e, this.e), !Intrinsics.f(m0Var.f266310b, this.f266310b), !Intrinsics.f(m0Var.f266312g, this.f266312g), !Intrinsics.f(m0Var.f266313h, this.f266313h), !Intrinsics.f(m0Var.i, this.i));
    }

    @Override // cli.p
    public final List c() {
        return this.f266309a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f266309a, m0Var.f266309a) && Intrinsics.f(this.f266310b, m0Var.f266310b) && Intrinsics.f(this.f266311c, m0Var.f266311c) && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e) && this.f == m0Var.f && Intrinsics.f(this.f266312g, m0Var.f266312g) && Intrinsics.f(this.f266313h, m0Var.f266313h) && Intrinsics.f(this.i, m0Var.i) && Intrinsics.f(this.f266314j, m0Var.f266314j);
    }

    public final int hashCode() {
        int iHashCode = this.f266309a.hashCode() * 31;
        TagViewData tagViewData = this.f266310b;
        int iHashCode2 = (iHashCode + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
        mxl.j jVar = this.f266311c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        Clause clause = this.e;
        int iC = j6.a.c((iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f);
        TagViewData tagViewData2 = this.f266312g;
        int iHashCode4 = (iC + (tagViewData2 == null ? 0 : tagViewData2.hashCode())) * 31;
        Parcelable parcelable = this.f266313h;
        int iHashCode5 = (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        q0 q0Var = this.i;
        int iHashCode6 = (iHashCode5 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        SkipConfig skipConfig = this.f266314j;
        return iHashCode6 + (skipConfig != null ? skipConfig.hashCode() : 0);
    }
}

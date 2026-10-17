package r74;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f251993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f251994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f251995c;
    public final Clause d;
    public final LargeActionButton.ButtonStyle e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f251996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ResourceImage f251997h;
    public final aim.e i;

    public m(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, CompositeClause compositeClause, TextLocalisedClause textLocalisedClause2, LargeActionButton.ButtonStyle buttonStyle, TextLocalisedClause textLocalisedClause3, LargeActionButton.ButtonStyle buttonStyle2, ResourceImage closeButtonImage, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251993a = title;
        this.f251994b = textLocalisedClause;
        this.f251995c = compositeClause;
        this.d = textLocalisedClause2;
        this.e = buttonStyle;
        this.f = textLocalisedClause3;
        this.f251996g = buttonStyle2;
        this.f251997h = closeButtonImage;
        this.i = items;
    }

    @Override // cli.p
    public final List c() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f251993a.equals(mVar.f251993a) && Intrinsics.f(this.f251994b, mVar.f251994b) && Intrinsics.f(this.f251995c, mVar.f251995c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f251996g, mVar.f251996g) && this.f251997h.equals(mVar.f251997h) && this.i.equals(mVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f251993a.hashCode() * 31;
        Clause clause = this.f251994b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f251995c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        LargeActionButton.ButtonStyle buttonStyle = this.e;
        int iHashCode5 = (iHashCode4 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
        Clause clause4 = this.f;
        int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        LargeActionButton.ButtonStyle buttonStyle2 = this.f251996g;
        return this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f251997h, (iHashCode6 + (buttonStyle2 != null ? buttonStyle2.hashCode() : 0)) * 31, 31);
    }
}

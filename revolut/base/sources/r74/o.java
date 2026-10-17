package r74;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f252001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f252002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f252003c;
    public final Clause d;
    public final LargeActionButton.ButtonStyle e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f252004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ResourceImage f252005h;
    public final aim.e i;

    public o(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, CdnImage cdnImage, TextLocalisedClause textLocalisedClause2, LargeActionButton.ButtonStyle buttonStyle, TextLocalisedClause textLocalisedClause3, LargeActionButton.ButtonStyle buttonStyle2, ResourceImage closeButtonImage, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f252001a = title;
        this.f252002b = textLocalisedClause;
        this.f252003c = cdnImage;
        this.d = textLocalisedClause2;
        this.e = buttonStyle;
        this.f = textLocalisedClause3;
        this.f252004g = buttonStyle2;
        this.f252005h = closeButtonImage;
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
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f252001a.equals(oVar.f252001a) && Intrinsics.f(this.f252002b, oVar.f252002b) && Intrinsics.f(this.f252003c, oVar.f252003c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f252004g, oVar.f252004g) && this.f252005h.equals(oVar.f252005h) && this.i.equals(oVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f252001a.hashCode() * 31;
        Clause clause = this.f252002b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f252003c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        LargeActionButton.ButtonStyle buttonStyle = this.e;
        int iHashCode5 = (iHashCode4 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
        Clause clause3 = this.f;
        int iHashCode6 = (iHashCode5 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        LargeActionButton.ButtonStyle buttonStyle2 = this.f252004g;
        return this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f252005h, (iHashCode6 + (buttonStyle2 != null ? buttonStyle2.hashCode() : 0)) * 31, 31);
    }
}

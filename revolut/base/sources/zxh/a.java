package zxh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f326335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f326336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f326337c;
    public final Image d;
    public final Image e;

    public a() {
        this(null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f326335a, aVar.f326335a) && Intrinsics.f(this.f326336b, aVar.f326336b) && Intrinsics.f(this.f326337c, aVar.f326337c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f326335a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f326336b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f326337c;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 961;
        Image image = this.d;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.e;
        return iHashCode4 + (image2 != null ? image2.hashCode() : 0);
    }

    public a(Clause clause, Clause clause2, Clause clause3, Image image, Image image2) {
        this.f326335a = clause;
        this.f326336b = clause2;
        this.f326337c = clause3;
        this.d = image;
        this.e = image2;
    }

    public /* synthetic */ a(MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Image image, LayeredImage layeredImage, int i) {
        this((i & 1) != 0 ? null : moneyClause, (i & 2) != 0 ? null : textLocalisedClause, (i & 4) != 0 ? null : textLocalisedClause2, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : layeredImage);
    }
}

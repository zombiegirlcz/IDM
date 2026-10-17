package k9c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f182312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f182313c;
    public final Image d;
    public final Image e;
    public final Clause f;

    public h(List items, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, LayeredImage layeredImage, LayeredImage layeredImage2, TextLocalisedClause textLocalisedClause3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182311a = items;
        this.f182312b = textLocalisedClause;
        this.f182313c = textLocalisedClause2;
        this.d = layeredImage;
        this.e = layeredImage2;
        this.f = textLocalisedClause3;
    }

    @Override // jki.n
    public final List c() {
        return this.f182311a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f182311a, hVar.f182311a) && Intrinsics.f(this.f182312b, hVar.f182312b) && Intrinsics.f(this.f182313c, hVar.f182313c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f182311a.hashCode() * 31;
        Clause clause = this.f182312b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f182313c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.d;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.e;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause3 = this.f;
        return iHashCode5 + (clause3 != null ? clause3.hashCode() : 0);
    }
}

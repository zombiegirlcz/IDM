package wug;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f300134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f300135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f300136c;
    public final List d;

    public f(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, LayeredImage layeredImage, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300134a = textLocalisedClause;
        this.f300135b = textLocalisedClause2;
        this.f300136c = layeredImage;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f300134a, fVar.f300134a) && Intrinsics.f(this.f300135b, fVar.f300135b) && Intrinsics.f(this.f300136c, fVar.f300136c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f300134a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f300135b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f300136c;
        return this.d.hashCode() + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }
}

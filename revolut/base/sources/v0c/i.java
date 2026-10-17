package v0c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends com.revolut.feature.rev_points.impl.ui.trophy_room.details.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f284785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f284786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f284787c;

    public i(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, LayeredImage layeredImage) {
        this.f284785a = textLocalisedClause;
        this.f284786b = textLocalisedClause2;
        this.f284787c = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f284785a, iVar.f284785a) && Intrinsics.f(this.f284786b, iVar.f284786b) && Intrinsics.f(this.f284787c, iVar.f284787c);
    }

    public final int hashCode() {
        Clause clause = this.f284785a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f284786b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f284787c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}

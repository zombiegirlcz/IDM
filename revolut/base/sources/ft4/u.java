package ft4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f137928b;

    public u(TextLocalisedClause title, ResourceImage naviIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        this.f137927a = title;
        this.f137928b = naviIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f137927a.equals(uVar.f137927a) && this.f137928b.equals(uVar.f137928b);
    }

    public final int hashCode() {
        return this.f137928b.hashCode() + (this.f137927a.hashCode() * 31);
    }
}

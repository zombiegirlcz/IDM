package j3b;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f171000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f171001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f171002c;

    public c(Image icon, Image image, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f171000a = icon;
        this.f171001b = image;
        this.f171002c = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f171000a, cVar.f171000a) && Intrinsics.f(this.f171001b, cVar.f171001b) && Intrinsics.f(this.f171002c, cVar.f171002c);
    }

    public final int hashCode() {
        int iHashCode = this.f171000a.hashCode() * 31;
        Image image = this.f171001b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f171002c;
        return iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
    }
}

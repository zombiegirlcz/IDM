package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements ms0.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f10383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10384c;

    public k(int i, Clause actionStatusLabel, ResourceImage resourceImage, boolean z) {
        resourceImage = (i & 2) != 0 ? null : resourceImage;
        z = (i & 4) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(actionStatusLabel, "actionStatusLabel");
        this.f10382a = actionStatusLabel;
        this.f10383b = resourceImage;
        this.f10384c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f10382a, kVar.f10382a) && Intrinsics.f(this.f10383b, kVar.f10383b) && this.f10384c == kVar.f10384c;
    }

    public final int hashCode() {
        int iHashCode = this.f10382a.hashCode() * 31;
        Image image = this.f10383b;
        return Boolean.hashCode(this.f10384c) + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }
}

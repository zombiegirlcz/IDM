package c17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f20394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f20395c;

    public k(boolean z, TextLocalisedClause textLocalisedClause, AnimatedResourceImage animatedResourceImage) {
        this.f20393a = z;
        this.f20394b = textLocalisedClause;
        this.f20395c = animatedResourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f20393a == kVar.f20393a && Intrinsics.f(this.f20394b, kVar.f20394b) && Intrinsics.f(this.f20395c, kVar.f20395c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f20393a) * 31;
        Clause clause = this.f20394b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f20395c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}

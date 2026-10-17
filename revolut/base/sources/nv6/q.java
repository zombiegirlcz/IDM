package nv6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f219528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f219529b;

    public q() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f219528a, qVar.f219528a) && Intrinsics.f(this.f219529b, qVar.f219529b);
    }

    public final int hashCode() {
        Clause clause = this.f219528a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f219529b;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }

    public q(TextLocalisedClause textLocalisedClause, CdnImage cdnImage) {
        this.f219528a = textLocalisedClause;
        this.f219529b = cdnImage;
    }
}

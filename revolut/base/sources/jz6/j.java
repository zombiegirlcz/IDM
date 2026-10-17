package jz6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f179593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f179594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f179595c;

    public j(boolean z, TextLocalisedClause textLocalisedClause, AnimatedResourceImage animatedResourceImage) {
        this.f179593a = z;
        this.f179594b = textLocalisedClause;
        this.f179595c = animatedResourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f179593a == jVar.f179593a && Intrinsics.f(this.f179594b, jVar.f179594b) && Intrinsics.f(this.f179595c, jVar.f179595c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f179593a) * 31;
        Clause clause = this.f179594b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f179595c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}

package ybh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f312356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f312357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f312358c;

    public v(TextLocalisedClause title, Clause clause, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f312356a = title;
        this.f312357b = clause;
        this.f312358c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f312356a.equals(vVar.f312356a) && Intrinsics.f(this.f312357b, vVar.f312357b) && Intrinsics.f(this.f312358c, vVar.f312358c);
    }

    public final int hashCode() {
        int iHashCode = this.f312356a.hashCode() * 31;
        Clause clause = this.f312357b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f312358c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}

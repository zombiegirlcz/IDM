package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6 f10330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f10331c;
    public final Clause d;
    public final ox0.b0 e;
    public final ox0.d0 f;

    public h(boolean z, n6 primaryButton, n6 secondaryButton, Clause clause, ox0.b0 descriptionPlacement, ox0.d0 descriptionStyle, int i) {
        z = (i & 1) != 0 ? false : z;
        clause = (i & 8) != 0 ? null : clause;
        descriptionPlacement = (i & 16) != 0 ? ox0.b0.ABOVE_BUTTONS : descriptionPlacement;
        descriptionStyle = (i & 64) != 0 ? ox0.d0.DEFAULT : descriptionStyle;
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(descriptionPlacement, "descriptionPlacement");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        this.f10329a = z;
        this.f10330b = primaryButton;
        this.f10331c = secondaryButton;
        this.d = clause;
        this.e = descriptionPlacement;
        this.f = descriptionStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f10329a == hVar.f10329a && Intrinsics.f(this.f10330b, hVar.f10330b) && Intrinsics.f(this.f10331c, hVar.f10331c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f10331c.hashCode() + ((this.f10330b.hashCode() + (Boolean.hashCode(this.f10329a) * 31)) * 31)) * 31;
        Clause clause = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 961);
    }
}

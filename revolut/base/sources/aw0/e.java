package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ox0.b0 f10287c;
    public final n6 d;
    public final d e;
    public final ox0.d0 f;

    public e(boolean z, Clause clause, ox0.b0 descriptionPlacement, n6 largeButton, d dVar, ox0.d0 descriptionStyle, int i) {
        z = (i & 1) != 0 ? false : z;
        clause = (i & 2) != 0 ? null : clause;
        descriptionPlacement = (i & 4) != 0 ? ox0.b0.ABOVE_BUTTONS : descriptionPlacement;
        dVar = (i & 16) != 0 ? null : dVar;
        descriptionStyle = (i & 32) != 0 ? ox0.d0.DEFAULT : descriptionStyle;
        Intrinsics.checkNotNullParameter(descriptionPlacement, "descriptionPlacement");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        this.f10285a = z;
        this.f10286b = clause;
        this.f10287c = descriptionPlacement;
        this.d = largeButton;
        this.e = dVar;
        this.f = descriptionStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f10285a == eVar.f10285a && Intrinsics.f(this.f10286b, eVar.f10286b) && this.f10287c == eVar.f10287c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10285a) * 31;
        Clause clause = this.f10286b;
        int iHashCode2 = (this.d.hashCode() + ((this.f10287c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31;
        d dVar = this.e;
        return this.f.hashCode() + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }
}

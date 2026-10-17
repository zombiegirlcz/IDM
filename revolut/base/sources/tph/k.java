package tph;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f273384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f273385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f273386c;
    public final Image d;

    public k(Clause clause, Clause clause2, Image image, boolean z) {
        this.f273384a = clause;
        this.f273385b = clause2;
        this.f273386c = z;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f273384a, kVar.f273384a) && Intrinsics.f(this.f273385b, kVar.f273385b) && this.f273386c == kVar.f273386c && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f273384a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f273385b;
        int iC = j6.a.c((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f273386c);
        Image image = this.d;
        return iC + (image != null ? image.hashCode() : 0);
    }
}

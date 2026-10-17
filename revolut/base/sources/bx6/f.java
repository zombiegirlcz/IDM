package bx6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l71.d f19498c;

    public f(boolean z, List shopifyFee, l71.d userCompany) {
        Intrinsics.checkNotNullParameter(shopifyFee, "shopifyFee");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f19496a = z;
        this.f19497b = shopifyFee;
        this.f19498c = userCompany;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f19496a == fVar.f19496a && Intrinsics.f(this.f19497b, fVar.f19497b) && Intrinsics.f(this.f19498c, fVar.f19498c);
    }

    public final int hashCode() {
        return this.f19498c.hashCode() + p.a.d(Boolean.hashCode(this.f19496a) * 31, 31, this.f19497b);
    }
}

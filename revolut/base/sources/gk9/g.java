package gk9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh9.i f144354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144355b;

    public g(zh9.i accountConfig, List plans) {
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f144354a = accountConfig;
        this.f144355b = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f144354a, gVar.f144354a) && Intrinsics.f(this.f144355b, gVar.f144355b);
    }

    public final int hashCode() {
        return this.f144355b.hashCode() + (this.f144354a.hashCode() * 31);
    }
}

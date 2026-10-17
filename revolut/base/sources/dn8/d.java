package dn8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116238b;

    public d(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f116237a = items;
        this.f116238b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f116237a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f116237a, dVar.f116237a) && this.f116238b == dVar.f116238b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116238b) + (this.f116237a.hashCode() * 31);
    }
}

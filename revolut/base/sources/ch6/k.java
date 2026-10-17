package ch6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24133b;

    public k(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f24132a = items;
        this.f24133b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f24132a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f24132a.equals(kVar.f24132a) && this.f24133b == kVar.f24133b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24133b) + (this.f24132a.hashCode() * 31);
    }
}

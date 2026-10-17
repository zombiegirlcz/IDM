package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292208b;

    public c(String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f292207a = label;
        this.f292208b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f292207a, cVar.f292207a) && Intrinsics.f(this.f292208b, cVar.f292208b);
    }

    @Override // vu3.e
    public final String getLabel() {
        return this.f292207a;
    }

    public final int hashCode() {
        return this.f292208b.hashCode() + (this.f292207a.hashCode() * 31);
    }
}

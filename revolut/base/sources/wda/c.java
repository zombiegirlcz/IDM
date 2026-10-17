package wda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296473b;

    public c(String value, String deeplink) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f296472a = value;
        this.f296473b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f296472a, cVar.f296472a) && Intrinsics.f(this.f296473b, cVar.f296473b);
    }

    @Override // wda.h
    public final String getValue() {
        return this.f296472a;
    }

    public final int hashCode() {
        return this.f296473b.hashCode() + (this.f296472a.hashCode() * 31);
    }
}

package v20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object f285421c;

    public h0(String type, String rawData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.f285419a = type;
        this.f285420b = rawData;
    }

    public final String a() {
        return this.f285420b;
    }

    public final String b() {
        return this.f285419a;
    }

    public final void c(Object obj2) {
        this.f285421c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f285419a, h0Var.f285419a) && Intrinsics.f(this.f285420b, h0Var.f285420b);
    }

    public final int hashCode() {
        return this.f285420b.hashCode() + (this.f285419a.hashCode() * 31);
    }
}

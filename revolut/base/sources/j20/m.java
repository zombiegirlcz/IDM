package j20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170653b;

    public m(String type, String rawData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.f170652a = type;
        this.f170653b = rawData;
    }

    public final String a() {
        return this.f170653b;
    }

    public final String b() {
        return this.f170652a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f170652a, mVar.f170652a) && Intrinsics.f(this.f170653b, mVar.f170653b);
    }

    public final int hashCode() {
        return this.f170653b.hashCode() + (this.f170652a.hashCode() * 31);
    }
}

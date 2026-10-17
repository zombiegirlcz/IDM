package zf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321839b;

    public e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321838a = key;
        this.f321839b = value;
    }

    public final String a() {
        return this.f321838a;
    }

    public final String b() {
        return this.f321839b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f321838a, eVar.f321838a) && Intrinsics.f(this.f321839b, eVar.f321839b);
    }

    public final int hashCode() {
        return this.f321839b.hashCode() + (this.f321838a.hashCode() * 31);
    }

    public e() {
        this("", "");
    }
}

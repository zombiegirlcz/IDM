package ss7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265350b;

    public a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f265349a = name;
        this.f265350b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265349a, aVar.f265349a) && Intrinsics.f(this.f265350b, aVar.f265350b);
    }

    public final int hashCode() {
        return this.f265350b.hashCode() + (this.f265349a.hashCode() * 31);
    }
}

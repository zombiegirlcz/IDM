package ilg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162233a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f162233a, ((a) obj2).f162233a);
    }

    public final int hashCode() {
        return this.f162233a.hashCode();
    }

    public a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f162233a = value;
    }

    public /* synthetic */ a(int i) {
        this("");
    }
}

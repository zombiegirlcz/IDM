package ct;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108552a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f108552a, ((e) obj2).f108552a);
    }

    public final int hashCode() {
        return this.f108552a.hashCode();
    }

    public e(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f108552a = pin;
    }

    public /* synthetic */ e(int i) {
        this("");
    }
}

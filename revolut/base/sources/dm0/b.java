package dm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f115814c;
    public final String d;

    public b(String value, int i, String rawDeviceAgentIdValue, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(rawDeviceAgentIdValue, "rawDeviceAgentIdValue");
        this.f115812a = value;
        this.f115813b = i;
        this.f115814c = rawDeviceAgentIdValue;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f115812a, bVar.f115812a) && this.f115813b == bVar.f115813b && Intrinsics.f(this.f115814c, bVar.f115814c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.f115813b, this.f115812a.hashCode() * 31, 31), 31, this.f115814c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}

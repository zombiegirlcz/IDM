package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i3 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120627b;

    public i3(String str, String regex) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.f120626a = str;
        this.f120627b = regex;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.f120626a, i3Var.f120626a) && Intrinsics.f(this.f120627b, i3Var.f120627b);
    }

    public final int hashCode() {
        String str = this.f120626a;
        return this.f120627b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

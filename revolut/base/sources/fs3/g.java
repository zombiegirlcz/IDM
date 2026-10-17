package fs3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f137583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f137585c;
    public final List d;

    public g(List subtitleArgs, int i, int i2, int i3) {
        f0 titleArgs = f0.f322471a;
        subtitleArgs = (i3 & 8) != 0 ? titleArgs : subtitleArgs;
        Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
        Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
        this.f137583a = i;
        this.f137584b = titleArgs;
        this.f137585c = i2;
        this.d = subtitleArgs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f137583a == gVar.f137583a && Intrinsics.f(this.f137584b, gVar.f137584b) && this.f137585c == gVar.f137585c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f137585c, p.a.d(Integer.hashCode(this.f137583a) * 31, 31, this.f137584b), 31);
    }
}

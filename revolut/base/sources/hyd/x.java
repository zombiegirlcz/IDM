package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156840b;

    public /* synthetic */ x(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(v.f156834a.getDescriptor(), i, 3);
            throw null;
        }
        this.f156839a = str;
        this.f156840b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f156839a, xVar.f156839a) && Intrinsics.f(this.f156840b, xVar.f156840b);
    }

    public final int hashCode() {
        return this.f156840b.hashCode() + (this.f156839a.hashCode() * 31);
    }
}

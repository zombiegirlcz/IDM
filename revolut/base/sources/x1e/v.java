package x1e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f302398c;

    public /* synthetic */ v(String str, int i, Integer num, String str2) {
        if (2 != (i & 2)) {
            j1.f(t.f302395a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f302396a = null;
        } else {
            this.f302396a = str;
        }
        this.f302397b = str2;
        if ((i & 4) == 0) {
            this.f302398c = null;
        } else {
            this.f302398c = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f302396a, vVar.f302396a) && Intrinsics.f(this.f302397b, vVar.f302397b) && Intrinsics.f(this.f302398c, vVar.f302398c);
    }

    public final int hashCode() {
        String str = this.f302396a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f302397b);
        Integer num = this.f302398c;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public v(String str, Integer num, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f302396a = str;
        this.f302397b = value;
        this.f302398c = num;
    }
}

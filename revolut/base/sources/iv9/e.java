package iv9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f168786c;

    public /* synthetic */ e(int i, String str, String str2, long j2) {
        if (7 != (i & 7)) {
            j1.f(c.f168783a.getDescriptor(), i, 7);
            throw null;
        }
        this.f168784a = str;
        this.f168785b = str2;
        this.f168786c = j2;
    }

    public final long a() {
        return this.f168786c;
    }

    public final String b() {
        return this.f168784a;
    }

    public final String c() {
        return this.f168785b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f168784a, eVar.f168784a) && Intrinsics.f(this.f168785b, eVar.f168785b) && this.f168786c == eVar.f168786c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168786c) + p.a.c(this.f168784a.hashCode() * 31, 31, this.f168785b);
    }
}

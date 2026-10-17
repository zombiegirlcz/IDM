package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135759b;

    public /* synthetic */ e(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(c.f135749a.getDescriptor(), i, 1);
            throw null;
        }
        this.f135758a = str;
        if ((i & 2) == 0) {
            this.f135759b = null;
        } else {
            this.f135759b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f135758a, eVar.f135758a) && Intrinsics.f(this.f135759b, eVar.f135759b);
    }

    public final int hashCode() {
        int iHashCode = this.f135758a.hashCode() * 31;
        String str = this.f135759b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

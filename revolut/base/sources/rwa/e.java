package rwa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257865b;

    public /* synthetic */ e(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(c.f257863a.getDescriptor(), i, 3);
            throw null;
        }
        this.f257864a = str;
        this.f257865b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f257864a, eVar.f257864a) && Intrinsics.f(this.f257865b, eVar.f257865b);
    }

    public final int hashCode() {
        return this.f257865b.hashCode() + (this.f257864a.hashCode() * 31);
    }
}

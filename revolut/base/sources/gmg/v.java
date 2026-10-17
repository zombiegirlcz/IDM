package gmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144846c;

    public /* synthetic */ v(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(t.f144843a.getDescriptor(), i, 7);
            throw null;
        }
        this.f144844a = str;
        this.f144845b = str2;
        this.f144846c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f144844a, vVar.f144844a) && Intrinsics.f(this.f144845b, vVar.f144845b) && Intrinsics.f(this.f144846c, vVar.f144846c);
    }

    public final int hashCode() {
        String str = this.f144844a;
        return this.f144846c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f144845b);
    }
}

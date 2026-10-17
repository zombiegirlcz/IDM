package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135801b;

    public /* synthetic */ w(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(u.f135796a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135800a = str;
        this.f135801b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f135800a, wVar.f135800a) && Intrinsics.f(this.f135801b, wVar.f135801b);
    }

    public final int hashCode() {
        return this.f135801b.hashCode() + (this.f135800a.hashCode() * 31);
    }
}

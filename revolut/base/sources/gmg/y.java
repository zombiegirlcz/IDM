package gmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144849b;

    public /* synthetic */ y(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(w.f144847a.getDescriptor(), i, 3);
            throw null;
        }
        this.f144848a = str;
        this.f144849b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f144848a, yVar.f144848a) && Intrinsics.f(this.f144849b, yVar.f144849b);
    }

    public final int hashCode() {
        return this.f144849b.hashCode() + (this.f144848a.hashCode() * 31);
    }
}

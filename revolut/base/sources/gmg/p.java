package gmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144835b;

    public /* synthetic */ p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n.f144833a.getDescriptor(), i, 3);
            throw null;
        }
        this.f144834a = str;
        this.f144835b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f144834a, pVar.f144834a) && Intrinsics.f(this.f144835b, pVar.f144835b);
    }

    public final int hashCode() {
        return this.f144835b.hashCode() + (this.f144834a.hashCode() * 31);
    }
}

package k29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180433c;
    public final String d;

    public /* synthetic */ m(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(k.f180430a.getDescriptor(), i, 15);
            throw null;
        }
        this.f180431a = str;
        this.f180432b = str2;
        this.f180433c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f180431a, mVar.f180431a) && Intrinsics.f(this.f180432b, mVar.f180432b) && Intrinsics.f(this.f180433c, mVar.f180433c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f180431a.hashCode() * 31, 31, this.f180432b);
        String str = this.f180433c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

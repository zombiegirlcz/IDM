package k29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180440c;

    public /* synthetic */ s(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(q.f180437a.getDescriptor(), i, 7);
            throw null;
        }
        this.f180438a = str;
        this.f180439b = str2;
        this.f180440c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f180438a, sVar.f180438a) && Intrinsics.f(this.f180439b, sVar.f180439b) && Intrinsics.f(this.f180440c, sVar.f180440c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f180438a.hashCode() * 31, 31, this.f180439b);
        String str = this.f180440c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}

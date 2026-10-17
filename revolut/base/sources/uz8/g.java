package uz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new ux7.g(22)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f284635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284637c;

    public /* synthetic */ g(int i, d dVar, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(e.f284634a.getDescriptor(), i, 1);
            throw null;
        }
        this.f284635a = dVar;
        if ((i & 2) == 0) {
            this.f284636b = null;
        } else {
            this.f284636b = str;
        }
        if ((i & 4) == 0) {
            this.f284637c = null;
        } else {
            this.f284637c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f284635a == gVar.f284635a && Intrinsics.f(this.f284636b, gVar.f284636b) && Intrinsics.f(this.f284637c, gVar.f284637c);
    }

    public final int hashCode() {
        int iHashCode = this.f284635a.hashCode() * 31;
        String str = this.f284636b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f284637c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

package ta5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f269108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f269109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f269110c;

    public /* synthetic */ i(int i, long j2, long j3, Long l2) {
        if (7 != (i & 7)) {
            j1.f(g.f269107a.getDescriptor(), i, 7);
            throw null;
        }
        this.f269108a = j2;
        this.f269109b = j3;
        this.f269110c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f269108a == iVar.f269108a && this.f269109b == iVar.f269109b && Intrinsics.f(this.f269110c, iVar.f269110c);
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.f269108a) * 31, 31, this.f269109b);
        Long l2 = this.f269110c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}

package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f145871c;

    public /* synthetic */ v(int i, Long l2, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(t.f145868a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145869a = str;
        this.f145870b = str2;
        if ((i & 4) == 0) {
            this.f145871c = null;
        } else {
            this.f145871c = l2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f145869a, vVar.f145869a) && Intrinsics.f(this.f145870b, vVar.f145870b) && Intrinsics.f(this.f145871c, vVar.f145871c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f145869a.hashCode() * 31, 31, this.f145870b);
        Long l2 = this.f145871c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}

package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f244224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f244225c;

    public /* synthetic */ y(String str, int i, Long l2, Long l3) {
        if (7 != (i & 7)) {
            j1.f(w.f244222a.getDescriptor(), i, 7);
            throw null;
        }
        this.f244223a = str;
        this.f244224b = l2;
        this.f244225c = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f244223a, yVar.f244223a) && Intrinsics.f(this.f244224b, yVar.f244224b) && Intrinsics.f(this.f244225c, yVar.f244225c);
    }

    public final int hashCode() {
        String str = this.f244223a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.f244224b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f244225c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public y(String str, Long l2, Long l3) {
        this.f244223a = str;
        this.f244224b = l2;
        this.f244225c = l3;
    }
}

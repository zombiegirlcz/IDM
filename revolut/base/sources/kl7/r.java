package kl7;

import kkf.z5;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final p Companion = new p();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new z5(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f185380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185381c;

    public /* synthetic */ r(int i, String str, q qVar, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(o.f185367a.getDescriptor(), i, 3);
            throw null;
        }
        this.f185379a = str;
        this.f185380b = qVar;
        if ((i & 4) == 0) {
            this.f185381c = null;
        } else {
            this.f185381c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f185379a, rVar.f185379a) && this.f185380b == rVar.f185380b && Intrinsics.f(this.f185381c, rVar.f185381c);
    }

    public final int hashCode() {
        int iHashCode = (this.f185380b.hashCode() + (this.f185379a.hashCode() * 31)) * 31;
        String str = this.f185381c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

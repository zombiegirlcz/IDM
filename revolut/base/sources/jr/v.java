package jr;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new jp9.l(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f177852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f177853c;
    public final String d;
    public final yw.j e;

    public /* synthetic */ v(int i, String str, Integer num, Float f4, String str2, yw.j jVar) {
        if (1 != (i & 1)) {
            qlm.j1.f(t.f177843a.getDescriptor(), i, 1);
            throw null;
        }
        this.f177851a = str;
        if ((i & 2) == 0) {
            this.f177852b = null;
        } else {
            this.f177852b = num;
        }
        if ((i & 4) == 0) {
            this.f177853c = null;
        } else {
            this.f177853c = f4;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = yw.j.LOSSY;
        } else {
            this.e = jVar;
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
        return Intrinsics.f(this.f177851a, vVar.f177851a) && Intrinsics.f(this.f177852b, vVar.f177852b) && Intrinsics.f(this.f177853c, vVar.f177853c) && Intrinsics.f(this.d, vVar.d) && this.e == vVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f177851a.hashCode() * 31;
        Integer num = this.f177852b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f4 = this.f177853c;
        int iHashCode3 = (iHashCode2 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}

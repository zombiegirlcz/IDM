package xv4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f309189c;
    public final boolean d;

    public f(Data content, String facilityId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f309187a = content;
        this.f309188b = facilityId;
        this.f309189c = z;
        this.d = z3;
    }

    public static f a(f fVar, Data content, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            content = fVar.f309187a;
        }
        String facilityId = fVar.f309188b;
        if ((i & 4) != 0) {
            z = fVar.f309189c;
        }
        if ((i & 8) != 0) {
            z3 = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        return new f(content, facilityId, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f309187a, fVar.f309187a) && Intrinsics.f(this.f309188b, fVar.f309188b) && this.f309189c == fVar.f309189c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f309187a.hashCode() * 31, 31, this.f309188b), 31, this.f309189c);
    }
}

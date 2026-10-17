package gnl;

import com.revolut.data.model.Data;
import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Identifier f145029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f145030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145031c;
    public final boolean d;

    public h(Identifier identifier, Data otherOptions, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(otherOptions, "otherOptions");
        this.f145029a = identifier;
        this.f145030b = otherOptions;
        this.f145031c = z;
        this.d = z3;
    }

    public static h a(h hVar, Identifier identifier, Data otherOptions, int i) {
        if ((i & 1) != 0) {
            identifier = hVar.f145029a;
        }
        if ((i & 2) != 0) {
            otherOptions = hVar.f145030b;
        }
        boolean z = (i & 4) != 0 ? hVar.f145031c : true;
        boolean z3 = hVar.d;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(otherOptions, "otherOptions");
        return new h(identifier, otherOptions, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f145029a, hVar.f145029a) && Intrinsics.f(this.f145030b, hVar.f145030b) && this.f145031c == hVar.f145031c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(kii.e.c(this.f145030b, this.f145029a.hashCode() * 31, 31), 31, this.f145031c);
    }
}

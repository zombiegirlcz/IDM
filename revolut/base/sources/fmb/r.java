package fmb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f136296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136297b;

    public r(Data content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f136296a = content;
        this.f136297b = z;
    }

    public static r a(r rVar, Data content) {
        boolean z = rVar.f136297b;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new r(content, z);
    }

    public final ncd.a c() {
        l0 l0Var = (l0) this.f136296a.getContent();
        ncd.a aVar = l0Var != null ? l0Var.f136275a : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("AvailableProduct must not be null");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f136296a, rVar.f136296a) && this.f136297b == rVar.f136297b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136297b) + (this.f136296a.hashCode() * 31);
    }
}

package n09;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f210923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f210925c;

    public a0(z kind, boolean z, Data data) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f210923a = kind;
        this.f210924b = z;
        this.f210925c = data;
    }

    public static a0 a(a0 a0Var, boolean z) {
        z kind = a0Var.f210923a;
        Data data = a0Var.f210925c;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(data, "data");
        return new a0(kind, z, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f210923a, a0Var.f210923a) && this.f210924b == a0Var.f210924b && Intrinsics.f(this.f210925c, a0Var.f210925c);
    }

    public final int hashCode() {
        return this.f210925c.hashCode() + j6.a.c(this.f210923a.hashCode() * 31, 31, this.f210924b);
    }
}

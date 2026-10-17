package pcd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f234874c;

    public m(String id10, String paymentId, n type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f234872a = id10;
        this.f234873b = paymentId;
        this.f234874c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f234872a, mVar.f234872a) && Intrinsics.f(this.f234873b, mVar.f234873b) && this.f234874c == mVar.f234874c;
    }

    public final int hashCode() {
        return this.f234874c.hashCode() + p.a.c(this.f234872a.hashCode() * 31, 31, this.f234873b);
    }
}

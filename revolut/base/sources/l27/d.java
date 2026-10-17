package l27;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f191682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f191684c;

    public d(Data qrCode, Data user, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f191682a = dVar;
        this.f191683b = qrCode;
        this.f191684c = user;
    }

    public static d a(d dVar, Data qrCode, Data user, int i) {
        dj0.d dVar2 = dVar.f191682a;
        if ((i & 2) != 0) {
            qrCode = dVar.f191683b;
        }
        if ((i & 4) != 0) {
            user = dVar.f191684c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(user, "user");
        return new d(qrCode, user, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f191682a, dVar.f191682a) && Intrinsics.f(this.f191683b, dVar.f191683b) && Intrinsics.f(this.f191684c, dVar.f191684c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f191682a;
        return this.f191684c.hashCode() + kii.e.c(this.f191683b, (dVar == null ? 0 : dVar.hashCode()) * 31, 31);
    }
}

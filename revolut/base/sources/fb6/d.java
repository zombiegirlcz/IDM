package fb6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f133445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f133447c;
    public final Data d;

    public d(int i, Data suggestions, Data revPointsAccount, Data data) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        this.f133445a = suggestions;
        this.f133446b = i;
        this.f133447c = revPointsAccount;
        this.d = data;
    }

    public static d a(d dVar, Data suggestions, int i, Data revPointsAccount, Data data, int i2) {
        if ((i2 & 1) != 0) {
            suggestions = dVar.f133445a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f133446b;
        }
        if ((i2 & 4) != 0) {
            revPointsAccount = dVar.f133447c;
        }
        if ((i2 & 8) != 0) {
            data = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        return new d(i, suggestions, revPointsAccount, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f133445a, dVar.f133445a) && this.f133446b == dVar.f133446b && Intrinsics.f(this.f133447c, dVar.f133447c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f133447c, j6.a.b(this.f133446b, this.f133445a.hashCode() * 31, 31), 31);
        Data data = this.d;
        return iC + (data == null ? 0 : data.hashCode());
    }
}

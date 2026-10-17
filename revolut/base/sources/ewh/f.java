package ewh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f130267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f130268b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data currentAccount, Data data, int i) {
        if ((i & 1) != 0) {
            currentAccount = fVar.f130267a;
        }
        if ((i & 2) != 0) {
            data = fVar.f130268b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(currentAccount, "currentAccount");
        return new f(currentAccount, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f130267a, fVar.f130267a) && Intrinsics.f(this.f130268b, fVar.f130268b);
    }

    public final int hashCode() {
        int iHashCode = this.f130267a.hashCode() * 31;
        Data data = this.f130268b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }

    public f(Data currentAccount, Data data) {
        Intrinsics.checkNotNullParameter(currentAccount, "currentAccount");
        this.f130267a = currentAccount;
        this.f130268b = data;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}

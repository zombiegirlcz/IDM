package pn6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237669b;

    public f(Data externalAccounts, String str) {
        Intrinsics.checkNotNullParameter(externalAccounts, "externalAccounts");
        this.f237668a = externalAccounts;
        this.f237669b = str;
    }

    public static f a(f fVar, Data externalAccounts, String str, int i) {
        if ((i & 1) != 0) {
            externalAccounts = fVar.f237668a;
        }
        if ((i & 2) != 0) {
            str = fVar.f237669b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(externalAccounts, "externalAccounts");
        return new f(externalAccounts, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f237668a, fVar.f237668a) && Intrinsics.f(this.f237669b, fVar.f237669b);
    }

    public final int hashCode() {
        int iHashCode = this.f237668a.hashCode() * 31;
        String str = this.f237669b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

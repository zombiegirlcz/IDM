package tdc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f269958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f269959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f269960c;
    public final String d;
    public final String e;

    public m(d userSelectedIdentifier, Data paymentMethodInfo, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(userSelectedIdentifier, "userSelectedIdentifier");
        Intrinsics.checkNotNullParameter(paymentMethodInfo, "paymentMethodInfo");
        this.f269958a = userSelectedIdentifier;
        this.f269959b = paymentMethodInfo;
        this.f269960c = z;
        this.d = str;
        this.e = str2;
    }

    public static m a(m mVar, d dVar, Data data, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            dVar = mVar.f269958a;
        }
        d userSelectedIdentifier = dVar;
        if ((i & 2) != 0) {
            data = mVar.f269959b;
        }
        Data paymentMethodInfo = data;
        if ((i & 4) != 0) {
            z = mVar.f269960c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = mVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = mVar.e;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(userSelectedIdentifier, "userSelectedIdentifier");
        Intrinsics.checkNotNullParameter(paymentMethodInfo, "paymentMethodInfo");
        return new m(userSelectedIdentifier, paymentMethodInfo, z3, str3, str2);
    }

    public final h b() {
        String str;
        String str2 = this.d;
        if (str2 == null || (str = this.e) == null) {
            return null;
        }
        return new h(this.f269960c, str2, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f269958a, mVar.f269958a) && Intrinsics.f(this.f269959b, mVar.f269959b) && this.f269960c == mVar.f269960c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f269959b, this.f269958a.hashCode() * 31, 31), 31, this.f269960c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

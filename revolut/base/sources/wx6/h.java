package wx6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f300761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300762c;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data invoiceInfo, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            invoiceInfo = hVar.f300760a;
        }
        if ((i & 2) != 0) {
            z = hVar.f300761b;
        }
        if ((i & 4) != 0) {
            str = hVar.f300762c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        return new h(invoiceInfo, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f300760a, hVar.f300760a) && this.f300761b == hVar.f300761b && Intrinsics.f(this.f300762c, hVar.f300762c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f300760a.hashCode() * 31, 31, this.f300761b);
        String str = this.f300762c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public h(Data invoiceInfo, String str, boolean z) {
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        this.f300760a = invoiceInfo;
        this.f300761b = z;
        this.f300762c = str;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), null, false);
    }
}

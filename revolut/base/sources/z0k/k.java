package z0k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f318631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f318633c;

    public k(Data assetNews, Data disclaimer, String str) {
        Intrinsics.checkNotNullParameter(assetNews, "assetNews");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f318631a = assetNews;
        this.f318632b = str;
        this.f318633c = disclaimer;
    }

    public static k a(k kVar, Data assetNews, String str, Data disclaimer, int i) {
        if ((i & 1) != 0) {
            assetNews = kVar.f318631a;
        }
        if ((i & 2) != 0) {
            str = kVar.f318632b;
        }
        if ((i & 4) != 0) {
            disclaimer = kVar.f318633c;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(assetNews, "assetNews");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new k(assetNews, disclaimer, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f318631a, kVar.f318631a) && Intrinsics.f(this.f318632b, kVar.f318632b) && Intrinsics.f(this.f318633c, kVar.f318633c);
    }

    public final int hashCode() {
        int iHashCode = this.f318631a.hashCode() * 31;
        String str = this.f318632b;
        return this.f318633c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}

package lph;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f199123c;
    public final boolean d;

    public a() {
        this(0);
    }

    public static a a(a aVar, aim.e eVar, String str, Data collections, boolean z, int i) {
        List pagerItems = eVar;
        if ((i & 1) != 0) {
            pagerItems = aVar.f199121a;
        }
        if ((i & 2) != 0) {
            str = aVar.f199122b;
        }
        if ((i & 4) != 0) {
            collections = aVar.f199123c;
        }
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(collections, "collections");
        return new a(collections, str, pagerItems, z);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f199121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f199121a, aVar.f199121a) && Intrinsics.f(this.f199122b, aVar.f199122b) && Intrinsics.f(this.f199123c, aVar.f199123c) && this.d == aVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f199121a.hashCode() * 31;
        String str = this.f199122b;
        return Boolean.hashCode(this.d) + kii.e.c(this.f199123c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f199122b;
    }

    public a(Data collections, String str, List pagerItems, boolean z) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(collections, "collections");
        this.f199121a = pagerItems;
        this.f199122b = str;
        this.f199123c = collections;
        this.d = z;
    }

    public a(int i) {
        this(new Data(null, null, true, 3, null), null, f0.f322471a, true);
    }
}

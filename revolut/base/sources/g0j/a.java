package g0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f139496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139497c;
    public final ArrayList d;
    public final ArrayList e;

    public a(String id10, wi0.b countryCode, String assetUrl, ArrayList tools, ArrayList products) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f139495a = id10;
        this.f139496b = countryCode;
        this.f139497c = assetUrl;
        this.d = tools;
        this.e = products;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f139495a, aVar.f139495a) && this.f139496b.equals(aVar.f139496b) && Intrinsics.f(this.f139497c, aVar.f139497c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f139495a.hashCode() * 31, 31, this.f139496b.f297794a), 31, this.f139497c), 31);
    }
}

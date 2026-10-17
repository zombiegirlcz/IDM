package wxd;

import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300882c;

    public r(String id10, String title, String icon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f300880a = id10;
        this.f300881b = title;
        this.f300882c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        String str = rVar.f300880a;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return Intrinsics.f(this.f300880a, str) && Intrinsics.f(this.f300881b, rVar.f300881b) && Intrinsics.f(this.f300882c, rVar.f300882c);
    }

    public final int hashCode() {
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return this.f300882c.hashCode() + p.a.c(this.f300880a.hashCode() * 31, 31, this.f300881b);
    }
}

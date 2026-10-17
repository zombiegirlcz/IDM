package js3;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178118b;

    public a(String productPath, String id10) {
        Intrinsics.checkNotNullParameter(productPath, "productPath");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f178117a = productPath;
        this.f178118b = id10;
    }

    public final String a() {
        Intrinsics.checkNotNullParameter("DEBTS_CONTENT_KEY", "prefix");
        return d.s("DEBTS_CONTENT_KEY.", this.f178117a, ".", this.f178118b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f178117a, aVar.f178117a) && Intrinsics.f(this.f178118b, aVar.f178118b);
    }

    public final int hashCode() {
        return this.f178118b.hashCode() + (this.f178117a.hashCode() * 31);
    }
}

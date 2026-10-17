package dc8;

import cli.j;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f112815c;

    public b(Data user, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f112813a = selectedPagerItemId;
        this.f112814b = pagerItems;
        this.f112815c = user;
    }

    public static b a(b bVar, String selectedPagerItemId, List pagerItems, int i) {
        if ((i & 2) != 0) {
            pagerItems = bVar.f112814b;
        }
        Data user = bVar.f112815c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(user, "user");
        return new b(user, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f112814b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f112813a, bVar.f112813a) && Intrinsics.f(this.f112814b, bVar.f112814b) && Intrinsics.f(this.f112815c, bVar.f112815c);
    }

    public final int hashCode() {
        return this.f112815c.hashCode() + p.a.d(this.f112813a.hashCode() * 31, 31, this.f112814b);
    }

    @Override // oki.a
    public final String z() {
        return this.f112813a;
    }
}

package i3e;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f158187c;
    public final Data d;

    public g(Data revPointsPill, String selectedPagerItemId, List pagerItems, boolean z) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        this.f158185a = pagerItems;
        this.f158186b = selectedPagerItemId;
        this.f158187c = z;
        this.d = revPointsPill;
    }

    public static g a(g gVar, String selectedPagerItemId, boolean z, Data revPointsPill, int i) {
        List pagerItems = gVar.f158185a;
        if ((i & 2) != 0) {
            selectedPagerItemId = gVar.f158186b;
        }
        if ((i & 4) != 0) {
            z = gVar.f158187c;
        }
        if ((i & 8) != 0) {
            revPointsPill = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        return new g(revPointsPill, selectedPagerItemId, pagerItems, z);
    }

    @Override // oki.a
    public final List W() {
        return this.f158185a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f158185a, gVar.f158185a) && Intrinsics.f(this.f158186b, gVar.f158186b) && this.f158187c == gVar.f158187c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.c(this.f158185a.hashCode() * 31, 31, this.f158186b), 31, this.f158187c);
    }

    @Override // oki.a
    public final String z() {
        return this.f158186b;
    }
}

package l4g;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f192109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f192111c;

    public e(Data revPointsPill, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        this.f192109a = pagerItems;
        this.f192110b = selectedPagerItemId;
        this.f192111c = revPointsPill;
    }

    public static e a(e eVar, String selectedPagerItemId, Data revPointsPill, int i) {
        List pagerItems = eVar.f192109a;
        if ((i & 2) != 0) {
            selectedPagerItemId = eVar.f192110b;
        }
        if ((i & 4) != 0) {
            revPointsPill = eVar.f192111c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        return new e(revPointsPill, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f192109a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f192109a, eVar.f192109a) && Intrinsics.f(this.f192110b, eVar.f192110b) && Intrinsics.f(this.f192111c, eVar.f192111c);
    }

    public final int hashCode() {
        return this.f192111c.hashCode() + p.a.c(this.f192109a.hashCode() * 31, 31, this.f192110b);
    }

    @Override // oki.a
    public final String z() {
        return this.f192110b;
    }
}

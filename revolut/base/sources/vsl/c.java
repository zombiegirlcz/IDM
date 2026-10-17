package vsl;

import cli.j;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f291848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f291849c;

    public c(Data data, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f291847a = selectedPagerItemId;
        this.f291848b = pagerItems;
        this.f291849c = data;
    }

    public static c a(c cVar, String selectedPagerItemId, List pagerItems, Data data, int i) {
        if ((i & 1) != 0) {
            selectedPagerItemId = cVar.f291847a;
        }
        if ((i & 2) != 0) {
            pagerItems = cVar.f291848b;
        }
        if ((i & 4) != 0) {
            data = cVar.f291849c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new c(data, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f291848b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f291847a, cVar.f291847a) && Intrinsics.f(this.f291848b, cVar.f291848b) && Intrinsics.f(this.f291849c, cVar.f291849c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f291847a.hashCode() * 31, 31, this.f291848b);
        Data data = this.f291849c;
        return iD + (data == null ? 0 : data.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f291847a;
    }
}

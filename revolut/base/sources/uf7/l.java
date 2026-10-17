package uf7;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf7.j f279610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f279612c;
    public final String d;

    public l(hf7.j header, List blockItems, LinkedHashMap linkedHashMap, String terms) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(blockItems, "blockItems");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f279610a = header;
        this.f279611b = blockItems;
        this.f279612c = linkedHashMap;
        this.d = terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f279610a, lVar.f279610a) && Intrinsics.f(this.f279611b, lVar.f279611b) && Intrinsics.f(this.f279612c, lVar.f279612c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f279610a.hashCode() * 31, 31, this.f279611b);
        Map map = this.f279612c;
        return this.d.hashCode() + ((iD + (map == null ? 0 : map.hashCode())) * 31);
    }
}

package k8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends com.revolut.feature.shared.help_centre.impl.faq.screens.list.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f182113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f182114c;

    public h(String str, List list, List list2) {
        this.f182112a = str;
        this.f182113b = list;
        this.f182114c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f182112a, hVar.f182112a) && Intrinsics.f(this.f182113b, hVar.f182113b) && Intrinsics.f(this.f182114c, hVar.f182114c);
    }

    public final int hashCode() {
        String str = this.f182112a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f182113b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f182114c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}

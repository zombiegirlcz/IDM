package b8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends com.revolut.feature.shared.help_centre.impl.faq.screens.article.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13185c;

    public p(String str, List list, List list2) {
        this.f13183a = str;
        this.f13184b = list;
        this.f13185c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f13183a, pVar.f13183a) && Intrinsics.f(this.f13184b, pVar.f13184b) && Intrinsics.f(this.f13185c, pVar.f13185c);
    }

    public final int hashCode() {
        String str = this.f13183a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f13184b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f13185c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}

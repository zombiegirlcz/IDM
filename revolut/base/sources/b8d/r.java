package b8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends com.revolut.feature.shared.help_centre.impl.faq.screens.article.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13191c;

    public r(String str, List formActions, List list) {
        Intrinsics.checkNotNullParameter(formActions, "formActions");
        this.f13189a = str;
        this.f13190b = formActions;
        this.f13191c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f13189a, rVar.f13189a) && Intrinsics.f(this.f13190b, rVar.f13190b) && Intrinsics.f(this.f13191c, rVar.f13191c);
    }

    public final int hashCode() {
        String str = this.f13189a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f13190b);
        List list = this.f13191c;
        return iD + (list != null ? list.hashCode() : 0);
    }
}

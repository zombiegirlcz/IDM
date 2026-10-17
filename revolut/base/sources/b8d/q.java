package b8d;

import com.revolut.core.model.faq.FaqAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends com.revolut.feature.shared.help_centre.impl.faq.screens.article.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaqAction f13187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13188c;

    public q(String str, FaqAction formAction, List list) {
        Intrinsics.checkNotNullParameter(formAction, "formAction");
        this.f13186a = str;
        this.f13187b = formAction;
        this.f13188c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f13186a, qVar.f13186a) && Intrinsics.f(this.f13187b, qVar.f13187b) && Intrinsics.f(this.f13188c, qVar.f13188c);
    }

    public final int hashCode() {
        String str = this.f13186a;
        int iHashCode = (this.f13187b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        List list = this.f13188c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}

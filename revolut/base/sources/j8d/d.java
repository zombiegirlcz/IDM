package j8d;

import com.revolut.core.model.faq.FaqAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaqAction f172170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f172171c;

    public d(String str, FaqAction formAction, List list) {
        Intrinsics.checkNotNullParameter(formAction, "formAction");
        this.f172169a = str;
        this.f172170b = formAction;
        this.f172171c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f172169a, dVar.f172169a) && Intrinsics.f(this.f172170b, dVar.f172170b) && Intrinsics.f(this.f172171c, dVar.f172171c);
    }

    public final int hashCode() {
        String str = this.f172169a;
        int iHashCode = (this.f172170b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        List list = this.f172171c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}

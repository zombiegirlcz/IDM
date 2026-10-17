package qc0;

import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectionStyle f244439c;
    public final String d;
    public final String e;
    public final Set f;

    public h1(String formId, String itemId, SelectionStyle style, String str, String str2, Set set) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f244437a = formId;
        this.f244438b = itemId;
        this.f244439c = style;
        this.d = str;
        this.e = str2;
        this.f = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f244437a, h1Var.f244437a) && Intrinsics.f(this.f244438b, h1Var.f244438b) && Intrinsics.f(this.f244439c, h1Var.f244439c) && Intrinsics.f(this.d, h1Var.d) && Intrinsics.f(this.e, h1Var.e) && Intrinsics.f(this.f, h1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f244439c.hashCode() + p.a.c(this.f244437a.hashCode() * 31, 31, this.f244438b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set set = this.f;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }
}

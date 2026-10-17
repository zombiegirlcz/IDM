package yf1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f313128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f313129c;
    public final String d;
    public final Clause e;
    public final Clause f;

    public p(List items, ArrayList tabItems, q qVar, String str, TextClause textClause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        this.f313127a = items;
        this.f313128b = tabItems;
        this.f313129c = qVar;
        this.d = str;
        this.e = textClause;
        this.f = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f313127a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f313127a, pVar.f313127a) && this.f313128b.equals(pVar.f313128b) && Intrinsics.f(this.f313129c, pVar.f313129c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f313128b, this.f313127a.hashCode() * 31, 31);
        q qVar = this.f313129c;
        int iHashCode = (iB + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Clause clause = this.e;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f;
        return iHashCode3 + (clause2 != null ? clause2.hashCode() : 0);
    }
}

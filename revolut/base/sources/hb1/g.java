package hb1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f150553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f150554b;

    public g(TextLocalisedClause header, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f150553a = items;
        this.f150554b = header;
    }

    @Override // jki.n
    public final List c() {
        return this.f150553a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f150553a.equals(gVar.f150553a) && this.f150554b.equals(gVar.f150554b);
    }

    public final int hashCode() {
        return this.f150554b.hashCode() + (this.f150553a.hashCode() * 31);
    }
}

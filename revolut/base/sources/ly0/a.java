package ly0;

import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import pq0.n;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f200625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f200626c;

    public a(TextLocalisedClause title, n arrowColors) {
        int i = R$drawable.internal_card_header_arrow;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(arrowColors, "arrowColors");
        this.f200624a = title;
        this.f200625b = arrowColors;
        this.f200626c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f200624a.equals(aVar.f200624a) && this.f200625b.equals(aVar.f200625b) && this.f200626c == aVar.f200626c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f200626c) + ((this.f200625b.hashCode() + (this.f200624a.hashCode() * 31)) * 31);
    }
}

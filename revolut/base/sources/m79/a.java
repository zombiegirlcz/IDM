package m79;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f203348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s69.d f203350c;

    public a(TextClause text, String link, s69.d inbox) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(inbox, "inbox");
        this.f203348a = text;
        this.f203349b = link;
        this.f203350c = inbox;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f203348a.equals(aVar.f203348a) && Intrinsics.f(this.f203349b, aVar.f203349b) && Intrinsics.f(this.f203350c, aVar.f203350c);
    }

    public final int hashCode() {
        return this.f203350c.hashCode() + p.a.c(this.f203348a.hashCode() * 31, 31, this.f203349b);
    }
}

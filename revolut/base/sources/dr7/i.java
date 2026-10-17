package dr7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f117097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f117098c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final boolean f;

    public i(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryButton, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f117096a = items;
        this.f117097b = title;
        this.f117098c = textLocalisedClause;
        this.d = primaryButton;
        this.e = z;
        this.f = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f117096a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f117096a, iVar.f117096a) && this.f117097b.equals(iVar.f117097b) && Intrinsics.f(this.f117098c, iVar.f117098c) && this.d.equals(iVar.d) && this.e == iVar.e && this.f == iVar.f;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f117096a.hashCode() * 31, 31, this.f117097b);
        Clause clause = this.f117098c;
        return Boolean.hashCode(this.f) + j6.a.c(t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}

package bx6;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw6.a f19500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f19501c;
    public final Clause d;

    public g(List items, xw6.a header, TextLocalisedClause buttonText, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f19499a = items;
        this.f19500b = header;
        this.f19501c = buttonText;
        this.d = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f19499a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19499a, gVar.f19499a) && Intrinsics.f(this.f19500b, gVar.f19500b) && Intrinsics.f(this.f19501c, gVar.f19501c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a((this.f19500b.hashCode() + (this.f19499a.hashCode() * 31)) * 31, 31, this.f19501c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}

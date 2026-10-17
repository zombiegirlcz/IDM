package t44;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f267886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f267887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f267888c;
    public final boolean d;
    public final List e;

    public o(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextClause buttonText, boolean z, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f267886a = title;
        this.f267887b = textLocalisedClause;
        this.f267888c = buttonText;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f267886a.equals(oVar.f267886a) && Intrinsics.f(this.f267887b, oVar.f267887b) && this.f267888c.equals(oVar.f267888c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f267886a.hashCode() * 31;
        Clause clause = this.f267887b;
        return this.e.hashCode() + j6.a.c(v7.b((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f267888c), 31, this.d);
    }
}

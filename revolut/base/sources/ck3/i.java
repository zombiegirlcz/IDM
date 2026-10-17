package ck3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f24762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f24763c;
    public final aw0.e d;

    public i(aw0.e nextButton, TextLocalisedClause toolbarTitle, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f24761a = items;
        this.f24762b = toolbarTitle;
        this.f24763c = textLocalisedClause;
        this.d = nextButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f24761a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f24761a, iVar.f24761a) && this.f24762b.equals(iVar.f24762b) && Intrinsics.f(this.f24763c, iVar.f24763c) && this.d.equals(iVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f24761a.hashCode() * 31, 31, this.f24762b);
        Clause clause = this.f24763c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}

package nk9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f216762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f216763c;
    public final List d;

    public i(List items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, f0 actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f216761a = items;
        this.f216762b = title;
        this.f216763c = textLocalisedClause;
        this.d = actions;
    }

    @Override // jki.n
    public final List c() {
        return this.f216761a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f216761a, iVar.f216761a) && this.f216762b.equals(iVar.f216762b) && Intrinsics.f(this.f216763c, iVar.f216763c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f216761a.hashCode() * 31, 31, this.f216762b);
        Clause clause = this.f216763c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}

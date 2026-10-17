package arf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f8696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8697c;

    public e(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f8695a = items;
        this.f8696b = textLocalisedClause;
        this.f8697c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f8695a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f8695a, eVar.f8695a) && Intrinsics.f(this.f8696b, eVar.f8696b) && this.f8697c == eVar.f8697c;
    }

    public final int hashCode() {
        int iHashCode = this.f8695a.hashCode() * 31;
        Clause clause = this.f8696b;
        return Boolean.hashCode(this.f8697c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}

package smd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f264411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f264412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264413c;

    public e(Clause title, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f264411a = title;
        this.f264412b = textLocalisedClause;
        this.f264413c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f264411a.equals(eVar.f264411a) && this.f264412b.equals(eVar.f264412b) && this.f264413c == eVar.f264413c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264413c) + t61.a.a(this.f264411a.hashCode() * 31, 31, this.f264412b);
    }
}

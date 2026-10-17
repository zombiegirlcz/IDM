package oc4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f224096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f224097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f224098c;
    public final Clause d;
    public final boolean e;
    public final List f;

    public h(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextClause textClause, TextLocalisedClause textLocalisedClause2, boolean z, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224096a = title;
        this.f224097b = textLocalisedClause;
        this.f224098c = textClause;
        this.d = textLocalisedClause2;
        this.e = z;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f224096a, hVar.f224096a) && Intrinsics.f(this.f224097b, hVar.f224097b) && Intrinsics.f(this.f224098c, hVar.f224098c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f224096a.hashCode() * 31;
        Clause clause = this.f224097b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f224098c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode3 + (clause3 != null ? clause3.hashCode() : 0)) * 31, 31, this.e);
    }

    public h(TextLocalisedClause textLocalisedClause, List list) {
        this(textLocalisedClause, null, null, null, true, list);
    }
}

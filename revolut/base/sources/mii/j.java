package mii;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f205868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f205869c;
    public final f1 d;

    public j(int i, TextLocalisedClause message, TextLocalisedClause textLocalisedClause, String id10, f1 position) {
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        position = (i & 16) != 0 ? f1.BOTTOM : position;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f205867a = id10;
        this.f205868b = message;
        this.f205869c = textLocalisedClause;
        this.d = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f205867a, jVar.f205867a) && Intrinsics.f(this.f205868b, jVar.f205868b) && Intrinsics.f(this.f205869c, jVar.f205869c) && this.d == jVar.d;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f205867a.hashCode() * 31, 31, this.f205868b);
        Clause clause = this.f205869c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 961);
    }
}

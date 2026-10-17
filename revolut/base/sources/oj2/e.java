package oj2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f225714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f225715b;

    public e(Clause clause, Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f225714a = content;
        this.f225715b = clause;
    }

    public static e a(e eVar, Data content, TextClause textClause, int i) {
        if ((i & 1) != 0) {
            content = eVar.f225714a;
        }
        Clause clause = textClause;
        if ((i & 2) != 0) {
            clause = eVar.f225715b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new e(clause, content);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f225714a, eVar.f225714a) && Intrinsics.f(this.f225715b, eVar.f225715b);
    }

    public final int hashCode() {
        int iHashCode = this.f225714a.hashCode() * 31;
        Clause clause = this.f225715b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}

package ro7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f255920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f255921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f255922c;

    public j(TextLocalisedClause textLocalisedClause, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255920a = items;
        this.f255921b = z;
        this.f255922c = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f255920a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f255920a.equals(jVar.f255920a) && this.f255921b == jVar.f255921b && Intrinsics.f(this.f255922c, jVar.f255922c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f255920a.hashCode() * 31, 31, this.f255921b);
        Clause clause = this.f255922c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}

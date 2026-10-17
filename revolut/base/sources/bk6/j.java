package bk6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f16272b;

    public j(TextLocalisedClause textLocalisedClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16271a = items;
        this.f16272b = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f16271a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f16271a.equals(jVar.f16271a) && this.f16272b.equals(jVar.f16272b);
    }

    public final int hashCode() {
        return this.f16272b.hashCode() + (this.f16271a.hashCode() * 31);
    }
}

package vw7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f292649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f292650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw0.a f292651c;

    public d(ArrayList items, TextClause textClause, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f292649a = items;
        this.f292650b = textClause;
        this.f292651c = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f292649a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f292649a.equals(dVar.f292649a) && Intrinsics.f(this.f292650b, dVar.f292650b) && this.f292651c.equals(dVar.f292651c);
    }

    public final int hashCode() {
        int iHashCode = this.f292649a.hashCode() * 31;
        Clause clause = this.f292650b;
        return this.f292651c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}

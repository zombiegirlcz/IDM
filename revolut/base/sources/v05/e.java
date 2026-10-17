package v05;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f284743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f284744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f284745c;
    public final ArrayList d;

    public e(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, ArrayList actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f284743a = textLocalisedClause;
        this.f284744b = textLocalisedClause2;
        this.f284745c = textLocalisedClause3;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f284743a, eVar.f284743a) && Intrinsics.f(this.f284744b, eVar.f284744b) && Intrinsics.f(this.f284745c, eVar.f284745c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f284743a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f284744b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f284745c;
        return this.d.hashCode() + ((iHashCode2 + (clause3 != null ? clause3.hashCode() : 0)) * 31);
    }
}

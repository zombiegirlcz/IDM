package vv8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f292476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f292478c;
    public final Clause d;

    public e(TextLocalisedClause buttonLabel, TextLocalisedClause textLocalisedClause, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f292476a = items;
        this.f292477b = z;
        this.f292478c = buttonLabel;
        this.d = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f292476a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f292476a.equals(eVar.f292476a) && this.f292477b == eVar.f292477b && this.f292478c.equals(eVar.f292478c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.c(this.f292476a.hashCode() * 31, 31, this.f292477b), 31, this.f292478c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}

package qna;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f247902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f247903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f247904c;

    public e(TextLocalisedClause title, int i, xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f247902a = title;
        this.f247903b = i;
        this.f247904c = selectedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f247902a.equals(eVar.f247902a) && this.f247903b == eVar.f247903b && Intrinsics.f(this.f247904c, eVar.f247904c);
    }

    public final int hashCode() {
        return this.f247904c.hashCode() + j6.a.b(this.f247903b, this.f247902a.hashCode() * 31, 31);
    }
}

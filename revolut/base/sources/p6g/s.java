package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f233301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f233302b;

    public s(Regex regex, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.f233301a = regex;
        this.f233302b = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233302b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f233301a, sVar.f233301a) && this.f233302b.equals(sVar.f233302b);
    }

    public final int hashCode() {
        return this.f233302b.hashCode() + (this.f233301a.hashCode() * 31);
    }
}

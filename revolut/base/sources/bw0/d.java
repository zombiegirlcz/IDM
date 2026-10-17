package bw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f19176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f19177c;

    public /* synthetic */ d(int i, Clause clause, Clause clause2) {
        this(clause, (i & 2) != 0 ? null : clause2, (Clause) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f19175a, dVar.f19175a) && Intrinsics.f(this.f19176b, dVar.f19176b) && Intrinsics.f(this.f19177c, dVar.f19177c);
    }

    public final int hashCode() {
        int iHashCode = this.f19175a.hashCode() * 31;
        Clause clause = this.f19176b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f19177c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public d(Clause formattedText, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(formattedText, "formattedText");
        this.f19175a = formattedText;
        this.f19176b = clause;
        this.f19177c = clause2;
    }
}

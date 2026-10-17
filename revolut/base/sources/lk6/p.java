package lk6;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f196259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f196260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f196261c;

    public p(Clause title, Clause clause, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f196259a = title;
        this.f196260b = clause;
        this.f196261c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f196259a.equals(pVar.f196259a) && Intrinsics.f(this.f196260b, pVar.f196260b) && Intrinsics.f(this.f196261c, pVar.f196261c);
    }

    public final int hashCode() {
        int iHashCode = this.f196259a.hashCode() * 31;
        Clause clause = this.f196260b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        String str = this.f196261c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}

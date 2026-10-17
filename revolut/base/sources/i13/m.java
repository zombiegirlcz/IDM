package i13;

import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157544c;
    public final boolean d;

    public m(TextLocalisedClause title, TextLocalisedClause subtitle, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f157542a = title;
        this.f157543b = subtitle;
        this.f157544c = z;
        this.d = z3;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        m mVar = oldState instanceof m ? (m) oldState : null;
        if (mVar == null) {
            return null;
        }
        boolean z = !this.f157542a.equals(mVar.f157542a);
        boolean z3 = !this.f157543b.equals(mVar.f157543b);
        boolean z4 = mVar.f157544c;
        boolean z6 = this.f157544c;
        return new l(z, z3, z6 != z4 && z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f157542a.equals(mVar.f157542a) && this.f157543b.equals(mVar.f157543b) && this.f157544c == mVar.f157544c && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(t61.a.a(this.f157542a.hashCode() * 31, 31, this.f157543b), 31, this.f157544c);
    }
}

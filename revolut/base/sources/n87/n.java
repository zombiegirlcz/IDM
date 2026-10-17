package n87;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f213259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f213260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f213261c;
    public final String d;

    public n(TextLocalisedClause title, TextLocalisedClause subtitle, List items, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213259a = title;
        this.f213260b = subtitle;
        this.f213261c = items;
        this.d = str;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof n ? (n) oldState : null) == null) {
            return null;
        }
        return new m(!Intrinsics.f(this.d, r3.d));
    }

    @Override // cli.p
    public final List c() {
        return this.f213261c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f213259a.equals(nVar.f213259a) && this.f213260b.equals(nVar.f213260b) && Intrinsics.f(this.f213261c, nVar.f213261c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(t61.a.a(this.f213259a.hashCode() * 31, 31, this.f213260b), 31, this.f213261c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}

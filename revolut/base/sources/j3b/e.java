package j3b;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f171003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f171004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f171005c;
    public final d d;
    public final List e;

    public e(Clause title, Clause subtitle, Clause clause, d headerIcon, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(headerIcon, "headerIcon");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171003a = title;
        this.f171004b = subtitle;
        this.f171005c = clause;
        this.d = headerIcon;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f171003a, eVar.f171003a) && Intrinsics.f(this.f171004b, eVar.f171004b) && Intrinsics.f(this.f171005c, eVar.f171005c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f171003a.hashCode() * 31, 31, this.f171004b);
        Clause clause = this.f171005c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}

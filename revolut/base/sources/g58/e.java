package g58;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f140691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f140692c;
    public final a d;
    public final List e;

    public e(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause confirmButtonText, a confirmationButtonState, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(confirmationButtonState, "confirmationButtonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140690a = title;
        this.f140691b = description;
        this.f140692c = confirmButtonText;
        this.d = confirmationButtonState;
        this.e = items;
    }

    @Override // jki.n
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
        return this.f140690a.equals(eVar.f140690a) && this.f140691b.equals(eVar.f140691b) && this.f140692c.equals(eVar.f140692c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + t61.a.a(t61.a.a(this.f140690a.hashCode() * 31, 31, this.f140691b), 31, this.f140692c)) * 31);
    }
}

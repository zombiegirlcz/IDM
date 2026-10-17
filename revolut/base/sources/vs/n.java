package vs;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f291704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f291705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f291706c;

    public n(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f291704a = title;
        this.f291705b = description;
        this.f291706c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f291706c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f291704a.equals(nVar.f291704a) && this.f291705b.equals(nVar.f291705b) && this.f291706c.equals(nVar.f291706c);
    }

    public final int hashCode() {
        return this.f291706c.hashCode() + t61.a.a(this.f291704a.hashCode() * 31, 31, this.f291705b);
    }
}

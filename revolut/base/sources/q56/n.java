package q56;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f242308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f242309c;

    public n(TextLocalisedClause saveButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(saveButtonText, "saveButtonText");
        this.f242307a = items;
        this.f242308b = saveButtonText;
        this.f242309c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f242307a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f242307a, nVar.f242307a) && this.f242308b.equals(nVar.f242308b) && this.f242309c == nVar.f242309c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242309c) + t61.a.a(this.f242307a.hashCode() * 31, 31, this.f242308b);
    }
}

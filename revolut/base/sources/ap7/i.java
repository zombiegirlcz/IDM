package ap7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f8107b;

    public i(TextLocalisedClause buttonText, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f8106a = items;
        this.f8107b = buttonText;
    }

    @Override // jki.n
    public final List c() {
        return this.f8106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f8106a, iVar.f8106a) && this.f8107b.equals(iVar.f8107b);
    }

    public final int hashCode() {
        return this.f8107b.hashCode() + (this.f8106a.hashCode() * 31);
    }
}

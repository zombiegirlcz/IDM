package ved;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f288271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f288272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f288273c;
    public final Image d;
    public final List e;

    public i(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause textLocalisedClause, Image currencyImage, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(currencyImage, "currencyImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f288271a = title;
        this.f288272b = description;
        this.f288273c = textLocalisedClause;
        this.d = currencyImage;
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
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f288271a.equals(iVar.f288271a) && this.f288272b.equals(iVar.f288272b) && Intrinsics.f(this.f288273c, iVar.f288273c) && Intrinsics.f(this.d, iVar.d) && this.e.equals(iVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f288271a.hashCode() * 31, 31, this.f288272b);
        Clause clause = this.f288273c;
        return this.e.hashCode() + a10.b.c(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}

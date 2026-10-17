package py4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f240661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f240662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f240663c;
    public final ConfigurableResourceImage d;
    public final List e;

    public d(Clause toolbarTitle, TextClause textClause, int i, ConfigurableResourceImage toolbarEndImage, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarEndImage, "toolbarEndImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240661a = toolbarTitle;
        this.f240662b = textClause;
        this.f240663c = i;
        this.d = toolbarEndImage;
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
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f240661a.equals(dVar.f240661a) && Intrinsics.f(this.f240662b, dVar.f240662b) && this.f240663c == dVar.f240663c && this.d.equals(dVar.d) && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f240661a.hashCode() * 31;
        Clause clause = this.f240662b;
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f240663c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31)) * 31);
    }
}

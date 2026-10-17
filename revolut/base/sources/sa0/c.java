package sa0;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f261205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f261206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f261207c;
    public final Image d;
    public final List e;

    public c(Clause clause, Clause clause2, boolean z, Image image, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f261205a = clause;
        this.f261206b = clause2;
        this.f261207c = z;
        this.d = image;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261205a, cVar.f261205a) && Intrinsics.f(this.f261206b, cVar.f261206b) && this.f261207c == cVar.f261207c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f261205a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f261206b;
        int iC = j6.a.c((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f261207c);
        Image image = this.d;
        return this.e.hashCode() + ((iC + (image != null ? image.hashCode() : 0)) * 31);
    }
}

package hh6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f152263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152265c;
    public final Clause d;
    public final Image e;

    public l(ArrayList items, boolean z, boolean z3, TextClause textClause, Image image) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152263a = items;
        this.f152264b = z;
        this.f152265c = z3;
        this.d = textClause;
        this.e = image;
    }

    @Override // jki.n
    public final List c() {
        return this.f152263a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f152263a.equals(lVar.f152263a) && this.f152264b == lVar.f152264b && this.f152265c == lVar.f152265c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f152263a.hashCode() * 31, 31, this.f152264b), 31, this.f152265c);
        Clause clause = this.d;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.e;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }
}

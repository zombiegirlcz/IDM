package jn7;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f176654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f176655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f176656c;

    public g(aim.e items, TextClause title, LayeredImage titleImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        this.f176654a = items;
        this.f176655b = title;
        this.f176656c = titleImage;
    }

    @Override // jki.n
    public final List c() {
        return this.f176654a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f176654a, gVar.f176654a) && this.f176655b.equals(gVar.f176655b) && this.f176656c.equals(gVar.f176656c);
    }

    public final int hashCode() {
        return this.f176656c.hashCode() + v7.b(this.f176654a.hashCode() * 31, 31, this.f176655b);
    }
}

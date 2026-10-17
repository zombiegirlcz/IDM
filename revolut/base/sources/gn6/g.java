package gn6;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f144920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f144921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f144922c;
    public final Image d;
    public final Clause e;

    public g(ArrayList items, TextClause title, TextClause textClause, Image image, TextClause textClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f144920a = items;
        this.f144921b = title;
        this.f144922c = textClause;
        this.d = image;
        this.e = textClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f144920a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f144920a.equals(gVar.f144920a) && this.f144921b.equals(gVar.f144921b) && Intrinsics.f(this.f144922c, gVar.f144922c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f144920a.hashCode() * 31, 31, this.f144921b);
        Clause clause = this.f144922c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}

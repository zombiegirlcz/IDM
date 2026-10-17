package koe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f186307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f186308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f186309c;
    public final boolean d;

    public a0(TextClause title, Clause clause, LayeredImage layeredImage, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f186307a = title;
        this.f186308b = clause;
        this.f186309c = layeredImage;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f186307a.equals(a0Var.f186307a) && Intrinsics.f(this.f186308b, a0Var.f186308b) && Intrinsics.f(this.f186309c, a0Var.f186309c) && this.d == a0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f186307a.hashCode() * 31;
        Clause clause = this.f186308b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f186309c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }
}

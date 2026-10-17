package jzh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f179853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f179854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f179855c;
    public final TextLocalisedClause d;
    public final Image e;

    public t(Clause clause, Clause title, TextLocalisedClause description, Image endIconImage, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(endIconImage, "endIconImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f179853a = clause;
        this.f179854b = endIconImage;
        this.f179855c = title;
        this.d = description;
        this.e = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f179853a, tVar.f179853a) && this.f179854b.equals(tVar.f179854b) && this.f179855c.equals(tVar.f179855c) && this.d.equals(tVar.d) && Intrinsics.f(this.e, tVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f179853a;
        int iA = t61.a.a(p.a.b(a10.b.c(this.f179854b, (clause == null ? 0 : clause.hashCode()) * 31, 31), 31, this.f179855c), 31, this.d);
        Image image = this.e;
        return iA + (image != null ? image.hashCode() : 0);
    }
}

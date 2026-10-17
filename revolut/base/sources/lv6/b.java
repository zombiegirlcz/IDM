package lv6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;
import tx0.f3;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CdnImage f200318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f200319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f200320c;
    public final f3 d;

    public b(CdnImage image, TextLocalisedClause title, TextLocalisedClause subtitle, f3 f3Var) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f200318a = image;
        this.f200319b = title;
        this.f200320c = subtitle;
        this.d = f3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f200318a.equals(bVar.f200318a) && this.f200319b.equals(bVar.f200319b) && this.f200320c.equals(bVar.f200320c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(this.f200318a.hashCode() * 31, 31, this.f200319b), 31, this.f200320c);
        f3 f3Var = this.d;
        return iA + (f3Var == null ? 0 : f3Var.hashCode());
    }
}

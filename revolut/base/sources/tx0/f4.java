package tx0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.lifestyle.content_gateway.api.ui.HeaderSlotPayload;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f275125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f275126c;
    public final UrlImage d;
    public final HeaderSlotPayload e;

    public f4(String id10, TextClause textClause, TextClause textClause2, UrlImage urlImage, HeaderSlotPayload headerSlotPayload) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f275124a = id10;
        this.f275125b = textClause;
        this.f275126c = textClause2;
        this.d = urlImage;
        this.e = headerSlotPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.f275124a, f4Var.f275124a) && this.f275125b.equals(f4Var.f275125b) && this.f275126c.equals(f4Var.f275126c) && this.d.equals(f4Var.d) && this.e.equals(f4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.g(this.d, v7.b(v7.b(this.f275124a.hashCode() * 31, 31, this.f275125b), 31, this.f275126c), 31);
    }
}

package roe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f255985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f255986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f255987c;
    public final ArrayList d;
    public final TextLocalisedClause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f255988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f255989h;

    public l(TextLocalisedClause navBarTitle, Clause navBarSubtitle, Image image, ArrayList items, TextLocalisedClause textLocalisedClause, boolean z, TextLocalisedClause secondaryActionButtonText, boolean z3) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarSubtitle, "navBarSubtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(secondaryActionButtonText, "secondaryActionButtonText");
        this.f255985a = navBarTitle;
        this.f255986b = navBarSubtitle;
        this.f255987c = image;
        this.d = items;
        this.e = textLocalisedClause;
        this.f = z;
        this.f255988g = secondaryActionButtonText;
        this.f255989h = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f255985a.equals(lVar.f255985a) && this.f255986b.equals(lVar.f255986b) && Intrinsics.f(this.f255987c, lVar.f255987c) && this.d.equals(lVar.d) && this.e.equals(lVar.e) && this.f == lVar.f && this.f255988g.equals(lVar.f255988g) && this.f255989h == lVar.f255989h;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f255985a.hashCode() * 31, 31, this.f255986b);
        Image image = this.f255987c;
        return Boolean.hashCode(this.f255989h) + t61.a.a(j6.a.c(t61.a.a(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iB + (image == null ? 0 : image.hashCode())) * 31, 961), 31, this.e), 31, this.f), 31, this.f255988g);
    }
}

package aw0;

import aw0.i6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j6 extends i6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f10374c;
    public final Clause d;
    public final ResourceImage e;

    public j6(Clause searchPrimaryTextValue, ResourceImage searchSecondaryIcon, Clause datesValue, ResourceImage datesSecondaryIcon) {
        zhm.f0 searchHints = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(searchPrimaryTextValue, "searchPrimaryTextValue");
        Intrinsics.checkNotNullParameter(searchHints, "searchHints");
        Intrinsics.checkNotNullParameter(searchSecondaryIcon, "searchSecondaryIcon");
        Intrinsics.checkNotNullParameter(datesValue, "datesValue");
        Intrinsics.checkNotNullParameter(datesSecondaryIcon, "datesSecondaryIcon");
        this.f10372a = searchPrimaryTextValue;
        this.f10373b = searchHints;
        this.f10374c = searchSecondaryIcon;
        this.d = datesValue;
        this.e = datesSecondaryIcon;
    }

    @Override // aw0.i6.b
    public final Image a() {
        return this.e;
    }

    @Override // aw0.i6.b
    public final Clause b() {
        return this.d;
    }

    @Override // aw0.i6.b
    public final List c() {
        return this.f10373b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // aw0.i6.b
    public final Clause d() {
        return this.f10372a;
    }

    @Override // aw0.i6.b
    public final Image e() {
        return this.f10374c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj2;
        return this.f10372a.equals(j6Var.f10372a) && Intrinsics.f(this.f10373b, j6Var.f10373b) && this.f10374c.equals(j6Var.f10374c) && Intrinsics.f(this.d, j6Var.d) && this.e.equals(j6Var.e);
    }

    @Override // aw0.i6.b
    public final Clause f() {
        return null;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f10374c, p.a.d(this.f10372a.hashCode() * 31, 961, this.f10373b), 31), 31, this.d);
    }
}

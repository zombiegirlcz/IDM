package aw0;

import aw0.i6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k6 extends i6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aim.e f10394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f10395c;
    public final TimeRangeClause d;
    public final ResourceImage e;
    public final TextClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ResourceImage f10396g;

    public k6(Clause searchPrimaryTextValue, aim.e searchHints, ResourceImage searchSecondaryIcon, TimeRangeClause datesValue, ResourceImage datesSecondaryIcon, TextClause guestsText, ResourceImage guestsImage) {
        Intrinsics.checkNotNullParameter(searchPrimaryTextValue, "searchPrimaryTextValue");
        Intrinsics.checkNotNullParameter(searchHints, "searchHints");
        Intrinsics.checkNotNullParameter(searchSecondaryIcon, "searchSecondaryIcon");
        Intrinsics.checkNotNullParameter(datesValue, "datesValue");
        Intrinsics.checkNotNullParameter(datesSecondaryIcon, "datesSecondaryIcon");
        Intrinsics.checkNotNullParameter(guestsText, "guestsText");
        Intrinsics.checkNotNullParameter(guestsImage, "guestsImage");
        this.f10393a = searchPrimaryTextValue;
        this.f10394b = searchHints;
        this.f10395c = searchSecondaryIcon;
        this.d = datesValue;
        this.e = datesSecondaryIcon;
        this.f = guestsText;
        this.f10396g = guestsImage;
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
        return this.f10394b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // aw0.i6.b
    public final Clause d() {
        return this.f10393a;
    }

    @Override // aw0.i6.b
    public final Image e() {
        return this.f10395c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj2;
        return this.f10393a.equals(k6Var.f10393a) && Intrinsics.f(this.f10394b, k6Var.f10394b) && this.f10395c.equals(k6Var.f10395c) && this.d.equals(k6Var.d) && this.e.equals(k6Var.e) && this.f.equals(k6Var.f) && this.f10396g.equals(k6Var.f10396g);
    }

    @Override // aw0.i6.b
    public final Clause f() {
        return null;
    }

    public final int hashCode() {
        return this.f10396g.hashCode() + ip0.v7.b(org.bouncycastle.jcajce.provider.digest.a.b(this.e, (this.d.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f10395c, (this.f10394b.hashCode() + (this.f10393a.hashCode() * 31)) * 961, 31)) * 31, 31), 31, this.f);
    }
}

package aw0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n6 implements qv0.p {

    @NotNull
    public static final m6 Companion = new m6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f10434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f10435c;
    public final Clause d;
    public final NewBadgeContent e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f10437h;
    public final k3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10438j;
    public final Object k;

    public n6(Clause clause, LargeActionButton.ButtonStyle buttonStyle, Image image, Clause clause2, NewBadgeContent newBadgeContent, String str, boolean z, Parcelable parcelable, k3 k3Var, String str2, Object obj2) {
        this.f10433a = clause;
        this.f10434b = buttonStyle;
        this.f10435c = image;
        this.d = clause2;
        this.e = newBadgeContent;
        this.f = str;
        this.f10436g = z;
        this.f10437h = parcelable;
        this.i = k3Var;
        this.f10438j = str2;
        this.k = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj2;
        return Intrinsics.f(this.f10433a, n6Var.f10433a) && Intrinsics.f(this.f10434b, n6Var.f10434b) && Intrinsics.f(this.f10435c, n6Var.f10435c) && Intrinsics.f(this.d, n6Var.d) && Intrinsics.f(this.e, n6Var.e) && Intrinsics.f(this.f, n6Var.f) && this.f10436g == n6Var.f10436g && Intrinsics.f(this.f10437h, n6Var.f10437h) && Intrinsics.f(this.i, n6Var.i) && Intrinsics.f(this.f10438j, n6Var.f10438j) && Intrinsics.f(this.k, n6Var.k);
    }

    public final int hashCode() {
        Clause clause = this.f10433a;
        int iD = r6.b.d(this.f10434b, (clause == null ? 0 : clause.hashCode()) * 31, 31);
        Image image = this.f10435c;
        int iHashCode = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        NewBadgeContent newBadgeContent = this.e;
        int iC = j6.a.c(p.a.c((iHashCode2 + (newBadgeContent == null ? 0 : newBadgeContent.hashCode())) * 31, 31, this.f), 31, this.f10436g);
        Parcelable parcelable = this.f10437h;
        int iHashCode3 = (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        k3 k3Var = this.i;
        int iHashCode4 = (iHashCode3 + (k3Var == null ? 0 : k3Var.hashCode())) * 31;
        String str = this.f10438j;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.k;
        return iHashCode5 + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n6(Clause clause, LargeActionButton.ButtonStyle style, Image image, String str, boolean z, Parcelable parcelable, Object obj2, int i) {
        Image image2 = (i & 4) != 0 ? null : image;
        String tag2 = (i & 16) != 0 ? "" : str;
        boolean z3 = (i & 32) != 0 ? true : z;
        Parcelable parcelable2 = (i & 64) != 0 ? null : parcelable;
        String str2 = (i & 256) != 0 ? null : "cfd-withdraw-button-id";
        Object obj3 = (i & 512) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this(clause, style, image2, null, null, tag2, z3, parcelable2, null, str2, obj3);
    }
}

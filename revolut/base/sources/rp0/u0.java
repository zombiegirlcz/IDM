package rp0;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f256180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256182c;
    public final s0 d;
    public final Clause e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f256183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f256184h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f256185j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Parcelable f256186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Parcelable f256187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Image f256188n;
    public final Image o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f256189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f256190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f256191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f256192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f256193t;
    public final PromptContentDelegate.Model.BackgroundType u;
    public final PromptContentDelegate.Model.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f256194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f256195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Parcelable f256196y;

    public u0(Clause title, Clause description, Clause clause, s0 content, Clause clause2, ResourceImage resourceImage, Image image, q0 buttonsStyle, boolean z, Clause clause3, Clause clause4, Parcelable parcelable, Parcelable parcelable2, Image image2, Image image3, LargeActionButton.ButtonStyle primaryButtonStyle, LargeActionButton.ButtonStyle secondaryButtonStyle, String str, String str2, Object obj2, PromptContentDelegate.Model.BackgroundType backgroundType, PromptContentDelegate.Model.a aVar, String str3, String str4, Parcelable parcelable3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f256180a = title;
        this.f256181b = description;
        this.f256182c = clause;
        this.d = content;
        this.e = clause2;
        this.f = resourceImage;
        this.f256183g = image;
        this.f256184h = buttonsStyle;
        this.i = z;
        this.f256185j = clause3;
        this.k = clause4;
        this.f256186l = parcelable;
        this.f256187m = parcelable2;
        this.f256188n = image2;
        this.o = image3;
        this.f256189p = primaryButtonStyle;
        this.f256190q = secondaryButtonStyle;
        this.f256191r = str;
        this.f256192s = str2;
        this.f256193t = obj2;
        this.u = backgroundType;
        this.v = aVar;
        this.f256194w = str3;
        this.f256195x = str4;
        this.f256196y = parcelable3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f256180a, u0Var.f256180a) && Intrinsics.f(this.f256181b, u0Var.f256181b) && Intrinsics.f(this.f256182c, u0Var.f256182c) && Intrinsics.f(this.d, u0Var.d) && Intrinsics.f(this.e, u0Var.e) && Intrinsics.f(this.f, u0Var.f) && Intrinsics.f(this.f256183g, u0Var.f256183g) && this.f256184h == u0Var.f256184h && this.i == u0Var.i && Intrinsics.f(this.f256185j, u0Var.f256185j) && Intrinsics.f(this.k, u0Var.k) && Intrinsics.f(this.f256186l, u0Var.f256186l) && Intrinsics.f(this.f256187m, u0Var.f256187m) && Intrinsics.f(this.f256188n, u0Var.f256188n) && Intrinsics.f(this.o, u0Var.o) && Intrinsics.f(this.f256189p, u0Var.f256189p) && Intrinsics.f(this.f256190q, u0Var.f256190q) && Intrinsics.f(this.f256191r, u0Var.f256191r) && Intrinsics.f(this.f256192s, u0Var.f256192s) && Intrinsics.f(this.f256193t, u0Var.f256193t) && Intrinsics.f(this.u, u0Var.u) && Intrinsics.f(this.v, u0Var.v) && Intrinsics.f(this.f256194w, u0Var.f256194w) && Intrinsics.f(this.f256195x, u0Var.f256195x) && Intrinsics.f(this.f256196y, u0Var.f256196y);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f256180a.hashCode() * 31, 31, this.f256181b);
        Clause clause = this.f256182c;
        int iHashCode = (this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Clause clause2 = this.e;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        ResourceImage resourceImage = this.f;
        int iHashCode3 = (iHashCode2 + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31;
        Image image = this.f256183g;
        int iC = j6.a.c((this.f256184h.hashCode() + ((iHashCode3 + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.i);
        Clause clause3 = this.f256185j;
        int iHashCode4 = (iC + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.k;
        int iHashCode5 = (iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Parcelable parcelable = this.f256186l;
        int iHashCode6 = (iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Parcelable parcelable2 = this.f256187m;
        int iHashCode7 = (iHashCode6 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        Image image2 = this.f256188n;
        int iHashCode8 = (iHashCode7 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.o;
        int iD = r6.b.d(this.f256190q, r6.b.d(this.f256189p, (iHashCode8 + (image3 == null ? 0 : image3.hashCode())) * 31, 31), 31);
        String str = this.f256191r;
        int iHashCode9 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f256192s;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.f256193t;
        int iHashCode11 = (this.u.hashCode() + ((iHashCode10 + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31;
        PromptContentDelegate.Model.a aVar = this.v;
        int iHashCode12 = (iHashCode11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f256194w;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f256195x;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Parcelable parcelable3 = this.f256196y;
        return iHashCode14 + (parcelable3 != null ? parcelable3.hashCode() : 0);
    }

    public /* synthetic */ u0(Clause clause, Clause clause2, Clause clause3, s0 s0Var, Clause clause4, ResourceImage resourceImage, ResourceImage resourceImage2, q0 q0Var, Clause clause5, Clause clause6, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, Image image, Image image2, LargeActionButton.ButtonStyle buttonStyle, LargeActionButton.ButtonStyle buttonStyle2, Object obj2, PromptContentDelegate.Model.BackgroundType backgroundType, AnalyticsContext analyticsContext3, int i) {
        this(clause, clause2, (i & 4) != 0 ? null : clause3, s0Var, (i & 16) != 0 ? null : clause4, resourceImage, (i & 64) != 0 ? null : resourceImage2, (i & 128) != 0 ? q0.VERTICAL : q0Var, false, (i & 512) != 0 ? null : clause5, (i & 1024) != 0 ? null : clause6, (i & 2048) != 0 ? null : analyticsContext, (i & 4096) != 0 ? null : analyticsContext2, (i & 8192) != 0 ? null : image, (i & 16384) != 0 ? null : image2, (32768 & i) != 0 ? LargeActionButton.ButtonStyle.f58725a : buttonStyle, (65536 & i) != 0 ? LargeActionButton.ButtonStyle.f58726b : buttonStyle2, null, null, (524288 & i) != 0 ? null : obj2, (1048576 & i) != 0 ? PromptContentDelegate.Model.BackgroundType.Dialog.f53074a : backgroundType, null, null, null, (i & 16777216) != 0 ? null : analyticsContext3);
    }
}

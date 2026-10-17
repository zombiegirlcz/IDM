package com.revolut.feature.full_screen_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.kompot.common.IOData$Input;
import d67.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/full_screen_prompt/FullScreenPromptScreenContract$InputData$Legacy", "Ld67/g;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class FullScreenPromptScreenContract$InputData$Legacy implements g, IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FullScreenPromptScreenContract$InputData$Legacy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f74484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f74485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f74486c;
    public final Clause d;
    public final Media e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xc f74487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f74488h;
    public final LargeActionButton.ButtonStyle i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cd f74489j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f74490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Image f74491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Image f74492n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f74493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f74494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AnalyticsProduct f74495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AnalyticsProduct f74496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AnalyticsContext f74497t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f74498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PromptContentDelegate.Model.BackgroundType f74499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AnalyticsProduct f74500y;
    public final PromptContentDelegate.Model z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Media media = (Media) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            ResourceImage resourceImage = (ResourceImage) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            xc xcVarValueOf = xc.valueOf(parcel.readString());
            LargeActionButton.ButtonStyle buttonStyle = (LargeActionButton.ButtonStyle) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            LargeActionButton.ButtonStyle buttonStyle2 = (LargeActionButton.ButtonStyle) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            cd cdVarValueOf = cd.valueOf(parcel.readString());
            Clause clause5 = (Clause) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Clause clause6 = (Clause) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader());
            boolean z12 = z;
            String string = parcel.readString();
            boolean z29 = z3;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = z29;
            }
            return new FullScreenPromptScreenContract$InputData$Legacy(clause, clause2, clause3, clause4, media, resourceImage, xcVarValueOf, buttonStyle, buttonStyle2, cdVarValueOf, clause5, clause6, image, image2, z11, z4, z6, analyticsProduct, analyticsProduct2, analyticsContext, string, string2, z12, (PromptContentDelegate.Model.BackgroundType) parcel.readParcelable(FullScreenPromptScreenContract$InputData$Legacy.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullScreenPromptScreenContract$InputData$Legacy[i];
        }
    }

    public FullScreenPromptScreenContract$InputData$Legacy(Clause title, Clause description, Clause clause, Clause clause2, Media image, ResourceImage resourceImage, xc buttonsStyle, LargeActionButton.ButtonStyle primaryButtonStyle, LargeActionButton.ButtonStyle secondaryButtonStyle, cd descriptionStyle, Clause clause3, Clause clause4, Image image2, Image image3, boolean z, boolean z3, boolean z4, AnalyticsProduct analyticsProduct, AnalyticsProduct analyticsProduct2, AnalyticsContext analyticsContext, String str, String str2, boolean z6, PromptContentDelegate.Model.BackgroundType backgroundType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f74484a = title;
        this.f74485b = description;
        this.f74486c = clause;
        this.d = clause2;
        this.e = image;
        this.f = resourceImage;
        this.f74487g = buttonsStyle;
        this.f74488h = primaryButtonStyle;
        this.i = secondaryButtonStyle;
        this.f74489j = descriptionStyle;
        this.k = clause3;
        this.f74490l = clause4;
        this.f74491m = image2;
        this.f74492n = image3;
        this.o = z;
        this.f74493p = z3;
        this.f74494q = z4;
        this.f74495r = analyticsProduct;
        this.f74496s = analyticsProduct2;
        this.f74497t = analyticsContext;
        this.u = str;
        this.v = str2;
        this.f74498w = z6;
        this.f74499x = backgroundType;
        this.f74500y = analyticsProduct2;
        this.z = new PromptContentDelegate.Model("PromptId", title, description, clause, new ad(image, false), resourceImage, clause2, buttonsStyle, false, clause3, clause4, image2, image3, primaryButtonStyle, secondaryButtonStyle, descriptionStyle, false, str, false, str2, null, null, backgroundType, null, null, null, null, null, 531955968);
    }

    @Override // d67.g
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final PromptContentDelegate.Model getZ() {
        return this.z;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final boolean getF74493p() {
        return this.f74493p;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF74500y() {
        return this.f74500y;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF74497t() {
        return this.f74497t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FullScreenPromptScreenContract$InputData$Legacy)) {
            return false;
        }
        FullScreenPromptScreenContract$InputData$Legacy fullScreenPromptScreenContract$InputData$Legacy = (FullScreenPromptScreenContract$InputData$Legacy) obj2;
        return Intrinsics.f(this.f74484a, fullScreenPromptScreenContract$InputData$Legacy.f74484a) && Intrinsics.f(this.f74485b, fullScreenPromptScreenContract$InputData$Legacy.f74485b) && Intrinsics.f(this.f74486c, fullScreenPromptScreenContract$InputData$Legacy.f74486c) && Intrinsics.f(this.d, fullScreenPromptScreenContract$InputData$Legacy.d) && Intrinsics.f(this.e, fullScreenPromptScreenContract$InputData$Legacy.e) && Intrinsics.f(this.f, fullScreenPromptScreenContract$InputData$Legacy.f) && this.f74487g == fullScreenPromptScreenContract$InputData$Legacy.f74487g && Intrinsics.f(this.f74488h, fullScreenPromptScreenContract$InputData$Legacy.f74488h) && Intrinsics.f(this.i, fullScreenPromptScreenContract$InputData$Legacy.i) && this.f74489j == fullScreenPromptScreenContract$InputData$Legacy.f74489j && Intrinsics.f(this.k, fullScreenPromptScreenContract$InputData$Legacy.k) && Intrinsics.f(this.f74490l, fullScreenPromptScreenContract$InputData$Legacy.f74490l) && Intrinsics.f(this.f74491m, fullScreenPromptScreenContract$InputData$Legacy.f74491m) && Intrinsics.f(this.f74492n, fullScreenPromptScreenContract$InputData$Legacy.f74492n) && this.o == fullScreenPromptScreenContract$InputData$Legacy.o && this.f74493p == fullScreenPromptScreenContract$InputData$Legacy.f74493p && this.f74494q == fullScreenPromptScreenContract$InputData$Legacy.f74494q && Intrinsics.f(this.f74495r, fullScreenPromptScreenContract$InputData$Legacy.f74495r) && Intrinsics.f(this.f74496s, fullScreenPromptScreenContract$InputData$Legacy.f74496s) && Intrinsics.f(this.f74497t, fullScreenPromptScreenContract$InputData$Legacy.f74497t) && Intrinsics.f(this.u, fullScreenPromptScreenContract$InputData$Legacy.u) && Intrinsics.f(this.v, fullScreenPromptScreenContract$InputData$Legacy.v) && this.f74498w == fullScreenPromptScreenContract$InputData$Legacy.f74498w && Intrinsics.f(this.f74499x, fullScreenPromptScreenContract$InputData$Legacy.f74499x);
    }

    @Override // d67.g
    /* JADX INFO: renamed from: getFitStatusBar, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f74484a.hashCode() * 31, 31, this.f74485b);
        Clause clause = this.f74486c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31;
        ResourceImage resourceImage = this.f;
        int iHashCode3 = (this.f74489j.hashCode() + r6.b.d(this.i, r6.b.d(this.f74488h, (this.f74487g.hashCode() + ((iHashCode2 + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31)) * 31, 31), 31)) * 31;
        Clause clause3 = this.k;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f74490l;
        int iHashCode5 = (iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Image image = this.f74491m;
        int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f74492n;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode6 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.o), 31, this.f74493p), 31, this.f74494q);
        AnalyticsProduct analyticsProduct = this.f74495r;
        int iHashCode7 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsProduct analyticsProduct2 = this.f74496s;
        int iHashCode8 = (iHashCode7 + (analyticsProduct2 == null ? 0 : analyticsProduct2.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f74497t;
        int iA2 = (iHashCode8 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        String str = this.u;
        int iHashCode9 = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.v;
        return this.f74499x.hashCode() + j6.a.c((iHashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f74498w);
    }

    @Override // d67.g
    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getF74498w() {
        return this.f74498w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74484a, i);
        dest.writeParcelable(this.f74485b, i);
        dest.writeParcelable(this.f74486c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f74487g.name());
        dest.writeParcelable(this.f74488h, i);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f74489j.name());
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f74490l, i);
        dest.writeParcelable(this.f74491m, i);
        dest.writeParcelable(this.f74492n, i);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f74493p ? 1 : 0);
        dest.writeInt(this.f74494q ? 1 : 0);
        dest.writeParcelable(this.f74495r, i);
        dest.writeParcelable(this.f74496s, i);
        dest.writeParcelable(this.f74497t, i);
        dest.writeString(this.u);
        dest.writeString(this.v);
        dest.writeInt(this.f74498w ? 1 : 0);
        dest.writeParcelable(this.f74499x, i);
    }

    public /* synthetic */ FullScreenPromptScreenContract$InputData$Legacy(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Image image, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause3, int i) {
        this(textLocalisedClause, textLocalisedClause2, null, null, image, resourceImage, xc.VERTICAL, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, cd.PRIMARY, (i & 1024) != 0 ? null : textLocalisedClause3, null, null, null, false, false, false, null, null, null, null, null, false, PromptContentDelegate.Model.BackgroundType.Default.f53073a);
    }
}

package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sfe.f;
import sfe.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountWidgetAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductAccountWidgetAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductAccountWidgetAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f89539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f89540c;
    public final f d;
    public final Image e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f89542h;
    public final AnalyticsContext i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(ProductAccountWidgetAction.class.getClassLoader());
            g gVarValueOf = g.valueOf(parcel.readString());
            return new ProductAccountWidgetAction(128, (AnalyticsContext) parcel.readParcelable(ProductAccountWidgetAction.class.getClassLoader()), clause, (Image) parcel.readParcelable(ProductAccountWidgetAction.class.getClassLoader()), null, string, f.valueOf(parcel.readString()), gVarValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductAccountWidgetAction[i];
        }
    }

    public ProductAccountWidgetAction(AnalyticsContext analyticsContext, Clause label, Image image, Object obj2, String id10, f displayPriority, g style, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(displayPriority, "displayPriority");
        this.f89538a = id10;
        this.f89539b = label;
        this.f89540c = style;
        this.d = displayPriority;
        this.e = image;
        this.f = z;
        this.f89541g = z3;
        this.f89542h = obj2;
        this.i = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductAccountWidgetAction)) {
            return false;
        }
        ProductAccountWidgetAction productAccountWidgetAction = (ProductAccountWidgetAction) obj2;
        return Intrinsics.f(this.f89538a, productAccountWidgetAction.f89538a) && Intrinsics.f(this.f89539b, productAccountWidgetAction.f89539b) && this.f89540c == productAccountWidgetAction.f89540c && this.d == productAccountWidgetAction.d && Intrinsics.f(this.e, productAccountWidgetAction.e) && this.f == productAccountWidgetAction.f && this.f89541g == productAccountWidgetAction.f89541g && Intrinsics.f(this.f89542h, productAccountWidgetAction.f89542h) && Intrinsics.f(this.i, productAccountWidgetAction.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f89540c.hashCode() + p.a.a(this.f89538a.hashCode() * 31, 31, this.f89539b)) * 31)) * 31;
        Image image = this.e;
        int iC = j6.a.c(j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f), 31, this.f89541g);
        Object obj2 = this.f89542h;
        int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.i;
        return iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89538a);
        dest.writeParcelable(this.f89539b, i);
        dest.writeString(this.f89540c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f89541g ? 1 : 0);
        dest.writeParcelable(this.i, i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductAccountWidgetAction(int r12, com.revolut.analytics.tracking.v3.AnalyticsContext r13, com.revolut.core.ui_kit.models.Clause r14, com.revolut.core.ui_kit_core.displayers.image.Image r15, java.lang.Object r16, java.lang.String r17, sfe.f r18, sfe.g r19, boolean r20, boolean r21) {
        /*
            r11 = this;
            r0 = r12 & 4
            if (r0 == 0) goto L8
            sfe.g r0 = sfe.g.DEFAULT
            r8 = r0
            goto La
        L8:
            r8 = r19
        La:
            r0 = r12 & 8
            if (r0 == 0) goto L12
            sfe.f r0 = sfe.f.DEFAULT
            r7 = r0
            goto L14
        L12:
            r7 = r18
        L14:
            r0 = r12 & 16
            r1 = 0
            if (r0 == 0) goto L1b
            r4 = r1
            goto L1c
        L1b:
            r4 = r15
        L1c:
            r0 = r12 & 32
            if (r0 == 0) goto L23
            r0 = 0
            r9 = r0
            goto L25
        L23:
            r9 = r20
        L25:
            r0 = r12 & 64
            if (r0 == 0) goto L2c
            r0 = 1
            r10 = r0
            goto L2e
        L2c:
            r10 = r21
        L2e:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L34
            r5 = r1
            goto L36
        L34:
            r5 = r16
        L36:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L40
            r2 = r1
            r3 = r14
            r6 = r17
            r1 = r11
            goto L45
        L40:
            r2 = r13
            r1 = r11
            r3 = r14
            r6 = r17
        L45:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction.<init>(int, com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object, java.lang.String, sfe.f, sfe.g, boolean, boolean):void");
    }
}

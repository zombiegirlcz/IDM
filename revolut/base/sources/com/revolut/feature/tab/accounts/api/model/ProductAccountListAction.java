package com.revolut.feature.tab.accounts.api.model;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sfe.f;
import sfe.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountListAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductAccountListAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductAccountListAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f89511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f89512c;
    public final g d;
    public final f e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f89514h;
    public final AnalyticsContext i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new ProductAccountListAction(128, (AnalyticsContext) parcel.readParcelable(ProductAccountListAction.class.getClassLoader()), (Clause) parcel.readParcelable(ProductAccountListAction.class.getClassLoader()), (Image) parcel.readParcelable(ProductAccountListAction.class.getClassLoader()), null, string, f.valueOf(parcel.readString()), g.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductAccountListAction[i];
        }
    }

    public ProductAccountListAction(AnalyticsContext analyticsContext, Clause label, Image icon, Object obj2, String id10, f displayPriority, g style, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(displayPriority, "displayPriority");
        this.f89510a = id10;
        this.f89511b = label;
        this.f89512c = icon;
        this.d = style;
        this.e = displayPriority;
        this.f = z;
        this.f89513g = z3;
        this.f89514h = obj2;
        this.i = analyticsContext;
    }

    public static ProductAccountListAction a(ProductAccountListAction productAccountListAction, TextLocalisedClause textLocalisedClause, boolean z, Object obj2, int i) {
        String id10 = (i & 1) != 0 ? productAccountListAction.f89510a : "PENDING_STATEMENT_ACTION";
        Clause clause = textLocalisedClause;
        if ((i & 2) != 0) {
            clause = productAccountListAction.f89511b;
        }
        Clause label = clause;
        Image icon = productAccountListAction.f89512c;
        g style = productAccountListAction.d;
        f displayPriority = productAccountListAction.e;
        boolean z3 = productAccountListAction.f;
        if ((i & 64) != 0) {
            z = productAccountListAction.f89513g;
        }
        boolean z4 = z;
        if ((i & 128) != 0) {
            obj2 = productAccountListAction.f89514h;
        }
        AnalyticsContext analyticsContext = productAccountListAction.i;
        productAccountListAction.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(displayPriority, "displayPriority");
        return new ProductAccountListAction(analyticsContext, label, icon, obj2, id10, displayPriority, style, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductAccountListAction)) {
            return false;
        }
        ProductAccountListAction productAccountListAction = (ProductAccountListAction) obj2;
        return Intrinsics.f(this.f89510a, productAccountListAction.f89510a) && Intrinsics.f(this.f89511b, productAccountListAction.f89511b) && Intrinsics.f(this.f89512c, productAccountListAction.f89512c) && this.d == productAccountListAction.d && this.e == productAccountListAction.e && this.f == productAccountListAction.f && this.f89513g == productAccountListAction.f89513g && Intrinsics.f(this.f89514h, productAccountListAction.f89514h) && Intrinsics.f(this.i, productAccountListAction.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.e.hashCode() + ((this.d.hashCode() + b.c(this.f89512c, p.a.a(this.f89510a.hashCode() * 31, 31, this.f89511b), 31)) * 31)) * 31, 31, this.f), 31, this.f89513g);
        Object obj2 = this.f89514h;
        int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.i;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89510a);
        dest.writeParcelable(this.f89511b, i);
        dest.writeParcelable(this.f89512c, i);
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f89513g ? 1 : 0);
        dest.writeParcelable(this.i, i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductAccountListAction(int r12, com.revolut.analytics.tracking.v3.AnalyticsContext r13, com.revolut.core.ui_kit.models.Clause r14, com.revolut.core.ui_kit_core.displayers.image.Image r15, java.lang.Object r16, java.lang.String r17, sfe.f r18, sfe.g r19, boolean r20, boolean r21) {
        /*
            r11 = this;
            r0 = r12 & 8
            if (r0 == 0) goto L8
            sfe.g r0 = sfe.g.DEFAULT
            r8 = r0
            goto La
        L8:
            r8 = r19
        La:
            r0 = r12 & 16
            if (r0 == 0) goto L12
            sfe.f r0 = sfe.f.DEFAULT
            r7 = r0
            goto L14
        L12:
            r7 = r18
        L14:
            r0 = r12 & 32
            if (r0 == 0) goto L1b
            r0 = 0
            r9 = r0
            goto L1d
        L1b:
            r9 = r20
        L1d:
            r0 = r12 & 64
            if (r0 == 0) goto L24
            r0 = 1
            r10 = r0
            goto L26
        L24:
            r10 = r21
        L26:
            r0 = r12 & 128(0x80, float:1.8E-43)
            r1 = 0
            if (r0 == 0) goto L2d
            r5 = r1
            goto L2f
        L2d:
            r5 = r16
        L2f:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L3a
            r2 = r1
            r3 = r14
            r4 = r15
            r6 = r17
            r1 = r11
            goto L40
        L3a:
            r2 = r13
            r1 = r11
            r3 = r14
            r4 = r15
            r6 = r17
        L40:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.api.model.ProductAccountListAction.<init>(int, com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object, java.lang.String, sfe.f, sfe.g, boolean, boolean):void");
    }
}

package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.s0;
import tx0.t0;
import tx0.u0;
import tx0.v0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/LabelNavBarMenuItem;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "tx0/v0", "tx0/t0", "tx0/u0", "tx0/s0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LabelNavBarMenuItem extends NavBarMenuItem implements TrackableItem {

    @NotNull
    public static final Parcelable.Creator<LabelNavBarMenuItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f59242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f59243c;
    public final boolean d;
    public Parcelable e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0 f59244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f59245h;
    public final u0 i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LabelNavBarMenuItem(parcel.readString(), (Image) parcel.readParcelable(LabelNavBarMenuItem.class.getClassLoader()), (Clause) parcel.readParcelable(LabelNavBarMenuItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(LabelNavBarMenuItem.class.getClassLoader()), parcel.readInt() != 0, v0.valueOf(parcel.readString()), t0.valueOf(parcel.readString()), u0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LabelNavBarMenuItem[i];
        }
    }

    public LabelNavBarMenuItem(String listId, Image icon, Clause text, boolean z, Parcelable parcelable, boolean z3, v0 type, t0 state, u0 style) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59241a = listId;
        this.f59242b = icon;
        this.f59243c = text;
        this.d = z;
        this.e = parcelable;
        this.f = z3;
        this.f59244g = type;
        this.f59245h = state;
        this.i = style;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final t0 getF59245h() {
        return this.f59245h;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final u0 getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF59241a() {
        return this.f59241a;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final v0 getF59244g() {
        return this.f59244g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LabelNavBarMenuItem)) {
            return false;
        }
        LabelNavBarMenuItem labelNavBarMenuItem = (LabelNavBarMenuItem) obj2;
        return Intrinsics.f(this.f59241a, labelNavBarMenuItem.f59241a) && Intrinsics.f(this.f59242b, labelNavBarMenuItem.f59242b) && Intrinsics.f(this.f59243c, labelNavBarMenuItem.f59243c) && this.d == labelNavBarMenuItem.d && Intrinsics.f(this.e, labelNavBarMenuItem.e) && this.f == labelNavBarMenuItem.f && this.f59244g == labelNavBarMenuItem.f59244g && this.f59245h == labelNavBarMenuItem.f59245h && this.i == labelNavBarMenuItem.i;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final Image getF59242b() {
        return this.f59242b;
    }

    /* JADX INFO: renamed from: getText, reason: from getter */
    public final Clause getF59243c() {
        return this.f59243c;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(a10.b.c(this.f59242b, this.f59241a.hashCode() * 31, 31), 31, this.f59243c), 31, this.d);
        Parcelable parcelable = this.e;
        return this.i.hashCode() + ((this.f59245h.hashCode() + ((this.f59244g.hashCode() + j6.a.c((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f)) * 31)) * 31);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59241a);
        dest.writeParcelable(this.f59242b, i);
        dest.writeParcelable(this.f59243c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f59244g.name());
        dest.writeString(this.f59245h.name());
        dest.writeString(this.i.name());
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof LabelNavBarMenuItem ? (LabelNavBarMenuItem) oldItem : null) == null) {
            return null;
        }
        LabelNavBarMenuItem labelNavBarMenuItem = (LabelNavBarMenuItem) oldItem;
        boolean z3 = !Intrinsics.f(labelNavBarMenuItem.f59242b, this.f59242b);
        boolean z4 = !Intrinsics.f(labelNavBarMenuItem.f59243c, this.f59243c);
        boolean z6 = false;
        boolean z11 = labelNavBarMenuItem.d != this.d;
        if (labelNavBarMenuItem.f != this.f) {
            z = false;
            z6 = true;
        } else {
            z = false;
        }
        return new s0(z3, z4, z11, z6, labelNavBarMenuItem.f59244g != this.f59244g ? true : z, labelNavBarMenuItem.f59245h != this.f59245h ? true : z, labelNavBarMenuItem.i != this.i ? true : z);
    }

    public /* synthetic */ LabelNavBarMenuItem(String str, Image image, Clause clause, AnalyticsContext analyticsContext, v0 v0Var, int i) {
        this(str, image, clause, false, (i & 16) != 0 ? null : analyticsContext, (i & 32) == 0, (i & 64) != 0 ? v0.ICON : v0Var, t0.ENABLED, u0.PRIMARY_ACCENT);
    }
}

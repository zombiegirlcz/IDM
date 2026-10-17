package com.revolut.feature.wealth.models.robo;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xdh.c;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/robo/RoboPortfolioInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoboPortfolioInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RoboPortfolioInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f95701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f95702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95703c;
    public final String d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f95704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xdh.b f95705h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RoboPortfolioInfo(parcel.readInt() == 0 ? null : Template.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Template.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), c.valueOf(parcel.readString()), xdh.b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RoboPortfolioInfo[i];
        }
    }

    public RoboPortfolioInfo(Template template, Template template2, String portfolioId, String str, String str2, b baseCurrency, c state, xdh.b rebalanceStatus, boolean z) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        this.f95701a = template;
        this.f95702b = template2;
        this.f95703c = portfolioId;
        this.d = str;
        this.e = str2;
        this.f = baseCurrency;
        this.f95704g = state;
        this.f95705h = rebalanceStatus;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RoboPortfolioInfo)) {
            return false;
        }
        RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) obj2;
        return Intrinsics.f(this.f95701a, roboPortfolioInfo.f95701a) && Intrinsics.f(this.f95702b, roboPortfolioInfo.f95702b) && Intrinsics.f(this.f95703c, roboPortfolioInfo.f95703c) && Intrinsics.f(this.d, roboPortfolioInfo.d) && Intrinsics.f(this.e, roboPortfolioInfo.e) && Intrinsics.f(this.f, roboPortfolioInfo.f) && this.f95704g == roboPortfolioInfo.f95704g && this.f95705h == roboPortfolioInfo.f95705h && this.i == roboPortfolioInfo.i;
    }

    public final int hashCode() {
        Template template = this.f95701a;
        int iHashCode = (template == null ? 0 : template.hashCode()) * 31;
        Template template2 = this.f95702b;
        int iC = p.a.c((iHashCode + (template2 == null ? 0 : template2.hashCode())) * 31, 31, this.f95703c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.i) + ((this.f95705h.hashCode() + ((this.f95704g.hashCode() + l.j(this.f, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Template template = this.f95701a;
        if (template == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            template.writeToParcel(dest, i);
        }
        Template template2 = this.f95702b;
        if (template2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            template2.writeToParcel(dest, i);
        }
        dest.writeString(this.f95703c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f95704g.name());
        dest.writeString(this.f95705h.name());
        dest.writeInt(this.i ? 1 : 0);
    }
}

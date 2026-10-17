package com.revolut.feature.trading.managed_portfolios.impl.domain.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroPieChartItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TemplateIntroPieChartItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TemplateIntroPieChartItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f91252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91253c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TemplateIntroPieChartItem(parcel.readString(), parcel.readDouble(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateIntroPieChartItem[i];
        }
    }

    public TemplateIntroPieChartItem(String title, double d, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f91251a = title;
        this.f91252b = d;
        this.f91253c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TemplateIntroPieChartItem)) {
            return false;
        }
        TemplateIntroPieChartItem templateIntroPieChartItem = (TemplateIntroPieChartItem) obj2;
        return Intrinsics.f(this.f91251a, templateIntroPieChartItem.f91251a) && Double.compare(this.f91252b, templateIntroPieChartItem.f91252b) == 0 && this.f91253c == templateIntroPieChartItem.f91253c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91253c) + b.c(this.f91251a.hashCode() * 31, this.f91252b, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91251a);
        dest.writeDouble(this.f91252b);
        dest.writeInt(this.f91253c ? 1 : 0);
    }
}

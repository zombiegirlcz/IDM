package com.revolut.feature.trading.managed_portfolios.impl.domain.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TemplateIntroItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TemplateIntroItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91250c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TemplateIntroItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateIntroItem[i];
        }
    }

    public TemplateIntroItem(String title, String iconName, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.f91248a = title;
        this.f91249b = iconName;
        this.f91250c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TemplateIntroItem)) {
            return false;
        }
        TemplateIntroItem templateIntroItem = (TemplateIntroItem) obj2;
        return Intrinsics.f(this.f91248a, templateIntroItem.f91248a) && Intrinsics.f(this.f91249b, templateIntroItem.f91249b) && Intrinsics.f(this.f91250c, templateIntroItem.f91250c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91248a.hashCode() * 31, 31, this.f91249b);
        String str = this.f91250c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91248a);
        dest.writeString(this.f91249b);
        dest.writeString(this.f91250c);
    }
}

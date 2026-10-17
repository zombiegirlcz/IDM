package com.revolut.feature.credit.application.models.credit_health;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthPopupConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditHealthPopupConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditHealthPopupConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditHealthButton f66241c;
    public final CreditHealthButton d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<CreditHealthButton> creator = CreditHealthButton.CREATOR;
            return new CreditHealthPopupConfig(string, string2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditHealthPopupConfig[i];
        }
    }

    public CreditHealthPopupConfig(String title, String str, CreditHealthButton primaryButton, CreditHealthButton creditHealthButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f66239a = title;
        this.f66240b = str;
        this.f66241c = primaryButton;
        this.d = creditHealthButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditHealthPopupConfig)) {
            return false;
        }
        CreditHealthPopupConfig creditHealthPopupConfig = (CreditHealthPopupConfig) obj2;
        return Intrinsics.f(this.f66239a, creditHealthPopupConfig.f66239a) && Intrinsics.f(this.f66240b, creditHealthPopupConfig.f66240b) && Intrinsics.f(this.f66241c, creditHealthPopupConfig.f66241c) && Intrinsics.f(this.d, creditHealthPopupConfig.d);
    }

    public final int hashCode() {
        int iHashCode = this.f66239a.hashCode() * 31;
        String str = this.f66240b;
        int iHashCode2 = (this.f66241c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CreditHealthButton creditHealthButton = this.d;
        return iHashCode2 + (creditHealthButton != null ? creditHealthButton.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66239a);
        dest.writeString(this.f66240b);
        this.f66241c.writeToParcel(dest, i);
        CreditHealthButton creditHealthButton = this.d;
        if (creditHealthButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditHealthButton.writeToParcel(dest, i);
        }
    }
}

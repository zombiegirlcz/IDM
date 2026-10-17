package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/model/CrossBorderCountryDepartmentUiModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Outage", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrossBorderCountryDepartmentUiModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CrossBorderCountryDepartmentUiModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72903c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CrossBorderInstitutionPaymentInfoUiModel f72904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Outage f72905h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/model/CrossBorderCountryDepartmentUiModel$Outage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Outage implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Outage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72908c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Outage(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Outage[i];
            }
        }

        public Outage(String title, String message, String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.f72906a = title;
            this.f72907b = message;
            this.f72908c = summary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Outage)) {
                return false;
            }
            Outage outage = (Outage) obj2;
            return Intrinsics.f(this.f72906a, outage.f72906a) && Intrinsics.f(this.f72907b, outage.f72907b) && Intrinsics.f(this.f72908c, outage.f72908c);
        }

        public final int hashCode() {
            return this.f72908c.hashCode() + p.a.c(this.f72906a.hashCode() * 31, 31, this.f72907b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72906a);
            dest.writeString(this.f72907b);
            dest.writeString(this.f72908c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z4 = false;
            boolean z6 = true;
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
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new CrossBorderCountryDepartmentUiModel(string, string2, string3, z4, z6, z3, parcel.readInt() == 0 ? null : CrossBorderInstitutionPaymentInfoUiModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CrossBorderCountryDepartmentUiModel[i];
        }
    }

    public CrossBorderCountryDepartmentUiModel(String id10, String countryCode, String name, boolean z, boolean z3, boolean z4, CrossBorderInstitutionPaymentInfoUiModel crossBorderInstitutionPaymentInfoUiModel, Outage outage) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f72901a = id10;
        this.f72902b = countryCode;
        this.f72903c = name;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f72904g = crossBorderInstitutionPaymentInfoUiModel;
        this.f72905h = outage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CrossBorderCountryDepartmentUiModel)) {
            return false;
        }
        CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModel = (CrossBorderCountryDepartmentUiModel) obj2;
        return Intrinsics.f(this.f72901a, crossBorderCountryDepartmentUiModel.f72901a) && Intrinsics.f(this.f72902b, crossBorderCountryDepartmentUiModel.f72902b) && Intrinsics.f(this.f72903c, crossBorderCountryDepartmentUiModel.f72903c) && this.d == crossBorderCountryDepartmentUiModel.d && this.e == crossBorderCountryDepartmentUiModel.e && this.f == crossBorderCountryDepartmentUiModel.f && Intrinsics.f(this.f72904g, crossBorderCountryDepartmentUiModel.f72904g) && Intrinsics.f(this.f72905h, crossBorderCountryDepartmentUiModel.f72905h);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(this.f72901a.hashCode() * 31, 31, this.f72902b), 31, this.f72903c), 31, this.d), 31, this.e), 31, this.f);
        CrossBorderInstitutionPaymentInfoUiModel crossBorderInstitutionPaymentInfoUiModel = this.f72904g;
        int iHashCode = (iC + (crossBorderInstitutionPaymentInfoUiModel == null ? 0 : crossBorderInstitutionPaymentInfoUiModel.hashCode())) * 31;
        Outage outage = this.f72905h;
        return iHashCode + (outage != null ? outage.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72901a);
        dest.writeString(this.f72902b);
        dest.writeString(this.f72903c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        CrossBorderInstitutionPaymentInfoUiModel crossBorderInstitutionPaymentInfoUiModel = this.f72904g;
        if (crossBorderInstitutionPaymentInfoUiModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            crossBorderInstitutionPaymentInfoUiModel.writeToParcel(dest, i);
        }
        Outage outage = this.f72905h;
        if (outage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            outage.writeToParcel(dest, i);
        }
    }
}

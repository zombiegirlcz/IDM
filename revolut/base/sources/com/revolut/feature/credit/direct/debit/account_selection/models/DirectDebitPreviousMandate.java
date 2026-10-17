package com.revolut.feature.credit.direct.debit.account_selection.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_selection/models/DirectDebitPreviousMandate;", "Lcom/revolut/feature/credit/direct/debit/account_selection/models/PocketInfo;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitPreviousMandate implements PocketInfo {

    @NotNull
    public static final Parcelable.Creator<DirectDebitPreviousMandate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69896c;
    public final b d;
    public final String e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f69897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f69898h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitPreviousMandate(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString(), (Image) parcel.readParcelable(DirectDebitPreviousMandate.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitPreviousMandate[i];
        }
    }

    public DirectDebitPreviousMandate(String institutionName, String repaymentSourceId, d dVar, b bVar, String pocketName, Image image, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(repaymentSourceId, "repaymentSourceId");
        Intrinsics.checkNotNullParameter(pocketName, "pocketName");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f69894a = institutionName;
        this.f69895b = repaymentSourceId;
        this.f69896c = dVar;
        this.d = bVar;
        this.e = pocketName;
        this.f = image;
        this.f69897g = str;
        this.f69898h = str2;
        this.i = str3;
    }

    @Override // com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo
    /* JADX INFO: renamed from: D6, reason: from getter */
    public final String getF69897g() {
        return this.f69897g;
    }

    @Override // com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo
    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getF69898h() {
        return this.f69898h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitPreviousMandate)) {
            return false;
        }
        DirectDebitPreviousMandate directDebitPreviousMandate = (DirectDebitPreviousMandate) obj2;
        return Intrinsics.f(this.f69894a, directDebitPreviousMandate.f69894a) && Intrinsics.f(this.f69895b, directDebitPreviousMandate.f69895b) && Intrinsics.f(this.f69896c, directDebitPreviousMandate.f69896c) && Intrinsics.f(this.d, directDebitPreviousMandate.d) && Intrinsics.f(this.e, directDebitPreviousMandate.e) && Intrinsics.f(this.f, directDebitPreviousMandate.f) && Intrinsics.f(this.f69897g, directDebitPreviousMandate.f69897g) && Intrinsics.f(this.f69898h, directDebitPreviousMandate.f69898h) && Intrinsics.f(this.i, directDebitPreviousMandate.i);
    }

    @Override // com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo
    /* JADX INFO: renamed from: getUserName, reason: from getter */
    public final String getI() {
        return this.i;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f69894a.hashCode() * 31, 31, this.f69895b);
        d dVar = this.f69896c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.d;
        int iC2 = a10.b.c(this.f, p.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31);
        String str = this.f69897g;
        int iHashCode2 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69898h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69894a);
        dest.writeString(this.f69895b);
        dest.writeSerializable(this.f69896c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f69897g);
        dest.writeString(this.f69898h);
        dest.writeString(this.i);
    }
}

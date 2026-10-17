package com.revolut.feature.credit.direct.debit.account_selection.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import h30.l;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_selection/models/LinkedPocketInfo;", "Lcom/revolut/feature/credit/direct/debit/account_selection/models/PocketInfo;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedPocketInfo implements PocketInfo {

    @NotNull
    public static final Parcelable.Creator<LinkedPocketInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f69901c;
    public final String d;
    public final Image e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f69902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f69903h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedPocketInfo(parcel.readString(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString(), (Image) parcel.readParcelable(LinkedPocketInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedPocketInfo[i];
        }
    }

    public LinkedPocketInfo(String institutionName, d pocket, b currency, String pocketName, Image image, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketName, "pocketName");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f69899a = institutionName;
        this.f69900b = pocket;
        this.f69901c = currency;
        this.d = pocketName;
        this.e = image;
        this.f = str;
        this.f69902g = str2;
        this.f69903h = str3;
    }

    @Override // com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo
    /* JADX INFO: renamed from: D6, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo
    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getF69907g() {
        return this.f69902g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedPocketInfo)) {
            return false;
        }
        LinkedPocketInfo linkedPocketInfo = (LinkedPocketInfo) obj2;
        return Intrinsics.f(this.f69899a, linkedPocketInfo.f69899a) && Intrinsics.f(this.f69900b, linkedPocketInfo.f69900b) && Intrinsics.f(this.f69901c, linkedPocketInfo.f69901c) && Intrinsics.f(this.d, linkedPocketInfo.d) && Intrinsics.f(this.e, linkedPocketInfo.e) && Intrinsics.f(this.f, linkedPocketInfo.f) && Intrinsics.f(this.f69902g, linkedPocketInfo.f69902g) && Intrinsics.f(this.f69903h, linkedPocketInfo.f69903h);
    }

    @Override // com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo
    /* JADX INFO: renamed from: getUserName, reason: from getter */
    public final String getF69908h() {
        return this.f69903h;
    }

    public final int hashCode() {
        int iC = a10.b.c(this.e, p.a.c(l.j(this.f69901c, l.g(this.f69900b, this.f69899a.hashCode() * 31, 31), 31), 31, this.d), 31);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69902g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69903h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69899a);
        dest.writeSerializable(this.f69900b);
        dest.writeSerializable(this.f69901c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f69902g);
        dest.writeString(this.f69903h);
    }
}

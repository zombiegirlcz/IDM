package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteStepInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteStepInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InviteStepInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81726c;
    public final List d;
    public final String e;
    public final AdditionalInfo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f81727g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EligibilityCriteria.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new InviteStepInfo(eVarValueOf, string, string2, arrayList, parcel.readString(), parcel.readInt() != 0 ? AdditionalInfo.CREATOR.createFromParcel(parcel) : null, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteStepInfo[i];
        }
    }

    public InviteStepInfo(e status, String title, String str, ArrayList arrayList, String str2, AdditionalInfo additionalInfo, d dVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f81724a = status;
        this.f81725b = title;
        this.f81726c = str;
        this.d = arrayList;
        this.e = str2;
        this.f = additionalInfo;
        this.f81727g = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteStepInfo)) {
            return false;
        }
        InviteStepInfo inviteStepInfo = (InviteStepInfo) obj2;
        return this.f81724a == inviteStepInfo.f81724a && Intrinsics.f(this.f81725b, inviteStepInfo.f81725b) && Intrinsics.f(this.f81726c, inviteStepInfo.f81726c) && Intrinsics.f(this.d, inviteStepInfo.d) && Intrinsics.f(this.e, inviteStepInfo.e) && Intrinsics.f(this.f, inviteStepInfo.f) && Intrinsics.f(this.f81727g, inviteStepInfo.f81727g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f81724a.hashCode() * 31, 31, this.f81725b);
        String str = this.f81726c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdditionalInfo additionalInfo = this.f;
        int iHashCode4 = (iHashCode3 + (additionalInfo == null ? 0 : additionalInfo.hashCode())) * 31;
        d dVar = this.f81727g;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81724a.name());
        dest.writeString(this.f81725b);
        dest.writeString(this.f81726c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((EligibilityCriteria) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.e);
        AdditionalInfo additionalInfo = this.f;
        if (additionalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalInfo.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f81727g);
    }
}

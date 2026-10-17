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
import pwa.p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Step implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f81776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81778c;
    public final List d;
    public final AdditionalInfo e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81779g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            p pVarValueOf = p.valueOf(parcel.readString());
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
            return new Step(pVarValueOf, string, string2, arrayList, parcel.readInt() != 0 ? AdditionalInfo.CREATOR.createFromParcel(parcel) : null, (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Step[i];
        }
    }

    public Step(p code, String str, String title, ArrayList arrayList, AdditionalInfo additionalInfo, d dVar, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f81776a = code;
        this.f81777b = str;
        this.f81778c = title;
        this.d = arrayList;
        this.e = additionalInfo;
        this.f = dVar;
        this.f81779g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Step)) {
            return false;
        }
        Step step = (Step) obj2;
        return this.f81776a == step.f81776a && Intrinsics.f(this.f81777b, step.f81777b) && Intrinsics.f(this.f81778c, step.f81778c) && Intrinsics.f(this.d, step.d) && Intrinsics.f(this.e, step.e) && Intrinsics.f(this.f, step.f) && Intrinsics.f(this.f81779g, step.f81779g);
    }

    public final int hashCode() {
        int iHashCode = this.f81776a.hashCode() * 31;
        String str = this.f81777b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f81778c);
        List list = this.d;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        AdditionalInfo additionalInfo = this.e;
        int iHashCode3 = (iHashCode2 + (additionalInfo == null ? 0 : additionalInfo.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f81779g;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81776a.name());
        dest.writeString(this.f81777b);
        dest.writeString(this.f81778c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((EligibilityCriteria) itQ.next()).writeToParcel(dest, i);
            }
        }
        AdditionalInfo additionalInfo = this.e;
        if (additionalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalInfo.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f);
        dest.writeString(this.f81779g);
    }
}

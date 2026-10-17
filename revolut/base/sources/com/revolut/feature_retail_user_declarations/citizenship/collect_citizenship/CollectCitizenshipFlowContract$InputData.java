package com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/citizenship/collect_citizenship/CollectCitizenshipFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectCitizenshipFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CollectCitizenshipFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f97512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f97513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f97514c;
    public final boolean d;
    public final rbl.a e;
    public final rbl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f97516h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f97517j;
    public final AnalyticsProduct k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectCitizenshipFlowContract$InputData((wi0.b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (Clause) parcel.readParcelable(CollectCitizenshipFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : rbl.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? rbl.a.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0, (Clause) parcel.readParcelable(CollectCitizenshipFlowContract$InputData.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(CollectCitizenshipFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectCitizenshipFlowContract$InputData[i];
        }
    }

    public CollectCitizenshipFlowContract$InputData(wi0.b suggestedCitizenship, wi0.b bVar, Clause clause, boolean z, rbl.a aVar, rbl.a aVar2, String str, boolean z3, Clause clause2, String str2, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97512a = suggestedCitizenship;
        this.f97513b = bVar;
        this.f97514c = clause;
        this.d = z;
        this.e = aVar;
        this.f = aVar2;
        this.f97515g = str;
        this.f97516h = z3;
        this.i = clause2;
        this.f97517j = str2;
        this.k = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectCitizenshipFlowContract$InputData)) {
            return false;
        }
        CollectCitizenshipFlowContract$InputData collectCitizenshipFlowContract$InputData = (CollectCitizenshipFlowContract$InputData) obj2;
        return Intrinsics.f(this.f97512a, collectCitizenshipFlowContract$InputData.f97512a) && Intrinsics.f(this.f97513b, collectCitizenshipFlowContract$InputData.f97513b) && Intrinsics.f(this.f97514c, collectCitizenshipFlowContract$InputData.f97514c) && this.d == collectCitizenshipFlowContract$InputData.d && this.e == collectCitizenshipFlowContract$InputData.e && this.f == collectCitizenshipFlowContract$InputData.f && Intrinsics.f(this.f97515g, collectCitizenshipFlowContract$InputData.f97515g) && this.f97516h == collectCitizenshipFlowContract$InputData.f97516h && Intrinsics.f(this.i, collectCitizenshipFlowContract$InputData.i) && Intrinsics.f(this.f97517j, collectCitizenshipFlowContract$InputData.f97517j) && Intrinsics.f(this.k, collectCitizenshipFlowContract$InputData.k);
    }

    public final int hashCode() {
        int iHashCode = this.f97512a.f297794a.hashCode() * 31;
        wi0.b bVar = this.f97513b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        Clause clause = this.f97514c;
        int iC = j6.a.c((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        rbl.a aVar = this.e;
        int iHashCode3 = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        rbl.a aVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f97515g;
        int iC2 = j6.a.c((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f97516h);
        Clause clause2 = this.i;
        int iHashCode5 = (iC2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        String str2 = this.f97517j;
        return this.k.hashCode() + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97512a);
        dest.writeSerializable(this.f97513b);
        dest.writeParcelable(this.f97514c, i);
        dest.writeInt(this.d ? 1 : 0);
        rbl.a aVar = this.e;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        rbl.a aVar2 = this.f;
        if (aVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar2.name());
        }
        dest.writeString(this.f97515g);
        dest.writeInt(this.f97516h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f97517j);
        dest.writeParcelable(this.k, i);
    }
}

package com.revolut.feature_retail_user_declarations.citizenship;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFlowInputData;", "Landroid/os/Parcelable;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmitCitizenshipFlowInputData implements Parcelable, IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubmitCitizenshipFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f97499c;
    public final b d;
    public final Clause e;
    public final rbl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rbl.a f97500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f97501h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f97502j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnalyticsProduct f97503l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
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
            b bVar = (b) parcel.readSerializable();
            b bVar2 = (b) parcel.readSerializable();
            Clause clause = (Clause) parcel.readParcelable(SubmitCitizenshipFlowInputData.class.getClassLoader());
            rbl.a aVarValueOf = parcel.readInt() == 0 ? null : rbl.a.valueOf(parcel.readString());
            rbl.a aVarValueOf2 = parcel.readInt() != 0 ? rbl.a.valueOf(parcel.readString()) : null;
            rbl.a aVar = aVarValueOf;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new SubmitCitizenshipFlowInputData(z4, z6, bVar, bVar2, clause, aVar, aVarValueOf2, string, z, (Clause) parcel.readParcelable(SubmitCitizenshipFlowInputData.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(SubmitCitizenshipFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmitCitizenshipFlowInputData[i];
        }
    }

    public SubmitCitizenshipFlowInputData(boolean z, boolean z3, b suggestedCitizenship, b bVar, Clause clause, rbl.a aVar, rbl.a aVar2, String str, boolean z4, Clause clause2, String str2, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97497a = z;
        this.f97498b = z3;
        this.f97499c = suggestedCitizenship;
        this.d = bVar;
        this.e = clause;
        this.f = aVar;
        this.f97500g = aVar2;
        this.f97501h = str;
        this.i = z4;
        this.f97502j = clause2;
        this.k = str2;
        this.f97503l = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmitCitizenshipFlowInputData)) {
            return false;
        }
        SubmitCitizenshipFlowInputData submitCitizenshipFlowInputData = (SubmitCitizenshipFlowInputData) obj2;
        return this.f97497a == submitCitizenshipFlowInputData.f97497a && this.f97498b == submitCitizenshipFlowInputData.f97498b && Intrinsics.f(this.f97499c, submitCitizenshipFlowInputData.f97499c) && Intrinsics.f(this.d, submitCitizenshipFlowInputData.d) && Intrinsics.f(this.e, submitCitizenshipFlowInputData.e) && this.f == submitCitizenshipFlowInputData.f && this.f97500g == submitCitizenshipFlowInputData.f97500g && Intrinsics.f(this.f97501h, submitCitizenshipFlowInputData.f97501h) && this.i == submitCitizenshipFlowInputData.i && Intrinsics.f(this.f97502j, submitCitizenshipFlowInputData.f97502j) && Intrinsics.f(this.k, submitCitizenshipFlowInputData.k) && Intrinsics.f(this.f97503l, submitCitizenshipFlowInputData.f97503l);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(Boolean.hashCode(this.f97497a) * 31, 31, this.f97498b), 31, this.f97499c.f297794a);
        b bVar = this.d;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        Clause clause = this.e;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        rbl.a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        rbl.a aVar2 = this.f97500g;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f97501h;
        int iC2 = j6.a.c((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        Clause clause2 = this.f97502j;
        int iHashCode5 = (iC2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        String str2 = this.k;
        return this.f97503l.hashCode() + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f97497a ? 1 : 0);
        dest.writeInt(this.f97498b ? 1 : 0);
        dest.writeSerializable(this.f97499c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        rbl.a aVar = this.f;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        rbl.a aVar2 = this.f97500g;
        if (aVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar2.name());
        }
        dest.writeString(this.f97501h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f97502j, i);
        dest.writeString(this.k);
        dest.writeParcelable(this.f97503l, i);
    }

    public /* synthetic */ SubmitCitizenshipFlowInputData(boolean z, boolean z3, b bVar, b bVar2, rbl.a aVar, rbl.a aVar2, String str, TextLocalisedClause textLocalisedClause, String str2, AnalyticsProduct analyticsProduct, int i) {
        this((i & 1) != 0 ? false : z, z3, bVar, bVar2, null, (i & 32) != 0 ? null : aVar, (i & 64) != 0 ? rbl.a.BACK : aVar2, (i & 128) != 0 ? null : str, false, textLocalisedClause, (i & 1024) != 0 ? null : str2, analyticsProduct);
    }
}

package com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/citizenship/citizenship_prompt/NationalityPromptScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalityPromptScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NationalityPromptScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f97510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rbl.a f97511c;
    public final AnalyticsProduct d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NationalityPromptScreenContract$InputData((b) parcel.readSerializable(), (Clause) parcel.readParcelable(NationalityPromptScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : rbl.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(NationalityPromptScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NationalityPromptScreenContract$InputData[i];
        }
    }

    public NationalityPromptScreenContract$InputData(b suggestedCitizenship, Clause clause, rbl.a aVar, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97509a = suggestedCitizenship;
        this.f97510b = clause;
        this.f97511c = aVar;
        this.d = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NationalityPromptScreenContract$InputData)) {
            return false;
        }
        NationalityPromptScreenContract$InputData nationalityPromptScreenContract$InputData = (NationalityPromptScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97509a, nationalityPromptScreenContract$InputData.f97509a) && Intrinsics.f(this.f97510b, nationalityPromptScreenContract$InputData.f97510b) && this.f97511c == nationalityPromptScreenContract$InputData.f97511c && Intrinsics.f(this.d, nationalityPromptScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f97509a.f297794a.hashCode() * 31;
        Clause clause = this.f97510b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        rbl.a aVar = this.f97511c;
        return this.d.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97509a);
        dest.writeParcelable(this.f97510b, i);
        rbl.a aVar = this.f97511c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.d, i);
    }
}

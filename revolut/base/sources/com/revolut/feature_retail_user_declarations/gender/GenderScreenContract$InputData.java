package com.revolut.feature_retail_user_declarations.gender;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/gender/GenderScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GenderScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GenderScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rbl.a f97651c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GenderScreenContract$InputData((b) parcel.readSerializable(), parcel.readInt() != 0, rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GenderScreenContract$InputData[i];
        }
    }

    public GenderScreenContract$InputData(b countryCode, boolean z, rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f97649a = countryCode;
        this.f97650b = z;
        this.f97651c = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GenderScreenContract$InputData)) {
            return false;
        }
        GenderScreenContract$InputData genderScreenContract$InputData = (GenderScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97649a, genderScreenContract$InputData.f97649a) && this.f97650b == genderScreenContract$InputData.f97650b && this.f97651c == genderScreenContract$InputData.f97651c;
    }

    public final int hashCode() {
        return this.f97651c.hashCode() + j6.a.c(this.f97649a.f297794a.hashCode() * 31, 31, this.f97650b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97649a);
        dest.writeInt(this.f97650b ? 1 : 0);
        dest.writeString(this.f97651c.name());
    }
}

package com.revolut.feature.junior_graduation.impl.ui.screen.identification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_graduation/impl/ui/screen/identification/JuniorIdentificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorIdentificationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorIdentificationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76939c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorIdentificationScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorIdentificationScreenContract$InputData[i];
        }
    }

    public JuniorIdentificationScreenContract$InputData(String firstName, String phoneNumber, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f76937a = firstName;
        this.f76938b = phoneNumber;
        this.f76939c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorIdentificationScreenContract$InputData)) {
            return false;
        }
        JuniorIdentificationScreenContract$InputData juniorIdentificationScreenContract$InputData = (JuniorIdentificationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76937a, juniorIdentificationScreenContract$InputData.f76937a) && Intrinsics.f(this.f76938b, juniorIdentificationScreenContract$InputData.f76938b) && this.f76939c == juniorIdentificationScreenContract$InputData.f76939c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76939c) + p.a.c(this.f76937a.hashCode() * 31, 31, this.f76938b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76937a);
        dest.writeString(this.f76938b);
        dest.writeInt(this.f76939c ? 1 : 0);
    }
}

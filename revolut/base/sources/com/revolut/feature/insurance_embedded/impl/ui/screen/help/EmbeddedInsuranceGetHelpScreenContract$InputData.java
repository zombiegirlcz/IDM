package com.revolut.feature.insurance_embedded.impl.ui.screen.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/help/EmbeddedInsuranceGetHelpScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmbeddedInsuranceGetHelpScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmbeddedInsuranceGetHelpScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.a f76139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76140c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new EmbeddedInsuranceGetHelpScreenContract$InputData(parcel.readInt(), dl7.a.valueOf(parcel.readString()), string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmbeddedInsuranceGetHelpScreenContract$InputData[i];
        }
    }

    public EmbeddedInsuranceGetHelpScreenContract$InputData(int i, dl7.a subtype, String insuranceId) {
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        this.f76138a = insuranceId;
        this.f76139b = subtype;
        this.f76140c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmbeddedInsuranceGetHelpScreenContract$InputData)) {
            return false;
        }
        EmbeddedInsuranceGetHelpScreenContract$InputData embeddedInsuranceGetHelpScreenContract$InputData = (EmbeddedInsuranceGetHelpScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76138a, embeddedInsuranceGetHelpScreenContract$InputData.f76138a) && this.f76139b == embeddedInsuranceGetHelpScreenContract$InputData.f76139b && this.f76140c == embeddedInsuranceGetHelpScreenContract$InputData.f76140c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76140c) + ((this.f76139b.hashCode() + (this.f76138a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76138a);
        dest.writeString(this.f76139b.name());
        dest.writeInt(this.f76140c);
    }
}

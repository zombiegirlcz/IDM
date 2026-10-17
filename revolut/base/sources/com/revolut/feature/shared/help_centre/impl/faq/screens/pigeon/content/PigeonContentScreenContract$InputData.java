package com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/pigeon/content/PigeonContentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PigeonContentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PigeonContentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86289c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PigeonContentScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PigeonContentScreenContract$InputData[i];
        }
    }

    public PigeonContentScreenContract$InputData(String faqKey, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f86287a = faqKey;
        this.f86288b = str;
        this.f86289c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PigeonContentScreenContract$InputData)) {
            return false;
        }
        PigeonContentScreenContract$InputData pigeonContentScreenContract$InputData = (PigeonContentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86287a, pigeonContentScreenContract$InputData.f86287a) && Intrinsics.f(this.f86288b, pigeonContentScreenContract$InputData.f86288b) && this.f86289c == pigeonContentScreenContract$InputData.f86289c && this.d == pigeonContentScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f86287a.hashCode() * 31;
        String str = this.f86288b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f86289c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86287a);
        dest.writeString(this.f86288b);
        dest.writeInt(this.f86289c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}

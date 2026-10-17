package com.revolut.feature.insurance_embedded.impl.ui.flow.detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tu7.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/flow/detail/EmbeddedDetailFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmbeddedDetailFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmbeddedDetailFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.a f76060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f76061c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmbeddedDetailFlowContract$InputData(parcel.readString(), dl7.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmbeddedDetailFlowContract$InputData[i];
        }
    }

    public EmbeddedDetailFlowContract$InputData(String insuranceId, dl7.a subtype, b startScreen) {
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(startScreen, "startScreen");
        this.f76059a = insuranceId;
        this.f76060b = subtype;
        this.f76061c = startScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmbeddedDetailFlowContract$InputData)) {
            return false;
        }
        EmbeddedDetailFlowContract$InputData embeddedDetailFlowContract$InputData = (EmbeddedDetailFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76059a, embeddedDetailFlowContract$InputData.f76059a) && this.f76060b == embeddedDetailFlowContract$InputData.f76060b && this.f76061c == embeddedDetailFlowContract$InputData.f76061c;
    }

    public final int hashCode() {
        return this.f76061c.hashCode() + ((this.f76060b.hashCode() + (this.f76059a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76059a);
        dest.writeString(this.f76060b.name());
        dest.writeString(this.f76061c.name());
    }

    public /* synthetic */ EmbeddedDetailFlowContract$InputData(String str, dl7.a aVar) {
        this(str, aVar, b.DETAIL);
    }
}

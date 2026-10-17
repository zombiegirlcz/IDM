package com.revolut.feature.esim.instructions.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/esim/instructions/navigation/EsimInstructionsControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_esim_instructions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimInstructionsControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimInstructionsControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72117b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimInstructionsControllerDescriptor$InputData(EsimInstructionType.CREATOR.createFromParcel(parcel).f72115a, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInstructionsControllerDescriptor$InputData[i];
        }
    }

    public EsimInstructionsControllerDescriptor$InputData(String instructionType, String str) {
        Intrinsics.checkNotNullParameter(instructionType, "instructionType");
        this.f72116a = instructionType;
        this.f72117b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimInstructionsControllerDescriptor$InputData)) {
            return false;
        }
        EsimInstructionsControllerDescriptor$InputData esimInstructionsControllerDescriptor$InputData = (EsimInstructionsControllerDescriptor$InputData) obj2;
        String str = esimInstructionsControllerDescriptor$InputData.f72116a;
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        return Intrinsics.f(this.f72116a, str) && Intrinsics.f(this.f72117b, esimInstructionsControllerDescriptor$InputData.f72117b);
    }

    public final int hashCode() {
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        int iHashCode = this.f72116a.hashCode() * 31;
        String str = this.f72117b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72116a);
        dest.writeString(this.f72117b);
    }
}

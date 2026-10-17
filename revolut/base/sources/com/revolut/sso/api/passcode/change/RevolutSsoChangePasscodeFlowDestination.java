package com.revolut.sso.api.passcode.change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/passcode/change/RevolutSsoChangePasscodeFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/sso/api/passcode/change/ChangePasscodeInputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoChangePasscodeFlowDestination extends InternalDestination<ChangePasscodeInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoChangePasscodeFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f106015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChangePasscodeInputData f106016c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoChangePasscodeFlowDestination(parcel.readInt() != 0, ChangePasscodeInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoChangePasscodeFlowDestination[i];
        }
    }

    public RevolutSsoChangePasscodeFlowDestination() {
        this(0);
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f106016c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChangePasscodeInputData getF106016c() {
        return this.f106016c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoChangePasscodeFlowDestination)) {
            return false;
        }
        RevolutSsoChangePasscodeFlowDestination revolutSsoChangePasscodeFlowDestination = (RevolutSsoChangePasscodeFlowDestination) obj2;
        return this.f106015b == revolutSsoChangePasscodeFlowDestination.f106015b && Intrinsics.f(this.f106016c, revolutSsoChangePasscodeFlowDestination.f106016c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106016c.f106014a) + (Boolean.hashCode(this.f106015b) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF106015b() {
        return this.f106015b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f106015b ? 1 : 0);
        this.f106016c.writeToParcel(dest, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutSsoChangePasscodeFlowDestination(boolean z, ChangePasscodeInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f106015b = z;
        this.f106016c = inputData;
    }

    public /* synthetic */ RevolutSsoChangePasscodeFlowDestination(int i) {
        this(true, new ChangePasscodeInputData(true));
    }
}

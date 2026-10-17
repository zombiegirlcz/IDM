package com.revolut.feature.wealth_protection.sso.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth_protection.sso.api.error.WealthProtectionSsoError;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "EndStatusDialogInfo", "hrh/a", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthProtectionSsoDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WealthProtectionSsoDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f96299b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoDestination$EndStatusDialogInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EndStatusDialogInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EndStatusDialogInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f96300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f96301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hrh.a f96302c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EndStatusDialogInfo((Clause) parcel.readParcelable(EndStatusDialogInfo.class.getClassLoader()), (Clause) parcel.readParcelable(EndStatusDialogInfo.class.getClassLoader()), hrh.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EndStatusDialogInfo[i];
            }
        }

        public EndStatusDialogInfo(Clause title, Clause clause, hrh.a endDialogType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(endDialogType, "endDialogType");
            this.f96300a = title;
            this.f96301b = clause;
            this.f96302c = endDialogType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EndStatusDialogInfo)) {
                return false;
            }
            EndStatusDialogInfo endStatusDialogInfo = (EndStatusDialogInfo) obj2;
            return Intrinsics.f(this.f96300a, endStatusDialogInfo.f96300a) && Intrinsics.f(this.f96301b, endStatusDialogInfo.f96301b) && this.f96302c == endStatusDialogInfo.f96302c;
        }

        public final int hashCode() {
            int iHashCode = this.f96300a.hashCode() * 31;
            Clause clause = this.f96301b;
            return this.f96302c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96300a, i);
            dest.writeParcelable(this.f96301b, i);
            dest.writeString(this.f96302c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/api/WealthProtectionSsoDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthProtectionSsoError f96303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthProtectionSsoFlowType f96304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EndStatusDialogInfo f96305c;
        public final NaviCommand d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((WealthProtectionSsoError) parcel.readSerializable(), (WealthProtectionSsoFlowType) parcel.readParcelable(InputData.class.getClassLoader()), EndStatusDialogInfo.CREATOR.createFromParcel(parcel), (NaviCommand) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(WealthProtectionSsoError error, WealthProtectionSsoFlowType flowType, EndStatusDialogInfo endDialogInfo, NaviCommand endDestination) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(endDialogInfo, "endDialogInfo");
            Intrinsics.checkNotNullParameter(endDestination, "endDestination");
            this.f96303a = error;
            this.f96304b = flowType;
            this.f96305c = endDialogInfo;
            this.d = endDestination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NaviCommand getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EndStatusDialogInfo getF96305c() {
            return this.f96305c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final WealthProtectionSsoError getF96303a() {
            return this.f96303a;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final WealthProtectionSsoFlowType getF96304b() {
            return this.f96304b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f96303a, inputData.f96303a) && Intrinsics.f(this.f96304b, inputData.f96304b) && Intrinsics.f(this.f96305c, inputData.f96305c) && Intrinsics.f(this.d, inputData.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f96305c.hashCode() + ((this.f96304b.hashCode() + (this.f96303a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96303a);
            dest.writeParcelable(this.f96304b, i);
            this.f96305c.writeToParcel(dest, i);
            dest.writeParcelable(this.d, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthProtectionSsoDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthProtectionSsoDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthProtectionSsoDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f96299b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f96299b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InputData getF96299b() {
        return this.f96299b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WealthProtectionSsoDestination) && Intrinsics.f(this.f96299b, ((WealthProtectionSsoDestination) obj2).f96299b);
    }

    public final int hashCode() {
        return this.f96299b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96299b.writeToParcel(dest, i);
    }
}

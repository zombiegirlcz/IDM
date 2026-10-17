package com.revolut.sso.impl.ui.external_entry.external_entry;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "FlowToLaunch", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalEntryFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExternalEntryFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowToLaunch f106540a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch;", "Landroid/os/Parcelable;", "<init>", "()V", "GetAuthCode", "NotSupported", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch$GetAuthCode;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch$NotSupported;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class FlowToLaunch implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch$GetAuthCode;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GetAuthCode extends FlowToLaunch {

            @NotNull
            public static final Parcelable.Creator<GetAuthCode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f106541a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f106542b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f106543c;
            public final String d;
            public final String e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GetAuthCode(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GetAuthCode[i];
                }
            }

            public GetAuthCode(String codeChallenge, String clientId, String str, String str2, List securityProfiles) {
                Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
                this.f106541a = codeChallenge;
                this.f106542b = clientId;
                this.f106543c = securityProfiles;
                this.d = str;
                this.e = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof GetAuthCode)) {
                    return false;
                }
                GetAuthCode getAuthCode = (GetAuthCode) obj2;
                return Intrinsics.f(this.f106541a, getAuthCode.f106541a) && Intrinsics.f(this.f106542b, getAuthCode.f106542b) && Intrinsics.f(this.f106543c, getAuthCode.f106543c) && Intrinsics.f(this.d, getAuthCode.d) && Intrinsics.f(this.e, getAuthCode.e);
            }

            public final int hashCode() {
                int iD = p.a.d(p.a.c(this.f106541a.hashCode() * 31, 31, this.f106542b), 31, this.f106543c);
                String str = this.d;
                int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.e;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f106541a);
                dest.writeString(this.f106542b);
                dest.writeStringList(this.f106543c);
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch$NotSupported;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData$FlowToLaunch;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NotSupported extends FlowToLaunch {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NotSupported f106544a = new NotSupported();

            @NotNull
            public static final Parcelable.Creator<NotSupported> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NotSupported.f106544a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NotSupported[i];
                }
            }

            private NotSupported() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        private FlowToLaunch() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalEntryFlowContract$InputData((FlowToLaunch) parcel.readParcelable(ExternalEntryFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalEntryFlowContract$InputData[i];
        }
    }

    public ExternalEntryFlowContract$InputData(FlowToLaunch flowToLaunch) {
        Intrinsics.checkNotNullParameter(flowToLaunch, "flowToLaunch");
        this.f106540a = flowToLaunch;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ExternalEntryFlowContract$InputData) && Intrinsics.f(this.f106540a, ((ExternalEntryFlowContract$InputData) obj2).f106540a);
    }

    public final int hashCode() {
        return this.f106540a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106540a, i);
    }
}

package com.revolut.sso.impl.ui.external_entry.external_entry;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.models.RevolutAccountSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Loading", "ChooseAccount", "GetAuthCode", "NotSupported", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$ChooseAccount;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$GetAuthCode;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$Loading;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$NotSupported;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExternalEntryFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$ChooseAccount;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseAccount extends ExternalEntryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseAccount f106547a = new ChooseAccount();

        @NotNull
        public static final Parcelable.Creator<ChooseAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseAccount.f106547a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseAccount[i];
            }
        }

        private ChooseAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$GetAuthCode;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetAuthCode extends ExternalEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GetAuthCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106550c;
        public final RevolutAccountSession d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetAuthCode(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (RevolutAccountSession) parcel.readParcelable(GetAuthCode.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetAuthCode[i];
            }
        }

        public GetAuthCode(String codeChallenge, String clientId, List securityProfiles, RevolutAccountSession session, String str) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            Intrinsics.checkNotNullParameter(session, "session");
            this.f106548a = codeChallenge;
            this.f106549b = clientId;
            this.f106550c = securityProfiles;
            this.d = session;
            this.e = str;
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
            return Intrinsics.f(this.f106548a, getAuthCode.f106548a) && Intrinsics.f(this.f106549b, getAuthCode.f106549b) && Intrinsics.f(this.f106550c, getAuthCode.f106550c) && Intrinsics.f(this.d, getAuthCode.d) && Intrinsics.f(this.e, getAuthCode.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.d(p.a.c(this.f106548a.hashCode() * 31, 31, this.f106549b), 31, this.f106550c)) * 31;
            String str = this.e;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106548a);
            dest.writeString(this.f106549b);
            dest.writeStringList(this.f106550c);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$Loading;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends ExternalEntryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f106551a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f106551a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step$NotSupported;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotSupported extends ExternalEntryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotSupported f106552a = new NotSupported();

        @NotNull
        public static final Parcelable.Creator<NotSupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotSupported.f106552a;
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

    private ExternalEntryFlowContract$Step() {
    }
}

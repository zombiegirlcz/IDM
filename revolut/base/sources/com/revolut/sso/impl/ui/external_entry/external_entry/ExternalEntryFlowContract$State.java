package com.revolut.sso.impl.ui.external_entry.external_entry;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "GetAuthCode", "NotSupported", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State$GetAuthCode;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State$NotSupported;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalEntryFlowContract$State extends FlowState {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State$GetAuthCode;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetAuthCode implements ExternalEntryFlowContract$State {

        @NotNull
        public static final Parcelable.Creator<GetAuthCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106545a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetAuthCode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetAuthCode[i];
            }
        }

        public GetAuthCode(String str) {
            this.f106545a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetAuthCode) && Intrinsics.f(this.f106545a, ((GetAuthCode) obj2).f106545a);
        }

        public final int hashCode() {
            String str = this.f106545a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106545a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State$NotSupported;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$State;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotSupported implements ExternalEntryFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotSupported f106546a = new NotSupported();

        @NotNull
        public static final Parcelable.Creator<NotSupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotSupported.f106546a;
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
}

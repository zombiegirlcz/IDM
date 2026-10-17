package com.revolut.feature.apm.breb.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Send", "NewContact", "Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData$NewContact;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData$Send;", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrebTransferNavigation$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData$NewContact;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewContact implements BrebTransferNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61706a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewContact(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        public NewContact() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewContact) && Intrinsics.f(this.f61706a, ((NewContact) obj2).f61706a);
        }

        public final int hashCode() {
            return this.f61706a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61706a);
        }

        public NewContact(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f61706a = key;
        }

        public /* synthetic */ NewContact(int i) {
            this("");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData$Send;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebTransferNavigation$InputData;", "<init>", "()V", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Send implements BrebTransferNavigation$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Send f61707a = new Send();

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Send.f61707a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        private Send() {
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

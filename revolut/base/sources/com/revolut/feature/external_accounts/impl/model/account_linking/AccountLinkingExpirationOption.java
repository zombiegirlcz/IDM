package com.revolut.feature.external_accounts.impl.model.account_linking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption;", "Landroid/os/Parcelable;", "Companion", "DateOption", "OneTimeOption", "a", "Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption$DateOption;", "Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption$OneTimeOption;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountLinkingExpirationOption extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f72480a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption$DateOption;", "Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOption implements AccountLinkingExpirationOption {

        @NotNull
        public static final Parcelable.Creator<DateOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72477b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOption(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOption[i];
            }
        }

        public DateOption(String label, long j2) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f72476a = label;
            this.f72477b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateOption)) {
                return false;
            }
            DateOption dateOption = (DateOption) obj2;
            return Intrinsics.f(this.f72476a, dateOption.f72476a) && this.f72477b == dateOption.f72477b;
        }

        @Override // com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption
        /* JADX INFO: renamed from: getLabel, reason: from getter */
        public final String getF72478a() {
            return this.f72476a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f72477b) + (this.f72476a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72476a);
            dest.writeLong(this.f72477b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption$OneTimeOption;", "Lcom/revolut/feature/external_accounts/impl/model/account_linking/AccountLinkingExpirationOption;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneTimeOption implements AccountLinkingExpirationOption {

        @NotNull
        public static final Parcelable.Creator<OneTimeOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72479b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneTimeOption(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneTimeOption[i];
            }
        }

        public OneTimeOption(String label, String description) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f72478a = label;
            this.f72479b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneTimeOption)) {
                return false;
            }
            OneTimeOption oneTimeOption = (OneTimeOption) obj2;
            return Intrinsics.f(this.f72478a, oneTimeOption.f72478a) && Intrinsics.f(this.f72479b, oneTimeOption.f72479b);
        }

        @Override // com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption
        /* JADX INFO: renamed from: getLabel, reason: from getter */
        public final String getF72478a() {
            return this.f72478a;
        }

        public final int hashCode() {
            return this.f72479b.hashCode() + (this.f72478a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72478a);
            dest.writeString(this.f72479b);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f72480a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: getLabel */
    String getF72478a();
}

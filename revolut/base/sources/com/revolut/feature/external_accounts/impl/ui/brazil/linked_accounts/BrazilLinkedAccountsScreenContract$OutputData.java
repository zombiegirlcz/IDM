package com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "LinkedAccountClicked", "RevokeClicked", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData$LinkedAccountClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData$RevokeClicked;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilLinkedAccountsScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData$LinkedAccountClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountClicked extends BrazilLinkedAccountsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72644b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountClicked(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountClicked[i];
            }
        }

        public LinkedAccountClicked(String linkedAccountId, boolean z) {
            Intrinsics.checkNotNullParameter(linkedAccountId, "linkedAccountId");
            this.f72643a = linkedAccountId;
            this.f72644b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccountClicked)) {
                return false;
            }
            LinkedAccountClicked linkedAccountClicked = (LinkedAccountClicked) obj2;
            return Intrinsics.f(this.f72643a, linkedAccountClicked.f72643a) && this.f72644b == linkedAccountClicked.f72644b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72644b) + (this.f72643a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72643a);
            dest.writeInt(this.f72644b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData$RevokeClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeClicked extends BrazilLinkedAccountsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<RevokeClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72647c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeClicked(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeClicked[i];
            }
        }

        public RevokeClicked(String linkedAccountId, String thirdPartyTitle, boolean z) {
            Intrinsics.checkNotNullParameter(linkedAccountId, "linkedAccountId");
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f72645a = linkedAccountId;
            this.f72646b = thirdPartyTitle;
            this.f72647c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevokeClicked)) {
                return false;
            }
            RevokeClicked revokeClicked = (RevokeClicked) obj2;
            return Intrinsics.f(this.f72645a, revokeClicked.f72645a) && Intrinsics.f(this.f72646b, revokeClicked.f72646b) && this.f72647c == revokeClicked.f72647c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72647c) + p.a.c(this.f72645a.hashCode() * 31, 31, this.f72646b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72645a);
            dest.writeString(this.f72646b);
            dest.writeInt(this.f72647c ? 1 : 0);
        }
    }

    private BrazilLinkedAccountsScreenContract$OutputData() {
    }
}

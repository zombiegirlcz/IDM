package com.revolut.feature.semi_independent_onboarding.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult;", "Landroid/os/Parcelable;", "ExistingUser", "NotExistingUser", "Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult$ExistingUser;", "Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult$NotExistingUser;", "feature_semi_independent_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GuardianInvitationResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult$ExistingUser;", "Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingUser implements GuardianInvitationResult {

        @NotNull
        public static final Parcelable.Creator<ExistingUser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85980b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingUser(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingUser[i];
            }
        }

        public ExistingUser(String invitationId, String guardianFirstName) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            Intrinsics.checkNotNullParameter(guardianFirstName, "guardianFirstName");
            this.f85979a = invitationId;
            this.f85980b = guardianFirstName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExistingUser)) {
                return false;
            }
            ExistingUser existingUser = (ExistingUser) obj2;
            return Intrinsics.f(this.f85979a, existingUser.f85979a) && Intrinsics.f(this.f85980b, existingUser.f85980b);
        }

        public final int hashCode() {
            return this.f85980b.hashCode() + (this.f85979a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85979a);
            dest.writeString(this.f85980b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult$NotExistingUser;", "Lcom/revolut/feature/semi_independent_onboarding/api/model/GuardianInvitationResult;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotExistingUser implements GuardianInvitationResult {

        @NotNull
        public static final Parcelable.Creator<NotExistingUser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85982b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotExistingUser(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotExistingUser[i];
            }
        }

        public NotExistingUser(String invitationId, String invitationMessage) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            Intrinsics.checkNotNullParameter(invitationMessage, "invitationMessage");
            this.f85981a = invitationId;
            this.f85982b = invitationMessage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NotExistingUser)) {
                return false;
            }
            NotExistingUser notExistingUser = (NotExistingUser) obj2;
            return Intrinsics.f(this.f85981a, notExistingUser.f85981a) && Intrinsics.f(this.f85982b, notExistingUser.f85982b);
        }

        public final int hashCode() {
            return this.f85982b.hashCode() + (this.f85981a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85981a);
            dest.writeString(this.f85982b);
        }
    }
}

package com.revolut.shared.feature.user_declarations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase", "Landroid/os/Parcelable;", "CloseConnections", "BusinessAssociates", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase$BusinessAssociates;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase$CloseConnections;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PepFlowControllerDescriptor$UseCase extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase$BusinessAssociates;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessAssociates implements PepFlowControllerDescriptor$UseCase {

        @NotNull
        public static final Parcelable.Creator<BusinessAssociates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105068a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BusinessAssociates(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessAssociates[i];
            }
        }

        public BusinessAssociates(String workflowScreenName) {
            Intrinsics.checkNotNullParameter(workflowScreenName, "workflowScreenName");
            this.f105068a = workflowScreenName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BusinessAssociates) && Intrinsics.f(this.f105068a, ((BusinessAssociates) obj2).f105068a);
        }

        public final int hashCode() {
            return this.f105068a.hashCode();
        }

        @Override // com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase
        /* JADX INFO: renamed from: i8, reason: from getter */
        public final String getF105069a() {
            return this.f105068a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105068a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase$CloseConnections;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CloseConnections implements PepFlowControllerDescriptor$UseCase {

        @NotNull
        public static final Parcelable.Creator<CloseConnections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105069a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CloseConnections(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseConnections[i];
            }
        }

        public CloseConnections(String workflowScreenName) {
            Intrinsics.checkNotNullParameter(workflowScreenName, "workflowScreenName");
            this.f105069a = workflowScreenName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CloseConnections) && Intrinsics.f(this.f105069a, ((CloseConnections) obj2).f105069a);
        }

        public final int hashCode() {
            return this.f105069a.hashCode();
        }

        @Override // com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase
        /* JADX INFO: renamed from: i8, reason: from getter */
        public final String getF105069a() {
            return this.f105069a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105069a);
        }
    }

    /* JADX INFO: renamed from: i8 */
    String getF105069a();
}

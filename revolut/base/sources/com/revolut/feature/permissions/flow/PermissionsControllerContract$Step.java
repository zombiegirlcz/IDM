package com.revolut.feature.permissions.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/permissions/flow/PermissionsControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Explanation", "Introduction", "Lcom/revolut/feature/permissions/flow/PermissionsControllerContract$Step$Explanation;", "Lcom/revolut/feature/permissions/flow/PermissionsControllerContract$Step$Introduction;", "feature_permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PermissionsControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/permissions/flow/PermissionsControllerContract$Step$Explanation;", "Lcom/revolut/feature/permissions/flow/PermissionsControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Explanation implements PermissionsControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<Explanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingContentDelegate.Model f80334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PermissionsControllerContract$Permission f80335b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Explanation((PromptMarketingContentDelegate.Model) parcel.readParcelable(Explanation.class.getClassLoader()), PermissionsControllerContract$Permission.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Explanation[i];
            }
        }

        public Explanation(PromptMarketingContentDelegate.Model promptModel, PermissionsControllerContract$Permission permission) {
            Intrinsics.checkNotNullParameter(promptModel, "promptModel");
            Intrinsics.checkNotNullParameter(permission, "permission");
            this.f80334a = promptModel;
            this.f80335b = permission;
        }

        @Override // com.revolut.feature.permissions.flow.PermissionsControllerContract$Step
        /* JADX INFO: renamed from: W0, reason: from getter */
        public final PermissionsControllerContract$Permission getF80337b() {
            return this.f80335b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Explanation)) {
                return false;
            }
            Explanation explanation = (Explanation) obj2;
            return Intrinsics.f(this.f80334a, explanation.f80334a) && Intrinsics.f(this.f80335b, explanation.f80335b);
        }

        public final int hashCode() {
            return this.f80335b.hashCode() + (this.f80334a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80334a, i);
            this.f80335b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/permissions/flow/PermissionsControllerContract$Step$Introduction;", "Lcom/revolut/feature/permissions/flow/PermissionsControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Introduction implements PermissionsControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<Introduction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingContentDelegate.Model f80336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PermissionsControllerContract$Permission f80337b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Introduction((PromptMarketingContentDelegate.Model) parcel.readParcelable(Introduction.class.getClassLoader()), PermissionsControllerContract$Permission.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Introduction[i];
            }
        }

        public Introduction(PromptMarketingContentDelegate.Model promptModel, PermissionsControllerContract$Permission permission) {
            Intrinsics.checkNotNullParameter(promptModel, "promptModel");
            Intrinsics.checkNotNullParameter(permission, "permission");
            this.f80336a = promptModel;
            this.f80337b = permission;
        }

        @Override // com.revolut.feature.permissions.flow.PermissionsControllerContract$Step
        /* JADX INFO: renamed from: W0, reason: from getter */
        public final PermissionsControllerContract$Permission getF80337b() {
            return this.f80337b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Introduction)) {
                return false;
            }
            Introduction introduction = (Introduction) obj2;
            return Intrinsics.f(this.f80336a, introduction.f80336a) && Intrinsics.f(this.f80337b, introduction.f80337b);
        }

        public final int hashCode() {
            return this.f80337b.hashCode() + (this.f80336a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80336a, i);
            this.f80337b.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: W0 */
    PermissionsControllerContract$Permission getF80337b();
}

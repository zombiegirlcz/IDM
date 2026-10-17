package com.revolut.feature.freelancer.impl.ui.prompt.post_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action", "Landroid/os/Parcelable;", "<init>", "()V", "IssueVirtualCard", "DoNothing", "SelectPlan", "Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action$DoNothing;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action$IssueVirtualCard;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action$SelectPlan;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProPostActivationScreenContract$Action implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action$DoNothing;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DoNothing extends ProPostActivationScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DoNothing f74089a = new DoNothing();

        @NotNull
        public static final Parcelable.Creator<DoNothing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DoNothing.f74089a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DoNothing[i];
            }
        }

        private DoNothing() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action$IssueVirtualCard;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IssueVirtualCard extends ProPostActivationScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<IssueVirtualCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f74090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f74091b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IssueVirtualCard((NaviCommand) parcel.readParcelable(IssueVirtualCard.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IssueVirtualCard[i];
            }
        }

        public IssueVirtualCard(NaviCommand localPromptCommand, b countryCode) {
            Intrinsics.checkNotNullParameter(localPromptCommand, "localPromptCommand");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f74090a = localPromptCommand;
            this.f74091b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IssueVirtualCard)) {
                return false;
            }
            IssueVirtualCard issueVirtualCard = (IssueVirtualCard) obj2;
            return Intrinsics.f(this.f74090a, issueVirtualCard.f74090a) && Intrinsics.f(this.f74091b, issueVirtualCard.f74091b);
        }

        public final int hashCode() {
            return this.f74091b.f297794a.hashCode() + (this.f74090a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74090a, i);
            dest.writeSerializable(this.f74091b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action$SelectPlan;", "Lcom/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPlan extends ProPostActivationScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<SelectPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f74092a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPlan((NaviCommand) parcel.readParcelable(SelectPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPlan[i];
            }
        }

        public SelectPlan(NaviCommand selectPlanCommand) {
            Intrinsics.checkNotNullParameter(selectPlanCommand, "selectPlanCommand");
            this.f74092a = selectPlanCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectPlan) && Intrinsics.f(this.f74092a, ((SelectPlan) obj2).f74092a);
        }

        public final int hashCode() {
            return this.f74092a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74092a, i);
        }
    }

    private ProPostActivationScreenContract$Action() {
    }
}

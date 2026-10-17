package com.revolut.feature.referrals.shared.ui.impl.ui.invites_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FaqDialog", "LearnMore", "IneligibilityDialog", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep$FaqDialog;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep$IneligibilityDialog;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep$LearnMore;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvitesDetailsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep$FaqDialog;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaqDialog implements InvitesDetailsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FaqDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81876c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaqDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaqDialog[i];
            }
        }

        public FaqDialog(String deeplink, String title, String details, String key) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f81874a = deeplink;
            this.f81875b = title;
            this.f81876c = details;
            this.d = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FaqDialog)) {
                return false;
            }
            FaqDialog faqDialog = (FaqDialog) obj2;
            return Intrinsics.f(this.f81874a, faqDialog.f81874a) && Intrinsics.f(this.f81875b, faqDialog.f81875b) && Intrinsics.f(this.f81876c, faqDialog.f81876c) && Intrinsics.f(this.d, faqDialog.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f81874a.hashCode() * 31, 31, this.f81875b), 31, this.f81876c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81874a);
            dest.writeString(this.f81875b);
            dest.writeString(this.f81876c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep$IneligibilityDialog;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IneligibilityDialog implements InvitesDetailsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<IneligibilityDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81877a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IneligibilityDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IneligibilityDialog[i];
            }
        }

        public IneligibilityDialog(String str) {
            this.f81877a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IneligibilityDialog) && Intrinsics.f(this.f81877a, ((IneligibilityDialog) obj2).f81877a);
        }

        public final int hashCode() {
            String str = this.f81877a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81877a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep$LearnMore;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LearnMore implements InvitesDetailsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LearnMore> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalInfo f81878a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LearnMore((AdditionalInfo) parcel.readParcelable(LearnMore.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMore[i];
            }
        }

        public LearnMore(AdditionalInfo additionalInfo) {
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f81878a = additionalInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LearnMore) && Intrinsics.f(this.f81878a, ((LearnMore) obj2).f81878a);
        }

        public final int hashCode() {
            return this.f81878a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81878a, i);
        }
    }
}

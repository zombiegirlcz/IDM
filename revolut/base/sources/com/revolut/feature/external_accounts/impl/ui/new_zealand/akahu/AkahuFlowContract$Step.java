package com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AkahuProductArticle", "InstitutionOffLineErrorDialog", "InstitutionAlreadyLinkErrorDialog", "InstitutionLinkLimitErrorDialog", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$AkahuProductArticle;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$InstitutionAlreadyLinkErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$InstitutionLinkLimitErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$InstitutionOffLineErrorDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AkahuFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$AkahuProductArticle;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AkahuProductArticle extends AkahuFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AkahuProductArticle f73067a = new AkahuProductArticle();

        @NotNull
        public static final Parcelable.Creator<AkahuProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AkahuProductArticle.f73067a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AkahuProductArticle[i];
            }
        }

        private AkahuProductArticle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$InstitutionAlreadyLinkErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionAlreadyLinkErrorDialog extends AkahuFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionAlreadyLinkErrorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73068a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionAlreadyLinkErrorDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionAlreadyLinkErrorDialog[i];
            }
        }

        public InstitutionAlreadyLinkErrorDialog(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f73068a = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionAlreadyLinkErrorDialog) && Intrinsics.f(this.f73068a, ((InstitutionAlreadyLinkErrorDialog) obj2).f73068a);
        }

        public final int hashCode() {
            return this.f73068a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73068a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$InstitutionLinkLimitErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionLinkLimitErrorDialog extends AkahuFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionLinkLimitErrorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73069a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionLinkLimitErrorDialog(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionLinkLimitErrorDialog[i];
            }
        }

        public InstitutionLinkLimitErrorDialog(int i) {
            this.f73069a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionLinkLimitErrorDialog) && this.f73069a == ((InstitutionLinkLimitErrorDialog) obj2).f73069a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f73069a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f73069a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step$InstitutionOffLineErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/new_zealand/akahu/AkahuFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionOffLineErrorDialog extends AkahuFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionOffLineErrorDialog f73070a = new InstitutionOffLineErrorDialog();

        @NotNull
        public static final Parcelable.Creator<InstitutionOffLineErrorDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionOffLineErrorDialog.f73070a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionOffLineErrorDialog[i];
            }
        }

        private InstitutionOffLineErrorDialog() {
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

    private AkahuFlowContract$Step() {
    }
}

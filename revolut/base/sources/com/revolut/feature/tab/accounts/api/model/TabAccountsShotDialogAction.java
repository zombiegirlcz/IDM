package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.feedback.api.navigation.OneClickFeedbackFlowDescriptor;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction;", "Landroid/os/Parcelable;", "Success", "Action", "Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Success;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TabAccountsShotDialogAction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Success;", "Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements TabAccountsShotDialogAction {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f89551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f89552b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((Clause) parcel.readParcelable(Success.class.getClassLoader()), (Action) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(Clause text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f89551a = text;
            this.f89552b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f89551a, success.f89551a) && Intrinsics.f(this.f89552b, success.f89552b);
        }

        public final int hashCode() {
            int iHashCode = this.f89551a.hashCode() * 31;
            Action action = this.f89552b;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89551a, i);
            dest.writeParcelable(this.f89552b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action;", "Landroid/os/Parcelable;", "Navigate", "ShowModal", "Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action$Navigate;", "Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action$ShowModal;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Action extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action$Navigate;", "Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Navigate implements Action {

            @NotNull
            public static final Parcelable.Creator<Navigate> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f89546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final KompotDestination f89547b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Navigate((Clause) parcel.readParcelable(Navigate.class.getClassLoader()), (KompotDestination) parcel.readParcelable(Navigate.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Navigate[i];
                }
            }

            public Navigate(Clause text, KompotDestination destination) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.f89546a = text;
                this.f89547b = destination;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Navigate)) {
                    return false;
                }
                Navigate navigate = (Navigate) obj2;
                return Intrinsics.f(this.f89546a, navigate.f89546a) && Intrinsics.f(this.f89547b, navigate.f89547b);
            }

            @Override // com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction.Action
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF89548a() {
                return this.f89546a;
            }

            public final int hashCode() {
                return this.f89547b.hashCode() + (this.f89546a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89546a, i);
                dest.writeParcelable(this.f89547b, i);
            }
        }

        /* JADX INFO: renamed from: getText */
        Clause getF89548a();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action$ShowModal;", "Lcom/revolut/feature/tab/accounts/api/model/TabAccountsShotDialogAction$Action;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowModal implements Action {

            @NotNull
            public static final Parcelable.Creator<ShowModal> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f89548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ParcelableControllerDescriptor f89549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ModalDestination.Style f89550c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowModal((Clause) parcel.readParcelable(ShowModal.class.getClassLoader()), (ParcelableControllerDescriptor) parcel.readParcelable(ShowModal.class.getClassLoader()), (ModalDestination.Style) parcel.readParcelable(ShowModal.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowModal[i];
                }
            }

            public ShowModal(Clause text, ParcelableControllerDescriptor descriptor, ModalDestination.Style style) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f89548a = text;
                this.f89549b = descriptor;
                this.f89550c = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ShowModal)) {
                    return false;
                }
                ShowModal showModal = (ShowModal) obj2;
                return Intrinsics.f(this.f89548a, showModal.f89548a) && Intrinsics.f(this.f89549b, showModal.f89549b) && Intrinsics.f(this.f89550c, showModal.f89550c);
            }

            @Override // com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction.Action
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF89548a() {
                return this.f89548a;
            }

            public final int hashCode() {
                return this.f89550c.hashCode() + ((this.f89549b.hashCode() + (this.f89548a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89548a, i);
                dest.writeParcelable(this.f89549b, i);
                dest.writeParcelable(this.f89550c, i);
            }

            public /* synthetic */ ShowModal(TextLocalisedClause textLocalisedClause, OneClickFeedbackFlowDescriptor oneClickFeedbackFlowDescriptor) {
                this(textLocalisedClause, oneClickFeedbackFlowDescriptor, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
    }
}

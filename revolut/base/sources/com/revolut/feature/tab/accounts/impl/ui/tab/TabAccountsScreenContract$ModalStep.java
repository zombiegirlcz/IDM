package com.revolut.feature.tab.accounts.impl.ui.tab;

import android.os.Parcel;
import android.os.Parcelable;
import cm2.i;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BackgroundModification", "SlotChecklist", "ShotAction", "UnhideAccount", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$BackgroundModification;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$ShotAction;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$SlotChecklist;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$UnhideAccount;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TabAccountsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$BackgroundModification;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackgroundModification extends TabAccountsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BackgroundModification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThemedBackgroundKey f89679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f89680b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackgroundModification((ThemedBackgroundKey) parcel.readParcelable(BackgroundModification.class.getClassLoader()), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackgroundModification[i];
            }
        }

        public BackgroundModification(ThemedBackgroundKey themedBackgroundKey, i iVar) {
            this.f89679a = themedBackgroundKey;
            this.f89680b = iVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackgroundModification)) {
                return false;
            }
            BackgroundModification backgroundModification = (BackgroundModification) obj2;
            return Intrinsics.f(this.f89679a, backgroundModification.f89679a) && this.f89680b == backgroundModification.f89680b;
        }

        public final int hashCode() {
            ThemedBackgroundKey themedBackgroundKey = this.f89679a;
            int iHashCode = (themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode()) * 31;
            i iVar = this.f89680b;
            return iHashCode + (iVar != null ? iVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89679a, i);
            i iVar = this.f89680b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$ShotAction;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShotAction extends TabAccountsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShotAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f89681a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShotAction((ParcelableControllerDescriptor) parcel.readParcelable(ShotAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShotAction[i];
            }
        }

        public ShotAction(ParcelableControllerDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f89681a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShotAction) && Intrinsics.f(this.f89681a, ((ShotAction) obj2).f89681a);
        }

        public final int hashCode() {
            return this.f89681a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89681a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$SlotChecklist;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SlotChecklist extends TabAccountsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SlotChecklist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotChecklistPayload f89682a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SlotChecklist((SlotChecklistPayload) parcel.readParcelable(SlotChecklist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SlotChecklist[i];
            }
        }

        public SlotChecklist(SlotChecklistPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f89682a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SlotChecklist) && Intrinsics.f(this.f89682a, ((SlotChecklist) obj2).f89682a);
        }

        public final int hashCode() {
            return this.f89682a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89682a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep$UnhideAccount;", "Lcom/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnhideAccount extends TabAccountsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnhideAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89683a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnhideAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnhideAccount[i];
            }
        }

        public UnhideAccount(String accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f89683a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnhideAccount) && Intrinsics.f(this.f89683a, ((UnhideAccount) obj2).f89683a);
        }

        public final int hashCode() {
            return this.f89683a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89683a);
        }
    }

    private TabAccountsScreenContract$ModalStep() {
    }
}

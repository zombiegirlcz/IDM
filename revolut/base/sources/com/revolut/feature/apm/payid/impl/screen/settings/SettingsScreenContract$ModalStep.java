package com.revolut.feature.apm.payid.impl.screen.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OpenActions", "DisabledAliasInfo", "DeleteAlias", "AddAlias", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$AddAlias;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$DeleteAlias;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$DisabledAliasInfo;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$OpenActions;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SettingsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$AddAlias;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddAlias extends SettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f62730a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddAlias((Alias) parcel.readParcelable(AddAlias.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAlias[i];
            }
        }

        public AddAlias(Alias alias) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f62730a = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddAlias) && Intrinsics.f(this.f62730a, ((AddAlias) obj2).f62730a);
        }

        public final int hashCode() {
            return this.f62730a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62730a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$DeleteAlias;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteAlias extends SettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f62731a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteAlias((Alias) parcel.readParcelable(DeleteAlias.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteAlias[i];
            }
        }

        public DeleteAlias(Alias alias) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f62731a = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteAlias) && Intrinsics.f(this.f62731a, ((DeleteAlias) obj2).f62731a);
        }

        public final int hashCode() {
            return this.f62731a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62731a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$DisabledAliasInfo;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisabledAliasInfo extends SettingsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisabledAliasInfo f62732a = new DisabledAliasInfo();

        @NotNull
        public static final Parcelable.Creator<DisabledAliasInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisabledAliasInfo.f62732a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisabledAliasInfo[i];
            }
        }

        private DisabledAliasInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep$OpenActions;", "Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenActions extends SettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OpenActions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f62733a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenActions((Alias) parcel.readParcelable(OpenActions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenActions[i];
            }
        }

        public OpenActions(Alias alias) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f62733a = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenActions) && Intrinsics.f(this.f62733a, ((OpenActions) obj2).f62733a);
        }

        public final int hashCode() {
            return this.f62733a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62733a, i);
        }
    }

    private SettingsScreenContract$ModalStep() {
    }
}

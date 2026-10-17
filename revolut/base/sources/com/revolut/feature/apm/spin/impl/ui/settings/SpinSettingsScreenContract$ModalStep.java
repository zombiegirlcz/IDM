package com.revolut.feature.apm.spin.impl.ui.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "HandleClaim", "AliasAlreadyLinked", "Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep$AliasAlreadyLinked;", "Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep$HandleClaim;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SpinSettingsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep$AliasAlreadyLinked;", "Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep;", "<init>", "()V", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AliasAlreadyLinked implements SpinSettingsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AliasAlreadyLinked f62880a = new AliasAlreadyLinked();

        @NotNull
        public static final Parcelable.Creator<AliasAlreadyLinked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AliasAlreadyLinked.f62880a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AliasAlreadyLinked[i];
            }
        }

        private AliasAlreadyLinked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep$HandleClaim;", "Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HandleClaim implements SpinSettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HandleClaim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62881a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HandleClaim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HandleClaim[i];
            }
        }

        public HandleClaim(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f62881a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HandleClaim) && Intrinsics.f(this.f62881a, ((HandleClaim) obj2).f62881a);
        }

        public final int hashCode() {
            return this.f62881a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62881a);
        }
    }
}

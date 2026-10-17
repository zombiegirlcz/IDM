package com.revolut.retail.feature.esim.impl.ui.screens.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Info", "InstallEsim", "ReinstallEsim", "Instructions", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$Info;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$InstallEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$ReinstallEsim;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimHelpScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$Info;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info implements EsimHelpScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimInfoBottomSheetData f100975a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((EsimInfoBottomSheetData) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(EsimInfoBottomSheetData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f100975a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f100975a, ((Info) obj2).f100975a);
        }

        public final int hashCode() {
            return this.f100975a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100975a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$InstallEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstallEsim implements EsimHelpScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InstallEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f100976a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstallEsim((EsimProfile) parcel.readParcelable(InstallEsim.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallEsim[i];
            }
        }

        public InstallEsim(EsimProfile esimProfile) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f100976a = esimProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstallEsim) && Intrinsics.f(this.f100976a, ((InstallEsim) obj2).f100976a);
        }

        public final int hashCode() {
            return this.f100976a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100976a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions implements EsimHelpScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100978b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instructions(((EsimInstructionType) parcel.readParcelable(Instructions.class.getClassLoader())).f72115a, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instructions[i];
            }
        }

        public Instructions(String type, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f100977a = type;
            this.f100978b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instructions)) {
                return false;
            }
            Instructions instructions = (Instructions) obj2;
            String str = instructions.f100977a;
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            return Intrinsics.f(this.f100977a, str) && Intrinsics.f(this.f100978b, instructions.f100978b);
        }

        public final int hashCode() {
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            int iHashCode = this.f100977a.hashCode() * 31;
            String str = this.f100978b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new EsimInstructionType(this.f100977a), i);
            dest.writeString(this.f100978b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep$ReinstallEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReinstallEsim implements EsimHelpScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReinstallEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100979a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReinstallEsim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReinstallEsim[i];
            }
        }

        public ReinstallEsim(String esimProfileId) {
            Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
            this.f100979a = esimProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReinstallEsim) && Intrinsics.f(this.f100979a, ((ReinstallEsim) obj2).f100979a);
        }

        public final int hashCode() {
            return this.f100979a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100979a);
        }
    }
}

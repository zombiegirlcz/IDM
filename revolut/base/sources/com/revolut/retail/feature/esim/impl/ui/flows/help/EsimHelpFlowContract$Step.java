package com.revolut.retail.feature.esim.impl.ui.flows.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Help", "Terms", "ConnectivityTroubleshooting", "Instructions", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$ConnectivityTroubleshooting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$Terms;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimHelpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$ConnectivityTroubleshooting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectivityTroubleshooting implements EsimHelpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConnectivityTroubleshooting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100637a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConnectivityTroubleshooting(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConnectivityTroubleshooting[i];
            }
        }

        public ConnectivityTroubleshooting() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConnectivityTroubleshooting) && Intrinsics.f(this.f100637a, ((ConnectivityTroubleshooting) obj2).f100637a);
        }

        public final int hashCode() {
            String str = this.f100637a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100637a);
        }

        public ConnectivityTroubleshooting(String str) {
            this.f100637a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Help implements EsimHelpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Help f100638a = new Help();

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Help.f100638a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Help[i];
            }
        }

        private Help() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions implements EsimHelpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100640b;

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
            this.f100639a = type;
            this.f100640b = str;
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
            String str = instructions.f100639a;
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            return Intrinsics.f(this.f100639a, str) && Intrinsics.f(this.f100640b, instructions.f100640b);
        }

        public final int hashCode() {
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            int iHashCode = this.f100639a.hashCode() * 31;
            String str = this.f100640b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new EsimInstructionType(this.f100639a), i);
            dest.writeString(this.f100640b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step$Terms;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Terms implements EsimHelpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Terms f100641a = new Terms();

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Terms.f100641a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        private Terms() {
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
}

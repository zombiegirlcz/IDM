package com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Suggestions", "Instructions", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step$Suggestions;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimConnectivityTroubleshootingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions implements EsimConnectivityTroubleshootingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100899b;

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
            this.f100898a = type;
            this.f100899b = str;
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
            String str = instructions.f100898a;
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            return Intrinsics.f(this.f100898a, str) && Intrinsics.f(this.f100899b, instructions.f100899b);
        }

        public final int hashCode() {
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            int iHashCode = this.f100898a.hashCode() * 31;
            String str = this.f100899b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new EsimInstructionType(this.f100898a), i);
            dest.writeString(this.f100899b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted implements EsimConnectivityTroubleshootingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100900a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Restricted((PromptMarketingScreenContract$InputData) parcel.readParcelable(Restricted.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        public Restricted(PromptMarketingScreenContract$InputData promptInput) {
            Intrinsics.checkNotNullParameter(promptInput, "promptInput");
            this.f100900a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100900a, ((Restricted) obj2).f100900a);
        }

        public final int hashCode() {
            return this.f100900a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100900a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step$Suggestions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/troubleshooting/EsimConnectivityTroubleshootingFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Suggestions implements EsimConnectivityTroubleshootingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Suggestions f100901a = new Suggestions();

        @NotNull
        public static final Parcelable.Creator<Suggestions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Suggestions.f100901a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Suggestions[i];
            }
        }

        private Suggestions() {
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

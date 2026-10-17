package com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EarlyCredit", "Instructions", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step$EarlyCredit;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step$Instructions;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoredMethodTopUpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step$EarlyCredit;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarlyCredit implements StoredMethodTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EarlyCredit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f91021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91022b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarlyCredit((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarlyCredit[i];
            }
        }

        public EarlyCredit(d topUpAmount, String pocketId) {
            Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f91021a = topUpAmount;
            this.f91022b = pocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EarlyCredit)) {
                return false;
            }
            EarlyCredit earlyCredit = (EarlyCredit) obj2;
            return Intrinsics.f(this.f91021a, earlyCredit.f91021a) && Intrinsics.f(this.f91022b, earlyCredit.f91022b);
        }

        public final int hashCode() {
            return this.f91022b.hashCode() + (this.f91021a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91021a);
            dest.writeString(this.f91022b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step$Instructions;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions implements StoredMethodTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InstitutionInstructions f91024b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instructions(parcel.readString(), (InstitutionInstructions) parcel.readParcelable(Instructions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instructions[i];
            }
        }

        public Instructions(String institutionId, InstitutionInstructions instructions) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.f91023a = institutionId;
            this.f91024b = instructions;
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
            return Intrinsics.f(this.f91023a, instructions.f91023a) && Intrinsics.f(this.f91024b, instructions.f91024b);
        }

        public final int hashCode() {
            return this.f91024b.hashCode() + (this.f91023a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91023a);
            dest.writeParcelable(this.f91024b, i);
        }
    }
}

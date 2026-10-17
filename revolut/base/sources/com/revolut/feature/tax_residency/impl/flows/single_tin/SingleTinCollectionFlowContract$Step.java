package com.revolut.feature.tax_residency.impl.flows.single_tin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zme.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PrefetchData", "TinInput", "Submit", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step$PrefetchData;", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step$Submit;", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step$TinInput;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SingleTinCollectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step$PrefetchData;", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrefetchData extends SingleTinCollectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrefetchData f90051a = new PrefetchData();

        @NotNull
        public static final Parcelable.Creator<PrefetchData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrefetchData.f90051a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrefetchData[i];
            }
        }

        private PrefetchData() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step$Submit;", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Submit extends SingleTinCollectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f90052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f90053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f90054c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                int iC2 = 0;
                while (iC2 != i) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new Submit(bVar, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Submit[i];
            }
        }

        public Submit(wi0.b userCountry, List taxResidencyRules, ArrayList taxResidencies, String buttonLoadingTag) {
            Intrinsics.checkNotNullParameter(userCountry, "userCountry");
            Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
            Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
            Intrinsics.checkNotNullParameter(buttonLoadingTag, "buttonLoadingTag");
            this.f90052a = userCountry;
            this.f90053b = taxResidencyRules;
            this.f90054c = taxResidencies;
            this.d = buttonLoadingTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) obj2;
            return Intrinsics.f(this.f90052a, submit.f90052a) && this.f90053b.equals(submit.f90053b) && this.f90054c.equals(submit.f90054c) && Intrinsics.f(this.d, submit.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f90054c, p.a.d(this.f90052a.f297794a.hashCode() * 31, 31, this.f90053b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90052a);
            Iterator itV = p.a.v(this.f90053b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itY = j6.a.y(this.f90054c, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step$TinInput;", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TinInput extends SingleTinCollectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TinInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f90055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f90056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f90057c;
        public final l d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                int iC2 = 0;
                while (iC2 != i) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new TinInput(arrayList, arrayList2, bVar, (l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TinInput[i];
            }
        }

        public TinInput(List taxResidencyRules, List taxResidencies, wi0.b userCountry, l countryRule) {
            Intrinsics.checkNotNullParameter(userCountry, "userCountry");
            Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
            Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
            Intrinsics.checkNotNullParameter(countryRule, "countryRule");
            this.f90055a = userCountry;
            this.f90056b = taxResidencyRules;
            this.f90057c = taxResidencies;
            this.d = countryRule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TinInput)) {
                return false;
            }
            TinInput tinInput = (TinInput) obj2;
            return Intrinsics.f(this.f90055a, tinInput.f90055a) && Intrinsics.f(this.f90056b, tinInput.f90056b) && Intrinsics.f(this.f90057c, tinInput.f90057c) && Intrinsics.f(this.d, tinInput.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.d(p.a.d(this.f90055a.f297794a.hashCode() * 31, 31, this.f90056b), 31, this.f90057c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90055a);
            Iterator itV = p.a.v(this.f90056b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = p.a.v(this.f90057c, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeSerializable(this.d);
        }
    }

    private SingleTinCollectionFlowContract$Step() {
    }
}

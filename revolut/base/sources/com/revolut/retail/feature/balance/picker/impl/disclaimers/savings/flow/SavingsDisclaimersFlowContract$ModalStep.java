package com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Selector", "Disclaimer", "Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep$Disclaimer;", "Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep$Selector;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SavingsDisclaimersFlowContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep$Disclaimer;", "Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimer extends SavingsDisclaimersFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f99520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f99521b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimer((Clause) parcel.readParcelable(Disclaimer.class.getClassLoader()), (Clause) parcel.readParcelable(Disclaimer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public Disclaimer(Clause disclaimer, Clause accountName) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f99520a = disclaimer;
            this.f99521b = accountName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj2;
            return Intrinsics.f(this.f99520a, disclaimer.f99520a) && Intrinsics.f(this.f99521b, disclaimer.f99521b);
        }

        public final int hashCode() {
            return this.f99521b.hashCode() + (this.f99520a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99520a, i);
            dest.writeParcelable(this.f99521b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep$Selector;", "Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selector extends SavingsDisclaimersFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Selector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f99522a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SavingWithDisclaimer.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Selector(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selector[i];
            }
        }

        public Selector(ArrayList savingsWithDisclaimers) {
            Intrinsics.checkNotNullParameter(savingsWithDisclaimers, "savingsWithDisclaimers");
            this.f99522a = savingsWithDisclaimers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Selector) && this.f99522a.equals(((Selector) obj2).f99522a);
        }

        public final int hashCode() {
            return this.f99522a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f99522a, dest);
            while (itY.hasNext()) {
                ((SavingWithDisclaimer) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    private SavingsDisclaimersFlowContract$ModalStep() {
    }
}

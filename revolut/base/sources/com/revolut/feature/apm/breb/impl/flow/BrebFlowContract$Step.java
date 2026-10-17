package com.revolut.feature.apm.breb.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$InputData;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "Area", "Transfer", "Onboarding", "Register", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Area;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Onboarding;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Register;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Transfer;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrebFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Area;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Area extends BrebFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BrebNavigation$InputData f61714a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Area((BrebNavigation$InputData) parcel.readParcelable(Area.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        public Area(BrebNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f61714a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Area) && Intrinsics.f(this.f61714a, ((Area) obj2).f61714a);
        }

        public final int hashCode() {
            return this.f61714a.f61697a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61714a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends BrebFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f61715a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f61715a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Onboarding;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding extends BrebFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f61716a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Onboarding.class, parcel, arrayList, iE, 1);
                }
                return new Onboarding(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        public Onboarding(List termsToAccept) {
            Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
            this.f61716a = termsToAccept;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onboarding) && Intrinsics.f(this.f61716a, ((Onboarding) obj2).f61716a);
        }

        public final int hashCode() {
            return this.f61716a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f61716a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Register;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Register extends BrebFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Register> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f61717a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Register.class, parcel, arrayList, iE, 1);
                }
                return new Register(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Register[i];
            }
        }

        public Register(List availabilities) {
            Intrinsics.checkNotNullParameter(availabilities, "availabilities");
            this.f61717a = availabilities;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Register) && Intrinsics.f(this.f61717a, ((Register) obj2).f61717a);
        }

        public final int hashCode() {
            return this.f61717a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f61717a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step$Transfer;", "Lcom/revolut/feature/apm/breb/impl/flow/BrebFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends BrebFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BrebTransferNavigation$InputData f61718a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((BrebTransferNavigation$InputData) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(BrebTransferNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f61718a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && Intrinsics.f(this.f61718a, ((Transfer) obj2).f61718a);
        }

        public final int hashCode() {
            return this.f61718a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61718a, i);
        }
    }

    private BrebFlowContract$Step() {
    }
}

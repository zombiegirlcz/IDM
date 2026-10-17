package com.revolut.feature.apm.iris.impl.ui.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "Terms", "Confirmation", "PendingRegistration", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$PendingRegistration;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$Terms;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IrisRegistrationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements IrisRegistrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f62524a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Confirmation.class, parcel, arrayList, iE, 1);
                }
                return new Confirmation(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(List terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f62524a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f62524a, ((Confirmation) obj2).f62524a);
        }

        public final int hashCode() {
            return this.f62524a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f62524a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro implements IrisRegistrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f62525a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f62525a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$PendingRegistration;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingRegistration implements IrisRegistrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingRegistration f62526a = new PendingRegistration();

        @NotNull
        public static final Parcelable.Creator<PendingRegistration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PendingRegistration.f62526a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingRegistration[i];
            }
        }

        private PendingRegistration() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step$Terms;", "Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terms implements IrisRegistrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f62527a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Terms.class, parcel, arrayList, iE, 1);
                }
                return new Terms(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        public Terms(List terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f62527a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Terms) && Intrinsics.f(this.f62527a, ((Terms) obj2).f62527a);
        }

        public final int hashCode() {
            return this.f62527a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f62527a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}

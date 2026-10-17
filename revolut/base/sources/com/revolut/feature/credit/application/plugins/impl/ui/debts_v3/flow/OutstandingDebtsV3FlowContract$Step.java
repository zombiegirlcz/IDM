package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my3.f;
import my3.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "DebtsHub", "TypeSelector", "DebtDetails", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$DebtDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$TypeSelector;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OutstandingDebtsV3FlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$DebtDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DebtDetails implements OutstandingDebtsV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DebtDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f67512b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebtDetails(parcel.readString(), (p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtDetails[i];
            }
        }

        public DebtDetails(String str, p form) {
            Intrinsics.checkNotNullParameter(form, "form");
            this.f67511a = str;
            this.f67512b = form;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DebtDetails)) {
                return false;
            }
            DebtDetails debtDetails = (DebtDetails) obj2;
            return Intrinsics.f(this.f67511a, debtDetails.f67511a) && Intrinsics.f(this.f67512b, debtDetails.f67512b);
        }

        public final int hashCode() {
            String str = this.f67511a;
            return this.f67512b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67511a);
            dest.writeSerializable(this.f67512b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DebtsHub implements OutstandingDebtsV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DebtsHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f67513a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebtsHub((f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtsHub[i];
            }
        }

        public DebtsHub(f config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67513a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DebtsHub) && Intrinsics.f(this.f67513a, ((DebtsHub) obj2).f67513a);
        }

        public final int hashCode() {
            return this.f67513a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67513a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements OutstandingDebtsV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f67514a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(l0 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f67514a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67514a, ((Intro) obj2).f67514a);
        }

        public final int hashCode() {
            return this.f67514a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67514a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step$TypeSelector;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/flow/OutstandingDebtsV3FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TypeSelector implements OutstandingDebtsV3FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TypeSelector f67515a = new TypeSelector();

        @NotNull
        public static final Parcelable.Creator<TypeSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TypeSelector.f67515a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TypeSelector[i];
            }
        }

        private TypeSelector() {
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

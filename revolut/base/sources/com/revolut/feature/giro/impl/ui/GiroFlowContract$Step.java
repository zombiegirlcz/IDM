package com.revolut.feature.giro.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/giro/impl/ui/GiroFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CreditorSearch", "Form", "Review", "Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step$CreditorSearch;", "Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step$Form;", "Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step$Review;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GiroFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step$CreditorSearch;", "Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step;", "<init>", "()V", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditorSearch extends GiroFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditorSearch f74533a = new CreditorSearch();

        @NotNull
        public static final Parcelable.Creator<CreditorSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditorSearch.f74533a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditorSearch[i];
            }
        }

        private CreditorSearch() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step$Form;", "Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form extends GiroFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Biller f74534a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Form((Biller) parcel.readParcelable(Form.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(Biller creditor) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f74534a = creditor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Form) && Intrinsics.f(this.f74534a, ((Form) obj2).f74534a);
        }

        public final int hashCode() {
            return this.f74534a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74534a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step$Review;", "Lcom/revolut/feature/giro/impl/ui/GiroFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends GiroFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FormState f74535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SelectedPocket f74536b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(FormState.CREATOR.createFromParcel(parcel), SelectedPocket.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(FormState formState, SelectedPocket selectedPocket) {
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
            this.f74535a = formState;
            this.f74536b = selectedPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f74535a, review.f74535a) && Intrinsics.f(this.f74536b, review.f74536b);
        }

        public final int hashCode() {
            return this.f74536b.hashCode() + (this.f74535a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f74535a.writeToParcel(dest, i);
            this.f74536b.writeToParcel(dest, i);
        }
    }

    private GiroFlowContract$Step() {
    }
}

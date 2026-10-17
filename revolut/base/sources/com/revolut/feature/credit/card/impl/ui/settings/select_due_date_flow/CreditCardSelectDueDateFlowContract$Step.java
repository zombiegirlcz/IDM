package com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectDueDate", "IneligibilityError", "Instalments", "Repay", "Error", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$IneligibilityError;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$Instalments;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$SelectDueDate;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardSelectDueDateFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error extends CreditCardSelectDueDateFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f69639a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f69639a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$IneligibilityError;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IneligibilityError extends CreditCardSelectDueDateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IneligibilityError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f69642c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IneligibilityError(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IneligibilityError[i];
            }
        }

        public IneligibilityError(String title, String description, String buttonText, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            this.f69640a = title;
            this.f69641b = description;
            this.f69642c = buttonText;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IneligibilityError)) {
                return false;
            }
            IneligibilityError ineligibilityError = (IneligibilityError) obj2;
            return Intrinsics.f(this.f69640a, ineligibilityError.f69640a) && Intrinsics.f(this.f69641b, ineligibilityError.f69641b) && Intrinsics.f(this.f69642c, ineligibilityError.f69642c) && Intrinsics.f(this.d, ineligibilityError.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f69640a.hashCode() * 31, 31, this.f69641b), 31, this.f69642c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69640a);
            dest.writeString(this.f69641b);
            dest.writeString(this.f69642c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$Instalments;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Instalments extends CreditCardSelectDueDateFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Instalments f69643a = new Instalments();

        @NotNull
        public static final Parcelable.Creator<Instalments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Instalments.f69643a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instalments[i];
            }
        }

        private Instalments() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$Repay;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Repay extends CreditCardSelectDueDateFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Repay f69644a = new Repay();

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Repay.f69644a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        private Repay() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step$SelectDueDate;", "Lcom/revolut/feature/credit/card/impl/ui/settings/select_due_date_flow/CreditCardSelectDueDateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectDueDate extends CreditCardSelectDueDateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectDueDate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f69647c;
        public final Integer d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iE = 0;
                while (iE != i2) {
                    iE = j6.a.e(SelectDueDate.class, parcel, arrayList, iE, 1);
                }
                return new SelectDueDate(string, i, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDueDate[i];
            }
        }

        public SelectDueDate(String facilityId, int i, ArrayList dueDateSelections, Integer num) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(dueDateSelections, "dueDateSelections");
            this.f69645a = facilityId;
            this.f69646b = i;
            this.f69647c = dueDateSelections;
            this.d = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectDueDate)) {
                return false;
            }
            SelectDueDate selectDueDate = (SelectDueDate) obj2;
            return Intrinsics.f(this.f69645a, selectDueDate.f69645a) && this.f69646b == selectDueDate.f69646b && this.f69647c.equals(selectDueDate.f69647c) && Intrinsics.f(this.d, selectDueDate.d);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f69647c, j6.a.b(this.f69646b, this.f69645a.hashCode() * 31, 31), 31);
            Integer num = this.d;
            return iB + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69645a);
            dest.writeInt(this.f69646b);
            Iterator itY = j6.a.y(this.f69647c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    private CreditCardSelectDueDateFlowContract$Step() {
    }
}

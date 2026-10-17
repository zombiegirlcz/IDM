package com.revolut.feature.credit.card.impl.ui.statement.export;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Calendar", "UnexpectedError", "Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep$Calendar;", "Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep$UnexpectedError;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardStatementExportScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep$Calendar;", "Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Calendar implements CreditCardStatementExportScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Calendar> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f69695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f69696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f69697c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Calendar((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Calendar[i];
            }
        }

        public Calendar(LocalDate selectedDate, LocalDate minDate, LocalDate maxDate) {
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            Intrinsics.checkNotNullParameter(minDate, "minDate");
            Intrinsics.checkNotNullParameter(maxDate, "maxDate");
            this.f69695a = selectedDate;
            this.f69696b = minDate;
            this.f69697c = maxDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Calendar)) {
                return false;
            }
            Calendar calendar = (Calendar) obj2;
            return Intrinsics.f(this.f69695a, calendar.f69695a) && Intrinsics.f(this.f69696b, calendar.f69696b) && Intrinsics.f(this.f69697c, calendar.f69697c);
        }

        public final int hashCode() {
            return this.f69697c.hashCode() + y.a(this.f69695a.hashCode() * 31, 31, this.f69696b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69695a);
            dest.writeSerializable(this.f69696b);
            dest.writeSerializable(this.f69697c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep$UnexpectedError;", "Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnexpectedError implements CreditCardStatementExportScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnexpectedError f69698a = new UnexpectedError();

        @NotNull
        public static final Parcelable.Creator<UnexpectedError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnexpectedError.f69698a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnexpectedError[i];
            }
        }

        private UnexpectedError() {
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

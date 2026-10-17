package com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f70431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f70432c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer(parcel.readString(), (Clause) parcel.readParcelable(LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer.class.getClassLoader()), (Clause) parcel.readParcelable(LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer.class.getClassLoader()), (Clause) parcel.readParcelable(LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer[i];
        }
    }

    public LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer(String str, Clause title, Clause description, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f70430a = str;
        this.f70431b = title;
        this.f70432c = description;
        this.d = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer)) {
            return false;
        }
        LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer loanPaymentScheduleMapper$ScheduleStep$InfoExplainer = (LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer) obj2;
        return Intrinsics.f(this.f70430a, loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.f70430a) && Intrinsics.f(this.f70431b, loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.f70431b) && Intrinsics.f(this.f70432c, loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.f70432c) && Intrinsics.f(this.d, loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.d);
    }

    public final int hashCode() {
        String str = this.f70430a;
        int iA = p.a.a(p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f70431b), 31, this.f70432c);
        Clause clause = this.d;
        return iA + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70430a);
        dest.writeParcelable(this.f70431b, i);
        dest.writeParcelable(this.f70432c, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this(null, textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14));
    }
}

package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/QuestionAndAnswer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QuestionAndAnswer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QuestionAndAnswer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog f104908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SuspiciousTransactionDialogAnswer f104909b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionAndAnswer((SuspiciousTransactionDialog) parcel.readParcelable(QuestionAndAnswer.class.getClassLoader()), parcel.readInt() == 0 ? null : SuspiciousTransactionDialogAnswer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionAndAnswer[i];
        }
    }

    public QuestionAndAnswer(SuspiciousTransactionDialog dialog, SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f104908a = dialog;
        this.f104909b = suspiciousTransactionDialogAnswer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QuestionAndAnswer)) {
            return false;
        }
        QuestionAndAnswer questionAndAnswer = (QuestionAndAnswer) obj2;
        return Intrinsics.f(this.f104908a, questionAndAnswer.f104908a) && Intrinsics.f(this.f104909b, questionAndAnswer.f104909b);
    }

    public final int hashCode() {
        int iHashCode = this.f104908a.hashCode() * 31;
        SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer = this.f104909b;
        return iHashCode + (suspiciousTransactionDialogAnswer == null ? 0 : suspiciousTransactionDialogAnswer.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104908a, i);
        SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer = this.f104909b;
        if (suspiciousTransactionDialogAnswer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionDialogAnswer.writeToParcel(dest, i);
        }
    }
}

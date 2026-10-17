package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kl7.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/binary_questions/BinaryQuestionInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BinaryQuestionInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BinaryQuestionInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f75629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f75630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f75631c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BinaryQuestionInfo(p1.valueOf(parcel.readString()), (Clause) parcel.readParcelable(BinaryQuestionInfo.class.getClassLoader()), (Clause) parcel.readParcelable(BinaryQuestionInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BinaryQuestionInfo[i];
        }
    }

    public BinaryQuestionInfo(p1 question, Clause subheader, Clause clause) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(subheader, "subheader");
        this.f75629a = question;
        this.f75630b = subheader;
        this.f75631c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BinaryQuestionInfo)) {
            return false;
        }
        BinaryQuestionInfo binaryQuestionInfo = (BinaryQuestionInfo) obj2;
        return this.f75629a == binaryQuestionInfo.f75629a && Intrinsics.f(this.f75630b, binaryQuestionInfo.f75630b) && Intrinsics.f(this.f75631c, binaryQuestionInfo.f75631c);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f75629a.hashCode() * 31, 31, this.f75630b);
        Clause clause = this.f75631c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75629a.name());
        dest.writeParcelable(this.f75630b, i);
        dest.writeParcelable(this.f75631c, i);
    }
}

package com.revolut.feature.giro.impl.ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/giro/impl/ui/review/DirectDebitReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectDebitReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormState f74556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectedPocket f74557b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitReviewScreenContract$InputData(FormState.CREATOR.createFromParcel(parcel), SelectedPocket.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitReviewScreenContract$InputData[i];
        }
    }

    public DirectDebitReviewScreenContract$InputData(FormState formState, SelectedPocket selectedPocket) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        this.f74556a = formState;
        this.f74557b = selectedPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitReviewScreenContract$InputData)) {
            return false;
        }
        DirectDebitReviewScreenContract$InputData directDebitReviewScreenContract$InputData = (DirectDebitReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74556a, directDebitReviewScreenContract$InputData.f74556a) && Intrinsics.f(this.f74557b, directDebitReviewScreenContract$InputData.f74557b);
    }

    public final int hashCode() {
        return this.f74557b.hashCode() + (this.f74556a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74556a.writeToParcel(dest, i);
        this.f74557b.writeToParcel(dest, i);
    }
}

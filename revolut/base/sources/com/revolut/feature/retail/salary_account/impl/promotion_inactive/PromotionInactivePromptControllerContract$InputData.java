package com.revolut.feature.retail.salary_account.impl.promotion_inactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/salary_account/impl/promotion_inactive/PromotionInactivePromptControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromotionInactivePromptControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PromotionInactivePromptControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f82986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f82987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f82988c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PromotionInactivePromptControllerContract$InputData((Clause) parcel.readParcelable(PromotionInactivePromptControllerContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(PromotionInactivePromptControllerContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(PromotionInactivePromptControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromotionInactivePromptControllerContract$InputData[i];
        }
    }

    public PromotionInactivePromptControllerContract$InputData(Clause title, Clause description, Clause button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f82986a = title;
        this.f82987b = description;
        this.f82988c = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PromotionInactivePromptControllerContract$InputData)) {
            return false;
        }
        PromotionInactivePromptControllerContract$InputData promotionInactivePromptControllerContract$InputData = (PromotionInactivePromptControllerContract$InputData) obj2;
        return Intrinsics.f(this.f82986a, promotionInactivePromptControllerContract$InputData.f82986a) && Intrinsics.f(this.f82987b, promotionInactivePromptControllerContract$InputData.f82987b) && Intrinsics.f(this.f82988c, promotionInactivePromptControllerContract$InputData.f82988c);
    }

    public final int hashCode() {
        return this.f82988c.hashCode() + p.a.a(this.f82986a.hashCode() * 31, 31, this.f82987b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82986a, i);
        dest.writeParcelable(this.f82987b, i);
        dest.writeParcelable(this.f82988c, i);
    }
}

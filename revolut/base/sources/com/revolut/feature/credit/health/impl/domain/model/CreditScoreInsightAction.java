package com.revolut.feature.credit.health.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditScoreInsightAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditScoreInsightAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScoreInsightActionId f69965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s05.a f69966b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditScoreInsightAction((CreditScoreInsightActionId) parcel.readParcelable(CreditScoreInsightAction.class.getClassLoader()), s05.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditScoreInsightAction[i];
        }
    }

    public CreditScoreInsightAction(CreditScoreInsightActionId id10, s05.a type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f69965a = id10;
        this.f69966b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditScoreInsightAction)) {
            return false;
        }
        CreditScoreInsightAction creditScoreInsightAction = (CreditScoreInsightAction) obj2;
        return Intrinsics.f(this.f69965a, creditScoreInsightAction.f69965a) && this.f69966b == creditScoreInsightAction.f69966b;
    }

    public final int hashCode() {
        return this.f69966b.hashCode() + (this.f69965a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69965a, i);
        dest.writeString(this.f69966b.name());
    }
}

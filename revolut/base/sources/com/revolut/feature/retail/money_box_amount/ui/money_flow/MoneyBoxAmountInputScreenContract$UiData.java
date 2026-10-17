package com.revolut.feature.retail.money_box_amount.ui.money_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/money_box_amount/ui/money_flow/MoneyBoxAmountInputScreenContract$UiData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_money_box_amount_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyBoxAmountInputScreenContract$UiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoneyBoxAmountInputScreenContract$UiData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f82770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f82771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82772c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(MoneyBoxAmountInputScreenContract$UiData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(MoneyBoxAmountInputScreenContract$UiData.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new MoneyBoxAmountInputScreenContract$UiData(clause, clause2, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyBoxAmountInputScreenContract$UiData[i];
        }
    }

    public MoneyBoxAmountInputScreenContract$UiData(Clause submitButtonText, Clause navBarTitle, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f82770a = submitButtonText;
        this.f82771b = navBarTitle;
        this.f82772c = z;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyBoxAmountInputScreenContract$UiData)) {
            return false;
        }
        MoneyBoxAmountInputScreenContract$UiData moneyBoxAmountInputScreenContract$UiData = (MoneyBoxAmountInputScreenContract$UiData) obj2;
        return Intrinsics.f(this.f82770a, moneyBoxAmountInputScreenContract$UiData.f82770a) && Intrinsics.f(this.f82771b, moneyBoxAmountInputScreenContract$UiData.f82771b) && this.f82772c == moneyBoxAmountInputScreenContract$UiData.f82772c && this.d == moneyBoxAmountInputScreenContract$UiData.d && this.e == moneyBoxAmountInputScreenContract$UiData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(p.a.a(this.f82770a.hashCode() * 31, 31, this.f82771b), 31, this.f82772c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82770a, i);
        dest.writeParcelable(this.f82771b, i);
        dest.writeInt(this.f82772c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}

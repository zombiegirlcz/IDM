package com.revolut.feature.credit.impl.ui.account.creditcard.mappers;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/impl/ui/account/creditcard/mappers/CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction", "", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f70052a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction((l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction[i];
        }
    }

    public CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction(l action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f70052a = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction) && Intrinsics.f(this.f70052a, ((CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction) obj2).f70052a);
    }

    public final int hashCode() {
        return this.f70052a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70052a);
    }
}

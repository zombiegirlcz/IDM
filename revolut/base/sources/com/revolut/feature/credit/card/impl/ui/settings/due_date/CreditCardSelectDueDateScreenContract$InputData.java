package com.revolut.feature.credit.card.impl.ui.settings.due_date;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/settings/due_date/CreditCardSelectDueDateScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardSelectDueDateScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardSelectDueDateScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f69632c;
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
                iE = j6.a.e(CreditCardSelectDueDateScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CreditCardSelectDueDateScreenContract$InputData(string, i, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardSelectDueDateScreenContract$InputData[i];
        }
    }

    public CreditCardSelectDueDateScreenContract$InputData(String facilityId, int i, ArrayList dueDateSelections, Integer num) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(dueDateSelections, "dueDateSelections");
        this.f69630a = facilityId;
        this.f69631b = i;
        this.f69632c = dueDateSelections;
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
        if (!(obj2 instanceof CreditCardSelectDueDateScreenContract$InputData)) {
            return false;
        }
        CreditCardSelectDueDateScreenContract$InputData creditCardSelectDueDateScreenContract$InputData = (CreditCardSelectDueDateScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69630a, creditCardSelectDueDateScreenContract$InputData.f69630a) && this.f69631b == creditCardSelectDueDateScreenContract$InputData.f69631b && this.f69632c.equals(creditCardSelectDueDateScreenContract$InputData.f69632c) && Intrinsics.f(this.d, creditCardSelectDueDateScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f69632c, j6.a.b(this.f69631b, this.f69630a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69630a);
        dest.writeInt(this.f69631b);
        Iterator itY = j6.a.y(this.f69632c, dest);
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

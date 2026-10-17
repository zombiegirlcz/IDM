package com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.domain.TermsStep;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/terms_and_conditions/TermsAndConditionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TermsAndConditionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TermsAndConditionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f64075a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TermsStep.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TermsAndConditionsScreenContract$InputData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TermsAndConditionsScreenContract$InputData[i];
        }
    }

    public TermsAndConditionsScreenContract$InputData(List terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f64075a = terms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TermsAndConditionsScreenContract$InputData) && Intrinsics.f(this.f64075a, ((TermsAndConditionsScreenContract$InputData) obj2).f64075a);
    }

    public final int hashCode() {
        return this.f64075a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f64075a, dest);
        while (itV.hasNext()) {
            ((TermsStep) itV.next()).writeToParcel(dest, i);
        }
    }
}

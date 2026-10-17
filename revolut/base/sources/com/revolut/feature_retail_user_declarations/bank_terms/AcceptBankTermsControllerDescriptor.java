package com.revolut.feature_retail_user_declarations.bank_terms;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsControllerDescriptor;", "Laii/e;", "Lbai/j;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcceptBankTermsControllerDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<AcceptBankTermsControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcceptBankTermsScreenContract$InputData f97480a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcceptBankTermsControllerDescriptor(AcceptBankTermsScreenContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcceptBankTermsControllerDescriptor[i];
        }
    }

    public AcceptBankTermsControllerDescriptor(AcceptBankTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f97480a = inputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AcceptBankTermsScreenContract$InputData getF97480a() {
        return this.f97480a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AcceptBankTermsControllerDescriptor) && Intrinsics.f(this.f97480a, ((AcceptBankTermsControllerDescriptor) obj2).f97480a);
    }

    public final int hashCode() {
        return this.f97480a.f97486a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97480a.writeToParcel(dest, i);
    }
}

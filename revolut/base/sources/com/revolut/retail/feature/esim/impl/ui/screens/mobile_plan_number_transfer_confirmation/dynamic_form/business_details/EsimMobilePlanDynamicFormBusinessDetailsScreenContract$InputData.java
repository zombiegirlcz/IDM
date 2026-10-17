package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/business_details/EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingDynamicFormRequest f101261c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingDynamicFormRequest esimPhoneNumberPortingDynamicFormRequestCreateFromParcel = EsimPhoneNumberPortingDynamicFormRequest.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData(string, string2, esimPhoneNumberPortingDynamicFormRequestCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData(String subscriptionId, String phoneNumber, EsimPhoneNumberPortingDynamicFormRequest dynamicFormRequest, List attributes) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(dynamicFormRequest, "dynamicFormRequest");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f101259a = subscriptionId;
        this.f101260b = phoneNumber;
        this.f101261c = dynamicFormRequest;
        this.d = attributes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData = (EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101259a, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.f101259a) && Intrinsics.f(this.f101260b, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.f101260b) && Intrinsics.f(this.f101261c, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.f101261c) && Intrinsics.f(this.d, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f101261c.hashCode() + p.a.c(this.f101259a.hashCode() * 31, 31, this.f101260b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101259a);
        dest.writeString(this.f101260b);
        this.f101261c.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}

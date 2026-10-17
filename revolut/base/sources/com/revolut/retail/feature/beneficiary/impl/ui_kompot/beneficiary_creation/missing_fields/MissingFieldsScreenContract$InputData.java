package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.common.mapper.backend_fields.input.LocaleExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MissingFieldsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MissingFieldsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f99762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocaleExtraData f99763b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(MissingFieldsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new MissingFieldsScreenContract$InputData(arrayList, LocaleExtraData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MissingFieldsScreenContract$InputData[i];
        }
    }

    public MissingFieldsScreenContract$InputData(List backendDefinitions, LocaleExtraData localeExtraData) {
        Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
        Intrinsics.checkNotNullParameter(localeExtraData, "localeExtraData");
        this.f99762a = backendDefinitions;
        this.f99763b = localeExtraData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MissingFieldsScreenContract$InputData)) {
            return false;
        }
        MissingFieldsScreenContract$InputData missingFieldsScreenContract$InputData = (MissingFieldsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99762a, missingFieldsScreenContract$InputData.f99762a) && Intrinsics.f(this.f99763b, missingFieldsScreenContract$InputData.f99763b);
    }

    public final int hashCode() {
        return this.f99763b.hashCode() + (this.f99762a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f99762a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        this.f99763b.writeToParcel(dest, i);
    }
}

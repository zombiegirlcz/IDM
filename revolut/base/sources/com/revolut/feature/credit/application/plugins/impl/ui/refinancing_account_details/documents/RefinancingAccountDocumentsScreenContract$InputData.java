package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import dx4.p4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/documents/RefinancingAccountDocumentsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefinancingAccountDocumentsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RefinancingAccountDocumentsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4 f68252c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RefinancingAccountDocumentsScreenContract$InputData(parcel.readString(), parcel.readString(), (p4) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(RefinancingAccountDocumentsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RefinancingAccountDocumentsScreenContract$InputData[i];
        }
    }

    public RefinancingAccountDocumentsScreenContract$InputData(String facilityId, String categoryId, p4 initialScreenContent, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(initialScreenContent, "initialScreenContent");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68250a = facilityId;
        this.f68251b = categoryId;
        this.f68252c = initialScreenContent;
        this.d = pluginConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RefinancingAccountDocumentsScreenContract$InputData)) {
            return false;
        }
        RefinancingAccountDocumentsScreenContract$InputData refinancingAccountDocumentsScreenContract$InputData = (RefinancingAccountDocumentsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68250a, refinancingAccountDocumentsScreenContract$InputData.f68250a) && Intrinsics.f(this.f68251b, refinancingAccountDocumentsScreenContract$InputData.f68251b) && Intrinsics.f(this.f68252c, refinancingAccountDocumentsScreenContract$InputData.f68252c) && Intrinsics.f(this.d, refinancingAccountDocumentsScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f68252c.hashCode() + p.a.c(this.f68250a.hashCode() * 31, 31, this.f68251b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68250a);
        dest.writeString(this.f68251b);
        dest.writeSerializable(this.f68252c);
        dest.writeParcelable(this.d, i);
    }
}

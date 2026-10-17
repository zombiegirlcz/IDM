package com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/documents_redesigned/document_selector/extensions/GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f81417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f81418b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem((UUID) parcel.readSerializable(), q0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem[i];
        }
    }

    public GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem(UUID portfolioId, q0 holderType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(holderType, "holderType");
        this.f81417a = portfolioId;
        this.f81418b = holderType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem)) {
            return false;
        }
        GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem generalInvestmentsSelectorControllerExtension$GeneralInvestmentsItem = (GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem) obj2;
        return Intrinsics.f(this.f81417a, generalInvestmentsSelectorControllerExtension$GeneralInvestmentsItem.f81417a) && this.f81418b == generalInvestmentsSelectorControllerExtension$GeneralInvestmentsItem.f81418b;
    }

    public final int hashCode() {
        return this.f81418b.hashCode() + (this.f81417a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81417a);
        dest.writeString(this.f81418b.name());
    }
}

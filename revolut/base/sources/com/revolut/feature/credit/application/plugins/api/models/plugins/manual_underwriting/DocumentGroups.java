package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/DocumentGroups;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentGroups implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentGroups> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f66465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OptionalDocumentsContent f66467c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(ReferralFlagDetails.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ReferralFlagDetails.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new DocumentGroups(arrayList, arrayList2, parcel.readInt() == 0 ? null : OptionalDocumentsContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentGroups[i];
        }
    }

    public DocumentGroups() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentGroups)) {
            return false;
        }
        DocumentGroups documentGroups = (DocumentGroups) obj2;
        return Intrinsics.f(this.f66465a, documentGroups.f66465a) && Intrinsics.f(this.f66466b, documentGroups.f66466b) && Intrinsics.f(this.f66467c, documentGroups.f66467c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f66465a.hashCode() * 31, 31, this.f66466b);
        OptionalDocumentsContent optionalDocumentsContent = this.f66467c;
        return iD + (optionalDocumentsContent == null ? 0 : optionalDocumentsContent.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f66465a, dest);
        while (itV.hasNext()) {
            ((ReferralFlagDetails) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f66466b, dest);
        while (itV2.hasNext()) {
            ((ReferralFlagDetails) itV2.next()).writeToParcel(dest, i);
        }
        OptionalDocumentsContent optionalDocumentsContent = this.f66467c;
        if (optionalDocumentsContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            optionalDocumentsContent.writeToParcel(dest, i);
        }
    }

    public DocumentGroups(List mandatoryReferralFlagsDetails, List optionalReferralFlagsDetails, OptionalDocumentsContent optionalDocumentsContent) {
        Intrinsics.checkNotNullParameter(mandatoryReferralFlagsDetails, "mandatoryReferralFlagsDetails");
        Intrinsics.checkNotNullParameter(optionalReferralFlagsDetails, "optionalReferralFlagsDetails");
        this.f66465a = mandatoryReferralFlagsDetails;
        this.f66466b = optionalReferralFlagsDetails;
        this.f66467c = optionalDocumentsContent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DocumentGroups(int i) {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var, null);
    }
}

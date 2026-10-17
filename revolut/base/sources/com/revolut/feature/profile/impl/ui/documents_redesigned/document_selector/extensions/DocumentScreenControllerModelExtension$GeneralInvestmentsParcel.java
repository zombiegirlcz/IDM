package com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import hel.b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/documents_redesigned/document_selector/extensions/DocumentScreenControllerModelExtension$GeneralInvestmentsParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentScreenControllerModelExtension$GeneralInvestmentsParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentScreenControllerModelExtension$GeneralInvestmentsParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f81413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f81414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f81415c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentScreenControllerModelExtension$GeneralInvestmentsParcel((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentScreenControllerModelExtension$GeneralInvestmentsParcel[i];
        }
    }

    public DocumentScreenControllerModelExtension$GeneralInvestmentsParcel(UUID uuid, UUID uuid2, b bVar) {
        this.f81413a = uuid;
        this.f81414b = uuid2;
        this.f81415c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentScreenControllerModelExtension$GeneralInvestmentsParcel)) {
            return false;
        }
        DocumentScreenControllerModelExtension$GeneralInvestmentsParcel documentScreenControllerModelExtension$GeneralInvestmentsParcel = (DocumentScreenControllerModelExtension$GeneralInvestmentsParcel) obj2;
        return Intrinsics.f(this.f81413a, documentScreenControllerModelExtension$GeneralInvestmentsParcel.f81413a) && Intrinsics.f(this.f81414b, documentScreenControllerModelExtension$GeneralInvestmentsParcel.f81414b) && this.f81415c == documentScreenControllerModelExtension$GeneralInvestmentsParcel.f81415c;
    }

    public final int hashCode() {
        UUID uuid = this.f81413a;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UUID uuid2 = this.f81414b;
        int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        b bVar = this.f81415c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81413a);
        dest.writeSerializable(this.f81414b);
        b bVar = this.f81415c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
    }
}

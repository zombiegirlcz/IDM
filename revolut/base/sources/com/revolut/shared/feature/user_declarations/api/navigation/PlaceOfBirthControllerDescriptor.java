package com.revolut.shared.feature.user_declarations.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/navigation/PlaceOfBirthControllerDescriptor;", "Laii/e;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceOfBirthControllerDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlaceOfBirthControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaceOfBirthFlowInputData f105070a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaceOfBirthControllerDescriptor(PlaceOfBirthFlowInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaceOfBirthControllerDescriptor[i];
        }
    }

    public PlaceOfBirthControllerDescriptor(PlaceOfBirthFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f105070a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PlaceOfBirthControllerDescriptor) && Intrinsics.f(this.f105070a, ((PlaceOfBirthControllerDescriptor) obj2).f105070a);
    }

    public final int hashCode() {
        return this.f105070a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f105070a.writeToParcel(dest, i);
    }

    public PlaceOfBirthControllerDescriptor() {
        this(new PlaceOfBirthFlowInputData(null, null, null, null, null, CertificateBody.profileType));
    }
}

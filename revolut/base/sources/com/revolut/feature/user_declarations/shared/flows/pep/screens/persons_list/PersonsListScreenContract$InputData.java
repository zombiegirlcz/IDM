package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonsListScreenContract$InputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PersonsListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PepFlowControllerDescriptor$UseCase f94664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94665b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PersonsListScreenContract$InputData((PepFlowControllerDescriptor$UseCase) parcel.readParcelable(PersonsListScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersonsListScreenContract$InputData[i];
        }
    }

    public PersonsListScreenContract$InputData(PepFlowControllerDescriptor$UseCase useCase, boolean z) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f94664a = useCase;
        this.f94665b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersonsListScreenContract$InputData)) {
            return false;
        }
        PersonsListScreenContract$InputData personsListScreenContract$InputData = (PersonsListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94664a, personsListScreenContract$InputData.f94664a) && this.f94665b == personsListScreenContract$InputData.f94665b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94665b) + (this.f94664a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94664a, i);
        dest.writeInt(this.f94665b ? 1 : 0);
    }
}

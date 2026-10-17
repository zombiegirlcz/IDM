package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$DomainState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonsListScreenContract$DomainState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<PersonsListScreenContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PepFlowControllerDescriptor$UseCase f94662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f94663b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PepFlowControllerDescriptor$UseCase pepFlowControllerDescriptor$UseCase = (PepFlowControllerDescriptor$UseCase) j6.a.f(parcel, "parcel", PersonsListScreenContract$DomainState.class);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), PersonalDetails.CREATOR.createFromParcel(parcel));
            }
            return new PersonsListScreenContract$DomainState(pepFlowControllerDescriptor$UseCase, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersonsListScreenContract$DomainState[i];
        }
    }

    public PersonsListScreenContract$DomainState(PepFlowControllerDescriptor$UseCase useCase, Map pepConnections) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(pepConnections, "pepConnections");
        this.f94662a = useCase;
        this.f94663b = pepConnections;
    }

    public static PersonsListScreenContract$DomainState a(PersonsListScreenContract$DomainState personsListScreenContract$DomainState, Map pepConnections) {
        PepFlowControllerDescriptor$UseCase useCase = personsListScreenContract$DomainState.f94662a;
        personsListScreenContract$DomainState.getClass();
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(pepConnections, "pepConnections");
        return new PersonsListScreenContract$DomainState(useCase, pepConnections);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersonsListScreenContract$DomainState)) {
            return false;
        }
        PersonsListScreenContract$DomainState personsListScreenContract$DomainState = (PersonsListScreenContract$DomainState) obj2;
        return Intrinsics.f(this.f94662a, personsListScreenContract$DomainState.f94662a) && Intrinsics.f(this.f94663b, personsListScreenContract$DomainState.f94663b);
    }

    public final int hashCode() {
        return this.f94663b.hashCode() + (this.f94662a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94662a, i);
        Iterator itZ = j6.a.z(this.f94663b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            ((PersonalDetails) entry.getValue()).writeToParcel(dest, i);
        }
    }
}

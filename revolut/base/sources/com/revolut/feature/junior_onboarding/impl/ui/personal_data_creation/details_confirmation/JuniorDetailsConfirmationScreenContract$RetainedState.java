package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/JuniorDetailsConfirmationScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorDetailsConfirmationScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<JuniorDetailsConfirmationScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f77026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f77027b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new JuniorDetailsConfirmationScreenContract$RetainedState(linkedHashSet, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorDetailsConfirmationScreenContract$RetainedState[i];
        }
    }

    public JuniorDetailsConfirmationScreenContract$RetainedState(Set checkedIds, Map consentsState) {
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        Intrinsics.checkNotNullParameter(consentsState, "consentsState");
        this.f77026a = checkedIds;
        this.f77027b = consentsState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorDetailsConfirmationScreenContract$RetainedState)) {
            return false;
        }
        JuniorDetailsConfirmationScreenContract$RetainedState juniorDetailsConfirmationScreenContract$RetainedState = (JuniorDetailsConfirmationScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f77026a, juniorDetailsConfirmationScreenContract$RetainedState.f77026a) && Intrinsics.f(this.f77027b, juniorDetailsConfirmationScreenContract$RetainedState.f77027b);
    }

    public final int hashCode() {
        return this.f77027b.hashCode() + (this.f77026a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f77026a, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itZ = j6.a.z(this.f77027b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }
}

package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/contacts_chooser/api/navigation/ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle", "", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66076a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle((Clause) parcel.readParcelable(ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle[i];
        }
    }

    public ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f66076a = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle) && Intrinsics.f(this.f66076a, ((ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle) obj2).f66076a);
    }

    public final int hashCode() {
        return this.f66076a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66076a, i);
    }
}

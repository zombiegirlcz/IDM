package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.ResourceId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonsListScreenConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PersonsListScreenConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceId f94659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceId f94660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceId f94661c;
    public final ResourceId d;
    public final ResourceId e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PersonsListScreenConfiguration((ResourceId) parcel.readParcelable(PersonsListScreenConfiguration.class.getClassLoader()), (ResourceId) parcel.readParcelable(PersonsListScreenConfiguration.class.getClassLoader()), (ResourceId) parcel.readParcelable(PersonsListScreenConfiguration.class.getClassLoader()), (ResourceId) parcel.readParcelable(PersonsListScreenConfiguration.class.getClassLoader()), (ResourceId) parcel.readParcelable(PersonsListScreenConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersonsListScreenConfiguration[i];
        }
    }

    public PersonsListScreenConfiguration(ResourceId titleResId, ResourceId subtitleResId, ResourceId resourceId, ResourceId subheaderResId, ResourceId emptyStateBannerResId) {
        Intrinsics.checkNotNullParameter(titleResId, "titleResId");
        Intrinsics.checkNotNullParameter(subtitleResId, "subtitleResId");
        Intrinsics.checkNotNullParameter(subheaderResId, "subheaderResId");
        Intrinsics.checkNotNullParameter(emptyStateBannerResId, "emptyStateBannerResId");
        this.f94659a = titleResId;
        this.f94660b = subtitleResId;
        this.f94661c = resourceId;
        this.d = subheaderResId;
        this.e = emptyStateBannerResId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersonsListScreenConfiguration)) {
            return false;
        }
        PersonsListScreenConfiguration personsListScreenConfiguration = (PersonsListScreenConfiguration) obj2;
        return Intrinsics.f(this.f94659a, personsListScreenConfiguration.f94659a) && Intrinsics.f(this.f94660b, personsListScreenConfiguration.f94660b) && Intrinsics.f(this.f94661c, personsListScreenConfiguration.f94661c) && Intrinsics.f(this.d, personsListScreenConfiguration.d) && Intrinsics.f(this.e, personsListScreenConfiguration.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f94660b.hashCode() + (this.f94659a.hashCode() * 31)) * 31;
        ResourceId resourceId = this.f94661c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (resourceId == null ? 0 : resourceId.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94659a, i);
        dest.writeParcelable(this.f94660b, i);
        dest.writeParcelable(this.f94661c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}

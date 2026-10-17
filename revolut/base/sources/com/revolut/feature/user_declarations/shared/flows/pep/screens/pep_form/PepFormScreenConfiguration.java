package com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.ResourceId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PepFormScreenConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PepFormScreenConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceId f94648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceId f94649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceId f94650c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PepFormScreenConfiguration((ResourceId) parcel.readParcelable(PepFormScreenConfiguration.class.getClassLoader()), (ResourceId) parcel.readParcelable(PepFormScreenConfiguration.class.getClassLoader()), (ResourceId) parcel.readParcelable(PepFormScreenConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PepFormScreenConfiguration[i];
        }
    }

    public PepFormScreenConfiguration(ResourceId titleResId, ResourceId subtitleResId, ResourceId resourceId) {
        Intrinsics.checkNotNullParameter(titleResId, "titleResId");
        Intrinsics.checkNotNullParameter(subtitleResId, "subtitleResId");
        this.f94648a = titleResId;
        this.f94649b = subtitleResId;
        this.f94650c = resourceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PepFormScreenConfiguration)) {
            return false;
        }
        PepFormScreenConfiguration pepFormScreenConfiguration = (PepFormScreenConfiguration) obj2;
        return Intrinsics.f(this.f94648a, pepFormScreenConfiguration.f94648a) && Intrinsics.f(this.f94649b, pepFormScreenConfiguration.f94649b) && Intrinsics.f(this.f94650c, pepFormScreenConfiguration.f94650c);
    }

    public final int hashCode() {
        int iHashCode = (this.f94649b.hashCode() + (this.f94648a.hashCode() * 31)) * 31;
        ResourceId resourceId = this.f94650c;
        return iHashCode + (resourceId == null ? 0 : resourceId.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94648a, i);
        dest.writeParcelable(this.f94649b, i);
        dest.writeParcelable(this.f94650c, i);
    }
}

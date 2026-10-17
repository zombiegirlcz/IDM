package com.revolut.feature.junior_coparent.impl.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_coparent/impl/provider/CoparentConfirmationDialogProvider$DialogConfiguration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_coparent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoparentConfirmationDialogProvider$DialogConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CoparentConfirmationDialogProvider$DialogConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f76873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f76874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f76875c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoparentConfirmationDialogProvider$DialogConfiguration((Clause) parcel.readParcelable(CoparentConfirmationDialogProvider$DialogConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(CoparentConfirmationDialogProvider$DialogConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(CoparentConfirmationDialogProvider$DialogConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(CoparentConfirmationDialogProvider$DialogConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoparentConfirmationDialogProvider$DialogConfiguration[i];
        }
    }

    public CoparentConfirmationDialogProvider$DialogConfiguration(Clause title, Clause description, Clause primaryActionLabel, Clause secondaryActionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(secondaryActionLabel, "secondaryActionLabel");
        this.f76873a = title;
        this.f76874b = description;
        this.f76875c = primaryActionLabel;
        this.d = secondaryActionLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoparentConfirmationDialogProvider$DialogConfiguration)) {
            return false;
        }
        CoparentConfirmationDialogProvider$DialogConfiguration coparentConfirmationDialogProvider$DialogConfiguration = (CoparentConfirmationDialogProvider$DialogConfiguration) obj2;
        return Intrinsics.f(this.f76873a, coparentConfirmationDialogProvider$DialogConfiguration.f76873a) && Intrinsics.f(this.f76874b, coparentConfirmationDialogProvider$DialogConfiguration.f76874b) && Intrinsics.f(this.f76875c, coparentConfirmationDialogProvider$DialogConfiguration.f76875c) && Intrinsics.f(this.d, coparentConfirmationDialogProvider$DialogConfiguration.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f76873a.hashCode() * 31, 31, this.f76874b), 31, this.f76875c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76873a, i);
        dest.writeParcelable(this.f76874b, i);
        dest.writeParcelable(this.f76875c, i);
        dest.writeParcelable(this.d, i);
    }
}

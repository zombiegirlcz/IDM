package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vh8.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/JuniorDetailsConfirmationScreenContract$UiConfiguration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorDetailsConfirmationScreenContract$UiConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorDetailsConfirmationScreenContract$UiConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f77028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f77030c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorDetailsConfirmationScreenContract$UiConfiguration((Clause) parcel.readParcelable(JuniorDetailsConfirmationScreenContract$UiConfiguration.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(JuniorDetailsConfirmationScreenContract$UiConfiguration.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorDetailsConfirmationScreenContract$UiConfiguration[i];
        }
    }

    public JuniorDetailsConfirmationScreenContract$UiConfiguration(Clause subtitle, boolean z, Clause actionLabel, d termsRepresentation) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        Intrinsics.checkNotNullParameter(termsRepresentation, "termsRepresentation");
        this.f77028a = subtitle;
        this.f77029b = z;
        this.f77030c = actionLabel;
        this.d = termsRepresentation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorDetailsConfirmationScreenContract$UiConfiguration)) {
            return false;
        }
        JuniorDetailsConfirmationScreenContract$UiConfiguration juniorDetailsConfirmationScreenContract$UiConfiguration = (JuniorDetailsConfirmationScreenContract$UiConfiguration) obj2;
        return Intrinsics.f(this.f77028a, juniorDetailsConfirmationScreenContract$UiConfiguration.f77028a) && this.f77029b == juniorDetailsConfirmationScreenContract$UiConfiguration.f77029b && Intrinsics.f(this.f77030c, juniorDetailsConfirmationScreenContract$UiConfiguration.f77030c) && this.d == juniorDetailsConfirmationScreenContract$UiConfiguration.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(j6.a.c(this.f77028a.hashCode() * 31, 31, this.f77029b), 31, this.f77030c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77028a, i);
        dest.writeInt(this.f77029b ? 1 : 0);
        dest.writeParcelable(this.f77030c, i);
        dest.writeString(this.d.name());
    }
}

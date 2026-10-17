package com.revolut.feature.credit.application.plugins.api.models.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/IncompleteApplicationRetention;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncompleteApplicationRetention implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncompleteApplicationRetention> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention.Application f66442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f66444c;
    public final LocalDate d;
    public final LocalDate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncompleteApplicationRetention((ConsentRetention.Application) parcel.readParcelable(IncompleteApplicationRetention.class.getClassLoader()), parcel.readInt(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncompleteApplicationRetention[i];
        }
    }

    public IncompleteApplicationRetention(ConsentRetention.Application selection, int i, LocalDate minimumExpirationDate, LocalDate maximumExpirationDate, LocalDate suggestedCustomExpirationDate) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(minimumExpirationDate, "minimumExpirationDate");
        Intrinsics.checkNotNullParameter(maximumExpirationDate, "maximumExpirationDate");
        Intrinsics.checkNotNullParameter(suggestedCustomExpirationDate, "suggestedCustomExpirationDate");
        this.f66442a = selection;
        this.f66443b = i;
        this.f66444c = minimumExpirationDate;
        this.d = maximumExpirationDate;
        this.e = suggestedCustomExpirationDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncompleteApplicationRetention)) {
            return false;
        }
        IncompleteApplicationRetention incompleteApplicationRetention = (IncompleteApplicationRetention) obj2;
        return Intrinsics.f(this.f66442a, incompleteApplicationRetention.f66442a) && this.f66443b == incompleteApplicationRetention.f66443b && Intrinsics.f(this.f66444c, incompleteApplicationRetention.f66444c) && Intrinsics.f(this.d, incompleteApplicationRetention.d) && Intrinsics.f(this.e, incompleteApplicationRetention.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.a(y.a(j6.a.b(this.f66443b, this.f66442a.hashCode() * 31, 31), 31, this.f66444c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66442a, i);
        dest.writeInt(this.f66443b);
        dest.writeSerializable(this.f66444c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}

package com.revolut.feature.terminated_users.impl.ui.logout_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/terminated_users/impl/ui/logout_confirmation/LogoutConfirmationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_terminated_users_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LogoutConfirmationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LogoutConfirmationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f90347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f90348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f90349c;
    public final Clause d;
    public final UserOnboardingNavigationProvider$UseCase e;
    public final AnalyticsProduct f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LogoutConfirmationFlowContract$InputData((Clause) parcel.readParcelable(LogoutConfirmationFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(LogoutConfirmationFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(LogoutConfirmationFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(LogoutConfirmationFlowContract$InputData.class.getClassLoader()), (UserOnboardingNavigationProvider$UseCase) parcel.readParcelable(LogoutConfirmationFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(LogoutConfirmationFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LogoutConfirmationFlowContract$InputData[i];
        }
    }

    public LogoutConfirmationFlowContract$InputData(Clause title, Clause subtitle, Clause cancelButton, Clause logoutButton, UserOnboardingNavigationProvider$UseCase useCase, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        Intrinsics.checkNotNullParameter(logoutButton, "logoutButton");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90347a = title;
        this.f90348b = subtitle;
        this.f90349c = cancelButton;
        this.d = logoutButton;
        this.e = useCase;
        this.f = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LogoutConfirmationFlowContract$InputData)) {
            return false;
        }
        LogoutConfirmationFlowContract$InputData logoutConfirmationFlowContract$InputData = (LogoutConfirmationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90347a, logoutConfirmationFlowContract$InputData.f90347a) && Intrinsics.f(this.f90348b, logoutConfirmationFlowContract$InputData.f90348b) && Intrinsics.f(this.f90349c, logoutConfirmationFlowContract$InputData.f90349c) && Intrinsics.f(this.d, logoutConfirmationFlowContract$InputData.d) && Intrinsics.f(this.e, logoutConfirmationFlowContract$InputData.e) && Intrinsics.f(this.f, logoutConfirmationFlowContract$InputData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.a(p.a.a(p.a.a(this.f90347a.hashCode() * 31, 31, this.f90348b), 31, this.f90349c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90347a, i);
        dest.writeParcelable(this.f90348b, i);
        dest.writeParcelable(this.f90349c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}

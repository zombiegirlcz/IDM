package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/forbearance/application/impl/ui/forbearance/questionnaire/ForbearanceApplicationQuestionnaireContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForbearanceApplicationQuestionnaireContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ForbearanceApplicationQuestionnaireContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowContract$Configuration f69944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69945b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ForbearanceApplicationQuestionnaireContract$Configuration((BackendFlowContract$Configuration) parcel.readParcelable(ForbearanceApplicationQuestionnaireContract$Configuration.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ForbearanceApplicationQuestionnaireContract$Configuration[i];
        }
    }

    public ForbearanceApplicationQuestionnaireContract$Configuration(BackendFlowContract$Configuration baseConfiguration, String facilityId) {
        Intrinsics.checkNotNullParameter(baseConfiguration, "baseConfiguration");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f69944a = baseConfiguration;
        this.f69945b = facilityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ForbearanceApplicationQuestionnaireContract$Configuration)) {
            return false;
        }
        ForbearanceApplicationQuestionnaireContract$Configuration forbearanceApplicationQuestionnaireContract$Configuration = (ForbearanceApplicationQuestionnaireContract$Configuration) obj2;
        return Intrinsics.f(this.f69944a, forbearanceApplicationQuestionnaireContract$Configuration.f69944a) && Intrinsics.f(this.f69945b, forbearanceApplicationQuestionnaireContract$Configuration.f69945b);
    }

    public final int hashCode() {
        return this.f69945b.hashCode() + (this.f69944a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69944a, i);
        dest.writeString(this.f69945b);
    }
}

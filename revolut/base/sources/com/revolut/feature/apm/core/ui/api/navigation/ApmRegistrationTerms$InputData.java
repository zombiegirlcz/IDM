package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmRegistrationTerms$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmRegistrationTerms$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmRegistrationTerms$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f62273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f62274c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmRegistrationTerms$InputData(parcel.readString(), (Clause) parcel.readParcelable(ApmRegistrationTerms$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(ApmRegistrationTerms$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(ApmRegistrationTerms$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmRegistrationTerms$InputData[i];
        }
    }

    public ApmRegistrationTerms$InputData(String uri2, Clause title, Clause subtitle, Clause cta2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f62272a = uri2;
        this.f62273b = title;
        this.f62274c = subtitle;
        this.d = cta2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmRegistrationTerms$InputData)) {
            return false;
        }
        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = (ApmRegistrationTerms$InputData) obj2;
        return Intrinsics.f(this.f62272a, apmRegistrationTerms$InputData.f62272a) && Intrinsics.f(this.f62273b, apmRegistrationTerms$InputData.f62273b) && Intrinsics.f(this.f62274c, apmRegistrationTerms$InputData.f62274c) && Intrinsics.f(this.d, apmRegistrationTerms$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f62272a.hashCode() * 31, 31, this.f62273b), 31, this.f62274c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62272a);
        dest.writeParcelable(this.f62273b, i);
        dest.writeParcelable(this.f62274c, i);
        dest.writeParcelable(this.d, i);
    }
}

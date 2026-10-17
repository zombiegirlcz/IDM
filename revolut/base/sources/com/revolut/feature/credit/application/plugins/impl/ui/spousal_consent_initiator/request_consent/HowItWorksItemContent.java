package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/request_consent/HowItWorksItemContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HowItWorksItemContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HowItWorksItemContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f68451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f68452b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HowItWorksItemContent((Clause) parcel.readParcelable(HowItWorksItemContent.class.getClassLoader()), (Clause) parcel.readParcelable(HowItWorksItemContent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HowItWorksItemContent[i];
        }
    }

    public HowItWorksItemContent(Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f68451a = title;
        this.f68452b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HowItWorksItemContent)) {
            return false;
        }
        HowItWorksItemContent howItWorksItemContent = (HowItWorksItemContent) obj2;
        return Intrinsics.f(this.f68451a, howItWorksItemContent.f68451a) && Intrinsics.f(this.f68452b, howItWorksItemContent.f68452b);
    }

    public final int hashCode() {
        return this.f68452b.hashCode() + (this.f68451a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68451a, i);
        dest.writeParcelable(this.f68452b, i);
    }
}

package com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorSecurityAndPrivacyControllerContract$Destination extends InternalDestination<JuniorSecurityAndPrivacyControllerContract$InputData> {

    @NotNull
    public static final Parcelable.Creator<JuniorSecurityAndPrivacyControllerContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorSecurityAndPrivacyControllerContract$InputData f77323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f77324c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorSecurityAndPrivacyControllerContract$Destination(JuniorSecurityAndPrivacyControllerContract$InputData.CREATOR.createFromParcel(parcel), (TransitionAnimation) parcel.readParcelable(JuniorSecurityAndPrivacyControllerContract$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorSecurityAndPrivacyControllerContract$Destination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorSecurityAndPrivacyControllerContract$Destination(JuniorSecurityAndPrivacyControllerContract$InputData input, TransitionAnimation transitionAnimation) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.f77323b = input;
        this.f77324c = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF77324c() {
        return this.f77324c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorSecurityAndPrivacyControllerContract$Destination)) {
            return false;
        }
        JuniorSecurityAndPrivacyControllerContract$Destination juniorSecurityAndPrivacyControllerContract$Destination = (JuniorSecurityAndPrivacyControllerContract$Destination) obj2;
        return Intrinsics.f(this.f77323b, juniorSecurityAndPrivacyControllerContract$Destination.f77323b) && Intrinsics.f(this.f77324c, juniorSecurityAndPrivacyControllerContract$Destination.f77324c);
    }

    public final int hashCode() {
        int iHashCode = this.f77323b.f77325a.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f77324c;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f77323b.writeToParcel(dest, i);
        dest.writeParcelable(this.f77324c, i);
    }
}

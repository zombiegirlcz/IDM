package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer_v2/content/top_item/TopItemOfferContentScreenContract$OfferContentPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopItemOfferContentScreenContract$OfferContentPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopItemOfferContentScreenContract$OfferContentPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedBackgroundType f68145a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopItemOfferContentScreenContract$OfferContentPayload((AnimatedBackgroundType) parcel.readParcelable(TopItemOfferContentScreenContract$OfferContentPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopItemOfferContentScreenContract$OfferContentPayload[i];
        }
    }

    public TopItemOfferContentScreenContract$OfferContentPayload(AnimatedBackgroundType animatedBackgroundType) {
        this.f68145a = animatedBackgroundType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TopItemOfferContentScreenContract$OfferContentPayload) && Intrinsics.f(this.f68145a, ((TopItemOfferContentScreenContract$OfferContentPayload) obj2).f68145a);
    }

    public final int hashCode() {
        AnimatedBackgroundType animatedBackgroundType = this.f68145a;
        if (animatedBackgroundType == null) {
            return 0;
        }
        return animatedBackgroundType.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68145a, i);
    }
}

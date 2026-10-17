package com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Animation", "Sso", "Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step$Animation;", "Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step$Sso;", "feature_wealth_protection_sso_animation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthProtectionSsoAnimationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step$Animation;", "Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step;", "<init>", "()V", "feature_wealth_protection_sso_animation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Animation implements WealthProtectionSsoAnimationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Animation f96296a = new Animation();

        @NotNull
        public static final Parcelable.Creator<Animation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Animation.f96296a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Animation[i];
            }
        }

        private Animation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step$Sso;", "Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$Step;", "<init>", "()V", "feature_wealth_protection_sso_animation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Sso implements WealthProtectionSsoAnimationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Sso f96297a = new Sso();

        @NotNull
        public static final Parcelable.Creator<Sso> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Sso.f96297a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sso[i];
            }
        }

        private Sso() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}

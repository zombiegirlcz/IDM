package com.revolut.feature.apm.blik.impl.ui.terms_acceptance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "TermsScreen", "Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step$TermsScreen;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlikTermsAcceptanceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step;", "<init>", "()V", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends BlikTermsAcceptanceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f61688a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f61688a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step$TermsScreen;", "Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/BlikTermsAcceptanceFlowContract$Step;", "<init>", "()V", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermsScreen extends BlikTermsAcceptanceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsScreen f61689a = new TermsScreen();

        @NotNull
        public static final Parcelable.Creator<TermsScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermsScreen.f61689a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsScreen[i];
            }
        }

        private TermsScreen() {
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

    private BlikTermsAcceptanceFlowContract$Step() {
    }
}

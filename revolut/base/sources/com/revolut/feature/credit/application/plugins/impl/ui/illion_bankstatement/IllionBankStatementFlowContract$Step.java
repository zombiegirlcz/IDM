package com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionInfoPopup;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionIntroConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "Modal", "Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Modal;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IllionBankStatementFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends IllionBankStatementFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IllionIntroConfig f67791a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((IllionIntroConfig) parcel.readParcelable(Intro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(IllionIntroConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67791a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67791a, ((Intro) obj2).f67791a);
        }

        public final int hashCode() {
            return this.f67791a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67791a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Modal;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step;", "<init>", "()V", "LearnMore", "Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Modal$LearnMore;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Modal extends IllionBankStatementFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Modal$LearnMore;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LearnMore extends Modal {

            @NotNull
            public static final Parcelable.Creator<LearnMore> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IllionInfoPopup f67792a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LearnMore((IllionInfoPopup) parcel.readParcelable(LearnMore.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LearnMore[i];
                }
            }

            public LearnMore(IllionInfoPopup popup) {
                Intrinsics.checkNotNullParameter(popup, "popup");
                this.f67792a = popup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof LearnMore) && Intrinsics.f(this.f67792a, ((LearnMore) obj2).f67792a);
            }

            public final int hashCode() {
                return this.f67792a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f67792a, i);
            }
        }

        private Modal() {
        }
    }

    private IllionBankStatementFlowContract$Step() {
    }
}

package com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthConfig;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthPopupConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Loading", "Content", "Popup", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step$Content;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step$Loading;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step$Popup;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditHealthFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step$Content;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements CreditHealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditHealthConfig f67395a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Content((CreditHealthConfig) parcel.readParcelable(Content.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(CreditHealthConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67395a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Content) && Intrinsics.f(this.f67395a, ((Content) obj2).f67395a);
        }

        public final int hashCode() {
            return this.f67395a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67395a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step$Loading;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements CreditHealthFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f67396a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f67396a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step$Popup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Popup implements CreditHealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Popup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditHealthPopupConfig f67397a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Popup((CreditHealthPopupConfig) parcel.readParcelable(Popup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(CreditHealthPopupConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67397a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Popup) && Intrinsics.f(this.f67397a, ((Popup) obj2).f67397a);
        }

        public final int hashCode() {
            return this.f67397a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67397a, i);
        }
    }
}

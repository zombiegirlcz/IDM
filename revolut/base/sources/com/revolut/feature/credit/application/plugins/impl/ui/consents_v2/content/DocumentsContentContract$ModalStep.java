package com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import dx4.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AmountInput", "EditPreferences", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep$AmountInput;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep$EditPreferences;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentsContentContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep$AmountInput;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountInput implements DocumentsContentContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f67305a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountInput((y) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        public AmountInput(y config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67305a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AmountInput) && Intrinsics.f(this.f67305a, ((AmountInput) obj2).f67305a);
        }

        public final int hashCode() {
            return this.f67305a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67305a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep$EditPreferences;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPreferences implements DocumentsContentContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditPreferences> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditPreferencesConfiguration f67306a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPreferences((EditPreferencesConfiguration) parcel.readParcelable(EditPreferences.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPreferences[i];
            }
        }

        public EditPreferences(EditPreferencesConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67306a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditPreferences) && Intrinsics.f(this.f67306a, ((EditPreferences) obj2).f67306a);
        }

        public final int hashCode() {
            return this.f67306a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67306a, i);
        }
    }
}

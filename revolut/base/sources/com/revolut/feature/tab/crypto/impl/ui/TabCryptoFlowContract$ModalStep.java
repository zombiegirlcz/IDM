package com.revolut.feature.tab.crypto.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.tab.crypto.models.TabCryptoModalStep;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Lcom/revolut/feature/tab/crypto/models/TabCryptoModalStep;", "ThemeCustomisation", "MicaAutoPrompt", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep$MicaAutoPrompt;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep$ThemeCustomisation;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TabCryptoFlowContract$ModalStep extends FlowStep, TabCryptoModalStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep$MicaAutoPrompt;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MicaAutoPrompt implements TabCryptoFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MicaAutoPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89791a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MicaAutoPrompt(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MicaAutoPrompt[i];
            }
        }

        public MicaAutoPrompt(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f89791a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MicaAutoPrompt) && Intrinsics.f(this.f89791a, ((MicaAutoPrompt) obj2).f89791a);
        }

        public final int hashCode() {
            return this.f89791a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89791a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep$ThemeCustomisation;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThemeCustomisation implements TabCryptoFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ThemeCustomisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThemedBackgroundKey f89792a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThemeCustomisation((ThemedBackgroundKey) parcel.readParcelable(ThemeCustomisation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThemeCustomisation[i];
            }
        }

        public ThemeCustomisation(ThemedBackgroundKey backgroundKey) {
            Intrinsics.checkNotNullParameter(backgroundKey, "backgroundKey");
            this.f89792a = backgroundKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ThemeCustomisation) && Intrinsics.f(this.f89792a, ((ThemeCustomisation) obj2).f89792a);
        }

        public final int hashCode() {
            return this.f89792a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89792a, i);
        }
    }
}

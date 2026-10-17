package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dx4.z2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/CreditPromptScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Info", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/CreditPromptScreenContract$ModalStep$Info;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditPromptScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/CreditPromptScreenContract$ModalStep$Info;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/CreditPromptScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info implements CreditPromptScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z2 f67332a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((z2) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(z2 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67332a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f67332a, ((Info) obj2).f67332a);
        }

        public final int hashCode() {
            return this.f67332a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67332a);
        }
    }
}

package com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Content", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step$Content;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step$Restricted;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimShareQrCodeFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step$Content;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Content extends EsimShareQrCodeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Content f100877a = new Content();

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Content.f100877a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        private Content() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted extends EsimShareQrCodeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100878a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Restricted((PromptMarketingScreenContract$InputData) parcel.readParcelable(Restricted.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        public Restricted(PromptMarketingScreenContract$InputData promptInput) {
            Intrinsics.checkNotNullParameter(promptInput, "promptInput");
            this.f100878a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100878a, ((Restricted) obj2).f100878a);
        }

        public final int hashCode() {
            return this.f100878a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100878a, i);
        }
    }

    private EsimShareQrCodeFlowContract$Step() {
    }
}

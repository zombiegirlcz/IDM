package com.revolut.feature.retail.main_screen.container.models.action_payload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/APMConfirmationPayload;", "Landroid/os/Parcelable;", "Companion", "IdealConfirmation", "a", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/APMConfirmationPayload$IdealConfirmation;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface APMConfirmationPayload extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f82729a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/APMConfirmationPayload$IdealConfirmation;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/APMConfirmationPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdealConfirmation implements APMConfirmationPayload {

        @NotNull
        public static final Parcelable.Creator<IdealConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82728b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdealConfirmation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdealConfirmation[i];
            }
        }

        public IdealConfirmation(String payloadUri, String signature) {
            Intrinsics.checkNotNullParameter(payloadUri, "payloadUri");
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f82727a = payloadUri;
            this.f82728b = signature;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IdealConfirmation)) {
                return false;
            }
            IdealConfirmation idealConfirmation = (IdealConfirmation) obj2;
            return Intrinsics.f(this.f82727a, idealConfirmation.f82727a) && Intrinsics.f(this.f82728b, idealConfirmation.f82728b);
        }

        public final int hashCode() {
            return this.f82728b.hashCode() + (this.f82727a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82727a);
            dest.writeString(this.f82728b);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.retail.main_screen.container.models.action_payload.APMConfirmationPayload$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f82729a = new Companion();

        private Companion() {
        }
    }
}

package com.revolut.feature.card_order_new.impl.kompot.screen.extra_security;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/extra_security/CardExtraSecurityControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChangeCardholderName", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/extra_security/CardExtraSecurityControllerContract$ModalStep$ChangeCardholderName;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardExtraSecurityControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/extra_security/CardExtraSecurityControllerContract$ModalStep$ChangeCardholderName;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/extra_security/CardExtraSecurityControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCardholderName implements CardExtraSecurityControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChangeCardholderName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65196b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeCardholderName(parcel.createStringArrayList(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCardholderName[i];
            }
        }

        public ChangeCardholderName(List suggestedNames, String currentName) {
            Intrinsics.checkNotNullParameter(suggestedNames, "suggestedNames");
            Intrinsics.checkNotNullParameter(currentName, "currentName");
            this.f65195a = suggestedNames;
            this.f65196b = currentName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeCardholderName)) {
                return false;
            }
            ChangeCardholderName changeCardholderName = (ChangeCardholderName) obj2;
            return Intrinsics.f(this.f65195a, changeCardholderName.f65195a) && Intrinsics.f(this.f65196b, changeCardholderName.f65196b);
        }

        public final int hashCode() {
            return this.f65196b.hashCode() + (this.f65195a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f65195a);
            dest.writeString(this.f65196b);
        }
    }
}

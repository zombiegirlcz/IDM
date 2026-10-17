package com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/card_screen/impl/prompts/switch_to_credit_card/SwitchToNewCreditCardPromptScreenContract$Parcel", "Landroid/os/Parcelable;", "<init>", "()V", "LinkedSubscriptions", "Lcom/revolut/feature/card_screen/impl/prompts/switch_to_credit_card/SwitchToNewCreditCardPromptScreenContract$Parcel$LinkedSubscriptions;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SwitchToNewCreditCardPromptScreenContract$Parcel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/prompts/switch_to_credit_card/SwitchToNewCreditCardPromptScreenContract$Parcel$LinkedSubscriptions;", "Lcom/revolut/feature/card_screen/impl/prompts/switch_to_credit_card/SwitchToNewCreditCardPromptScreenContract$Parcel;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedSubscriptions extends SwitchToNewCreditCardPromptScreenContract$Parcel {

        @NotNull
        public static final Parcelable.Creator<LinkedSubscriptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65516a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedSubscriptions(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedSubscriptions[i];
            }
        }

        public LinkedSubscriptions(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65516a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedSubscriptions) && Intrinsics.f(this.f65516a, ((LinkedSubscriptions) obj2).f65516a);
        }

        public final int hashCode() {
            return this.f65516a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65516a);
        }
    }

    private SwitchToNewCreditCardPromptScreenContract$Parcel() {
    }
}

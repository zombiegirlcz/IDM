package com.revolut.feature.add_card_to_google_pay_shared.impl.card_security;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.kompot.navigable.flow.FlowStep;
import kg1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/add_card_to_google_pay_shared/impl/card_security/CardSecurityFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CardSecurityPrompt", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/card_security/CardSecurityFlowContract$Step$CardSecurityPrompt;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardSecurityFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/card_security/CardSecurityFlowContract$Step$CardSecurityPrompt;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/card_security/CardSecurityFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardSecurityPrompt extends CardSecurityFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardSecurityPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharedRevolutCardWrapper f60869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f60870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f60871c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardSecurityPrompt((SharedRevolutCardWrapper) parcel.readParcelable(CardSecurityPrompt.class.getClassLoader()), parcel.readInt() != 0, d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSecurityPrompt[i];
            }
        }

        public CardSecurityPrompt(SharedRevolutCardWrapper cardWrapper, boolean z, d secondaryButtonType) {
            Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
            Intrinsics.checkNotNullParameter(secondaryButtonType, "secondaryButtonType");
            this.f60869a = cardWrapper;
            this.f60870b = z;
            this.f60871c = secondaryButtonType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardSecurityPrompt)) {
                return false;
            }
            CardSecurityPrompt cardSecurityPrompt = (CardSecurityPrompt) obj2;
            return Intrinsics.f(this.f60869a, cardSecurityPrompt.f60869a) && this.f60870b == cardSecurityPrompt.f60870b && this.f60871c == cardSecurityPrompt.f60871c;
        }

        public final int hashCode() {
            return this.f60871c.hashCode() + j6.a.c(this.f60869a.hashCode() * 31, 31, this.f60870b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60869a, i);
            dest.writeInt(this.f60870b ? 1 : 0);
            dest.writeString(this.f60871c.name());
        }
    }

    private CardSecurityFlowContract$Step() {
    }
}

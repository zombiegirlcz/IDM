package com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/free_stocks/select/SelectFreeStocksContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TermsAndConditions", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/free_stocks/select/SelectFreeStocksContract$ModalStep$TermsAndConditions;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SelectFreeStocksContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/free_stocks/select/SelectFreeStocksContract$ModalStep$TermsAndConditions;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/free_stocks/select/SelectFreeStocksContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions implements SelectFreeStocksContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f104163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f104164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f104165c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsAndConditions((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        public TermsAndConditions(d dVar, Long l2, String str, String str2) {
            this.f104163a = dVar;
            this.f104164b = l2;
            this.f104165c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj2;
            return Intrinsics.f(this.f104163a, termsAndConditions.f104163a) && Intrinsics.f(this.f104164b, termsAndConditions.f104164b) && Intrinsics.f(this.f104165c, termsAndConditions.f104165c) && Intrinsics.f(this.d, termsAndConditions.d);
        }

        public final int hashCode() {
            d dVar = this.f104163a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            Long l2 = this.f104164b;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.f104165c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104163a);
            Long l2 = this.f104164b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            dest.writeString(this.f104165c);
            dest.writeString(this.d);
        }
    }
}

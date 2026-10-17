package com.revolut.feature.apm.core.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection;", "Landroid/os/Parcelable;", "Outgoing", "Incoming", "Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection$Incoming;", "Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection$Outgoing;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmQuoteDirection implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection$Incoming;", "Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Incoming extends ApmQuoteDirection {

        @NotNull
        public static final Parcelable.Creator<Incoming> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyRequestChannel.APM f62093a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Incoming((MoneyRequestChannel.APM) parcel.readParcelable(Incoming.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Incoming[i];
            }
        }

        public Incoming(MoneyRequestChannel.APM apm) {
            f fVar = f.OUTGOING;
            this.f62093a = apm;
        }

        @Override // com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection
        public final boolean a() {
            return this.f62093a != null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Incoming) && Intrinsics.f(this.f62093a, ((Incoming) obj2).f62093a);
        }

        public final int hashCode() {
            MoneyRequestChannel.APM apm = this.f62093a;
            if (apm == null) {
                return 0;
            }
            return apm.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62093a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection$Outgoing;", "Lcom/revolut/feature/apm/core/models/quotes/ApmQuoteDirection;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Outgoing extends ApmQuoteDirection {

        @NotNull
        public static final Parcelable.Creator<Outgoing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentMethod f62094a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Outgoing((ApmPaymentMethod) parcel.readParcelable(Outgoing.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Outgoing[i];
            }
        }

        public Outgoing(ApmPaymentMethod apmPaymentMethod) {
            f fVar = f.OUTGOING;
            this.f62094a = apmPaymentMethod;
        }

        @Override // com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection
        public final boolean a() {
            return this.f62094a != null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Outgoing) && Intrinsics.f(this.f62094a, ((Outgoing) obj2).f62094a);
        }

        public final int hashCode() {
            ApmPaymentMethod apmPaymentMethod = this.f62094a;
            if (apmPaymentMethod == null) {
                return 0;
            }
            return apmPaymentMethod.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62094a, i);
        }
    }

    public abstract boolean a();
}

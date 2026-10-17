package com.revolut.feature.trading.impl.flows.holdings.information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Entry", "SectionInfo", "Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step$Entry;", "Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step$SectionInfo;", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HoldingsInformationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step$Entry;", "Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step;", "<init>", "()V", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry extends HoldingsInformationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f91214a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f91214a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        private Entry() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step$SectionInfo;", "Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionInfo extends HoldingsInformationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SectionInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x4f.a f91215a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionInfo(x4f.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionInfo[i];
            }
        }

        public SectionInfo(x4f.a section) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f91215a = section;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SectionInfo) && this.f91215a == ((SectionInfo) obj2).f91215a;
        }

        public final int hashCode() {
            return this.f91215a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91215a.name());
        }
    }

    private HoldingsInformationFlowContract$Step() {
    }
}

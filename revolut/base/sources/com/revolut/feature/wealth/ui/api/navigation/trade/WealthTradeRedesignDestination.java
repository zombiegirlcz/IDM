package com.revolut.feature.wealth.ui.api.navigation.trade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sih.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/trade/WealthTradeRedesignDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "sih/c", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthTradeRedesignDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WealthTradeRedesignDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f95940b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthTradeRedesignDestination(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthTradeRedesignDestination[i];
        }
    }

    public WealthTradeRedesignDestination() {
        this(null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getF95940b() {
        return this.f95940b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WealthTradeRedesignDestination) && this.f95940b == ((WealthTradeRedesignDestination) obj2).f95940b;
    }

    public final int hashCode() {
        c cVar = this.f95940b;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        c cVar = this.f95940b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }

    public WealthTradeRedesignDestination(c cVar) {
        super(IOData$EmptyInput.f98299a);
        this.f95940b = cVar;
    }
}

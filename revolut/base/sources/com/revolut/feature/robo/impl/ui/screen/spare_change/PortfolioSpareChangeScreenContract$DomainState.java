package com.revolut.feature.robo.impl.ui.screen.spare_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import unc.e;
import vnc.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/spare_change/PortfolioSpareChangeScreenContract$DomainState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "unc/e", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioSpareChangeScreenContract$DomainState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<PortfolioSpareChangeScreenContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f85203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f85204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f85205c;
    public final Data d;
    public final Data e;
    public final b f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioSpareChangeScreenContract$DomainState((Data) parcel.readValue(PortfolioSpareChangeScreenContract$DomainState.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), (Data) parcel.readValue(PortfolioSpareChangeScreenContract$DomainState.class.getClassLoader()), (Data) parcel.readValue(PortfolioSpareChangeScreenContract$DomainState.class.getClassLoader()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioSpareChangeScreenContract$DomainState[i];
        }
    }

    public PortfolioSpareChangeScreenContract$DomainState() {
        this(0);
    }

    public static PortfolioSpareChangeScreenContract$DomainState a(PortfolioSpareChangeScreenContract$DomainState portfolioSpareChangeScreenContract$DomainState, Data data, Integer num, e eVar, Data data2, Data data3, b bVar, int i) {
        if ((i & 1) != 0) {
            data = portfolioSpareChangeScreenContract$DomainState.f85203a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            num = portfolioSpareChangeScreenContract$DomainState.f85204b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            eVar = portfolioSpareChangeScreenContract$DomainState.f85205c;
        }
        e eVar2 = eVar;
        if ((i & 8) != 0) {
            data2 = portfolioSpareChangeScreenContract$DomainState.d;
        }
        Data data5 = data2;
        if ((i & 16) != 0) {
            data3 = portfolioSpareChangeScreenContract$DomainState.e;
        }
        Data data6 = data3;
        if ((i & 32) != 0) {
            bVar = portfolioSpareChangeScreenContract$DomainState.f;
        }
        portfolioSpareChangeScreenContract$DomainState.getClass();
        return new PortfolioSpareChangeScreenContract$DomainState(data4, num2, eVar2, data5, data6, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioSpareChangeScreenContract$DomainState)) {
            return false;
        }
        PortfolioSpareChangeScreenContract$DomainState portfolioSpareChangeScreenContract$DomainState = (PortfolioSpareChangeScreenContract$DomainState) obj2;
        return Intrinsics.f(this.f85203a, portfolioSpareChangeScreenContract$DomainState.f85203a) && Intrinsics.f(this.f85204b, portfolioSpareChangeScreenContract$DomainState.f85204b) && this.f85205c == portfolioSpareChangeScreenContract$DomainState.f85205c && Intrinsics.f(this.d, portfolioSpareChangeScreenContract$DomainState.d) && Intrinsics.f(this.e, portfolioSpareChangeScreenContract$DomainState.e) && this.f == portfolioSpareChangeScreenContract$DomainState.f;
    }

    public final int hashCode() {
        Data data = this.f85203a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Integer num = this.f85204b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        e eVar = this.f85205c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.e;
        int iHashCode5 = (iHashCode4 + (data3 == null ? 0 : data3.hashCode())) * 31;
        b bVar = this.f;
        return iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this.f85203a);
        Integer num = this.f85204b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        e eVar = this.f85205c;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeValue(this.d);
        dest.writeValue(this.e);
        b bVar = this.f;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }

    public PortfolioSpareChangeScreenContract$DomainState(Data data, Integer num, e eVar, Data data2, Data data3, b bVar) {
        this.f85203a = data;
        this.f85204b = num;
        this.f85205c = eVar;
        this.d = data2;
        this.e = data3;
        this.f = bVar;
    }

    public /* synthetic */ PortfolioSpareChangeScreenContract$DomainState(int i) {
        this(null, null, null, null, null, null);
    }
}

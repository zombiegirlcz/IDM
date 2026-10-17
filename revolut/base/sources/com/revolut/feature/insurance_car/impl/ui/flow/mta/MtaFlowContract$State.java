package com.revolut.feature.insurance_car.impl.ui.flow.mta;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.kompot.navigable.flow.FlowState;
import h30.l;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kl7.a1;
import kl7.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<MtaFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f75363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f75365c;
    public final ZonedDateTime d;
    public final InsurableCar e;
    public final AdditionalDriver f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f75366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Survey.Licence f75367h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a1 a1VarValueOf = a1.valueOf(parcel.readString());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            InsurableCar insurableCarCreateFromParcel = parcel.readInt() == 0 ? null : InsurableCar.CREATOR.createFromParcel(parcel);
            AdditionalDriver additionalDriverCreateFromParcel = parcel.readInt() == 0 ? null : AdditionalDriver.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(n0.valueOf(parcel.readString()), Boolean.valueOf(parcel.readInt() != 0 ? z : false));
                }
            }
            return new MtaFlowContract$State(a1VarValueOf, z3, zonedDateTime, zonedDateTime2, insurableCarCreateFromParcel, additionalDriverCreateFromParcel, linkedHashMap, parcel.readInt() != 0 ? Survey.Licence.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaFlowContract$State[i];
        }
    }

    public MtaFlowContract$State(a1 mtaType, boolean z, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, InsurableCar insurableCar, AdditionalDriver additionalDriver, Map map, Survey.Licence licence, String str) {
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        this.f75363a = mtaType;
        this.f75364b = z;
        this.f75365c = zonedDateTime;
        this.d = zonedDateTime2;
        this.e = insurableCar;
        this.f = additionalDriver;
        this.f75366g = map;
        this.f75367h = licence;
        this.i = str;
    }

    public static MtaFlowContract$State a(MtaFlowContract$State mtaFlowContract$State, a1 a1Var, boolean z, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, InsurableCar insurableCar, AdditionalDriver additionalDriver, Map map, Survey.Licence licence, int i) {
        if ((i & 1) != 0) {
            a1Var = mtaFlowContract$State.f75363a;
        }
        a1 mtaType = a1Var;
        if ((i & 2) != 0) {
            z = mtaFlowContract$State.f75364b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            zonedDateTime = mtaFlowContract$State.f75365c;
        }
        ZonedDateTime zonedDateTime3 = zonedDateTime;
        if ((i & 8) != 0) {
            zonedDateTime2 = mtaFlowContract$State.d;
        }
        ZonedDateTime zonedDateTime4 = zonedDateTime2;
        if ((i & 16) != 0) {
            insurableCar = mtaFlowContract$State.e;
        }
        InsurableCar insurableCar2 = insurableCar;
        AdditionalDriver additionalDriver2 = (i & 32) != 0 ? mtaFlowContract$State.f : additionalDriver;
        Map map2 = (i & 64) != 0 ? mtaFlowContract$State.f75366g : map;
        Survey.Licence licence2 = (i & 128) != 0 ? mtaFlowContract$State.f75367h : licence;
        String str = mtaFlowContract$State.i;
        mtaFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        return new MtaFlowContract$State(mtaType, z3, zonedDateTime3, zonedDateTime4, insurableCar2, additionalDriver2, map2, licence2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaFlowContract$State)) {
            return false;
        }
        MtaFlowContract$State mtaFlowContract$State = (MtaFlowContract$State) obj2;
        return this.f75363a == mtaFlowContract$State.f75363a && this.f75364b == mtaFlowContract$State.f75364b && Intrinsics.f(this.f75365c, mtaFlowContract$State.f75365c) && Intrinsics.f(this.d, mtaFlowContract$State.d) && Intrinsics.f(this.e, mtaFlowContract$State.e) && Intrinsics.f(this.f, mtaFlowContract$State.f) && Intrinsics.f(this.f75366g, mtaFlowContract$State.f75366g) && Intrinsics.f(this.f75367h, mtaFlowContract$State.f75367h) && Intrinsics.f(this.i, mtaFlowContract$State.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f75363a.hashCode() * 31, 31, this.f75364b);
        ZonedDateTime zonedDateTime = this.f75365c;
        int iHashCode = (iC + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.d;
        int iHashCode2 = (iHashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        InsurableCar insurableCar = this.e;
        int iHashCode3 = (iHashCode2 + (insurableCar == null ? 0 : insurableCar.hashCode())) * 31;
        AdditionalDriver additionalDriver = this.f;
        int iHashCode4 = (iHashCode3 + (additionalDriver == null ? 0 : additionalDriver.hashCode())) * 31;
        Map map = this.f75366g;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Survey.Licence licence = this.f75367h;
        int iHashCode6 = (iHashCode5 + (licence == null ? 0 : licence.hashCode())) * 31;
        String str = this.i;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75363a.name());
        dest.writeInt(this.f75364b ? 1 : 0);
        dest.writeSerializable(this.f75365c);
        dest.writeSerializable(this.d);
        InsurableCar insurableCar = this.e;
        if (insurableCar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            insurableCar.writeToParcel(dest, i);
        }
        AdditionalDriver additionalDriver = this.f;
        if (additionalDriver == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalDriver.writeToParcel(dest, i);
        }
        Map map = this.f75366g;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString(((n0) entry.getKey()).name());
                dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
        }
        Survey.Licence licence = this.f75367h;
        if (licence == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            licence.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
    }
}

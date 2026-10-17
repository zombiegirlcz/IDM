package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import jl7.h;
import kl7.a1;
import kl7.w0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaAvailabilityItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class MtaAvailabilityItem implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f75239g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f75240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75242c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final ZonedDateTime f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<MtaAvailabilityItem> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75243a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75243a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityItem", aVar, 6);
            pluginGeneratedSerialDescriptor.j("mtaType", true);
            pluginGeneratedSerialDescriptor.j("available", false);
            pluginGeneratedSerialDescriptor.j("eligibleEntities", false);
            pluginGeneratedSerialDescriptor.j("minStartDateTime", false);
            pluginGeneratedSerialDescriptor.j("maxStartDateTime", false);
            pluginGeneratedSerialDescriptor.j("maxEndDateTime", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = MtaAvailabilityItem.f75239g;
            h hVar = h.f175625a;
            return new KSerializer[]{lazyArr[0].getValue(), qlm.h.f247648a, nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c(hVar), nlm.a.c(hVar), nlm.a.c(hVar)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = MtaAvailabilityItem.f75239g;
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            a1 a1Var = null;
            List list = null;
            ZonedDateTime zonedDateTime = null;
            ZonedDateTime zonedDateTime2 = null;
            ZonedDateTime zonedDateTime3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        a1Var = (a1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), a1Var);
                        i |= 1;
                        break;
                    case 1:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), list);
                        i |= 4;
                        break;
                    case 3:
                        zonedDateTime = (ZonedDateTime) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, h.f175625a, zonedDateTime);
                        i |= 8;
                        break;
                    case 4:
                        zonedDateTime2 = (ZonedDateTime) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, h.f175625a, zonedDateTime2);
                        i |= 16;
                        break;
                    case 5:
                        zonedDateTime3 = (ZonedDateTime) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, h.f175625a, zonedDateTime3);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new MtaAvailabilityItem(i, a1Var, zDecodeBooleanElement, list, zonedDateTime, zonedDateTime2, zonedDateTime3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            MtaAvailabilityItem value = (MtaAvailabilityItem) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = MtaAvailabilityItem.f75239g;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f75240a != a1.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f75240a);
            }
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f75241b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f75242c);
            h hVar = h.f175625a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, hVar, value.d);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, hVar, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, hVar, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityItem$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75243a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaAvailabilityItem(a1.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.createStringArrayList(), (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaAvailabilityItem[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f75239g = new Lazy[]{j.c(kVar, new w0(0)), null, j.c(kVar, new w0(1)), null, null, null};
    }

    public /* synthetic */ MtaAvailabilityItem(int i, a1 a1Var, boolean z, List list, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3) {
        if (62 != (i & 62)) {
            j1.f(a.f75243a.getDescriptor(), i, 62);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f75240a = a1.UNKNOWN;
        } else {
            this.f75240a = a1Var;
        }
        this.f75241b = z;
        this.f75242c = list;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = zonedDateTime3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaAvailabilityItem)) {
            return false;
        }
        MtaAvailabilityItem mtaAvailabilityItem = (MtaAvailabilityItem) obj2;
        return this.f75240a == mtaAvailabilityItem.f75240a && this.f75241b == mtaAvailabilityItem.f75241b && Intrinsics.f(this.f75242c, mtaAvailabilityItem.f75242c) && Intrinsics.f(this.d, mtaAvailabilityItem.d) && Intrinsics.f(this.e, mtaAvailabilityItem.e) && Intrinsics.f(this.f, mtaAvailabilityItem.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f75240a.hashCode() * 31, 31, this.f75241b);
        List list = this.f75242c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.d;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.e;
        int iHashCode3 = (iHashCode2 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        ZonedDateTime zonedDateTime3 = this.f;
        return iHashCode3 + (zonedDateTime3 != null ? zonedDateTime3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75240a.name());
        dest.writeInt(this.f75241b ? 1 : 0);
        dest.writeStringList(this.f75242c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }

    public MtaAvailabilityItem(a1 mtaType, boolean z, ArrayList arrayList, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3) {
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        this.f75240a = mtaType;
        this.f75241b = z;
        this.f75242c = arrayList;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = zonedDateTime3;
    }
}

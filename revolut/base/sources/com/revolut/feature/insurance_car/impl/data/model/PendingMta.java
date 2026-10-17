package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
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
import qlm.h;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/PendingMta;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class PendingMta implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f75280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75281c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PendingMta> CREATOR = new c();
    public static final Lazy[] e = {null, j.c(k.PUBLICATION, new w0(2)), null, null};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75282a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75282a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.model.PendingMta", aVar, 4);
            pluginGeneratedSerialDescriptor.j("mtaId", false);
            pluginGeneratedSerialDescriptor.j("mtaType", true);
            pluginGeneratedSerialDescriptor.j("cancellationAvailable", false);
            pluginGeneratedSerialDescriptor.j("entityId", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = PendingMta.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), h.f247648a, nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = PendingMta.e;
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            a1 a1Var = null;
            String str = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    a1Var = (a1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), a1Var);
                    i |= 2;
                } else if (iD == 2) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new PendingMta(i, strDecodeStringElement, a1Var, zDecodeBooleanElement, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            PendingMta value = (PendingMta) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = PendingMta.e;
            String str = value.f75279a;
            a1 a1Var = value.f75280b;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || a1Var != a1.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), a1Var);
            }
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f75281c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_car.impl.data.model.PendingMta$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75282a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingMta(parcel.readString(), a1.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingMta[i];
        }
    }

    public /* synthetic */ PendingMta(int i, String str, a1 a1Var, boolean z, String str2) {
        if (13 != (i & 13)) {
            j1.f(a.f75282a.getDescriptor(), i, 13);
            throw null;
        }
        this.f75279a = str;
        if ((i & 2) == 0) {
            this.f75280b = a1.UNKNOWN;
        } else {
            this.f75280b = a1Var;
        }
        this.f75281c = z;
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
        if (!(obj2 instanceof PendingMta)) {
            return false;
        }
        PendingMta pendingMta = (PendingMta) obj2;
        return Intrinsics.f(this.f75279a, pendingMta.f75279a) && this.f75280b == pendingMta.f75280b && this.f75281c == pendingMta.f75281c && Intrinsics.f(this.d, pendingMta.d);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f75280b.hashCode() + (this.f75279a.hashCode() * 31)) * 31, 31, this.f75281c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75279a);
        dest.writeString(this.f75280b.name());
        dest.writeInt(this.f75281c ? 1 : 0);
        dest.writeString(this.d);
    }

    public PendingMta(String mtaId, a1 mtaType, boolean z, String str) {
        Intrinsics.checkNotNullParameter(mtaId, "mtaId");
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        this.f75279a = mtaId;
        this.f75280b = mtaType;
        this.f75281c = z;
        this.d = str;
    }
}

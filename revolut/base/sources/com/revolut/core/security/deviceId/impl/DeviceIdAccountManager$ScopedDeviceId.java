package com.revolut.core.security.deviceId.impl;

import android.os.Parcel;
import android.os.Parcelable;
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
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/core/security/deviceId/impl/DeviceIdAccountManager$ScopedDeviceId", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class DeviceIdAccountManager$ScopedDeviceId implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gm0.c f51453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51454c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<DeviceIdAccountManager$ScopedDeviceId> CREATOR = new c();
    public static final Lazy[] d = {null, j.c(k.PUBLICATION, new gla.k(4)), null};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51455a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f51455a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.security.deviceId.impl.DeviceIdAccountManager.ScopedDeviceId", aVar, 3);
            pluginGeneratedSerialDescriptor.j("deviceId", false);
            pluginGeneratedSerialDescriptor.j("scope", false);
            pluginGeneratedSerialDescriptor.j("owner", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = DeviceIdAccountManager$ScopedDeviceId.d;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = DeviceIdAccountManager$ScopedDeviceId.d;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            gm0.c cVar = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    cVar = (gm0.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), cVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new DeviceIdAccountManager$ScopedDeviceId(i, strDecodeStringElement, cVar, strDecodeStringElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            DeviceIdAccountManager$ScopedDeviceId value = (DeviceIdAccountManager$ScopedDeviceId) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = DeviceIdAccountManager$ScopedDeviceId.d;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f51452a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f51453b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f51454c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.security.deviceId.impl.DeviceIdAccountManager$ScopedDeviceId$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f51455a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceIdAccountManager$ScopedDeviceId(parcel.readString(), gm0.c.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeviceIdAccountManager$ScopedDeviceId[i];
        }
    }

    public /* synthetic */ DeviceIdAccountManager$ScopedDeviceId(int i, String str, gm0.c cVar, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f51455a.getDescriptor(), i, 7);
            throw null;
        }
        this.f51452a = str;
        this.f51453b = cVar;
        this.f51454c = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF51452a() {
        return this.f51452a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final gm0.c getF51453b() {
        return this.f51453b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeviceIdAccountManager$ScopedDeviceId)) {
            return false;
        }
        DeviceIdAccountManager$ScopedDeviceId deviceIdAccountManager$ScopedDeviceId = (DeviceIdAccountManager$ScopedDeviceId) obj2;
        return Intrinsics.f(this.f51452a, deviceIdAccountManager$ScopedDeviceId.f51452a) && this.f51453b == deviceIdAccountManager$ScopedDeviceId.f51453b && Intrinsics.f(this.f51454c, deviceIdAccountManager$ScopedDeviceId.f51454c);
    }

    public final int hashCode() {
        return this.f51454c.hashCode() + ((this.f51453b.hashCode() + (this.f51452a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51452a);
        dest.writeString(this.f51453b.name());
        dest.writeString(this.f51454c);
    }

    public DeviceIdAccountManager$ScopedDeviceId(String deviceId, gm0.c scope, String owner) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f51452a = deviceId;
        this.f51453b = scope;
        this.f51454c = owner;
    }
}

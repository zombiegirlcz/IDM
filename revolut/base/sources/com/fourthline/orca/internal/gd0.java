package com.fourthline.orca.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002\u0014#BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b'\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u001a¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/gd0;", "", "", "seen0", "", "manufacturer", "", "models", "marketingName", "antennaPosition", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/gd0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/fd0;", "c", "()Lcom/fourthline/orca/internal/fd0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getManufacturer", "b", "Ljava/util/List;", "getModels", "()Ljava/util/List;", "getMarketingName", "d", "getAntennaPosition", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class gd0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    private static final Lazy[] f = {null, yhm.j.c(yhm.k.PUBLICATION, new dl1(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String manufacturer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List models;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String marketingName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String antennaPosition;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28853b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f28852a = aVar;
            f28853b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.document.NfcDeviceAntennaSettings", aVar, 4);
            pluginGeneratedSerialDescriptor.j("manufacturer", false);
            pluginGeneratedSerialDescriptor.j("models", false);
            pluginGeneratedSerialDescriptor.j("marketingName", false);
            pluginGeneratedSerialDescriptor.j("antennaPosition", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gd0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = gd0.f;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            List list = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                } else if (iD == 2) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new gd0(i, strDecodeStringElement, list, strDecodeStringElement2, strDecodeStringElement3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = gd0.f;
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), v1Var, v1Var};
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // qlm.f0
        public /* bridge */ KSerializer[] typeParametersSerializers() {
            return qlm.j1.f247666a;
        }

        @Override // mlm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, gd0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            gd0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gd0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f28852a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ gd0(int i, String str, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f28852a.getDescriptor(), i, 15);
            throw null;
        }
        this.manufacturer = str;
        this.models = list;
        this.marketingName = str2;
        this.antennaPosition = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new qlm.e(qlm.v1.f247718a);
    }

    public final fd0 c() {
        return fd0.f28420a.a(this.antennaPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof gd0)) {
            return false;
        }
        gd0 gd0Var = (gd0) other;
        return Intrinsics.f(this.manufacturer, gd0Var.manufacturer) && Intrinsics.f(this.models, gd0Var.models) && Intrinsics.f(this.marketingName, gd0Var.marketingName) && Intrinsics.f(this.antennaPosition, gd0Var.antennaPosition);
    }

    public int hashCode() {
        return (((((this.manufacturer.hashCode() * 31) + this.models.hashCode()) * 31) + this.marketingName.hashCode()) * 31) + this.antennaPosition.hashCode();
    }

    public String toString() {
        return "NfcDeviceAntennaSettings(manufacturer=" + this.manufacturer + ", models=" + this.models + ", marketingName=" + this.marketingName + ", antennaPosition=" + this.antennaPosition + ")";
    }

    public static final /* synthetic */ void a(gd0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeStringElement(serialDesc, 0, self.manufacturer);
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.models);
        output.encodeStringElement(serialDesc, 2, self.marketingName);
        output.encodeStringElement(serialDesc, 3, self.antennaPosition);
    }
}

package com.fourthline.orca.internal;

import com.fourthline.orca.internal.iz;
import com.fourthline.orca.internal.km;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 '2\u00020\u0001:\u0002\u0016\u001cB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/nd0;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/iz;", "documentStrategy", "", "minimumAge", "", "useNfcX", "Lcom/fourthline/orca/internal/km;", "nfc", "<init>", "(Lcom/fourthline/orca/internal/iz;IZLcom/fourthline/orca/internal/km;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/iz;IZLcom/fourthline/orca/internal/km;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/nd0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/kd0;", "f", "()Lcom/fourthline/orca/internal/kd0;", "Lcom/fourthline/orca/internal/iz;", "b", "()Lcom/fourthline/orca/internal/iz;", "I", "c", "()I", "Z", "e", "()Z", "d", "Lcom/fourthline/orca/internal/km;", "()Lcom/fourthline/orca/internal/km;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class nd0 implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iz documentStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minimumAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean useNfcX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final km nfc;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31394b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f31393a = aVar;
            f31394b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.nfc.NfcFlowConfig", aVar, 4);
            pluginGeneratedSerialDescriptor.j("documentStrategy", false);
            pluginGeneratedSerialDescriptor.j("minimumAge", false);
            pluginGeneratedSerialDescriptor.j("useNfcX", true);
            pluginGeneratedSerialDescriptor.j("nfc", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nd0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            int iDecodeIntElement = 0;
            boolean zDecodeBooleanElement = false;
            iz izVar = null;
            km kmVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    izVar = (iz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, iz.a.f29760a, izVar);
                    i |= 1;
                } else if (iD == 1) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    kmVar = (km) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, km.a.f30316a, kmVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new nd0(i, izVar, iDecodeIntElement, zDecodeBooleanElement, kmVar, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{iz.a.f29760a, qlm.n0.f247680a, qlm.h.f247648a, km.a.f30316a};
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
        public final void serialize(Encoder encoder, nd0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            nd0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nd0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f31393a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ nd0(int i, iz izVar, int i2, boolean z, km kmVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            qlm.j1.f(a.f31393a.getDescriptor(), i, 11);
            throw null;
        }
        this.documentStrategy = izVar;
        this.minimumAge = i2;
        if ((i & 4) == 0) {
            this.useNfcX = true;
        } else {
            this.useNfcX = z;
        }
        this.nfc = kmVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iz getDocumentStrategy() {
        return this.documentStrategy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final km getNfc() {
        return this.nfc;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUseNfcX() {
        return this.useNfcX;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public kd0 a() {
        return new kd0(this);
    }

    public nd0(iz documentStrategy, int i, boolean z, km nfc2) {
        Intrinsics.checkNotNullParameter(documentStrategy, "documentStrategy");
        Intrinsics.checkNotNullParameter(nfc2, "nfc");
        this.documentStrategy = documentStrategy;
        this.minimumAge = i;
        this.useNfcX = z;
        this.nfc = nfc2;
    }

    public static final /* synthetic */ void a(nd0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, iz.a.f29760a, self.documentStrategy);
        output.encodeIntElement(serialDesc, 1, self.minimumAge);
        if (output.d(serialDesc) || !self.useNfcX) {
            output.encodeBooleanElement(serialDesc, 2, self.useNfcX);
        }
        output.encodeSerializableElement(serialDesc, 3, km.a.f30316a, self.nfc);
    }
}

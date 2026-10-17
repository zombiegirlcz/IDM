package com.fourthline.orca.internal;

import com.fourthline.orca.internal.dj;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002\u0015\u001dBA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/us;", "Lcom/fourthline/orca/internal/ny;", "", "seen0", "", "eIdFlowName", "documentFlowName", "", "boxCardSimulation", "Lcom/fourthline/orca/internal/dj;", "fallbackDocumentConfig", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLcom/fourthline/orca/internal/dj;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/us;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/rs;", "f", "()Lcom/fourthline/orca/internal/rs;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Z", "()Z", "Lcom/fourthline/orca/internal/dj;", "e", "()Lcom/fourthline/orca/internal/dj;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class us implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String eIdFlowName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String documentFlowName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean boxCardSimulation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final dj fallbackDocumentConfig;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34172b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f34171a = aVar;
            f34172b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.eid.EidFlowConfig", aVar, 4);
            pluginGeneratedSerialDescriptor.j("eIdFlowName", true);
            pluginGeneratedSerialDescriptor.j("documentFlowName", true);
            pluginGeneratedSerialDescriptor.j("boxCardSimulation", false);
            pluginGeneratedSerialDescriptor.j("fallbackDocumentConfig", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final us deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            dj djVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    djVar = (dj) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, dj.a.f27792a, djVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new us(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, djVar, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, qlm.h.f247648a, dj.a.f27792a};
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
        public final void serialize(Encoder encoder, us value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            us.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.us$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f34171a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ us(int i, String str, String str2, boolean z, dj djVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            qlm.j1.f(a.f34171a.getDescriptor(), i, 12);
            throw null;
        }
        this.eIdFlowName = (i & 1) == 0 ? "eIdDocument" : str;
        if ((i & 2) == 0) {
            this.documentFlowName = "IdDocument";
        } else {
            this.documentFlowName = str2;
        }
        this.boxCardSimulation = z;
        this.fallbackDocumentConfig = djVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBoxCardSimulation() {
        return this.boxCardSimulation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentFlowName() {
        return this.documentFlowName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEIdFlowName() {
        return this.eIdFlowName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final dj getFallbackDocumentConfig() {
        return this.fallbackDocumentConfig;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rs a() {
        return new rs(this);
    }

    public static final /* synthetic */ void a(us self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || !Intrinsics.f(self.eIdFlowName, "eIdDocument")) {
            output.encodeStringElement(serialDesc, 0, self.eIdFlowName);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.documentFlowName, "IdDocument")) {
            output.encodeStringElement(serialDesc, 1, self.documentFlowName);
        }
        output.encodeBooleanElement(serialDesc, 2, self.boxCardSimulation);
        output.encodeSerializableElement(serialDesc, 3, dj.a.f27792a, self.fallbackDocumentConfig);
    }
}

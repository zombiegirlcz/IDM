package com.fourthline.orca.internal;

import com.fourthline.orca.internal.j9;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 %2\u00020\u0001:\u0002\u0015\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/j91;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/x71;", "taxationCountry", "", "isTinCaptureRequired", "Lcom/fourthline/orca/internal/j9;", "cameraX", "<init>", "(Lcom/fourthline/orca/internal/x71;Ljava/lang/Boolean;Lcom/fourthline/orca/internal/j9;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/x71;Ljava/lang/Boolean;Lcom/fourthline/orca/internal/j9;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/j91;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/h91;", "g", "()Lcom/fourthline/orca/internal/h91;", "Lcom/fourthline/orca/internal/x71;", "e", "()Lcom/fourthline/orca/internal/x71;", "b", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "c", "Lcom/fourthline/orca/internal/j9;", "d", "()Lcom/fourthline/orca/internal/j9;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class j91 implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new wn1(6)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x71 taxationCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Boolean isTinCaptureRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j9 cameraX;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29840b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f29839a = aVar;
            f29840b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.tin.TinFlowConfig", aVar, 3);
            pluginGeneratedSerialDescriptor.j("taxationCountry", false);
            pluginGeneratedSerialDescriptor.j("isTinCaptureRequired", true);
            pluginGeneratedSerialDescriptor.j("cameraX", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j91 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = j91.d;
            dVarBeginStructure.getClass();
            int i = 0;
            x71 x71Var = null;
            Boolean bool = null;
            j9 j9Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    x71Var = (x71) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), x71Var);
                    i |= 1;
                } else if (iD == 1) {
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, bool);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    j9Var = (j9) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, j9.a.f29827a, j9Var);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new j91(i, x71Var, bool, j9Var, (SerializationConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{j91.d[0].getValue(), nlm.a.c(qlm.h.f247648a), j9.a.f29827a};
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
        public final void serialize(Encoder encoder, j91 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            j91.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.j91$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f29839a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j91(int i, x71 x71Var, Boolean bool, j9 j9Var, SerializationConstructorMarker serializationConstructorMarker) {
        j9.c cVar = null;
        Object[] objArr = 0;
        if (1 != (i & 1)) {
            qlm.j1.f(a.f29839a.getDescriptor(), i, 1);
            throw null;
        }
        this.taxationCountry = x71Var;
        if ((i & 2) == 0) {
            this.isTinCaptureRequired = null;
        } else {
            this.isTinCaptureRequired = bool;
        }
        if ((i & 4) == 0) {
            this.cameraX = new j9(false, cVar, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.cameraX = j9Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return x71.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j9 getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final x71 getTaxationCountry() {
        return this.taxationCountry;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIsTinCaptureRequired() {
        return this.isTinCaptureRequired;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h91 a() {
        return new h91(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(j91 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z = false;
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) d[0].getValue(), self.taxationCountry);
        if (output.d(serialDesc) || self.isTinCaptureRequired != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, qlm.h.f247648a, self.isTinCaptureRequired);
        }
        int i = 2;
        if (!output.d(serialDesc) && Intrinsics.f(self.cameraX, new j9(z, (j9.c) null, i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, j9.a.f29827a, self.cameraX);
    }

    public j91(x71 taxationCountry, Boolean bool, j9 cameraX) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        Intrinsics.checkNotNullParameter(cameraX, "cameraX");
        this.taxationCountry = taxationCountry;
        this.isTinCaptureRequired = bool;
        this.cameraX = cameraX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j91(x71 x71Var, Boolean bool, j9 j9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(x71Var, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? new j9(false, (j9.c) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : j9Var);
    }
}

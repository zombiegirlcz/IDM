package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ev0;
import com.fourthline.orca.internal.ew0;
import com.fourthline.orca.internal.n11;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 *2\u00020\u0001:\u0002\u0017\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0017\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u0017\u0010)¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/it0;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/ew0;", "selfie", "Lcom/fourthline/orca/internal/n11;", "liveness", "Lcom/fourthline/orca/internal/ev0;", "geolocation", "<init>", "(Lcom/fourthline/orca/internal/ew0;Lcom/fourthline/orca/internal/n11;Lcom/fourthline/orca/internal/ev0;)V", "", "seen0", "Lcom/fourthline/orca/internal/sx0;", "initialStatus", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ew0;Lcom/fourthline/orca/internal/n11;Lcom/fourthline/orca/internal/ev0;Lcom/fourthline/orca/internal/sx0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/it0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/mh0;", "()Lcom/fourthline/orca/internal/mh0;", "Lcom/fourthline/orca/internal/ew0;", "g", "()Lcom/fourthline/orca/internal/ew0;", "b", "Lcom/fourthline/orca/internal/n11;", "f", "()Lcom/fourthline/orca/internal/n11;", "c", "Lcom/fourthline/orca/internal/ev0;", "d", "()Lcom/fourthline/orca/internal/ev0;", "Lcom/fourthline/orca/internal/sx0;", "e", "()Lcom/fourthline/orca/internal/sx0;", "(Lcom/fourthline/orca/internal/sx0;)V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class it0 implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    private static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new dl1(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ew0 selfie;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n11 liveness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ev0 geolocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private sx0 initialStatus;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29707b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f29706a = aVar;
            f29707b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.qes.internal.QesFlowConfig", aVar, 4);
            pluginGeneratedSerialDescriptor.j("selfie", false);
            pluginGeneratedSerialDescriptor.j("liveness", false);
            pluginGeneratedSerialDescriptor.j("geolocation", false);
            pluginGeneratedSerialDescriptor.j("initialStatus", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final it0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = it0.f;
            dVarBeginStructure.getClass();
            int i = 0;
            ew0 ew0Var = null;
            n11 n11Var = null;
            ev0 ev0Var = null;
            sx0 sx0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    ew0Var = (ew0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ew0.a.f28283a, ew0Var);
                    i |= 1;
                } else if (iD == 1) {
                    n11Var = (n11) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, n11.a.f31313a, n11Var);
                    i |= 2;
                } else if (iD == 2) {
                    ev0Var = (ev0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ev0.a.f28273a, ev0Var);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    sx0Var = (sx0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), sx0Var);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new it0(i, ew0Var, n11Var, ev0Var, sx0Var, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{ew0.a.f28283a, n11.a.f31313a, ev0.a.f28273a, nlm.a.c((KSerializer) it0.f[3].getValue())};
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
        public final void serialize(Encoder encoder, it0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            it0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.it0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f29706a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ it0(int i, ew0 ew0Var, n11 n11Var, ev0 ev0Var, sx0 sx0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f29706a.getDescriptor(), i, 7);
            throw null;
        }
        this.selfie = ew0Var;
        this.liveness = n11Var;
        this.geolocation = ev0Var;
        if ((i & 8) == 0) {
            this.initialStatus = null;
        } else {
            this.initialStatus = sx0Var;
        }
    }

    public static final /* synthetic */ void a(it0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeSerializableElement(serialDesc, 0, ew0.a.f28283a, self.selfie);
        output.encodeSerializableElement(serialDesc, 1, n11.a.f31313a, self.liveness);
        output.encodeSerializableElement(serialDesc, 2, ev0.a.f28273a, self.geolocation);
        if (!output.d(serialDesc) && self.initialStatus == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.initialStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return sx0.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ev0 getGeolocation() {
        return this.geolocation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final sx0 getInitialStatus() {
        return this.initialStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n11 getLiveness() {
        return this.liveness;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ew0 getSelfie() {
        return this.selfie;
    }

    public it0(ew0 selfie, n11 liveness, ev0 geolocation) {
        Intrinsics.checkNotNullParameter(selfie, "selfie");
        Intrinsics.checkNotNullParameter(liveness, "liveness");
        Intrinsics.checkNotNullParameter(geolocation, "geolocation");
        this.selfie = selfie;
        this.liveness = liveness;
        this.geolocation = geolocation;
    }

    public final void a(sx0 sx0Var) {
        this.initialStatus = sx0Var;
    }

    @Override // com.fourthline.orca.internal.ny
    public mh0 a() {
        return new ft0(this);
    }
}

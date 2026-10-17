package com.fourthline.orca.internal;

import com.fourthline.orca.internal.iz;
import com.fourthline.orca.internal.j9;
import com.fourthline.orca.internal.n11;
import com.fourthline.orca.internal.p21;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.LivenessCheckType;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 72\u00020\u0001:\u0002\u0019!B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/fourthline/orca/internal/n01;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/iz;", "biometricsStrategy", "Lcom/fourthline/orca/internal/p21;", "video", "Lcom/fourthline/orca/internal/n11;", "liveness", "Lcom/fourthline/orca/internal/j9;", "cameraX", "<init>", "(Lcom/fourthline/orca/internal/iz;Lcom/fourthline/orca/internal/p21;Lcom/fourthline/orca/internal/n11;Lcom/fourthline/orca/internal/j9;)V", "", "seen0", "Lcom/fourthline/orca/internal/oy0;", "randomnessConfig", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/iz;Lcom/fourthline/orca/internal/p21;Lcom/fourthline/orca/internal/n11;Lcom/fourthline/orca/internal/j9;Lcom/fourthline/orca/internal/oy0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/n01;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/k01;", "k", "()Lcom/fourthline/orca/internal/k01;", "Lcom/fourthline/orca/internal/iz;", "d", "()Lcom/fourthline/orca/internal/iz;", "b", "Lcom/fourthline/orca/internal/p21;", "j", "()Lcom/fourthline/orca/internal/p21;", "c", "Lcom/fourthline/orca/internal/n11;", "f", "()Lcom/fourthline/orca/internal/n11;", "Lcom/fourthline/orca/internal/j9;", "e", "()Lcom/fourthline/orca/internal/j9;", "Lcom/fourthline/orca/internal/oy0;", "h", "()Lcom/fourthline/orca/internal/oy0;", "Lcom/fourthline/vision/RecordingType;", "i", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "Lcom/fourthline/vision/selfie/LivenessCheckType;", "g", "()Lcom/fourthline/vision/selfie/LivenessCheckType;", "livenessCheckType", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class n01 implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Lazy[] f31300g = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new wp1(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iz biometricsStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p21 video;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n11 liveness;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final j9 cameraX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final oy0 randomnessConfig;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31305b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f31304a = aVar;
            f31305b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlowConfig", aVar, 5);
            pluginGeneratedSerialDescriptor.j("biometricsStrategy", true);
            pluginGeneratedSerialDescriptor.j("video", false);
            pluginGeneratedSerialDescriptor.j("liveness", false);
            pluginGeneratedSerialDescriptor.j("cameraX", true);
            pluginGeneratedSerialDescriptor.j("randomnessConfig", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n01 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = n01.f31300g;
            dVarBeginStructure.getClass();
            int i = 0;
            iz izVar = null;
            p21 p21Var = null;
            n11 n11Var = null;
            j9 j9Var = null;
            oy0 oy0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    izVar = (iz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, iz.a.f29760a, izVar);
                    i |= 1;
                } else if (iD == 1) {
                    p21Var = (p21) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, p21.a.f31809a, p21Var);
                    i |= 2;
                } else if (iD == 2) {
                    n11Var = (n11) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, n11.a.f31313a, n11Var);
                    i |= 4;
                } else if (iD == 3) {
                    j9Var = (j9) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, j9.a.f29827a, j9Var);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    oy0Var = (oy0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), oy0Var);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n01(i, izVar, p21Var, n11Var, j9Var, oy0Var, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{iz.a.f29760a, p21.a.f31809a, n11.a.f31313a, j9.a.f29827a, nlm.a.c((KSerializer) n01.f31300g[4].getValue())};
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
        public final void serialize(Encoder encoder, n01 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            n01.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.n01$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f31304a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n01(int i, iz izVar, p21 p21Var, n11 n11Var, j9 j9Var, oy0 oy0Var, SerializationConstructorMarker serializationConstructorMarker) {
        lq0 lq0Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (6 != (i & 6)) {
            qlm.j1.f(a.f31304a.getDescriptor(), i, 6);
            throw null;
        }
        this.biometricsStrategy = (i & 1) == 0 ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : izVar;
        this.video = p21Var;
        this.liveness = n11Var;
        if ((i & 8) == 0) {
            this.cameraX = new j9(false, (j9.c) (objArr4 == true ? 1 : 0), 2, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0));
        } else {
            this.cameraX = j9Var;
        }
        if ((i & 16) != 0) {
            this.randomnessConfig = oy0Var;
            return;
        }
        boolean zA = n11Var.getRandomness().getEnabled();
        int i2 = 1;
        if (zA) {
            lq0Var = new lq0(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
        } else if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        this.randomnessConfig = lq0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer b() {
        return new mlm.d(kotlin.jvm.internal.o0.f186429a.b(oy0.class), new Annotation[0]);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iz getBiometricsStrategy() {
        return this.biometricsStrategy;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j9 getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n11 getLiveness() {
        return this.liveness;
    }

    public final LivenessCheckType g() {
        boolean zA = this.liveness.getEnabled();
        if (zA) {
            return LivenessCheckType.HEAD_TURN;
        }
        if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        return LivenessCheckType.NONE;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final oy0 getRandomnessConfig() {
        return this.randomnessConfig;
    }

    public final RecordingType i() {
        boolean zB = this.video.getEnabled();
        if (zB) {
            return RecordingType.VIDEO_ONLY;
        }
        if (zB) {
            throw new NoWhenBranchMatchedException();
        }
        return RecordingType.NONE;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final p21 getVideo() {
        return this.video;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public k01 a() {
        return new k01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(n01 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f31300g;
        lq0 lq0Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        boolean z = false;
        if (output.d(serialDesc) || !Intrinsics.f(self.biometricsStrategy, new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, iz.a.f29760a, self.biometricsStrategy);
        }
        int i = 1;
        output.encodeSerializableElement(serialDesc, 1, p21.a.f31809a, self.video);
        int i2 = 2;
        output.encodeSerializableElement(serialDesc, 2, n11.a.f31313a, self.liveness);
        if (output.d(serialDesc) || !Intrinsics.f(self.cameraX, new j9(z, (j9.c) (objArr4 == true ? 1 : 0), i2, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0)))) {
            output.encodeSerializableElement(serialDesc, 3, j9.a.f29827a, self.cameraX);
        }
        if (!output.d(serialDesc)) {
            oy0 oy0Var = self.randomnessConfig;
            boolean zA = self.liveness.getRandomness().getEnabled();
            if (zA) {
                lq0Var = new lq0(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            } else if (zA) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.f(oy0Var, lq0Var)) {
                return;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), self.randomnessConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n01(iz biometricsStrategy, p21 video, n11 liveness, j9 cameraX) {
        Intrinsics.checkNotNullParameter(biometricsStrategy, "biometricsStrategy");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(liveness, "liveness");
        Intrinsics.checkNotNullParameter(cameraX, "cameraX");
        this.biometricsStrategy = biometricsStrategy;
        this.video = video;
        this.liveness = liveness;
        this.cameraX = cameraX;
        boolean zA = liveness.getRandomness().getEnabled();
        lq0 lq0Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 1;
        if (zA) {
            lq0Var = new lq0(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        } else if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        this.randomnessConfig = lq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n01(iz izVar, p21 p21Var, n11 n11Var, j9 j9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : izVar, p21Var, n11Var, (i & 8) != 0 ? new j9(false, (j9.c) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : j9Var);
    }
}

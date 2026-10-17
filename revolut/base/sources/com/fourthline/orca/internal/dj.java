package com.fourthline.orca.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.orca.internal.gl;
import com.fourthline.orca.internal.iz;
import com.fourthline.orca.internal.j9;
import com.fourthline.orca.internal.km;
import com.fourthline.orca.internal.qh;
import com.fourthline.orca.internal.tr;
import com.fourthline.orca.internal.wf;
import com.fourthline.orca.internal.yf0;
import java.lang.annotation.Annotation;
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
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b+\b\u0081\b\u0018\u0000 _2\u00020\u0001:\u0002*<B\u0082\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u001b\u0010\u0019\u001a\u0017\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u00180\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cB\u0095\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001b\u0010#J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0093\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u001d\b\u0002\u0010\u0019\u001a\u0017\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u00180\u00142\b\b\u0002\u0010\u001a\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b*\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b:\u0010R\u001a\u0004\bH\u0010SR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010T\u001a\u0004\bU\u0010VR,\u0010\u0019\u001a\u0017\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u00180\u00148\u0006¢\u0006\f\n\u0004\bU\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bB\u0010E\u001a\u0004\bZ\u0010GR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b*\u0010^¨\u0006`"}, d2 = {"Lcom/fourthline/orca/internal/dj;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/iz;", "documentStrategy", "Lcom/fourthline/orca/internal/j9;", "cameraX", "Lcom/fourthline/orca/internal/yf0;", "nfcX", "", "tiltedStepsEnabled", "Lcom/fourthline/orca/internal/gl;", "imageCapture", "Lcom/fourthline/orca/internal/tr;", "video", "Lcom/fourthline/orca/internal/qh;", "confirmation", "Lcom/fourthline/orca/internal/wf;", ib.b.Analysis, "Lcom/fourthline/orca/internal/km;", "nfc", "", "Lcom/fourthline/core/CountryNetworkModel;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/md;", "supportedDocuments", "skipIntro", "<init>", "(Lcom/fourthline/orca/internal/iz;Lcom/fourthline/orca/internal/j9;Lcom/fourthline/orca/internal/yf0;ZLcom/fourthline/orca/internal/gl;Lcom/fourthline/orca/internal/tr;Lcom/fourthline/orca/internal/qh;Lcom/fourthline/orca/internal/wf;Lcom/fourthline/orca/internal/km;Ljava/util/List;Z)V", "", "seen0", "Lcom/fourthline/core/VideoDuration;", "videoDuration", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/iz;Lcom/fourthline/orca/internal/j9;Lcom/fourthline/orca/internal/yf0;ZLcom/fourthline/orca/internal/gl;Lcom/fourthline/orca/internal/tr;Lcom/fourthline/orca/internal/qh;Lcom/fourthline/orca/internal/wf;Lcom/fourthline/orca/internal/km;Ljava/util/List;ZLcom/fourthline/core/VideoDuration;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/dj;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/ep;", "p", "()Lcom/fourthline/orca/internal/ep;", "(Lcom/fourthline/orca/internal/iz;Lcom/fourthline/orca/internal/j9;Lcom/fourthline/orca/internal/yf0;ZLcom/fourthline/orca/internal/gl;Lcom/fourthline/orca/internal/tr;Lcom/fourthline/orca/internal/qh;Lcom/fourthline/orca/internal/wf;Lcom/fourthline/orca/internal/km;Ljava/util/List;Z)Lcom/fourthline/orca/internal/dj;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/iz;", "h", "()Lcom/fourthline/orca/internal/iz;", "b", "Lcom/fourthline/orca/internal/j9;", "f", "()Lcom/fourthline/orca/internal/j9;", "c", "Lcom/fourthline/orca/internal/yf0;", "k", "()Lcom/fourthline/orca/internal/yf0;", "d", "Z", "n", "()Z", "e", "Lcom/fourthline/orca/internal/gl;", "i", "()Lcom/fourthline/orca/internal/gl;", "Lcom/fourthline/orca/internal/tr;", "o", "()Lcom/fourthline/orca/internal/tr;", "g", "Lcom/fourthline/orca/internal/qh;", "()Lcom/fourthline/orca/internal/qh;", "Lcom/fourthline/orca/internal/wf;", "()Lcom/fourthline/orca/internal/wf;", "Lcom/fourthline/orca/internal/km;", "j", "()Lcom/fourthline/orca/internal/km;", "Ljava/util/List;", "m", "()Ljava/util/List;", "l", "Lcom/fourthline/core/VideoDuration;", "getVideoDuration", "()Lcom/fourthline/core/VideoDuration;", "(Lcom/fourthline/core/VideoDuration;)V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class dj implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f27783m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy[] f27784n;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iz documentStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j9 cameraX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yf0 nfcX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean tiltedStepsEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final gl imageCapture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final tr video;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qh confirmation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wf analysis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final km nfc;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List supportedDocuments;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean skipIntro;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private VideoDuration videoDuration;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27793b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27792a = aVar;
            f27793b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.document.DocumentFlowConfig", aVar, 12);
            pluginGeneratedSerialDescriptor.j("documentStrategy", true);
            pluginGeneratedSerialDescriptor.j("cameraX", true);
            pluginGeneratedSerialDescriptor.j("nfcX", true);
            pluginGeneratedSerialDescriptor.j("tiltedStepsEnabled", false);
            pluginGeneratedSerialDescriptor.j("imageCapture", true);
            pluginGeneratedSerialDescriptor.j("video", true);
            pluginGeneratedSerialDescriptor.j("confirmation", true);
            pluginGeneratedSerialDescriptor.j(ib.b.Analysis, false);
            pluginGeneratedSerialDescriptor.j("nfc", false);
            pluginGeneratedSerialDescriptor.j("supportedDocuments", false);
            pluginGeneratedSerialDescriptor.j("skipIntro", true);
            pluginGeneratedSerialDescriptor.j("videoDuration", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dj deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = dj.f27784n;
            dVarBeginStructure.getClass();
            km kmVar = null;
            List list = null;
            VideoDuration videoDuration = null;
            iz izVar = null;
            j9 j9Var = null;
            yf0 yf0Var = null;
            gl glVar = null;
            tr trVar = null;
            qh qhVar = null;
            wf wfVar = null;
            int i = 0;
            boolean z = true;
            boolean zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement2 = false;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        lazyArr = lazyArr2;
                        izVar = (iz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, iz.a.f29760a, izVar);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        j9Var = (j9) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, j9.a.f29827a, j9Var);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        yf0Var = (yf0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, yf0.a.f35280a, yf0Var);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        glVar = (gl) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, gl.a.f28929a, glVar);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        trVar = (tr) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, tr.a.f33839a, trVar);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        qhVar = (qh) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, qh.a.f32429a, qhVar);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        wfVar = (wf) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, wf.a.f34669a, wfVar);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        kmVar = (km) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, km.a.f30316a, kmVar);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                        i |= 512;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i |= 1024;
                        break;
                    case 11:
                        lazyArr = lazyArr2;
                        videoDuration = (VideoDuration) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr2[11].getValue(), videoDuration);
                        i |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new dj(i, izVar, j9Var, yf0Var, zDecodeBooleanElement, glVar, trVar, qhVar, wfVar, kmVar, list, zDecodeBooleanElement2, videoDuration, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = dj.f27784n;
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{iz.a.f29760a, j9.a.f29827a, yf0.a.f35280a, hVar, gl.a.f28929a, tr.a.f33839a, qh.a.f32429a, wf.a.f34669a, km.a.f30316a, lazyArr[9].getValue(), hVar, lazyArr[11].getValue()};
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
        public final void serialize(Encoder encoder, dj value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            dj.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dj$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27792a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f27784n = new Lazy[]{null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new pj1(22)), null, yhm.j.c(kVar, new pj1(23))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dj(int i, iz izVar, j9 j9Var, yf0 yf0Var, boolean z, gl glVar, tr trVar, qh qhVar, wf wfVar, km kmVar, List list, boolean z3, VideoDuration videoDuration, SerializationConstructorMarker serializationConstructorMarker) {
        j9.c cVar = null;
        Object[] objArr = 0;
        if (904 != (i & 904)) {
            qlm.j1.f(a.f27792a.getDescriptor(), i, 904);
            throw null;
        }
        this.documentStrategy = (i & 1) == 0 ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : izVar;
        boolean z4 = false;
        if ((i & 2) == 0) {
            this.cameraX = new j9(z4, cVar, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.cameraX = j9Var;
        }
        if ((i & 4) == 0) {
            this.nfcX = new yf0(true);
        } else {
            this.nfcX = yf0Var;
        }
        this.tiltedStepsEnabled = z;
        if ((i & 16) == 0) {
            this.imageCapture = new gl(false, 0.8d);
        } else {
            this.imageCapture = glVar;
        }
        if ((i & 32) == 0) {
            this.video = new tr(true, 10000L, (Integer) null, (String) null, 12, (DefaultConstructorMarker) null);
        } else {
            this.video = trVar;
        }
        this.confirmation = (i & 64) == 0 ? new qh(true) : qhVar;
        this.analysis = wfVar;
        this.nfc = kmVar;
        this.supportedDocuments = list;
        if ((i & 1024) == 0) {
            this.skipIntro = false;
        } else {
            this.skipIntro = z3;
        }
        this.videoDuration = (i & 2048) == 0 ? VideoDuration.DEFAULT.INSTANCE : videoDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.e(new md());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer c() {
        return new mlm.d(kotlin.jvm.internal.o0.f186429a.b(VideoDuration.class), new Annotation[0]);
    }

    public final dj a(iz documentStrategy, j9 cameraX, yf0 nfcX, boolean tiltedStepsEnabled, gl imageCapture, tr video, qh confirmation, wf analysis, km nfc2, List supportedDocuments, boolean skipIntro) {
        Intrinsics.checkNotNullParameter(documentStrategy, "documentStrategy");
        Intrinsics.checkNotNullParameter(cameraX, "cameraX");
        Intrinsics.checkNotNullParameter(nfcX, "nfcX");
        Intrinsics.checkNotNullParameter(imageCapture, "imageCapture");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(nfc2, "nfc");
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        return new dj(documentStrategy, cameraX, nfcX, tiltedStepsEnabled, imageCapture, video, confirmation, analysis, nfc2, supportedDocuments, skipIntro);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final wf getAnalysis() {
        return this.analysis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof dj)) {
            return false;
        }
        dj djVar = (dj) other;
        return Intrinsics.f(this.documentStrategy, djVar.documentStrategy) && Intrinsics.f(this.cameraX, djVar.cameraX) && Intrinsics.f(this.nfcX, djVar.nfcX) && this.tiltedStepsEnabled == djVar.tiltedStepsEnabled && Intrinsics.f(this.imageCapture, djVar.imageCapture) && Intrinsics.f(this.video, djVar.video) && Intrinsics.f(this.confirmation, djVar.confirmation) && Intrinsics.f(this.analysis, djVar.analysis) && Intrinsics.f(this.nfc, djVar.nfc) && Intrinsics.f(this.supportedDocuments, djVar.supportedDocuments) && this.skipIntro == djVar.skipIntro;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j9 getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final qh getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final iz getDocumentStrategy() {
        return this.documentStrategy;
    }

    public int hashCode() {
        return (((((((((((((((((((this.documentStrategy.hashCode() * 31) + this.cameraX.hashCode()) * 31) + this.nfcX.hashCode()) * 31) + Boolean.hashCode(this.tiltedStepsEnabled)) * 31) + this.imageCapture.hashCode()) * 31) + this.video.hashCode()) * 31) + this.confirmation.hashCode()) * 31) + this.analysis.hashCode()) * 31) + this.nfc.hashCode()) * 31) + this.supportedDocuments.hashCode()) * 31) + Boolean.hashCode(this.skipIntro);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final gl getImageCapture() {
        return this.imageCapture;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final km getNfc() {
        return this.nfc;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final yf0 getNfcX() {
        return this.nfcX;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getSupportedDocuments() {
        return this.supportedDocuments;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getTiltedStepsEnabled() {
        return this.tiltedStepsEnabled;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final tr getVideo() {
        return this.video;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ep a() {
        return new ep(this);
    }

    public String toString() {
        return "DocumentFlowConfig(documentStrategy=" + this.documentStrategy + ", cameraX=" + this.cameraX + ", nfcX=" + this.nfcX + ", tiltedStepsEnabled=" + this.tiltedStepsEnabled + ", imageCapture=" + this.imageCapture + ", video=" + this.video + ", confirmation=" + this.confirmation + ", analysis=" + this.analysis + ", nfc=" + this.nfc + ", supportedDocuments=" + this.supportedDocuments + ", skipIntro=" + this.skipIntro + ")";
    }

    public static /* synthetic */ dj a(dj djVar, iz izVar, j9 j9Var, yf0 yf0Var, boolean z, gl glVar, tr trVar, qh qhVar, wf wfVar, km kmVar, List list, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            izVar = djVar.documentStrategy;
        }
        if ((i & 2) != 0) {
            j9Var = djVar.cameraX;
        }
        if ((i & 4) != 0) {
            yf0Var = djVar.nfcX;
        }
        if ((i & 8) != 0) {
            z = djVar.tiltedStepsEnabled;
        }
        if ((i & 16) != 0) {
            glVar = djVar.imageCapture;
        }
        if ((i & 32) != 0) {
            trVar = djVar.video;
        }
        if ((i & 64) != 0) {
            qhVar = djVar.confirmation;
        }
        if ((i & 128) != 0) {
            wfVar = djVar.analysis;
        }
        if ((i & 256) != 0) {
            kmVar = djVar.nfc;
        }
        if ((i & 512) != 0) {
            list = djVar.supportedDocuments;
        }
        if ((i & 1024) != 0) {
            z3 = djVar.skipIntro;
        }
        List list2 = list;
        boolean z4 = z3;
        wf wfVar2 = wfVar;
        km kmVar2 = kmVar;
        tr trVar2 = trVar;
        qh qhVar2 = qhVar;
        gl glVar2 = glVar;
        yf0 yf0Var2 = yf0Var;
        return djVar.a(izVar, j9Var, yf0Var2, z, glVar2, trVar2, qhVar2, wfVar2, kmVar2, list2, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void a(com.fourthline.orca.internal.dj r18, kotlinx.serialization.encoding.CompositeEncoder r19, kotlinx.serialization.descriptors.SerialDescriptor r20) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.dj.a(com.fourthline.orca.internal.dj, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public dj(iz documentStrategy, j9 cameraX, yf0 nfcX, boolean z, gl imageCapture, tr video, qh confirmation, wf analysis, km nfc2, List supportedDocuments, boolean z3) {
        Intrinsics.checkNotNullParameter(documentStrategy, "documentStrategy");
        Intrinsics.checkNotNullParameter(cameraX, "cameraX");
        Intrinsics.checkNotNullParameter(nfcX, "nfcX");
        Intrinsics.checkNotNullParameter(imageCapture, "imageCapture");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(nfc2, "nfc");
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        this.documentStrategy = documentStrategy;
        this.cameraX = cameraX;
        this.nfcX = nfcX;
        this.tiltedStepsEnabled = z;
        this.imageCapture = imageCapture;
        this.video = video;
        this.confirmation = confirmation;
        this.analysis = analysis;
        this.nfc = nfc2;
        this.supportedDocuments = supportedDocuments;
        this.skipIntro = z3;
        this.videoDuration = VideoDuration.DEFAULT.INSTANCE;
    }

    public final void a(VideoDuration videoDuration) {
        Intrinsics.checkNotNullParameter(videoDuration, "<set-?>");
        this.videoDuration = videoDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dj(iz izVar, j9 j9Var, yf0 yf0Var, boolean z, gl glVar, tr trVar, qh qhVar, wf wfVar, km kmVar, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        j9 j9Var2;
        j9.c cVar = null;
        Object[] objArr = 0;
        iz izVar2 = (i & 1) != 0 ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : izVar;
        boolean z4 = false;
        if ((i & 2) != 0) {
            j9Var2 = new j9(z4, cVar, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            j9Var2 = j9Var;
        }
        this(izVar2, j9Var2, (i & 4) != 0 ? new yf0(true) : yf0Var, z, (i & 16) != 0 ? new gl(false, 0.8d) : glVar, (i & 32) != 0 ? new tr(true, 10000L, (Integer) null, (String) null, 12, (DefaultConstructorMarker) null) : trVar, (i & 64) != 0 ? new qh(true) : qhVar, wfVar, kmVar, list, (i & 1024) != 0 ? false : z3);
    }
}

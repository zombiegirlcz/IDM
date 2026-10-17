package com.fourthline.orca.internal;

import com.fourthline.orca.internal.j9;
import com.fourthline.orca.internal.wo0;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000  2\u00020\u0001:\u0002\u0014\u001cB\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/fourthline/orca/internal/an0;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/j9;", "cameraX", "", "Lcom/fourthline/orca/internal/wo0;", "supportedDocuments", "<init>", "(Lcom/fourthline/orca/internal/j9;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/j9;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/an0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/fourthline/orca/internal/zm0;", "f", "()Lcom/fourthline/orca/internal/zm0;", "Lcom/fourthline/orca/internal/j9;", "d", "()Lcom/fourthline/orca/internal/j9;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class an0 implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26851c = 8;
    private static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new vk1(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j9 cameraX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List supportedDocuments;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26855b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f26854a = aVar;
            f26855b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.poa.PoAFlowConfig", aVar, 2);
            pluginGeneratedSerialDescriptor.j("cameraX", true);
            pluginGeneratedSerialDescriptor.j("supportedDocuments", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final an0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = an0.d;
            dVarBeginStructure.getClass();
            SerializationConstructorMarker serializationConstructorMarker = null;
            boolean z = true;
            int i = 0;
            j9 j9Var = null;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    j9Var = (j9) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, j9.a.f29827a, j9Var);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new an0(i, j9Var, list, serializationConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{j9.a.f29827a, an0.d[1].getValue()};
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
        public final void serialize(Encoder encoder, an0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            an0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.an0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f26854a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ an0(int i, j9 j9Var, List list, SerializationConstructorMarker serializationConstructorMarker) {
        j9.c cVar = null;
        Object[] objArr = 0;
        int i2 = 2;
        if (2 != (i & 2)) {
            qlm.j1.f(a.f26854a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.cameraX = new j9(false, cVar, i2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.cameraX = j9Var;
        }
        this.supportedDocuments = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.e(wo0.a.f34756a);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j9 getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSupportedDocuments() {
        return this.supportedDocuments;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zm0 a() {
        return new zm0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void a(com.fourthline.orca.internal.an0 r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            kotlin.Lazy[] r0 = com.fourthline.orca.internal.an0.d
            boolean r1 = r7.d(r8)
            r2 = 0
            if (r1 == 0) goto La
            goto L19
        La:
            com.fourthline.orca.internal.j9 r1 = r6.cameraX
            com.fourthline.orca.internal.j9 r3 = new com.fourthline.orca.internal.j9
            r4 = 2
            r5 = 0
            r3.<init>(r2, r5, r4, r5)
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L20
        L19:
            com.fourthline.orca.internal.j9$a r1 = com.fourthline.orca.internal.j9.a.f29827a
            com.fourthline.orca.internal.j9 r3 = r6.cameraX
            r7.encodeSerializableElement(r8, r2, r1, r3)
        L20:
            r1 = 1
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            mlm.h r0 = (mlm.h) r0
            java.util.List r6 = r6.supportedDocuments
            r7.encodeSerializableElement(r8, r1, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.an0.a(com.fourthline.orca.internal.an0, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public an0(j9 cameraX, List supportedDocuments) {
        Intrinsics.checkNotNullParameter(cameraX, "cameraX");
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        this.cameraX = cameraX;
        this.supportedDocuments = supportedDocuments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ an0(j9 j9Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            j9Var = new j9(false, (j9.c) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this(j9Var, list);
    }
}

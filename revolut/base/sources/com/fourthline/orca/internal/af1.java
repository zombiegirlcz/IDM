package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bz0;
import com.fourthline.orca.internal.ff;
import com.fourthline.orca.internal.m2;
import com.fourthline.orca.internal.ty0;
import com.fourthline.orca.internal.ze1;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0002\u001b'BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b'\u00104¨\u00066"}, d2 = {"Lcom/fourthline/orca/internal/af1;", "", "", "name", "Lcom/fourthline/orca/internal/ze1;", "analytics", "Lcom/fourthline/orca/internal/ff;", "deviceDataCollection", "Lcom/fourthline/orca/internal/ty0;", "remoteAssets", "Lcom/fourthline/orca/internal/bz0;", "remoteStyles", "Lcom/fourthline/orca/internal/m2;", "backButtonOnTop", "<init>", "(Ljava/lang/String;Lcom/fourthline/orca/internal/ze1;Lcom/fourthline/orca/internal/ff;Lcom/fourthline/orca/internal/ty0;Lcom/fourthline/orca/internal/bz0;Lcom/fourthline/orca/internal/m2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/fourthline/orca/internal/ze1;Lcom/fourthline/orca/internal/ff;Lcom/fourthline/orca/internal/ty0;Lcom/fourthline/orca/internal/bz0;Lcom/fourthline/orca/internal/m2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/af1;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lcom/fourthline/orca/internal/ze1;", "()Lcom/fourthline/orca/internal/ze1;", "c", "Lcom/fourthline/orca/internal/ff;", "()Lcom/fourthline/orca/internal/ff;", "Lcom/fourthline/orca/internal/ty0;", "e", "()Lcom/fourthline/orca/internal/ty0;", "Lcom/fourthline/orca/internal/bz0;", "f", "()Lcom/fourthline/orca/internal/bz0;", "Lcom/fourthline/orca/internal/m2;", "()Lcom/fourthline/orca/internal/m2;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class af1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ze1 analytics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ff deviceDataCollection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ty0 remoteAssets;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final bz0 remoteStyles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final m2 backButtonOnTop;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26785b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f26784a = aVar;
            f26785b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.backend.model.WorkflowConfigurationTenantSettings", aVar, 6);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("analytics", true);
            pluginGeneratedSerialDescriptor.j("deviceDataCollection", true);
            pluginGeneratedSerialDescriptor.j("remoteAssets", true);
            pluginGeneratedSerialDescriptor.j("remoteStyles", true);
            pluginGeneratedSerialDescriptor.j("backButtonOnTop", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final af1 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            ze1 ze1Var = null;
            ff ffVar = null;
            ty0 ty0Var = null;
            bz0 bz0Var = null;
            m2 m2Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        ze1Var = (ze1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ze1.a.f35575a, ze1Var);
                        i |= 2;
                        break;
                    case 2:
                        ffVar = (ff) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ff.a.f28439a, ffVar);
                        i |= 4;
                        break;
                    case 3:
                        ty0Var = (ty0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, ty0.a.f33895a, ty0Var);
                        i |= 8;
                        break;
                    case 4:
                        bz0Var = (bz0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, bz0.a.f27287a, bz0Var);
                        i |= 16;
                        break;
                    case 5:
                        m2Var = (m2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, m2.a.f30924a, m2Var);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new af1(i, strDecodeStringElement, ze1Var, ffVar, ty0Var, bz0Var, m2Var, (SerializationConstructorMarker) null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.v1.f247718a, ze1.a.f35575a, ff.a.f28439a, ty0.a.f33895a, bz0.a.f27287a, m2.a.f30924a};
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
        public final void serialize(Encoder encoder, af1 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            af1.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.af1$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f26784a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ af1(int i, String str, ze1 ze1Var, ff ffVar, ty0 ty0Var, bz0 bz0Var, m2 m2Var, SerializationConstructorMarker serializationConstructorMarker) {
        String str2 = null;
        Object[] objArr = 0;
        if (1 != (i & 1)) {
            qlm.j1.f(a.f26784a.getDescriptor(), i, 1);
            throw null;
        }
        this.name = str;
        this.analytics = (i & 2) == 0 ? new ze1(true) : ze1Var;
        if ((i & 4) == 0) {
            this.deviceDataCollection = new ff(false, 0L, (ff.e) null, (ff.j) null, (ff.f) null, (ff.g) null, (ff.c) null, (ff.k) null, (ff.h) null, (ff.l) null, (ff.b) null, (ff.i) null, (ff.m) null, 8190, (DefaultConstructorMarker) null);
        } else {
            this.deviceDataCollection = ffVar;
        }
        boolean z = false;
        this.remoteAssets = (i & 8) == 0 ? new ty0(false) : ty0Var;
        this.remoteStyles = (i & 16) == 0 ? new bz0(z, str2, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0)) : bz0Var;
        this.backButtonOnTop = (i & 32) == 0 ? new m2(false) : m2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void a(com.fourthline.orca.internal.af1 r23, kotlinx.serialization.encoding.CompositeEncoder r24, kotlinx.serialization.descriptors.SerialDescriptor r25) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = r0.name
            r4 = 0
            r1.encodeStringElement(r2, r4, r3)
            boolean r3 = r24.d(r25)
            r5 = 1
            if (r3 == 0) goto L14
            goto L21
        L14:
            com.fourthline.orca.internal.ze1 r3 = r0.analytics
            com.fourthline.orca.internal.ze1 r6 = new com.fourthline.orca.internal.ze1
            r6.<init>(r5)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 != 0) goto L28
        L21:
            com.fourthline.orca.internal.ze1$a r3 = com.fourthline.orca.internal.ze1.a.f35575a
            com.fourthline.orca.internal.ze1 r6 = r0.analytics
            r1.encodeSerializableElement(r2, r5, r3, r6)
        L28:
            boolean r3 = r24.d(r25)
            r5 = 2
            if (r3 == 0) goto L30
            goto L54
        L30:
            com.fourthline.orca.internal.ff r3 = r0.deviceDataCollection
            com.fourthline.orca.internal.ff r6 = new com.fourthline.orca.internal.ff
            r21 = 8190(0x1ffe, float:1.1477E-41)
            r22 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 != 0) goto L5b
        L54:
            com.fourthline.orca.internal.ff$a r3 = com.fourthline.orca.internal.ff.a.f28439a
            com.fourthline.orca.internal.ff r6 = r0.deviceDataCollection
            r1.encodeSerializableElement(r2, r5, r3, r6)
        L5b:
            boolean r3 = r24.d(r25)
            if (r3 == 0) goto L62
            goto L6f
        L62:
            com.fourthline.orca.internal.ty0 r3 = r0.remoteAssets
            com.fourthline.orca.internal.ty0 r6 = new com.fourthline.orca.internal.ty0
            r6.<init>(r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 != 0) goto L77
        L6f:
            com.fourthline.orca.internal.ty0$a r3 = com.fourthline.orca.internal.ty0.a.f33895a
            com.fourthline.orca.internal.ty0 r6 = r0.remoteAssets
            r7 = 3
            r1.encodeSerializableElement(r2, r7, r3, r6)
        L77:
            boolean r3 = r24.d(r25)
            if (r3 == 0) goto L7e
            goto L8c
        L7e:
            com.fourthline.orca.internal.bz0 r3 = r0.remoteStyles
            com.fourthline.orca.internal.bz0 r6 = new com.fourthline.orca.internal.bz0
            r7 = 0
            r6.<init>(r4, r7, r5, r7)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 != 0) goto L94
        L8c:
            com.fourthline.orca.internal.bz0$a r3 = com.fourthline.orca.internal.bz0.a.f27287a
            com.fourthline.orca.internal.bz0 r5 = r0.remoteStyles
            r6 = 4
            r1.encodeSerializableElement(r2, r6, r3, r5)
        L94:
            boolean r3 = r24.d(r25)
            if (r3 == 0) goto L9b
            goto La8
        L9b:
            com.fourthline.orca.internal.m2 r3 = r0.backButtonOnTop
            com.fourthline.orca.internal.m2 r5 = new com.fourthline.orca.internal.m2
            r5.<init>(r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r5)
            if (r3 != 0) goto Lb0
        La8:
            com.fourthline.orca.internal.m2$a r3 = com.fourthline.orca.internal.m2.a.f30924a
            com.fourthline.orca.internal.m2 r0 = r0.backButtonOnTop
            r4 = 5
            r1.encodeSerializableElement(r2, r4, r3, r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.af1.a(com.fourthline.orca.internal.af1, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m2 getBackButtonOnTop() {
        return this.backButtonOnTop;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ff getDeviceDataCollection() {
        return this.deviceDataCollection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ty0 getRemoteAssets() {
        return this.remoteAssets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) other;
        return Intrinsics.f(this.name, af1Var.name) && Intrinsics.f(this.analytics, af1Var.analytics) && Intrinsics.f(this.deviceDataCollection, af1Var.deviceDataCollection) && Intrinsics.f(this.remoteAssets, af1Var.remoteAssets) && Intrinsics.f(this.remoteStyles, af1Var.remoteStyles) && Intrinsics.f(this.backButtonOnTop, af1Var.backButtonOnTop);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final bz0 getRemoteStyles() {
        return this.remoteStyles;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.analytics.hashCode()) * 31) + this.deviceDataCollection.hashCode()) * 31) + this.remoteAssets.hashCode()) * 31) + this.remoteStyles.hashCode()) * 31) + this.backButtonOnTop.hashCode();
    }

    public String toString() {
        return "WorkflowConfigurationTenantSettings(name=" + this.name + ", analytics=" + this.analytics + ", deviceDataCollection=" + this.deviceDataCollection + ", remoteAssets=" + this.remoteAssets + ", remoteStyles=" + this.remoteStyles + ", backButtonOnTop=" + this.backButtonOnTop + ")";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ze1 getAnalytics() {
        return this.analytics;
    }

    public af1(String name, ze1 analytics, ff deviceDataCollection, ty0 remoteAssets, bz0 remoteStyles, m2 backButtonOnTop) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(deviceDataCollection, "deviceDataCollection");
        Intrinsics.checkNotNullParameter(remoteAssets, "remoteAssets");
        Intrinsics.checkNotNullParameter(remoteStyles, "remoteStyles");
        Intrinsics.checkNotNullParameter(backButtonOnTop, "backButtonOnTop");
        this.name = name;
        this.analytics = analytics;
        this.deviceDataCollection = deviceDataCollection;
        this.remoteAssets = remoteAssets;
        this.remoteStyles = remoteStyles;
        this.backButtonOnTop = backButtonOnTop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ af1(String str, ze1 ze1Var, ff ffVar, ty0 ty0Var, bz0 bz0Var, m2 m2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        bz0 bz0Var2;
        ze1 ze1Var2 = (i & 2) != 0 ? new ze1(true) : ze1Var;
        ff ffVar2 = (i & 4) != 0 ? new ff(false, 0L, (ff.e) null, (ff.j) null, (ff.f) null, (ff.g) null, (ff.c) null, (ff.k) null, (ff.h) null, (ff.l) null, (ff.b) null, (ff.i) null, (ff.m) null, 8190, (DefaultConstructorMarker) null) : ffVar;
        boolean z = false;
        ty0 ty0Var2 = (i & 8) != 0 ? new ty0(false) : ty0Var;
        if ((i & 16) != 0) {
            bz0Var2 = new bz0(z, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            bz0Var2 = bz0Var;
        }
        this(str, ze1Var2, ffVar2, ty0Var2, bz0Var2, (i & 32) != 0 ? new m2(false) : m2Var);
    }
}

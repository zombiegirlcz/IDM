package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a;
import com.fourthline.orca.internal.a2;
import com.fourthline.orca.internal.ig1;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0002\u001a&BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBc\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b-\u00100¨\u00062"}, d2 = {"Lcom/fourthline/orca/internal/fh1;", "", "", "workflowId", "workflowName", "", "Lcom/fourthline/orca/internal/ig1;", "modules", "Lcom/fourthline/orca/internal/a;", "accessTokens", "sessionId", "Lcom/fourthline/orca/internal/a2;", "attestation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/fourthline/orca/internal/a2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/fourthline/orca/internal/a2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/fh1;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "getWorkflowName", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "e", "g", "Lcom/fourthline/orca/internal/a2;", "()Lcom/fourthline/orca/internal/a2;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class fh1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28509g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Lazy[] f28510h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String workflowId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String workflowName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List modules;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List accessTokens;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sessionId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final a2 attestation;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28515b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f28514a = aVar;
            f28515b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.backend.model.WorkflowStartSessionResponse", aVar, 6);
            pluginGeneratedSerialDescriptor.j("workflowId", false);
            pluginGeneratedSerialDescriptor.j("workflowName", false);
            pluginGeneratedSerialDescriptor.j("modules", false);
            pluginGeneratedSerialDescriptor.j("accessTokens", false);
            pluginGeneratedSerialDescriptor.j("sessionId", true);
            pluginGeneratedSerialDescriptor.j("attestation", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fh1 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = fh1.f28510h;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            List list = null;
            List list2 = null;
            String str = null;
            a2 a2Var = null;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                        i |= 4;
                        break;
                    case 3:
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                        i |= 8;
                        break;
                    case 4:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                        i |= 16;
                        break;
                    case 5:
                        a2Var = (a2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a2.a.f26676a, a2Var);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new fh1(i, strDecodeStringElement, strDecodeStringElement2, list, list2, str, a2Var, (SerializationConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = fh1.f28510h;
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), lazyArr[3].getValue(), nlm.a.c(v1Var), nlm.a.c(a2.a.f26676a)};
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
        public final void serialize(Encoder encoder, fh1 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            fh1.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fh1$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f28514a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f28510h = new Lazy[]{null, null, yhm.j.c(kVar, new dl1(8)), yhm.j.c(kVar, new dl1(9)), null, null};
    }

    public /* synthetic */ fh1(int i, String str, String str2, List list, List list2, String str3, a2 a2Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f28514a.getDescriptor(), i, 15);
            throw null;
        }
        this.workflowId = str;
        this.workflowName = str2;
        this.modules = list;
        this.accessTokens = list2;
        if ((i & 16) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str3;
        }
        if ((i & 32) == 0) {
            this.attestation = null;
        } else {
            this.attestation = a2Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new qlm.e(ig1.a.f29583a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.e(a.C0161a.f26661a);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getAccessTokens() {
        return this.accessTokens;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a2 getAttestation() {
        return this.attestation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fh1)) {
            return false;
        }
        fh1 fh1Var = (fh1) other;
        return Intrinsics.f(this.workflowId, fh1Var.workflowId) && Intrinsics.f(this.workflowName, fh1Var.workflowName) && Intrinsics.f(this.modules, fh1Var.modules) && Intrinsics.f(this.accessTokens, fh1Var.accessTokens) && Intrinsics.f(this.sessionId, fh1Var.sessionId) && Intrinsics.f(this.attestation, fh1Var.attestation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getModules() {
        return this.modules;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.workflowId.hashCode() * 31) + this.workflowName.hashCode()) * 31) + this.modules.hashCode()) * 31) + this.accessTokens.hashCode()) * 31;
        String str = this.sessionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a2 a2Var = this.attestation;
        return iHashCode2 + (a2Var != null ? a2Var.hashCode() : 0);
    }

    public String toString() {
        return "WorkflowStartSessionResponse(workflowId=" + this.workflowId + ", workflowName=" + this.workflowName + ", modules=" + this.modules + ", accessTokens=" + this.accessTokens + ", sessionId=" + this.sessionId + ", attestation=" + this.attestation + ")";
    }

    public fh1(String workflowId, String workflowName, List modules, List accessTokens, String str, a2 a2Var) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowName, "workflowName");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(accessTokens, "accessTokens");
        this.workflowId = workflowId;
        this.workflowName = workflowName;
        this.modules = modules;
        this.accessTokens = accessTokens;
        this.sessionId = str;
        this.attestation = a2Var;
    }

    public static final /* synthetic */ void a(fh1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f28510h;
        output.encodeStringElement(serialDesc, 0, self.workflowId);
        output.encodeStringElement(serialDesc, 1, self.workflowName);
        output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.modules);
        output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.accessTokens);
        if (output.d(serialDesc) || self.sessionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, qlm.v1.f247718a, self.sessionId);
        }
        if (!output.d(serialDesc) && self.attestation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, a2.a.f26676a, self.attestation);
    }

    public /* synthetic */ fh1(String str, String str2, List list, List list2, String str3, a2 a2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : a2Var);
    }
}

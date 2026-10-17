package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ca;
import com.fourthline.orca.internal.cr;
import com.fourthline.orca.internal.o21;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0002\u0017%B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/fourthline/orca/internal/j10;", "", "Lcom/fourthline/orca/internal/cr;", "documents", "Lcom/fourthline/orca/internal/o21;", "selfie", "Lcom/fourthline/orca/internal/tc1;", "metadata", "Lcom/fourthline/orca/internal/ca;", "clientData", "<init>", "(Lcom/fourthline/orca/internal/cr;Lcom/fourthline/orca/internal/o21;Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/ca;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/cr;Lcom/fourthline/orca/internal/o21;Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/ca;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/j10;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/cr;", "getDocuments", "()Lcom/fourthline/orca/internal/cr;", "b", "Lcom/fourthline/orca/internal/o21;", "getSelfie", "()Lcom/fourthline/orca/internal/o21;", "c", "Lcom/fourthline/orca/internal/tc1;", "getMetadata", "()Lcom/fourthline/orca/internal/tc1;", "d", "Lcom/fourthline/orca/internal/ca;", "getClientData", "()Lcom/fourthline/orca/internal/ca;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class j10 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new wn1(5)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cr documents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o21 selfie;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tc1 metadata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ca clientData;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29785b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f29784a = aVar;
            f29785b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.backend.model.IdvUploadStatus", aVar, 4);
            pluginGeneratedSerialDescriptor.j("documents", false);
            pluginGeneratedSerialDescriptor.j("selfie", false);
            pluginGeneratedSerialDescriptor.j("metadata", false);
            pluginGeneratedSerialDescriptor.j("clientData", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j10 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = j10.e;
            dVarBeginStructure.getClass();
            int i = 0;
            cr crVar = null;
            o21 o21Var = null;
            tc1 tc1Var = null;
            ca caVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    crVar = (cr) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, cr.a.f27537a, crVar);
                    i |= 1;
                } else if (iD == 1) {
                    o21Var = (o21) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o21.a.f31549a, o21Var);
                    i |= 2;
                } else if (iD == 2) {
                    tc1Var = (tc1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), tc1Var);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    caVar = (ca) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ca.a.f27426a, caVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new j10(i, crVar, o21Var, tc1Var, caVar, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{cr.a.f27537a, o21.a.f31549a, j10.e[2].getValue(), nlm.a.c(ca.a.f27426a)};
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
        public final void serialize(Encoder encoder, j10 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            j10.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.j10$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f29784a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ j10(int i, cr crVar, o21 o21Var, tc1 tc1Var, ca caVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f29784a.getDescriptor(), i, 7);
            throw null;
        }
        this.documents = crVar;
        this.selfie = o21Var;
        this.metadata = tc1Var;
        if ((i & 8) == 0) {
            this.clientData = null;
        } else {
            this.clientData = caVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return tc1.INSTANCE.serializer();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) other;
        return Intrinsics.f(this.documents, j10Var.documents) && Intrinsics.f(this.selfie, j10Var.selfie) && this.metadata == j10Var.metadata && Intrinsics.f(this.clientData, j10Var.clientData);
    }

    public int hashCode() {
        int iHashCode = ((((this.documents.hashCode() * 31) + this.selfie.hashCode()) * 31) + this.metadata.hashCode()) * 31;
        ca caVar = this.clientData;
        return iHashCode + (caVar == null ? 0 : caVar.hashCode());
    }

    public String toString() {
        return "IdvUploadStatus(documents=" + this.documents + ", selfie=" + this.selfie + ", metadata=" + this.metadata + ", clientData=" + this.clientData + ")";
    }

    public j10(cr documents, o21 selfie, tc1 metadata, ca caVar) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(selfie, "selfie");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.documents = documents;
        this.selfie = selfie;
        this.metadata = metadata;
        this.clientData = caVar;
    }

    public static final /* synthetic */ void a(j10 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = e;
        output.encodeSerializableElement(serialDesc, 0, cr.a.f27537a, self.documents);
        output.encodeSerializableElement(serialDesc, 1, o21.a.f31549a, self.selfie);
        output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.metadata);
        if (!output.d(serialDesc) && self.clientData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, ca.a.f27426a, self.clientData);
    }
}

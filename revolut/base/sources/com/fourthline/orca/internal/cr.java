package com.fourthline.orca.internal;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0014\"B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/cr;", "", "Lcom/fourthline/orca/internal/tc1;", "primary", "secondary", "poa", "tin", "<init>", "(Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/tc1;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/tc1;Lcom/fourthline/orca/internal/tc1;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/cr;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/tc1;", "getPrimary", "()Lcom/fourthline/orca/internal/tc1;", "b", "getSecondary", "c", "getPoa", "d", "getTin", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class cr {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tc1 primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tc1 secondary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tc1 poa;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final tc1 tin;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27538b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27537a = aVar;
            f27538b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.backend.model.DocumentUploadStatus", aVar, 4);
            pluginGeneratedSerialDescriptor.j("primary", false);
            pluginGeneratedSerialDescriptor.j("secondary", true);
            pluginGeneratedSerialDescriptor.j("poa", true);
            pluginGeneratedSerialDescriptor.j("tin", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cr deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = cr.e;
            dVarBeginStructure.getClass();
            int i = 0;
            tc1 tc1Var = null;
            tc1 tc1Var2 = null;
            tc1 tc1Var3 = null;
            tc1 tc1Var4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    tc1Var = (tc1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), tc1Var);
                    i |= 1;
                } else if (iD == 1) {
                    tc1Var2 = (tc1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), tc1Var2);
                    i |= 2;
                } else if (iD == 2) {
                    tc1Var3 = (tc1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), tc1Var3);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    tc1Var4 = (tc1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), tc1Var4);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new cr(i, tc1Var, tc1Var2, tc1Var3, tc1Var4, (SerializationConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = cr.e;
            return new KSerializer[]{lazyArr[0].getValue(), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue())};
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
        public final void serialize(Encoder encoder, cr value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            cr.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cr$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27537a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new pj1(17)), yhm.j.c(kVar, new pj1(18)), yhm.j.c(kVar, new pj1(19)), yhm.j.c(kVar, new pj1(20))};
    }

    public /* synthetic */ cr(int i, tc1 tc1Var, tc1 tc1Var2, tc1 tc1Var3, tc1 tc1Var4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            qlm.j1.f(a.f27537a.getDescriptor(), i, 1);
            throw null;
        }
        this.primary = tc1Var;
        if ((i & 2) == 0) {
            this.secondary = null;
        } else {
            this.secondary = tc1Var2;
        }
        if ((i & 4) == 0) {
            this.poa = null;
        } else {
            this.poa = tc1Var3;
        }
        if ((i & 8) == 0) {
            this.tin = null;
        } else {
            this.tin = tc1Var4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return tc1.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return tc1.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer c() {
        return tc1.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        return tc1.INSTANCE.serializer();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cr)) {
            return false;
        }
        cr crVar = (cr) other;
        return this.primary == crVar.primary && this.secondary == crVar.secondary && this.poa == crVar.poa && this.tin == crVar.tin;
    }

    public int hashCode() {
        int iHashCode = this.primary.hashCode() * 31;
        tc1 tc1Var = this.secondary;
        int iHashCode2 = (iHashCode + (tc1Var == null ? 0 : tc1Var.hashCode())) * 31;
        tc1 tc1Var2 = this.poa;
        int iHashCode3 = (iHashCode2 + (tc1Var2 == null ? 0 : tc1Var2.hashCode())) * 31;
        tc1 tc1Var3 = this.tin;
        return iHashCode3 + (tc1Var3 != null ? tc1Var3.hashCode() : 0);
    }

    public String toString() {
        return "DocumentUploadStatus(primary=" + this.primary + ", secondary=" + this.secondary + ", poa=" + this.poa + ", tin=" + this.tin + ")";
    }

    public cr(tc1 primary, tc1 tc1Var, tc1 tc1Var2, tc1 tc1Var3) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.primary = primary;
        this.secondary = tc1Var;
        this.poa = tc1Var2;
        this.tin = tc1Var3;
    }

    public static final /* synthetic */ void a(cr self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = e;
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.primary);
        if (output.d(serialDesc) || self.secondary != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.secondary);
        }
        if (output.d(serialDesc) || self.poa != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.poa);
        }
        if (!output.d(serialDesc) && self.tin == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.tin);
    }

    public /* synthetic */ cr(tc1 tc1Var, tc1 tc1Var2, tc1 tc1Var3, tc1 tc1Var4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tc1Var, (i & 2) != 0 ? null : tc1Var2, (i & 4) != 0 ? null : tc1Var3, (i & 8) != 0 ? null : tc1Var4);
    }
}

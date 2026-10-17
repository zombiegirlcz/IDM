package com.fourthline.orca.internal;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u0014 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0017¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/v71;", "", "", "countrySubjectToTaxation", "tin", "usPerson", "ustin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/v71;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountrySubjectToTaxation", "b", "getTin", "c", "getUsPerson", "d", "getUstin", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class v71 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String countrySubjectToTaxation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String usPerson;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String ustin;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34268b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f34267a = aVar;
            f34268b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.upload_idv.upload.TaxInfo", aVar, 4);
            pluginGeneratedSerialDescriptor.j("countrySubjectToTaxation", false);
            pluginGeneratedSerialDescriptor.j("tin", false);
            pluginGeneratedSerialDescriptor.j("usPerson", false);
            pluginGeneratedSerialDescriptor.j("ustin", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v71 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str = null;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new v71(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var)};
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
        public final void serialize(Encoder encoder, v71 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            v71.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v71$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f34267a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ v71(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f34267a.getDescriptor(), i, 7);
            throw null;
        }
        this.countrySubjectToTaxation = str;
        this.tin = str2;
        this.usPerson = str3;
        if ((i & 8) == 0) {
            this.ustin = null;
        } else {
            this.ustin = str4;
        }
    }

    public static final /* synthetic */ void a(v71 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.countrySubjectToTaxation);
        output.encodeStringElement(serialDesc, 1, self.tin);
        output.encodeStringElement(serialDesc, 2, self.usPerson);
        if (!output.d(serialDesc) && self.ustin == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, qlm.v1.f247718a, self.ustin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v71)) {
            return false;
        }
        v71 v71Var = (v71) other;
        return Intrinsics.f(this.countrySubjectToTaxation, v71Var.countrySubjectToTaxation) && Intrinsics.f(this.tin, v71Var.tin) && Intrinsics.f(this.usPerson, v71Var.usPerson) && Intrinsics.f(this.ustin, v71Var.ustin);
    }

    public int hashCode() {
        int iHashCode = ((((this.countrySubjectToTaxation.hashCode() * 31) + this.tin.hashCode()) * 31) + this.usPerson.hashCode()) * 31;
        String str = this.ustin;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TaxInfo(countrySubjectToTaxation=" + this.countrySubjectToTaxation + ", tin=" + this.tin + ", usPerson=" + this.usPerson + ", ustin=" + this.ustin + ")";
    }

    public v71(String countrySubjectToTaxation, String tin, String usPerson, String str) {
        Intrinsics.checkNotNullParameter(countrySubjectToTaxation, "countrySubjectToTaxation");
        Intrinsics.checkNotNullParameter(tin, "tin");
        Intrinsics.checkNotNullParameter(usPerson, "usPerson");
        this.countrySubjectToTaxation = countrySubjectToTaxation;
        this.tin = tin;
        this.usPerson = usPerson;
        this.ustin = str;
    }
}

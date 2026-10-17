package gsf;

import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0017"}, d2 = {"Lgsf/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "e", "valueType", "c", "d", "stringValue", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "moneyValue", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "booleanValue", "Companion", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueType")
    private final String valueType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("stringValue")
    private final String stringValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("moneyValue")
    private final jo3.a moneyValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("booleanValue")
    private final Boolean booleanValue;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f146409a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f146409a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transfer_reasons.dto.AdditionalInfoItemDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("code", false);
            pluginGeneratedSerialDescriptor.j("valueType", false);
            pluginGeneratedSerialDescriptor.j("stringValue", false);
            pluginGeneratedSerialDescriptor.j("moneyValue", false);
            pluginGeneratedSerialDescriptor.j("booleanValue", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(a.C1001a.f176860a), nlm.a.c(qlm.h.f247648a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            jo3.a aVar = null;
            Boolean bool = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                } else if (iD == 2) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                    i |= 4;
                } else if (iD == 3) {
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.h.f247648a, bool);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, str, str2, str3, aVar, bool);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e value = (e) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            e.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: gsf.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f146409a;
        }
    }

    public /* synthetic */ e(int i, String str, String str2, String str3, jo3.a aVar, Boolean bool) {
        if (31 != (i & 31)) {
            j1.f(a.f146409a.getDescriptor(), i, 31);
            throw null;
        }
        this.code = str;
        this.valueType = str2;
        this.stringValue = str3;
        this.moneyValue = aVar;
        this.booleanValue = bool;
    }

    public static final /* synthetic */ void f(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, eVar.code);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, eVar.valueType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, eVar.stringValue);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, eVar.moneyValue);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, qlm.h.f247648a, eVar.booleanValue);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMoneyValue() {
        return this.moneyValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.code, eVar.code) && Intrinsics.f(this.valueType, eVar.valueType) && Intrinsics.f(this.stringValue, eVar.stringValue) && Intrinsics.f(this.moneyValue, eVar.moneyValue) && Intrinsics.f(this.booleanValue, eVar.booleanValue);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.valueType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stringValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.a aVar = this.moneyValue;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.booleanValue;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public e(String str, String str2, String str3, jo3.a aVar, Boolean bool) {
        this.code = str;
        this.valueType = str2;
        this.stringValue = str3;
        this.moneyValue = aVar;
        this.booleanValue = bool;
    }
}

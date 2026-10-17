package yhf;

import java.util.Map;
import kotlin.Lazy;
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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0012"}, d2 = {"Lyhf/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "currency", "b", "bankCountry", "d", "institutionName", "", "Ljava/util/Map;", "()Ljava/util/Map;", "accountFields", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new yh6.y(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankCountry")
    @NotNull
    private final String bankCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("institutionName")
    private final String institutionName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("account")
    private final Map<String, String> accountFields;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314021a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314021a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.PayerDetailsDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("currency", false);
            pluginGeneratedSerialDescriptor.j("bankCountry", false);
            pluginGeneratedSerialDescriptor.j("institutionName", false);
            pluginGeneratedSerialDescriptor.j("accountFields", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = k.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[3].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = k.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            Map map = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), map);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new k(i, strDecodeStringElement, strDecodeStringElement2, str, map);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            k value = (k) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            k.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314021a;
        }
    }

    public /* synthetic */ k(int i, String str, String str2, String str3, Map map) {
        if (15 != (i & 15)) {
            j1.f(a.f314021a.getDescriptor(), i, 15);
            throw null;
        }
        this.currency = str;
        this.bankCountry = str2;
        this.institutionName = str3;
        this.accountFields = map;
    }

    public static final /* synthetic */ void e(k kVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, kVar.currency);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, kVar.bankCountry);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, kVar.institutionName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) e[3].getValue(), kVar.accountFields);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getAccountFields() {
        return this.accountFields;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.currency, kVar.currency) && Intrinsics.f(this.bankCountry, kVar.bankCountry) && Intrinsics.f(this.institutionName, kVar.institutionName) && Intrinsics.f(this.accountFields, kVar.accountFields);
    }

    public final int hashCode() {
        int iC = p.a.c(this.currency.hashCode() * 31, 31, this.bankCountry);
        String str = this.institutionName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.accountFields;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}

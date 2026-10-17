package yhf;

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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006!"}, d2 = {"Lyhf/u;", "Lxhf/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "lastFour", "d", "label", "g", "brand", "h", "currency", "f", "i", "issuerLogo", "j", "issuerName", "getBgColour", "bgColour", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "disposable", "pro", "k", "credit", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class u extends xhf.g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("brand")
    private final String brand;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("issuerLogo")
    private final String issuerLogo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("issuerName")
    private final String issuerName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("bgColour")
    private final String bgColour;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("disposable")
    private final Boolean disposable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pro")
    private final Boolean pro;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("credit")
    private final Boolean credit;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314086a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314086a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.TransactionDetailsCardDto", aVar, 11);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("lastFour", false);
            pluginGeneratedSerialDescriptor.j("label", false);
            pluginGeneratedSerialDescriptor.j("brand", false);
            pluginGeneratedSerialDescriptor.j("currency", false);
            pluginGeneratedSerialDescriptor.j("issuerLogo", false);
            pluginGeneratedSerialDescriptor.j("issuerName", false);
            pluginGeneratedSerialDescriptor.j("bgColour", false);
            pluginGeneratedSerialDescriptor.j("disposable", false);
            pluginGeneratedSerialDescriptor.j("pro", false);
            pluginGeneratedSerialDescriptor.j("credit", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c(v1Var);
            KSerializer kSerializerC4 = nlm.a.c(v1Var);
            KSerializer kSerializerC5 = nlm.a.c(v1Var);
            KSerializer kSerializerC6 = nlm.a.c(v1Var);
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, nlm.a.c(hVar), nlm.a.c(hVar), nlm.a.c(hVar)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            boolean z;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Boolean bool = null;
            Boolean bool2 = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool3 = null;
            int i = 0;
            boolean z3 = true;
            while (z3) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        z = z3;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        continue;
                    case 2:
                        z = z3;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        z = z3;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                        i |= 8;
                        break;
                    case 4:
                        z = z3;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                        i |= 16;
                        break;
                    case 5:
                        z = z3;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
                        i |= 32;
                        break;
                    case 6:
                        z = z3;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str5);
                        i |= 64;
                        break;
                    case 7:
                        z = z3;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                        i |= 128;
                        break;
                    case 8:
                        z = z3;
                        bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.h.f247648a, bool3);
                        i |= 256;
                        break;
                    case 9:
                        z = z3;
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.h.f247648a, bool);
                        i |= 512;
                        break;
                    case 10:
                        z = z3;
                        bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.h.f247648a, bool2);
                        i |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                z3 = z;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new u(i, strDecodeStringElement, strDecodeStringElement2, str, str2, str3, str4, str5, str6, bool3, bool, bool2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            u value = (u) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            u.k(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314086a;
        }
    }

    public u(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3) {
        if (2047 != (i & 2047)) {
            j1.f(a.f314086a.getDescriptor(), i, 2047);
            throw null;
        }
        this.id = str;
        this.lastFour = str2;
        this.label = str3;
        this.brand = str4;
        this.currency = str5;
        this.issuerLogo = str6;
        this.issuerName = str7;
        this.bgColour = str8;
        this.disposable = bool;
        this.pro = bool2;
        this.credit = bool3;
    }

    public static final void k(u uVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, uVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, uVar.lastFour);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, uVar.label);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, uVar.brand);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, uVar.currency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, uVar.issuerLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, uVar.issuerName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, uVar.bgColour);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, hVar, uVar.disposable);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, hVar, uVar.pro);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, hVar, uVar.credit);
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCredit() {
        return this.credit;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getDisposable() {
        return this.disposable;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.id, uVar.id) && Intrinsics.f(this.lastFour, uVar.lastFour) && Intrinsics.f(this.label, uVar.label) && Intrinsics.f(this.brand, uVar.brand) && Intrinsics.f(this.currency, uVar.currency) && Intrinsics.f(this.issuerLogo, uVar.issuerLogo) && Intrinsics.f(this.issuerName, uVar.issuerName) && Intrinsics.f(this.bgColour, uVar.bgColour) && Intrinsics.f(this.disposable, uVar.disposable) && Intrinsics.f(this.pro, uVar.pro) && Intrinsics.f(this.credit, uVar.credit);
    }

    @Override // xhf.g
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getPro() {
        return this.pro;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.lastFour);
        String str = this.label;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brand;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.issuerLogo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuerName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bgColour;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.disposable;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.pro;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.credit;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getIssuerLogo() {
        return this.issuerLogo;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }
}

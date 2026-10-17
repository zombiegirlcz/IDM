package o45;

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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0013"}, d2 = {"Lo45/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "e", "state", "c", "f", "type", "externalId", "bankIdentifier", "accountNumber", "Companion", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("externalId")
    private final String externalId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankIdentifier")
    private final String bankIdentifier;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("accountNumber")
    private final String accountNumber;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f222059a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f222059a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.loan.impl.database.entity.LoanDetailsShardEntity.LoanAutoPayDescriptor", aVar, 6);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("externalId", false);
            pluginGeneratedSerialDescriptor.j("bankIdentifier", false);
            pluginGeneratedSerialDescriptor.j("accountNumber", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
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
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
                        i |= 16;
                        break;
                    case 5:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str3);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new g(strDecodeStringElement, i, strDecodeStringElement2, strDecodeStringElement3, str, str2, str3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            g value = (g) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            g.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: o45.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f222059a;
        }
    }

    public /* synthetic */ g(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            qlm.j1.f(a.f222059a.getDescriptor(), i, 63);
            throw null;
        }
        this.id = str;
        this.state = str2;
        this.type = str3;
        this.externalId = str4;
        this.bankIdentifier = str5;
        this.accountNumber = str6;
    }

    public static final /* synthetic */ void g(g gVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, gVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gVar.state);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gVar.type);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, gVar.externalId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, gVar.bankIdentifier);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, gVar.accountNumber);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankIdentifier() {
        return this.bankIdentifier;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.state, gVar.state) && Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.externalId, gVar.externalId) && Intrinsics.f(this.bankIdentifier, gVar.bankIdentifier) && Intrinsics.f(this.accountNumber, gVar.accountNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.type);
        String str = this.externalId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankIdentifier;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public g(String id10, String state, String type, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.state = state;
        this.type = type;
        this.externalId = str;
        this.bankIdentifier = str2;
        this.accountNumber = str3;
    }
}

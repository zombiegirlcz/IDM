package xhf;

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
import xhf.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0019"}, d2 = {"Lxhf/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "transactionHash", "Lxhf/q;", "b", "Lxhf/q;", "c", "()Lxhf/q;", "display", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "belowMinimum", "d", "blockchain", "e", "state", "sourceAddress", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class r {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionHash")
    private final String transactionHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("display")
    private final q display;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("belowMinimum")
    private final Boolean belowMinimum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("blockchain")
    private final String blockchain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("sourceAddress")
    private final String sourceAddress;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306148a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306148a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.CryptoDepositDetailsDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("transactionHash", false);
            pluginGeneratedSerialDescriptor.j("display", false);
            pluginGeneratedSerialDescriptor.j("belowMinimum", false);
            pluginGeneratedSerialDescriptor.j("blockchain", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("sourceAddress", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(q.a.f306139a), nlm.a.c(qlm.h.f247648a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            q qVar = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        qVar = (q) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, q.a.f306139a, qVar);
                        i |= 2;
                        break;
                    case 2:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, bool);
                        i |= 4;
                        break;
                    case 3:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
                        i |= 8;
                        break;
                    case 4:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str3);
                        i |= 16;
                        break;
                    case 5:
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str4);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new r(i, str, qVar, bool, str2, str3, str4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            r value = (r) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            r.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306148a;
        }
    }

    public /* synthetic */ r(int i, String str, q qVar, Boolean bool, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            qlm.j1.f(a.f306148a.getDescriptor(), i, 63);
            throw null;
        }
        this.transactionHash = str;
        this.display = qVar;
        this.belowMinimum = bool;
        this.blockchain = str2;
        this.state = str3;
        this.sourceAddress = str4;
    }

    public static final /* synthetic */ void g(r rVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, rVar.transactionHash);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, q.a.f306139a, rVar.display);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, rVar.belowMinimum);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, rVar.blockchain);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, rVar.state);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, rVar.sourceAddress);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getBelowMinimum() {
        return this.belowMinimum;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBlockchain() {
        return this.blockchain;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourceAddress() {
        return this.sourceAddress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.transactionHash, rVar.transactionHash) && Intrinsics.f(this.display, rVar.display) && Intrinsics.f(this.belowMinimum, rVar.belowMinimum) && Intrinsics.f(this.blockchain, rVar.blockchain) && Intrinsics.f(this.state, rVar.state) && Intrinsics.f(this.sourceAddress, rVar.sourceAddress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    public final int hashCode() {
        String str = this.transactionHash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        q qVar = this.display;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Boolean bool = this.belowMinimum;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.blockchain;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceAddress;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}

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
import xhf.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lxhf/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "addressId", "b", "e", "transactionHash", "Lxhf/s;", "c", "Lxhf/s;", "()Lxhf/s;", "display", "d", "failureCode", "state", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressId")
    private final String addressId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionHash")
    private final String transactionHash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("display")
    private final s display;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("failureCode")
    private final String failureCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306170a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306170a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.CryptoWithdrawDetailsDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("addressId", false);
            pluginGeneratedSerialDescriptor.j("transactionHash", false);
            pluginGeneratedSerialDescriptor.j("display", false);
            pluginGeneratedSerialDescriptor.j("failureCode", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(s.a.f306157a), nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
            s sVar = null;
            String str3 = null;
            String str4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
                    i |= 2;
                } else if (iD == 2) {
                    sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s.a.f306157a, sVar);
                    i |= 4;
                } else if (iD == 3) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str4);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new t(i, str, str2, sVar, str3, str4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            t value = (t) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            t.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.t$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306170a;
        }
    }

    public /* synthetic */ t(int i, String str, String str2, s sVar, String str3, String str4) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f306170a.getDescriptor(), i, 31);
            throw null;
        }
        this.addressId = str;
        this.transactionHash = str2;
        this.display = sVar;
        this.failureCode = str3;
        this.state = str4;
    }

    public static final /* synthetic */ void f(t tVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, tVar.addressId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, tVar.transactionHash);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, s.a.f306157a, tVar.display);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, tVar.failureCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, tVar.state);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFailureCode() {
        return this.failureCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.addressId, tVar.addressId) && Intrinsics.f(this.transactionHash, tVar.transactionHash) && Intrinsics.f(this.display, tVar.display) && Intrinsics.f(this.failureCode, tVar.failureCode) && Intrinsics.f(this.state, tVar.state);
    }

    public final int hashCode() {
        String str = this.addressId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionHash;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        s sVar = this.display;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str3 = this.failureCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}

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
import xhf.k0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0010"}, d2 = {"Lxhf/h1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "juniorUserId", "b", "c", "transferIntent", "Lxhf/k0;", "Lxhf/k0;", "()Lxhf/k0;", "p2pTransferRequest", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("youthId")
    @NotNull
    private final String juniorUserId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferIntent")
    private final String transferIntent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("p2pTransferRequest")
    private final k0 p2pTransferRequest;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306009a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306009a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionJuniorDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("juniorUserId", false);
            pluginGeneratedSerialDescriptor.j("transferIntent", false);
            pluginGeneratedSerialDescriptor.j("p2pTransferRequest", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(k0.a.f306067a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            String str = null;
            k0 k0Var = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    k0Var = (k0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, k0.a.f306067a, k0Var);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new h1(i, strDecodeStringElement, str, k0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            h1 value = (h1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            h1.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.h1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306009a;
        }
    }

    public /* synthetic */ h1(int i, String str, String str2, k0 k0Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f306009a.getDescriptor(), i, 7);
            throw null;
        }
        this.juniorUserId = str;
        this.transferIntent = str2;
        this.p2pTransferRequest = k0Var;
    }

    public static final /* synthetic */ void d(h1 h1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, h1Var.juniorUserId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, h1Var.transferIntent);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, k0.a.f306067a, h1Var.p2pTransferRequest);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getJuniorUserId() {
        return this.juniorUserId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k0 getP2pTransferRequest() {
        return this.p2pTransferRequest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTransferIntent() {
        return this.transferIntent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.juniorUserId, h1Var.juniorUserId) && Intrinsics.f(this.transferIntent, h1Var.transferIntent) && Intrinsics.f(this.p2pTransferRequest, h1Var.p2pTransferRequest);
    }

    public final int hashCode() {
        int iHashCode = this.juniorUserId.hashCode() * 31;
        String str = this.transferIntent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k0 k0Var = this.p2pTransferRequest;
        return iHashCode2 + (k0Var != null ? k0Var.hashCode() : 0);
    }
}

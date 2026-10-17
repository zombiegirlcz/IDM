package yh6;

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
import yh6.a0;
import yh6.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lyh6/w;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "b", "Ljava/lang/String;", "getPocketId", "pocketId", "Lyh6/v;", "c", "Lyh6/v;", "getTopupMethodDetails", "()Lyh6/v;", "topupMethodDetails", "Lyh6/a0;", "d", "Lyh6/a0;", "getMetadata", "()Lyh6/a0;", "metadata", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class w {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupMethodDetails")
    @NotNull
    private final v topupMethodDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("metadata")
    private final a0 metadata;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313859a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313859a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.repository.models.PseOpenBankingTopUpRequestDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("pocketId", false);
            pluginGeneratedSerialDescriptor.j("topupMethodDetails", false);
            pluginGeneratedSerialDescriptor.j("metadata", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{a.C1001a.f176860a, v1.f247718a, v.a.f313855a, nlm.a.c(a0.a.f313778a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            jo3.a aVar = null;
            String strDecodeStringElement = null;
            v vVar = null;
            a0 a0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    vVar = (v) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, v.a.f313855a, vVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    a0Var = (a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a0.a.f313778a, a0Var);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new w(i, aVar, strDecodeStringElement, vVar, a0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            w value = (w) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            w.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yh6.w$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313859a;
        }
    }

    public /* synthetic */ w(int i, jo3.a aVar, String str, v vVar, a0 a0Var) {
        if (7 != (i & 7)) {
            j1.f(a.f313859a.getDescriptor(), i, 7);
            throw null;
        }
        this.amount = aVar;
        this.pocketId = str;
        this.topupMethodDetails = vVar;
        if ((i & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = a0Var;
        }
    }

    public static final /* synthetic */ void a(w wVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, wVar.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wVar.pocketId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, v.a.f313855a, wVar.topupMethodDetails);
        if (!compositeEncoder.d(serialDescriptor) && wVar.metadata == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, a0.a.f313778a, wVar.metadata);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.amount, wVar.amount) && Intrinsics.f(this.pocketId, wVar.pocketId) && Intrinsics.f(this.topupMethodDetails, wVar.topupMethodDetails) && Intrinsics.f(this.metadata, wVar.metadata);
    }

    public final int hashCode() {
        int iHashCode = (this.topupMethodDetails.hashCode() + p.a.c(this.amount.hashCode() * 31, 31, this.pocketId)) * 31;
        a0 a0Var = this.metadata;
        return iHashCode + (a0Var == null ? 0 : a0Var.hashCode());
    }

    public w(jo3.a amount, String pocketId, v topupMethodDetails) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(topupMethodDetails, "topupMethodDetails");
        this.amount = amount;
        this.pocketId = pocketId;
        this.topupMethodDetails = topupMethodDetails;
        this.metadata = null;
    }
}

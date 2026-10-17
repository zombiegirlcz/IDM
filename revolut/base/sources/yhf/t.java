package yhf;

import java.util.List;
import jo3.a;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lyhf/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "txReference", "b", "operationType", "", "Ljava/util/List;", "()Ljava/util/List;", "goodsLines", "Ljo3/a;", "d", "Ljo3/a;", "getBlikAtmFee", "()Ljo3/a;", "blikAtmFee", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new yh6.y(6)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("txRef")
    @NotNull
    private final String txReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("operationType")
    @NotNull
    private final String operationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("goodsLines")
    private final List<String> goodsLines;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("blikAtmFee")
    private final jo3.a blikAtmFee;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314079a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314079a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.TransactionDetailsBlikDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("txReference", false);
            pluginGeneratedSerialDescriptor.j("operationType", false);
            pluginGeneratedSerialDescriptor.j("goodsLines", false);
            pluginGeneratedSerialDescriptor.j("blikAtmFee", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c((KSerializer) t.e[2].getValue());
            KSerializer kSerializerC2 = nlm.a.c(a.C1001a.f176860a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = t.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            List list = null;
            jo3.a aVar = null;
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
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new t(i, strDecodeStringElement, strDecodeStringElement2, list, aVar);
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
            t.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.t$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314079a;
        }
    }

    public /* synthetic */ t(int i, String str, String str2, List list, jo3.a aVar) {
        if (7 != (i & 7)) {
            j1.f(a.f314079a.getDescriptor(), i, 7);
            throw null;
        }
        this.txReference = str;
        this.operationType = str2;
        this.goodsLines = list;
        if ((i & 8) == 0) {
            this.blikAtmFee = null;
        } else {
            this.blikAtmFee = aVar;
        }
    }

    public static final /* synthetic */ void d(t tVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tVar.txReference);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tVar.operationType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) e[2].getValue(), tVar.goodsLines);
        if (!compositeEncoder.d(serialDescriptor) && tVar.blikAtmFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, tVar.blikAtmFee);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getGoodsLines() {
        return this.goodsLines;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTxReference() {
        return this.txReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.txReference, tVar.txReference) && Intrinsics.f(this.operationType, tVar.operationType) && Intrinsics.f(this.goodsLines, tVar.goodsLines) && Intrinsics.f(this.blikAtmFee, tVar.blikAtmFee);
    }

    public final int hashCode() {
        int iC = p.a.c(this.txReference.hashCode() * 31, 31, this.operationType);
        List<String> list = this.goodsLines;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        jo3.a aVar = this.blikAtmFee;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}

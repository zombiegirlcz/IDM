package yhf;

import java.util.List;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u0012"}, d2 = {"Lyhf/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "facilityId", "b", "d", "type", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "relatedTransactions", "relatedStatementDate", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new yh6.y(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("relatedTransactions")
    private final List<String> relatedTransactions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("relatedStatementDate")
    private final String relatedStatementDate;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313964a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313964a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.CreditCardInterestInfoDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("facilityId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("relatedTransactions", false);
            pluginGeneratedSerialDescriptor.j("relatedStatementDate", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = f.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), v1Var, nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = f.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String strDecodeStringElement = null;
            String str2 = null;
            List list = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new f(i, str, strDecodeStringElement, str2, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            f value = (f) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            f.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.f$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313964a;
        }
    }

    public /* synthetic */ f(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f313964a.getDescriptor(), i, 15);
            throw null;
        }
        this.facilityId = str;
        this.type = str2;
        this.relatedTransactions = list;
        this.relatedStatementDate = str3;
    }

    public static final /* synthetic */ void e(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, fVar.facilityId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, fVar.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) e[2].getValue(), fVar.relatedTransactions);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, fVar.relatedStatementDate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRelatedStatementDate() {
        return this.relatedStatementDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getRelatedTransactions() {
        return this.relatedTransactions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.facilityId, fVar.facilityId) && Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.relatedTransactions, fVar.relatedTransactions) && Intrinsics.f(this.relatedStatementDate, fVar.relatedStatementDate);
    }

    public final int hashCode() {
        String str = this.facilityId;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
        List<String> list = this.relatedTransactions;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.relatedStatementDate;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

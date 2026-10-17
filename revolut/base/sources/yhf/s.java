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
import yhf.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0018"}, d2 = {"Lyhf/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "digitableLine", "b", "e", "dueDate", "Lyhf/r;", "c", "Lyhf/r;", "()Lyhf/r;", "beneficiary", "", "Lyhf/e;", "Ljava/util/List;", "()Ljava/util/List;", "apmBillDetailsDto", "billIdentifier", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new yh6.y(5)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitableLine")
    private final String digitableLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiary")
    private final r beneficiary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("details")
    private final List<e> apmBillDetailsDto;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("billIdentifier")
    private final String billIdentifier;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314075a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314075a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.TransactionDetailsBillDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("digitableLine", false);
            pluginGeneratedSerialDescriptor.j("dueDate", false);
            pluginGeneratedSerialDescriptor.j("beneficiary", false);
            pluginGeneratedSerialDescriptor.j("apmBillDetailsDto", false);
            pluginGeneratedSerialDescriptor.j("billIdentifier", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = s.f;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(r.a.f314071a), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = s.f;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            r rVar = null;
            List list = null;
            String str3 = null;
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
                    rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, r.a.f314071a, rVar);
                    i |= 4;
                } else if (iD == 3) {
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new s(i, str, str2, rVar, list, str3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            s value = (s) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            s.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.s$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314075a;
        }
    }

    public /* synthetic */ s(int i, String str, String str2, r rVar, List list, String str3) {
        if (31 != (i & 31)) {
            j1.f(a.f314075a.getDescriptor(), i, 31);
            throw null;
        }
        this.digitableLine = str;
        this.dueDate = str2;
        this.beneficiary = rVar;
        this.apmBillDetailsDto = list;
        this.billIdentifier = str3;
    }

    public static final /* synthetic */ void f(s sVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, sVar.digitableLine);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, sVar.dueDate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, r.a.f314071a, sVar.beneficiary);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) f[3].getValue(), sVar.apmBillDetailsDto);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, sVar.billIdentifier);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getApmBillDetailsDto() {
        return this.apmBillDetailsDto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getBeneficiary() {
        return this.beneficiary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBillIdentifier() {
        return this.billIdentifier;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDigitableLine() {
        return this.digitableLine;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.digitableLine, sVar.digitableLine) && Intrinsics.f(this.dueDate, sVar.dueDate) && Intrinsics.f(this.beneficiary, sVar.beneficiary) && Intrinsics.f(this.apmBillDetailsDto, sVar.apmBillDetailsDto) && Intrinsics.f(this.billIdentifier, sVar.billIdentifier);
    }

    public final int hashCode() {
        String str = this.digitableLine;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dueDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        r rVar = this.beneficiary;
        int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        List<e> list = this.apmBillDetailsDto;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.billIdentifier;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}

package gsf;

import gr2.j0;
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
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0005\u0010\fR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0013\u0010\f¨\u0006\u0016"}, d2 = {"Lgsf/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "catalogue", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "operations", "d", "originalTransactionId", "Lgsf/e;", "additionalInfo", "Lgsf/n;", "e", "values", "Companion", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("catalogue")
    private final String catalogue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("operations")
    private final List<String> operations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalTransactionId")
    private final String originalTransactionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("additionalInfo")
    private final List<e> additionalInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("values")
    private final List<n> values;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f146431a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f146431a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transfer_reasons.dto.TransactionTransferReasonsDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("catalogue", false);
            pluginGeneratedSerialDescriptor.j("operations", false);
            pluginGeneratedSerialDescriptor.j("originalTransactionId", false);
            pluginGeneratedSerialDescriptor.j("additionalInfo", false);
            pluginGeneratedSerialDescriptor.j("values", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = m.f;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c((KSerializer) lazyArr[4].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = m.f;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            List list = null;
            String str2 = null;
            List list2 = null;
            List list3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                } else if (iD == 2) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                } else if (iD == 3) {
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list3);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new m(i, str, list, str2, list2, list3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            m value = (m) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            m.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: gsf.m$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f146431a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, yhm.j.c(kVar, new j0(16)), null, yhm.j.c(kVar, new j0(17)), yhm.j.c(kVar, new j0(18))};
    }

    public /* synthetic */ m(int i, String str, List list, String str2, List list2, List list3) {
        if (31 != (i & 31)) {
            j1.f(a.f146431a.getDescriptor(), i, 31);
            throw null;
        }
        this.catalogue = str;
        this.operations = list;
        this.originalTransactionId = str2;
        this.additionalInfo = list2;
        this.values = list3;
    }

    public static final /* synthetic */ void f(m mVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, mVar.catalogue);
        Lazy[] lazyArr = f;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), mVar.operations);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, mVar.originalTransactionId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), mVar.additionalInfo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), mVar.values);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCatalogue() {
        return this.catalogue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getOperations() {
        return this.operations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getValues() {
        return this.values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.catalogue, mVar.catalogue) && Intrinsics.f(this.operations, mVar.operations) && Intrinsics.f(this.originalTransactionId, mVar.originalTransactionId) && Intrinsics.f(this.additionalInfo, mVar.additionalInfo) && Intrinsics.f(this.values, mVar.values);
    }

    public final int hashCode() {
        String str = this.catalogue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.operations;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.originalTransactionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<e> list2 = this.additionalInfo;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<n> list3 = this.values;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }
}

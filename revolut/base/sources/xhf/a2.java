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
import xhf.b2;
import xhf.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u000e\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006\""}, d2 = {"Lxhf/a2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "period", "i", "type", "d", "h", "startDate", "e", "nextDate", "", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "recurring", "estimated", "Lxhf/c2;", "Lxhf/c2;", "()Lxhf/c2;", "lowBalance", "Lxhf/b2;", "Lxhf/b2;", "()Lxhf/b2;", "excessBalance", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextDate")
    private final String nextDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recurring")
    private final Boolean recurring;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimated")
    private final Boolean estimated;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lowBalance")
    private final c2 lowBalance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("excessBalance")
    private final b2 excessBalance;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305879a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f305879a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionStandingOrderDto", aVar, 9);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("period", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("startDate", false);
            pluginGeneratedSerialDescriptor.j("nextDate", false);
            pluginGeneratedSerialDescriptor.j("recurring", false);
            pluginGeneratedSerialDescriptor.j("estimated", false);
            pluginGeneratedSerialDescriptor.j("lowBalance", false);
            pluginGeneratedSerialDescriptor.j("excessBalance", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c(v1Var);
            KSerializer kSerializerC4 = nlm.a.c(v1Var);
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(hVar), nlm.a.c(hVar), nlm.a.c(c2.a.f305902a), nlm.a.c(b2.a.f305889a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            c2 c2Var = null;
            b2 b2Var = null;
            int i = 0;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str4);
                        i |= 16;
                        break;
                    case 5:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, bool);
                        i |= 32;
                        break;
                    case 6:
                        bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.h.f247648a, bool2);
                        i |= 64;
                        break;
                    case 7:
                        c2Var = (c2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, c2.a.f305902a, c2Var);
                        i |= 128;
                        break;
                    case 8:
                        b2Var = (b2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, b2.a.f305889a, b2Var);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a2(i, strDecodeStringElement, str, str2, str3, str4, bool, bool2, c2Var, b2Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a2 value = (a2) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a2.j(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.a2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f305879a;
        }
    }

    public /* synthetic */ a2(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, c2 c2Var, b2 b2Var) {
        if (511 != (i & 511)) {
            qlm.j1.f(a.f305879a.getDescriptor(), i, 511);
            throw null;
        }
        this.id = str;
        this.period = str2;
        this.type = str3;
        this.startDate = str4;
        this.nextDate = str5;
        this.recurring = bool;
        this.estimated = bool2;
        this.lowBalance = c2Var;
        this.excessBalance = b2Var;
    }

    public static final /* synthetic */ void j(a2 a2Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, a2Var.id);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, a2Var.period);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, a2Var.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, a2Var.startDate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, a2Var.nextDate);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, hVar, a2Var.recurring);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, hVar, a2Var.estimated);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, c2.a.f305902a, a2Var.lowBalance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, b2.a.f305889a, a2Var.excessBalance);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getEstimated() {
        return this.estimated;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b2 getExcessBalance() {
        return this.excessBalance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c2 getLowBalance() {
        return this.lowBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNextDate() {
        return this.nextDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.id, a2Var.id) && Intrinsics.f(this.period, a2Var.period) && Intrinsics.f(this.type, a2Var.type) && Intrinsics.f(this.startDate, a2Var.startDate) && Intrinsics.f(this.nextDate, a2Var.nextDate) && Intrinsics.f(this.recurring, a2Var.recurring) && Intrinsics.f(this.estimated, a2Var.estimated) && Intrinsics.f(this.lowBalance, a2Var.lowBalance) && Intrinsics.f(this.excessBalance, a2Var.excessBalance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.period;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nextDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.recurring;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.estimated;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        c2 c2Var = this.lowBalance;
        int iHashCode8 = (iHashCode7 + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        b2 b2Var = this.excessBalance;
        return iHashCode8 + (b2Var != null ? b2Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}

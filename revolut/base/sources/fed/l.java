package fed;

import hed.a;
import java.time.LocalDate;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfed/l;", "Lfed/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class l extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, yhm.j.c(yhm.k.PUBLICATION, new fce.b(18)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.j f134538c;
    public final LocalDate d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f134539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f134540h;
    public final hed.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f134541j;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134542a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134542a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("INTEREST_PAYMENT", aVar, 9);
            pluginGeneratedSerialDescriptor.j("eventId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("effectiveDate", false);
            pluginGeneratedSerialDescriptor.j("symbol", false);
            pluginGeneratedSerialDescriptor.j("ref", false);
            pluginGeneratedSerialDescriptor.j("paymentDate", false);
            pluginGeneratedSerialDescriptor.j("observationDate", false);
            pluginGeneratedSerialDescriptor.j("amountPerNominal", false);
            pluginGeneratedSerialDescriptor.j("confirmed", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = l.k;
            v1 v1Var = v1.f247718a;
            ie0.m mVar = ie0.m.f160609a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), mVar, v1Var, v1Var, mVar, nlm.a.c(mVar), nlm.a.c(a.C0869a.f151684a), qlm.h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = l.k;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            iel.j jVar = null;
            LocalDate localDate = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            LocalDate localDate2 = null;
            LocalDate localDate3 = null;
            hed.a aVar = null;
            int i = 0;
            boolean zDecodeBooleanElement = false;
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
                        jVar = (iel.j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), jVar);
                        i |= 2;
                        break;
                    case 2:
                        localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, localDate);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        localDate2 = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, ie0.m.f160609a, localDate2);
                        i |= 32;
                        break;
                    case 6:
                        localDate3 = (LocalDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ie0.m.f160609a, localDate3);
                        i |= 64;
                        break;
                    case 7:
                        aVar = (hed.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, a.C0869a.f151684a, aVar);
                        i |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new l(i, strDecodeStringElement, jVar, localDate, strDecodeStringElement2, strDecodeStringElement3, localDate2, localDate3, aVar, zDecodeBooleanElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            l value = (l) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = l.k;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134537b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f134538c);
            ie0.m mVar = ie0.m.f160609a;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, mVar, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, mVar, value.f134539g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, mVar, value.f134540h);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, a.C0869a.f151684a, value.i);
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, value.f134541j);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fed.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134542a;
        }
    }

    public /* synthetic */ l(int i, String str, iel.j jVar, LocalDate localDate, String str2, String str3, LocalDate localDate2, LocalDate localDate3, hed.a aVar, boolean z) {
        if (511 != (i & 511)) {
            j1.f(a.f134542a.getDescriptor(), i, 511);
            throw null;
        }
        this.f134537b = str;
        this.f134538c = jVar;
        this.d = localDate;
        this.e = str2;
        this.f = str3;
        this.f134539g = localDate2;
        this.f134540h = localDate3;
        this.i = aVar;
        this.f134541j = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f134537b, lVar.f134537b) && this.f134538c == lVar.f134538c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f134539g, lVar.f134539g) && Intrinsics.f(this.f134540h, lVar.f134540h) && Intrinsics.f(this.i, lVar.i) && this.f134541j == lVar.f134541j;
    }

    public final int hashCode() {
        int iA = wp5.y.a(p.a.c(p.a.c(wp5.y.a((this.f134538c.hashCode() + (this.f134537b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f134539g);
        LocalDate localDate = this.f134540h;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        hed.a aVar = this.i;
        return Boolean.hashCode(this.f134541j) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }
}

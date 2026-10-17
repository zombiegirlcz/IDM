package fed;

import java.time.LocalDate;
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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfed/c;", "Lfed/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, yhm.j.c(yhm.k.PUBLICATION, new fce.b(12)), null, null, null, null, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.j f134507c;
    public final LocalDate d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f134508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.a f134509h;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134510a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134510a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CASH_DIVIDEND", aVar, 7);
            pluginGeneratedSerialDescriptor.j("eventId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("effectiveDate", false);
            pluginGeneratedSerialDescriptor.j("symbol", false);
            pluginGeneratedSerialDescriptor.j("ref", false);
            pluginGeneratedSerialDescriptor.j("exDividendDate", false);
            pluginGeneratedSerialDescriptor.j("amount", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = c.i;
            v1 v1Var = v1.f247718a;
            ie0.m mVar = ie0.m.f160609a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), mVar, v1Var, v1Var, nlm.a.c(mVar), a.C1001a.f176860a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c.i;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            iel.j jVar = null;
            LocalDate localDate = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            LocalDate localDate2 = null;
            jo3.a aVar = null;
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
                        localDate2 = (LocalDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.m.f160609a, localDate2);
                        i |= 32;
                        break;
                    case 6:
                        aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, strDecodeStringElement, jVar, localDate, strDecodeStringElement2, strDecodeStringElement3, localDate2, aVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c value = (c) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c.i;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134506b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f134507c);
            ie0.m mVar = ie0.m.f160609a;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, mVar, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, mVar, value.f134508g);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, value.f134509h);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fed.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134510a;
        }
    }

    public /* synthetic */ c(int i2, String str, iel.j jVar, LocalDate localDate, String str2, String str3, LocalDate localDate2, jo3.a aVar) {
        if (127 != (i2 & CertificateBody.profileType)) {
            j1.f(a.f134510a.getDescriptor(), i2, CertificateBody.profileType);
            throw null;
        }
        this.f134506b = str;
        this.f134507c = jVar;
        this.d = localDate;
        this.e = str2;
        this.f = str3;
        this.f134508g = localDate2;
        this.f134509h = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f134506b, cVar.f134506b) && this.f134507c == cVar.f134507c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f134508g, cVar.f134508g) && Intrinsics.f(this.f134509h, cVar.f134509h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(wp5.y.a((this.f134507c.hashCode() + (this.f134506b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        LocalDate localDate = this.f134508g;
        return this.f134509h.hashCode() + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}

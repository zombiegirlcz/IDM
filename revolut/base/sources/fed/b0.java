package fed;

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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfed/b0;", "Lfed/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b0 extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, yhm.j.c(yhm.k.PUBLICATION, new a0(0)), null, null, null, null, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.j f134502c;
    public final LocalDate d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f134503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f134504h;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134505a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134505a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SYMBOL_CHANGE", aVar, 7);
            pluginGeneratedSerialDescriptor.j("eventId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("effectiveDate", false);
            pluginGeneratedSerialDescriptor.j("symbol", false);
            pluginGeneratedSerialDescriptor.j("ref", false);
            pluginGeneratedSerialDescriptor.j("oldSymbol", false);
            pluginGeneratedSerialDescriptor.j("newSymbol", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b0.i;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), ie0.m.f160609a, v1Var, v1Var, v1Var, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b0.i;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            iel.j jVar = null;
            LocalDate localDate = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
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
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b0(i, strDecodeStringElement, jVar, localDate, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b0 value = (b0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b0.i;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134501b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f134502c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f134503g);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f134504h);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fed.b0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134505a;
        }
    }

    public /* synthetic */ b0(int i2, String str, iel.j jVar, LocalDate localDate, String str2, String str3, String str4, String str5) {
        if (127 != (i2 & CertificateBody.profileType)) {
            j1.f(a.f134505a.getDescriptor(), i2, CertificateBody.profileType);
            throw null;
        }
        this.f134501b = str;
        this.f134502c = jVar;
        this.d = localDate;
        this.e = str2;
        this.f = str3;
        this.f134503g = str4;
        this.f134504h = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f134501b, b0Var.f134501b) && this.f134502c == b0Var.f134502c && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f134503g, b0Var.f134503g) && Intrinsics.f(this.f134504h, b0Var.f134504h);
    }

    public final int hashCode() {
        return this.f134504h.hashCode() + p.a.c(p.a.c(p.a.c(wp5.y.a((this.f134502c.hashCode() + (this.f134501b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f134503g);
    }
}

package fed;

import java.time.Instant;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfed/n;", "Lfed/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class n extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f134548j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.j f134550c;
    public final LocalDate d;
    public final iel.l e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f134551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f134552h;
    public final Instant i;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134553a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134553a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MARKET_HOLIDAY", aVar, 8);
            pluginGeneratedSerialDescriptor.j("eventId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("effectiveDate", false);
            pluginGeneratedSerialDescriptor.j("holiday", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("marketClosed", false);
            pluginGeneratedSerialDescriptor.j("marketOpenTime", false);
            pluginGeneratedSerialDescriptor.j("marketCloseTime", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = n.f134548j;
            v1 v1Var = v1.f247718a;
            ie0.j jVar = ie0.j.f160602a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), ie0.m.f160609a, lazyArr[3].getValue(), v1Var, qlm.h.f247648a, nlm.a.c(jVar), nlm.a.c(jVar)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = n.f134548j;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            iel.j jVar = null;
            LocalDate localDate = null;
            iel.l lVar = null;
            String strDecodeStringElement2 = null;
            Instant instant = null;
            Instant instant2 = null;
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
                        lVar = (iel.l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), lVar);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ie0.j.f160602a, instant);
                        i |= 64;
                        break;
                    case 7:
                        instant2 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant2);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n(i, strDecodeStringElement, jVar, localDate, lVar, strDecodeStringElement2, zDecodeBooleanElement, instant, instant2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            n value = (n) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = n.f134548j;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134549b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f134550c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, value.d);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f134551g);
            ie0.j jVar = ie0.j.f160602a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, jVar, value.f134552h);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, jVar, value.i);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fed.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134553a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f134548j = new Lazy[]{null, yhm.j.c(kVar, new fce.b(20)), null, yhm.j.c(kVar, new fce.b(21)), null, null, null, null};
    }

    public /* synthetic */ n(int i, String str, iel.j jVar, LocalDate localDate, iel.l lVar, String str2, boolean z, Instant instant, Instant instant2) {
        if (255 != (i & 255)) {
            j1.f(a.f134553a.getDescriptor(), i, 255);
            throw null;
        }
        this.f134549b = str;
        this.f134550c = jVar;
        this.d = localDate;
        this.e = lVar;
        this.f = str2;
        this.f134551g = z;
        this.f134552h = instant;
        this.i = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f134549b, nVar.f134549b) && this.f134550c == nVar.f134550c && Intrinsics.f(this.d, nVar.d) && this.e == nVar.e && Intrinsics.f(this.f, nVar.f) && this.f134551g == nVar.f134551g && Intrinsics.f(this.f134552h, nVar.f134552h) && Intrinsics.f(this.i, nVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c((this.e.hashCode() + wp5.y.a((this.f134550c.hashCode() + (this.f134549b.hashCode() * 31)) * 31, 31, this.d)) * 31, 31, this.f), 31, this.f134551g);
        Instant instant = this.f134552h;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.i;
        return iHashCode + (instant2 != null ? instant2.hashCode() : 0);
    }
}

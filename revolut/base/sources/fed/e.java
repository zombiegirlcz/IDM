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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfed/e;", "Lfed/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f134520l = {null, yhm.j.c(yhm.k.PUBLICATION, new fce.b(14)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.j f134522c;
    public final LocalDate d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f134523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f134524h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f134525j;
    public final String k;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134526a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134526a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("EARNINGS_CALL", aVar, 10);
            pluginGeneratedSerialDescriptor.j("eventId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("effectiveDate", false);
            pluginGeneratedSerialDescriptor.j("symbol", false);
            pluginGeneratedSerialDescriptor.j("ref", false);
            pluginGeneratedSerialDescriptor.j("webcastUri", false);
            pluginGeneratedSerialDescriptor.j("replayWebcastUri", false);
            pluginGeneratedSerialDescriptor.j("webcastStartDate", false);
            pluginGeneratedSerialDescriptor.j("webcastEndDate", false);
            pluginGeneratedSerialDescriptor.j("transcriptUri", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = e.f134520l;
            v1 v1Var = v1.f247718a;
            ie0.j jVar = ie0.j.f160602a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), ie0.m.f160609a, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(jVar), nlm.a.c(jVar), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = e.f134520l;
            dVarBeginStructure.getClass();
            Instant instant = null;
            String str = null;
            String strDecodeStringElement = null;
            iel.j jVar = null;
            LocalDate localDate = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str2 = null;
            String str3 = null;
            Instant instant2 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        lazyArr = lazyArr2;
                        z = false;
                        break;
                    case 0:
                        lazyArr = lazyArr2;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        jVar = (iel.j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), jVar);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, localDate);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str3);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        instant2 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant2);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ie0.j.f160602a, instant);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str);
                        i |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, strDecodeStringElement, jVar, localDate, strDecodeStringElement2, strDecodeStringElement3, str2, str3, instant2, instant, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e value = (e) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e.f134520l;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134521b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f134522c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
            v1 v1Var = v1.f247718a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f134523g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f134524h);
            ie0.j jVar = ie0.j.f160602a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, jVar, value.i);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, jVar, value.f134525j);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, value.k);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fed.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134526a;
        }
    }

    public /* synthetic */ e(int i, String str, iel.j jVar, LocalDate localDate, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, String str6) {
        if (1023 != (i & 1023)) {
            j1.f(a.f134526a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f134521b = str;
        this.f134522c = jVar;
        this.d = localDate;
        this.e = str2;
        this.f = str3;
        this.f134523g = str4;
        this.f134524h = str5;
        this.i = instant;
        this.f134525j = instant2;
        this.k = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f134521b, eVar.f134521b) && this.f134522c == eVar.f134522c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f134523g, eVar.f134523g) && Intrinsics.f(this.f134524h, eVar.f134524h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f134525j, eVar.f134525j) && Intrinsics.f(this.k, eVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(wp5.y.a((this.f134522c.hashCode() + (this.f134521b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.f134523g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f134524h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.i;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f134525j;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}

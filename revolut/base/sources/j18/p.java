package j18;

import java.time.Instant;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lj18/p;", "Lj18/h;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class p implements h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f170152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170154c;
    public final String d;
    public final String e;
    public final u f;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f170155a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f170155a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.invest.smart_notifications.impl.data.network.models.PriceAlertFeedElementDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("date", false);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("ref", false);
            pluginGeneratedSerialDescriptor.j("priceImpact", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{ie0.j.f160602a, v1Var, v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(q.f170156a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            u uVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            String strDecodeStringElement3 = null;
            Instant instant = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.j.f160602a, instant);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        uVar = (u) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, q.f170156a, uVar);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new p(i, uVar, strDecodeStringElement, strDecodeStringElement2, str, strDecodeStringElement3, instant);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            p value = (p) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            ie0.j jVar = ie0.j.f160602a;
            Instant instant = value.f170152a;
            u uVar = value.f;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, jVar, instant);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f170153b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f170154c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || uVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, q.f170156a, uVar);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j18.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f170155a;
        }
    }

    public /* synthetic */ p(int i, u uVar, String str, String str2, String str3, String str4, Instant instant) {
        if (31 != (i & 31)) {
            j1.f(a.f170155a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170152a = instant;
        this.f170153b = str;
        this.f170154c = str2;
        this.d = str3;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = uVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f170152a, pVar.f170152a) && Intrinsics.f(this.f170153b, pVar.f170153b) && Intrinsics.f(this.f170154c, pVar.f170154c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f170152a.hashCode() * 31, 31, this.f170153b), 31, this.f170154c);
        String str = this.d;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        u uVar = this.f;
        return iC2 + (uVar != null ? uVar.hashCode() : 0);
    }
}

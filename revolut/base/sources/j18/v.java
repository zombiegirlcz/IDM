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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lj18/v;", "Lj18/h;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class v implements h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f170161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170162c;
    public final String d;
    public final String e;
    public final u f;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f170163a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f170163a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.invest.smart_notifications.impl.data.network.models.RevInsightFeedElementDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("date", false);
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
            return new KSerializer[]{v1Var, ie0.j.f160602a, v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(q.f170156a)};
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
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
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
            return new v(i, uVar, strDecodeStringElement, strDecodeStringElement2, str, strDecodeStringElement3, instant);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            v value = (v) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            String str = value.f170160a;
            u uVar = value.f;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ie0.j.f160602a, value.f170161b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f170162c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || uVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, q.f170156a, uVar);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j18.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f170163a;
        }
    }

    public /* synthetic */ v(int i, u uVar, String str, String str2, String str3, String str4, Instant instant) {
        if (31 != (i & 31)) {
            j1.f(a.f170163a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170160a = str;
        this.f170161b = instant;
        this.f170162c = str2;
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
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f170160a, vVar.f170160a) && Intrinsics.f(this.f170161b, vVar.f170161b) && Intrinsics.f(this.f170162c, vVar.f170162c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(r6.b.c(this.f170160a.hashCode() * 31, 31, this.f170161b), 31, this.f170162c);
        String str = this.d;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        u uVar = this.f;
        return iC2 + (uVar != null ? uVar.hashCode() : 0);
    }
}

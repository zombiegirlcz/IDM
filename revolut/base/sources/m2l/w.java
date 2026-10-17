package m2l;

import java.math.BigDecimal;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lm2l/w;", "Lm2l/z;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "a", "feature_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class w implements z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f202231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202233c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202234a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f202234a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("NUMBER", aVar, 3);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("style", false);
            pluginGeneratedSerialDescriptor.j("placeholder", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{ie0.a.f160587a, v1Var, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            BigDecimal bigDecimal = null;
            boolean z = true;
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, bigDecimal);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new w(i, bigDecimal, strDecodeStringElement, strDecodeStringElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            w value = (w) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, value.f202231a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f202232b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f202233c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: m2l.w$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f202234a;
        }
    }

    public /* synthetic */ w(int i, BigDecimal bigDecimal, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f202234a.getDescriptor(), i, 7);
            throw null;
        }
        this.f202231a = bigDecimal;
        this.f202232b = str;
        this.f202233c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f202231a, wVar.f202231a) && Intrinsics.f(this.f202232b, wVar.f202232b) && Intrinsics.f(this.f202233c, wVar.f202233c);
    }

    public final int hashCode() {
        return this.f202233c.hashCode() + p.a.c(this.f202231a.hashCode() * 31, 31, this.f202232b);
    }

    public w(String style, String placeholder, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.f202231a = value;
        this.f202232b = style;
        this.f202233c = placeholder;
    }
}

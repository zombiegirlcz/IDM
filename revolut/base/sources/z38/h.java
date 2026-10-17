package z38;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Lz38/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCurrency$annotations", "()V", "currency", "b", "c", "getPocketType$annotations", "pocketType", "getName$annotations", "name", "Companion", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketType")
    @NotNull
    private final String pocketType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f319203a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f319203a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.joint.impl.data.dto.JointMcyErrorParamsDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("currency", false);
            pluginGeneratedSerialDescriptor.j("pocketType", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            String strDecodeStringElement2 = null;
            String str = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new h(i, strDecodeStringElement, strDecodeStringElement2, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            h value = (h) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            h.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: z38.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f319203a;
        }
    }

    public /* synthetic */ h(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f319203a.getDescriptor(), i, 7);
            throw null;
        }
        this.currency = str;
        this.pocketType = str2;
        this.name = str3;
    }

    public static final /* synthetic */ void d(h hVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hVar.currency);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, hVar.pocketType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, hVar.name);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPocketType() {
        return this.pocketType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.currency, hVar.currency) && Intrinsics.f(this.pocketType, hVar.pocketType) && Intrinsics.f(this.name, hVar.name);
    }

    public final int hashCode() {
        int iC = p.a.c(this.currency.hashCode() * 31, 31, this.pocketType);
        String str = this.name;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public h(String currency, String pocketType, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.currency = currency;
        this.pocketType = pocketType;
        this.name = str;
    }
}

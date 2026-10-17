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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\r"}, d2 = {"Lxhf/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "lastFour", "b", "c", "scheme", "logoUrl", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheme")
    @NotNull
    private final String scheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoUrl")
    private final String logoUrl;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306052a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306052a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.CardDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("lastFour", false);
            pluginGeneratedSerialDescriptor.j("scheme", false);
            pluginGeneratedSerialDescriptor.j("logoUrl", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new j(i, strDecodeStringElement, strDecodeStringElement2, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            j value = (j) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            j.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.j$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306052a;
        }
    }

    public /* synthetic */ j(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f306052a.getDescriptor(), i, 7);
            throw null;
        }
        this.lastFour = str;
        this.scheme = str2;
        this.logoUrl = str3;
    }

    public static final /* synthetic */ void d(j jVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, jVar.lastFour);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, jVar.scheme);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, jVar.logoUrl);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.lastFour, jVar.lastFour) && Intrinsics.f(this.scheme, jVar.scheme) && Intrinsics.f(this.logoUrl, jVar.logoUrl);
    }

    public final int hashCode() {
        int iC = p.a.c(this.lastFour.hashCode() * 31, 31, this.scheme);
        String str = this.logoUrl;
        return iC + (str == null ? 0 : str.hashCode());
    }
}

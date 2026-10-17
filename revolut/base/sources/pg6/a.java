package pg6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import lg.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u000b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0013"}, d2 = {"Lpg6/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getCode", "()I", "code", "b", "Ljava/lang/String;", "c", "title", "message", "d", "redirectUri", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("code")
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("message")
    private final String message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("redirectUri")
    private final String redirectUri;

    /* JADX INFO: renamed from: pg6.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1308a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1308a f235812a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1308a c1308a = new C1308a();
            f235812a = c1308a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.error.BrazilOpenBankingError", c1308a, 4);
            pluginGeneratedSerialDescriptor.j("code", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("message", false);
            pluginGeneratedSerialDescriptor.j("redirectUri", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1308a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{n0.f247680a, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            int iDecodeIntElement = 0;
            String strDecodeStringElement = null;
            String str = null;
            String str2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(strDecodeStringElement, i, iDecodeIntElement, str, str2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a value = (a) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: pg6.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1308a.f235812a;
        }
    }

    public /* synthetic */ a(String str, int i, int i2, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(C1308a.f235812a.getDescriptor(), i, 15);
            throw null;
        }
        this.code = i2;
        this.title = str;
        this.message = str2;
        this.redirectUri = str3;
    }

    public static final /* synthetic */ void d(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, aVar.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.title);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, aVar.message);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, aVar.redirectUri);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.code == aVar.code && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.message, aVar.message) && Intrinsics.f(this.redirectUri, aVar.redirectUri);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.code) * 31, 31, this.title);
        String str = this.message;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectUri;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

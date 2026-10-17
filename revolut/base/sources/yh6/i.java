package yh6;

import java.util.List;
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
import yfe.b2;
import yh6.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lyh6/i;", "Lyh6/j;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProviderId", "providerId", "b", "getStoredMethodId", "storedMethodId", "Lyh6/s;", "c", "Lyh6/s;", "getRate", "()Lyh6/s;", "rate", "", "d", "Ljava/util/List;", "getDeclarations", "()Ljava/util/List;", "declarations", "e", "getVisitCountry", "visitCountry", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class i implements j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new b2(23)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupStoredMethodId")
    @NotNull
    private final String storedMethodId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final s rate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("declarations")
    @NotNull
    private final List<String> declarations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("visitCountry")
    @NotNull
    private final String visitCountry;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313815a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313815a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.repository.models.IndiaOpenBankingTopUpMethodProviderDetailsDto.McyDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("providerId", false);
            pluginGeneratedSerialDescriptor.j("storedMethodId", false);
            pluginGeneratedSerialDescriptor.j("rate", false);
            pluginGeneratedSerialDescriptor.j("declarations", false);
            pluginGeneratedSerialDescriptor.j("visitCountry", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = i.f;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), v1Var, s.a.f313846a, lazyArr[3].getValue(), v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = i.f;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String strDecodeStringElement = null;
            s sVar = null;
            List list = null;
            String strDecodeStringElement2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    sVar = (s) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, s.a.f313846a, sVar);
                    i |= 4;
                } else if (iD == 3) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new i(i, str, strDecodeStringElement, sVar, list, strDecodeStringElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            i value = (i) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            i.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yh6.i$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313815a;
        }
    }

    public /* synthetic */ i(int i, String str, String str2, s sVar, List list, String str3) {
        if (31 != (i & 31)) {
            j1.f(a.f313815a.getDescriptor(), i, 31);
            throw null;
        }
        this.providerId = str;
        this.storedMethodId = str2;
        this.rate = sVar;
        this.declarations = list;
        this.visitCountry = str3;
    }

    public static final /* synthetic */ void a(i iVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, iVar.providerId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, iVar.storedMethodId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, s.a.f313846a, iVar.rate);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, (mlm.h) f[3].getValue(), iVar.declarations);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, iVar.visitCountry);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.providerId, iVar.providerId) && Intrinsics.f(this.storedMethodId, iVar.storedMethodId) && Intrinsics.f(this.rate, iVar.rate) && Intrinsics.f(this.declarations, iVar.declarations) && Intrinsics.f(this.visitCountry, iVar.visitCountry);
    }

    public final int hashCode() {
        String str = this.providerId;
        return this.visitCountry.hashCode() + p.a.d((this.rate.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.storedMethodId)) * 31, 31, this.declarations);
    }

    public i(String str, String storedMethodId, s rate, List declarations, String visitCountry) {
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(declarations, "declarations");
        Intrinsics.checkNotNullParameter(visitCountry, "visitCountry");
        this.providerId = str;
        this.storedMethodId = storedMethodId;
        this.rate = rate;
        this.declarations = declarations;
        this.visitCountry = visitCountry;
    }
}

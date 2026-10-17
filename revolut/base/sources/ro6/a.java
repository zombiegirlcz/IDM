package ro6;

import java.util.ArrayList;
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
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import ro6.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u001a"}, d2 = {"Lro6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "consentId", "alias", "c", "description", "Lro6/g;", "d", "Lro6/g;", "f", "()Lro6/g;", "thirdParty", "", "Lro6/d;", "e", "Ljava/util/List;", "()Ljava/util/List;", "groups", "footer", "Companion", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f255886g = {null, null, null, null, j.c(k.PUBLICATION, new rm0.k(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("consentId")
    @NotNull
    private final String consentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("alias")
    @NotNull
    private final String alias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("thirdParty")
    @NotNull
    private final g thirdParty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("groups")
    @NotNull
    private final List<d> groups;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: ro6.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1410a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1410a f255890a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1410a c1410a = new C1410a();
            f255890a = c1410a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.models.open_banking_brazil.entity.BrazilInboundConsentDetailsEntity", c1410a, 6);
            pluginGeneratedSerialDescriptor.j("consentId", false);
            pluginGeneratedSerialDescriptor.j("alias", false);
            pluginGeneratedSerialDescriptor.j("description", false);
            pluginGeneratedSerialDescriptor.j("thirdParty", false);
            pluginGeneratedSerialDescriptor.j("groups", false);
            pluginGeneratedSerialDescriptor.j("footer", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1410a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = a.f255886g;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), g.a.f255910a, lazyArr[4].getValue(), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.f255886g;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            g gVar = null;
            List list = null;
            String str2 = null;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, g.a.f255910a, gVar);
                        i |= 8;
                        break;
                    case 4:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                        i |= 16;
                        break;
                    case 5:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, strDecodeStringElement2, str, gVar, list, str2);
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
            a.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ro6.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1410a.f255890a;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, g gVar, List list, String str4) {
        if (63 != (i & 63)) {
            j1.f(C1410a.f255890a.getDescriptor(), i, 63);
            throw null;
        }
        this.consentId = str;
        this.alias = str2;
        this.description = str3;
        this.thirdParty = gVar;
        this.groups = list;
        this.footer = str4;
    }

    public static final /* synthetic */ void g(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.consentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.alias);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, aVar.description);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, g.a.f255910a, aVar.thirdParty);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, (h) f255886g[4].getValue(), aVar.groups);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, aVar.footer);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConsentId() {
        return this.consentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getGroups() {
        return this.groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.consentId, aVar.consentId) && Intrinsics.f(this.alias, aVar.alias) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.thirdParty, aVar.thirdParty) && Intrinsics.f(this.groups, aVar.groups) && Intrinsics.f(this.footer, aVar.footer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getThirdParty() {
        return this.thirdParty;
    }

    public final int hashCode() {
        int iC = p.a.c(this.consentId.hashCode() * 31, 31, this.alias);
        String str = this.description;
        int iD = p.a.d((this.thirdParty.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.groups);
        String str2 = this.footer;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public a(String consentId, String alias, String str, g thirdParty, ArrayList groups, String str2) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.consentId = consentId;
        this.alias = alias;
        this.description = str;
        this.thirdParty = thirdParty;
        this.groups = groups;
        this.footer = str2;
    }
}

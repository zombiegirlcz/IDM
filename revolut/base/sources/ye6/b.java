package ye6;

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
import ye6.e;
import ye6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0019"}, d2 = {"Lye6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "title", "c", "e", "subtitle", "Lye6/e;", "d", "Lye6/e;", "()Lye6/e;", "institutionSection", "Lye6/f;", "Lye6/f;", "()Lye6/f;", "permissionsSection", "expiration", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("institutionSection")
    @NotNull
    private final e institutionSection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("permissionsSection")
    @NotNull
    private final f permissionsSection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("expiration")
    @NotNull
    private final String expiration;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f312783a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f312783a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.account_linking.LinkedAccountConsentDetailsEntity", aVar, 6);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("institutionSection", false);
            pluginGeneratedSerialDescriptor.j("permissionsSection", false);
            pluginGeneratedSerialDescriptor.j("expiration", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), e.a.f312794a, f.a.f312798a, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            e eVar = null;
            f fVar = null;
            String strDecodeStringElement3 = null;
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
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, e.a.f312794a, eVar);
                        i |= 8;
                        break;
                    case 4:
                        fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, f.a.f312798a, fVar);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, strDecodeStringElement, strDecodeStringElement2, str, eVar, fVar, strDecodeStringElement3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            b.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ye6.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f312783a;
        }
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, e eVar, f fVar, String str4) {
        if (63 != (i & 63)) {
            j1.f(a.f312783a.getDescriptor(), i, 63);
            throw null;
        }
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.institutionSection = eVar;
        this.permissionsSection = fVar;
        this.expiration = str4;
    }

    public static final /* synthetic */ void g(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, bVar.subtitle);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, e.a.f312794a, bVar.institutionSection);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, f.a.f312798a, bVar.permissionsSection);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, bVar.expiration);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getInstitutionSection() {
        return this.institutionSection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getPermissionsSection() {
        return this.permissionsSection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.institutionSection, bVar.institutionSection) && Intrinsics.f(this.permissionsSection, bVar.permissionsSection) && Intrinsics.f(this.expiration, bVar.expiration);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return this.expiration.hashCode() + ((this.permissionsSection.hashCode() + ((this.institutionSection.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public b(String id10, String title, String str, e institutionSection, f permissionsSection, String expiration) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(institutionSection, "institutionSection");
        Intrinsics.checkNotNullParameter(permissionsSection, "permissionsSection");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        this.id = id10;
        this.title = title;
        this.subtitle = str;
        this.institutionSection = institutionSection;
        this.permissionsSection = permissionsSection;
        this.expiration = expiration;
    }
}

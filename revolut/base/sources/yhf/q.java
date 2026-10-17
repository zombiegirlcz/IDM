package yhf;

import java.util.Map;
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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006\u001e"}, d2 = {"Lyhf/q;", "Lxhf/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "rootId", "c", "country", "e", "name", "email", "f", "phone", "h", "type", "i", "firstName", "j", "lastName", "", "Ljava/util/Map;", "()Ljava/util/Map;", "accountFields", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class q extends xhf.f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new yh6.y(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rootBeneficiaryId")
    private final String rootId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("phone")
    private final String phone;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("account")
    private final Map<String, String> accountFields;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314067a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314067a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.TransactionDetailsBeneficiaryDto", aVar, 10);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("rootId", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("email", false);
            pluginGeneratedSerialDescriptor.j("phone", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("firstName", false);
            pluginGeneratedSerialDescriptor.j("lastName", false);
            pluginGeneratedSerialDescriptor.j("accountFields", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = q.k;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[9].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = q.k;
            dVarBeginStructure.getClass();
            String str = null;
            Map map = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        lazyArr = lazyArr2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str2);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str3);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str4);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str5);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str6);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str7);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str8);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str9);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), map);
                        i |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new q(i, str2, str3, str4, str5, str6, str7, str8, str9, str, map);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            q value = (q) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            q.k(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.q$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314067a;
        }
    }

    public q(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        if (511 != (i & 511)) {
            j1.f(a.f314067a.getDescriptor(), i, 511);
            throw null;
        }
        this.id = str;
        this.rootId = str2;
        this.country = str3;
        this.name = str4;
        this.email = str5;
        this.phone = str6;
        this.type = str7;
        this.firstName = str8;
        this.lastName = str9;
        if ((i & 512) == 0) {
            this.accountFields = null;
        } else {
            this.accountFields = map;
        }
    }

    public static final void k(q qVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, qVar.id);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, qVar.rootId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, qVar.country);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, qVar.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, qVar.email);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, qVar.phone);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, qVar.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, qVar.firstName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, qVar.lastName);
        if (!compositeEncoder.d(serialDescriptor) && qVar.accountFields == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) k[9].getValue(), qVar.accountFields);
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getAccountFields() {
        return this.accountFields;
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.id, qVar.id) && Intrinsics.f(this.rootId, qVar.rootId) && Intrinsics.f(this.country, qVar.country) && Intrinsics.f(this.name, qVar.name) && Intrinsics.f(this.email, qVar.email) && Intrinsics.f(this.phone, qVar.phone) && Intrinsics.f(this.type, qVar.type) && Intrinsics.f(this.firstName, qVar.firstName) && Intrinsics.f(this.lastName, qVar.lastName) && Intrinsics.f(this.accountFields, qVar.accountFields);
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRootId() {
        return this.rootId;
    }

    @Override // xhf.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rootId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.type;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, String> map = this.accountFields;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }
}

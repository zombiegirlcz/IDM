package ye6;

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
import uo3.a;
import y7k.h;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0015"}, d2 = {"Lye6/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "institutionId", "d", "name", "Luo3/a;", "c", "Luo3/a;", "()Luo3/a;", "logo", "", "Ljava/util/List;", "()Ljava/util/List;", "accountTypes", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, j.c(k.PUBLICATION, new h(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("institutionId")
    @NotNull
    private final String institutionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    @NotNull
    private final uo3.a logo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accountTypes")
    @NotNull
    private final List<String> accountTypes;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f312791a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f312791a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.account_linking.LinkedAccountConsentInstitutionEntity", aVar, 4);
            pluginGeneratedSerialDescriptor.j("institutionId", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("logo", false);
            pluginGeneratedSerialDescriptor.j("accountTypes", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = d.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, a.C1556a.f281535a, lazyArr[3].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            uo3.a aVar = null;
            List list = null;
            boolean z = true;
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
                } else if (iD == 2) {
                    aVar = (uo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1556a.f281535a, aVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, strDecodeStringElement, strDecodeStringElement2, aVar, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d value = (d) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            d.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ye6.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f312791a;
        }
    }

    public /* synthetic */ d(int i, String str, String str2, uo3.a aVar, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f312791a.getDescriptor(), i, 15);
            throw null;
        }
        this.institutionId = str;
        this.name = str2;
        this.logo = aVar;
        this.accountTypes = list;
    }

    public static final /* synthetic */ void e(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.institutionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dVar.name);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, a.C1556a.f281535a, dVar.logo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, (mlm.h) e[3].getValue(), dVar.accountTypes);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccountTypes() {
        return this.accountTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final uo3.a getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.institutionId, dVar.institutionId) && Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.logo, dVar.logo) && Intrinsics.f(this.accountTypes, dVar.accountTypes);
    }

    public final int hashCode() {
        return this.accountTypes.hashCode() + ((this.logo.hashCode() + p.a.c(this.institutionId.hashCode() * 31, 31, this.name)) * 31);
    }

    public d(String institutionId, String name, uo3.a logo, List accountTypes) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        this.institutionId = institutionId;
        this.name = name;
        this.logo = logo;
        this.accountTypes = accountTypes;
    }
}

package dl5;

import ip0.v7;
import jo3.a;
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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0004R \u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0005\u0010\u0014R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u0012\u0004\b\u0017\u0010\t\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u001a"}, d2 = {"Ldl5/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "getTitle$annotations", "()V", "title", "b", "c", "getDescription$annotations", "description", "d", "getShortDescription$annotations", "shortDescription", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "getAmount$annotations", "amount", "getAmountInBaseCurrency$annotations", "amountInBaseCurrency", "Companion", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("shortDescription")
    @NotNull
    private final String shortDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("amountInBaseCurrency")
    private final jo3.a amountInBaseCurrency;

    /* JADX INFO: renamed from: dl5.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0684a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0684a f115703a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0684a c0684a = new C0684a();
            f115703a = c0684a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.remittance.models.dto.fees.CryptoWithdrawFeesBreakdownDetailDto", c0684a, 5);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("description", false);
            pluginGeneratedSerialDescriptor.j("shortDescription", false);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("amountInBaseCurrency", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0684a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            a.C1001a c1001a = a.C1001a.f176860a;
            KSerializer kSerializerC = nlm.a.c(c1001a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, c1001a, kSerializerC};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            jo3.a aVar = null;
            jo3.a aVar2 = null;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                } else if (iD == 3) {
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar2);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, aVar, aVar2);
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
            a.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: dl5.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0684a.f115703a;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, jo3.a aVar, jo3.a aVar2) {
        if (31 != (i & 31)) {
            j1.f(C0684a.f115703a.getDescriptor(), i, 31);
            throw null;
        }
        this.title = str;
        this.description = str2;
        this.shortDescription = str3;
        this.amount = aVar;
        this.amountInBaseCurrency = aVar2;
    }

    public static final /* synthetic */ void f(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aVar.shortDescription);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, c1001a, aVar.amount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, c1001a, aVar.amountInBaseCurrency);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmountInBaseCurrency() {
        return this.amountInBaseCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
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
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.shortDescription, aVar.shortDescription) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.amountInBaseCurrency, aVar.amountInBaseCurrency);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.shortDescription), 31);
        jo3.a aVar = this.amountInBaseCurrency;
        return iJ + (aVar == null ? 0 : aVar.hashCode());
    }

    public a(String title, String description, String shortDescription, jo3.a amount, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
        this.amount = amount;
        this.amountInBaseCurrency = aVar;
    }
}

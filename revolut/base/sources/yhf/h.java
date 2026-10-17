package yhf;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0006\b\u0012\u0015\u000f\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\rR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0015\u0010\rR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\"\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b\u000f\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001c\u00101\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100R\u001c\u00103\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b2\u00100R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u00066"}, d2 = {"Lyhf/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "accountId", "b", "accountScopedAssetId", "Lyhf/h$b;", "c", "Lyhf/h$b;", "()Lyhf/h$b;", "amount", "d", "i", "fee", "e", "k", "fiatAmount", "f", "j", "feeFiatAmount", "g", "h", "counterpartFiatAmount", "counterpart", "counterpartAccountScopedAssetId", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "m", "()Ljava/math/BigDecimal;", "getRate$annotations", "()V", "rate", "Lyhf/h$e;", "Lyhf/h$e;", "()Lyhf/h$e;", "bundle", "Lyhf/h$f;", "l", "Lyhf/h$f;", "()Lyhf/h$f;", "onChainTx", "Lyhf/h$d;", "Lyhf/h$d;", "n", "()Lyhf/h$d;", "recipient", "o", "sender", "chain", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountId")
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountScopedAssetId")
    @NotNull
    private final String accountScopedAssetId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final b amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    private final b fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fiatAmount")
    private final b fiatAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("feeFiatAmount")
    private final b feeFiatAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterpartFiatAmount")
    private final b counterpartFiatAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterpart")
    private final b counterpart;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("counterpartAccountScopedAssetId")
    private final String counterpartAccountScopedAssetId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final BigDecimal rate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("bundle")
    private final e bundle;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("onChainTx")
    private final f onChainTx;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    private final d recipient;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("sender")
    private final d sender;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("chain")
    private final String chain;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313987a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313987a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.DeFiMetadataDto", aVar, 15);
            pluginGeneratedSerialDescriptor.j("accountId", false);
            pluginGeneratedSerialDescriptor.j("accountScopedAssetId", false);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("fee", false);
            pluginGeneratedSerialDescriptor.j("fiatAmount", false);
            pluginGeneratedSerialDescriptor.j("feeFiatAmount", false);
            pluginGeneratedSerialDescriptor.j("counterpartFiatAmount", false);
            pluginGeneratedSerialDescriptor.j("counterpart", false);
            pluginGeneratedSerialDescriptor.j("counterpartAccountScopedAssetId", false);
            pluginGeneratedSerialDescriptor.j("rate", false);
            pluginGeneratedSerialDescriptor.j("bundle", false);
            pluginGeneratedSerialDescriptor.j("onChainTx", false);
            pluginGeneratedSerialDescriptor.j("recipient", false);
            pluginGeneratedSerialDescriptor.j("sender", false);
            pluginGeneratedSerialDescriptor.j("chain", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            b.a aVar = b.a.f313990a;
            KSerializer kSerializerC = nlm.a.c(aVar);
            KSerializer kSerializerC2 = nlm.a.c(aVar);
            KSerializer kSerializerC3 = nlm.a.c(aVar);
            KSerializer kSerializerC4 = nlm.a.c(aVar);
            KSerializer kSerializerC5 = nlm.a.c(aVar);
            KSerializer kSerializerC6 = nlm.a.c(v1Var);
            KSerializer kSerializerC7 = nlm.a.c(ie0.a.f160587a);
            KSerializer kSerializerC8 = nlm.a.c(e.a.f313996a);
            KSerializer kSerializerC9 = nlm.a.c(f.a.f313999a);
            d.a aVar2 = d.a.f313993a;
            return new KSerializer[]{v1Var, v1Var, aVar, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, nlm.a.c(aVar2), nlm.a.c(aVar2), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            b bVar;
            d dVar;
            b bVar2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            BigDecimal bigDecimal = null;
            d dVar2 = null;
            d dVar3 = null;
            e eVar = null;
            f fVar = null;
            String str = null;
            b bVar3 = null;
            b bVar4 = null;
            b bVar5 = null;
            b bVar6 = null;
            b bVar7 = null;
            b bVar8 = null;
            String str2 = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                b bVar9 = bVar3;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        dVar = dVar2;
                        bVar2 = bVar4;
                        bVar3 = bVar9;
                        z = false;
                        bVar4 = bVar2;
                        dVar2 = dVar;
                        break;
                    case 0:
                        dVar = dVar2;
                        bVar2 = bVar4;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        bVar3 = bVar9;
                        bVar4 = bVar2;
                        dVar2 = dVar;
                        break;
                    case 1:
                        dVar = dVar2;
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        bVar3 = bVar9;
                        dVar2 = dVar;
                        break;
                    case 2:
                        dVar = dVar2;
                        bVar2 = bVar4;
                        bVar3 = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, b.a.f313990a, bVar9);
                        i |= 4;
                        bVar4 = bVar2;
                        dVar2 = dVar;
                        break;
                    case 3:
                        dVar = dVar2;
                        bVar4 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b.a.f313990a, bVar4);
                        i |= 8;
                        bVar3 = bVar9;
                        dVar2 = dVar;
                        break;
                    case 4:
                        bVar = bVar4;
                        bVar5 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, b.a.f313990a, bVar5);
                        i |= 16;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 5:
                        bVar = bVar4;
                        bVar6 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b.a.f313990a, bVar6);
                        i |= 32;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 6:
                        bVar = bVar4;
                        bVar7 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b.a.f313990a, bVar7);
                        i |= 64;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 7:
                        bVar = bVar4;
                        bVar8 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b.a.f313990a, bVar8);
                        i |= 128;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 8:
                        bVar = bVar4;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str2);
                        i |= 256;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 9:
                        bVar = bVar4;
                        bigDecimal = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, ie0.a.f160587a, bigDecimal);
                        i |= 512;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 10:
                        bVar = bVar4;
                        eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, e.a.f313996a, eVar);
                        i |= 1024;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 11:
                        bVar = bVar4;
                        fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, f.a.f313999a, fVar);
                        i |= 2048;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 12:
                        bVar = bVar4;
                        dVar3 = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, d.a.f313993a, dVar3);
                        i |= 4096;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 13:
                        bVar = bVar4;
                        dVar2 = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, d.a.f313993a, dVar2);
                        i |= 8192;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    case 14:
                        bVar = bVar4;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str);
                        i |= 16384;
                        bVar3 = bVar9;
                        bVar4 = bVar;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new h(i, strDecodeStringElement, strDecodeStringElement2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, str2, bigDecimal, eVar, fVar, dVar3, dVar2, str);
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
            h.p(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lyhf/h$b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "getAmount$annotations", "()V", "amount", "b", "Ljava/lang/String;", "currency", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final BigDecimal amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f313990a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f313990a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.DeFiMetadataDto.AmountDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("currency", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{ie0.a.f160587a, v1.f247718a};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, bigDecimal);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, strDecodeStringElement, bigDecimal);
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
                b.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: yhf.h$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f313990a;
            }
        }

        public /* synthetic */ b(int i, String str, BigDecimal bigDecimal) {
            if (3 != (i & 3)) {
                j1.f(a.f313990a.getDescriptor(), i, 3);
                throw null;
            }
            this.amount = bigDecimal;
            this.currency = str;
        }

        public static final /* synthetic */ void c(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, bVar.amount);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.currency);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.currency, bVar.currency);
        }

        public final int hashCode() {
            return this.currency.hashCode() + (this.amount.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: yhf.h$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313987a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lyhf/h$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "walletAddress", "link", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("walletAddress")
        @NotNull
        private final String walletAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("link")
        @NotNull
        private final String link;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f313993a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f313993a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.DeFiMetadataDto.DeFiWalletDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("walletAddress", false);
                pluginGeneratedSerialDescriptor.j("link", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, strDecodeStringElement, strDecodeStringElement2);
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
                d.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: yhf.h$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f313993a;
            }
        }

        public /* synthetic */ d(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f313993a.getDescriptor(), i, 3);
                throw null;
            }
            this.walletAddress = str;
            this.link = str2;
        }

        public static final /* synthetic */ void c(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.walletAddress);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dVar.link);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getWalletAddress() {
            return this.walletAddress;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.walletAddress, dVar.walletAddress) && Intrinsics.f(this.link, dVar.link);
        }

        public final int hashCode() {
            return this.link.hashCode() + (this.walletAddress.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lyhf/h$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "link", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("link")
        @NotNull
        private final String link;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f313996a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f313996a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.DeFiMetadataDto.LinkDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("link", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                e value = (e) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                e.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: yhf.h$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f313996a;
            }
        }

        public /* synthetic */ e(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f313996a.getDescriptor(), i, 3);
                throw null;
            }
            this.id = str;
            this.link = str2;
        }

        public static final /* synthetic */ void c(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, eVar.id);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, eVar.link);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.link, eVar.link);
        }

        public final int hashCode() {
            return this.link.hashCode() + (this.id.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lyhf/h$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "hash", "b", "link", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("hash")
        @NotNull
        private final String hash;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("link")
        @NotNull
        private final String link;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f313999a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f313999a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.DeFiMetadataDto.OnChainTxDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("hash", false);
                pluginGeneratedSerialDescriptor.j("link", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                f value = (f) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                f.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: yhf.h$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f313999a;
            }
        }

        public /* synthetic */ f(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f313999a.getDescriptor(), i, 3);
                throw null;
            }
            this.hash = str;
            this.link = str2;
        }

        public static final /* synthetic */ void c(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fVar.hash);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fVar.link);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHash() {
            return this.hash;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.hash, fVar.hash) && Intrinsics.f(this.link, fVar.link);
        }

        public final int hashCode() {
            return this.link.hashCode() + (this.hash.hashCode() * 31);
        }
    }

    public /* synthetic */ h(int i, String str, String str2, b bVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, String str3, BigDecimal bigDecimal, e eVar, f fVar, d dVar, d dVar2, String str4) {
        if (32767 != (i & 32767)) {
            j1.f(a.f313987a.getDescriptor(), i, 32767);
            throw null;
        }
        this.accountId = str;
        this.accountScopedAssetId = str2;
        this.amount = bVar;
        this.fee = bVar2;
        this.fiatAmount = bVar3;
        this.feeFiatAmount = bVar4;
        this.counterpartFiatAmount = bVar5;
        this.counterpart = bVar6;
        this.counterpartAccountScopedAssetId = str3;
        this.rate = bigDecimal;
        this.bundle = eVar;
        this.onChainTx = fVar;
        this.recipient = dVar;
        this.sender = dVar2;
        this.chain = str4;
    }

    public static final /* synthetic */ void p(h hVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hVar.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, hVar.accountScopedAssetId);
        b.a aVar = b.a.f313990a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, aVar, hVar.amount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, aVar, hVar.fee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, aVar, hVar.fiatAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, aVar, hVar.feeFiatAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, aVar, hVar.counterpartFiatAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, aVar, hVar.counterpart);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, hVar.counterpartAccountScopedAssetId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, ie0.a.f160587a, hVar.rate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, e.a.f313996a, hVar.bundle);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, f.a.f313999a, hVar.onChainTx);
        d.a aVar2 = d.a.f313993a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, aVar2, hVar.recipient);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, aVar2, hVar.sender);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, hVar.chain);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountScopedAssetId() {
        return this.accountScopedAssetId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getBundle() {
        return this.bundle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getChain() {
        return this.chain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.accountId, hVar.accountId) && Intrinsics.f(this.accountScopedAssetId, hVar.accountScopedAssetId) && Intrinsics.f(this.amount, hVar.amount) && Intrinsics.f(this.fee, hVar.fee) && Intrinsics.f(this.fiatAmount, hVar.fiatAmount) && Intrinsics.f(this.feeFiatAmount, hVar.feeFiatAmount) && Intrinsics.f(this.counterpartFiatAmount, hVar.counterpartFiatAmount) && Intrinsics.f(this.counterpart, hVar.counterpart) && Intrinsics.f(this.counterpartAccountScopedAssetId, hVar.counterpartAccountScopedAssetId) && Intrinsics.f(this.rate, hVar.rate) && Intrinsics.f(this.bundle, hVar.bundle) && Intrinsics.f(this.onChainTx, hVar.onChainTx) && Intrinsics.f(this.recipient, hVar.recipient) && Intrinsics.f(this.sender, hVar.sender) && Intrinsics.f(this.chain, hVar.chain);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getCounterpart() {
        return this.counterpart;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCounterpartAccountScopedAssetId() {
        return this.counterpartAccountScopedAssetId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getCounterpartFiatAmount() {
        return this.counterpartFiatAmount;
    }

    public final int hashCode() {
        int iHashCode = (this.amount.hashCode() + p.a.c(this.accountId.hashCode() * 31, 31, this.accountScopedAssetId)) * 31;
        b bVar = this.fee;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.fiatAmount;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.feeFiatAmount;
        int iHashCode4 = (iHashCode3 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        b bVar4 = this.counterpartFiatAmount;
        int iHashCode5 = (iHashCode4 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        b bVar5 = this.counterpart;
        int iHashCode6 = (iHashCode5 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        String str = this.counterpartAccountScopedAssetId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.rate;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        e eVar = this.bundle;
        int iHashCode9 = (iHashCode8 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.onChainTx;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.recipient;
        int iHashCode11 = (iHashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.sender;
        int iHashCode12 = (iHashCode11 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str2 = this.chain;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getFeeFiatAmount() {
        return this.feeFiatAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getFiatAmount() {
        return this.fiatAmount;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final f getOnChainTx() {
        return this.onChainTx;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final d getRecipient() {
        return this.recipient;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final d getSender() {
        return this.sender;
    }
}

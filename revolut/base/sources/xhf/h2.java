package xhf;

import java.math.BigDecimal;
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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0005\f\u0007\u000f\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006#"}, d2 = {"Lxhf/h2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "expectedArrival", "e", "navPrice", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "earnedInterest", "", "Lxhf/h2$c;", "Ljava/util/List;", "()Ljava/util/List;", "deducted", "Lxhf/h2$d;", "f", "taxes", "Lxhf/h2$e;", "g", "Lxhf/h2$e;", "()Lxhf/h2$e;", "withdrawal", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f306010h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expectedArrival")
    private final Long expectedArrival;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("navPrice")
    private final Long navPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("earnedInterest")
    private final Boolean earnedInterest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("deducted")
    private final List<c> deducted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tax")
    private final List<d> taxes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawal")
    private final e withdrawal;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306015a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306015a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionVaultDto", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("expectedArrival", false);
            pluginGeneratedSerialDescriptor.j("navPrice", false);
            pluginGeneratedSerialDescriptor.j("earnedInterest", false);
            pluginGeneratedSerialDescriptor.j("deducted", false);
            pluginGeneratedSerialDescriptor.j("taxes", false);
            pluginGeneratedSerialDescriptor.j("withdrawal", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = h2.f306010h;
            KSerializer kSerializerC = nlm.a.c(qlm.v1.f247718a);
            qlm.t0 t0Var = qlm.t0.f247706a;
            return new KSerializer[]{kSerializerC, nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(qlm.h.f247648a), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c(e.a.f306023a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = h2.f306010h;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            Long l2 = null;
            Long l3 = null;
            Boolean bool = null;
            List list = null;
            List list2 = null;
            e eVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, l2);
                        i |= 2;
                        break;
                    case 2:
                        l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l3);
                        i |= 4;
                        break;
                    case 3:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.h.f247648a, bool);
                        i |= 8;
                        break;
                    case 4:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                        i |= 16;
                        break;
                    case 5:
                        list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                        i |= 32;
                        break;
                    case 6:
                        eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, e.a.f306023a, eVar);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new h2(i, str, l2, l3, bool, list, list2, eVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            h2 value = (h2) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            h2.h(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.h2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306015a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lxhf/h2$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        @NotNull
        private final String code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final BigDecimal amount;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f306018a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f306018a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionVaultDto.DeductionDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("code", false);
                pluginGeneratedSerialDescriptor.j("amount", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a, ie0.a.f160587a};
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
                BigDecimal bigDecimal = null;
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
                        bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.a.f160587a, bigDecimal);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, strDecodeStringElement, bigDecimal);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                c value = (c) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: xhf.h2$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f306018a;
            }
        }

        public /* synthetic */ c(int i, String str, BigDecimal bigDecimal) {
            if (3 != (i & 3)) {
                qlm.j1.f(a.f306018a.getDescriptor(), i, 3);
                throw null;
            }
            this.code = str;
            this.amount = bigDecimal;
        }

        public static final /* synthetic */ void c(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.code);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, ie0.a.f160587a, cVar.amount);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.code, cVar.code) && Intrinsics.f(this.amount, cVar.amount);
        }

        public final int hashCode() {
            return this.amount.hashCode() + (this.code.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lxhf/h2$d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "Companion", "b", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f306020a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f306020a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionVaultDto.TaxEntryDto", aVar, 1);
                pluginGeneratedSerialDescriptor.j("amount", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.t0.f247706a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                long jDecodeLongElement = 0;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, jDecodeLongElement);
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
                d.b(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: xhf.h2$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f306020a;
            }
        }

        public /* synthetic */ d(int i, long j2) {
            if (1 == (i & 1)) {
                this.amount = j2;
            } else {
                qlm.j1.f(a.f306020a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static final /* synthetic */ void b(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, dVar.amount);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && this.amount == ((d) obj2).amount;
        }

        public final int hashCode() {
            return Long.hashCode(this.amount);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lxhf/h2$e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "principal", "interest", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("principal")
        private final Double principal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("interest")
        private final Double interest;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f306023a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f306023a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionVaultDto.WithdrawalDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("principal", false);
                pluginGeneratedSerialDescriptor.j("interest", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                qlm.x xVar = qlm.x.f247723a;
                return new KSerializer[]{nlm.a.c(xVar), nlm.a.c(xVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Double d = null;
                boolean z = true;
                int i = 0;
                Double d5 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.x.f247723a, d);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.x.f247723a, d5);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, d, d5);
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

        /* JADX INFO: renamed from: xhf.h2$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f306023a;
            }
        }

        public /* synthetic */ e(int i, Double d, Double d5) {
            if (3 != (i & 3)) {
                qlm.j1.f(a.f306023a.getDescriptor(), i, 3);
                throw null;
            }
            this.principal = d;
            this.interest = d5;
        }

        public static final /* synthetic */ void c(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            qlm.x xVar = qlm.x.f247723a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, xVar, eVar.principal);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, xVar, eVar.interest);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getInterest() {
            return this.interest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getPrincipal() {
            return this.principal;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.principal, eVar.principal) && Intrinsics.f(this.interest, eVar.interest);
        }

        public final int hashCode() {
            Double d = this.principal;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.interest;
            return iHashCode + (d5 != null ? d5.hashCode() : 0);
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f306010h = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new xda.z(24)), yhm.j.c(kVar, new xda.z(25)), null};
    }

    public /* synthetic */ h2(int i, String str, Long l2, Long l3, Boolean bool, List list, List list2, e eVar) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(a.f306015a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.id = str;
        this.expectedArrival = l2;
        this.navPrice = l3;
        this.earnedInterest = bool;
        this.deducted = list;
        this.taxes = list2;
        this.withdrawal = eVar;
    }

    public static final /* synthetic */ void h(h2 h2Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, h2Var.id);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, h2Var.expectedArrival);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, h2Var.navPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, qlm.h.f247648a, h2Var.earnedInterest);
        Lazy[] lazyArr = f306010h;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), h2Var.deducted);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), h2Var.taxes);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, e.a.f306023a, h2Var.withdrawal);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDeducted() {
        return this.deducted;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getEarnedInterest() {
        return this.earnedInterest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getExpectedArrival() {
        return this.expectedArrival;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getNavPrice() {
        return this.navPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.id, h2Var.id) && Intrinsics.f(this.expectedArrival, h2Var.expectedArrival) && Intrinsics.f(this.navPrice, h2Var.navPrice) && Intrinsics.f(this.earnedInterest, h2Var.earnedInterest) && Intrinsics.f(this.deducted, h2Var.deducted) && Intrinsics.f(this.taxes, h2Var.taxes) && Intrinsics.f(this.withdrawal, h2Var.withdrawal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getWithdrawal() {
        return this.withdrawal;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.expectedArrival;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.navPrice;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.earnedInterest;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<c> list = this.deducted;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<d> list2 = this.taxes;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        e eVar = this.withdrawal;
        return iHashCode6 + (eVar != null ? eVar.hashCode() : 0);
    }
}

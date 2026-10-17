package nf6;

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
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import ro6.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0006\u001a\u0010\u0015\b\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001f"}, d2 = {"Lnf6/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "consentId", "b", "fromPocketId", "Lnf6/e$b;", "c", "Lnf6/e$b;", "()Lnf6/e$b;", "paymentAmount", "Lnf6/e$f;", "d", "Lnf6/e$f;", "()Lnf6/e$f;", "paymentInformation", "", "e", "Z", "()Z", "paymentNotificationsEnabled", "Lro6/g;", "f", "Lro6/g;", "()Lro6/g;", "thirdParty", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("consentId")
    @NotNull
    private final String consentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromPocketId")
    private final String fromPocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAmount")
    private final b paymentAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentInformation")
    @NotNull
    private final f paymentInformation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentNotificationsEnabled")
    private final boolean paymentNotificationsEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("thirdParty")
    @NotNull
    private final ro6.g thirdParty;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f214859a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f214859a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.open_banking_brazil.entity.OpenBankingBrazilPaymentDetailsEntity", aVar, 6);
            pluginGeneratedSerialDescriptor.j("consentId", false);
            pluginGeneratedSerialDescriptor.j("fromPocketId", false);
            pluginGeneratedSerialDescriptor.j("paymentAmount", false);
            pluginGeneratedSerialDescriptor.j("paymentInformation", false);
            pluginGeneratedSerialDescriptor.j("paymentNotificationsEnabled", false);
            pluginGeneratedSerialDescriptor.j("thirdParty", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(b.a.f214862a), f.a.f214871a, h.f247648a, g.a.f255910a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            String str = null;
            b bVar = null;
            f fVar = null;
            ro6.g gVar = null;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                        break;
                    case 2:
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.a.f214862a, bVar);
                        i |= 4;
                        break;
                    case 3:
                        fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, f.a.f214871a, fVar);
                        i |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        gVar = (ro6.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, g.a.f255910a, gVar);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, strDecodeStringElement, str, bVar, fVar, zDecodeBooleanElement, gVar);
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
            e.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lnf6/e$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "b", "Ljava/lang/String;", "currency", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f214862a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f214862a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.open_banking_brazil.entity.OpenBankingBrazilPaymentDetailsEntity.AmountEntity", aVar, 2);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("currency", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{t0.f247706a, v1.f247718a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                long jDecodeLongElement = 0;
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
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
                return new b(i, jDecodeLongElement, strDecodeStringElement);
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

        /* JADX INFO: renamed from: nf6.e$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f214862a;
            }
        }

        public /* synthetic */ b(int i, long j2, String str) {
            if (3 != (i & 3)) {
                j1.f(a.f214862a.getDescriptor(), i, 3);
                throw null;
            }
            this.amount = j2;
            this.currency = str;
        }

        public static final /* synthetic */ void c(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, bVar.amount);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.currency);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
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
            return this.amount == bVar.amount && Intrinsics.f(this.currency, bVar.currency);
        }

        public final int hashCode() {
            return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
        }

        public b(long j2, String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.amount = j2;
            this.currency = currency;
        }
    }

    /* JADX INFO: renamed from: nf6.e$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f214859a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0007\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lnf6/e$d;", "", "", "toString", "()Ljava/lang/String;", "", "Lnf6/e$e;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "Companion", "b", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy[] f214863b = {j.c(k.PUBLICATION, new n85.b(15))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<C1204e> items;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f214865a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f214865a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.open_banking_brazil.entity.OpenBankingBrazilPaymentDetailsEntity.InfoGroupEntity", aVar, 1);
                pluginGeneratedSerialDescriptor.j("items", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{d.f214863b[0].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = d.f214863b;
                dVarBeginStructure.getClass();
                List list = null;
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
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, list);
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

        /* JADX INFO: renamed from: nf6.e$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f214865a;
            }
        }

        public /* synthetic */ d(int i, List list) {
            if (1 == (i & 1)) {
                this.items = list;
            } else {
                j1.f(a.f214865a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static final /* synthetic */ void b(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (mlm.h) f214863b[0].getValue(), dVar.items);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.items, ((d) obj2).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public d(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }
    }

    /* JADX INFO: renamed from: nf6.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lnf6/e$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "title", "b", "value", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C1204e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: nf6.e$e$a */
        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f214868a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f214868a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.open_banking_brazil.entity.OpenBankingBrazilPaymentDetailsEntity.ItemEntity", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("value", false);
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
                return new C1204e(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C1204e value = (C1204e) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                C1204e.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: nf6.e$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f214868a;
            }
        }

        public /* synthetic */ C1204e(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f214868a.getDescriptor(), i, 3);
                throw null;
            }
            this.title = str;
            this.value = str2;
        }

        public static final /* synthetic */ void c(C1204e c1204e, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, c1204e.title);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, c1204e.value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1204e)) {
                return false;
            }
            C1204e c1204e = (C1204e) obj2;
            return Intrinsics.f(this.title, c1204e.title) && Intrinsics.f(this.value, c1204e.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.title.hashCode() * 31);
        }

        public C1204e(String title, String value) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.title = title;
            this.value = value;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0007\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lnf6/e$f;", "", "", "toString", "()Ljava/lang/String;", "", "Lnf6/e$d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "groups", "Companion", "b", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy[] f214869b = {j.c(k.PUBLICATION, new n85.b(16))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("groups")
        @NotNull
        private final List<d> groups;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f214871a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f214871a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.open_banking_brazil.entity.OpenBankingBrazilPaymentDetailsEntity.PaymentInformationEntity", aVar, 1);
                pluginGeneratedSerialDescriptor.j("groups", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{f.f214869b[0].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = f.f214869b;
                dVarBeginStructure.getClass();
                List list = null;
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
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, list);
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
                f.b(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: nf6.e$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f214871a;
            }
        }

        public /* synthetic */ f(int i, List list) {
            if (1 == (i & 1)) {
                this.groups = list;
            } else {
                j1.f(a.f214871a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static final /* synthetic */ void b(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (mlm.h) f214869b[0].getValue(), fVar.groups);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getGroups() {
            return this.groups;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.groups, ((f) obj2).groups);
        }

        public final int hashCode() {
            return this.groups.hashCode();
        }

        public f(ArrayList groups) {
            Intrinsics.checkNotNullParameter(groups, "groups");
            this.groups = groups;
        }
    }

    public /* synthetic */ e(int i, String str, String str2, b bVar, f fVar, boolean z, ro6.g gVar) {
        if (63 != (i & 63)) {
            j1.f(a.f214859a.getDescriptor(), i, 63);
            throw null;
        }
        this.consentId = str;
        this.fromPocketId = str2;
        this.paymentAmount = bVar;
        this.paymentInformation = fVar;
        this.paymentNotificationsEnabled = z;
        this.thirdParty = gVar;
    }

    public static final /* synthetic */ void g(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eVar.consentId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, eVar.fromPocketId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, b.a.f214862a, eVar.paymentAmount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, f.a.f214871a, eVar.paymentInformation);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, eVar.paymentNotificationsEnabled);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, g.a.f255910a, eVar.thirdParty);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConsentId() {
        return this.consentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFromPocketId() {
        return this.fromPocketId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getPaymentAmount() {
        return this.paymentAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getPaymentInformation() {
        return this.paymentInformation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPaymentNotificationsEnabled() {
        return this.paymentNotificationsEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.consentId, eVar.consentId) && Intrinsics.f(this.fromPocketId, eVar.fromPocketId) && Intrinsics.f(this.paymentAmount, eVar.paymentAmount) && Intrinsics.f(this.paymentInformation, eVar.paymentInformation) && this.paymentNotificationsEnabled == eVar.paymentNotificationsEnabled && Intrinsics.f(this.thirdParty, eVar.thirdParty);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ro6.g getThirdParty() {
        return this.thirdParty;
    }

    public final int hashCode() {
        int iHashCode = this.consentId.hashCode() * 31;
        String str = this.fromPocketId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.paymentAmount;
        return this.thirdParty.hashCode() + j6.a.c((this.paymentInformation.hashCode() + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31, 31, this.paymentNotificationsEnabled);
    }

    public e(String consentId, String str, b bVar, f paymentInformation, boolean z, ro6.g thirdParty) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(paymentInformation, "paymentInformation");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        this.consentId = consentId;
        this.fromPocketId = str;
        this.paymentAmount = bVar;
        this.paymentInformation = paymentInformation;
        this.paymentNotificationsEnabled = z;
        this.thirdParty = thirdParty;
    }
}

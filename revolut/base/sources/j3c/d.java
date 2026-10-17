package j3c;

import j1f.q0;
import j3c.b;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0003\u0011\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lj3c/d;", "", "Lj3c/d$c;", "a", "Lj3c/d$c;", "getPaymentMethod", "()Lj3c/d$c;", "paymentMethod", "Lj3c/b;", "b", "Lj3c/b;", "getDeliveryAddress", "()Lj3c/b;", "getDeliveryAddress$annotations", "()V", "deliveryAddress", "", "c", "Ljava/lang/String;", "getCustomerId", "()Ljava/lang/String;", "getCustomerId$annotations", "customerId", "Companion", "d", "Lj3c/d$a;", "Lj3c/d$d;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Object d = yhm.j.c(yhm.k.PUBLICATION, new q0(12));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final c paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryAddress")
    private final b deliveryAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("customerId")
    private final String customerId;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lj3c/d$a;", "Lj3c/d;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String e;
        public final transient b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient String f171039g;

        /* JADX INFO: renamed from: j3c.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0970a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0970a f171040a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0970a c0970a = new C0970a();
                f171040a = c0970a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.CheckoutRequestDto.Card", c0970a, 4);
                pluginGeneratedSerialDescriptor.j("paymentMethod", false);
                pluginGeneratedSerialDescriptor.j("paymentMethodId", false);
                pluginGeneratedSerialDescriptor.j("deliveryAddress", false);
                pluginGeneratedSerialDescriptor.j("customerId", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0970a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{c.a.f171044a, v1Var, nlm.a.c(b.a.f171025a), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                c cVar = null;
                String strDecodeStringElement = null;
                b bVar = null;
                String str = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c.a.f171044a, cVar);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.a.f171025a, bVar);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new a(i, cVar, strDecodeStringElement, bVar, str);
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
                Companion companion = a.INSTANCE;
                d.a(value, compositeEncoderBeginStructure, serialDescriptor);
                String str = value.e;
                String str2 = value.f171039g;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, b.a.f171025a, value.f);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: j3c.d$a$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0970a.f171040a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i, c cVar, String str, b bVar, String str2) {
            super(cVar);
            if (7 != (i & 7)) {
                j1.f(C0970a.f171040a.getDescriptor(), i, 7);
                throw null;
            }
            this.e = str;
            this.f = bVar;
            if ((i & 8) == 0) {
                this.f171039g = null;
            } else {
                this.f171039g = str2;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f171039g, aVar.f171039g);
        }

        public final int hashCode() {
            int iHashCode = this.e.hashCode() * 31;
            b bVar = this.f;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f171039g;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: j3c.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) d.d.getValue();
        }
    }

    public /* synthetic */ d(c cVar) {
        this.paymentMethod = cVar;
        this.deliveryAddress = null;
        this.customerId = null;
    }

    public static final void a(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, c.a.f171044a, dVar.paymentMethod);
    }

    public d(c cVar, b bVar) {
        this.paymentMethod = cVar;
        this.deliveryAddress = bVar;
        this.customerId = null;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lj3c/d$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "type", "b", "getPaymentMethodId", "getPaymentMethodId$annotations", "paymentMethodId", "c", "getPocketId", "getPocketId$annotations", "pocketId", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("paymentMethodId")
        private final String paymentMethodId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("pocketId")
        private final String pocketId;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f171044a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f171044a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.CheckoutRequestDto.PaymentMethodDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("type", false);
                pluginGeneratedSerialDescriptor.j("paymentMethodId", true);
                pluginGeneratedSerialDescriptor.j("pocketId", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
                String str = null;
                String str2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, strDecodeStringElement, str, str2);
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
                c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: j3c.d$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f171044a;
            }
        }

        public c(String str) {
            Intrinsics.checkNotNullParameter("REVOLUT_PAY", "type");
            this.type = "REVOLUT_PAY";
            this.paymentMethodId = null;
            this.pocketId = str;
        }

        public static final /* synthetic */ void a(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.type);
            if (compositeEncoder.d(serialDescriptor) || cVar.paymentMethodId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, cVar.paymentMethodId);
            }
            if (!compositeEncoder.d(serialDescriptor) && cVar.pocketId == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, cVar.pocketId);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.paymentMethodId, cVar.paymentMethodId) && Intrinsics.f(this.pocketId, cVar.pocketId);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.paymentMethodId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.pocketId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public /* synthetic */ c(int i, String str, String str2, String str3) {
            if (1 != (i & 1)) {
                j1.f(a.f171044a.getDescriptor(), i, 1);
                throw null;
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.paymentMethodId = null;
            } else {
                this.paymentMethodId = str2;
            }
            if ((i & 4) == 0) {
                this.pocketId = null;
            } else {
                this.pocketId = str3;
            }
        }
    }

    /* JADX INFO: renamed from: j3c.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lj3c/d$d;", "Lj3c/d;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C0971d extends d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String e;
        public final transient b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient String f171045g;

        /* JADX INFO: renamed from: j3c.d$d$a */
        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f171046a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f171046a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.CheckoutRequestDto.RevolutPay", aVar, 4);
                pluginGeneratedSerialDescriptor.j("paymentMethod", false);
                pluginGeneratedSerialDescriptor.j("accountId", false);
                pluginGeneratedSerialDescriptor.j("deliveryAddress", false);
                pluginGeneratedSerialDescriptor.j("customerId", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{c.a.f171044a, v1Var, nlm.a.c(b.a.f171025a), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                c cVar = null;
                String strDecodeStringElement = null;
                b bVar = null;
                String str = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c.a.f171044a, cVar);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.a.f171025a, bVar);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C0971d(i, cVar, strDecodeStringElement, bVar, str);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C0971d value = (C0971d) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = C0971d.INSTANCE;
                d.a(value, compositeEncoderBeginStructure, serialDescriptor);
                String str = value.e;
                String str2 = value.f171045g;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, b.a.f171025a, value.f);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: j3c.d$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f171046a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0971d(String accountId, b bVar) {
            super(new c(accountId), bVar);
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.e = accountId;
            this.f = bVar;
            this.f171045g = null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0971d)) {
                return false;
            }
            C0971d c0971d = (C0971d) obj2;
            return Intrinsics.f(this.e, c0971d.e) && Intrinsics.f(this.f, c0971d.f) && Intrinsics.f(this.f171045g, c0971d.f171045g);
        }

        public final int hashCode() {
            int iHashCode = this.e.hashCode() * 31;
            b bVar = this.f;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f171045g;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0971d(int i, c cVar, String str, b bVar, String str2) {
            super(cVar);
            if (7 != (i & 7)) {
                j1.f(a.f171046a.getDescriptor(), i, 7);
                throw null;
            }
            this.e = str;
            this.f = bVar;
            if ((i & 8) == 0) {
                this.f171045g = null;
            } else {
                this.f171045g = str2;
            }
        }
    }
}

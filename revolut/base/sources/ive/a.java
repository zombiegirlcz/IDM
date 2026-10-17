package ive;

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
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0004\u000e\t\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0005\u0010\u001d¨\u0006 "}, d2 = {"Live/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "state", "h", "type", "d", "g", "title", "e", "failureReason", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lastUsedAt", "Live/a$d;", "Live/a$d;", "()Live/a$d;", "logo", "Live/a$b;", "Live/a$b;", "()Live/a$b;", "details", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lastUsedAt")
    private final Long lastUsedAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    private final d logo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final b details;

    /* JADX INFO: renamed from: ive.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0952a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0952a f168833a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0952a c0952a = new C0952a();
            f168833a = c0952a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.storage.india.stored_method.IndiaStoredMethodDetailEntity", c0952a, 8);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("failureReason", false);
            pluginGeneratedSerialDescriptor.j("lastUsedAt", false);
            pluginGeneratedSerialDescriptor.j("logo", false);
            pluginGeneratedSerialDescriptor.j("details", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0952a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(t0.f247706a), nlm.a.c(d.C0955a.f168839a), nlm.a.c(b.C0953a.f168836a)};
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
            String strDecodeStringElement3 = null;
            String str = null;
            String str2 = null;
            Long l2 = null;
            d dVar = null;
            b bVar = null;
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
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                        i |= 16;
                        break;
                    case 5:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
                        i |= 32;
                        break;
                    case 6:
                        dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, d.C0955a.f168839a, dVar);
                        i |= 64;
                        break;
                    case 7:
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b.C0953a.f168836a, bVar);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, str2, l2, dVar, bVar);
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
            a.i(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Live/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "accountNumber", "accountHolder", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("accountNumber")
        @NotNull
        private final String accountNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("accountHolder")
        @NotNull
        private final String accountHolder;

        /* JADX INFO: renamed from: ive.a$b$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0953a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0953a f168836a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0953a c0953a = new C0953a();
                f168836a = c0953a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.storage.india.stored_method.IndiaStoredMethodDetailEntity.AccountDetailsEntity", c0953a, 2);
                pluginGeneratedSerialDescriptor.j("accountNumber", false);
                pluginGeneratedSerialDescriptor.j("accountHolder", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0953a() {
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
                return new b(i, strDecodeStringElement, strDecodeStringElement2);
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

        /* JADX INFO: renamed from: ive.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0953a.f168836a;
            }
        }

        public /* synthetic */ b(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(C0953a.f168836a.getDescriptor(), i, 3);
                throw null;
            }
            this.accountNumber = str;
            this.accountHolder = str2;
        }

        public static final /* synthetic */ void c(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bVar.accountNumber);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.accountHolder);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountHolder() {
            return this.accountHolder;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.accountNumber, bVar.accountNumber) && Intrinsics.f(this.accountHolder, bVar.accountHolder);
        }

        public final int hashCode() {
            return this.accountHolder.hashCode() + (this.accountNumber.hashCode() * 31);
        }

        public b(String accountNumber, String accountHolder) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountHolder, "accountHolder");
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
        }
    }

    /* JADX INFO: renamed from: ive.a$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0952a.f168833a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Live/a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "value", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: ive.a$d$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0955a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0955a f168839a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0955a c0955a = new C0955a();
                f168839a = c0955a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.storage.india.stored_method.IndiaStoredMethodDetailEntity.LogoEntity", c0955a, 2);
                pluginGeneratedSerialDescriptor.j("type", false);
                pluginGeneratedSerialDescriptor.j("value", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0955a() {
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

        /* JADX INFO: renamed from: ive.a$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0955a.f168839a;
            }
        }

        public /* synthetic */ d(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(C0955a.f168839a.getDescriptor(), i, 3);
                throw null;
            }
            this.type = str;
            this.value = str2;
        }

        public static final /* synthetic */ void c(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.type);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dVar.value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.type, dVar.type) && Intrinsics.f(this.value, dVar.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        public d(String type, String value) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.type = type;
            this.value = value;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, String str4, String str5, Long l2, d dVar, b bVar) {
        if (255 != (i & 255)) {
            j1.f(C0952a.f168833a.getDescriptor(), i, 255);
            throw null;
        }
        this.id = str;
        this.state = str2;
        this.type = str3;
        this.title = str4;
        this.failureReason = str5;
        this.lastUsedAt = l2;
        this.logo = dVar;
        this.details = bVar;
    }

    public static final /* synthetic */ void i(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.state);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aVar.type);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, aVar.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, aVar.failureReason);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, aVar.lastUsedAt);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, d.C0955a.f168839a, aVar.logo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, b.C0953a.f168836a, aVar.details);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getLastUsedAt() {
        return this.lastUsedAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getLogo() {
        return this.logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.failureReason, aVar.failureReason) && Intrinsics.f(this.lastUsedAt, aVar.lastUsedAt) && Intrinsics.f(this.logo, aVar.logo) && Intrinsics.f(this.details, aVar.details);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.type);
        String str = this.title;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failureReason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.lastUsedAt;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        d dVar = this.logo;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.details;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public a(String id10, String state, String type, String str, String str2, Long l2, d dVar, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.state = state;
        this.type = type;
        this.title = str;
        this.failureReason = str2;
        this.lastUsedAt = l2;
        this.logo = dVar;
        this.details = bVar;
    }
}

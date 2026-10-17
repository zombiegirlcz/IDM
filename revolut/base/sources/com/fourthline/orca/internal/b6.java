package com.fourthline.orca.internal;

import com.fourthline.orca.internal.f5;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/internal/b6;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b6;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "d", "c", "Lcom/fourthline/orca/internal/b6$b;", "Lcom/fourthline/orca/internal/b6$c;", "Lcom/fourthline/orca/internal/b6$d;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class b6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f26990a = yhm.j.c(yhm.k.PUBLICATION, new vk1(15));

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b6$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) b6.f26990a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002\u0015 BK\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0018¨\u0006."}, d2 = {"Lcom/fourthline/orca/internal/b6$b;", "Lcom/fourthline/orca/internal/b6;", "", "seen0", "", "amount", "", "recipientName", "recipientIban", "reference", "bic", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b6$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getAmount", "()D", "c", "Ljava/lang/String;", "getRecipientName", "d", "getRecipientIban", "e", "getReference", "f", "getBic", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends b6 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final double amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String recipientName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String recipientIban;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String reference;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String bic;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f26994b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f26993a = aVar;
                f26994b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.bav.internal.model.BavProviderConfig.Manual", aVar, 5);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("recipientName", false);
                pluginGeneratedSerialDescriptor.j("recipientIban", false);
                pluginGeneratedSerialDescriptor.j("reference", false);
                pluginGeneratedSerialDescriptor.j("bic", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                double dDecodeDoubleElement = 0.0d;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String strDecodeStringElement3 = null;
                String strDecodeStringElement4 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    } else if (iD == 3) {
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, dDecodeDoubleElement, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                qlm.v1 v1Var = qlm.v1.f247718a;
                return new KSerializer[]{qlm.x.f247723a, v1Var, v1Var, v1Var, v1Var};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, b value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                b.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b6$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f26993a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i, double d, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (31 != (i & 31)) {
                qlm.j1.f(a.f26993a.getDescriptor(), i, 31);
                throw null;
            }
            this.amount = d;
            this.recipientName = str;
            this.recipientIban = str2;
            this.reference = str3;
            this.bic = str4;
        }

        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            b6.a(self, output, serialDesc);
            output.encodeDoubleElement(serialDesc, 0, self.amount);
            output.encodeStringElement(serialDesc, 1, self.recipientName);
            output.encodeStringElement(serialDesc, 2, self.recipientIban);
            output.encodeStringElement(serialDesc, 3, self.reference);
            output.encodeStringElement(serialDesc, 4, self.bic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Double.compare(this.amount, bVar.amount) == 0 && Intrinsics.f(this.recipientName, bVar.recipientName) && Intrinsics.f(this.recipientIban, bVar.recipientIban) && Intrinsics.f(this.reference, bVar.reference) && Intrinsics.f(this.bic, bVar.bic);
        }

        public int hashCode() {
            return (((((((Double.hashCode(this.amount) * 31) + this.recipientName.hashCode()) * 31) + this.recipientIban.hashCode()) * 31) + this.reference.hashCode()) * 31) + this.bic.hashCode();
        }

        public String toString() {
            return "Manual(amount=" + this.amount + ", recipientName=" + this.recipientName + ", recipientIban=" + this.recipientIban + ", reference=" + this.reference + ", bic=" + this.bic + ")";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/b6$d;", "Lcom/fourthline/orca/internal/b6;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b6$d;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends b6 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String redirectUrl;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27001a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27002b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f27001a = aVar;
                f27002b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.bav.internal.model.BavProviderConfig.Tink", aVar, 1);
                pluginGeneratedSerialDescriptor.j("redirectUrl", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                SerializationConstructorMarker serializationConstructorMarker = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, strDecodeStringElement, serializationConstructorMarker);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, d value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                d.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b6$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f27001a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                qlm.j1.f(a.f27001a.getDescriptor(), i, 1);
                throw null;
            }
            this.redirectUrl = str;
        }

        public static final /* synthetic */ void a(d self, CompositeEncoder output, SerialDescriptor serialDesc) {
            b6.a(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.redirectUrl);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.f(this.redirectUrl, ((d) other).redirectUrl);
        }

        public int hashCode() {
            return this.redirectUrl.hashCode();
        }

        public String toString() {
            return "Tink(redirectUrl=" + this.redirectUrl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String redirectUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            this.redirectUrl = redirectUrl;
        }
    }

    public /* synthetic */ b6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void a(b6 self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }

    private b6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer a() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.fourthline.orca.bav.internal.model.BavProviderConfig", p0Var.b(b6.class), new KClass[]{p0Var.b(b.class), p0Var.b(c.class), p0Var.b(d.class)}, new KSerializer[]{b.a.f26993a, c.a.f26998a, d.a.f27001a}, new Annotation[0]);
    }

    public /* synthetic */ b6(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0017\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-¨\u0006/"}, d2 = {"Lcom/fourthline/orca/internal/b6$c;", "Lcom/fourthline/orca/internal/b6;", "", "amount", "", "preferredMarket", "iban", "", "Lcom/fourthline/orca/internal/f5;", "ibanConfiguration", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b6$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getAmount", "()D", "c", "Ljava/lang/String;", "f", "d", "getIban", "e", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c extends b6 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Lazy[] f26995g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new vk1(16))};

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final double amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String preferredMarket;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String iban;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List ibanConfiguration;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26998a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f26999b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f26998a = aVar;
                f26999b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.bav.internal.model.BavProviderConfig.Sepa", aVar, 4);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("preferredMarket", false);
                pluginGeneratedSerialDescriptor.j("iban", true);
                pluginGeneratedSerialDescriptor.j("ibanConfiguration", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = c.f26995g;
                dVarBeginStructure.getClass();
                int i = 0;
                double dDecodeDoubleElement = 0.0d;
                String strDecodeStringElement = null;
                String str = null;
                List list = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
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
                return new c(i, dDecodeDoubleElement, strDecodeStringElement, str, list, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = c.f26995g;
                qlm.v1 v1Var = qlm.v1.f247718a;
                return new KSerializer[]{qlm.x.f247723a, v1Var, nlm.a.c(v1Var), lazyArr[3].getValue()};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, c value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b6$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f26998a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d, String preferredMarket, String str, List ibanConfiguration) {
            super(null);
            Intrinsics.checkNotNullParameter(preferredMarket, "preferredMarket");
            Intrinsics.checkNotNullParameter(ibanConfiguration, "ibanConfiguration");
            this.amount = d;
            this.preferredMarket = preferredMarket;
            this.iban = str;
            this.ibanConfiguration = ibanConfiguration;
        }

        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            b6.a(self, output, serialDesc);
            Lazy[] lazyArr = f26995g;
            output.encodeDoubleElement(serialDesc, 0, self.amount);
            output.encodeStringElement(serialDesc, 1, self.preferredMarket);
            if (output.d(serialDesc) || self.iban != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, qlm.v1.f247718a, self.iban);
            }
            output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.ibanConfiguration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer c() {
            return new qlm.e(f5.a.f28337a);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final List getIbanConfiguration() {
            return this.ibanConfiguration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Double.compare(this.amount, cVar.amount) == 0 && Intrinsics.f(this.preferredMarket, cVar.preferredMarket) && Intrinsics.f(this.iban, cVar.iban) && Intrinsics.f(this.ibanConfiguration, cVar.ibanConfiguration);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPreferredMarket() {
            return this.preferredMarket;
        }

        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.amount) * 31) + this.preferredMarket.hashCode()) * 31;
            String str = this.iban;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ibanConfiguration.hashCode();
        }

        public String toString() {
            return "Sepa(amount=" + this.amount + ", preferredMarket=" + this.preferredMarket + ", iban=" + this.iban + ", ibanConfiguration=" + this.ibanConfiguration + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i, double d, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (11 != (i & 11)) {
                qlm.j1.f(a.f26998a.getDescriptor(), i, 11);
                throw null;
            }
            this.amount = d;
            this.preferredMarket = str;
            if ((i & 4) == 0) {
                this.iban = null;
            } else {
                this.iban = str2;
            }
            this.ibanConfiguration = list;
        }
    }
}

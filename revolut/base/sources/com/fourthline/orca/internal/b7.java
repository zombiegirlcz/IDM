package com.fourthline.orca.internal;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public interface b7 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/internal/b7$a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "e", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Lazy f27009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f27010b = new a("NoMatch", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f27011c = new a("InvalidFormat", 1);
        public static final a d = new a("UnsupportedCountry", 2);
        public static final a e = new a("UnsupportedSepa", 3);
        private static final /* synthetic */ a[] f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f27012g;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b7$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer a() {
                return (KSerializer) a.f27009a.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return a();
            }

            private Companion() {
            }
        }

        static {
            a[] aVarArrA = a();
            f = aVarArrA;
            f27012g = vc.s.n(aVarArrA);
            INSTANCE = new Companion(null);
            f27009a = yhm.j.c(yhm.k.PUBLICATION, new vk1(17));
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27010b, f27011c, d, e};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return qlm.j1.a("com.fourthline.orca.bav.internal.worker.BavValidateIbanWorker.BavValidateIbanError", values(), new String[]{"no-match", "invalid-format", "unsupported-country", "unsupported-sepa"}, new Annotation[][]{null, null, null, null});
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0015!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/b7$b;", "", "", "match", "", "iban", "Lcom/fourthline/orca/internal/b7$a;", "error", "<init>", "(ZLjava/lang/String;Lcom/fourthline/orca/internal/b7$a;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/fourthline/orca/internal/b7$a;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b7$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Ljava/lang/String;", "getIban", "c", "Lcom/fourthline/orca/internal/b7$a;", "()Lcom/fourthline/orca/internal/b7$a;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new vk1(18))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean match;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String iban;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final a error;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27017b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f27016a = aVar;
                f27017b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.bav.internal.worker.BavValidateIbanWorker.BavValidateIbanResult", aVar, 3);
                pluginGeneratedSerialDescriptor.j("match", false);
                pluginGeneratedSerialDescriptor.j("iban", false);
                pluginGeneratedSerialDescriptor.j("error", true);
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
                Lazy[] lazyArr = b.d;
                dVarBeginStructure.getClass();
                int i = 0;
                boolean zDecodeBooleanElement = false;
                String strDecodeStringElement = null;
                a aVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        aVar = (a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), aVar);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, zDecodeBooleanElement, strDecodeStringElement, aVar, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.h.f247648a, qlm.v1.f247718a, nlm.a.c((KSerializer) b.d[2].getValue())};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b7$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f27016a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ b(int i, boolean z, String str, a aVar, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                qlm.j1.f(a.f27016a.getDescriptor(), i, 3);
                throw null;
            }
            this.match = z;
            this.iban = str;
            if ((i & 4) == 0) {
                this.error = null;
            } else {
                this.error = aVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return a.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getMatch() {
            return this.match;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.match == bVar.match && Intrinsics.f(this.iban, bVar.iban) && this.error == bVar.error;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.match) * 31) + this.iban.hashCode()) * 31;
            a aVar = this.error;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "BavValidateIbanResult(match=" + this.match + ", iban=" + this.iban + ", error=" + this.error + ")";
        }

        public b(boolean z, String iban, a aVar) {
            Intrinsics.checkNotNullParameter(iban, "iban");
            this.match = z;
            this.iban = iban;
            this.error = aVar;
        }

        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = d;
            output.encodeBooleanElement(serialDesc, 0, self.match);
            output.encodeStringElement(serialDesc, 1, self.iban);
            if (!output.d(serialDesc) && self.error == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.error);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27019b;

        public c(String workflowId, String iban) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(iban, "iban");
            this.f27018a = workflowId;
            this.f27019b = iban;
        }

        public final String a() {
            return this.f27019b;
        }

        public final String b() {
            return this.f27018a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f27018a, cVar.f27018a) && Intrinsics.f(this.f27019b, cVar.f27019b);
        }

        public int hashCode() {
            return (this.f27018a.hashCode() * 31) + this.f27019b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f27018a + ", iban=" + this.f27019b + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f27020a;

        public d(b result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f27020a = result;
        }

        public final b a() {
            return this.f27020a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f27020a, ((d) obj2).f27020a);
        }

        public int hashCode() {
            return this.f27020a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f27020a + ")";
        }
    }

    Object a(c cVar, Continuation continuation);
}

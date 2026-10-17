package com.fourthline.orca.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface lz {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f30792a;

        public b(c result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f30792a = result;
        }

        public final c a() {
            return this.f30792a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f30792a, ((b) obj2).f30792a);
        }

        public int hashCode() {
            return this.f30792a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f30792a + ")";
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30793a = new a();

            private a() {
            }

            @Override // com.fourthline.orca.internal.lz.c
            public /* bridge */ ny a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.lz.c
            public /* bridge */ boolean b() {
                return super.b();
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30794a = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.lz.c
            public /* bridge */ ny a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.lz.c
            public /* bridge */ boolean b() {
                return super.b();
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.lz$c$c, reason: collision with other inner class name */
        public static final class C0245c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f30795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ny f30796b;

            public C0245c(String name, ny nyVar) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f30795a = name;
                this.f30796b = nyVar;
            }

            @Override // com.fourthline.orca.internal.lz.c
            public /* bridge */ ny a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.lz.c
            public /* bridge */ boolean b() {
                return super.b();
            }

            public final ny c() {
                return this.f30796b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0245c)) {
                    return false;
                }
                C0245c c0245c = (C0245c) obj2;
                return Intrinsics.f(this.f30795a, c0245c.f30795a) && Intrinsics.f(this.f30796b, c0245c.f30796b);
            }

            public int hashCode() {
                int iHashCode = this.f30795a.hashCode() * 31;
                ny nyVar = this.f30796b;
                return iHashCode + (nyVar == null ? 0 : nyVar.hashCode());
            }

            public String toString() {
                return "StartNextFlow(name=" + this.f30795a + ", config=" + this.f30796b + ")";
            }
        }

        default ny a() {
            C0245c c0245c = this instanceof C0245c ? (C0245c) this : null;
            if (c0245c != null) {
                return c0245c.c();
            }
            return null;
        }

        default boolean b() {
            return this instanceof b;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0014 B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/lz$d;", "", "", "seen0", "", "name", "", "featureVariants", "Lkotlinx/serialization/json/JsonObject;", "configuration", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/lz$d;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lkotlinx/serialization/json/JsonObject;", "()Lkotlinx/serialization/json/JsonObject;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int d = 8;
        private static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new wn1(22)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List featureVariants;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final JsonObject configuration;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f30801b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f30800a = aVar;
                f30801b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.flow.whatsnext.FlowWhatsNextWorker.WhatsNextResponse", aVar, 3);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("featureVariants", true);
                pluginGeneratedSerialDescriptor.j("configuration", true);
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
                Lazy[] lazyArr = d.e;
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                List list = null;
                JsonObject jsonObject = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        jsonObject = (JsonObject) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, rlm.v.f255125a, jsonObject);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, strDecodeStringElement, list, jsonObject, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a, d.e[1].getValue(), nlm.a.c(rlm.v.f255125a)};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.lz$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f30800a;
            }

            private Companion() {
            }
        }

        public d(int i, String str, List list, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                qlm.j1.f(a.f30800a.getDescriptor(), i, 1);
                throw null;
            }
            this.name = str;
            if ((i & 2) == 0) {
                this.featureVariants = zhm.f0.f322471a;
            } else {
                this.featureVariants = list;
            }
            if ((i & 4) == 0) {
                this.configuration = null;
            } else {
                this.configuration = jsonObject;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return new qlm.e(qlm.v1.f247718a);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final JsonObject getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getFeatureVariants() {
            return this.featureVariants;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.featureVariants, dVar.featureVariants) && Intrinsics.f(this.configuration, dVar.configuration);
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.featureVariants.hashCode()) * 31;
            JsonObject jsonObject = this.configuration;
            return iHashCode + (jsonObject == null ? 0 : jsonObject.f187951a.hashCode());
        }

        public String toString() {
            return "WhatsNextResponse(name=" + this.name + ", featureVariants=" + this.featureVariants + ", configuration=" + this.configuration + ")";
        }

        public static final void a(d self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = e;
            output.encodeStringElement(serialDesc, 0, self.name);
            if (output.d(serialDesc) || !Intrinsics.f(self.featureVariants, zhm.f0.f322471a)) {
                output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.featureVariants);
            }
            if (!output.d(serialDesc) && self.configuration == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, rlm.v.f255125a, self.configuration);
        }
    }

    Object a(a aVar, Continuation continuation);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ye1 f30791a;

        public a(ye1 ye1Var) {
            this.f30791a = ye1Var;
        }

        public final ye1 a() {
            return this.f30791a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f30791a, ((a) obj2).f30791a);
        }

        public int hashCode() {
            ye1 ye1Var = this.f30791a;
            if (ye1Var == null) {
                return 0;
            }
            return ye1Var.hashCode();
        }

        public String toString() {
            return "Input(workflowTenantConfig=" + this.f30791a + ")";
        }

        public /* synthetic */ a(ye1 ye1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ye1Var);
        }
    }
}

package ofa;

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
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lofa/u;", "Lofa/g0;", "", "toString", "()Ljava/lang/String;", "Companion", "c", "a", "b", "feature_retail_post_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class u implements g0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f224785a;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f224786a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f224786a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PLAN", aVar, 1);
            pluginGeneratedSerialDescriptor.j("params", true);
            pluginGeneratedSerialDescriptor.l(new t());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{c.a.f224788a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            c cVar = null;
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
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c.a.f224788a, cVar);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new u(i, cVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            u value = (u) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f224785a, new c(0))) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c.a.f224788a, value.f224785a);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ofa.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f224786a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lofa/u$c;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_post_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f224787a;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f224788a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f224788a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.post_activation.impl.model.PostActivationStep.Plan.Params", aVar, 1);
                pluginGeneratedSerialDescriptor.j("selectedPlanId", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(v1.f247718a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, str);
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
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f224787a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f224787a);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: ofa.u$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f224788a;
            }
        }

        public c() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f224787a, ((c) obj2).f224787a);
        }

        public final int hashCode() {
            String str = this.f224787a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public c(int i) {
            this.f224787a = null;
        }

        public /* synthetic */ c(int i, String str) {
            if ((i & 1) == 0) {
                this.f224787a = null;
            } else {
                this.f224787a = str;
            }
        }
    }

    public /* synthetic */ u(int i, c cVar) {
        if ((i & 1) == 0) {
            this.f224785a = new c(0);
        } else {
            this.f224785a = cVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f224785a, ((u) obj2).f224785a);
    }

    public final int hashCode() {
        return this.f224785a.hashCode();
    }

    public u() {
        c params = new c(0);
        Intrinsics.checkNotNullParameter(params, "params");
        this.f224785a = params;
    }
}

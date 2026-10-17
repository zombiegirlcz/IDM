package gr2;

import adk.i1;
import gr2.f0;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/d;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f145822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f145824c;
    public final f0 d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f145825a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f145825a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.be_driven_design.models.dto.ActionDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("dialog", true);
            pluginGeneratedSerialDescriptor.j("deepLink", true);
            pluginGeneratedSerialDescriptor.k(new i1(new String[]{"deeplink"}, 6));
            pluginGeneratedSerialDescriptor.j("request", true);
            pluginGeneratedSerialDescriptor.j("popupMenu", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(c0.f145821a), nlm.a.c(v1.f247718a), nlm.a.c(e.f145826a), nlm.a.c(f0.a.f145832a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            e0 e0Var = null;
            String str = null;
            g gVar = null;
            f0 f0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    e0Var = (e0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, c0.f145821a, e0Var);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, e.f145826a, gVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    f0Var = (f0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, f0.a.f145832a, f0Var);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, e0Var, str, gVar, f0Var);
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
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145822a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, c0.f145821a, value.f145822a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145823b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f145823b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145824c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, e.f145826a, value.f145824c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, f0.a.f145832a, value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: gr2.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f145825a;
        }
    }

    public d() {
        this.f145822a = null;
        this.f145823b = null;
        this.f145824c = null;
        this.d = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f145822a, dVar.f145822a) && Intrinsics.f(this.f145823b, dVar.f145823b) && Intrinsics.f(this.f145824c, dVar.f145824c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        e0 e0Var = this.f145822a;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        String str = this.f145823b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f145824c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        f0 f0Var = this.d;
        return iHashCode3 + (f0Var != null ? f0Var.f145831a.hashCode() : 0);
    }

    public /* synthetic */ d(int i, e0 e0Var, String str, g gVar, f0 f0Var) {
        if ((i & 1) == 0) {
            this.f145822a = null;
        } else {
            this.f145822a = e0Var;
        }
        if ((i & 2) == 0) {
            this.f145823b = null;
        } else {
            this.f145823b = str;
        }
        if ((i & 4) == 0) {
            this.f145824c = null;
        } else {
            this.f145824c = gVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f0Var;
        }
    }
}

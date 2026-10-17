package wy1;

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
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lwy1/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "blockExtendable", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "blockedUntil", "c", "Ljava/lang/String;", "capability", "Companion", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockExtendable")
    private final Boolean blockExtendable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockedUntil")
    private final Long blockedUntil;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("capability")
    private final String capability;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f301025a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f301025a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.apm.core.impl.data.network.alias.model.AliasAttributesDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("blockExtendable", false);
            pluginGeneratedSerialDescriptor.j("blockedUntil", false);
            pluginGeneratedSerialDescriptor.j("capability", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(qlm.h.f247648a), nlm.a.c(t0.f247706a), nlm.a.c(v1.f247718a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Boolean bool = null;
            boolean z = true;
            int i = 0;
            Long l2 = null;
            String str = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.h.f247648a, bool);
                    i |= 1;
                } else if (iD == 1) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, l2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, bool, l2, str);
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
            b.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: wy1.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f301025a;
        }
    }

    public /* synthetic */ b(int i, Boolean bool, Long l2, String str) {
        if (7 != (i & 7)) {
            j1.f(a.f301025a.getDescriptor(), i, 7);
            throw null;
        }
        this.blockExtendable = bool;
        this.blockedUntil = l2;
        this.capability = str;
    }

    public static final /* synthetic */ void d(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, qlm.h.f247648a, bVar.blockExtendable);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, bVar.blockedUntil);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, bVar.capability);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getBlockExtendable() {
        return this.blockExtendable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getBlockedUntil() {
        return this.blockedUntil;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCapability() {
        return this.capability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.blockExtendable, bVar.blockExtendable) && Intrinsics.f(this.blockedUntil, bVar.blockedUntil) && Intrinsics.f(this.capability, bVar.capability);
    }

    public final int hashCode() {
        Boolean bool = this.blockExtendable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l2 = this.blockedUntil;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.capability;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public b(Boolean bool, Long l2, String str) {
        this.blockExtendable = bool;
        this.blockedUntil = l2;
        this.capability = str;
    }
}

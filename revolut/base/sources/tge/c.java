package tge;

import ie0.o;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ltge/c;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f271162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f271163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f271164c;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f271165a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f271165a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.tab.accounts.impl.model.ProductAccountMetadataEntity", aVar, 3);
            pluginGeneratedSerialDescriptor.j("balanceAmount", true);
            pluginGeneratedSerialDescriptor.j("currencyOnly", true);
            pluginGeneratedSerialDescriptor.j("isUserOwner", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(o.f160615a), nlm.a.c(ie0.d.f160593a), nlm.a.c(h.f247648a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            dj0.d dVar = null;
            boolean z = true;
            int i = 0;
            xi0.b bVar = null;
            Boolean bool = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    dVar = (dj0.d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, o.f160615a, dVar);
                    i |= 1;
                } else if (iD == 1) {
                    bVar = (xi0.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ie0.d.f160593a, bVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, h.f247648a, bool);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, dVar, bVar, bool);
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
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f271162a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, o.f160615a, value.f271162a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f271163b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ie0.d.f160593a, value.f271163b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f271164c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, h.f247648a, value.f271164c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: tge.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f271165a;
        }
    }

    public /* synthetic */ c(int i, dj0.d dVar, xi0.b bVar, Boolean bool) {
        if ((i & 1) == 0) {
            this.f271162a = null;
        } else {
            this.f271162a = dVar;
        }
        if ((i & 2) == 0) {
            this.f271163b = null;
        } else {
            this.f271163b = bVar;
        }
        if ((i & 4) == 0) {
            this.f271164c = null;
        } else {
            this.f271164c = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f271162a, cVar.f271162a) && Intrinsics.f(this.f271163b, cVar.f271163b) && Intrinsics.f(this.f271164c, cVar.f271164c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f271162a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        xi0.b bVar = this.f271163b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.f271164c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public c(dj0.d dVar, xi0.b bVar, Boolean bool) {
        this.f271162a = dVar;
        this.f271163b = bVar;
        this.f271164c = bool;
    }

    public c() {
        this(null, null, null);
    }
}

package plg;

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
import plg.b;
import qlm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lplg/d;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f237378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f237379b;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f237380a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f237380a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.us_send_checks.impl.interactor.beneficiary.validation.SendChecksBeneficiaryValidationError.Confirmation", aVar, 2);
            pluginGeneratedSerialDescriptor.j("geoLocation", true);
            pluginGeneratedSerialDescriptor.j("address", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(e.f237381a), nlm.a.c(b.a.f237377a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            g gVar = null;
            boolean z = true;
            int i = 0;
            b bVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, e.f237381a, gVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b.a.f237377a, bVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, gVar, bVar);
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
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f237378a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, e.f237381a, value.f237378a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f237379b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, b.a.f237377a, value.f237379b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: plg.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f237380a;
        }
    }

    public d() {
        this.f237378a = null;
        this.f237379b = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f237378a, dVar.f237378a) && Intrinsics.f(this.f237379b, dVar.f237379b);
    }

    public final int hashCode() {
        g gVar = this.f237378a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        b bVar = this.f237379b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public /* synthetic */ d(int i, g gVar, b bVar) {
        if ((i & 1) == 0) {
            this.f237378a = null;
        } else {
            this.f237378a = gVar;
        }
        if ((i & 2) == 0) {
            this.f237379b = null;
        } else {
            this.f237379b = bVar;
        }
    }
}

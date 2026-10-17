package igb;

import java.time.Instant;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ligb/s;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f161147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f161148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f161149c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f161150a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f161150a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.salary_hub.data.dto.SalaryHubDataDto.FreePremiumDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("optInAvailable", true);
            pluginGeneratedSerialDescriptor.j("claimDeadline", true);
            pluginGeneratedSerialDescriptor.j("optInDeadline", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(qlm.h.f247648a);
            ie0.j jVar = ie0.j.f160602a;
            return new KSerializer[]{kSerializerC, nlm.a.c(jVar), nlm.a.c(jVar)};
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
            Instant instant = null;
            Instant instant2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.h.f247648a, bool);
                    i |= 1;
                } else if (iD == 1) {
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    instant2 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ie0.j.f160602a, instant2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new s(i, bool, instant, instant2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            s value = (s) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161147a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.h.f247648a, value.f161147a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161148b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, value.f161148b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161149c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, ie0.j.f160602a, value.f161149c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: igb.s$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f161150a;
        }
    }

    public /* synthetic */ s(int i, Boolean bool, Instant instant, Instant instant2) {
        if ((i & 1) == 0) {
            this.f161147a = null;
        } else {
            this.f161147a = bool;
        }
        if ((i & 2) == 0) {
            this.f161148b = null;
        } else {
            this.f161148b = instant;
        }
        if ((i & 4) == 0) {
            this.f161149c = null;
        } else {
            this.f161149c = instant2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f161147a, sVar.f161147a) && Intrinsics.f(this.f161148b, sVar.f161148b) && Intrinsics.f(this.f161149c, sVar.f161149c);
    }

    public final int hashCode() {
        Boolean bool = this.f161147a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Instant instant = this.f161148b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f161149c;
        return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
    }

    public s(Boolean bool, Instant instant, Instant instant2) {
        this.f161147a = bool;
        this.f161148b = instant;
        this.f161149c = instant2;
    }

    public s() {
        this(null, null, null);
    }
}

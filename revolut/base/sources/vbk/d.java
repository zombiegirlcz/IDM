package vbk;

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
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lvbk/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "eligibility", "b", "receiverReason", "c", "senderReason", "Companion", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligibility")
    @NotNull
    private final String eligibility;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiverReason")
    private final String receiverReason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("senderReason")
    private final String senderReason;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f287541a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f287541a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.plan_gifting.impl.network.dto.PlanGiftingEligibilityDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("eligibility", false);
            pluginGeneratedSerialDescriptor.j("receiverReason", false);
            pluginGeneratedSerialDescriptor.j("senderReason", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
            String str = null;
            String str2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, strDecodeStringElement, str, str2);
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
            d.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: vbk.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f287541a;
        }
    }

    public /* synthetic */ d(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f287541a.getDescriptor(), i, 7);
            throw null;
        }
        this.eligibility = str;
        this.receiverReason = str2;
        this.senderReason = str3;
    }

    public static final /* synthetic */ void d(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.eligibility);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, dVar.receiverReason);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, dVar.senderReason);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEligibility() {
        return this.eligibility;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReceiverReason() {
        return this.receiverReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSenderReason() {
        return this.senderReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.eligibility, dVar.eligibility) && Intrinsics.f(this.receiverReason, dVar.receiverReason) && Intrinsics.f(this.senderReason, dVar.senderReason);
    }

    public final int hashCode() {
        int iHashCode = this.eligibility.hashCode() * 31;
        String str = this.receiverReason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.senderReason;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

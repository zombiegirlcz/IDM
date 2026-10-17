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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0081\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lvbk/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "giftAppliesAt", "b", "Ljava/lang/String;", "postClaimingFlow", "Companion", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("giftAppliesAt")
    private final Long giftAppliesAt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("postClaimingFlow")
    @NotNull
    private final String postClaimingFlow;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f287537a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f287537a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.plan_gifting.impl.network.dto.PlanGiftingClaimingResultDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("giftAppliesAt", false);
            pluginGeneratedSerialDescriptor.j("postClaimingFlow", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(t0.f247706a), v1.f247718a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Long l2 = null;
            boolean z = true;
            int i = 0;
            String strDecodeStringElement = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, t0.f247706a, l2);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, strDecodeStringElement, l2);
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
            c.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: vbk.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f287537a;
        }
    }

    public /* synthetic */ c(int i, String str, Long l2) {
        if (3 != (i & 3)) {
            j1.f(a.f287537a.getDescriptor(), i, 3);
            throw null;
        }
        this.giftAppliesAt = l2;
        this.postClaimingFlow = str;
    }

    public static final /* synthetic */ void c(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, t0.f247706a, cVar.giftAppliesAt);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cVar.postClaimingFlow);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getGiftAppliesAt() {
        return this.giftAppliesAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPostClaimingFlow() {
        return this.postClaimingFlow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.giftAppliesAt, cVar.giftAppliesAt) && Intrinsics.f(this.postClaimingFlow, cVar.postClaimingFlow);
    }

    public final int hashCode() {
        Long l2 = this.giftAppliesAt;
        return this.postClaimingFlow.hashCode() + ((l2 == null ? 0 : l2.hashCode()) * 31);
    }
}

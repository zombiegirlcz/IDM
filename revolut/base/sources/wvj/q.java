package wvj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
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
import qlm.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lwvj/q;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class q {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new wq1.a(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f300537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f300538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f300539c;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f300540a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f300540a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.trips.network.UpdateTripRequestDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("startDate", true);
            pluginGeneratedSerialDescriptor.j("endDate", true);
            pluginGeneratedSerialDescriptor.j("transactionAdjustments", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = q.d;
            t0 t0Var = t0.f247706a;
            return new KSerializer[]{nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c((KSerializer) lazyArr[2].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = q.d;
            dVarBeginStructure.getClass();
            Long l2 = null;
            boolean z = true;
            int i = 0;
            Long l3 = null;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, t0.f247706a, l2);
                    i |= 1;
                } else if (iD == 1) {
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, l3);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new q(i, l2, l3, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            q value = (q) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = q.d;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f300537a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, t0.f247706a, value.f300537a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f300538b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, value.f300538b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f300539c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f300539c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: wvj.q$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f300540a;
        }
    }

    public /* synthetic */ q(int i, Long l2, Long l3, List list) {
        if ((i & 1) == 0) {
            this.f300537a = null;
        } else {
            this.f300537a = l2;
        }
        if ((i & 2) == 0) {
            this.f300538b = null;
        } else {
            this.f300538b = l3;
        }
        if ((i & 4) == 0) {
            this.f300539c = null;
        } else {
            this.f300539c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f300537a, qVar.f300537a) && Intrinsics.f(this.f300538b, qVar.f300538b) && Intrinsics.f(this.f300539c, qVar.f300539c);
    }

    public final int hashCode() {
        Long l2 = this.f300537a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f300538b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.f300539c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public q(Long l2, Long l3, ArrayList arrayList) {
        this.f300537a = l2;
        this.f300538b = l3;
        this.f300539c = arrayList;
    }

    public q() {
        this(null, null, null);
    }
}

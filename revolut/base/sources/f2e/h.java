package f2e;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lf2e/h;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131609c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f131610a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f131610a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.AvailabilityScheduleDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("days", true);
            pluginGeneratedSerialDescriptor.j("intervals", true);
            pluginGeneratedSerialDescriptor.j("isAllDay", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = h.d;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), qlm.h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = h.d;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            List list2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new h(i, list, list2, zDecodeBooleanElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            h value = (h) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = h.d;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f131607a, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f131607a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f131608b, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f131608b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131609c) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f131609c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: f2e.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f131610a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new euf.a(28)), yhm.j.c(kVar, new euf.a(29)), null};
    }

    public h(int i, List list, List list2, boolean z) {
        this.f131607a = (i & 1) == 0 ? zhm.f0.f322471a : list;
        if ((i & 2) == 0) {
            this.f131608b = zhm.f0.f322471a;
        } else {
            this.f131608b = list2;
        }
        if ((i & 4) == 0) {
            this.f131609c = false;
        } else {
            this.f131609c = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f131607a, hVar.f131607a) && Intrinsics.f(this.f131608b, hVar.f131608b) && this.f131609c == hVar.f131609c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131609c) + p.a.d(this.f131607a.hashCode() * 31, 31, this.f131608b);
    }

    public h(List days, boolean z, List intervals) {
        Intrinsics.checkNotNullParameter(days, "days");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f131607a = days;
        this.f131608b = intervals;
        this.f131609c = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h() {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this(f0Var, false, f0Var);
    }
}

package pne;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lpne/y;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class y {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f237743c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f237745b;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f237746a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f237746a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.tax_residency.impl.exemption.models.dto.TaxExemptionDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("limited", true);
            pluginGeneratedSerialDescriptor.j("full", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = y.f237743c;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = y.f237743c;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            List list2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new y(list, i, list2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            y value = (y) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = y.f237743c;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f237744a, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f237744a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f237745b, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f237745b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: pne.y$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f237746a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f237743c = new Lazy[]{yhm.j.c(kVar, new pka.c(24)), yhm.j.c(kVar, new pka.c(25))};
    }

    public y(List list, int i, List list2) {
        this.f237744a = (i & 1) == 0 ? zhm.f0.f322471a : list;
        if ((i & 2) == 0) {
            this.f237745b = zhm.f0.f322471a;
        } else {
            this.f237745b = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f237744a, yVar.f237744a) && Intrinsics.f(this.f237745b, yVar.f237745b);
    }

    public final int hashCode() {
        return this.f237745b.hashCode() + (this.f237744a.hashCode() * 31);
    }

    public y(List limitExemptions, List fullExemptions) {
        Intrinsics.checkNotNullParameter(limitExemptions, "limitExemptions");
        Intrinsics.checkNotNullParameter(fullExemptions, "fullExemptions");
        this.f237744a = limitExemptions;
        this.f237745b = fullExemptions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y() {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this(f0Var, f0Var);
    }
}

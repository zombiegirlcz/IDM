package gfb;

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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgfb/d;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f143386b = {j.c(k.PUBLICATION, new gaa.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143387a;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f143388a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f143388a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.reverywhere.impl.network.ReverywhereConfigDto", aVar, 1);
            pluginGeneratedSerialDescriptor.j("applications", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{d.f143386b[0].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d.f143386b;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else {
                    if (iD != 0) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, list);
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
            Lazy[] lazyArr = d.f143386b;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f143387a, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f143387a);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: gfb.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f143388a;
        }
    }

    public d(int i, List list) {
        if ((i & 1) == 0) {
            this.f143387a = zhm.f0.f322471a;
        } else {
            this.f143387a = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f143387a, ((d) obj2).f143387a);
    }

    public final int hashCode() {
        return this.f143387a.hashCode();
    }

    public d() {
        zhm.f0 applications = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(applications, "applications");
        this.f143387a = applications;
    }
}

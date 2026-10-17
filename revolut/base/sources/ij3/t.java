package ij3;

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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lij3/t;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_cms_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f161692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f161693b;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f161694a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f161694a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.cms.stories.impl.data.network.model.CmsStoryTimeoutsDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("assetLoadingTimeoutSec", true);
            pluginGeneratedSerialDescriptor.j("firstScreenAssetLoadingTimeoutSec", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            t0 t0Var = t0.f247706a;
            return new KSerializer[]{t0Var, t0Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new t(i, jDecodeLongElement, jDecodeLongElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            t value = (t) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161692a != 10) {
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f161692a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161693b != 15) {
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f161693b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ij3.t$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f161694a;
        }
    }

    public t() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f161692a == tVar.f161692a && this.f161693b == tVar.f161693b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f161693b) + (Long.hashCode(this.f161692a) * 31);
    }

    public /* synthetic */ t(int i, long j2, long j3) {
        this.f161692a = (i & 1) == 0 ? 10L : j2;
        if ((i & 2) == 0) {
            this.f161693b = 15L;
        } else {
            this.f161693b = j3;
        }
    }

    public t(long j2, long j3) {
        this.f161692a = j2;
        this.f161693b = j3;
    }

    public /* synthetic */ t(int i) {
        this(10L, 15L);
    }
}

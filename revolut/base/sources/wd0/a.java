package wd0;

import java.util.Map;
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
import qlm.j1;
import wal.f;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0007\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lwd0/a;", "", "", "toString", "()Ljava/lang/String;", "", "Lwd0/d;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "getIconsConfigMap$annotations", "()V", "iconsConfigMap", "Companion", "b", "core_currency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f296432b = {j.c(k.PUBLICATION, new f(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("icons")
    @NotNull
    private final Map<String, d> iconsConfigMap;

    /* JADX INFO: renamed from: wd0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1634a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1634a f296434a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1634a c1634a = new C1634a();
            f296434a = c1634a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.currency.impl.dto.ConfigDto", c1634a, 1);
            pluginGeneratedSerialDescriptor.j("icons", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1634a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{a.f296432b[0].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.f296432b;
            dVarBeginStructure.getClass();
            Map map = null;
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
                    map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), map);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, map);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a value = (a) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a.b(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: wd0.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1634a.f296434a;
        }
    }

    public /* synthetic */ a(int i, Map map) {
        if (1 == (i & 1)) {
            this.iconsConfigMap = map;
        } else {
            j1.f(C1634a.f296434a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public static final /* synthetic */ void b(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (h) f296432b[0].getValue(), aVar.iconsConfigMap);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getIconsConfigMap() {
        return this.iconsConfigMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.iconsConfigMap, ((a) obj2).iconsConfigMap);
    }

    public final int hashCode() {
        return this.iconsConfigMap.hashCode();
    }
}

package j3c;

import j1f.q0;
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
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0004R,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0005\u0010\u0014R,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u001b"}, d2 = {"Lj3c/h;", "Lj3c/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "type", "b", "getFallback$annotations", "fallback", "c", "d", "getThumbnail$annotations", "thumbnail", "", "Ljava/util/Map;", "()Ljava/util/Map;", "getDark$annotations", "dark", "e", "getLight$annotations", "light", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h implements i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fallback")
    @NotNull
    private final String fallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("thumbnail")
    @NotNull
    private final String thumbnail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dark")
    @NotNull
    private final Map<String, String> dark;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("light")
    @NotNull
    private final Map<String, String> light;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171065a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171065a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.GalleryItemDto.Video", aVar, 4);
            pluginGeneratedSerialDescriptor.j("fallback", false);
            pluginGeneratedSerialDescriptor.j("thumbnail", false);
            pluginGeneratedSerialDescriptor.j("dark", false);
            pluginGeneratedSerialDescriptor.j("light", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = h.f;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), lazyArr[3].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = h.f;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            Map map = null;
            Map map2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), map);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), map2);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new h(i, strDecodeStringElement, strDecodeStringElement2, map, map2);
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
            h.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171065a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, yhm.j.c(kVar, new q0(13)), yhm.j.c(kVar, new q0(14))};
    }

    public /* synthetic */ h(int i, String str, String str2, Map map, Map map2) {
        if (15 != (i & 15)) {
            j1.f(a.f171065a.getDescriptor(), i, 15);
            throw null;
        }
        this.type = "video";
        this.fallback = str;
        this.thumbnail = str2;
        this.dark = map;
        this.light = map2;
    }

    public static final /* synthetic */ void e(h hVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hVar.fallback);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, hVar.thumbnail);
        Lazy[] lazyArr = f;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), hVar.dark);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), hVar.light);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getDark() {
        return this.dark;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getLight() {
        return this.light;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.type, hVar.type) && Intrinsics.f(this.fallback, hVar.fallback) && Intrinsics.f(this.thumbnail, hVar.thumbnail) && Intrinsics.f(this.dark, hVar.dark) && Intrinsics.f(this.light, hVar.light);
    }

    public final int hashCode() {
        return this.light.hashCode() + p.a.e(p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.fallback), 31, this.thumbnail), 31, this.dark);
    }
}

package j3c;

import j1f.q0;
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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u0005\u0010\u0004R&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u0012\u0004\b\u0012\u0010\t\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lj3c/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "getTile$annotations", "()V", "tile", "b", "getAvatar$annotations", "avatar", "", "Lj3c/i;", "Ljava/util/List;", "()Ljava/util/List;", "getGallery$annotations", "gallery", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tile")
    @NotNull
    private final String tile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("avatar")
    @NotNull
    private final String avatar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("gallery")
    @NotNull
    private final List<i> gallery;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171032a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171032a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.AssetsDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("tile", false);
            pluginGeneratedSerialDescriptor.j("avatar", false);
            pluginGeneratedSerialDescriptor.j("gallery", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = c.d;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c.d;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            String strDecodeStringElement2 = null;
            List list = null;
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
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, strDecodeStringElement, strDecodeStringElement2, list);
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
            c.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171032a;
        }
    }

    public /* synthetic */ c(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(a.f171032a.getDescriptor(), i, 7);
            throw null;
        }
        this.tile = str;
        this.avatar = str2;
        this.gallery = list;
    }

    public static final /* synthetic */ void d(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.tile);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cVar.avatar);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, (mlm.h) d[2].getValue(), cVar.gallery);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getGallery() {
        return this.gallery;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTile() {
        return this.tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.tile, cVar.tile) && Intrinsics.f(this.avatar, cVar.avatar) && Intrinsics.f(this.gallery, cVar.gallery);
    }

    public final int hashCode() {
        return this.gallery.hashCode() + p.a.c(this.tile.hashCode() * 31, 31, this.avatar);
    }
}

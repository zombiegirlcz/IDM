package yh6;

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
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0007\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lyh6/z;", "", "", "toString", "()Ljava/lang/String;", "", "Lyh6/x;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "popular", "others", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f313865c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("popular")
    @NotNull
    private final List<x> popular;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("others")
    @NotNull
    private final List<x> others;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313868a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313868a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.repository.models.PseProvidersDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("popular", false);
            pluginGeneratedSerialDescriptor.j("others", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = z.f313865c;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = z.f313865c;
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
            return new z(list, i, list2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            z value = (z) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            z.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yh6.z$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313868a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f313865c = new Lazy[]{yhm.j.c(kVar, new y(0)), yhm.j.c(kVar, new y(1))};
    }

    public /* synthetic */ z(List list, int i, List list2) {
        if (3 != (i & 3)) {
            j1.f(a.f313868a.getDescriptor(), i, 3);
            throw null;
        }
        this.popular = list;
        this.others = list2;
    }

    public static final /* synthetic */ void c(z zVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Lazy[] lazyArr = f313865c;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), zVar.popular);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), zVar.others);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getOthers() {
        return this.others;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPopular() {
        return this.popular;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.popular, zVar.popular) && Intrinsics.f(this.others, zVar.others);
    }

    public final int hashCode() {
        return this.others.hashCode() + (this.popular.hashCode() * 31);
    }
}

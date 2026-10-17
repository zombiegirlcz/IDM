package j3c;

import j1f.q0;
import j3c.b0;
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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0005\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\f\u0010\u000eR \u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0005\u0010\u0014R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001b\u0010\t\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001e"}, d2 = {"Lj3c/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "getServiceProvider$annotations", "()V", "serviceProvider", "Lj3c/b0;", "b", "Lj3c/b0;", "()Lj3c/b0;", "getDeliveryPrice$annotations", "deliveryPrice", "", "c", "J", "()J", "getDeliveryDate$annotations", "deliveryDate", "", "Lj3c/w;", "Ljava/util/List;", "()Ljava/util/List;", "getItems$annotations", "items", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceProvider")
    @NotNull
    private final String serviceProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryPrice")
    @NotNull
    private final b0 deliveryPrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryDate")
    private final long deliveryDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<w> items;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171151a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171151a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppShipmentDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("serviceProvider", false);
            pluginGeneratedSerialDescriptor.j("deliveryPrice", false);
            pluginGeneratedSerialDescriptor.j("deliveryDate", false);
            pluginGeneratedSerialDescriptor.j("items", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, b0.a.f171028a, t0.f247706a, v.e[3].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = v.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            b0 b0Var = null;
            List list = null;
            long jDecodeLongElement = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, b0.a.f171028a, b0Var);
                    i |= 2;
                } else if (iD == 2) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new v(i, strDecodeStringElement, b0Var, jDecodeLongElement, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            v value = (v) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            v.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171151a;
        }
    }

    public /* synthetic */ v(int i, String str, b0 b0Var, long j2, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f171151a.getDescriptor(), i, 15);
            throw null;
        }
        this.serviceProvider = str;
        this.deliveryPrice = b0Var;
        this.deliveryDate = j2;
        this.items = list;
    }

    public static final /* synthetic */ void e(v vVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, vVar.serviceProvider);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, b0.a.f171028a, vVar.deliveryPrice);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, vVar.deliveryDate);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, (mlm.h) e[3].getValue(), vVar.items);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDeliveryDate() {
        return this.deliveryDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getDeliveryPrice() {
        return this.deliveryPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getServiceProvider() {
        return this.serviceProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.serviceProvider, vVar.serviceProvider) && Intrinsics.f(this.deliveryPrice, vVar.deliveryPrice) && this.deliveryDate == vVar.deliveryDate && Intrinsics.f(this.items, vVar.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + a0.d.c((this.deliveryPrice.hashCode() + (this.serviceProvider.hashCode() * 31)) * 31, 31, this.deliveryDate);
    }
}

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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u0012\u0004\b\u0012\u0010\t\u001a\u0004\b\u0005\u0010\u0011R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0004R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0004R&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001c\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u000b\u0010\u001d¨\u0006!"}, d2 = {"Lj3c/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "getServiceProvider$annotations", "()V", "serviceProvider", "b", "d", "getState$annotations", "state", "", "J", "()J", "getDeliveryDate$annotations", "deliveryDate", "e", "getTrackingNumber$annotations", "trackingNumber", "f", "getTrackingUrl$annotations", "trackingUrl", "", "Lj3c/q;", "Ljava/util/List;", "()Ljava/util/List;", "getItems$annotations", "items", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f171097g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceProvider")
    @NotNull
    private final String serviceProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryDate")
    private final long deliveryDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("trackingNumber")
    private final String trackingNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("trackingUrl")
    private final String trackingUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<q> items;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171101a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171101a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppOrderShipmentDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("serviceProvider", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("deliveryDate", false);
            pluginGeneratedSerialDescriptor.j("trackingNumber", false);
            pluginGeneratedSerialDescriptor.j("trackingUrl", false);
            pluginGeneratedSerialDescriptor.j("items", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = p.f171097g;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, t0.f247706a, nlm.a.c(v1Var), nlm.a.c(v1Var), lazyArr[5].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = p.f171097g;
            dVarBeginStructure.getClass();
            List list = null;
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            String str2 = null;
            long jDecodeLongElement = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                        i |= 16;
                        break;
                    case 5:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new p(i, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2, str, str2, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            p value = (p) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            p.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171101a;
        }
    }

    public /* synthetic */ p(int i, long j2, String str, String str2, String str3, String str4, List list) {
        if (63 != (i & 63)) {
            j1.f(a.f171101a.getDescriptor(), i, 63);
            throw null;
        }
        this.serviceProvider = str;
        this.state = str2;
        this.deliveryDate = j2;
        this.trackingNumber = str3;
        this.trackingUrl = str4;
        this.items = list;
    }

    public static final /* synthetic */ void g(p pVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pVar.serviceProvider);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pVar.state);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, pVar.deliveryDate);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, pVar.trackingNumber);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, pVar.trackingUrl);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, (mlm.h) f171097g[5].getValue(), pVar.items);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDeliveryDate() {
        return this.deliveryDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getServiceProvider() {
        return this.serviceProvider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTrackingNumber() {
        return this.trackingNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.serviceProvider, pVar.serviceProvider) && Intrinsics.f(this.state, pVar.state) && this.deliveryDate == pVar.deliveryDate && Intrinsics.f(this.trackingNumber, pVar.trackingNumber) && Intrinsics.f(this.trackingUrl, pVar.trackingUrl) && Intrinsics.f(this.items, pVar.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.serviceProvider.hashCode() * 31, 31, this.state), 31, this.deliveryDate);
        String str = this.trackingNumber;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingUrl;
        return this.items.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

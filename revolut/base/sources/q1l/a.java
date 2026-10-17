package q1l;

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
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lq1l/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "q1l/h", "q1l/d", "a", "b", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new pni.a(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f241467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f241468c;

    /* JADX INFO: renamed from: q1l.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1333a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1333a f241469a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1333a c1333a = new C1333a();
            f241469a = c1333a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.travel_status.impl.data.dto.overview.TravelStatusOverviewDto", c1333a, 3);
            pluginGeneratedSerialDescriptor.j("subtitle", true);
            pluginGeneratedSerialDescriptor.j("subtitleIcon", true);
            pluginGeneratedSerialDescriptor.j("partners", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1333a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(v1.f247718a), nlm.a.c(b.f241470a), a.d[2].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.d;
            dVarBeginStructure.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            d dVar = null;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b.f241470a, dVar);
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
            return new a(i, str, dVar, list);
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
            Lazy[] lazyArr = a.d;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f241466a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f241466a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f241467b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, b.f241470a, value.f241467b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f241468c, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f241468c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: q1l.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1333a.f241469a;
        }
    }

    public a(int i, String str, d dVar, List list) {
        if ((i & 1) == 0) {
            this.f241466a = null;
        } else {
            this.f241466a = str;
        }
        if ((i & 2) == 0) {
            this.f241467b = null;
        } else {
            this.f241467b = dVar;
        }
        if ((i & 4) == 0) {
            this.f241468c = zhm.f0.f322471a;
        } else {
            this.f241468c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f241466a, aVar.f241466a) && Intrinsics.f(this.f241467b, aVar.f241467b) && Intrinsics.f(this.f241468c, aVar.f241468c);
    }

    public final int hashCode() {
        String str = this.f241466a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f241467b;
        return this.f241468c.hashCode() + ((iHashCode + (dVar != null ? dVar.f241471a.hashCode() : 0)) * 31);
    }

    public a(String str, d dVar, List partners) {
        Intrinsics.checkNotNullParameter(partners, "partners");
        this.f241466a = str;
        this.f241467b = dVar;
        this.f241468c = partners;
    }

    public a() {
        this(null, null, zhm.f0.f322471a);
    }
}

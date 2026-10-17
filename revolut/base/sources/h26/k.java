package h26;

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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lh26/k;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_defi_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new gx2.a(23)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148729c;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f148730a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f148730a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.asset_details.impl.data.model.DeFiAssetRiskResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.j("level", true);
            pluginGeneratedSerialDescriptor.j("risks", true);
            pluginGeneratedSerialDescriptor.j("scanning", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(v1.f247718a), k.d[1].getValue(), qlm.h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = k.d;
            dVarBeginStructure.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new k(i, str, list, zDecodeBooleanElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            k value = (k) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = k.d;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f148727a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f148727a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f148728b, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f148728b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f148729c) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f148729c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: h26.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f148730a;
        }
    }

    public k(int i, String str, List list, boolean z) {
        this.f148727a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f148728b = zhm.f0.f322471a;
        } else {
            this.f148728b = list;
        }
        if ((i & 4) == 0) {
            this.f148729c = false;
        } else {
            this.f148729c = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f148727a, kVar.f148727a) && Intrinsics.f(this.f148728b, kVar.f148728b) && this.f148729c == kVar.f148729c;
    }

    public final int hashCode() {
        String str = this.f148727a;
        return Boolean.hashCode(this.f148729c) + p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f148728b);
    }

    public k(String str, List risks, boolean z) {
        Intrinsics.checkNotNullParameter(risks, "risks");
        this.f148727a = str;
        this.f148728b = risks;
        this.f148729c = z;
    }

    public k() {
        this(null, zhm.f0.f322471a, false);
    }
}

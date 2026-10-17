package xli;

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
import plm.d;
import qlm.f0;
import xkf.c;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lxli/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "b", "a", "deeplink_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f307018c;

    /* JADX INFO: renamed from: xli.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1703a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1703a f307019a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1703a c1703a = new C1703a();
            f307019a = c1703a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.navigation.deeplink.api.config.UnifiedDeeplinkConfig", c1703a, 3);
            pluginGeneratedSerialDescriptor.j("template", true);
            pluginGeneratedSerialDescriptor.j("startsWith", true);
            pluginGeneratedSerialDescriptor.j("fullMatch", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1703a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = a.d;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.d;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            List list2 = null;
            List list3 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list3);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, list, list2, list3);
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
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f307016a, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f307016a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f307017b, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f307017b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f307018c, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f307018c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xli.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1703a.f307019a;
        }
    }

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{j.c(kVar, new c(14)), j.c(kVar, new c(15)), j.c(kVar, new c(16))};
        new a(0);
    }

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f307016a, aVar.f307016a) && Intrinsics.f(this.f307017b, aVar.f307017b) && Intrinsics.f(this.f307018c, aVar.f307018c);
    }

    public final int hashCode() {
        return this.f307018c.hashCode() + p.a.d(this.f307016a.hashCode() * 31, 31, this.f307017b);
    }

    public a(int i, List list, List list2, List list3) {
        this.f307016a = (i & 1) == 0 ? zhm.f0.f322471a : list;
        if ((i & 2) == 0) {
            this.f307017b = zhm.f0.f322471a;
        } else {
            this.f307017b = list2;
        }
        if ((i & 4) == 0) {
            this.f307018c = zhm.f0.f322471a;
        } else {
            this.f307018c = list3;
        }
    }

    public a(int i) {
        zhm.f0 fullMatch = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(fullMatch, "template");
        Intrinsics.checkNotNullParameter(fullMatch, "startsWith");
        Intrinsics.checkNotNullParameter(fullMatch, "fullMatch");
        this.f307016a = fullMatch;
        this.f307017b = fullMatch;
        this.f307018c = fullMatch;
    }
}

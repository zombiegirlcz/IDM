package wd0;

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
import qlm.f0;
import qlm.j1;
import wal.f;
import wd0.a;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0007\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\tR(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR \u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lwd0/b;", "", "", "toString", "()Ljava/lang/String;", "", "Lwd0/c;", "a", "Ljava/util/List;", "()Ljava/util/List;", "getCurrencies$annotations", "()V", "currencies", "b", "getDeprecatedCurrencies$annotations", "deprecatedCurrencies", "Lwd0/a;", "c", "Lwd0/a;", "()Lwd0/a;", "getIconsConfig$annotations", "iconsConfig", "Companion", "core_currency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private final List<c> currencies;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("deprecatedCurrencies")
    private final List<c> deprecatedCurrencies;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("config")
    @NotNull
    private final wd0.a iconsConfig;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f296438a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f296438a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.currency.impl.dto.CurrenciesConfigDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("currencies", false);
            pluginGeneratedSerialDescriptor.j("deprecatedCurrencies", false);
            pluginGeneratedSerialDescriptor.j("config", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b.d;
            return new KSerializer[]{lazyArr[0].getValue(), nlm.a.c((KSerializer) lazyArr[1].getValue()), a.C1634a.f296434a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b.d;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            List list2 = null;
            wd0.a aVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    aVar = (wd0.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1634a.f296434a, aVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, list, list2, aVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            b.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: wd0.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f296438a;
        }
    }

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{j.c(kVar, new f(17)), j.c(kVar, new f(18)), null};
    }

    public /* synthetic */ b(int i, List list, List list2, wd0.a aVar) {
        if (7 != (i & 7)) {
            j1.f(a.f296438a.getDescriptor(), i, 7);
            throw null;
        }
        this.currencies = list;
        this.deprecatedCurrencies = list2;
        this.iconsConfig = aVar;
    }

    public static final /* synthetic */ void d(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Lazy[] lazyArr = d;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), bVar.currencies);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), bVar.deprecatedCurrencies);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, a.C1634a.f296434a, bVar.iconsConfig);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCurrencies() {
        return this.currencies;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDeprecatedCurrencies() {
        return this.deprecatedCurrencies;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final wd0.a getIconsConfig() {
        return this.iconsConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.currencies, bVar.currencies) && Intrinsics.f(this.deprecatedCurrencies, bVar.deprecatedCurrencies) && Intrinsics.f(this.iconsConfig, bVar.iconsConfig);
    }

    public final int hashCode() {
        int iHashCode = this.currencies.hashCode() * 31;
        List<c> list = this.deprecatedCurrencies;
        return this.iconsConfig.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}

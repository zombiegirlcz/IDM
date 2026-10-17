package jed;

import java.time.Instant;
import jed.g;
import jo3.a;
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
import qlm.n0;
import qlm.t0;
import qlm.v1;
import qlm.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000b\"3\b&\u00124\u000e\u0019\u0014\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010-\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b\u0012\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b\f\u00100¨\u00065"}, d2 = {"Ljed/f;", "Ljed/b;", "", "toString", "()Ljava/lang/String;", "Ljed/f$h;", "a", "Ljed/f$h;", "f", "()Ljed/f$h;", "price", "Ljed/f$k;", "b", "Ljed/f$k;", "i", "()Ljed/f$k;", "volume", "Ljed/f$f;", "c", "Ljed/f$f;", "d", "()Ljed/f$f;", "marketCap", "Ljed/f$g;", "Ljed/f$g;", "e", "()Ljed/f$g;", "perShare", "Ljed/f$c;", "Ljed/f$c;", "()Ljed/f$c;", "dividend", "Ljed/f$j;", "Ljed/f$j;", "h", "()Ljed/f$j;", "valuation", "Ljed/f$i;", "g", "Ljed/f$i;", "()Ljed/f$i;", "profitability", "Ljed/f$e;", "Ljed/f$e;", "()Ljed/f$e;", "managementEffectiveness", "Ljed/f$d;", "Ljed/f$d;", "()Ljed/f$d;", "listingData", "Companion", "k", "j", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class f implements b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final h price;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("volume")
    @NotNull
    private final k volume;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("marketCap")
    @NotNull
    private final C0986f marketCap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("perShare")
    @NotNull
    private final g perShare;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dividend")
    @NotNull
    private final c dividend;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("valuation")
    @NotNull
    private final j valuation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("profitability")
    @NotNull
    private final i profitability;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("managementEffectiveness")
    @NotNull
    private final e managementEffectiveness;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("listingData")
    private final d listingData;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f173315a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f173315a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto", aVar, 9);
            pluginGeneratedSerialDescriptor.j("price", false);
            pluginGeneratedSerialDescriptor.j("volume", false);
            pluginGeneratedSerialDescriptor.j("marketCap", false);
            pluginGeneratedSerialDescriptor.j("perShare", false);
            pluginGeneratedSerialDescriptor.j("dividend", false);
            pluginGeneratedSerialDescriptor.j("valuation", false);
            pluginGeneratedSerialDescriptor.j("profitability", false);
            pluginGeneratedSerialDescriptor.j("managementEffectiveness", false);
            pluginGeneratedSerialDescriptor.j("listingData", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{h.a.f173342a, k.a.f173353a, C0986f.a.f173334a, g.a.f173338a, c.a.f173319a, j.a.f173350a, i.a.f173346a, e.a.f173330a, nlm.a.c(d.a.f173326a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            h hVar = null;
            k kVar = null;
            C0986f c0986f = null;
            g gVar = null;
            c cVar = null;
            j jVar = null;
            i iVar = null;
            e eVar = null;
            d dVar = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, h.a.f173342a, hVar);
                        i |= 1;
                        break;
                    case 1:
                        kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, k.a.f173353a, kVar);
                        i |= 2;
                        break;
                    case 2:
                        c0986f = (C0986f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, C0986f.a.f173334a, c0986f);
                        i |= 4;
                        break;
                    case 3:
                        gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, g.a.f173338a, gVar);
                        i |= 8;
                        break;
                    case 4:
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, c.a.f173319a, cVar);
                        i |= 16;
                        break;
                    case 5:
                        jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, j.a.f173350a, jVar);
                        i |= 32;
                        break;
                    case 6:
                        iVar = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, i.a.f173346a, iVar);
                        i |= 64;
                        break;
                    case 7:
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, e.a.f173330a, eVar);
                        i |= 128;
                        break;
                    case 8:
                        dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, d.a.f173326a, dVar);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new f(i, hVar, kVar, c0986f, gVar, cVar, jVar, iVar, eVar, dVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            f value = (f) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            f.j(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jed.f$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f173315a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Ljed/f$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "dividendYield", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "dividendPerShareRfy", "c", "payoutRatio", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dividendYield")
        private final Double dividendYield;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dividendPerShareRfy")
        private final jo3.a dividendPerShareRfy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("payoutRatio")
        private final Double payoutRatio;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173319a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173319a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.DividendDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("dividendYield", false);
                pluginGeneratedSerialDescriptor.j("dividendPerShareRfy", false);
                pluginGeneratedSerialDescriptor.j("payoutRatio", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                x xVar = x.f247723a;
                return new KSerializer[]{nlm.a.c(xVar), nlm.a.c(a.C1001a.f176860a), nlm.a.c(xVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Double d = null;
                boolean z = true;
                int i = 0;
                jo3.a aVar = null;
                Double d5 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, x.f247723a, d);
                        i |= 1;
                    } else if (iD == 1) {
                        aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x.f247723a, d5);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, d, aVar, d5);
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

        /* JADX INFO: renamed from: jed.f$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173319a;
            }
        }

        public /* synthetic */ c(int i, Double d, jo3.a aVar, Double d5) {
            if (7 != (i & 7)) {
                j1.f(a.f173319a.getDescriptor(), i, 7);
                throw null;
            }
            this.dividendYield = d;
            this.dividendPerShareRfy = aVar;
            this.payoutRatio = d5;
        }

        public static final /* synthetic */ void d(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            x xVar = x.f247723a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, xVar, cVar.dividendYield);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, cVar.dividendPerShareRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, xVar, cVar.payoutRatio);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDividendPerShareRfy() {
            return this.dividendPerShareRfy;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getDividendYield() {
            return this.dividendYield;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getPayoutRatio() {
            return this.payoutRatio;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.dividendYield, cVar.dividendYield) && Intrinsics.f(this.dividendPerShareRfy, cVar.dividendPerShareRfy) && Intrinsics.f(this.payoutRatio, cVar.payoutRatio);
        }

        public final int hashCode() {
            Double d = this.dividendYield;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            jo3.a aVar = this.dividendPerShareRfy;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Double d5 = this.payoutRatio;
            return iHashCode2 + (d5 != null ? d5.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002\u0006\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0007\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0013\u0010\tR \u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u0012\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001a\u0010\tR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0016\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b \u0010\"R\"\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0007\u0012\u0004\b%\u0010\u000b\u001a\u0004\b\u0006\u0010\tR\"\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0007\u0012\u0004\b(\u0010\u000b\u001a\u0004\b'\u0010\t¨\u0006+"}, d2 = {"Ljed/f$d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/Instant;", "a", "Ljava/time/Instant;", "f", "()Ljava/time/Instant;", "getLaunchDate$annotations", "()V", "launchDate", "Ljed/g;", "b", "Ljed/g;", "h", "()Ljed/g;", "priceRange", "c", "Ljava/lang/String;", "companyDescription", "d", "getFilingDate$annotations", "filingDate", "e", "i", "getPriceRangeIssueDate$annotations", "priceRangeIssueDate", "getFinalPriceDate$annotations", "finalPriceDate", "Ljo3/a;", "g", "Ljo3/a;", "()Ljo3/a;", "fundraisingTotal", "officialValuation", "getCancellationDeadline$annotations", "cancellationDeadline", "j", "getRequestStartDate$annotations", "requestStartDate", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("launchDate")
        @NotNull
        private final Instant launchDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("priceRange")
        @NotNull
        private final jed.g priceRange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("companyDescription")
        @NotNull
        private final String companyDescription;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("filingDate")
        private final Instant filingDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("priceRangeIssueDate")
        @NotNull
        private final Instant priceRangeIssueDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("finalPriceDate")
        private final Instant finalPriceDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("fundraisingTotal")
        private final jo3.a fundraisingTotal;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("officialValuation")
        private final jo3.a officialValuation;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("cancellationDeadline")
        private final Instant cancellationDeadline;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("requestStartDate")
        private final Instant requestStartDate;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173326a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173326a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.ListingDataDto", aVar, 10);
                pluginGeneratedSerialDescriptor.j("launchDate", false);
                pluginGeneratedSerialDescriptor.j("priceRange", false);
                pluginGeneratedSerialDescriptor.j("companyDescription", false);
                pluginGeneratedSerialDescriptor.j("filingDate", false);
                pluginGeneratedSerialDescriptor.j("priceRangeIssueDate", false);
                pluginGeneratedSerialDescriptor.j("finalPriceDate", false);
                pluginGeneratedSerialDescriptor.j("fundraisingTotal", false);
                pluginGeneratedSerialDescriptor.j("officialValuation", false);
                pluginGeneratedSerialDescriptor.j("cancellationDeadline", false);
                pluginGeneratedSerialDescriptor.j("requestStartDate", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                ie0.j jVar = ie0.j.f160602a;
                KSerializer kSerializerC = nlm.a.c(jVar);
                KSerializer kSerializerC2 = nlm.a.c(jVar);
                a.C1001a c1001a = a.C1001a.f176860a;
                return new KSerializer[]{jVar, g.a.f173356a, v1.f247718a, kSerializerC, jVar, kSerializerC2, nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(jVar), nlm.a.c(jVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Instant instant = null;
                Instant instant2 = null;
                jed.g gVar = null;
                String strDecodeStringElement = null;
                Instant instant3 = null;
                Instant instant4 = null;
                Instant instant5 = null;
                jo3.a aVar = null;
                jo3.a aVar2 = null;
                Instant instant6 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.j.f160602a, instant2);
                            i |= 1;
                            break;
                        case 1:
                            gVar = (jed.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, g.a.f173356a, gVar);
                            i |= 2;
                            break;
                        case 2:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            instant3 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ie0.j.f160602a, instant3);
                            i |= 8;
                            break;
                        case 4:
                            instant4 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, ie0.j.f160602a, instant4);
                            i |= 16;
                            break;
                        case 5:
                            instant5 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.j.f160602a, instant5);
                            i |= 32;
                            break;
                        case 6:
                            aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar);
                            i |= 64;
                            break;
                        case 7:
                            aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, a.C1001a.f176860a, aVar2);
                            i |= 128;
                            break;
                        case 8:
                            instant6 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ie0.j.f160602a, instant6);
                            i |= 256;
                            break;
                        case 9:
                            instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, ie0.j.f160602a, instant);
                            i |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, instant2, gVar, strDecodeStringElement, instant3, instant4, instant5, aVar, aVar2, instant6, instant);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                d value = (d) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                d.k(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173326a;
            }
        }

        public /* synthetic */ d(int i, Instant instant, jed.g gVar, String str, Instant instant2, Instant instant3, Instant instant4, jo3.a aVar, jo3.a aVar2, Instant instant5, Instant instant6) {
            if (1023 != (i & 1023)) {
                j1.f(a.f173326a.getDescriptor(), i, 1023);
                throw null;
            }
            this.launchDate = instant;
            this.priceRange = gVar;
            this.companyDescription = str;
            this.filingDate = instant2;
            this.priceRangeIssueDate = instant3;
            this.finalPriceDate = instant4;
            this.fundraisingTotal = aVar;
            this.officialValuation = aVar2;
            this.cancellationDeadline = instant5;
            this.requestStartDate = instant6;
        }

        public static final /* synthetic */ void k(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            ie0.j jVar = ie0.j.f160602a;
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, jVar, dVar.launchDate);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, g.a.f173356a, dVar.priceRange);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dVar.companyDescription);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, jVar, dVar.filingDate);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, jVar, dVar.priceRangeIssueDate);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, jVar, dVar.finalPriceDate);
            a.C1001a c1001a = a.C1001a.f176860a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, c1001a, dVar.fundraisingTotal);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, c1001a, dVar.officialValuation);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, jVar, dVar.cancellationDeadline);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, jVar, dVar.requestStartDate);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Instant getCancellationDeadline() {
            return this.cancellationDeadline;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCompanyDescription() {
            return this.companyDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Instant getFilingDate() {
            return this.filingDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Instant getFinalPriceDate() {
            return this.finalPriceDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getFundraisingTotal() {
            return this.fundraisingTotal;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.launchDate, dVar.launchDate) && Intrinsics.f(this.priceRange, dVar.priceRange) && Intrinsics.f(this.companyDescription, dVar.companyDescription) && Intrinsics.f(this.filingDate, dVar.filingDate) && Intrinsics.f(this.priceRangeIssueDate, dVar.priceRangeIssueDate) && Intrinsics.f(this.finalPriceDate, dVar.finalPriceDate) && Intrinsics.f(this.fundraisingTotal, dVar.fundraisingTotal) && Intrinsics.f(this.officialValuation, dVar.officialValuation) && Intrinsics.f(this.cancellationDeadline, dVar.cancellationDeadline) && Intrinsics.f(this.requestStartDate, dVar.requestStartDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Instant getLaunchDate() {
            return this.launchDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final jo3.a getOfficialValuation() {
            return this.officialValuation;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final jed.g getPriceRange() {
            return this.priceRange;
        }

        public final int hashCode() {
            int iC = p.a.c((this.priceRange.hashCode() + (this.launchDate.hashCode() * 31)) * 31, 31, this.companyDescription);
            Instant instant = this.filingDate;
            int iC2 = r6.b.c((iC + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.priceRangeIssueDate);
            Instant instant2 = this.finalPriceDate;
            int iHashCode = (iC2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            jo3.a aVar = this.fundraisingTotal;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.officialValuation;
            int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            Instant instant3 = this.cancellationDeadline;
            int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
            Instant instant4 = this.requestStartDate;
            return iHashCode4 + (instant4 != null ? instant4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Instant getPriceRangeIssueDate() {
            return this.priceRangeIssueDate;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Instant getRequestStartDate() {
            return this.requestStartDate;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Ljed/f$e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "returnOnEquityRfy", "returnOnAssetsRfy", "c", "returnOnInvestmentRfy", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("returnOnEquityRfy")
        private final Double returnOnEquityRfy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("returnOnAssetsRfy")
        private final Double returnOnAssetsRfy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("returnOnInvestmentRfy")
        private final Double returnOnInvestmentRfy;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173330a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173330a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.ManagementEffectivenessDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("returnOnEquityRfy", false);
                pluginGeneratedSerialDescriptor.j("returnOnAssetsRfy", false);
                pluginGeneratedSerialDescriptor.j("returnOnInvestmentRfy", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                x xVar = x.f247723a;
                return new KSerializer[]{nlm.a.c(xVar), nlm.a.c(xVar), nlm.a.c(xVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Double d = null;
                boolean z = true;
                int i = 0;
                Double d5 = null;
                Double d6 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, x.f247723a, d);
                        i |= 1;
                    } else if (iD == 1) {
                        d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, x.f247723a, d5);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        d6 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x.f247723a, d6);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, d, d5, d6);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                e value = (e) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                e.d(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173330a;
            }
        }

        public /* synthetic */ e(int i, Double d, Double d5, Double d6) {
            if (7 != (i & 7)) {
                j1.f(a.f173330a.getDescriptor(), i, 7);
                throw null;
            }
            this.returnOnEquityRfy = d;
            this.returnOnAssetsRfy = d5;
            this.returnOnInvestmentRfy = d6;
        }

        public static final /* synthetic */ void d(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            x xVar = x.f247723a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, xVar, eVar.returnOnEquityRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, xVar, eVar.returnOnAssetsRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, xVar, eVar.returnOnInvestmentRfy);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getReturnOnAssetsRfy() {
            return this.returnOnAssetsRfy;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getReturnOnEquityRfy() {
            return this.returnOnEquityRfy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getReturnOnInvestmentRfy() {
            return this.returnOnInvestmentRfy;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.returnOnEquityRfy, eVar.returnOnEquityRfy) && Intrinsics.f(this.returnOnAssetsRfy, eVar.returnOnAssetsRfy) && Intrinsics.f(this.returnOnInvestmentRfy, eVar.returnOnInvestmentRfy);
        }

        public final int hashCode() {
            Double d = this.returnOnEquityRfy;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.returnOnAssetsRfy;
            int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
            Double d6 = this.returnOnInvestmentRfy;
            return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: jed.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ljed/f$f;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "marketCap", "", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "sharesOutstanding", "sharesFloat", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C0986f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("marketCap")
        private final jo3.a marketCap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("sharesOutstanding")
        private final Long sharesOutstanding;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("sharesFloat")
        private final Long sharesFloat;

        /* JADX INFO: renamed from: jed.f$f$a */
        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173334a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173334a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.MarketCapDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("marketCap", false);
                pluginGeneratedSerialDescriptor.j("sharesOutstanding", false);
                pluginGeneratedSerialDescriptor.j("sharesFloat", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                KSerializer kSerializerC = nlm.a.c(a.C1001a.f176860a);
                t0 t0Var = t0.f247706a;
                return new KSerializer[]{kSerializerC, nlm.a.c(t0Var), nlm.a.c(t0Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                jo3.a aVar = null;
                boolean z = true;
                int i = 0;
                Long l2 = null;
                Long l3 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                        i |= 1;
                    } else if (iD == 1) {
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, l2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t0.f247706a, l3);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C0986f(i, aVar, l2, l3);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C0986f value = (C0986f) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                C0986f.d(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173334a;
            }
        }

        public /* synthetic */ C0986f(int i, jo3.a aVar, Long l2, Long l3) {
            if (7 != (i & 7)) {
                j1.f(a.f173334a.getDescriptor(), i, 7);
                throw null;
            }
            this.marketCap = aVar;
            this.sharesOutstanding = l2;
            this.sharesFloat = l3;
        }

        public static final /* synthetic */ void d(C0986f c0986f, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, c0986f.marketCap);
            t0 t0Var = t0.f247706a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, c0986f.sharesOutstanding);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, c0986f.sharesFloat);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getMarketCap() {
            return this.marketCap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getSharesFloat() {
            return this.sharesFloat;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getSharesOutstanding() {
            return this.sharesOutstanding;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0986f)) {
                return false;
            }
            C0986f c0986f = (C0986f) obj2;
            return Intrinsics.f(this.marketCap, c0986f.marketCap) && Intrinsics.f(this.sharesOutstanding, c0986f.sharesOutstanding) && Intrinsics.f(this.sharesFloat, c0986f.sharesFloat);
        }

        public final int hashCode() {
            jo3.a aVar = this.marketCap;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            Long l2 = this.sharesOutstanding;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.sharesFloat;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0013"}, d2 = {"Ljed/f$g;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "earningsPerShareRfy", "b", "e", "salesPerShareRfy", "c", "bookValuePerShareRfy", "cashFlowPerShareRfy", "cashPerShareRfy", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class g {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("earningsPerShareRfy")
        private final jo3.a earningsPerShareRfy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("salesPerShareRfy")
        private final jo3.a salesPerShareRfy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("bookValuePerShareRfy")
        private final jo3.a bookValuePerShareRfy;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("cashFlowPerShareRfy")
        private final jo3.a cashFlowPerShareRfy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("cashPerShareRfy")
        private final jo3.a cashPerShareRfy;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173338a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173338a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.PerShareDto", aVar, 5);
                pluginGeneratedSerialDescriptor.j("earningsPerShareRfy", false);
                pluginGeneratedSerialDescriptor.j("salesPerShareRfy", false);
                pluginGeneratedSerialDescriptor.j("bookValuePerShareRfy", false);
                pluginGeneratedSerialDescriptor.j("cashFlowPerShareRfy", false);
                pluginGeneratedSerialDescriptor.j("cashPerShareRfy", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                a.C1001a c1001a = a.C1001a.f176860a;
                return new KSerializer[]{nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                jo3.a aVar = null;
                jo3.a aVar2 = null;
                jo3.a aVar3 = null;
                jo3.a aVar4 = null;
                jo3.a aVar5 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                        i |= 1;
                    } else if (iD == 1) {
                        aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                        i |= 2;
                    } else if (iD == 2) {
                        aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar3);
                        i |= 4;
                    } else if (iD == 3) {
                        aVar4 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar4);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        aVar5 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar5);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new g(i, aVar, aVar2, aVar3, aVar4, aVar5);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                g value = (g) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                g.f(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173338a;
            }
        }

        public /* synthetic */ g(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4, jo3.a aVar5) {
            if (31 != (i & 31)) {
                j1.f(a.f173338a.getDescriptor(), i, 31);
                throw null;
            }
            this.earningsPerShareRfy = aVar;
            this.salesPerShareRfy = aVar2;
            this.bookValuePerShareRfy = aVar3;
            this.cashFlowPerShareRfy = aVar4;
            this.cashPerShareRfy = aVar5;
        }

        public static final /* synthetic */ void f(g gVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            a.C1001a c1001a = a.C1001a.f176860a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, c1001a, gVar.earningsPerShareRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, c1001a, gVar.salesPerShareRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, c1001a, gVar.bookValuePerShareRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, gVar.cashFlowPerShareRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, c1001a, gVar.cashPerShareRfy);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getBookValuePerShareRfy() {
            return this.bookValuePerShareRfy;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getCashFlowPerShareRfy() {
            return this.cashFlowPerShareRfy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getCashPerShareRfy() {
            return this.cashPerShareRfy;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getEarningsPerShareRfy() {
            return this.earningsPerShareRfy;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getSalesPerShareRfy() {
            return this.salesPerShareRfy;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.earningsPerShareRfy, gVar.earningsPerShareRfy) && Intrinsics.f(this.salesPerShareRfy, gVar.salesPerShareRfy) && Intrinsics.f(this.bookValuePerShareRfy, gVar.bookValuePerShareRfy) && Intrinsics.f(this.cashFlowPerShareRfy, gVar.cashFlowPerShareRfy) && Intrinsics.f(this.cashPerShareRfy, gVar.cashPerShareRfy);
        }

        public final int hashCode() {
            jo3.a aVar = this.earningsPerShareRfy;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jo3.a aVar2 = this.salesPerShareRfy;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.bookValuePerShareRfy;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            jo3.a aVar4 = this.cashFlowPerShareRfy;
            int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
            jo3.a aVar5 = this.cashPerShareRfy;
            return iHashCode4 + (aVar5 != null ? aVar5.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, d2 = {"Ljed/f$h;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "dailyOpenPrice", "Ljed/g;", "Ljed/g;", "c", "()Ljed/g;", "dayRange", "d", "fiftyTwoWeekRange", "e", "fiveYearRange", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "beta", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class h {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dailyOpenPrice")
        private final jo3.a dailyOpenPrice;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dayRange")
        private final jed.g dayRange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fiftyTwoWeekRange")
        private final jed.g fiftyTwoWeekRange;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("fiveYearRange")
        private final jed.g fiveYearRange;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("beta")
        private final Double beta;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173342a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173342a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.PriceDto", aVar, 5);
                pluginGeneratedSerialDescriptor.j("dailyOpenPrice", false);
                pluginGeneratedSerialDescriptor.j("dayRange", false);
                pluginGeneratedSerialDescriptor.j("fiftyTwoWeekRange", false);
                pluginGeneratedSerialDescriptor.j("fiveYearRange", false);
                pluginGeneratedSerialDescriptor.j("beta", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                KSerializer kSerializerC = nlm.a.c(a.C1001a.f176860a);
                g.a aVar = g.a.f173356a;
                return new KSerializer[]{kSerializerC, nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(x.f247723a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                jo3.a aVar = null;
                jed.g gVar = null;
                jed.g gVar2 = null;
                jed.g gVar3 = null;
                Double d = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                        i |= 1;
                    } else if (iD == 1) {
                        gVar = (jed.g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, g.a.f173356a, gVar);
                        i |= 2;
                    } else if (iD == 2) {
                        gVar2 = (jed.g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, g.a.f173356a, gVar2);
                        i |= 4;
                    } else if (iD == 3) {
                        gVar3 = (jed.g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, g.a.f173356a, gVar3);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, x.f247723a, d);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new h(i, aVar, gVar, gVar2, gVar3, d);
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
                h.f(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$h$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173342a;
            }
        }

        public /* synthetic */ h(int i, jo3.a aVar, jed.g gVar, jed.g gVar2, jed.g gVar3, Double d) {
            if (31 != (i & 31)) {
                j1.f(a.f173342a.getDescriptor(), i, 31);
                throw null;
            }
            this.dailyOpenPrice = aVar;
            this.dayRange = gVar;
            this.fiftyTwoWeekRange = gVar2;
            this.fiveYearRange = gVar3;
            this.beta = d;
        }

        public static final /* synthetic */ void f(h hVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, hVar.dailyOpenPrice);
            g.a aVar = g.a.f173356a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, aVar, hVar.dayRange);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, aVar, hVar.fiftyTwoWeekRange);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, aVar, hVar.fiveYearRange);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, x.f247723a, hVar.beta);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getBeta() {
            return this.beta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getDailyOpenPrice() {
            return this.dailyOpenPrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jed.g getDayRange() {
            return this.dayRange;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jed.g getFiftyTwoWeekRange() {
            return this.fiftyTwoWeekRange;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jed.g getFiveYearRange() {
            return this.fiveYearRange;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.dailyOpenPrice, hVar.dailyOpenPrice) && Intrinsics.f(this.dayRange, hVar.dayRange) && Intrinsics.f(this.fiftyTwoWeekRange, hVar.fiftyTwoWeekRange) && Intrinsics.f(this.fiveYearRange, hVar.fiveYearRange) && Intrinsics.f(this.beta, hVar.beta);
        }

        public final int hashCode() {
            jo3.a aVar = this.dailyOpenPrice;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jed.g gVar = this.dayRange;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            jed.g gVar2 = this.fiftyTwoWeekRange;
            int iHashCode3 = (iHashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
            jed.g gVar3 = this.fiveYearRange;
            int iHashCode4 = (iHashCode3 + (gVar3 == null ? 0 : gVar3.hashCode())) * 31;
            Double d = this.beta;
            return iHashCode4 + (d != null ? d.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u000f"}, d2 = {"Ljed/f$i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "grossMarginRfy", "b", "c", "operatingMarginRfy", "netProfitMarginRfy", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class i {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("grossMarginRfy")
        private final Double grossMarginRfy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("operatingMarginRfy")
        private final Double operatingMarginRfy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("netProfitMarginRfy")
        private final Double netProfitMarginRfy;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173346a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173346a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.ProfitabilityDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("grossMarginRfy", false);
                pluginGeneratedSerialDescriptor.j("operatingMarginRfy", false);
                pluginGeneratedSerialDescriptor.j("netProfitMarginRfy", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                x xVar = x.f247723a;
                return new KSerializer[]{nlm.a.c(xVar), nlm.a.c(xVar), nlm.a.c(xVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Double d = null;
                boolean z = true;
                int i = 0;
                Double d5 = null;
                Double d6 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, x.f247723a, d);
                        i |= 1;
                    } else if (iD == 1) {
                        d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, x.f247723a, d5);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        d6 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x.f247723a, d6);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new i(i, d, d5, d6);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                i value = (i) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                i.d(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$i$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173346a;
            }
        }

        public /* synthetic */ i(int i, Double d, Double d5, Double d6) {
            if (7 != (i & 7)) {
                j1.f(a.f173346a.getDescriptor(), i, 7);
                throw null;
            }
            this.grossMarginRfy = d;
            this.operatingMarginRfy = d5;
            this.netProfitMarginRfy = d6;
        }

        public static final /* synthetic */ void d(i iVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            x xVar = x.f247723a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, xVar, iVar.grossMarginRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, xVar, iVar.operatingMarginRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, xVar, iVar.netProfitMarginRfy);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getGrossMarginRfy() {
            return this.grossMarginRfy;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getNetProfitMarginRfy() {
            return this.netProfitMarginRfy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getOperatingMarginRfy() {
            return this.operatingMarginRfy;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.grossMarginRfy, iVar.grossMarginRfy) && Intrinsics.f(this.operatingMarginRfy, iVar.operatingMarginRfy) && Intrinsics.f(this.netProfitMarginRfy, iVar.netProfitMarginRfy);
        }

        public final int hashCode() {
            Double d = this.grossMarginRfy;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.operatingMarginRfy;
            int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
            Double d6 = this.netProfitMarginRfy;
            return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Ljed/f$j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "priceToEarningsRatioRfy", "b", "d", "priceToSalesRatioRfy", "priceToBookRatioRfy", "priceToCashFlowRatioRfy", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("priceToEarningsRatioRfy")
        private final Double priceToEarningsRatioRfy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("priceToSalesRatioRfy")
        private final Double priceToSalesRatioRfy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("priceToBookRatioRfy")
        private final Double priceToBookRatioRfy;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("priceToCashFlowRatioRfy")
        private final Double priceToCashFlowRatioRfy;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173350a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173350a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.ValuationDto", aVar, 4);
                pluginGeneratedSerialDescriptor.j("priceToEarningsRatioRfy", false);
                pluginGeneratedSerialDescriptor.j("priceToSalesRatioRfy", false);
                pluginGeneratedSerialDescriptor.j("priceToBookRatioRfy", false);
                pluginGeneratedSerialDescriptor.j("priceToCashFlowRatioRfy", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                x xVar = x.f247723a;
                return new KSerializer[]{nlm.a.c(xVar), nlm.a.c(xVar), nlm.a.c(xVar), nlm.a.c(xVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                Double d = null;
                Double d5 = null;
                Double d6 = null;
                Double d10 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, x.f247723a, d);
                        i |= 1;
                    } else if (iD == 1) {
                        d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, x.f247723a, d5);
                        i |= 2;
                    } else if (iD == 2) {
                        d6 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x.f247723a, d6);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        d10 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, x.f247723a, d10);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new j(i, d, d5, d6, d10);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                j value = (j) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                j.e(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$j$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173350a;
            }
        }

        public /* synthetic */ j(int i, Double d, Double d5, Double d6, Double d10) {
            if (15 != (i & 15)) {
                j1.f(a.f173350a.getDescriptor(), i, 15);
                throw null;
            }
            this.priceToEarningsRatioRfy = d;
            this.priceToSalesRatioRfy = d5;
            this.priceToBookRatioRfy = d6;
            this.priceToCashFlowRatioRfy = d10;
        }

        public static final /* synthetic */ void e(j jVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            x xVar = x.f247723a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, xVar, jVar.priceToEarningsRatioRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, xVar, jVar.priceToSalesRatioRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, xVar, jVar.priceToBookRatioRfy);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, xVar, jVar.priceToCashFlowRatioRfy);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getPriceToBookRatioRfy() {
            return this.priceToBookRatioRfy;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getPriceToCashFlowRatioRfy() {
            return this.priceToCashFlowRatioRfy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getPriceToEarningsRatioRfy() {
            return this.priceToEarningsRatioRfy;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getPriceToSalesRatioRfy() {
            return this.priceToSalesRatioRfy;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.priceToEarningsRatioRfy, jVar.priceToEarningsRatioRfy) && Intrinsics.f(this.priceToSalesRatioRfy, jVar.priceToSalesRatioRfy) && Intrinsics.f(this.priceToBookRatioRfy, jVar.priceToBookRatioRfy) && Intrinsics.f(this.priceToCashFlowRatioRfy, jVar.priceToCashFlowRatioRfy);
        }

        public final int hashCode() {
            Double d = this.priceToEarningsRatioRfy;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.priceToSalesRatioRfy;
            int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
            Double d6 = this.priceToBookRatioRfy;
            int iHashCode3 = (iHashCode2 + (d6 == null ? 0 : d6.hashCode())) * 31;
            Double d10 = this.priceToCashFlowRatioRfy;
            return iHashCode3 + (d10 != null ? d10.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Ljed/f$k;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "dayVolume", "average3MonthVolume", "Companion", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class k {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dayVolume")
        private final Integer dayVolume;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("average3MonthVolume")
        private final Integer average3MonthVolume;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f173353a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f173353a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.stats.InstrumentStatsDto.VolumeDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("dayVolume", false);
                pluginGeneratedSerialDescriptor.j("average3MonthVolume", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                n0 n0Var = n0.f247680a;
                return new KSerializer[]{nlm.a.c(n0Var), nlm.a.c(n0Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Integer num = null;
                boolean z = true;
                int i = 0;
                Integer num2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, num);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, n0.f247680a, num2);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new k(i, num, num2);
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
                k.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: jed.f$k$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f173353a;
            }
        }

        public /* synthetic */ k(int i, Integer num, Integer num2) {
            if (3 != (i & 3)) {
                j1.f(a.f173353a.getDescriptor(), i, 3);
                throw null;
            }
            this.dayVolume = num;
            this.average3MonthVolume = num2;
        }

        public static final /* synthetic */ void c(k kVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            n0 n0Var = n0.f247680a;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, n0Var, kVar.dayVolume);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, n0Var, kVar.average3MonthVolume);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getAverage3MonthVolume() {
            return this.average3MonthVolume;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getDayVolume() {
            return this.dayVolume;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.dayVolume, kVar.dayVolume) && Intrinsics.f(this.average3MonthVolume, kVar.average3MonthVolume);
        }

        public final int hashCode() {
            Integer num = this.dayVolume;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.average3MonthVolume;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }
    }

    public /* synthetic */ f(int i2, h hVar, k kVar, C0986f c0986f, g gVar, c cVar, j jVar, i iVar, e eVar, d dVar) {
        if (511 != (i2 & 511)) {
            j1.f(a.f173315a.getDescriptor(), i2, 511);
            throw null;
        }
        this.price = hVar;
        this.volume = kVar;
        this.marketCap = c0986f;
        this.perShare = gVar;
        this.dividend = cVar;
        this.valuation = jVar;
        this.profitability = iVar;
        this.managementEffectiveness = eVar;
        this.listingData = dVar;
    }

    public static final /* synthetic */ void j(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, h.a.f173342a, fVar.price);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, k.a.f173353a, fVar.volume);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, C0986f.a.f173334a, fVar.marketCap);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, g.a.f173338a, fVar.perShare);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, c.a.f173319a, fVar.dividend);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, j.a.f173350a, fVar.valuation);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, i.a.f173346a, fVar.profitability);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, e.a.f173330a, fVar.managementEffectiveness);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, d.a.f173326a, fVar.listingData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDividend() {
        return this.dividend;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getListingData() {
        return this.listingData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getManagementEffectiveness() {
        return this.managementEffectiveness;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C0986f getMarketCap() {
        return this.marketCap;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getPerShare() {
        return this.perShare;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.price, fVar.price) && Intrinsics.f(this.volume, fVar.volume) && Intrinsics.f(this.marketCap, fVar.marketCap) && Intrinsics.f(this.perShare, fVar.perShare) && Intrinsics.f(this.dividend, fVar.dividend) && Intrinsics.f(this.valuation, fVar.valuation) && Intrinsics.f(this.profitability, fVar.profitability) && Intrinsics.f(this.managementEffectiveness, fVar.managementEffectiveness) && Intrinsics.f(this.listingData, fVar.listingData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getProfitability() {
        return this.profitability;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final j getValuation() {
        return this.valuation;
    }

    public final int hashCode() {
        int iHashCode = (this.managementEffectiveness.hashCode() + ((this.profitability.hashCode() + ((this.valuation.hashCode() + ((this.dividend.hashCode() + ((this.perShare.hashCode() + ((this.marketCap.hashCode() + ((this.volume.hashCode() + (this.price.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        d dVar = this.listingData;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k getVolume() {
        return this.volume;
    }
}

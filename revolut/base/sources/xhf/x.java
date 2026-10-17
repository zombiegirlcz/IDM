package xhf;

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
import xhf.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u001e"}, d2 = {"Lxhf/x;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "fxFee", "b", "atmFee", "c", "blikAtmFee", "d", "i", "transferFee", "e", "cashAdvance", "Lxhf/w;", "Lxhf/w;", "g", "()Lxhf/w;", "fxRareCurrencyFee", "h", "fxWeekend", "cryptoFee", "acquiring", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class x {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fx")
    private final Long fxFee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("atm")
    private final Long atmFee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("blikAtm")
    private final Long blikAtmFee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transfer")
    private final Long transferFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashAdvance")
    private final Long cashAdvance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fxRareCurrency")
    private final w fxRareCurrencyFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxWeekend")
    private final w fxWeekend;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("crypto")
    private final w cryptoFee;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("acquiring")
    private final Long acquiring;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306208a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306208a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.FeesBreakdownDto", aVar, 9);
            pluginGeneratedSerialDescriptor.j("fxFee", false);
            pluginGeneratedSerialDescriptor.j("atmFee", false);
            pluginGeneratedSerialDescriptor.j("blikAtmFee", false);
            pluginGeneratedSerialDescriptor.j("transferFee", false);
            pluginGeneratedSerialDescriptor.j("cashAdvance", false);
            pluginGeneratedSerialDescriptor.j("fxRareCurrencyFee", false);
            pluginGeneratedSerialDescriptor.j("fxWeekend", false);
            pluginGeneratedSerialDescriptor.j("cryptoFee", false);
            pluginGeneratedSerialDescriptor.j("acquiring", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.t0 t0Var = qlm.t0.f247706a;
            KSerializer kSerializerC = nlm.a.c(t0Var);
            KSerializer kSerializerC2 = nlm.a.c(t0Var);
            KSerializer kSerializerC3 = nlm.a.c(t0Var);
            KSerializer kSerializerC4 = nlm.a.c(t0Var);
            KSerializer kSerializerC5 = nlm.a.c(t0Var);
            w.a aVar = w.a.f306197a;
            return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(t0Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Long l2 = null;
            Long l3 = null;
            Long l4 = null;
            Long l5 = null;
            Long l22 = null;
            w wVar = null;
            w wVar2 = null;
            w wVar3 = null;
            Long l31 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.t0.f247706a, l2);
                        i |= 1;
                        break;
                    case 1:
                        l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, l3);
                        i |= 2;
                        break;
                    case 2:
                        l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l4);
                        i |= 4;
                        break;
                    case 3:
                        l5 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l5);
                        i |= 8;
                        break;
                    case 4:
                        l22 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.t0.f247706a, l22);
                        i |= 16;
                        break;
                    case 5:
                        wVar = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, w.a.f306197a, wVar);
                        i |= 32;
                        break;
                    case 6:
                        wVar2 = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, w.a.f306197a, wVar2);
                        i |= 64;
                        break;
                    case 7:
                        wVar3 = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, w.a.f306197a, wVar3);
                        i |= 128;
                        break;
                    case 8:
                        l31 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.t0.f247706a, l31);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new x(i, l2, l3, l4, l5, l22, wVar, wVar2, wVar3, l31);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            x value = (x) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            x.j(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.x$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306208a;
        }
    }

    public /* synthetic */ x(int i, Long l2, Long l3, Long l4, Long l5, Long l22, w wVar, w wVar2, w wVar3, Long l31) {
        if (511 != (i & 511)) {
            qlm.j1.f(a.f306208a.getDescriptor(), i, 511);
            throw null;
        }
        this.fxFee = l2;
        this.atmFee = l3;
        this.blikAtmFee = l4;
        this.transferFee = l5;
        this.cashAdvance = l22;
        this.fxRareCurrencyFee = wVar;
        this.fxWeekend = wVar2;
        this.cryptoFee = wVar3;
        this.acquiring = l31;
    }

    public static final /* synthetic */ void j(x xVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, t0Var, xVar.fxFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, xVar.atmFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, xVar.blikAtmFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, xVar.transferFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, xVar.cashAdvance);
        w.a aVar = w.a.f306197a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, aVar, xVar.fxRareCurrencyFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, aVar, xVar.fxWeekend);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, aVar, xVar.cryptoFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, t0Var, xVar.acquiring);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAcquiring() {
        return this.acquiring;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAtmFee() {
        return this.atmFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getBlikAtmFee() {
        return this.blikAtmFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getCashAdvance() {
        return this.cashAdvance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w getCryptoFee() {
        return this.cryptoFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.fxFee, xVar.fxFee) && Intrinsics.f(this.atmFee, xVar.atmFee) && Intrinsics.f(this.blikAtmFee, xVar.blikAtmFee) && Intrinsics.f(this.transferFee, xVar.transferFee) && Intrinsics.f(this.cashAdvance, xVar.cashAdvance) && Intrinsics.f(this.fxRareCurrencyFee, xVar.fxRareCurrencyFee) && Intrinsics.f(this.fxWeekend, xVar.fxWeekend) && Intrinsics.f(this.cryptoFee, xVar.cryptoFee) && Intrinsics.f(this.acquiring, xVar.acquiring);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getFxFee() {
        return this.fxFee;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final w getFxRareCurrencyFee() {
        return this.fxRareCurrencyFee;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final w getFxWeekend() {
        return this.fxWeekend;
    }

    public final int hashCode() {
        Long l2 = this.fxFee;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.atmFee;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.blikAtmFee;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.transferFee;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.cashAdvance;
        int iHashCode5 = (iHashCode4 + (l22 == null ? 0 : l22.hashCode())) * 31;
        w wVar = this.fxRareCurrencyFee;
        int iHashCode6 = (iHashCode5 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        w wVar2 = this.fxWeekend;
        int iHashCode7 = (iHashCode6 + (wVar2 == null ? 0 : wVar2.hashCode())) * 31;
        w wVar3 = this.cryptoFee;
        int iHashCode8 = (iHashCode7 + (wVar3 == null ? 0 : wVar3.hashCode())) * 31;
        Long l31 = this.acquiring;
        return iHashCode8 + (l31 != null ? l31.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getTransferFee() {
        return this.transferFee;
    }
}

package n76;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f213001a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f213001a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.derivatives.data.impl.data.entity.DerivativesBalanceEntity", aVar, 15);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("collateralPocketId", false);
        pluginGeneratedSerialDescriptor.j("totalCollateralBalance", false);
        pluginGeneratedSerialDescriptor.j("portfolioCollateralBalance", false);
        pluginGeneratedSerialDescriptor.j("totalEquity", false);
        pluginGeneratedSerialDescriptor.j("portfolioEquity", false);
        pluginGeneratedSerialDescriptor.j("portfolioMaintenanceMargin", false);
        pluginGeneratedSerialDescriptor.j("portfolioMarginBalance", false);
        pluginGeneratedSerialDescriptor.j("portfolioLockedMargin", false);
        pluginGeneratedSerialDescriptor.j("totalUnrealizedPnl", false);
        pluginGeneratedSerialDescriptor.j("portfolioUnrealizedPnl", false);
        pluginGeneratedSerialDescriptor.j("portfolioAvailableToTrade", false);
        pluginGeneratedSerialDescriptor.j("portfolioAvailableToWithdraw", false);
        pluginGeneratedSerialDescriptor.j("priceTolerance", false);
        pluginGeneratedSerialDescriptor.j("priceToleranceLevel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        String str2 = null;
        String strDecodeStringElement = null;
        String str3 = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        String strDecodeStringElement9 = null;
        String strDecodeStringElement10 = null;
        String strDecodeStringElement11 = null;
        String strDecodeStringElement12 = null;
        int i = 0;
        boolean z3 = true;
        while (z3) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = z3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str3);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    strDecodeStringElement10 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                case 11:
                    strDecodeStringElement11 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                    i |= 2048;
                    continue;
                case 12:
                    strDecodeStringElement12 = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
                    i |= 4096;
                    continue;
                case 13:
                    z = z3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, v1.f247718a, str);
                    i |= 8192;
                    break;
                case 14:
                    z = z3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str2);
                    i |= 16384;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            z3 = z;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, str3, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, strDecodeStringElement8, strDecodeStringElement9, strDecodeStringElement10, strDecodeStringElement11, strDecodeStringElement12, str, str2);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f213002a);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f213003b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f213004c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f213005g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f213006h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.f213007j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.f213008l);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.f213009m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, value.f213010n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

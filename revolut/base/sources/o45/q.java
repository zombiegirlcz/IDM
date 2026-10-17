package o45;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f222093a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f222093a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.loan.impl.database.entity.LoanDetailsShardEntity.LoanRepaymentConfigDescriptor", qVar, 11);
        pluginGeneratedSerialDescriptor.j("initialAmount", false);
        pluginGeneratedSerialDescriptor.j("minAmount", false);
        pluginGeneratedSerialDescriptor.j("maxAmount", false);
        pluginGeneratedSerialDescriptor.j("partialRepaymentTypes", false);
        pluginGeneratedSerialDescriptor.j("allowedPocketTypes", false);
        pluginGeneratedSerialDescriptor.j("requiresSameCurrency", false);
        pluginGeneratedSerialDescriptor.j("allowsJointAccountPockets", false);
        pluginGeneratedSerialDescriptor.j("zeroBreakageFeeAmount", false);
        pluginGeneratedSerialDescriptor.j("strategySelectionThreshold", false);
        pluginGeneratedSerialDescriptor.j("suggestions", false);
        pluginGeneratedSerialDescriptor.j("excludedAmountRanges", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = s.f222097l;
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[3].getValue());
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[4].getValue());
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{kSerializerC, t0Var, t0Var, kSerializerC2, kSerializerC3, nlm.a.c(hVar), nlm.a.c(hVar), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c((KSerializer) lazyArr[10].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = s.f222097l;
        dVarBeginStructure.getClass();
        List list = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        int i = 0;
        boolean z = true;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.t0.f247706a, l4);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, bool);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.h.f247648a, bool2);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.t0.f247706a, l2);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.t0.f247706a, l3);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list2);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), list3);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, l4, jDecodeLongElement, jDecodeLongElement2, list4, list, bool, bool2, l2, l3, list2, list3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s value = (s) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = s.f222097l;
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, t0Var, value.f222098a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f222099b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f222100c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, hVar, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, hVar, value.f222101g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, t0Var, value.f222102h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, t0Var, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f222103j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

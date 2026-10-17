package t7h;

import java.math.BigDecimal;
import jo3.a;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f268694a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f268694a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.impl.data.network.margin_borrowing.dto.WealthMarginBorrowingInterestDto", aVar, 4);
        pluginGeneratedSerialDescriptor.j("yearlyInterestRate", false);
        pluginGeneratedSerialDescriptor.j("overnightFee", false);
        pluginGeneratedSerialDescriptor.j("monthlyAccruedFees", false);
        pluginGeneratedSerialDescriptor.j("nextPaymentDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(v1.f247718a);
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{ie0.a.f160587a, c1001a, c1001a, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        BigDecimal bigDecimal = null;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, bigDecimal);
                i |= 1;
            } else if (iD == 1) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                i |= 2;
            } else if (iD == 2) {
                aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, bigDecimal, aVar, aVar2, str);
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
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, value.f268695a);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f268696b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c1001a, value.f268697c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

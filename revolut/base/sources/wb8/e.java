package wb8;

import ie0.m;
import ie0.o;
import java.time.Instant;
import java.time.LocalDate;
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
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f296049a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f296049a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_allowance.impl.models.AllowanceRecurringPaymentDto", eVar, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", false);
        pluginGeneratedSerialDescriptor.j("period", false);
        pluginGeneratedSerialDescriptor.j("startDate", false);
        pluginGeneratedSerialDescriptor.j("nextDate", false);
        pluginGeneratedSerialDescriptor.j("originator", false);
        pluginGeneratedSerialDescriptor.j("beneficiary", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("failureReason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g.f296050l;
        ie0.j jVar = ie0.j.f160602a;
        m mVar = m.f160609a;
        return new KSerializer[]{v1.f247718a, lazyArr[1].getValue(), jVar, jVar, nlm.a.c((KSerializer) lazyArr[4].getValue()), mVar, mVar, h.f296057a, b.f296047a, o.f160615a, nlm.a.c((KSerializer) lazyArr[10].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = g.f296050l;
        dVarBeginStructure.getClass();
        d dVar = null;
        dj0.d dVar2 = null;
        a aVar = null;
        String strDecodeStringElement = null;
        l lVar = null;
        Instant instant = null;
        Instant instant2 = null;
        k kVar = null;
        LocalDate localDate = null;
        LocalDate localDate2 = null;
        j jVar = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    lVar = (l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), lVar);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.j.f160602a, instant);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, ie0.j.f160602a, instant2);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), kVar);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, m.f160609a, localDate);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    localDate2 = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, m.f160609a, localDate2);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, h.f296057a, jVar);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, b.f296047a, dVar);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, o.f160615a, dVar2);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    aVar = (a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), aVar);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g(i, strDecodeStringElement, lVar, instant, instant2, kVar, localDate, localDate2, jVar, dVar, dVar2, aVar);
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
        Lazy[] lazyArr = g.f296050l;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f296051a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f296052b);
        ie0.j jVar = ie0.j.f160602a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, jVar, value.f296053c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, jVar, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        m mVar = m.f160609a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, mVar, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, mVar, value.f296054g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, h.f296057a, value.f296055h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, b.f296047a, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, o.f160615a, value.f296056j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

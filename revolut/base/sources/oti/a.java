package oti;

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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f229594a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f229594a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftAirportCipDto", aVar, 7);
        pluginGeneratedSerialDescriptor.j("airportIataCode", false);
        pluginGeneratedSerialDescriptor.j("cipName", false);
        pluginGeneratedSerialDescriptor.j("airportDescription", false);
        pluginGeneratedSerialDescriptor.j("cityName", false);
        pluginGeneratedSerialDescriptor.j("countryCode", false);
        pluginGeneratedSerialDescriptor.j("airportTimeZone", false);
        pluginGeneratedSerialDescriptor.j("terminals", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.f229616h;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, lazyArr[6].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f229616h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, list);
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
        Lazy[] lazyArr = c.f229616h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f229617a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f229618b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f229619c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f229620g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

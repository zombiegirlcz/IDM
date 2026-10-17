package gbh;

import ie0.j;
import java.time.Instant;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f142259a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f142259a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.utils.NextPageTokenResolver.NextPageToken", aVar, 2);
        pluginGeneratedSerialDescriptor.j("to", false);
        pluginGeneratedSerialDescriptor.j("from", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        j jVar = j.f160602a;
        return new KSerializer[]{jVar, jVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Instant instant = null;
        boolean z = true;
        int i = 0;
        Instant instant2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, j.f160602a, instant);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, j.f160602a, instant2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, instant, instant2);
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
        j jVar = j.f160602a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, jVar, value.f142260a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, jVar, value.f142261b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package w19;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
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
public final /* synthetic */ class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f293802a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f293802a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.core.api.model.onboarding.LifestyleOnboardingInfo.Item", cVar, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("icon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, RevPointsTextWithLinks.a.f84053a, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        RevPointsTextWithLinks revPointsTextWithLinks = null;
        String strDecodeStringElement3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                revPointsTextWithLinks = (RevPointsTextWithLinks) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, RevPointsTextWithLinks.a.f84053a, revPointsTextWithLinks);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e(i, strDecodeStringElement, strDecodeStringElement2, revPointsTextWithLinks, strDecodeStringElement3);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f293803a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f293804b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, RevPointsTextWithLinks.a.f84053a, value.f293805c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

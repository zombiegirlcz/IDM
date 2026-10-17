package akd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5788a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f5788a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.SlotPromoBanner.Content", hVar, 6);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("media", false);
        pluginGeneratedSerialDescriptor.j("closeable", false);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = j.f5789g;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, qlm.h.f247648a, n.f5797a, lazyArr[4].getValue(), d.f5785a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j.f5789g;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        q qVar = null;
        List list = null;
        f fVar = null;
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
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, n.f5797a, qVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, d.f5785a, fVar);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, qVar, list, fVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    @Override // mlm.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r7, java.lang.Object r8) {
        /*
            r6 = this;
            akd.j r8 = (akd.j) r8
            java.lang.String r0 = "encoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = akd.h.descriptor
            kotlinx.serialization.encoding.CompositeEncoder r7 = r7.beginStructure(r0)
            kotlin.Lazy[] r1 = akd.j.f5789g
            java.lang.String r2 = r8.f5790a
            akd.f r3 = r8.f
            java.util.List r4 = r8.e
            r5 = 0
            r7.encodeStringElement(r0, r5, r2)
            r2 = 1
            java.lang.String r5 = r8.f5791b
            r7.encodeStringElement(r0, r2, r5)
            r2 = 2
            boolean r5 = r8.f5792c
            r7.encodeBooleanElement(r0, r2, r5)
            akd.n r2 = akd.n.f5797a
            akd.q r8 = r8.d
            r5 = 3
            r7.encodeSerializableElement(r0, r5, r2, r8)
            boolean r8 = r7.d(r0)
            if (r8 == 0) goto L39
            goto L41
        L39:
            zhm.f0 r8 = zhm.f0.f322471a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r4, r8)
            if (r8 != 0) goto L4d
        L41:
            r8 = 4
            r1 = r1[r8]
            java.lang.Object r1 = r1.getValue()
            mlm.h r1 = (mlm.h) r1
            r7.encodeSerializableElement(r0, r8, r1, r4)
        L4d:
            boolean r8 = r7.d(r0)
            if (r8 == 0) goto L54
            goto L62
        L54:
            java.lang.Object r8 = zhm.d0.d0(r4)
            akd.f r8 = (akd.f) r8
            if (r8 == 0) goto L6c
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r3, r8)
            if (r8 != 0) goto L68
        L62:
            akd.d r8 = akd.d.f5785a
            r1 = 5
            r7.encodeSerializableElement(r0, r1, r8, r3)
        L68:
            r7.endStructure(r0)
            return
        L6c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Promo banner must have at least one button"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: akd.h.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}

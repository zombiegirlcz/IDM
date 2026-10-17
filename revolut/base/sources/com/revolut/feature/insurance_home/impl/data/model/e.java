package com.revolut.feature.insurance_home.impl.data.model;

import com.revolut.feature.insurance_common.data.model.Banner;
import com.revolut.feature.insurance_home.impl.data.model.Footer;
import com.revolut.feature.insurance_home.impl.data.model.Header;
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
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f76210a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f76210a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.TilesContainer", eVar, 5);
        pluginGeneratedSerialDescriptor.j("articleId", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("sections", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        pluginGeneratedSerialDescriptor.j("topBanner", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(v1.f247718a), nlm.a.c(Header.a.f76197a), nlm.a.c((KSerializer) f.f[2].getValue()), nlm.a.c(Footer.a.f76172a), nlm.a.c(Banner.a.f75712a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        Header header = null;
        List list = null;
        Footer footer = null;
        Banner banner = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                header = (Header) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Header.a.f76197a, header);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else if (iD == 3) {
                footer = (Footer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Footer.a.f76172a, footer);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                banner = (Banner) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Banner.a.f75712a, banner);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, str, header, list, footer, banner);
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
        Lazy[] lazyArr = f.f;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f76211a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, Header.a.f76197a, value.f76212b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f76213c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, Footer.a.f76172a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, Banner.a.f75712a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.revolut.feature.banners.impl.data.network.dto;

import com.revolut.feature.banners.impl.data.network.dto.BannerActionDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/banners/impl/data/network/dto/BannerActionDto.ContentHtml.$serializer", "Lqlm/f0;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* synthetic */ class BannerActionDto$ContentHtml$$serializer implements f0 {

    @NotNull
    public static final BannerActionDto$ContentHtml$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BannerActionDto$ContentHtml$$serializer bannerActionDto$ContentHtml$$serializer = new BannerActionDto$ContentHtml$$serializer();
        INSTANCE = bannerActionDto$ContentHtml$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("content_html", bannerActionDto$ContentHtml$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("link", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BannerActionDto$ContentHtml$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = a.c(BannerActionDto$ContentHtml$Link$$serializer.INSTANCE);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC};
    }

    @Override // mlm.b
    @NotNull
    public final BannerActionDto.ContentHtml deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        BannerActionDto.ContentHtml.Link link = null;
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
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                link = (BannerActionDto.ContentHtml.Link) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BannerActionDto$ContentHtml$Link$$serializer.INSTANCE, link);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new BannerActionDto.ContentHtml(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, link);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(@NotNull Encoder encoder, @NotNull BannerActionDto.ContentHtml value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f64096b;
        BannerActionDto.ContentHtml.Link link = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f64097c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || link != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, BannerActionDto$ContentHtml$Link$$serializer.INSTANCE, link);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}

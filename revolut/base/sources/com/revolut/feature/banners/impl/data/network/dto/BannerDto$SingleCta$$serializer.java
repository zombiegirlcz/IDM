package com.revolut.feature.banners.impl.data.network.dto;

import com.revolut.feature.banners.impl.data.network.dto.BannerDto;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.b;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/banners/impl/data/network/dto/BannerDto.SingleCta.$serializer", "Lqlm/f0;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* synthetic */ class BannerDto$SingleCta$$serializer implements f0 {

    @NotNull
    public static final BannerDto$SingleCta$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BannerDto$SingleCta$$serializer bannerDto$SingleCta$$serializer = new BannerDto$SingleCta$$serializer();
        INSTANCE = bannerDto$SingleCta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("single_cta", bannerDto$SingleCta$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("closeable", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BannerDto$SingleCta$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BannerDto.SingleCta.i;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, n0.f247680a, a.c(v1Var), v1Var, a.c(v1Var), h.f247648a, lazyArr[6].getValue()};
    }

    @Override // mlm.b
    @NotNull
    public final BannerDto.SingleCta deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BannerDto.SingleCta.i;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        String str = null;
        String strDecodeStringElement2 = null;
        String str2 = null;
        BannerActionDto bannerActionDto = null;
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
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    bannerActionDto = (BannerActionDto) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (b) lazyArr[6].getValue(), bannerActionDto);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new BannerDto.SingleCta(i, strDecodeStringElement, iDecodeIntElement, str, strDecodeStringElement2, str2, zDecodeBooleanElement, bannerActionDto);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(@NotNull Encoder encoder, @NotNull BannerDto.SingleCta value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BannerDto.SingleCta.i;
        String str = value.f64106b;
        String str2 = value.f;
        String str3 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f64107c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f64108g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f64109h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}

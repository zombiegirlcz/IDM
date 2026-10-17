package com.revolut.feature.banners.impl.data.database.entity;

import com.revolut.feature.banners.impl.data.database.entity.BannerActionEmbeddedEntity;
import kotlin.Metadata;
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
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity.ContentHtml.Link.$serializer", "Lqlm/f0;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Link;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Link;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Link;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* synthetic */ class BannerActionEmbeddedEntity$ContentHtml$Link$$serializer implements f0 {

    @NotNull
    public static final BannerActionEmbeddedEntity$ContentHtml$Link$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BannerActionEmbeddedEntity$ContentHtml$Link$$serializer bannerActionEmbeddedEntity$ContentHtml$Link$$serializer = new BannerActionEmbeddedEntity$ContentHtml$Link$$serializer();
        INSTANCE = bannerActionEmbeddedEntity$ContentHtml$Link$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.banners.impl.data.database.entity.BannerActionEmbeddedEntity.ContentHtml.Link", bannerActionEmbeddedEntity$ContentHtml$Link$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("uri", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BannerActionEmbeddedEntity$ContentHtml$Link$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var};
    }

    @Override // mlm.b
    @NotNull
    public final BannerActionEmbeddedEntity.ContentHtml.Link deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        String strDecodeStringElement2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new BannerActionEmbeddedEntity.ContentHtml.Link(i, strDecodeStringElement, strDecodeStringElement2);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(@NotNull Encoder encoder, @NotNull BannerActionEmbeddedEntity.ContentHtml.Link value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f64091a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f64092b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // qlm.f0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}

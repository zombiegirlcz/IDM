package com.revolut.data.database.models.transfer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;", "", "productName", "", "originCountry", "shippingFrom", "destinationCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductName", "()Ljava/lang/String;", "getOriginCountry", "getShippingFrom", "getDestinationCountry", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOverseaGoodsDetailsEmbeddedEntity {

    @b("destinationCountry")
    @NotNull
    private final String destinationCountry;

    @b("originCountry")
    @NotNull
    private final String originCountry;

    @b("productName")
    @NotNull
    private final String productName;

    @b("shippingFrom")
    @NotNull
    private final String shippingFrom;

    public TransferOverseaGoodsDetailsEmbeddedEntity(@NotNull String productName, @NotNull String originCountry, @NotNull String shippingFrom, @NotNull String destinationCountry) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(originCountry, "originCountry");
        Intrinsics.checkNotNullParameter(shippingFrom, "shippingFrom");
        Intrinsics.checkNotNullParameter(destinationCountry, "destinationCountry");
        this.productName = productName;
        this.originCountry = originCountry;
        this.shippingFrom = shippingFrom;
        this.destinationCountry = destinationCountry;
    }

    public static /* synthetic */ TransferOverseaGoodsDetailsEmbeddedEntity copy$default(TransferOverseaGoodsDetailsEmbeddedEntity transferOverseaGoodsDetailsEmbeddedEntity, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transferOverseaGoodsDetailsEmbeddedEntity.productName;
        }
        if ((i & 2) != 0) {
            str2 = transferOverseaGoodsDetailsEmbeddedEntity.originCountry;
        }
        if ((i & 4) != 0) {
            str3 = transferOverseaGoodsDetailsEmbeddedEntity.shippingFrom;
        }
        if ((i & 8) != 0) {
            str4 = transferOverseaGoodsDetailsEmbeddedEntity.destinationCountry;
        }
        return transferOverseaGoodsDetailsEmbeddedEntity.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginCountry() {
        return this.originCountry;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShippingFrom() {
        return this.shippingFrom;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDestinationCountry() {
        return this.destinationCountry;
    }

    @NotNull
    public final TransferOverseaGoodsDetailsEmbeddedEntity copy(@NotNull String productName, @NotNull String originCountry, @NotNull String shippingFrom, @NotNull String destinationCountry) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(originCountry, "originCountry");
        Intrinsics.checkNotNullParameter(shippingFrom, "shippingFrom");
        Intrinsics.checkNotNullParameter(destinationCountry, "destinationCountry");
        return new TransferOverseaGoodsDetailsEmbeddedEntity(productName, originCountry, shippingFrom, destinationCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferOverseaGoodsDetailsEmbeddedEntity)) {
            return false;
        }
        TransferOverseaGoodsDetailsEmbeddedEntity transferOverseaGoodsDetailsEmbeddedEntity = (TransferOverseaGoodsDetailsEmbeddedEntity) other;
        return Intrinsics.f(this.productName, transferOverseaGoodsDetailsEmbeddedEntity.productName) && Intrinsics.f(this.originCountry, transferOverseaGoodsDetailsEmbeddedEntity.originCountry) && Intrinsics.f(this.shippingFrom, transferOverseaGoodsDetailsEmbeddedEntity.shippingFrom) && Intrinsics.f(this.destinationCountry, transferOverseaGoodsDetailsEmbeddedEntity.destinationCountry);
    }

    @NotNull
    public final String getDestinationCountry() {
        return this.destinationCountry;
    }

    @NotNull
    public final String getOriginCountry() {
        return this.originCountry;
    }

    @NotNull
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    public final String getShippingFrom() {
        return this.shippingFrom;
    }

    public int hashCode() {
        return this.destinationCountry.hashCode() + a.c(a.c(this.productName.hashCode() * 31, 31, this.originCountry), 31, this.shippingFrom);
    }
}

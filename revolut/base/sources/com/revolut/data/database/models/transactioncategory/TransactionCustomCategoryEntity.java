package com.revolut.data.database.models.transactioncategory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;", "", "id", "", "walletId", "title", "image", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getWalletId", "getTitle", "getImage", "getColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCustomCategoryEntity {

    @NotNull
    private final String color;

    @NotNull
    private final String id;

    @NotNull
    private final String image;

    @NotNull
    private final String title;

    @NotNull
    private final String walletId;

    public TransactionCustomCategoryEntity(@NotNull String id10, @NotNull String walletId, @NotNull String title, @NotNull String image, @NotNull String color) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(color, "color");
        this.id = id10;
        this.walletId = walletId;
        this.title = title;
        this.image = image;
        this.color = color;
    }

    public static /* synthetic */ TransactionCustomCategoryEntity copy$default(TransactionCustomCategoryEntity transactionCustomCategoryEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionCustomCategoryEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = transactionCustomCategoryEntity.walletId;
        }
        if ((i & 4) != 0) {
            str3 = transactionCustomCategoryEntity.title;
        }
        if ((i & 8) != 0) {
            str4 = transactionCustomCategoryEntity.image;
        }
        if ((i & 16) != 0) {
            str5 = transactionCustomCategoryEntity.color;
        }
        String str6 = str5;
        String str7 = str3;
        return transactionCustomCategoryEntity.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final TransactionCustomCategoryEntity copy(@NotNull String id10, @NotNull String walletId, @NotNull String title, @NotNull String image, @NotNull String color) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(color, "color");
        return new TransactionCustomCategoryEntity(id10, walletId, title, image, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionCustomCategoryEntity)) {
            return false;
        }
        TransactionCustomCategoryEntity transactionCustomCategoryEntity = (TransactionCustomCategoryEntity) other;
        return Intrinsics.f(this.id, transactionCustomCategoryEntity.id) && Intrinsics.f(this.walletId, transactionCustomCategoryEntity.walletId) && Intrinsics.f(this.title, transactionCustomCategoryEntity.title) && Intrinsics.f(this.image, transactionCustomCategoryEntity.image) && Intrinsics.f(this.color, transactionCustomCategoryEntity.color);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        return this.color.hashCode() + p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.walletId), 31, this.title), 31, this.image);
    }
}

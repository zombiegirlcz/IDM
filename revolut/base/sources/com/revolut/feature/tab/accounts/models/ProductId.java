package com.revolut.feature.tab.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/ProductId;", "Landroid/os/Parcelable;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "CURRENCY", "ON_HOLD", "FAVORITE", "SAVINGS", "CREDIT", "SUBACCOUNT", "JOINT", "PRO", "YOUTH", "TEEN", "LINKED", "BEREAVEMENT", "TOTAL_WEALTH", "CREDIT_HUB", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductId implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductId[] $VALUES;
    public static final ProductId BEREAVEMENT;

    @NotNull
    public static final Parcelable.Creator<ProductId> CREATOR;
    public static final ProductId CREDIT;
    public static final ProductId CREDIT_HUB;
    public static final ProductId CURRENCY;
    public static final ProductId FAVORITE;
    public static final ProductId JOINT;
    public static final ProductId LINKED;
    public static final ProductId ON_HOLD;
    public static final ProductId PRO;
    public static final ProductId SAVINGS;
    public static final ProductId SUBACCOUNT;
    public static final ProductId TEEN;
    public static final ProductId TOTAL_WEALTH;
    public static final ProductId YOUTH;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ProductId.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductId[i];
        }
    }

    static {
        ProductId productId = new ProductId("CURRENCY", 0, "personalCurrency");
        CURRENCY = productId;
        ProductId productId2 = new ProductId("ON_HOLD", 1, "blocking");
        ON_HOLD = productId2;
        ProductId productId3 = new ProductId("FAVORITE", 2, "favourites");
        FAVORITE = productId3;
        ProductId productId4 = new ProductId("SAVINGS", 3, "savings");
        SAVINGS = productId4;
        ProductId productId5 = new ProductId("CREDIT", 4, "credit");
        CREDIT = productId5;
        ProductId productId6 = new ProductId("SUBACCOUNT", 5, "subaccount");
        SUBACCOUNT = productId6;
        ProductId productId7 = new ProductId("JOINT", 6, "joint");
        JOINT = productId7;
        ProductId productId8 = new ProductId("PRO", 7, "pro");
        PRO = productId8;
        ProductId productId9 = new ProductId("YOUTH", 8, "youth");
        YOUTH = productId9;
        ProductId productId10 = new ProductId("TEEN", 9, "teen");
        TEEN = productId10;
        ProductId productId11 = new ProductId("LINKED", 10, "linked");
        LINKED = productId11;
        ProductId productId12 = new ProductId("BEREAVEMENT", 11, "bereavement");
        BEREAVEMENT = productId12;
        ProductId productId13 = new ProductId("TOTAL_WEALTH", 12, "totalWealth");
        TOTAL_WEALTH = productId13;
        ProductId productId14 = new ProductId("CREDIT_HUB", 13, "creditHub");
        CREDIT_HUB = productId14;
        ProductId[] productIdArr = {productId, productId2, productId3, productId4, productId5, productId6, productId7, productId8, productId9, productId10, productId11, productId12, productId13, productId14};
        $VALUES = productIdArr;
        $ENTRIES = s.n(productIdArr);
        CREATOR = new a();
    }

    public ProductId(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static ProductId valueOf(String str) {
        return (ProductId) Enum.valueOf(ProductId.class, str);
    }

    public static ProductId[] values() {
        return (ProductId[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}

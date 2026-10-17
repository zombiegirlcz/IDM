package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/subaccount/impl/ui/create/flow/main/SubaccountProductArticleConfigResolver$PocketsProductArticleKey", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/SubaccountProductArticleConfigResolver$PocketsProductArticleKey;", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "PERSONAL_POCKETS_CO", "GROUP_POCKETS_CO", "JOINT_POCKETS_CO", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubaccountProductArticleConfigResolver$PocketsProductArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubaccountProductArticleConfigResolver$PocketsProductArticleKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SubaccountProductArticleConfigResolver$PocketsProductArticleKey> CREATOR;
    public static final SubaccountProductArticleConfigResolver$PocketsProductArticleKey GROUP_POCKETS_CO;
    public static final SubaccountProductArticleConfigResolver$PocketsProductArticleKey JOINT_POCKETS_CO;
    public static final SubaccountProductArticleConfigResolver$PocketsProductArticleKey PERSONAL_POCKETS_CO;

    @NotNull
    private final String articleName = "pa";
    private final String articleVariant = "co";

    @NotNull
    private final String productName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SubaccountProductArticleConfigResolver$PocketsProductArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubaccountProductArticleConfigResolver$PocketsProductArticleKey[i];
        }
    }

    static {
        SubaccountProductArticleConfigResolver$PocketsProductArticleKey subaccountProductArticleConfigResolver$PocketsProductArticleKey = new SubaccountProductArticleConfigResolver$PocketsProductArticleKey("PERSONAL_POCKETS_CO", 0, "pockets");
        PERSONAL_POCKETS_CO = subaccountProductArticleConfigResolver$PocketsProductArticleKey;
        SubaccountProductArticleConfigResolver$PocketsProductArticleKey subaccountProductArticleConfigResolver$PocketsProductArticleKey2 = new SubaccountProductArticleConfigResolver$PocketsProductArticleKey("GROUP_POCKETS_CO", 1, "group-pockets");
        GROUP_POCKETS_CO = subaccountProductArticleConfigResolver$PocketsProductArticleKey2;
        SubaccountProductArticleConfigResolver$PocketsProductArticleKey subaccountProductArticleConfigResolver$PocketsProductArticleKey3 = new SubaccountProductArticleConfigResolver$PocketsProductArticleKey("JOINT_POCKETS_CO", 2, "joint-pockets");
        JOINT_POCKETS_CO = subaccountProductArticleConfigResolver$PocketsProductArticleKey3;
        SubaccountProductArticleConfigResolver$PocketsProductArticleKey[] subaccountProductArticleConfigResolver$PocketsProductArticleKeyArr = {subaccountProductArticleConfigResolver$PocketsProductArticleKey, subaccountProductArticleConfigResolver$PocketsProductArticleKey2, subaccountProductArticleConfigResolver$PocketsProductArticleKey3};
        $VALUES = subaccountProductArticleConfigResolver$PocketsProductArticleKeyArr;
        $ENTRIES = s.n(subaccountProductArticleConfigResolver$PocketsProductArticleKeyArr);
        CREATOR = new a();
    }

    public SubaccountProductArticleConfigResolver$PocketsProductArticleKey(String str, int i, String str2) {
        this.productName = str2;
    }

    public static SubaccountProductArticleConfigResolver$PocketsProductArticleKey valueOf(String str) {
        return (SubaccountProductArticleConfigResolver$PocketsProductArticleKey) Enum.valueOf(SubaccountProductArticleConfigResolver$PocketsProductArticleKey.class, str);
    }

    public static SubaccountProductArticleConfigResolver$PocketsProductArticleKey[] values() {
        return (SubaccountProductArticleConfigResolver$PocketsProductArticleKey[]) $VALUES.clone();
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getArticleName() {
        return this.articleName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return this.productName;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getArticleVariant() {
        return this.articleVariant;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}

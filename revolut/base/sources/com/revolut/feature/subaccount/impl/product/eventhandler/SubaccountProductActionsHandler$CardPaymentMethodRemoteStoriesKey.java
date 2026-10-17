package com.revolut.feature.subaccount.impl.product.eventhandler;

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
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/subaccount/impl/product/eventhandler/SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "Lcom/revolut/feature/subaccount/impl/product/eventhandler/SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey;", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "LINK_CARD_TO_POCKET", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey> CREATOR;
    public static final SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey LINK_CARD_TO_POCKET;

    @NotNull
    private final String productName = "vault";

    @NotNull
    private final String articleName = "link-card";
    private final String articleVariant = "intro";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey[i];
        }
    }

    static {
        SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey subaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey = new SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey();
        LINK_CARD_TO_POCKET = subaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey;
        SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey[] subaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKeyArr = {subaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey};
        $VALUES = subaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKeyArr;
        $ENTRIES = s.n(subaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKeyArr);
        CREATOR = new a();
    }

    public static SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey valueOf(String str) {
        return (SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey) Enum.valueOf(SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey.class, str);
    }

    public static SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey[] values() {
        return (SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey[]) $VALUES.clone();
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

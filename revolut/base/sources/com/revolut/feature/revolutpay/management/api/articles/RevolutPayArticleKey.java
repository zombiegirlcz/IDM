package com.revolut.feature.revolutpay.management.api.articles;

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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/revolutpay/management/api/articles/RevolutPayArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "IntroWithRevPoints", "IntroWithoutRevPoints", "InfoWithRevPoints", "InfoWithoutRevPoints", "AboutRevPoints", "feature_revolut_pay_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevolutPayArticleKey[] $VALUES;
    public static final RevolutPayArticleKey AboutRevPoints;

    @NotNull
    public static final Parcelable.Creator<RevolutPayArticleKey> CREATOR;
    public static final RevolutPayArticleKey InfoWithRevPoints;
    public static final RevolutPayArticleKey InfoWithoutRevPoints;
    public static final RevolutPayArticleKey IntroWithRevPoints;
    public static final RevolutPayArticleKey IntroWithoutRevPoints;

    @NotNull
    private final String articleName;
    private final String articleVariant;

    @NotNull
    private final String productName = "revolut-pay";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return RevolutPayArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayArticleKey[i];
        }
    }

    static {
        RevolutPayArticleKey revolutPayArticleKey = new RevolutPayArticleKey("IntroWithRevPoints", 0, "intro", "with-rev-points");
        IntroWithRevPoints = revolutPayArticleKey;
        RevolutPayArticleKey revolutPayArticleKey2 = new RevolutPayArticleKey("IntroWithoutRevPoints", 1, "intro", "without-rev-points");
        IntroWithoutRevPoints = revolutPayArticleKey2;
        RevolutPayArticleKey revolutPayArticleKey3 = new RevolutPayArticleKey("InfoWithRevPoints", 2, "info", "with-rev-points");
        InfoWithRevPoints = revolutPayArticleKey3;
        RevolutPayArticleKey revolutPayArticleKey4 = new RevolutPayArticleKey("InfoWithoutRevPoints", 3, "info", "without-rev-points");
        InfoWithoutRevPoints = revolutPayArticleKey4;
        RevolutPayArticleKey revolutPayArticleKey5 = new RevolutPayArticleKey("AboutRevPoints", 4, "rev-points", null);
        AboutRevPoints = revolutPayArticleKey5;
        RevolutPayArticleKey[] revolutPayArticleKeyArr = {revolutPayArticleKey, revolutPayArticleKey2, revolutPayArticleKey3, revolutPayArticleKey4, revolutPayArticleKey5};
        $VALUES = revolutPayArticleKeyArr;
        $ENTRIES = s.n(revolutPayArticleKeyArr);
        CREATOR = new a();
    }

    public RevolutPayArticleKey(String str, int i, String str2, String str3) {
        this.articleName = str2;
        this.articleVariant = str3;
    }

    public static RevolutPayArticleKey valueOf(String str) {
        return (RevolutPayArticleKey) Enum.valueOf(RevolutPayArticleKey.class, str);
    }

    public static RevolutPayArticleKey[] values() {
        return (RevolutPayArticleKey[]) $VALUES.clone();
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

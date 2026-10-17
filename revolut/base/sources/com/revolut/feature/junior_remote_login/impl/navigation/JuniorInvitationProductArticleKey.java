package com.revolut.feature.junior_remote_login.impl.navigation;

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
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/navigation/JuniorInvitationProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "CREATION", "CREATION_JP", "SHARING", "SHARING_JP", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorInvitationProductArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JuniorInvitationProductArticleKey[] $VALUES;
    public static final JuniorInvitationProductArticleKey CREATION;
    public static final JuniorInvitationProductArticleKey CREATION_JP;

    @NotNull
    public static final Parcelable.Creator<JuniorInvitationProductArticleKey> CREATOR;
    public static final JuniorInvitationProductArticleKey SHARING;
    public static final JuniorInvitationProductArticleKey SHARING_JP;
    private final String articleVariant;

    @NotNull
    private final String productName = "rev_u18";

    @NotNull
    private final String articleName = "app-invitation";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return JuniorInvitationProductArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorInvitationProductArticleKey[i];
        }
    }

    static {
        JuniorInvitationProductArticleKey juniorInvitationProductArticleKey = new JuniorInvitationProductArticleKey("CREATION", 0, "create");
        CREATION = juniorInvitationProductArticleKey;
        JuniorInvitationProductArticleKey juniorInvitationProductArticleKey2 = new JuniorInvitationProductArticleKey("CREATION_JP", 1, "create.jp");
        CREATION_JP = juniorInvitationProductArticleKey2;
        JuniorInvitationProductArticleKey juniorInvitationProductArticleKey3 = new JuniorInvitationProductArticleKey("SHARING", 2, "share");
        SHARING = juniorInvitationProductArticleKey3;
        JuniorInvitationProductArticleKey juniorInvitationProductArticleKey4 = new JuniorInvitationProductArticleKey("SHARING_JP", 3, "share.jp");
        SHARING_JP = juniorInvitationProductArticleKey4;
        JuniorInvitationProductArticleKey[] juniorInvitationProductArticleKeyArr = {juniorInvitationProductArticleKey, juniorInvitationProductArticleKey2, juniorInvitationProductArticleKey3, juniorInvitationProductArticleKey4};
        $VALUES = juniorInvitationProductArticleKeyArr;
        $ENTRIES = s.n(juniorInvitationProductArticleKeyArr);
        CREATOR = new a();
    }

    public JuniorInvitationProductArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static JuniorInvitationProductArticleKey valueOf(String str) {
        return (JuniorInvitationProductArticleKey) Enum.valueOf(JuniorInvitationProductArticleKey.class, str);
    }

    public static JuniorInvitationProductArticleKey[] values() {
        return (JuniorInvitationProductArticleKey[]) $VALUES.clone();
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

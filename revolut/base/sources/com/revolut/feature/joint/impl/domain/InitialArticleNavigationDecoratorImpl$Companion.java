package com.revolut.feature.joint.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class InitialArticleNavigationDecoratorImpl$Companion {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/joint/impl/domain/InitialArticleNavigationDecoratorImpl$Companion$JointProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "BIG_TILE", "PORTUGAL_BIG_TILE", "COLOMBIA_BIG_TILE", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JointProductArticleKey implements ProductArticleKey {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JointProductArticleKey[] $VALUES;
        public static final JointProductArticleKey BIG_TILE;
        public static final JointProductArticleKey COLOMBIA_BIG_TILE;

        @NotNull
        public static final Parcelable.Creator<JointProductArticleKey> CREATOR;
        public static final JointProductArticleKey PORTUGAL_BIG_TILE;

        @NotNull
        private final String articleName;

        @NotNull
        private final String articleVariant;

        @NotNull
        private final String productName;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return JointProductArticleKey.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointProductArticleKey[i];
            }
        }

        static {
            JointProductArticleKey jointProductArticleKey = new JointProductArticleKey(0, "BIG_TILE", "joint-account", "story", "big-tile");
            BIG_TILE = jointProductArticleKey;
            JointProductArticleKey jointProductArticleKey2 = new JointProductArticleKey(1, "PORTUGAL_BIG_TILE", "joint-account-portugal", "story", "big-tile");
            PORTUGAL_BIG_TILE = jointProductArticleKey2;
            JointProductArticleKey jointProductArticleKey3 = new JointProductArticleKey(2, "COLOMBIA_BIG_TILE", "joint-account", "pa", "co");
            COLOMBIA_BIG_TILE = jointProductArticleKey3;
            JointProductArticleKey[] jointProductArticleKeyArr = {jointProductArticleKey, jointProductArticleKey2, jointProductArticleKey3};
            $VALUES = jointProductArticleKeyArr;
            $ENTRIES = s.n(jointProductArticleKeyArr);
            CREATOR = new a();
        }

        public JointProductArticleKey(int i, String str, String str2, String str3, String str4) {
            this.productName = str2;
            this.articleName = str3;
            this.articleVariant = str4;
        }

        public static JointProductArticleKey valueOf(String str) {
            return (JointProductArticleKey) Enum.valueOf(JointProductArticleKey.class, str);
        }

        public static JointProductArticleKey[] values() {
            return (JointProductArticleKey[]) $VALUES.clone();
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

    private InitialArticleNavigationDecoratorImpl$Companion() {
    }
}

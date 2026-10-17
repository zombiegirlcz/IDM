package com.revolut.feature.joint.impl.account.handler;

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
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/joint/impl/account/handler/JointBereavementEventHandler$JointBereavementArticleKey", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "Lcom/revolut/feature/joint/impl/account/handler/JointBereavementEventHandler$JointBereavementArticleKey;", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "BEREAVEMENT_LEARN_MORE", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointBereavementEventHandler$JointBereavementArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JointBereavementEventHandler$JointBereavementArticleKey[] $VALUES;
    public static final JointBereavementEventHandler$JointBereavementArticleKey BEREAVEMENT_LEARN_MORE;

    @NotNull
    public static final Parcelable.Creator<JointBereavementEventHandler$JointBereavementArticleKey> CREATOR;

    @NotNull
    private final String productName = "joint-account";

    @NotNull
    private final String articleName = "bereavement";

    @NotNull
    private final String articleVariant = "learn-more";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return JointBereavementEventHandler$JointBereavementArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointBereavementEventHandler$JointBereavementArticleKey[i];
        }
    }

    static {
        JointBereavementEventHandler$JointBereavementArticleKey jointBereavementEventHandler$JointBereavementArticleKey = new JointBereavementEventHandler$JointBereavementArticleKey();
        BEREAVEMENT_LEARN_MORE = jointBereavementEventHandler$JointBereavementArticleKey;
        JointBereavementEventHandler$JointBereavementArticleKey[] jointBereavementEventHandler$JointBereavementArticleKeyArr = {jointBereavementEventHandler$JointBereavementArticleKey};
        $VALUES = jointBereavementEventHandler$JointBereavementArticleKeyArr;
        $ENTRIES = s.n(jointBereavementEventHandler$JointBereavementArticleKeyArr);
        CREATOR = new a();
    }

    public static JointBereavementEventHandler$JointBereavementArticleKey valueOf(String str) {
        return (JointBereavementEventHandler$JointBereavementArticleKey) Enum.valueOf(JointBereavementEventHandler$JointBereavementArticleKey.class, str);
    }

    public static JointBereavementEventHandler$JointBereavementArticleKey[] values() {
        return (JointBereavementEventHandler$JointBereavementArticleKey[]) $VALUES.clone();
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

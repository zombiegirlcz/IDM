package com.revolut.feature.credit.loan.impl.article;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/article/LoanArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "Companion", "BackupCard", "a", "Lcom/revolut/feature/credit/loan/impl/article/LoanArticleKey$BackupCard;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanArticleKey implements ProductArticleKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70306a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/article/LoanArticleKey$BackupCard;", "Lcom/revolut/feature/credit/loan/impl/article/LoanArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackupCard extends LoanArticleKey {

        @NotNull
        public static final Parcelable.Creator<BackupCard> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f70307b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackupCard((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackupCard[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BackupCard(b bVar) {
            String lowerCase;
            b.Companion.getClass();
            if (Intrinsics.f(bVar, b.p0)) {
                lowerCase = bVar.f297794a.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            super(lowerCase);
            this.f70307b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BackupCard) && Intrinsics.f(this.f70307b, ((BackupCard) obj2).f70307b);
        }

        public final int hashCode() {
            b bVar = this.f70307b;
            if (bVar == null) {
                return 0;
            }
            return bVar.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70307b);
        }
    }

    public LoanArticleKey(String str) {
        this.f70306a = str;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5 */
    public final String getArticleName() {
        return "backup-card";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return "loans";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF70306a() {
        return this.f70306a;
    }
}

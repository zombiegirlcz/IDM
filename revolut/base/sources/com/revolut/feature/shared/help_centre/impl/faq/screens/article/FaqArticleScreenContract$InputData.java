package com.revolut.feature.shared.help_centre.impl.faq.screens.article;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "OpenByFaqNode", "TransactionTroubleshooter", "OpenByFaqKey", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData$OpenByFaqKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData$OpenByFaqNode;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData$TransactionTroubleshooter;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FaqArticleScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData$OpenByFaqKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenByFaqKey extends FaqArticleScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OpenByFaqKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86228c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenByFaqKey(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenByFaqKey[i];
            }
        }

        public OpenByFaqKey(String faqKey, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            this.f86226a = z;
            this.f86227b = faqKey;
            this.f86228c = z3;
        }

        @Override // com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF86232a() {
            return this.f86226a;
        }

        @Override // com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.f86228c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenByFaqKey)) {
                return false;
            }
            OpenByFaqKey openByFaqKey = (OpenByFaqKey) obj2;
            return this.f86226a == openByFaqKey.f86226a && Intrinsics.f(this.f86227b, openByFaqKey.f86227b) && this.f86228c == openByFaqKey.f86228c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86228c) + p.a.c(Boolean.hashCode(this.f86226a) * 31, 31, this.f86227b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f86226a ? 1 : 0);
            dest.writeString(this.f86227b);
            dest.writeInt(this.f86228c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData$OpenByFaqNode;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenByFaqNode extends FaqArticleScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OpenByFaqNode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FaqNodeBase f86230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86231c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenByFaqNode((FaqNodeBase) parcel.readParcelable(OpenByFaqNode.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenByFaqNode[i];
            }
        }

        public OpenByFaqNode(FaqNodeBase node, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f86229a = z;
            this.f86230b = node;
            this.f86231c = z3;
        }

        @Override // com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF86232a() {
            return this.f86229a;
        }

        @Override // com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.f86231c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenByFaqNode)) {
                return false;
            }
            OpenByFaqNode openByFaqNode = (OpenByFaqNode) obj2;
            return this.f86229a == openByFaqNode.f86229a && Intrinsics.f(this.f86230b, openByFaqNode.f86230b) && this.f86231c == openByFaqNode.f86231c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86231c) + ((this.f86230b.hashCode() + (Boolean.hashCode(this.f86229a) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f86229a ? 1 : 0);
            dest.writeParcelable(this.f86230b, i);
            dest.writeInt(this.f86231c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData$TransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionTroubleshooter extends FaqArticleScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TransactionTroubleshooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86234c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionTroubleshooter(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionTroubleshooter[i];
            }
        }

        public TransactionTroubleshooter(String faqEntryKey, String faqEntryTitle, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(faqEntryKey, "faqEntryKey");
            Intrinsics.checkNotNullParameter(faqEntryTitle, "faqEntryTitle");
            this.f86232a = z;
            this.f86233b = faqEntryKey;
            this.f86234c = faqEntryTitle;
            this.d = z3;
        }

        @Override // com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF86232a() {
            return this.f86232a;
        }

        @Override // com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionTroubleshooter)) {
                return false;
            }
            TransactionTroubleshooter transactionTroubleshooter = (TransactionTroubleshooter) obj2;
            return this.f86232a == transactionTroubleshooter.f86232a && Intrinsics.f(this.f86233b, transactionTroubleshooter.f86233b) && Intrinsics.f(this.f86234c, transactionTroubleshooter.f86234c) && this.d == transactionTroubleshooter.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.c(p.a.c(Boolean.hashCode(this.f86232a) * 31, 31, this.f86233b), 31, this.f86234c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f86232a ? 1 : 0);
            dest.writeString(this.f86233b);
            dest.writeString(this.f86234c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private FaqArticleScreenContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getF86232a();

    /* JADX INFO: renamed from: b */
    public abstract boolean getD();
}

package com.revolut.core.model.faq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/model/faq/FaqNode;", "Lcom/revolut/core/model/faq/FaqNodeBase;", "Companion", "Category", "Topic", "Article", "Deeplink", "a", "Lcom/revolut/core/model/faq/FaqNode$Article;", "Lcom/revolut/core/model/faq/FaqNode$Category;", "Lcom/revolut/core/model/faq/FaqNode$Deeplink;", "Lcom/revolut/core/model/faq/FaqNode$Topic;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FaqNode extends FaqNodeBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f51433a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/FaqNode$Article;", "Lcom/revolut/core/model/faq/FaqNode;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Article implements FaqNode {

        @NotNull
        public static final Parcelable.Creator<Article> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51423c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Article(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Article[i];
            }
        }

        public Article(String key, String title, String contentStyle, String parentKey) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
            Intrinsics.checkNotNullParameter(parentKey, "parentKey");
            this.f51421a = key;
            this.f51422b = title;
            this.f51423c = contentStyle;
            this.d = parentKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Article)) {
                return false;
            }
            Article article = (Article) obj2;
            return Intrinsics.f(this.f51421a, article.f51421a) && Intrinsics.f(this.f51422b, article.f51422b) && Intrinsics.f(this.f51423c, article.f51423c) && Intrinsics.f(this.d, article.d);
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF51430a() {
            return this.f51421a;
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF51431b() {
            return this.f51422b;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f51421a.hashCode() * 31, 31, this.f51422b), 31, this.f51423c);
        }

        @Override // com.revolut.core.model.faq.FaqNode
        /* JADX INFO: renamed from: p2, reason: from getter */
        public final String getF51432c() {
            return this.f51423c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51421a);
            dest.writeString(this.f51422b);
            dest.writeString(this.f51423c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/FaqNode$Category;", "Lcom/revolut/core/model/faq/FaqNode;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Category implements FaqNode {

        @NotNull
        public static final Parcelable.Creator<Category> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51426c;
        public final List d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Category.class, parcel, arrayList, iE, 1);
                }
                return new Category(string, string2, string3, parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Category[i];
            }
        }

        public Category(String key, String title, String contentStyle, String str, List children) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
            Intrinsics.checkNotNullParameter(children, "children");
            this.f51424a = key;
            this.f51425b = title;
            this.f51426c = contentStyle;
            this.d = children;
            this.e = str;
        }

        public static Category a(Category category, ArrayList children) {
            String key = category.f51424a;
            String title = category.f51425b;
            String contentStyle = category.f51426c;
            String str = category.e;
            category.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
            Intrinsics.checkNotNullParameter(children, "children");
            return new Category(key, title, contentStyle, str, children);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Category)) {
                return false;
            }
            Category category = (Category) obj2;
            return Intrinsics.f(this.f51424a, category.f51424a) && Intrinsics.f(this.f51425b, category.f51425b) && Intrinsics.f(this.f51426c, category.f51426c) && Intrinsics.f(this.d, category.d) && Intrinsics.f(this.e, category.e);
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF51430a() {
            return this.f51424a;
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF51431b() {
            return this.f51425b;
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(p.a.c(this.f51424a.hashCode() * 31, 31, this.f51425b), 31, this.f51426c), 31, this.d);
            String str = this.e;
            return iD + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.core.model.faq.FaqNode
        /* JADX INFO: renamed from: p2, reason: from getter */
        public final String getF51432c() {
            return this.f51426c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51424a);
            dest.writeString(this.f51425b);
            dest.writeString(this.f51426c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/FaqNode$Deeplink;", "Lcom/revolut/core/model/faq/FaqNode;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements FaqNode {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51429c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String key, String title, String contentStyle, String deeplink, String parentKey) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(parentKey, "parentKey");
            this.f51427a = key;
            this.f51428b = title;
            this.f51429c = contentStyle;
            this.d = deeplink;
            this.e = parentKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj2;
            return Intrinsics.f(this.f51427a, deeplink.f51427a) && Intrinsics.f(this.f51428b, deeplink.f51428b) && Intrinsics.f(this.f51429c, deeplink.f51429c) && Intrinsics.f(this.d, deeplink.d) && Intrinsics.f(this.e, deeplink.e);
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF51430a() {
            return this.f51427a;
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF51431b() {
            return this.f51428b;
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f51427a.hashCode() * 31, 31, this.f51428b), 31, this.f51429c), 31, this.d);
        }

        @Override // com.revolut.core.model.faq.FaqNode
        /* JADX INFO: renamed from: p2, reason: from getter */
        public final String getF51432c() {
            return this.f51429c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51427a);
            dest.writeString(this.f51428b);
            dest.writeString(this.f51429c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/FaqNode$Topic;", "Lcom/revolut/core/model/faq/FaqNode;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Topic implements FaqNode {

        @NotNull
        public static final Parcelable.Creator<Topic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51432c;
        public final String d;
        public final List e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Topic.class, parcel, arrayList, iE, 1);
                }
                return new Topic(string, string2, string3, string4, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Topic[i];
            }
        }

        public Topic(String key, String title, String contentStyle, String parentKey, List children) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
            Intrinsics.checkNotNullParameter(parentKey, "parentKey");
            Intrinsics.checkNotNullParameter(children, "children");
            this.f51430a = key;
            this.f51431b = title;
            this.f51432c = contentStyle;
            this.d = parentKey;
            this.e = children;
        }

        public static Topic a(Topic topic, ArrayList children) {
            String key = topic.f51430a;
            String title = topic.f51431b;
            String contentStyle = topic.f51432c;
            String parentKey = topic.d;
            topic.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
            Intrinsics.checkNotNullParameter(parentKey, "parentKey");
            Intrinsics.checkNotNullParameter(children, "children");
            return new Topic(key, title, contentStyle, parentKey, children);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Topic)) {
                return false;
            }
            Topic topic = (Topic) obj2;
            return Intrinsics.f(this.f51430a, topic.f51430a) && Intrinsics.f(this.f51431b, topic.f51431b) && Intrinsics.f(this.f51432c, topic.f51432c) && Intrinsics.f(this.d, topic.d) && Intrinsics.f(this.e, topic.e);
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF51430a() {
            return this.f51430a;
        }

        @Override // com.revolut.core.model.faq.FaqNodeBase
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF51431b() {
            return this.f51431b;
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f51430a.hashCode() * 31, 31, this.f51431b), 31, this.f51432c), 31, this.d);
        }

        @Override // com.revolut.core.model.faq.FaqNode
        /* JADX INFO: renamed from: p2, reason: from getter */
        public final String getF51432c() {
            return this.f51432c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51430a);
            dest.writeString(this.f51431b);
            dest.writeString(this.f51432c);
            dest.writeString(this.d);
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.model.faq.FaqNode$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f51433a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: p2 */
    String getF51432c();
}

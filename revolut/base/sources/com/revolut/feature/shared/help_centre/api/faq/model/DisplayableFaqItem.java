package com.revolut.feature.shared.help_centre.api.faq.model;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem;", "Landroid/os/Parcelable;", "Node", "DeepLink", "Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem$DeepLink;", "Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem$Node;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DisplayableFaqItem extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem$DeepLink;", "Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeepLink implements DisplayableFaqItem {

        @NotNull
        public static final Parcelable.Creator<DeepLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f86136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86138c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeepLink((Clause) parcel.readParcelable(DeepLink.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeepLink[i];
            }
        }

        public DeepLink(Clause title, String deeplink, String id10) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f86136a = title;
            this.f86137b = deeplink;
            this.f86138c = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeepLink)) {
                return false;
            }
            DeepLink deepLink = (DeepLink) obj2;
            return Intrinsics.f(this.f86136a, deepLink.f86136a) && Intrinsics.f(this.f86137b, deepLink.f86137b) && Intrinsics.f(this.f86138c, deepLink.f86138c);
        }

        @Override // com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF86140b() {
            return this.f86138c;
        }

        @Override // com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF86141c() {
            return this.f86136a;
        }

        public final int hashCode() {
            return this.f86138c.hashCode() + p.a.c(this.f86136a.hashCode() * 31, 31, this.f86137b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86136a, i);
            dest.writeString(this.f86137b);
            dest.writeString(this.f86138c);
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF86140b();

    /* JADX INFO: renamed from: getTitle */
    Clause getF86141c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem$Node;", "Lcom/revolut/feature/shared/help_centre/api/faq/model/DisplayableFaqItem;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Node implements DisplayableFaqItem {

        @NotNull
        public static final Parcelable.Creator<Node> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FaqNodeBase f86139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f86141c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Node((FaqNodeBase) parcel.readParcelable(Node.class.getClassLoader()), parcel.readString(), (Clause) parcel.readParcelable(Node.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Node[i];
            }
        }

        public Node(FaqNodeBase faqNodeBase, String id10, Clause title) {
            Intrinsics.checkNotNullParameter(faqNodeBase, "faqNodeBase");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86139a = faqNodeBase;
            this.f86140b = id10;
            this.f86141c = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Node)) {
                return false;
            }
            Node node = (Node) obj2;
            return Intrinsics.f(this.f86139a, node.f86139a) && Intrinsics.f(this.f86140b, node.f86140b) && Intrinsics.f(this.f86141c, node.f86141c);
        }

        @Override // com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF86140b() {
            return this.f86140b;
        }

        @Override // com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF86141c() {
            return this.f86141c;
        }

        public final int hashCode() {
            return this.f86141c.hashCode() + p.a.c(this.f86139a.hashCode() * 31, 31, this.f86140b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86139a, i);
            dest.writeString(this.f86140b);
            dest.writeParcelable(this.f86141c, i);
        }

        public /* synthetic */ Node(FaqNodeBase faqNodeBase) {
            this(faqNodeBase, faqNodeBase.getF51434a(), new TextClause(faqNodeBase.getF51435b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
    }
}

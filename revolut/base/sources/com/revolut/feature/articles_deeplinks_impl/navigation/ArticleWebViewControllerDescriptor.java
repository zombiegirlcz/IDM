package com.revolut.feature.articles_deeplinks_impl.navigation;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/articles_deeplinks_impl/navigation/ArticleWebViewControllerDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_articles_deeplinks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleWebViewControllerDescriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<ArticleWebViewControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f63114b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new ArticleWebViewControllerDescriptor(linkedHashMap, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArticleWebViewControllerDescriptor[i];
        }
    }

    public ArticleWebViewControllerDescriptor(LinkedHashMap parameters, String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f63113a = articleId;
        this.f63114b = parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ArticleWebViewControllerDescriptor)) {
            return false;
        }
        ArticleWebViewControllerDescriptor articleWebViewControllerDescriptor = (ArticleWebViewControllerDescriptor) obj2;
        return Intrinsics.f(this.f63113a, articleWebViewControllerDescriptor.f63113a) && this.f63114b.equals(articleWebViewControllerDescriptor.f63114b);
    }

    public final int hashCode() {
        return this.f63114b.hashCode() + (this.f63113a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63113a);
        LinkedHashMap linkedHashMap = this.f63114b;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}

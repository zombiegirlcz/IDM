package com.revolut.feature_web_view.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_web_view/declaration/WebViewInputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebViewInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WebViewInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewScreenTitleSource f98164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98165c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WebViewInputData(parcel.readString(), (WebViewScreenTitleSource) parcel.readParcelable(WebViewInputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebViewInputData[i];
        }
    }

    public WebViewInputData(String url2, WebViewScreenTitleSource titleSource, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(titleSource, "titleSource");
        this.f98163a = url2;
        this.f98164b = titleSource;
        this.f98165c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WebViewInputData)) {
            return false;
        }
        WebViewInputData webViewInputData = (WebViewInputData) obj2;
        return Intrinsics.f(this.f98163a, webViewInputData.f98163a) && Intrinsics.f(this.f98164b, webViewInputData.f98164b) && this.f98165c == webViewInputData.f98165c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98165c) + ((this.f98164b.hashCode() + (this.f98163a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98163a);
        dest.writeParcelable(this.f98164b, i);
        dest.writeInt(this.f98165c ? 1 : 0);
    }
}

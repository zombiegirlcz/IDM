package com.revolut.feature_web_view.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource;", "Landroid/os/Parcelable;", "Static", "Html", "Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource$Html;", "Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource$Static;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WebViewScreenTitleSource extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource$Html;", "Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Html implements WebViewScreenTitleSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Html f98166a = new Html();

        @NotNull
        public static final Parcelable.Creator<Html> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Html.f98166a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Html[i];
            }
        }

        private Html() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Html);
        }

        public final int hashCode() {
            return 1952965982;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource$Static;", "Lcom/revolut/feature_web_view/declaration/WebViewScreenTitleSource;", "", "toString", "()Ljava/lang/String;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Static implements WebViewScreenTitleSource {

        @NotNull
        public static final Parcelable.Creator<Static> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f98167a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Static((Clause) parcel.readParcelable(Static.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Static[i];
            }
        }

        public Static(Clause title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f98167a = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Static) && Intrinsics.f(this.f98167a, ((Static) obj2).f98167a);
        }

        public final int hashCode() {
            return this.f98167a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98167a, i);
        }
    }
}

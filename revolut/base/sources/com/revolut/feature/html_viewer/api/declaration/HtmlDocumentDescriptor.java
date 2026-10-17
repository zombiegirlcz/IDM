package com.revolut.feature.html_viewer.api.declaration;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor;", "Landroid/os/Parcelable;", "<init>", "()V", "TermsDocumentDescriptor", "TermsWebDocumentDescriptor", "HtmlLocalFileDescriptor", "Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor$HtmlLocalFileDescriptor;", "Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor$TermsDocumentDescriptor;", "Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor$TermsWebDocumentDescriptor;", "feature_html_viewer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HtmlDocumentDescriptor implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor$HtmlLocalFileDescriptor;", "Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_html_viewer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HtmlLocalFileDescriptor extends HtmlDocumentDescriptor {

        @NotNull
        public static final Parcelable.Creator<HtmlLocalFileDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f74745a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HtmlLocalFileDescriptor((Uri) parcel.readParcelable(HtmlLocalFileDescriptor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HtmlLocalFileDescriptor[i];
            }
        }

        public HtmlLocalFileDescriptor(Uri uri2) {
            Intrinsics.checkNotNullParameter(uri2, "uri");
            this.f74745a = uri2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HtmlLocalFileDescriptor) && Intrinsics.f(this.f74745a, ((HtmlLocalFileDescriptor) obj2).f74745a);
        }

        public final int hashCode() {
            return this.f74745a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74745a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor$TermsDocumentDescriptor;", "Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_html_viewer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class TermsDocumentDescriptor extends HtmlDocumentDescriptor {

        @NotNull
        public static final Parcelable.Creator<TermsDocumentDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74746a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsDocumentDescriptor(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsDocumentDescriptor[i];
            }
        }

        public TermsDocumentDescriptor(String termsId) {
            Intrinsics.checkNotNullParameter(termsId, "termsId");
            this.f74746a = termsId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsDocumentDescriptor) && Intrinsics.f(this.f74746a, ((TermsDocumentDescriptor) obj2).f74746a);
        }

        public final int hashCode() {
            return this.f74746a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74746a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor$TermsWebDocumentDescriptor;", "Lcom/revolut/feature/html_viewer/api/declaration/HtmlDocumentDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_html_viewer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsWebDocumentDescriptor extends HtmlDocumentDescriptor {

        @NotNull
        public static final Parcelable.Creator<TermsWebDocumentDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f74748b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsWebDocumentDescriptor(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsWebDocumentDescriptor[i];
            }
        }

        public TermsWebDocumentDescriptor(String url2, boolean z) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f74747a = url2;
            this.f74748b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsWebDocumentDescriptor)) {
                return false;
            }
            TermsWebDocumentDescriptor termsWebDocumentDescriptor = (TermsWebDocumentDescriptor) obj2;
            return Intrinsics.f(this.f74747a, termsWebDocumentDescriptor.f74747a) && this.f74748b == termsWebDocumentDescriptor.f74748b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f74748b) + (this.f74747a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74747a);
            dest.writeInt(this.f74748b ? 1 : 0);
        }
    }

    private HtmlDocumentDescriptor() {
    }
}

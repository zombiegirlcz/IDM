package com.revolut.feature.apm.core.ui.api.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent;", "Landroid/os/Parcelable;", "ImageOnly", "TextOnly", "Expiry", "a12/r", "Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent$Expiry;", "Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent$ImageOnly;", "Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent$TextOnly;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmFooterContent extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent$Expiry;", "Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expiry implements ApmFooterContent {

        @NotNull
        public static final Parcelable.Creator<Expiry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62231a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Expiry(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expiry[i];
            }
        }

        public Expiry(long j2) {
            this.f62231a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Expiry) && this.f62231a == ((Expiry) obj2).f62231a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62231a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f62231a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent$ImageOnly;", "Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImageOnly implements ApmFooterContent {

        @NotNull
        public static final Parcelable.Creator<ImageOnly> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f62232a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageOnly((Image) parcel.readParcelable(ImageOnly.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageOnly[i];
            }
        }

        public ImageOnly(Image image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f62232a = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ImageOnly) && Intrinsics.f(this.f62232a, ((ImageOnly) obj2).f62232a);
        }

        public final int hashCode() {
            return this.f62232a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62232a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent$TextOnly;", "Lcom/revolut/feature/apm/core/ui/api/mapper/ApmFooterContent;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextOnly implements ApmFooterContent {

        @NotNull
        public static final Parcelable.Creator<TextOnly> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f62233a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextOnly((Clause) parcel.readParcelable(TextOnly.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextOnly[i];
            }
        }

        public TextOnly(Clause text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f62233a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TextOnly) && Intrinsics.f(this.f62233a, ((TextOnly) obj2).f62233a);
        }

        public final int hashCode() {
            return this.f62233a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62233a, i);
        }
    }
}

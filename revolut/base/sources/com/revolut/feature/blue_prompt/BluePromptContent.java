package com.revolut.feature.blue_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptContent;", "Landroid/os/Parcelable;", "<init>", "()V", "NoContent", "MediaContent", "ProgressContent", "Lcom/revolut/feature/blue_prompt/BluePromptContent$MediaContent;", "Lcom/revolut/feature/blue_prompt/BluePromptContent$NoContent;", "Lcom/revolut/feature/blue_prompt/BluePromptContent$ProgressContent;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BluePromptContent implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptContent$MediaContent;", "Lcom/revolut/feature/blue_prompt/BluePromptContent;", "", "toString", "()Ljava/lang/String;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MediaContent extends BluePromptContent {

        @NotNull
        public static final Parcelable.Creator<MediaContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Media f64282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MediaContent((Media) parcel.readParcelable(MediaContent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MediaContent[i];
            }
        }

        public MediaContent(Media media) {
            Intrinsics.checkNotNullParameter(media, "media");
            this.f64282a = media;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MediaContent) && Intrinsics.f(this.f64282a, ((MediaContent) obj2).f64282a);
        }

        public final int hashCode() {
            return this.f64282a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64282a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptContent$NoContent;", "Lcom/revolut/feature/blue_prompt/BluePromptContent;", "<init>", "()V", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoContent extends BluePromptContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoContent f64283a = new NoContent();

        @NotNull
        public static final Parcelable.Creator<NoContent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoContent.f64283a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoContent[i];
            }
        }

        private NoContent() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blue_prompt/BluePromptContent$ProgressContent;", "Lcom/revolut/feature/blue_prompt/BluePromptContent;", "", "toString", "()Ljava/lang/String;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProgressContent extends BluePromptContent {

        @NotNull
        public static final Parcelable.Creator<ProgressContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f64285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f64286c;
        public final BluePromptProgressAnimation d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProgressContent(parcel.readInt(), (Clause) parcel.readParcelable(ProgressContent.class.getClassLoader()), (Clause) parcel.readParcelable(ProgressContent.class.getClassLoader()), parcel.readInt() == 0 ? null : BluePromptProgressAnimation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProgressContent[i];
            }
        }

        public ProgressContent(int i, Clause clause, Clause clause2, BluePromptProgressAnimation bluePromptProgressAnimation) {
            this.f64284a = i;
            this.f64285b = clause;
            this.f64286c = clause2;
            this.d = bluePromptProgressAnimation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProgressContent)) {
                return false;
            }
            ProgressContent progressContent = (ProgressContent) obj2;
            return this.f64284a == progressContent.f64284a && Intrinsics.f(this.f64285b, progressContent.f64285b) && Intrinsics.f(this.f64286c, progressContent.f64286c) && Intrinsics.f(this.d, progressContent.d);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f64284a) * 31;
            Clause clause = this.f64285b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f64286c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            BluePromptProgressAnimation bluePromptProgressAnimation = this.d;
            return iHashCode3 + (bluePromptProgressAnimation != null ? Long.hashCode(bluePromptProgressAnimation.f64287a) : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f64284a);
            dest.writeParcelable(this.f64285b, i);
            dest.writeParcelable(this.f64286c, i);
            BluePromptProgressAnimation bluePromptProgressAnimation = this.d;
            if (bluePromptProgressAnimation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bluePromptProgressAnimation.writeToParcel(dest, i);
            }
        }
    }

    private BluePromptContent() {
    }
}

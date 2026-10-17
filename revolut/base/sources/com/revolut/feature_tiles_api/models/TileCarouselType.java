package com.revolut.feature_tiles_api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "Landroid/os/Parcelable;", "Companion", "a", "ToDo", "ToDoWide", "FincrimeToDo", "FincrimeInReview", "SuggestedForYou", "Miscellaneous", "Lcom/revolut/feature_tiles_api/models/TileCarouselType$FincrimeInReview;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType$FincrimeToDo;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType$Miscellaneous;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType$SuggestedForYou;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType$ToDo;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType$ToDoWide;", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TileCarouselType implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType$FincrimeInReview;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "<init>", "()V", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FincrimeInReview extends TileCarouselType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FincrimeInReview f97828a = new FincrimeInReview();

        @NotNull
        public static final Parcelable.Creator<FincrimeInReview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FincrimeInReview.f97828a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FincrimeInReview[i];
            }
        }

        private FincrimeInReview() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType$FincrimeToDo;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "<init>", "()V", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FincrimeToDo extends TileCarouselType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FincrimeToDo f97829a = new FincrimeToDo();

        @NotNull
        public static final Parcelable.Creator<FincrimeToDo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FincrimeToDo.f97829a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FincrimeToDo[i];
            }
        }

        private FincrimeToDo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType$Miscellaneous;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "", "toString", "()Ljava/lang/String;", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Miscellaneous extends TileCarouselType {

        @NotNull
        public static final Parcelable.Creator<Miscellaneous> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97830a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Miscellaneous(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Miscellaneous[i];
            }
        }

        public Miscellaneous(String misc) {
            Intrinsics.checkNotNullParameter(misc, "misc");
            this.f97830a = misc;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Miscellaneous) && Intrinsics.f(this.f97830a, ((Miscellaneous) obj2).f97830a);
        }

        public final int hashCode() {
            return this.f97830a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97830a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType$SuggestedForYou;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "<init>", "()V", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SuggestedForYou extends TileCarouselType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuggestedForYou f97831a = new SuggestedForYou();

        @NotNull
        public static final Parcelable.Creator<SuggestedForYou> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SuggestedForYou.f97831a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuggestedForYou[i];
            }
        }

        private SuggestedForYou() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType$ToDo;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "<init>", "()V", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ToDo extends TileCarouselType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToDo f97832a = new ToDo();

        @NotNull
        public static final Parcelable.Creator<ToDo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ToDo.f97832a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToDo[i];
            }
        }

        private ToDo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_tiles_api/models/TileCarouselType$ToDoWide;", "Lcom/revolut/feature_tiles_api/models/TileCarouselType;", "<init>", "()V", "feature_tiles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ToDoWide extends TileCarouselType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToDoWide f97833a = new ToDoWide();

        @NotNull
        public static final Parcelable.Creator<ToDoWide> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ToDoWide.f97833a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToDoWide[i];
            }
        }

        private ToDoWide() {
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

    /* JADX INFO: renamed from: com.revolut.feature_tiles_api.models.TileCarouselType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }
}

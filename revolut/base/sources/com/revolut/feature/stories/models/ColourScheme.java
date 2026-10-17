package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/stories/models/ColourScheme;", "Landroid/os/Parcelable;", "DarkScheme", "LightScheme", "Lcom/revolut/feature/stories/models/ColourScheme$DarkScheme;", "Lcom/revolut/feature/stories/models/ColourScheme$LightScheme;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ColourScheme implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88760c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f88761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f88762h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f88763j;
    public final int k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/stories/models/ColourScheme$DarkScheme;", "Lcom/revolut/feature/stories/models/ColourScheme;", "<init>", "()V", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DarkScheme extends ColourScheme {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final DarkScheme f88764l = new DarkScheme();

        @NotNull
        public static final Parcelable.Creator<DarkScheme> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DarkScheme.f88764l;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DarkScheme[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private DarkScheme() {
            int i = R$attr.uikit_colorWhite;
            super(i, i, i, R$attr.uikit_colorWhite_30, i, i, i, i, R$attr.uikit_colorBlack, i, R$attr.uikit_colorWhite_20);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/stories/models/ColourScheme$LightScheme;", "Lcom/revolut/feature/stories/models/ColourScheme;", "<init>", "()V", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LightScheme extends ColourScheme {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final LightScheme f88765l = new LightScheme();

        @NotNull
        public static final Parcelable.Creator<LightScheme> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LightScheme.f88765l;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LightScheme[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private LightScheme() {
            int i = R$attr.uikit_colorBlack;
            super(i, i, i, R$attr.uikit_colorBlack_30, i, i, i, i, R$attr.uikit_colorWhite, i, R$attr.uikit_colorBlack_20);
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

    public ColourScheme(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59) {
        this.f88758a = i;
        this.f88759b = i2;
        this.f88760c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
        this.f88761g = i22;
        this.f88762h = i32;
        this.i = i33;
        this.f88763j = i43;
        this.k = i59;
    }
}

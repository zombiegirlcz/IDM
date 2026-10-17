package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcel;
import android.os.Parcelable;
import bx0.c0;
import bx0.e;
import bx0.t;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.stories.models.StoryPage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StickerStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "StickerPosition", "bx0/t", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StickerStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryPage.WithSticker f58245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f58246c;
    public final Clause d;
    public final Clause e;
    public final LargeActionButton.ButtonStyle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f58247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f58248h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f58249j;
    public final LargeActionButton.ButtonStyle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f58250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f58251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Parcelable f58252n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clause f58253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f58254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Parcelable f58255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StickerView.Content f58256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StickerPosition f58257t;
    public final Clause u;
    public final StoryColours v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StickerStoriesModel$StickerPosition;", "Landroid/os/Parcelable;", "", "TOP", "CENTER", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StickerPosition implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StickerPosition[] $VALUES;
        public static final StickerPosition CENTER;

        @NotNull
        public static final Parcelable.Creator<StickerPosition> CREATOR;
        public static final StickerPosition TOP;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return StickerPosition.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StickerPosition[i];
            }
        }

        static {
            StickerPosition stickerPosition = new StickerPosition("TOP", 0);
            TOP = stickerPosition;
            StickerPosition stickerPosition2 = new StickerPosition("CENTER", 1);
            CENTER = stickerPosition2;
            StickerPosition[] stickerPositionArr = {stickerPosition, stickerPosition2};
            $VALUES = stickerPositionArr;
            $ENTRIES = s.n(stickerPositionArr);
            CREATOR = new a();
        }

        public static StickerPosition valueOf(String str) {
            return (StickerPosition) Enum.valueOf(StickerPosition.class, str);
        }

        public static StickerPosition[] values() {
            return (StickerPosition[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public StickerStoriesModel(String listId, StoryPage.WithSticker withSticker, c0 background, Clause clause, Clause clause2, LargeActionButton.ButtonStyle buttonStyle, Image image, Clause clause3, Parcelable parcelable, boolean z, LargeActionButton.ButtonStyle secondaryButtonStyle, Image image2, Clause clause4, Parcelable parcelable2, e buttonsOrientation, Clause clause5, String str, StickerView.Content stickerContent, StickerPosition stickerPosition, Clause clause6, StoryColours storyColours) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        Intrinsics.checkNotNullParameter(stickerContent, "stickerContent");
        Intrinsics.checkNotNullParameter(stickerPosition, "stickerPosition");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58244a = listId;
        this.f58245b = withSticker;
        this.f58246c = background;
        this.d = clause;
        this.e = clause2;
        this.f = buttonStyle;
        this.f58247g = image;
        this.f58248h = clause3;
        this.i = parcelable;
        this.f58249j = z;
        this.k = secondaryButtonStyle;
        this.f58250l = image2;
        this.f58251m = clause4;
        this.f58252n = parcelable2;
        this.o = buttonsOrientation;
        this.f58253p = clause5;
        this.f58254q = str;
        this.f58255r = null;
        this.f58256s = stickerContent;
        this.f58257t = stickerPosition;
        this.u = clause6;
        this.v = storyColours;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Clause getD() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getV() {
        return this.v;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f58245b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF58244a() {
        return this.f58244a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Clause getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Clause getU() {
        return this.u;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StickerStoriesModel)) {
            return false;
        }
        StickerStoriesModel stickerStoriesModel = (StickerStoriesModel) obj2;
        return Intrinsics.f(this.f58244a, stickerStoriesModel.f58244a) && Intrinsics.f(this.f58245b, stickerStoriesModel.f58245b) && Intrinsics.f(this.f58246c, stickerStoriesModel.f58246c) && Intrinsics.f(this.d, stickerStoriesModel.d) && Intrinsics.f(this.e, stickerStoriesModel.e) && Intrinsics.f(this.f, stickerStoriesModel.f) && Intrinsics.f(this.f58247g, stickerStoriesModel.f58247g) && Intrinsics.f(this.f58248h, stickerStoriesModel.f58248h) && Intrinsics.f(this.i, stickerStoriesModel.i) && this.f58249j == stickerStoriesModel.f58249j && Intrinsics.f(this.k, stickerStoriesModel.k) && Intrinsics.f(this.f58250l, stickerStoriesModel.f58250l) && Intrinsics.f(this.f58251m, stickerStoriesModel.f58251m) && Intrinsics.f(this.f58252n, stickerStoriesModel.f58252n) && this.o == stickerStoriesModel.o && Intrinsics.f(this.f58253p, stickerStoriesModel.f58253p) && Intrinsics.f(this.f58254q, stickerStoriesModel.f58254q) && Intrinsics.f(this.f58255r, stickerStoriesModel.f58255r) && Intrinsics.f(this.f58256s, stickerStoriesModel.f58256s) && this.f58257t == stickerStoriesModel.f58257t && Intrinsics.f(this.u, stickerStoriesModel.u) && Intrinsics.f(this.v, stickerStoriesModel.v);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Parcelable getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF58249j() {
        return this.f58249j;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF58255r() {
        return this.f58255r;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground, reason: from getter */
    public final c0 getF58246c() {
        return this.f58246c;
    }

    public final int hashCode() {
        int iHashCode = this.f58244a.hashCode() * 31;
        StoryPage.WithSticker withSticker = this.f58245b;
        int iHashCode2 = (this.f58246c.hashCode() + ((iHashCode + (withSticker == null ? 0 : withSticker.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iD = b.d(this.f, (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        Image image = this.f58247g;
        int iHashCode4 = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause3 = this.f58248h;
        int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Parcelable parcelable = this.i;
        int iD2 = b.d(this.k, j6.a.c((iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f58249j), 31);
        Image image2 = this.f58250l;
        int iHashCode6 = (iD2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause4 = this.f58251m;
        int iHashCode7 = (iHashCode6 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Parcelable parcelable2 = this.f58252n;
        int iHashCode8 = (this.o.hashCode() + ((iHashCode7 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31)) * 31;
        Clause clause5 = this.f58253p;
        int iHashCode9 = (iHashCode8 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
        String str = this.f58254q;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        Parcelable parcelable3 = this.f58255r;
        int iHashCode11 = (this.f58257t.hashCode() + ((this.f58256s.hashCode() + ((iHashCode10 + (parcelable3 == null ? 0 : parcelable3.hashCode())) * 31)) * 31)) * 31;
        Clause clause6 = this.u;
        return this.v.hashCode() + ((iHashCode11 + (clause6 != null ? clause6.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Image getF58247g() {
        return this.f58247g;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final LargeActionButton.ButtonStyle getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Clause getF58248h() {
        return this.f58248h;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final e getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getF58254q() {
        return this.f58254q;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Clause getF58253p() {
        return this.f58253p;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Parcelable getF58252n() {
        return this.f58252n;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Image getF58250l() {
        return this.f58250l;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final LargeActionButton.ButtonStyle getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Clause getF58251m() {
        return this.f58251m;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final StickerView.Content getF58256s() {
        return this.f58256s;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f58255r = parcelable;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final StickerPosition getF58257t() {
        return this.f58257t;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof StickerStoriesModel ? (StickerStoriesModel) oldItem : null) == null) {
            return null;
        }
        StickerStoriesModel stickerStoriesModel = (StickerStoriesModel) oldItem;
        boolean z = true;
        boolean z3 = !Intrinsics.f(stickerStoriesModel.f58246c, this.f58246c);
        boolean z4 = !Intrinsics.f(stickerStoriesModel.f58256s, this.f58256s);
        if (Intrinsics.f(stickerStoriesModel.f, this.f) && Intrinsics.f(stickerStoriesModel.f58248h, this.f58248h) && Intrinsics.f(stickerStoriesModel.f58247g, this.f58247g)) {
            z = false;
        }
        return new t(z3, z, z4);
    }
}

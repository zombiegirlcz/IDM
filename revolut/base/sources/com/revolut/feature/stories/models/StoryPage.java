package com.revolut.feature.stories.models;

import a4e.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage;", "Landroid/os/Parcelable;", "<init>", "()V", "Simple", "WithVideo", "WithImage", "WithCircleProgress", "WithMultiBarChart", "WithSticker", "Metadata", "Lcom/revolut/feature/stories/models/StoryPage$Metadata;", "Lcom/revolut/feature/stories/models/StoryPage$Simple;", "Lcom/revolut/feature/stories/models/StoryPage$WithCircleProgress;", "Lcom/revolut/feature/stories/models/StoryPage$WithImage;", "Lcom/revolut/feature/stories/models/StoryPage$WithMultiBarChart;", "Lcom/revolut/feature/stories/models/StoryPage$WithSticker;", "Lcom/revolut/feature/stories/models/StoryPage$WithVideo;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoryPage implements Parcelable {

    /* JADX INFO: loaded from: classes7.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$Metadata;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Metadata extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<Metadata> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88798c;
        public final Image d;
        public final ArrayList e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ButtonAction f88799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PageBackground f88800h;
        public final ButtonStyle i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ButtonStyle f88801j;
        public final StoryLink k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b f88802l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Clause f88803m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ColourScheme f88804n;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(Metadata.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(Metadata.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(Metadata.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Metadata(string, clause, clause2, image, arrayList, (Clause) parcel.readParcelable(Metadata.class.getClassLoader()), (ButtonAction) parcel.readParcelable(Metadata.class.getClassLoader()), (PageBackground) parcel.readParcelable(Metadata.class.getClassLoader()), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoryLink.CREATOR.createFromParcel(parcel) : null, b.valueOf(parcel.readString()), (Clause) parcel.readParcelable(Metadata.class.getClassLoader()), (ColourScheme) parcel.readParcelable(Metadata.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Metadata[i];
            }
        }

        public Metadata(String str, Clause clause, Clause clause2, Image image, ArrayList arrayList, Clause clause3, ButtonAction buttonAction, PageBackground pageBackground, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, StoryLink storyLink, b bVar, Clause clause4, ColourScheme colourScheme) {
            this.f88796a = str;
            this.f88797b = clause;
            this.f88798c = clause2;
            this.d = image;
            this.e = arrayList;
            this.f = clause3;
            this.f88799g = buttonAction;
            this.f88800h = pageBackground;
            this.i = buttonStyle;
            this.f88801j = buttonStyle2;
            this.k = storyLink;
            this.f88802l = bVar;
            this.f88803m = clause4;
            this.f88804n = colourScheme;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final Clause getF88803m() {
            return this.f88803m;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final Clause getF88798c() {
            return this.f88798c;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.i;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.f88804n;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.k;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f88801j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PageBackground getF88800h() {
            return this.f88800h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj2;
            return Intrinsics.f(this.f88796a, metadata.f88796a) && Intrinsics.f(this.f88797b, metadata.f88797b) && Intrinsics.f(this.f88798c, metadata.f88798c) && Intrinsics.f(this.d, metadata.d) && this.e.equals(metadata.e) && Intrinsics.f(this.f, metadata.f) && Intrinsics.f(this.f88799g, metadata.f88799g) && Intrinsics.f(this.f88800h, metadata.f88800h) && Intrinsics.f(this.i, metadata.i) && Intrinsics.f(this.f88801j, metadata.f88801j) && Intrinsics.f(this.k, metadata.k) && this.f88802l == metadata.f88802l && Intrinsics.f(this.f88803m, metadata.f88803m) && Intrinsics.f(this.f88804n, metadata.f88804n);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88796a;
        }

        public final List getItems() {
            return this.e;
        }

        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF88797b() {
            return this.f88797b;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f88796a.hashCode() * 31, 31, this.f88797b);
            Clause clause = this.f88798c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.d;
            int iHashCode2 = (this.f88800h.hashCode() + ((this.f88799g.hashCode() + p.a.a(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.f)) * 31)) * 31;
            ButtonStyle buttonStyle = this.i;
            int iHashCode3 = (iHashCode2 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f88801j;
            int iHashCode4 = (iHashCode3 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31;
            StoryLink storyLink = this.k;
            int iHashCode5 = (this.f88802l.hashCode() + ((iHashCode4 + (storyLink == null ? 0 : storyLink.hashCode())) * 31)) * 31;
            Clause clause2 = this.f88803m;
            return this.f88804n.hashCode() + ((iHashCode5 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Clause getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88796a);
            dest.writeParcelable(this.f88797b, i);
            dest.writeParcelable(this.f88798c, i);
            dest.writeParcelable(this.d, i);
            Iterator itY = j6.a.y(this.e, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f88799g, i);
            dest.writeParcelable(this.f88800h, i);
            ButtonStyle buttonStyle = this.i;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f88801j;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            StoryLink storyLink = this.k;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            dest.writeString(this.f88802l.name());
            dest.writeParcelable(this.f88803m, i);
            dest.writeParcelable(this.f88804n, i);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final Image getD() {
            return this.d;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$Simple;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Simple extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<Simple> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88807c;
        public final PageBackground d;
        public final ButtonStyle e;
        public final ButtonStyle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final StoryLink f88808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f88809h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ColourScheme f88810j;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Simple(parcel.readString(), (Clause) parcel.readParcelable(Simple.class.getClassLoader()), (Clause) parcel.readParcelable(Simple.class.getClassLoader()), (PageBackground) parcel.readParcelable(Simple.class.getClassLoader()), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoryLink.CREATOR.createFromParcel(parcel) : null, b.valueOf(parcel.readString()), (Clause) parcel.readParcelable(Simple.class.getClassLoader()), (ColourScheme) parcel.readParcelable(Simple.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Simple[i];
            }
        }

        public Simple(String id10, Clause title, Clause clause, PageBackground background, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, StoryLink storyLink, b buttonsOrientation, Clause clause2, ColourScheme colourScheme) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
            Intrinsics.checkNotNullParameter(colourScheme, "colourScheme");
            this.f88805a = id10;
            this.f88806b = title;
            this.f88807c = clause;
            this.d = background;
            this.e = buttonStyle;
            this.f = buttonStyle2;
            this.f88808g = storyLink;
            this.f88809h = buttonsOrientation;
            this.i = clause2;
            this.f88810j = colourScheme;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.e;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.f88810j;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.f88808g;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) obj2;
            return Intrinsics.f(this.f88805a, simple.f88805a) && Intrinsics.f(this.f88806b, simple.f88806b) && Intrinsics.f(this.f88807c, simple.f88807c) && Intrinsics.f(this.d, simple.d) && Intrinsics.f(this.e, simple.e) && Intrinsics.f(this.f, simple.f) && Intrinsics.f(this.f88808g, simple.f88808g) && this.f88809h == simple.f88809h && Intrinsics.f(this.i, simple.i) && Intrinsics.f(this.f88810j, simple.f88810j);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88805a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f88805a.hashCode() * 31, 31, this.f88806b);
            Clause clause = this.f88807c;
            int iHashCode = (this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            ButtonStyle buttonStyle = this.e;
            int iHashCode2 = (iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f;
            int iHashCode3 = (iHashCode2 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31;
            StoryLink storyLink = this.f88808g;
            int iHashCode4 = (this.f88809h.hashCode() + ((iHashCode3 + (storyLink == null ? 0 : storyLink.hashCode())) * 31)) * 31;
            Clause clause2 = this.i;
            return this.f88810j.hashCode() + ((iHashCode4 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88805a);
            dest.writeParcelable(this.f88806b, i);
            dest.writeParcelable(this.f88807c, i);
            dest.writeParcelable(this.d, i);
            ButtonStyle buttonStyle = this.e;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            StoryLink storyLink = this.f88808g;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            dest.writeString(this.f88809h.name());
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f88810j, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$WithCircleProgress;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithCircleProgress extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<WithCircleProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88813c;
        public final StoryLink d;
        public final ButtonStyle e;
        public final ButtonStyle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f88814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f88815h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PageBackground f88816j;
        public final Clause k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ColourScheme f88817l;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithCircleProgress(parcel.readString(), (Clause) parcel.readParcelable(WithCircleProgress.class.getClassLoader()), (Clause) parcel.readParcelable(WithCircleProgress.class.getClassLoader()), parcel.readInt() == 0 ? null : StoryLink.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonStyle.CREATOR.createFromParcel(parcel) : null, b.valueOf(parcel.readString()), parcel.readInt(), (Clause) parcel.readParcelable(WithCircleProgress.class.getClassLoader()), (PageBackground) parcel.readParcelable(WithCircleProgress.class.getClassLoader()), (Clause) parcel.readParcelable(WithCircleProgress.class.getClassLoader()), (ColourScheme) parcel.readParcelable(WithCircleProgress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithCircleProgress[i];
            }
        }

        public WithCircleProgress(String id10, Clause title, Clause clause, StoryLink storyLink, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, b buttonsOrientation, int i, Clause progressText, PageBackground background, Clause clause2, ColourScheme colourScheme) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
            Intrinsics.checkNotNullParameter(progressText, "progressText");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(colourScheme, "colourScheme");
            this.f88811a = id10;
            this.f88812b = title;
            this.f88813c = clause;
            this.d = storyLink;
            this.e = buttonStyle;
            this.f = buttonStyle2;
            this.f88814g = buttonsOrientation;
            this.f88815h = i;
            this.i = progressText;
            this.f88816j = background;
            this.k = clause2;
            this.f88817l = colourScheme;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.e;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.f88817l;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.d;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithCircleProgress)) {
                return false;
            }
            WithCircleProgress withCircleProgress = (WithCircleProgress) obj2;
            return Intrinsics.f(this.f88811a, withCircleProgress.f88811a) && Intrinsics.f(this.f88812b, withCircleProgress.f88812b) && Intrinsics.f(this.f88813c, withCircleProgress.f88813c) && Intrinsics.f(this.d, withCircleProgress.d) && Intrinsics.f(this.e, withCircleProgress.e) && Intrinsics.f(this.f, withCircleProgress.f) && this.f88814g == withCircleProgress.f88814g && this.f88815h == withCircleProgress.f88815h && Intrinsics.f(this.i, withCircleProgress.i) && Intrinsics.f(this.f88816j, withCircleProgress.f88816j) && Intrinsics.f(this.k, withCircleProgress.k) && Intrinsics.f(this.f88817l, withCircleProgress.f88817l);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88811a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f88811a.hashCode() * 31, 31, this.f88812b);
            Clause clause = this.f88813c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            StoryLink storyLink = this.d;
            int iHashCode2 = (iHashCode + (storyLink == null ? 0 : storyLink.hashCode())) * 31;
            ButtonStyle buttonStyle = this.e;
            int iHashCode3 = (iHashCode2 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f;
            int iHashCode4 = (this.f88816j.hashCode() + p.a.a(j6.a.b(this.f88815h, (this.f88814g.hashCode() + ((iHashCode3 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31)) * 31, 31), 31, this.i)) * 31;
            Clause clause2 = this.k;
            return this.f88817l.hashCode() + ((iHashCode4 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88811a);
            dest.writeParcelable(this.f88812b, i);
            dest.writeParcelable(this.f88813c, i);
            StoryLink storyLink = this.d;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle = this.e;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            dest.writeString(this.f88814g.name());
            dest.writeInt(this.f88815h);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f88816j, i);
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f88817l, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$WithImage;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithImage extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<WithImage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88820c;
        public final StoryLink d;
        public final ButtonStyle e;
        public final ButtonStyle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f88821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f88822h;
        public final PageBackground i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Clause f88823j;
        public final ColourScheme k;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithImage(parcel.readString(), (Clause) parcel.readParcelable(WithImage.class.getClassLoader()), (Clause) parcel.readParcelable(WithImage.class.getClassLoader()), parcel.readInt() == 0 ? null : StoryLink.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonStyle.CREATOR.createFromParcel(parcel) : null, b.valueOf(parcel.readString()), (Image) parcel.readParcelable(WithImage.class.getClassLoader()), (PageBackground) parcel.readParcelable(WithImage.class.getClassLoader()), (Clause) parcel.readParcelable(WithImage.class.getClassLoader()), (ColourScheme) parcel.readParcelable(WithImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithImage[i];
            }
        }

        public WithImage(String id10, Clause title, Clause clause, StoryLink storyLink, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, b buttonsOrientation, Image contentImage, PageBackground background, Clause clause2, ColourScheme colourScheme) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
            Intrinsics.checkNotNullParameter(contentImage, "contentImage");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(colourScheme, "colourScheme");
            this.f88818a = id10;
            this.f88819b = title;
            this.f88820c = clause;
            this.d = storyLink;
            this.e = buttonStyle;
            this.f = buttonStyle2;
            this.f88821g = buttonsOrientation;
            this.f88822h = contentImage;
            this.i = background;
            this.f88823j = clause2;
            this.k = colourScheme;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.e;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.k;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.d;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithImage)) {
                return false;
            }
            WithImage withImage = (WithImage) obj2;
            return Intrinsics.f(this.f88818a, withImage.f88818a) && Intrinsics.f(this.f88819b, withImage.f88819b) && Intrinsics.f(this.f88820c, withImage.f88820c) && Intrinsics.f(this.d, withImage.d) && Intrinsics.f(this.e, withImage.e) && Intrinsics.f(this.f, withImage.f) && this.f88821g == withImage.f88821g && Intrinsics.f(this.f88822h, withImage.f88822h) && Intrinsics.f(this.i, withImage.i) && Intrinsics.f(this.f88823j, withImage.f88823j) && Intrinsics.f(this.k, withImage.k);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88818a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f88818a.hashCode() * 31, 31, this.f88819b);
            Clause clause = this.f88820c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            StoryLink storyLink = this.d;
            int iHashCode2 = (iHashCode + (storyLink == null ? 0 : storyLink.hashCode())) * 31;
            ButtonStyle buttonStyle = this.e;
            int iHashCode3 = (iHashCode2 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f;
            int iHashCode4 = (this.i.hashCode() + a10.b.c(this.f88822h, (this.f88821g.hashCode() + ((iHashCode3 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31)) * 31, 31)) * 31;
            Clause clause2 = this.f88823j;
            return this.k.hashCode() + ((iHashCode4 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88818a);
            dest.writeParcelable(this.f88819b, i);
            dest.writeParcelable(this.f88820c, i);
            StoryLink storyLink = this.d;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle = this.e;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            dest.writeString(this.f88821g.name());
            dest.writeParcelable(this.f88822h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f88823j, i);
            dest.writeParcelable(this.k, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$WithMultiBarChart;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithMultiBarChart extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<WithMultiBarChart> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88826c;
        public final StoryLink d;
        public final ButtonStyle e;
        public final ButtonStyle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f88827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f88828h;
        public final MultiBarTooltip i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PageBackground f88829j;
        public final Clause k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ColourScheme f88830l;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(WithMultiBarChart.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(WithMultiBarChart.class.getClassLoader());
                StoryLink storyLinkCreateFromParcel = parcel.readInt() == 0 ? null : StoryLink.CREATOR.createFromParcel(parcel);
                ButtonStyle buttonStyleCreateFromParcel = parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel);
                ButtonStyle buttonStyleCreateFromParcel2 = parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel);
                b bVarValueOf = b.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(MultiBarItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new WithMultiBarChart(string, clause, clause2, storyLinkCreateFromParcel, buttonStyleCreateFromParcel, buttonStyleCreateFromParcel2, bVarValueOf, arrayList, parcel.readInt() != 0 ? MultiBarTooltip.CREATOR.createFromParcel(parcel) : null, (PageBackground) parcel.readParcelable(WithMultiBarChart.class.getClassLoader()), (Clause) parcel.readParcelable(WithMultiBarChart.class.getClassLoader()), (ColourScheme) parcel.readParcelable(WithMultiBarChart.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithMultiBarChart[i];
            }
        }

        public WithMultiBarChart(String id10, Clause title, Clause clause, StoryLink storyLink, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, b buttonsOrientation, ArrayList multiBarItems, MultiBarTooltip multiBarTooltip, PageBackground background, Clause clause2, ColourScheme colourScheme) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
            Intrinsics.checkNotNullParameter(multiBarItems, "multiBarItems");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(colourScheme, "colourScheme");
            this.f88824a = id10;
            this.f88825b = title;
            this.f88826c = clause;
            this.d = storyLink;
            this.e = buttonStyle;
            this.f = buttonStyle2;
            this.f88827g = buttonsOrientation;
            this.f88828h = multiBarItems;
            this.i = multiBarTooltip;
            this.f88829j = background;
            this.k = clause2;
            this.f88830l = colourScheme;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.e;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.f88830l;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.d;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithMultiBarChart)) {
                return false;
            }
            WithMultiBarChart withMultiBarChart = (WithMultiBarChart) obj2;
            return Intrinsics.f(this.f88824a, withMultiBarChart.f88824a) && Intrinsics.f(this.f88825b, withMultiBarChart.f88825b) && Intrinsics.f(this.f88826c, withMultiBarChart.f88826c) && Intrinsics.f(this.d, withMultiBarChart.d) && Intrinsics.f(this.e, withMultiBarChart.e) && Intrinsics.f(this.f, withMultiBarChart.f) && this.f88827g == withMultiBarChart.f88827g && this.f88828h.equals(withMultiBarChart.f88828h) && Intrinsics.f(this.i, withMultiBarChart.i) && Intrinsics.f(this.f88829j, withMultiBarChart.f88829j) && Intrinsics.f(this.k, withMultiBarChart.k) && Intrinsics.f(this.f88830l, withMultiBarChart.f88830l);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88824a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f88824a.hashCode() * 31, 31, this.f88825b);
            Clause clause = this.f88826c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            StoryLink storyLink = this.d;
            int iHashCode2 = (iHashCode + (storyLink == null ? 0 : storyLink.hashCode())) * 31;
            ButtonStyle buttonStyle = this.e;
            int iHashCode3 = (iHashCode2 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88828h, (this.f88827g.hashCode() + ((iHashCode3 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31)) * 31, 31);
            MultiBarTooltip multiBarTooltip = this.i;
            int iHashCode4 = (this.f88829j.hashCode() + ((iB + (multiBarTooltip == null ? 0 : multiBarTooltip.hashCode())) * 31)) * 31;
            Clause clause2 = this.k;
            return this.f88830l.hashCode() + ((iHashCode4 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88824a);
            dest.writeParcelable(this.f88825b, i);
            dest.writeParcelable(this.f88826c, i);
            StoryLink storyLink = this.d;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle = this.e;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            dest.writeString(this.f88827g.name());
            Iterator itY = j6.a.y(this.f88828h, dest);
            while (itY.hasNext()) {
                ((MultiBarItem) itY.next()).writeToParcel(dest, i);
            }
            MultiBarTooltip multiBarTooltip = this.i;
            if (multiBarTooltip == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                multiBarTooltip.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f88829j, i);
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f88830l, i);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$WithSticker;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithSticker extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<WithSticker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88833c;
        public final StoryLink d;
        public final ButtonStyle e;
        public final ButtonStyle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f88834g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PageBackground f88835h;
        public final StickerView.Content i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final StickerPosition f88836j;
        public final Clause k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ButtonAction f88837l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Clause f88838m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ColourScheme f88839n;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithSticker(parcel.readString(), (Clause) parcel.readParcelable(WithSticker.class.getClassLoader()), (Clause) parcel.readParcelable(WithSticker.class.getClassLoader()), parcel.readInt() == 0 ? null : StoryLink.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonStyle.CREATOR.createFromParcel(parcel) : null, b.valueOf(parcel.readString()), (PageBackground) parcel.readParcelable(WithSticker.class.getClassLoader()), (StickerView.Content) parcel.readParcelable(WithSticker.class.getClassLoader()), StickerPosition.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(WithSticker.class.getClassLoader()), (ButtonAction) parcel.readParcelable(WithSticker.class.getClassLoader()), (Clause) parcel.readParcelable(WithSticker.class.getClassLoader()), (ColourScheme) parcel.readParcelable(WithSticker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithSticker[i];
            }
        }

        public WithSticker(String id10, Clause clause, Clause clause2, StoryLink storyLink, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, b buttonsOrientation, PageBackground background, StickerView.Content stickerContent, StickerPosition stickerPosition, Clause clause3, ButtonAction buttonAction, Clause clause4, ColourScheme colourScheme) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(stickerContent, "stickerContent");
            Intrinsics.checkNotNullParameter(stickerPosition, "stickerPosition");
            Intrinsics.checkNotNullParameter(colourScheme, "colourScheme");
            this.f88831a = id10;
            this.f88832b = clause;
            this.f88833c = clause2;
            this.d = storyLink;
            this.e = buttonStyle;
            this.f = buttonStyle2;
            this.f88834g = buttonsOrientation;
            this.f88835h = background;
            this.i = stickerContent;
            this.f88836j = stickerPosition;
            this.k = clause3;
            this.f88837l = buttonAction;
            this.f88838m = clause4;
            this.f88839n = colourScheme;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final StickerView.Content getI() {
            return this.i;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final StickerPosition getF88836j() {
            return this.f88836j;
        }

        /* JADX INFO: renamed from: W, reason: from getter */
        public final Clause getF88838m() {
            return this.f88838m;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.e;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.f88839n;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: c0, reason: from getter */
        public final Clause getF88833c() {
            return this.f88833c;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PageBackground getF88835h() {
            return this.f88835h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithSticker)) {
                return false;
            }
            WithSticker withSticker = (WithSticker) obj2;
            return Intrinsics.f(this.f88831a, withSticker.f88831a) && Intrinsics.f(this.f88832b, withSticker.f88832b) && Intrinsics.f(this.f88833c, withSticker.f88833c) && Intrinsics.f(this.d, withSticker.d) && Intrinsics.f(this.e, withSticker.e) && Intrinsics.f(this.f, withSticker.f) && this.f88834g == withSticker.f88834g && Intrinsics.f(this.f88835h, withSticker.f88835h) && Intrinsics.f(this.i, withSticker.i) && this.f88836j == withSticker.f88836j && Intrinsics.f(this.k, withSticker.k) && Intrinsics.f(this.f88837l, withSticker.f88837l) && Intrinsics.f(this.f88838m, withSticker.f88838m) && Intrinsics.f(this.f88839n, withSticker.f88839n);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88831a;
        }

        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF88832b() {
            return this.f88832b;
        }

        public final int hashCode() {
            int iHashCode = this.f88831a.hashCode() * 31;
            Clause clause = this.f88832b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f88833c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            StoryLink storyLink = this.d;
            int iHashCode4 = (iHashCode3 + (storyLink == null ? 0 : storyLink.hashCode())) * 31;
            ButtonStyle buttonStyle = this.e;
            int iHashCode5 = (iHashCode4 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f;
            int iHashCode6 = (this.f88836j.hashCode() + ((this.i.hashCode() + ((this.f88835h.hashCode() + ((this.f88834g.hashCode() + ((iHashCode5 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
            Clause clause3 = this.k;
            int iHashCode7 = (iHashCode6 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            ButtonAction buttonAction = this.f88837l;
            int iHashCode8 = (iHashCode7 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            Clause clause4 = this.f88838m;
            return this.f88839n.hashCode() + ((iHashCode8 + (clause4 != null ? clause4.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Clause getK() {
            return this.k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88831a);
            dest.writeParcelable(this.f88832b, i);
            dest.writeParcelable(this.f88833c, i);
            StoryLink storyLink = this.d;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle = this.e;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            dest.writeString(this.f88834g.name());
            dest.writeParcelable(this.f88835h, i);
            dest.writeParcelable(this.i, i);
            this.f88836j.writeToParcel(dest, i);
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f88837l, i);
            dest.writeParcelable(this.f88838m, i);
            dest.writeParcelable(this.f88839n, i);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final b getF88834g() {
            return this.f88834g;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryPage$WithVideo;", "Lcom/revolut/feature/stories/models/StoryPage;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class WithVideo extends StoryPage {

        @NotNull
        public static final Parcelable.Creator<WithVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f88842c;
        public final StoryLink d;
        public final ButtonStyle e;
        public final ButtonStyle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f88843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f88844h;
        public final PageBackground i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Clause f88845j;
        public final ColourScheme k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithVideo(parcel.readString(), (Clause) parcel.readParcelable(WithVideo.class.getClassLoader()), (Clause) parcel.readParcelable(WithVideo.class.getClassLoader()), parcel.readInt() == 0 ? null : StoryLink.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonStyle.CREATOR.createFromParcel(parcel) : null, b.valueOf(parcel.readString()), (Image) parcel.readParcelable(WithVideo.class.getClassLoader()), (PageBackground) parcel.readParcelable(WithVideo.class.getClassLoader()), (Clause) parcel.readParcelable(WithVideo.class.getClassLoader()), (ColourScheme) parcel.readParcelable(WithVideo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithVideo[i];
            }
        }

        public WithVideo(String id10, Clause title, Clause clause, StoryLink storyLink, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, b buttonsOrientation, Image image, PageBackground background, Clause clause2, ColourScheme colourScheme) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(colourScheme, "colourScheme");
            this.f88840a = id10;
            this.f88841b = title;
            this.f88842c = clause;
            this.d = storyLink;
            this.e = buttonStyle;
            this.f = buttonStyle2;
            this.f88843g = buttonsOrientation;
            this.f88844h = image;
            this.i = background;
            this.f88845j = clause2;
            this.k = colourScheme;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonStyle getE() {
            return this.e;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColourScheme getK() {
            return this.k;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: c, reason: from getter */
        public final StoryLink getD() {
            return this.d;
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonStyle getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithVideo)) {
                return false;
            }
            WithVideo withVideo = (WithVideo) obj2;
            return Intrinsics.f(this.f88840a, withVideo.f88840a) && Intrinsics.f(this.f88841b, withVideo.f88841b) && Intrinsics.f(this.f88842c, withVideo.f88842c) && Intrinsics.f(this.d, withVideo.d) && Intrinsics.f(this.e, withVideo.e) && Intrinsics.f(this.f, withVideo.f) && this.f88843g == withVideo.f88843g && Intrinsics.f(this.f88844h, withVideo.f88844h) && Intrinsics.f(this.i, withVideo.i) && Intrinsics.f(this.f88845j, withVideo.f88845j) && Intrinsics.f(this.k, withVideo.k);
        }

        @Override // com.revolut.feature.stories.models.StoryPage
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF88840a() {
            return this.f88840a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f88840a.hashCode() * 31, 31, this.f88841b);
            Clause clause = this.f88842c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            StoryLink storyLink = this.d;
            int iHashCode2 = (iHashCode + (storyLink == null ? 0 : storyLink.hashCode())) * 31;
            ButtonStyle buttonStyle = this.e;
            int iHashCode3 = (iHashCode2 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            ButtonStyle buttonStyle2 = this.f;
            int iHashCode4 = (this.f88843g.hashCode() + ((iHashCode3 + (buttonStyle2 == null ? 0 : buttonStyle2.hashCode())) * 31)) * 31;
            Image image = this.f88844h;
            int iHashCode5 = (this.i.hashCode() + ((iHashCode4 + (image == null ? 0 : image.hashCode())) * 31)) * 31;
            Clause clause2 = this.f88845j;
            return this.k.hashCode() + ((iHashCode5 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88840a);
            dest.writeParcelable(this.f88841b, i);
            dest.writeParcelable(this.f88842c, i);
            StoryLink storyLink = this.d;
            if (storyLink == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                storyLink.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle = this.e;
            if (buttonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle.writeToParcel(dest, i);
            }
            ButtonStyle buttonStyle2 = this.f;
            if (buttonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonStyle2.writeToParcel(dest, i);
            }
            dest.writeString(this.f88843g.name());
            dest.writeParcelable(this.f88844h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f88845j, i);
            dest.writeParcelable(this.k, i);
        }
    }

    private StoryPage() {
    }

    /* JADX INFO: renamed from: a */
    public abstract ButtonStyle getE();

    /* JADX INFO: renamed from: b */
    public abstract ColourScheme getK();

    /* JADX INFO: renamed from: c */
    public abstract StoryLink getD();

    /* JADX INFO: renamed from: d */
    public abstract ButtonStyle getF();

    /* JADX INFO: renamed from: getId */
    public abstract String getF88840a();
}

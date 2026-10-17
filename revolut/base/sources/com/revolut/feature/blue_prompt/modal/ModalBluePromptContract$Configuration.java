package com.revolut.feature.blue_prompt.modal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.blue_prompt.BluePromptBackgroundType;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ks2.e;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/blue_prompt/modal/ModalBluePromptContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ModalBluePromptContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ModalBluePromptContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f64319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f64320c;
    public final BluePromptContent d;
    public final BluePromptBackgroundType e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f64321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f64322h;
    public final Image i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Image f64323j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f64324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NaviCommand f64325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final NaviCommand f64326n;
    public final LargeActionButton.ButtonStyle o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f64327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsContext f64328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AnalyticsContext f64329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NaviCommand f64330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final NaviCommand f64331t;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModalBluePromptContract$Configuration(parcel.readString(), (Clause) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (BluePromptContent) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (BluePromptBackgroundType) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (ResourceImage) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), e.valueOf(parcel.readString()), (Image) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (Image) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (LargeActionButton.ButtonStyle) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (LargeActionButton.ButtonStyle) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ModalBluePromptContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ModalBluePromptContract$Configuration[i];
        }
    }

    public ModalBluePromptContract$Configuration(String str, Clause title, Clause description, BluePromptContent content, BluePromptBackgroundType background, ResourceImage resourceImage, Clause clause, e buttonsStyle, Image image, Image image2, Clause clause2, Clause clause3, NaviCommand naviCommand, NaviCommand naviCommand2, LargeActionButton.ButtonStyle primaryActionStyle, LargeActionButton.ButtonStyle secondaryActionStyle, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, NaviCommand naviCommand3, NaviCommand naviCommand4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(primaryActionStyle, "primaryActionStyle");
        Intrinsics.checkNotNullParameter(secondaryActionStyle, "secondaryActionStyle");
        this.f64318a = str;
        this.f64319b = title;
        this.f64320c = description;
        this.d = content;
        this.e = background;
        this.f = resourceImage;
        this.f64321g = clause;
        this.f64322h = buttonsStyle;
        this.i = image;
        this.f64323j = image2;
        this.k = clause2;
        this.f64324l = clause3;
        this.f64325m = naviCommand;
        this.f64326n = naviCommand2;
        this.o = primaryActionStyle;
        this.f64327p = secondaryActionStyle;
        this.f64328q = analyticsContext;
        this.f64329r = analyticsContext2;
        this.f64330s = naviCommand3;
        this.f64331t = naviCommand4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ModalBluePromptContract$Configuration)) {
            return false;
        }
        ModalBluePromptContract$Configuration modalBluePromptContract$Configuration = (ModalBluePromptContract$Configuration) obj2;
        return Intrinsics.f(this.f64318a, modalBluePromptContract$Configuration.f64318a) && Intrinsics.f(this.f64319b, modalBluePromptContract$Configuration.f64319b) && Intrinsics.f(this.f64320c, modalBluePromptContract$Configuration.f64320c) && Intrinsics.f(this.d, modalBluePromptContract$Configuration.d) && Intrinsics.f(this.e, modalBluePromptContract$Configuration.e) && Intrinsics.f(this.f, modalBluePromptContract$Configuration.f) && Intrinsics.f(this.f64321g, modalBluePromptContract$Configuration.f64321g) && this.f64322h == modalBluePromptContract$Configuration.f64322h && Intrinsics.f(this.i, modalBluePromptContract$Configuration.i) && Intrinsics.f(this.f64323j, modalBluePromptContract$Configuration.f64323j) && Intrinsics.f(this.k, modalBluePromptContract$Configuration.k) && Intrinsics.f(this.f64324l, modalBluePromptContract$Configuration.f64324l) && Intrinsics.f(this.f64325m, modalBluePromptContract$Configuration.f64325m) && Intrinsics.f(this.f64326n, modalBluePromptContract$Configuration.f64326n) && Intrinsics.f(this.o, modalBluePromptContract$Configuration.o) && Intrinsics.f(this.f64327p, modalBluePromptContract$Configuration.f64327p) && Intrinsics.f(this.f64328q, modalBluePromptContract$Configuration.f64328q) && Intrinsics.f(this.f64329r, modalBluePromptContract$Configuration.f64329r) && Intrinsics.f(this.f64330s, modalBluePromptContract$Configuration.f64330s) && Intrinsics.f(this.f64331t, modalBluePromptContract$Configuration.f64331t);
    }

    public final int hashCode() {
        String str = this.f64318a;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.a(p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f64319b), 31, this.f64320c)) * 31)) * 31;
        ResourceImage resourceImage = this.f;
        int iHashCode2 = (iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31;
        Clause clause = this.f64321g;
        int iHashCode3 = (this.f64322h.hashCode() + ((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Image image = this.i;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f64323j;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause2 = this.k;
        int iHashCode6 = (iHashCode5 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f64324l;
        int iHashCode7 = (iHashCode6 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        NaviCommand naviCommand = this.f64325m;
        int iHashCode8 = (iHashCode7 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        NaviCommand naviCommand2 = this.f64326n;
        int iD = b.d(this.f64327p, b.d(this.o, (iHashCode8 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31, 31), 31);
        AnalyticsContext analyticsContext = this.f64328q;
        int iA = (iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        AnalyticsContext analyticsContext2 = this.f64329r;
        int iA2 = (iA + (analyticsContext2 == null ? 0 : AnalyticsContext.a(analyticsContext2.f50296a))) * 31;
        NaviCommand naviCommand3 = this.f64330s;
        int iHashCode9 = (iA2 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31;
        NaviCommand naviCommand4 = this.f64331t;
        return iHashCode9 + (naviCommand4 != null ? naviCommand4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64318a);
        dest.writeParcelable(this.f64319b, i);
        dest.writeParcelable(this.f64320c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f64321g, i);
        dest.writeString(this.f64322h.name());
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f64323j, i);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f64324l, i);
        dest.writeParcelable(this.f64325m, i);
        dest.writeParcelable(this.f64326n, i);
        dest.writeParcelable(this.o, i);
        dest.writeParcelable(this.f64327p, i);
        dest.writeParcelable(this.f64328q, i);
        dest.writeParcelable(this.f64329r, i);
        dest.writeParcelable(this.f64330s, i);
        dest.writeParcelable(this.f64331t, i);
    }
}

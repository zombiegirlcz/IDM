package com.revolut.feature.blue_prompt.fullscreen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ks2.e;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration", "Landroid/os/Parcelable;", "Basic", "Custom", "Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration$Basic;", "Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration$Custom;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BluePromptContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration$Basic;", "Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Basic extends BluePromptContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Basic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f64295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f64296c;
        public final BluePromptContent d;
        public final ResourceImage e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f64297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f64298h;
        public final e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Image f64299j;
        public final Image k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Clause f64300l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Clause f64301m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final LargeActionButton.ButtonStyle f64302n;
        public final NaviCommand o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final NaviCommand f64303p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final NaviCommand f64304q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final NaviCommand f64305r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Parcelable f64306s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f64307t;
        public final AnalyticsProduct u;
        public final AnalyticsContext v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final AnalyticsContext f64308w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f64309x;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                AnalyticsProduct analyticsProduct;
                LargeActionButton.ButtonStyle buttonStyle;
                NaviCommand naviCommand;
                NaviCommand naviCommand2;
                NaviCommand naviCommand3;
                NaviCommand naviCommand4;
                Parcelable parcelable;
                AnalyticsContext analyticsContext;
                AnalyticsContext analyticsContext2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(Basic.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(Basic.class.getClassLoader());
                BluePromptContent bluePromptContent = (BluePromptContent) parcel.readParcelable(Basic.class.getClassLoader());
                ResourceImage resourceImage = (ResourceImage) parcel.readParcelable(Basic.class.getClassLoader());
                NaviCommand naviCommand5 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                Clause clause3 = (Clause) parcel.readParcelable(Basic.class.getClassLoader());
                Clause clause4 = (Clause) parcel.readParcelable(Basic.class.getClassLoader());
                e eVarValueOf = e.valueOf(parcel.readString());
                Image image = (Image) parcel.readParcelable(Basic.class.getClassLoader());
                Image image2 = (Image) parcel.readParcelable(Basic.class.getClassLoader());
                Clause clause5 = (Clause) parcel.readParcelable(Basic.class.getClassLoader());
                Clause clause6 = (Clause) parcel.readParcelable(Basic.class.getClassLoader());
                LargeActionButton.ButtonStyle buttonStyle2 = (LargeActionButton.ButtonStyle) parcel.readParcelable(Basic.class.getClassLoader());
                NaviCommand naviCommand6 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                NaviCommand naviCommand7 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                NaviCommand naviCommand8 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                NaviCommand naviCommand9 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                Parcelable parcelable2 = parcel.readParcelable(Basic.class.getClassLoader());
                boolean z3 = parcel.readInt() != 0;
                AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(Basic.class.getClassLoader());
                AnalyticsContext analyticsContext3 = (AnalyticsContext) parcel.readParcelable(Basic.class.getClassLoader());
                AnalyticsContext analyticsContext4 = (AnalyticsContext) parcel.readParcelable(Basic.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    analyticsProduct = analyticsProduct2;
                    z = true;
                    buttonStyle = buttonStyle2;
                    naviCommand = naviCommand6;
                    naviCommand2 = naviCommand7;
                    naviCommand3 = naviCommand8;
                    naviCommand4 = naviCommand9;
                    parcelable = parcelable2;
                    analyticsContext2 = analyticsContext4;
                    analyticsContext = analyticsContext3;
                } else {
                    z = false;
                    analyticsProduct = analyticsProduct2;
                    buttonStyle = buttonStyle2;
                    naviCommand = naviCommand6;
                    naviCommand2 = naviCommand7;
                    naviCommand3 = naviCommand8;
                    naviCommand4 = naviCommand9;
                    parcelable = parcelable2;
                    analyticsContext = analyticsContext3;
                    analyticsContext2 = analyticsContext4;
                }
                return new Basic(string, clause, clause2, bluePromptContent, resourceImage, naviCommand5, clause3, clause4, eVarValueOf, image, image2, clause5, clause6, buttonStyle, naviCommand, naviCommand2, naviCommand3, naviCommand4, parcelable, z3, analyticsProduct, analyticsContext, analyticsContext2, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Basic[i];
            }
        }

        public Basic(String str, Clause title, Clause description, BluePromptContent content, ResourceImage resourceImage, NaviCommand naviCommand, Clause clause, Clause clause2, e buttonsStyle, Image image, Image image2, Clause clause3, Clause clause4, LargeActionButton.ButtonStyle secondaryActionStyle, NaviCommand naviCommand2, NaviCommand naviCommand3, NaviCommand naviCommand4, NaviCommand naviCommand5, Parcelable parcelable, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, boolean z3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
            Intrinsics.checkNotNullParameter(secondaryActionStyle, "secondaryActionStyle");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f64294a = str;
            this.f64295b = title;
            this.f64296c = description;
            this.d = content;
            this.e = resourceImage;
            this.f = naviCommand;
            this.f64297g = clause;
            this.f64298h = clause2;
            this.i = buttonsStyle;
            this.f64299j = image;
            this.k = image2;
            this.f64300l = clause3;
            this.f64301m = clause4;
            this.f64302n = secondaryActionStyle;
            this.o = naviCommand2;
            this.f64303p = naviCommand3;
            this.f64304q = naviCommand4;
            this.f64305r = naviCommand5;
            this.f64306s = parcelable;
            this.f64307t = z;
            this.u = analyticsProduct;
            this.v = analyticsContext;
            this.f64308w = analyticsContext2;
            this.f64309x = z3;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.u;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF64310a() {
            return this.f64294a;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Parcelable getF64311b() {
            return this.f64306s;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF64312c() {
            return this.f64307t;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF() {
            return this.f64309x;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Basic)) {
                return false;
            }
            Basic basic = (Basic) obj2;
            return Intrinsics.f(this.f64294a, basic.f64294a) && Intrinsics.f(this.f64295b, basic.f64295b) && Intrinsics.f(this.f64296c, basic.f64296c) && Intrinsics.f(this.d, basic.d) && Intrinsics.f(this.e, basic.e) && Intrinsics.f(this.f, basic.f) && Intrinsics.f(this.f64297g, basic.f64297g) && Intrinsics.f(this.f64298h, basic.f64298h) && this.i == basic.i && Intrinsics.f(this.f64299j, basic.f64299j) && Intrinsics.f(this.k, basic.k) && Intrinsics.f(this.f64300l, basic.f64300l) && Intrinsics.f(this.f64301m, basic.f64301m) && Intrinsics.f(this.f64302n, basic.f64302n) && Intrinsics.f(this.o, basic.o) && Intrinsics.f(this.f64303p, basic.f64303p) && Intrinsics.f(this.f64304q, basic.f64304q) && Intrinsics.f(this.f64305r, basic.f64305r) && Intrinsics.f(this.f64306s, basic.f64306s) && this.f64307t == basic.f64307t && Intrinsics.f(this.u, basic.u) && Intrinsics.f(this.v, basic.v) && Intrinsics.f(this.f64308w, basic.f64308w) && this.f64309x == basic.f64309x;
        }

        public final int hashCode() {
            String str = this.f64294a;
            int iHashCode = (this.d.hashCode() + p.a.a(p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f64295b), 31, this.f64296c)) * 31;
            ResourceImage resourceImage = this.e;
            int iHashCode2 = (iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31;
            NaviCommand naviCommand = this.f;
            int iHashCode3 = (iHashCode2 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            Clause clause = this.f64297g;
            int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f64298h;
            int iHashCode5 = (this.i.hashCode() + ((iHashCode4 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31;
            Image image = this.f64299j;
            int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.k;
            int iHashCode7 = (iHashCode6 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Clause clause3 = this.f64300l;
            int iHashCode8 = (iHashCode7 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.f64301m;
            int iD = b.d(this.f64302n, (iHashCode8 + (clause4 == null ? 0 : clause4.hashCode())) * 31, 31);
            NaviCommand naviCommand2 = this.o;
            int iHashCode9 = (iD + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
            NaviCommand naviCommand3 = this.f64303p;
            int iHashCode10 = (iHashCode9 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31;
            NaviCommand naviCommand4 = this.f64304q;
            int iHashCode11 = (iHashCode10 + (naviCommand4 == null ? 0 : naviCommand4.hashCode())) * 31;
            NaviCommand naviCommand5 = this.f64305r;
            int iHashCode12 = (iHashCode11 + (naviCommand5 == null ? 0 : naviCommand5.hashCode())) * 31;
            Parcelable parcelable = this.f64306s;
            int iA = l.a(j6.a.c((iHashCode12 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f64307t), 31, this.u);
            AnalyticsContext analyticsContext = this.v;
            int iA2 = (iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
            AnalyticsContext analyticsContext2 = this.f64308w;
            return Boolean.hashCode(this.f64309x) + ((iA2 + (analyticsContext2 != null ? AnalyticsContext.a(analyticsContext2.f50296a) : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64294a);
            dest.writeParcelable(this.f64295b, i);
            dest.writeParcelable(this.f64296c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f64297g, i);
            dest.writeParcelable(this.f64298h, i);
            dest.writeString(this.i.name());
            dest.writeParcelable(this.f64299j, i);
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f64300l, i);
            dest.writeParcelable(this.f64301m, i);
            dest.writeParcelable(this.f64302n, i);
            dest.writeParcelable(this.o, i);
            dest.writeParcelable(this.f64303p, i);
            dest.writeParcelable(this.f64304q, i);
            dest.writeParcelable(this.f64305r, i);
            dest.writeParcelable(this.f64306s, i);
            dest.writeInt(this.f64307t ? 1 : 0);
            dest.writeParcelable(this.u, i);
            dest.writeParcelable(this.v, i);
            dest.writeParcelable(this.f64308w, i);
            dest.writeInt(this.f64309x ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration$Custom;", "Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends BluePromptContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f64311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64312c;
        public final Integer d;
        public final AnalyticsProduct e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Integer num;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Parcelable parcelable = parcel.readParcelable(Custom.class.getClassLoader());
                boolean z3 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(Custom.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    num = numValueOf;
                    z = true;
                } else {
                    Integer num2 = numValueOf;
                    z = false;
                    num = num2;
                }
                return new Custom(string, parcelable, z3, num, analyticsProduct, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(String str, Parcelable parcelable, boolean z, Integer num, AnalyticsProduct analyticsProduct, boolean z3) {
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f64310a = str;
            this.f64311b = parcelable;
            this.f64312c = z;
            this.d = num;
            this.e = analyticsProduct;
            this.f = z3;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getD() {
            return this.d;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF64310a() {
            return this.f64310a;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Parcelable getF64311b() {
            return this.f64311b;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF64312c() {
            return this.f64312c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj2;
            return Intrinsics.f(this.f64310a, custom.f64310a) && Intrinsics.f(this.f64311b, custom.f64311b) && this.f64312c == custom.f64312c && Intrinsics.f(this.d, custom.d) && Intrinsics.f(this.e, custom.e) && this.f == custom.f;
        }

        public final int hashCode() {
            String str = this.f64310a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Parcelable parcelable = this.f64311b;
            int iC = j6.a.c((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f64312c);
            Integer num = this.d;
            return Boolean.hashCode(this.f) + l.a((iC + (num != null ? num.hashCode() : 0)) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64310a);
            dest.writeParcelable(this.f64311b, i);
            dest.writeInt(this.f64312c ? 1 : 0);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract AnalyticsProduct getE();

    /* JADX INFO: renamed from: a */
    public Integer getD() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract String getF64310a();

    /* JADX INFO: renamed from: c */
    public abstract Parcelable getF64311b();

    /* JADX INFO: renamed from: d */
    public abstract boolean getF64312c();

    /* JADX INFO: renamed from: e */
    public abstract boolean getF();
}

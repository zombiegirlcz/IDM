package com.revolut.core.ui_kit.delegates;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.l40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/rd;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromptMarketingContentDelegate extends BaseRecyclerViewDelegate<Model, rd> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53079c;
    public final ihm.f d;
    public final ihm.f e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f53080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f53081h;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u000b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/os/Parcelable;", "Lny0/h;", "", "toString", "()Ljava/lang/String;", "Content", "BackgroundType", "AnimationType", "com/revolut/core/ui_kit/delegates/pd", "com/revolut/core/ui_kit/delegates/ld", "com/revolut/core/ui_kit/delegates/kd", "com/revolut/core/ui_kit/delegates/id", "com/revolut/core/ui_kit/delegates/nd", "Button", "Footer", "com/revolut/core/ui_kit/delegates/od", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem, Parcelable, ny0.h {

        @NotNull
        public static final Parcelable.Creator<Model> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53084c;
        public final Content d;
        public final BackgroundType e;
        public final pd f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ResourceImage f53085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ld f53086h;
        public final kd i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Button f53087j;
        public final Button k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final id f53088l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Footer f53089m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f53090n;
        public Parcelable o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f53091p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f53092q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Clause f53093r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final AnimationType f53094s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final AnimationRequest f53095t;
        public final Clause u;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType;", "Landroid/os/Parcelable;", "SlideInAndFadeIn", "SlideInWithReveal", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType$SlideInAndFadeIn;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType$SlideInWithReveal;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface AnimationType extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType$SlideInAndFadeIn;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SlideInAndFadeIn implements AnimationType {

                @NotNull
                public static final Parcelable.Creator<SlideInAndFadeIn> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f53096a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f53097b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f53098c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SlideInAndFadeIn(parcel.readLong(), parcel.readLong(), parcel.readFloat());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SlideInAndFadeIn[i];
                    }
                }

                public SlideInAndFadeIn(long j2, long j3, float f) {
                    this.f53096a = j2;
                    this.f53097b = j3;
                    this.f53098c = f;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof SlideInAndFadeIn)) {
                        return false;
                    }
                    SlideInAndFadeIn slideInAndFadeIn = (SlideInAndFadeIn) obj2;
                    return this.f53096a == slideInAndFadeIn.f53096a && this.f53097b == slideInAndFadeIn.f53097b && Float.compare(this.f53098c, slideInAndFadeIn.f53098c) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.f53098c) + a0.d.c(Long.hashCode(this.f53096a) * 31, 31, this.f53097b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeLong(this.f53096a);
                    dest.writeLong(this.f53097b);
                    dest.writeFloat(this.f53098c);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType$SlideInWithReveal;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$AnimationType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class SlideInWithReveal implements AnimationType {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final SlideInWithReveal f53099a = new SlideInWithReveal();

                @NotNull
                public static final Parcelable.Creator<SlideInWithReveal> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return SlideInWithReveal.f53099a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SlideInWithReveal[i];
                    }
                }

                private SlideInWithReveal() {
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
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType;", "Landroid/os/Parcelable;", "Default", "Dialog", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType$Default;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType$Dialog;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface BackgroundType extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType$Default;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default implements BackgroundType {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f53100a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f53100a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                private Default() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType$Dialog;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$BackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Dialog implements BackgroundType {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Dialog f53101a = new Dialog();

                @NotNull
                public static final Parcelable.Creator<Dialog> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Dialog.f53101a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Dialog[i];
                    }
                }

                private Dialog() {
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
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Model(parcel.readString(), (Clause) parcel.readParcelable(Model.class.getClassLoader()), (Clause) parcel.readParcelable(Model.class.getClassLoader()), (Content) parcel.readParcelable(Model.class.getClassLoader()), (BackgroundType) parcel.readParcelable(Model.class.getClassLoader()), pd.valueOf(parcel.readString()), (ResourceImage) parcel.readParcelable(Model.class.getClassLoader()), ld.valueOf(parcel.readString()), kd.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), id.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Footer.CREATOR.createFromParcel(parcel), null, parcel.readParcelable(Model.class.getClassLoader()), parcel.readString(), parcel.readString(), (Clause) parcel.readParcelable(Model.class.getClassLoader()), (AnimationType) parcel.readParcelable(Model.class.getClassLoader()), parcel.readInt() == 0 ? null : AnimationRequest.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(Model.class.getClassLoader()), 8192);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Model[i];
            }
        }

        public Model(String listId, Clause title, Clause clause, Content content, BackgroundType backgroundType, pd widgetTheme, ResourceImage resourceImage, ld descriptionStyle, kd descriptionColor, Button button, Button button2, id buttonStyle, Footer footer, Object obj2, Parcelable parcelable, String str, String str2, Clause clause2, AnimationType animationType, AnimationRequest animationRequest, Clause clause3) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
            Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
            Intrinsics.checkNotNullParameter(descriptionColor, "descriptionColor");
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            this.f53082a = listId;
            this.f53083b = title;
            this.f53084c = clause;
            this.d = content;
            this.e = backgroundType;
            this.f = widgetTheme;
            this.f53085g = resourceImage;
            this.f53086h = descriptionStyle;
            this.i = descriptionColor;
            this.f53087j = button;
            this.k = button2;
            this.f53088l = buttonStyle;
            this.f53089m = footer;
            this.f53090n = obj2;
            this.o = parcelable;
            this.f53091p = str;
            this.f53092q = str2;
            this.f53093r = clause2;
            this.f53094s = animationType;
            this.f53095t = animationRequest;
            this.u = clause3;
        }

        public static Model b2(Model model, Button button, Button button2, id buttonStyle) {
            String listId = model.f53082a;
            Clause title = model.f53083b;
            Clause clause = model.f53084c;
            Content content = model.d;
            BackgroundType backgroundType = model.e;
            pd widgetTheme = model.f;
            ResourceImage resourceImage = model.f53085g;
            ld descriptionStyle = model.f53086h;
            kd descriptionColor = model.i;
            Footer footer = model.f53089m;
            Object obj2 = model.f53090n;
            Parcelable parcelable = model.o;
            String str = model.f53091p;
            String str2 = model.f53092q;
            Clause clause2 = model.f53093r;
            AnimationType animationType = model.f53094s;
            AnimationRequest animationRequest = model.f53095t;
            Clause clause3 = model.u;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
            Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
            Intrinsics.checkNotNullParameter(descriptionColor, "descriptionColor");
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            return new Model(listId, title, clause, content, backgroundType, widgetTheme, resourceImage, descriptionStyle, descriptionColor, button, button2, buttonStyle, footer, obj2, parcelable, str, str2, clause2, animationType, animationRequest, clause3);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new PromptMarketingContentDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52164j() {
            return this.f53090n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52159a() {
            return this.f53082a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53082a, model.f53082a) && Intrinsics.f(this.f53083b, model.f53083b) && Intrinsics.f(this.f53084c, model.f53084c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f53085g, model.f53085g) && this.f53086h == model.f53086h && this.i == model.i && Intrinsics.f(this.f53087j, model.f53087j) && Intrinsics.f(this.k, model.k) && this.f53088l == model.f53088l && Intrinsics.f(this.f53089m, model.f53089m) && Intrinsics.f(this.f53090n, model.f53090n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53091p, model.f53091p) && Intrinsics.f(this.f53092q, model.f53092q) && Intrinsics.f(this.f53093r, model.f53093r) && Intrinsics.f(this.f53094s, model.f53094s) && Intrinsics.f(this.f53095t, model.f53095t) && Intrinsics.f(this.u, model.u);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52172t() {
            return this.o;
        }

        @Override // ny0.h
        public final boolean getFitsReadableArea() {
            return false;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f53082a.hashCode() * 31, 31, this.f53083b);
            Clause clause = this.f53084c;
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31)) * 31;
            ResourceImage resourceImage = this.f53085g;
            int iHashCode2 = (this.i.hashCode() + ((this.f53086h.hashCode() + ((iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31)) * 31)) * 31;
            Button button = this.f53087j;
            int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.k;
            int iHashCode4 = (this.f53088l.hashCode() + ((iHashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31)) * 31;
            Footer footer = this.f53089m;
            int iHashCode5 = (iHashCode4 + (footer == null ? 0 : footer.hashCode())) * 31;
            Object obj2 = this.f53090n;
            int iHashCode6 = (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.o;
            int iHashCode7 = (iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            String str = this.f53091p;
            int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f53092q;
            int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Clause clause2 = this.f53093r;
            int iHashCode10 = (iHashCode9 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            AnimationType animationType = this.f53094s;
            int iHashCode11 = (iHashCode10 + (animationType == null ? 0 : animationType.hashCode())) * 31;
            AnimationRequest animationRequest = this.f53095t;
            int iHashCode12 = (iHashCode11 + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            Clause clause3 = this.u;
            return iHashCode12 + (clause3 != null ? clause3.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f53082a);
            dest.writeParcelable(this.f53083b, i);
            dest.writeParcelable(this.f53084c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f.name());
            dest.writeParcelable(this.f53085g, i);
            dest.writeString(this.f53086h.name());
            dest.writeString(this.i.name());
            Button button = this.f53087j;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, i);
            }
            Button button2 = this.k;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, i);
            }
            dest.writeString(this.f53088l.name());
            Footer footer = this.f53089m;
            if (footer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footer.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.o, i);
            dest.writeString(this.f53091p);
            dest.writeString(this.f53092q);
            dest.writeParcelable(this.f53093r, i);
            dest.writeParcelable(this.f53094s, i);
            AnimationRequest animationRequest = this.f53095t;
            if (animationRequest == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                animationRequest.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.u, i);
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z29 = !Intrinsics.f(model.f53083b, this.f53083b);
            boolean z31 = !Intrinsics.f(model.f53084c, this.f53084c);
            if (model.f53086h != this.f53086h) {
                z = true;
                z3 = z31;
                z4 = true;
            } else {
                z = true;
                z3 = z31;
                z4 = false;
            }
            if (model.i != this.i) {
                z6 = z;
            } else {
                z6 = z;
                z = false;
            }
            boolean zF = Intrinsics.f(model.f53085g, this.f53085g) ^ z6;
            boolean zF2 = Intrinsics.f(model.d, this.d) ^ z6;
            boolean zF3 = Intrinsics.f(model.e, this.e) ^ z6;
            if (model.f != this.f) {
                z11 = zF2;
                z12 = z6;
            } else {
                z11 = zF2;
                z12 = false;
            }
            return new od(z29, z3, z4, z, zF, z11, zF3, z12, Intrinsics.f(model.f53091p, this.f53091p) ^ z6, Intrinsics.f(model.f53092q, this.f53092q) ^ z6, !Intrinsics.f(model.f53087j, this.f53087j), !Intrinsics.f(model.k, this.k), model.f53088l != this.f53088l ? z6 : false, !Intrinsics.f(model.f53089m, this.f53089m), !Intrinsics.f(model.f53093r, this.f53093r), !Intrinsics.f(model.f53095t, this.f53095t), !Intrinsics.f(model.u, this.u));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content;", "Landroid/os/Parcelable;", "<init>", "()V", "MediaContent", "BackgroundMediaContent", "FullScreenMediaContent", "ProgressContent", "AvatarContent", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$AvatarContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$BackgroundMediaContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$FullScreenMediaContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$MediaContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$ProgressContent;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Content implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$AvatarContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AvatarContent extends Content {

                @NotNull
                public static final Parcelable.Creator<AvatarContent> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f53105a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f53106b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AvatarContent((Clause) parcel.readParcelable(AvatarContent.class.getClassLoader()), (Image) parcel.readParcelable(AvatarContent.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AvatarContent[i];
                    }
                }

                public AvatarContent(Clause heading, Image image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(heading, "heading");
                    this.f53105a = image;
                    this.f53106b = heading;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AvatarContent)) {
                        return false;
                    }
                    AvatarContent avatarContent = (AvatarContent) obj2;
                    return Intrinsics.f(this.f53105a, avatarContent.f53105a) && Intrinsics.f(this.f53106b, avatarContent.f53106b);
                }

                public final int hashCode() {
                    return this.f53106b.hashCode() + (this.f53105a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53105a, i);
                    dest.writeParcelable(this.f53106b, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$BackgroundMediaContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class BackgroundMediaContent extends Content {

                @NotNull
                public static final Parcelable.Creator<BackgroundMediaContent> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Media f53107a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new BackgroundMediaContent((Media) parcel.readParcelable(BackgroundMediaContent.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new BackgroundMediaContent[i];
                    }
                }

                public BackgroundMediaContent(Media media) {
                    Intrinsics.checkNotNullParameter(media, "media");
                    this.f53107a = media;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof BackgroundMediaContent) && Intrinsics.f(this.f53107a, ((BackgroundMediaContent) obj2).f53107a);
                }

                public final int hashCode() {
                    return this.f53107a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53107a, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$ProgressContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ProgressContent extends Content {

                @NotNull
                public static final Parcelable.Creator<ProgressContent> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProgressStyle f53113a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f53114b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Clause f53115c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ProgressContent(ProgressStyle.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(ProgressContent.class.getClassLoader()), (Clause) parcel.readParcelable(ProgressContent.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ProgressContent[i];
                    }
                }

                public ProgressContent(ProgressStyle progressStyle, Clause clause, Clause clause2) {
                    Intrinsics.checkNotNullParameter(progressStyle, "progressStyle");
                    this.f53113a = progressStyle;
                    this.f53114b = clause;
                    this.f53115c = clause2;
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
                    return Intrinsics.f(this.f53113a, progressContent.f53113a) && Intrinsics.f(this.f53114b, progressContent.f53114b) && Intrinsics.f(this.f53115c, progressContent.f53115c);
                }

                public final int hashCode() {
                    int iHashCode = this.f53113a.hashCode() * 31;
                    Clause clause = this.f53114b;
                    int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
                    Clause clause2 = this.f53115c;
                    return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.f53113a.writeToParcel(dest, i);
                    dest.writeParcelable(this.f53114b, i);
                    dest.writeParcelable(this.f53115c, i);
                }
            }

            private Content() {
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$MediaContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class MediaContent extends Content {

                @NotNull
                public static final Parcelable.Creator<MediaContent> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Media f53111a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final nd f53112b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new MediaContent((Media) parcel.readParcelable(MediaContent.class.getClassLoader()), parcel.readInt() == 0 ? null : nd.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new MediaContent[i];
                    }
                }

                public MediaContent(Media media, nd ndVar) {
                    Intrinsics.checkNotNullParameter(media, "media");
                    this.f53111a = media;
                    this.f53112b = ndVar;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof MediaContent)) {
                        return false;
                    }
                    MediaContent mediaContent = (MediaContent) obj2;
                    return Intrinsics.f(this.f53111a, mediaContent.f53111a) && this.f53112b == mediaContent.f53112b;
                }

                public final int hashCode() {
                    int iHashCode = this.f53111a.hashCode() * 31;
                    nd ndVar = this.f53112b;
                    return iHashCode + (ndVar == null ? 0 : ndVar.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53111a, i);
                    nd ndVar = this.f53112b;
                    if (ndVar == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(ndVar.name());
                    }
                }

                public /* synthetic */ MediaContent(Media media) {
                    this(media, null);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content$FullScreenMediaContent;", "Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Content;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/jd", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class FullScreenMediaContent extends Content {

                @NotNull
                public static final Parcelable.Creator<FullScreenMediaContent> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Media f53108a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f53109b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final jd f53110c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new FullScreenMediaContent((Media) parcel.readParcelable(FullScreenMediaContent.class.getClassLoader()), (Clause) parcel.readParcelable(FullScreenMediaContent.class.getClassLoader()), jd.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new FullScreenMediaContent[i];
                    }
                }

                public FullScreenMediaContent(Media media, Clause clause, jd alignment) {
                    Intrinsics.checkNotNullParameter(media, "media");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    this.f53108a = media;
                    this.f53109b = clause;
                    this.f53110c = alignment;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof FullScreenMediaContent)) {
                        return false;
                    }
                    FullScreenMediaContent fullScreenMediaContent = (FullScreenMediaContent) obj2;
                    return Intrinsics.f(this.f53108a, fullScreenMediaContent.f53108a) && Intrinsics.f(this.f53109b, fullScreenMediaContent.f53109b) && this.f53110c == fullScreenMediaContent.f53110c;
                }

                public final int hashCode() {
                    int iHashCode = this.f53108a.hashCode() * 31;
                    Clause clause = this.f53109b;
                    return this.f53110c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53108a, i);
                    dest.writeParcelable(this.f53109b, i);
                    dest.writeString(this.f53110c.name());
                }

                public /* synthetic */ FullScreenMediaContent(Media media, Clause clause, jd jdVar, int i) {
                    this(media, (i & 2) != 0 ? null : clause, (i & 4) != 0 ? jd.BOTTOM : jdVar);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Footer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/md", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Footer implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Footer> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f53116a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final md f53117b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Footer((Clause) parcel.readParcelable(Footer.class.getClassLoader()), md.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Footer[i];
                }
            }

            public Footer(Clause footerText, md footerPlacement) {
                Intrinsics.checkNotNullParameter(footerText, "footerText");
                Intrinsics.checkNotNullParameter(footerPlacement, "footerPlacement");
                this.f53116a = footerText;
                this.f53117b = footerPlacement;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) obj2;
                return Intrinsics.f(this.f53116a, footer.f53116a) && this.f53117b == footer.f53117b;
            }

            public final int hashCode() {
                return this.f53117b.hashCode() + (this.f53116a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f53116a, i);
                dest.writeString(this.f53117b.name());
            }

            public /* synthetic */ Footer(Clause clause) {
                this(clause, md.ABOVE_BUTTONS);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f53102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f53103b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Image f53104c;
            public final LargeActionButton.ButtonStyle d;
            public final boolean e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Button((Clause) parcel.readParcelable(Button.class.getClassLoader()), (Image) parcel.readParcelable(Button.class.getClassLoader()), (Image) parcel.readParcelable(Button.class.getClassLoader()), (LargeActionButton.ButtonStyle) parcel.readParcelable(Button.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Button[i];
                }
            }

            public Button(Clause text, Image image, Image image2, LargeActionButton.ButtonStyle buttonStyle, boolean z, String loadingTag) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(loadingTag, "loadingTag");
                this.f53102a = text;
                this.f53103b = image;
                this.f53104c = image2;
                this.d = buttonStyle;
                this.e = z;
                this.f = loadingTag;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj2;
                return Intrinsics.f(this.f53102a, button.f53102a) && Intrinsics.f(this.f53103b, button.f53103b) && Intrinsics.f(this.f53104c, button.f53104c) && Intrinsics.f(this.d, button.d) && this.e == button.e && Intrinsics.f(this.f, button.f);
            }

            public final int hashCode() {
                int iHashCode = this.f53102a.hashCode() * 31;
                Image image = this.f53103b;
                int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
                Image image2 = this.f53104c;
                int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
                LargeActionButton.ButtonStyle buttonStyle = this.d;
                return this.f.hashCode() + j6.a.c((iHashCode3 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31, 31, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f53102a, i);
                dest.writeParcelable(this.f53103b, i);
                dest.writeParcelable(this.f53104c, i);
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeString(this.f);
            }

            public /* synthetic */ Button(Clause clause, ResourceImage resourceImage, LargeActionButton.ButtonStyle buttonStyle, boolean z, String str, int i) {
                this(clause, (i & 2) != 0 ? null : resourceImage, (Image) null, (i & 8) != 0 ? null : buttonStyle, (i & 16) != 0 ? true : z, (i & 32) != 0 ? "" : str);
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Model(java.lang.String r25, com.revolut.core.ui_kit.models.Clause r26, com.revolut.core.ui_kit.models.Clause r27, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content r28, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.BackgroundType r29, com.revolut.core.ui_kit.delegates.pd r30, com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r31, com.revolut.core.ui_kit.delegates.ld r32, com.revolut.core.ui_kit.delegates.kd r33, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Button r34, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Button r35, com.revolut.core.ui_kit.delegates.id r36, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Footer r37, java.lang.Object r38, android.os.Parcelable r39, java.lang.String r40, java.lang.String r41, com.revolut.core.ui_kit.models.Clause r42, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.AnimationType r43, com.revolut.core.ui_kit.models.AnimationRequest r44, com.revolut.core.ui_kit.models.Clause r45, int r46) {
            /*
                r24 = this;
                r0 = r46
                r1 = r0 & 16
                if (r1 == 0) goto La
                com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$BackgroundType$Default r1 = com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a
                r7 = r1
                goto Lc
            La:
                r7 = r29
            Lc:
                r1 = r0 & 32
                if (r1 == 0) goto L14
                com.revolut.core.ui_kit.delegates.pd r1 = com.revolut.core.ui_kit.delegates.pd.REGULAR
                r8 = r1
                goto L16
            L14:
                r8 = r30
            L16:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L1e
                com.revolut.core.ui_kit.delegates.ld r1 = com.revolut.core.ui_kit.delegates.ld.PRIMARY
                r10 = r1
                goto L20
            L1e:
                r10 = r32
            L20:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L28
                com.revolut.core.ui_kit.delegates.kd r1 = com.revolut.core.ui_kit.delegates.kd.DEFAULT
                r11 = r1
                goto L2a
            L28:
                r11 = r33
            L2a:
                r1 = r0 & 512(0x200, float:7.17E-43)
                r2 = 0
                if (r1 == 0) goto L31
                r12 = r2
                goto L33
            L31:
                r12 = r34
            L33:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L39
                r13 = r2
                goto L3b
            L39:
                r13 = r35
            L3b:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L43
                com.revolut.core.ui_kit.delegates.id r1 = com.revolut.core.ui_kit.delegates.id.VERTICAL
                r14 = r1
                goto L45
            L43:
                r14 = r36
            L45:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L4b
                r15 = r2
                goto L4d
            L4b:
                r15 = r37
            L4d:
                r1 = r0 & 8192(0x2000, float:1.148E-41)
                if (r1 == 0) goto L54
                r16 = r2
                goto L56
            L54:
                r16 = r38
            L56:
                r1 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r1 == 0) goto L5d
                r17 = r2
                goto L5f
            L5d:
                r17 = r39
            L5f:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L68
                r18 = r2
                goto L6a
            L68:
                r18 = r40
            L6a:
                r1 = 65536(0x10000, float:9.1835E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L72
                r19 = r2
                goto L74
            L72:
                r19 = r41
            L74:
                r1 = 131072(0x20000, float:1.83671E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L7c
                r20 = r2
                goto L7e
            L7c:
                r20 = r42
            L7e:
                r1 = 262144(0x40000, float:3.67342E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L86
                r21 = r2
                goto L88
            L86:
                r21 = r43
            L88:
                r1 = 524288(0x80000, float:7.34684E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L90
                r22 = r2
                goto L92
            L90:
                r22 = r44
            L92:
                r1 = 1048576(0x100000, float:1.469368E-39)
                r0 = r0 & r1
                if (r0 == 0) goto La6
                r23 = r2
                r3 = r25
                r4 = r26
                r5 = r27
                r6 = r28
                r9 = r31
                r2 = r24
                goto Lb4
            La6:
                r23 = r45
                r2 = r24
                r3 = r25
                r4 = r26
                r5 = r27
                r6 = r28
                r9 = r31
            Lb4:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.<init>(java.lang.String, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Content, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$BackgroundType, com.revolut.core.ui_kit.delegates.pd, com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage, com.revolut.core.ui_kit.delegates.ld, com.revolut.core.ui_kit.delegates.kd, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Button, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Button, com.revolut.core.ui_kit.delegates.id, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Footer, java.lang.Object, android.os.Parcelable, java.lang.String, java.lang.String, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$AnimationType, com.revolut.core.ui_kit.models.AnimationRequest, com.revolut.core.ui_kit.models.Clause, int):void");
        }
    }

    public PromptMarketingContentDelegate() {
        super(R$layout.internal_delegate_prompt_marketing, new l40(14));
        this.f53079c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = new e01.a();
        this.f53080g = new e01.a();
        this.f53081h = new e01.a();
    }

    public static aw0.n6 p(Model.Button button, LargeActionButton.ButtonStyle buttonStyle) {
        Clause clause = button.f53102a;
        Image image = button.f53103b;
        boolean z = button.e;
        LargeActionButton.ButtonStyle buttonStyle2 = button.d;
        return new aw0.n6(clause, buttonStyle2 == null ? buttonStyle : buttonStyle2, image, button.f, z, null, null, 968);
    }

    public static ox0.b0 q(md mdVar) {
        return (mdVar == null ? -1 : sd.f54714b[mdVar.ordinal()]) == 1 ? ox0.b0.BELOW_BUTTONS : ox0.b0.ABOVE_BUTTONS;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        rd rdVar = new rd(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_prompt_marketing));
        rdVar.f54665j.setGlyphDisplayOption(new yp0.l(yp0.n.FACTOR_50, 2));
        rdVar.k.setDefaultAvatarStyle$ui_kit_components_release(mx0.i1.SIZE_80_80);
        rdVar.f54664h.setTitleCentered(true);
        return rdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x050e  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.rd r47, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model r48, int r49, java.util.List r50) {
        /*
            Method dump skipped, instruction units count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.p(com.revolut.core.ui_kit.delegates.rd, com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model, int, java.util.List):void");
    }
}

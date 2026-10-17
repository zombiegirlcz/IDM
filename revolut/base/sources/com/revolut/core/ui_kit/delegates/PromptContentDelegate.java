package com.revolut.core.ui_kit.delegates;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.CircleProgressBarWithText;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.GooglePayButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import ip0.e30;
import ip0.l40;
import ip0.n60;
import ip0.p60;
import ip0.wk;
import ip0.ws;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/ed;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromptContentDelegate extends BaseRecyclerViewDelegate<Model, ed> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53052c;
    public final ihm.f d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f53053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f53054h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z4l.j f53055j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0007\b\t\n\u000b\fJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/xc", "b", "BackgroundType", "a", "com/revolut/core/ui_kit/delegates/cd", "com/revolut/core/ui_kit/delegates/dd", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {
        public final String A;
        public final String B;
        public final Image C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53058c;
        public final Clause d;
        public final b e;
        public final ResourceImage f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f53059g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final xc f53060h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Clause f53061j;
        public final Clause k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Image f53062l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Image f53063m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final LargeActionButton.ButtonStyle f53064n;
        public final LargeActionButton.ButtonStyle o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final cd f53065p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f53066q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f53067r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f53068s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f53069t;
        public final Parcelable u;
        public final Parcelable v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final BackgroundType f53070w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Object f53071x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Parcelable f53072y;
        public final a z;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Dialog", "Image", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType$Default;", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType$Dialog;", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType$Image;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class BackgroundType implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType$Default;", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default extends BackgroundType {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f53073a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f53073a;
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType$Dialog;", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Dialog extends BackgroundType {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Dialog f53074a = new Dialog();

                @NotNull
                public static final Parcelable.Creator<Dialog> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Dialog.f53074a;
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType$Image;", "Lcom/revolut/core/ui_kit/delegates/PromptContentDelegate$Model$BackgroundType;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image extends BackgroundType {

                @NotNull
                public static final Parcelable.Creator<Image> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.revolut.core.ui_kit_core.displayers.image.Image f53075a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f53076b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image((com.revolut.core.ui_kit_core.displayers.image.Image) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Image[i];
                    }
                }

                public Image(com.revolut.core.ui_kit_core.displayers.image.Image image, boolean z) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f53075a = image;
                    this.f53076b = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj2;
                    return Intrinsics.f(this.f53075a, image.f53075a) && this.f53076b == image.f53076b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f53076b) + (this.f53075a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53075a, i);
                    dest.writeInt(this.f53076b ? 1 : 0);
                }
            }

            private BackgroundType() {
            }
        }

        public static abstract class a {
            private a() {
            }

            public abstract Image a();
        }

        public static abstract class b {

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f53077a = new a();

                private a() {
                }
            }

            private b() {
            }
        }

        public Model(String listId, Clause title, Clause description, Clause clause, b content, ResourceImage resourceImage, Clause clause2, xc xcVar, boolean z, Clause clause3, Clause clause4, Image image, Image image2, LargeActionButton.ButtonStyle buttonStyle, LargeActionButton.ButtonStyle buttonStyle2, cd cdVar, boolean z3, String str, boolean z4, String str2, Parcelable parcelable, Parcelable parcelable2, BackgroundType backgroundType, Object obj2, a aVar, String str3, String str4, Image image3, int i) {
            Image image4;
            BackgroundType backgroundType2;
            Clause clause5 = (i & 8) != 0 ? null : clause;
            Clause clause6 = (i & 64) != 0 ? null : clause2;
            xc buttonsStyle = (i & 128) != 0 ? xc.VERTICAL : xcVar;
            boolean z6 = (i & 256) != 0 ? false : z;
            Clause clause7 = (i & 512) != 0 ? null : clause3;
            Clause clause8 = (i & 1024) != 0 ? null : clause4;
            Image image5 = (i & 2048) != 0 ? null : image;
            Image image6 = (i & 4096) != 0 ? null : image2;
            LargeActionButton.ButtonStyle primaryButtonStyle = (i & 8192) != 0 ? LargeActionButton.ButtonStyle.f58725a : buttonStyle;
            LargeActionButton.ButtonStyle secondaryButtonStyle = (i & 16384) != 0 ? LargeActionButton.ButtonStyle.f58726b : buttonStyle2;
            cd descriptionStyle = (i & 32768) != 0 ? cd.PRIMARY : cdVar;
            boolean z11 = (i & 65536) != 0 ? true : z3;
            String str5 = (i & 131072) != 0 ? null : str;
            boolean z12 = (i & 262144) != 0 ? true : z4;
            String str6 = (i & 524288) != 0 ? null : str2;
            Parcelable parcelable3 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : parcelable;
            Parcelable parcelable4 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : parcelable2;
            if ((i & 4194304) != 0) {
                image4 = image6;
                backgroundType2 = BackgroundType.Default.f53073a;
            } else {
                image4 = image6;
                backgroundType2 = backgroundType;
            }
            Object obj3 = (i & 8388608) != 0 ? null : obj2;
            a aVar2 = (i & 33554432) != 0 ? null : aVar;
            String str7 = (i & 67108864) != 0 ? null : str3;
            String str8 = (i & 134217728) != 0 ? null : str4;
            Image image7 = (i & 268435456) != 0 ? null : image3;
            Image image8 = image5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
            Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
            Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
            Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
            Intrinsics.checkNotNullParameter(backgroundType2, "backgroundType");
            this.f53056a = listId;
            this.f53057b = title;
            this.f53058c = description;
            this.d = clause5;
            this.e = content;
            this.f = resourceImage;
            this.f53059g = clause6;
            this.f53060h = buttonsStyle;
            this.i = z6;
            this.f53061j = clause7;
            this.k = clause8;
            this.f53062l = image8;
            this.f53063m = image4;
            this.f53064n = primaryButtonStyle;
            this.o = secondaryButtonStyle;
            this.f53065p = descriptionStyle;
            this.f53066q = z11;
            this.f53067r = str5;
            this.f53068s = z12;
            this.f53069t = str6;
            this.u = parcelable3;
            this.v = parcelable4;
            this.f53070w = backgroundType2;
            this.f53071x = obj3;
            this.f53072y = null;
            this.z = aVar2;
            this.A = str7;
            this.B = str8;
            this.C = image7;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new PromptContentDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55203g() {
            return this.f53071x;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52014a() {
            return this.f53056a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53056a, model.f53056a) && Intrinsics.f(this.f53057b, model.f53057b) && Intrinsics.f(this.f53058c, model.f53058c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53059g, model.f53059g) && this.f53060h == model.f53060h && this.i == model.i && Intrinsics.f(this.f53061j, model.f53061j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53062l, model.f53062l) && Intrinsics.f(this.f53063m, model.f53063m) && Intrinsics.f(this.f53064n, model.f53064n) && Intrinsics.f(this.o, model.o) && this.f53065p == model.f53065p && this.f53066q == model.f53066q && Intrinsics.f(this.f53067r, model.f53067r) && this.f53068s == model.f53068s && Intrinsics.f(this.f53069t, model.f53069t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && Intrinsics.f(this.f53070w, model.f53070w) && Intrinsics.f(this.f53071x, model.f53071x) && Intrinsics.f(this.f53072y, model.f53072y) && Intrinsics.f(this.z, model.z) && Intrinsics.f(this.A, model.A) && Intrinsics.f(this.B, model.B) && Intrinsics.f(this.C, model.C);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52024q() {
            return this.f53072y;
        }

        public final int hashCode() {
            int iA = p.a.a(p.a.a(this.f53056a.hashCode() * 31, 31, this.f53057b), 31, this.f53058c);
            Clause clause = this.d;
            int iHashCode = (this.e.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            ResourceImage resourceImage = this.f;
            int iHashCode2 = (iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31;
            Clause clause2 = this.f53059g;
            int iC = j6.a.c((this.f53060h.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31, 31, this.i);
            Clause clause3 = this.f53061j;
            int iHashCode3 = (iC + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.k;
            int iHashCode4 = (iHashCode3 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
            Image image = this.f53062l;
            int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f53063m;
            int iC2 = j6.a.c((this.f53065p.hashCode() + r6.b.d(this.o, r6.b.d(this.f53064n, (iHashCode5 + (image2 == null ? 0 : image2.hashCode())) * 31, 31), 31)) * 31, 31, this.f53066q);
            String str = this.f53067r;
            int iC3 = j6.a.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f53068s);
            String str2 = this.f53069t;
            int iHashCode6 = (iC3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Parcelable parcelable = this.u;
            int iHashCode7 = (iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Parcelable parcelable2 = this.v;
            int iHashCode8 = (this.f53070w.hashCode() + ((iHashCode7 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31)) * 31;
            Object obj2 = this.f53071x;
            int iHashCode9 = (iHashCode8 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable3 = this.f53072y;
            int iHashCode10 = (iHashCode9 + (parcelable3 == null ? 0 : parcelable3.hashCode())) * 31;
            a aVar = this.z;
            int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str3 = this.A;
            int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.B;
            int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Image image3 = this.C;
            return iHashCode13 + (image3 != null ? image3.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53072y = parcelable;
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // koi.j
        public final java.lang.Object z(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
    }

    public PromptContentDelegate() {
        super(R$layout.internal_delegate_prompt, new l40(12));
        yhm.k kVar = yhm.k.NONE;
        this.f53052c = yhm.j.c(kVar, new il9.p(24));
        this.d = v0.a.d("create(...)");
        this.e = yhm.j.c(kVar, new il9.p(25));
        this.f = yhm.j.c(kVar, new il9.p(26));
        this.f53053g = yhm.j.c(kVar, new il9.p(27));
        this.f53054h = new e01.a();
        this.i = new e01.a();
        this.f53055j = new z4l.j(7, zhm.v.k(new FullScreenStateDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), false);
    }

    public static void t(ed edVar, Model model, int i) {
        edVar.i.setColorFilter(i);
        edVar.f54111j.setColorFilter(i);
        edVar.k.setTextColor(i);
        edVar.f54114n.setTextColor(i);
        Model.BackgroundType backgroundType = model.f53070w;
        if (!(backgroundType instanceof Model.BackgroundType.Image)) {
            if (!Intrinsics.f(backgroundType, Model.BackgroundType.Default.f53073a) && !Intrinsics.f(backgroundType, Model.BackgroundType.Dialog.f53074a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (model.f53065p == cd.CAPTION) {
                Context context = edVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i = kli.a.s(R$attr.uikit_colorGreyTone50, context);
            }
        }
        edVar.f54112l.setTextColor(i);
    }

    public static void u(ed edVar, Model model) {
        Model.a aVar = model.z;
        if (aVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        edVar.o.setVisibility(8);
        View view = edVar.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), aVar != null ? aVar.a() : null, edVar.o, null, null, 12);
    }

    public static void w(ed edVar, Model model) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(edVar.f54118s);
        LargeActionButton largeActionButton = edVar.u;
        constraintSet.clear(largeActionButton.getId(), 6);
        LargeActionButton largeActionButton2 = edVar.v;
        constraintSet.clear(largeActionButton2.getId(), 3);
        constraintSet.clear(largeActionButton2.getId(), 7);
        int i = fd.f54160b[model.f53060h.ordinal()];
        if (i == 1) {
            Context context = largeActionButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iW = kli.a.w(R$attr.uikit_dp16, context);
            constraintSet.setMargin(largeActionButton.getId(), 6, iW);
            constraintSet.connect(largeActionButton.getId(), 6, 0, 6);
            constraintSet.setMargin(largeActionButton2.getId(), 7, iW);
            constraintSet.setMargin(largeActionButton2.getId(), 3, iW);
            constraintSet.connect(largeActionButton2.getId(), 3, largeActionButton.getId(), 4);
            constraintSet.connect(largeActionButton2.getId(), 7, 0, 7);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = largeActionButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iW2 = kli.a.w(R$attr.uikit_dp4, context2);
            Context context3 = largeActionButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iW3 = kli.a.w(R$attr.uikit_dp16, context3);
            constraintSet.setMargin(largeActionButton.getId(), 6, iW2);
            constraintSet.connect(largeActionButton.getId(), 6, largeActionButton2.getId(), 7);
            constraintSet.setMargin(largeActionButton2.getId(), 7, iW2);
            constraintSet.setMargin(largeActionButton2.getId(), 3, iW3);
            constraintSet.connect(largeActionButton2.getId(), 3, edVar.f54119t.getId(), 4);
            constraintSet.connect(largeActionButton2.getId(), 7, largeActionButton.getId(), 6);
        }
        constraintSet.applyTo(edVar.f54118s);
    }

    public final void A(ed edVar, Model model) {
        ImageView imageView = edVar.f54111j;
        imageView.setVisibility(model.C == null ? 8 : 0);
        View view = edVar.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), model.C, edVar.f54111j, null, null, 12);
        if (imageView.getVisibility() == 8) {
            or0.u.o(imageView);
            return;
        }
        Image image = model.C;
        py0.b bVar = image != null ? new py0.b(image) : null;
        or0.m.a(imageView);
        imageView.setOnClickListener(new p60(model, bVar, this, model, 1));
    }

    public final void B(ed edVar, Model model) {
        LargeActionButton largeActionButton = edVar.u;
        Clause clause = model.f53061j;
        largeActionButton.setText(clause);
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        efm.r map = edVar.u.o.map(new e30(new n60(model, 1), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53054h.a(map, edVar);
    }

    public final void C(ed edVar, Model model) {
        LargeActionButton largeActionButton = edVar.v;
        Clause clause = model.k;
        largeActionButton.setText(clause);
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        efm.r map = edVar.v.o.map(new e30(new n60(model, 0), 8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.i.a(map, edVar);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ed(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_prompt));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ed) {
            ((ed) holder).f54116q.g0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f p() {
        return (ihm.f) this.f53053g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f q() {
        return (ihm.f) this.f53052c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f r() {
        return (ihm.f) this.e.getValue();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(ed holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f54113m;
        TextView textView2 = holder.f54114n;
        GooglePayButton googlePayButton = holder.f54119t;
        LargeActionButton largeActionButton = holder.v;
        LargeActionButton largeActionButton2 = holder.u;
        RecyclerView recyclerView = holder.f54115p;
        TextView textView3 = holder.f54112l;
        TextView textView4 = holder.k;
        yp0.y.h(recyclerView, this.f53055j, new LinearLayoutManager(recyclerView.getContext()));
        if (payloads.isEmpty()) {
            x(holder, data);
            A(holder, data);
            kli.a.b(textView4, data.f53057b, ty0.f.f275450a);
            textView4.setTag(data.A);
            z(holder, data);
            textView3.setTag(data.B);
            or0.b.h(this, data.d, textView2, new a2.a(data, 20, holder, this));
            kli.a.d(textView, data.f53059g, data, new hd(1, 0, ihm.f.class, p(), "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            y(holder, data);
            w(holder, data);
            googlePayButton.setVisibility(data.i ? 0 : 8);
            googlePayButton.setOnClickListener(new ws(this, data, 13));
            B(holder, data);
            C(holder, data);
            largeActionButton2.setAnalyticsContext(data.u);
            largeActionButton.setAnalyticsContext(data.v);
            largeActionButton2.setIcon(data.f53062l);
            largeActionButton.setIcon(data.f53063m);
            largeActionButton2.o(data.f53064n);
            largeActionButton.o(data.o);
            v(holder, data);
            largeActionButton2.setEnabled(data.f53066q);
            largeActionButton.setEnabled(data.f53068s);
            u(holder, data);
            largeActionButton2.setLoadingButtonTag(data.f53067r);
            largeActionButton.setLoadingButtonTag(data.f53069t);
            holder.f54120w = true;
            holder.f54121x = true;
            return;
        }
        ArrayList<dd> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof dd) {
                arrayList.add(obj2);
            }
        }
        for (dd ddVar : arrayList) {
            if (ddVar.e) {
                x(holder, data);
            }
            if (ddVar.f) {
                A(holder, data);
            }
            if (ddVar.f54033a) {
                kli.a.b(textView4, data.f53057b, ty0.f.f275450a);
            }
            if (ddVar.f54047w) {
                textView4.setTag(data.A);
            }
            if (ddVar.f54034b) {
                z(holder, data);
            }
            if (ddVar.f54048x) {
                textView3.setTag(data.B);
            }
            if (ddVar.f54035c) {
                or0.b.h(this, data.d, textView2, new a2.a(data, 20, holder, this));
            }
            if (ddVar.d) {
                y(holder, data);
            }
            if (ddVar.f54037h) {
                w(holder, data);
            }
            if (ddVar.i) {
                googlePayButton.setVisibility(data.i ? 0 : 8);
                googlePayButton.setOnClickListener(new ws(this, data, 13));
            }
            if (ddVar.f54038j) {
                B(holder, data);
            }
            if (ddVar.k) {
                C(holder, data);
            }
            if (ddVar.f54039l) {
                largeActionButton2.setAnalyticsContext(data.u);
                largeActionButton.setAnalyticsContext(data.v);
            }
            if (ddVar.f54040m) {
                largeActionButton2.setIcon(data.f53062l);
            }
            if (ddVar.f54041n) {
                largeActionButton.setIcon(data.f53063m);
            }
            if (ddVar.o) {
                largeActionButton2.o(data.f53064n);
            }
            if (ddVar.f54042p) {
                largeActionButton.o(data.o);
            }
            if (ddVar.f54043q) {
                v(holder, data);
            }
            if (ddVar.f54044r) {
                largeActionButton2.setEnabled(data.f53066q);
            }
            if (ddVar.f54045s) {
                largeActionButton.setEnabled(data.f53068s);
            }
            if (ddVar.f54036g) {
                kli.a.d(textView, data.f53059g, data, new hd(1, 0, ihm.f.class, p(), "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            }
            if (ddVar.f54046t) {
                u(holder, data);
            }
            if (ddVar.u) {
                largeActionButton2.setLoadingButtonTag(data.f53067r);
            }
            if (ddVar.v) {
                largeActionButton.setLoadingButtonTag(data.f53069t);
            }
        }
        holder.f54120w = true;
        holder.f54121x = false;
    }

    public final void v(ed edVar, Model model) {
        View view = edVar.itemView;
        ImageView imageView = edVar.f54109g;
        ImageView imageView2 = edVar.f;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t(edVar, model, kli.a.s(R$attr.uikit_colorForeground, context));
        Model.BackgroundType backgroundType = model.f53070w;
        if (!(backgroundType instanceof Model.BackgroundType.Default)) {
            if (backgroundType instanceof Model.BackgroundType.Dialog) {
                Context context2 = edVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                imageView.setImageDrawable(new ColorDrawable(kli.a.s(R$attr.uikit_colorElevatedGroupedBackground, context2)));
                imageView2.setImageResource(R$drawable.internal_content_overlay_elevated_gradient);
                return;
            }
            if (!(backgroundType instanceof Model.BackgroundType.Image)) {
                throw new NoWhenBranchMatchedException();
            }
            imageView2.setImageDrawable(null);
            View view2 = edVar.itemView;
            yy0.f.e(h30.l.z(view2, "itemView", view2), ((Model.BackgroundType.Image) backgroundType).f53075a, edVar.f54109g, new wk(edVar, this, model), null, 8);
            return;
        }
        Context context3 = edVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Intrinsics.checkNotNullParameter(context3, "<this>");
        ComponentCallbacks2 componentCallbacks2M = kli.a.m(context3);
        ry0.a aVar = componentCallbacks2M instanceof ry0.a ? (ry0.a) componentCallbacks2M : null;
        boolean z = (aVar == null || ((BaseDelegatesActivity) aVar).f0 == null) ? false : true;
        int i = z ? R$attr.uikit_colorTransparent : R$attr.uikit_colorGroupedBackground;
        int i2 = z ? 0 : R$drawable.internal_content_overlay_gradient;
        Context context4 = edVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        imageView.setImageDrawable(new ColorDrawable(kli.a.s(i, context4)));
        imageView2.setImageResource(i2);
    }

    public final void x(ed edVar, Model model) {
        ImageView imageView = edVar.i;
        imageView.setVisibility(model.f == null ? 4 : 0);
        View view = edVar.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), model.f, edVar.i, null, null, 12);
        imageView.setContentDescription(imageView.getContext().getString(R$string.uikit_navigate_up_description));
        if (imageView.getVisibility() == 4) {
            imageView.setOnClickListener(null);
            return;
        }
        ResourceImage resourceImage = model.f;
        py0.b bVar = resourceImage != null ? new py0.b(resourceImage) : null;
        or0.m.a(imageView);
        imageView.setOnClickListener(new p60(model, bVar, this, model, 0));
    }

    public final void y(ed edVar, Model model) {
        Model.b bVar = model.e;
        boolean z = false;
        if (bVar instanceof ad) {
            UiKitMediaView uiKitMediaView = edVar.f54117r;
            uiKitMediaView.setVisibility(0);
            edVar.f54115p.setVisibility(8);
            edVar.f54116q.setVisibility(8);
            ad adVar = (ad) bVar;
            Media media = adVar.f53677a;
            edVar.I(adVar);
            if (media instanceof Image) {
                View view = edVar.itemView;
                yy0.f.e(h30.l.z(view, "itemView", view), (Image) media, uiKitMediaView.i(), null, null, 12);
                return;
            } else {
                if (media instanceof Video) {
                    or0.u.k(uiKitMediaView).V().a((Video) media, uiKitMediaView.j(), null);
                    return;
                }
                return;
            }
        }
        if (bVar instanceof bd) {
            UiKitMediaView uiKitMediaView2 = edVar.f54117r;
            CircleProgressBarWithText circleProgressBarWithText = edVar.f54116q;
            uiKitMediaView2.setVisibility(8);
            circleProgressBarWithText.setVisibility(0);
            edVar.f54115p.setVisibility(8);
            bd bdVar = (bd) bVar;
            ProgressStyle progressStyle = bdVar.f53724a;
            circleProgressBarWithText.setProgressStyle(progressStyle);
            Clause clause = bdVar.f53725b;
            if (clause != null) {
                circleProgressBarWithText.setPercentText(clause, false);
                circleProgressBarWithText.setCustomPercentTextStyleAndMaxTwoLines();
            } else {
                circleProgressBarWithText.setPercentText(new TextClause(String.valueOf(progressStyle.f56332a), (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), true);
                circleProgressBarWithText.setDefaultPercentTextStyleAndSingleLine();
            }
            circleProgressBarWithText.setLabel(bdVar.f53726c);
            return;
        }
        if (bVar instanceof Model.b.a) {
            edVar.f54117r.setVisibility(8);
            edVar.f54116q.setVisibility(8);
            edVar.f54115p.setVisibility(8);
            return;
        }
        if (!(bVar instanceof zc)) {
            throw new NoWhenBranchMatchedException();
        }
        edVar.f54117r.setVisibility(8);
        edVar.f54116q.setVisibility(8);
        edVar.f54115p.setVisibility(0);
        zc zcVar = (zc) bVar;
        ResourceImage resourceImage = zcVar.f55689a;
        FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model(resourceImage.toString(), null, null, new ComplexImage.Regular(resourceImage), zj.REGULAR, null, false, null, null, false, 0, 0, 31718);
        List list = zcVar.f55690b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            yc ycVar = (yc) obj2;
            arrayList.add(new RowDelegate.Model(String.valueOf(i), new RowDelegate.Model.MainImage.Image24(ycVar.f55647b, z, z, 6), ycVar.f55646a, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            i = i2;
        }
        int i3 = R$attr.uikit_dp24;
        yp0.b.k(arrayList, 0, 0, i3, i3, 19);
        this.f53055j.c(i2b.a.q(model2, arrayList));
    }

    public final void z(ed edVar, Model model) {
        int i;
        int i2 = fd.f54159a[model.f53065p.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceEmphasis1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceBody2;
        }
        jb3.l.e(edVar.f54112l, i);
        kli.a.d(edVar.f54112l, model.f53058c, model, new gd(1, 0, ihm.f.class, p(), "onNext", "onNext(Ljava/lang/Object;)V"), 8);
    }
}

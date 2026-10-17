package com.revolut.core.ui_kit.delegates;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.UIKitRecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.kt;
import ip0.q00;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/ma;", "<init>", "()V", "Companion", "Model", "ip0/q00", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhotoBannerLargeDelegate extends BaseRecyclerViewDelegate<Model, ma> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52902c;
    public final ihm.f d;

    public PhotoBannerLargeDelegate() {
        super(R$layout.internal_delegate_photo_banner_large, new tz(7));
        this.f52902c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ma(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_photo_banner_large));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ma holder, Model data, int i, List list) {
        NavBarWithContainerBackground videoBackground;
        aw0.x8 x8Var;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof q00)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (int i3 = 0; i3 < size2; i3++) {
            q00 q00Var = (q00) payloads.get(i3);
            zIsEmpty = zIsEmpty || q00Var.f165908a;
            z3 = z3 || q00Var.f165910c;
            z4 = z4 || q00Var.d;
            z6 = z6 || q00Var.e;
            z11 = z11 || q00Var.f;
            z12 = z12 || q00Var.f165911g;
            z = z || q00Var.f165909b;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f54464h, data.f52904b, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.i, data.f52905c, ty0.f.f275450a);
        }
        if (z3) {
            data.getClass();
            z4l.j jVar = holder.o;
            zhm.f0 f0Var = zhm.f0.f322471a;
            f0Var.getClass();
            UIKitRecyclerView uIKitRecyclerView = holder.f54468n;
            boolean z29 = uIKitRecyclerView != null;
            if (uIKitRecyclerView != null) {
                jVar.c(f0Var);
                uIKitRecyclerView.setAdapter(null);
                View view = holder.itemView;
                Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view).removeView(uIKitRecyclerView);
            }
            holder.f54468n = null;
            if (z29 && (x8Var = holder.f54469p) != null) {
                holder.H(x8Var.f10609a);
            }
        }
        if (z4) {
            Model.Background background = data.d;
            Intrinsics.checkNotNullParameter(background, "background");
            WallpaperAssetSwitcher wallpaperAssetSwitcher = holder.f54467m;
            if (background instanceof Model.Background.Image) {
                videoBackground = new NavBarWithContainerBackground.ImageBackground(((Model.Background.Image) background).f52917a, (aw0.s8) null, (Color.SolidRes) null, 14);
            } else {
                if (!(background instanceof Model.Background.Video)) {
                    throw new NoWhenBranchMatchedException();
                }
                Model.Background.Video video = (Model.Background.Video) background;
                videoBackground = new NavBarWithContainerBackground.VideoBackground(video.f52918a, video.f52919b, (VideoShutter) null, (aw0.s8) null, 28);
            }
            wallpaperAssetSwitcher.setBackground(videoBackground, null);
        }
        if (z6) {
            la laVar = data.e;
            String str = laVar.f54435a;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new GlyphImage(laVar.f54436b, null, null, 6), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 6);
            Clause clause = laVar.f54437c;
            yy0.i iVar = yy0.l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            tf tfVar = new tf(yy0.i.a(resourceImage));
            int i5 = R$attr.uikit_dp12;
            RowDelegate.Model model = new RowDelegate.Model(str, image24, clause, null, 0, null, null, null, 0, tfVar, true, null, false, null, null, null, null, null, null, null, null, i5, i5, 0, 0, 486536184);
            c.e eVar = new c.e(qv0.h.EXTRA_LARGE, 2);
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            model.v = eVar;
            Intrinsics.checkNotNullParameter(model, "model");
            holder.f54470q = model;
            holder.f.q(holder.I(), model, i, zhm.f0.f322471a);
            holder.F();
        }
        holder.f54471r = new ip0.md(this, data, 5);
        if (z11) {
            holder.f54465j.setVisibility(data.f ? 0 : 8);
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        fp0.p pVar = holder.f54466l;
        Clause clause2 = data.f52904b;
        py0.c cVar = clause2 != null ? new py0.c(clause2) : null;
        fp0.p.b(pVar, true);
        View view2 = pVar.f137029a;
        or0.m.a(view2);
        view2.setOnClickListener(new kt(data, cVar, this, data, 9));
        fp0.p pVar2 = holder.k;
        boolean z31 = data.f;
        fp0.p.b(pVar2, z31);
        View view3 = pVar2.f137029a;
        or0.m.a(view3);
        if (z31) {
            view3.setOnClickListener(new au0.t1(data, 15, this, data));
        } else {
            or0.u.o(view3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lgx0/c;", "", "toString", "()Ljava/lang/String;", "Background", "com/revolut/core/ui_kit/delegates/la", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem, gx0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52905c;
        public final Background d;
        public final la e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f52906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52907h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public qv0.c f52908j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52909l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52910m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52911n;
        public final py0.d o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f52912p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52913q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f52914r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f52915s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f52916t;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background;", "Landroid/os/Parcelable;", "<init>", "()V", "Image", "Video", "Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background$Image;", "Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background$Video;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Background implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background$Image;", "Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image extends Background {

                @NotNull
                public static final Parcelable.Creator<Image> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.revolut.core.ui_kit_core.displayers.image.Image f52917a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image((com.revolut.core.ui_kit_core.displayers.image.Image) parcel.readParcelable(Image.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Image[i];
                    }
                }

                public Image(com.revolut.core.ui_kit_core.displayers.image.Image image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f52917a = image;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Image) && Intrinsics.f(this.f52917a, ((Image) obj2).f52917a);
                }

                public final int hashCode() {
                    return this.f52917a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f52917a, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background$Video;", "Lcom/revolut/core/ui_kit/delegates/PhotoBannerLargeDelegate$Model$Background;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Video extends Background {

                @NotNull
                public static final Parcelable.Creator<Video> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.revolut.core.ui_kit_core.displayers.video.Video f52918a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.revolut.core.ui_kit_core.displayers.image.Image f52919b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Video((com.revolut.core.ui_kit_core.displayers.video.Video) parcel.readParcelable(Video.class.getClassLoader()), (com.revolut.core.ui_kit_core.displayers.image.Image) parcel.readParcelable(Video.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Video[i];
                    }
                }

                public Video(com.revolut.core.ui_kit_core.displayers.video.Video video, com.revolut.core.ui_kit_core.displayers.image.Image image) {
                    Intrinsics.checkNotNullParameter(video, "video");
                    this.f52918a = video;
                    this.f52919b = image;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Video)) {
                        return false;
                    }
                    Video video = (Video) obj2;
                    return Intrinsics.f(this.f52918a, video.f52918a) && Intrinsics.f(this.f52919b, video.f52919b);
                }

                public final int hashCode() {
                    int iHashCode = this.f52918a.hashCode() * 31;
                    com.revolut.core.ui_kit_core.displayers.image.Image image = this.f52919b;
                    return iHashCode + (image == null ? 0 : image.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f52918a, i);
                    dest.writeParcelable(this.f52919b, i);
                }
            }

            private Background() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause clause, Background background, la row, boolean z, Object obj2, int i) {
            boolean z3 = (i & 32) != 0 ? false : z;
            boolean z4 = (i & 128) == 0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(row, "row");
            this(listId, title, clause, background, row, z3, obj2, z4, null, c.d.f249513a, null, null, null, null, null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            if (!this.f52907h || this.f52912p) {
                return this.f52906g;
            }
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53293a() {
            return this.f52903a;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public final py0.d getF54970q() {
            return this.o;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52903a, model.f52903a) && Intrinsics.f(this.f52904b, model.f52904b) && Intrinsics.f(this.f52905c, model.f52905c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52906g, model.f52906g) && this.f52907h == model.f52907h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52908j, model.f52908j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52909l, model.f52909l) && Intrinsics.f(this.f52910m, model.f52910m) && Intrinsics.f(this.f52911n, model.f52911n) && Intrinsics.f(this.o, model.o);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.f52913q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52913q = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.i;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f52903a.hashCode() * 31, 31, this.f52904b);
            Clause clause = this.f52905c;
            int iC = j6.a.c((this.e.hashCode() + ((this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 961)) * 31)) * 31, 31, this.f);
            Object obj2 = this.f52906g;
            int iC2 = j6.a.c((iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f52907h);
            Parcelable parcelable = this.i;
            int i = h30.l.i(this.f52908j, (iC2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.k;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52909l;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52910m;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52911n;
            int iHashCode4 = (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            py0.d dVar = this.o;
            return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53298j() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52908j = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53296g() {
            return this.f52909l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52910m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53299l() {
            return this.f52914r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53301n() {
            return this.f52916t;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52914r = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p */
        public final op0.q getK() {
            return op0.q.LARGE;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f52908j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f52911n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53297h() {
            return this.f52910m;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53300m() {
            return this.f52915s;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52909l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52911n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new q00(!Intrinsics.f(this.f52904b, model.f52904b), !Intrinsics.f(this.f52905c, model.f52905c), false, !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), this.f != model.f, or0.b.l(this, (qv0.i) oldItem));
            }
            return null;
        }

        public Model(String str, Clause clause, Clause clause2, Background background, la laVar, boolean z, Object obj2, boolean z3, Parcelable parcelable, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, py0.d dVar) {
            this.f52903a = str;
            this.f52904b = clause;
            this.f52905c = clause2;
            this.d = background;
            this.e = laVar;
            this.f = z;
            this.f52906g = obj2;
            this.f52907h = z3;
            this.i = parcelable;
            this.f52908j = cVar;
            this.k = cVar2;
            this.f52909l = cVar3;
            this.f52910m = cVar4;
            this.f52911n = cVar5;
            this.o = dVar;
            int i = R$attr.uikit_dp0;
            this.f52913q = i;
            this.f52914r = i;
            this.f52915s = i;
            this.f52916t = i;
        }
    }
}

package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LabelBadgeInternalClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountdownTimerImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.lb0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004:\u0004\u0006\u0007\u0003\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/zf;", "", "Companion", "Model", "ip0/lb0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowDelegate extends BaseGroupRecyclerViewDelegate<Model, zf> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final yp0.p v = new yp0.p(R$attr.uikit_colorAccent);
    public final Function2 d;
    public final Function2 e;
    public final WeakHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakHashMap f53217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f53218h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f53219j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f53220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f53221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f53222n;
    public final e01.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f53223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f53224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f53225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f53226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f53227t;
    public final ald.o u;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u000b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u000f\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aJ\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;", "Lqv0/l;", "Ls31/c;", "Lqv0/p;", "Lqv0/q;", "Lgx0/a;", "", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "MainImage", "c", "b", "com/revolut/core/ui_kit/delegates/af", "com/revolut/core/ui_kit/delegates/ff", "com/revolut/core/ui_kit/delegates/jf", "com/revolut/core/ui_kit/delegates/df", "com/revolut/core/ui_kit/delegates/gf", "com/revolut/core/ui_kit/delegates/bf", "a", "com/revolut/core/ui_kit/delegates/mf", "com/revolut/core/ui_kit/delegates/of", "com/revolut/core/ui_kit/delegates/nf", "com/revolut/core/ui_kit/delegates/ef", "com/revolut/core/ui_kit/delegates/lf", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, s31.c, qv0.p, qv0.q, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public int A;
        public int B;
        public final int C;
        public final int D;
        public final py0.a E;
        public Parcelable F;
        public qv0.k G;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MainImage f53229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53230c;
        public final of d;
        public final int e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final lf f53231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f53232h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53233j;
        public final c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f53234l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final af f53235m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final b f53236n;
        public final List o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final mf f53237p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final List f53238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final bf f53239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ef f53240s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final gf f53241t;
        public final Object u;
        public qv0.c v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p31.c f53242w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public p31.c f53243x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public p31.c f53244y;
        public p31.c z;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.RowDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static abstract class b {

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f53266a = new a();

                private a() {
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.RowDelegate$Model$b$b, reason: collision with other inner class name */
            public static final class C0423b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0423b f53267a = new C0423b();

                private C0423b() {
                }
            }

            public static final class c extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f53268a = new c();

                private c() {
                }
            }

            private b() {
            }
        }

        public static abstract class c {

            public static final class a extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TagViewData f53269a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f53270b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f53271c;

                public a() {
                    this(null, null, false, 7);
                }

                public final Clause a() {
                    return this.f53270b;
                }

                public final boolean b() {
                    return this.f53271c;
                }

                public final TagViewData c() {
                    return this.f53269a;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj2;
                    return Intrinsics.f(this.f53269a, aVar.f53269a) && Intrinsics.f(this.f53270b, aVar.f53270b) && this.f53271c == aVar.f53271c;
                }

                public final int hashCode() {
                    TagViewData tagViewData = this.f53269a;
                    int iHashCode = (tagViewData == null ? 0 : tagViewData.hashCode()) * 31;
                    Clause clause = this.f53270b;
                    return Boolean.hashCode(this.f53271c) + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
                }

                public a(TagViewData tagViewData, TimeClause timeClause, boolean z, int i) {
                    tagViewData = (i & 1) != 0 ? null : tagViewData;
                    timeClause = (i & 2) != 0 ? null : timeClause;
                    z = (i & 4) != 0 ? false : z;
                    this.f53269a = tagViewData;
                    this.f53270b = timeClause;
                    this.f53271c = z;
                }
            }

            public static final class b extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f53272a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f53273b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final wf f53274c;
                public final boolean d;
                public final boolean e;
                public final boolean f;

                public b() {
                    this(null, null, null, false, CertificateBody.profileType);
                }

                public static b a(b bVar, TextLocalisedClause textLocalisedClause, int i) {
                    Clause clause = bVar.f53272a;
                    Clause clause2 = textLocalisedClause;
                    if ((i & 2) != 0) {
                        clause2 = bVar.f53273b;
                    }
                    Clause clause3 = clause2;
                    bVar.getClass();
                    wf primaryStyle = bVar.f53274c;
                    boolean z = (i & 16) != 0 ? bVar.d : true;
                    boolean z3 = (i & 32) != 0 ? bVar.e : true;
                    boolean z4 = bVar.f;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(primaryStyle, "primaryStyle");
                    return new b(clause, clause3, primaryStyle, z, z3, z4);
                }

                public final boolean b() {
                    return this.f;
                }

                public final Clause c() {
                    return this.f53272a;
                }

                public final boolean d() {
                    return this.d;
                }

                public final wf e() {
                    return this.f53274c;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj2;
                    return Intrinsics.f(this.f53272a, bVar.f53272a) && Intrinsics.f(this.f53273b, bVar.f53273b) && this.f53274c == bVar.f53274c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
                }

                public final Clause f() {
                    return this.f53273b;
                }

                public final boolean g() {
                    return this.e;
                }

                public final int hashCode() {
                    Clause clause = this.f53272a;
                    int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
                    Clause clause2 = this.f53273b;
                    return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f53274c.hashCode() + j6.a.c((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, false)) * 31, 31, this.d), 31, this.e);
                }

                public b(Clause clause, Clause clause2, wf primaryStyle, boolean z, boolean z3, boolean z4) {
                    Intrinsics.checkNotNullParameter(primaryStyle, "primaryStyle");
                    this.f53272a = clause;
                    this.f53273b = clause2;
                    this.f53274c = primaryStyle;
                    this.d = z;
                    this.e = z3;
                    this.f = z4;
                }

                public /* synthetic */ b(Clause clause, Clause clause2, wf wfVar, boolean z, int i) {
                    this((i & 1) != 0 ? null : clause, (i & 2) != 0 ? null : clause2, (i & 8) != 0 ? wf.REGULAR : wfVar, (i & 16) == 0, (i & 32) == 0, (i & 64) != 0 ? true : z);
                }
            }

            private c() {
            }
        }

        public Model(String listId, MainImage mainImage, Clause title, of titleStyle, int i, Clause clause, lf lfVar, Clause clause2, int i2, int i3, c cVar, boolean z, af appearance, b state, List tags, mf mfVar, List statusList, bf bfVar, ef colorsVariant, gf gfVar, Object obj2, qv0.c positionInBox, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, hx7.i iVar, int i5, int i6, int i21, int i22, py0.a aVar, Parcelable parcelable, qv0.k positionInGroup) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(statusList, "statusList");
            Intrinsics.checkNotNullParameter(colorsVariant, "colorsVariant");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f53228a = listId;
            this.f53229b = mainImage;
            this.f53230c = title;
            this.d = titleStyle;
            this.e = i;
            this.f = clause;
            this.f53231g = lfVar;
            this.f53232h = clause2;
            this.i = i2;
            this.f53233j = i3;
            this.k = cVar;
            this.f53234l = z;
            this.f53235m = appearance;
            this.f53236n = state;
            this.o = tags;
            this.f53237p = mfVar;
            this.f53238q = statusList;
            this.f53239r = bfVar;
            this.f53240s = colorsVariant;
            this.f53241t = gfVar;
            this.u = obj2;
            this.v = positionInBox;
            this.f53242w = cVar2;
            this.f53243x = cVar3;
            this.f53244y = cVar4;
            this.z = cVar5;
            this.A = i5;
            this.B = i6;
            this.C = i21;
            this.D = i22;
            this.E = aVar;
            this.F = parcelable;
            this.G = positionInGroup;
        }

        public static Model x(Model model, String str, MainImage mainImage, Clause clause, Clause clause2, Clause clause3, int i, c cVar, boolean z, b bVar, Object obj2, int i2, int i3, int i5, int i6, py0.a aVar, int i21, int i22) {
            String listId = (i21 & 1) != 0 ? model.f53228a : str;
            MainImage mainImage2 = (i21 & 2) != 0 ? model.f53229b : mainImage;
            Clause title = (i21 & 4) != 0 ? model.f53230c : clause;
            of titleStyle = model.d;
            int i32 = (i21 & 16) != 0 ? model.e : 1;
            Clause clause4 = (i21 & 32) != 0 ? model.f : clause2;
            lf lfVar = model.f53231g;
            Clause clause5 = (i21 & 128) != 0 ? model.f53232h : clause3;
            int i33 = (i21 & 256) != 0 ? model.i : i;
            int i43 = (i21 & 512) != 0 ? model.f53233j : 1;
            c cVar2 = (i21 & 1024) != 0 ? model.k : cVar;
            boolean z3 = (i21 & 2048) != 0 ? model.f53234l : z;
            af appearance = model.f53235m;
            b state = (i21 & 8192) != 0 ? model.f53236n : bVar;
            List tags = model.o;
            MainImage mainImage3 = mainImage2;
            mf mfVar = model.f53237p;
            List statusList = model.f53238q;
            int i59 = i32;
            bf bfVar = model.f53239r;
            ef colorsVariant = model.f53240s;
            Clause clause6 = clause4;
            gf gfVar = model.f53241t;
            Object obj3 = (i21 & 4194304) != 0 ? model.u : obj2;
            qv0.c positionInBox = model.v;
            p31.c cVar3 = model.f53242w;
            p31.c cVar4 = model.f53243x;
            p31.c cVar5 = model.f53244y;
            p31.c cVar6 = model.z;
            int i66 = (i21 & PKIFailureInfo.duplicateCertReq) != 0 ? model.A : i2;
            int i74 = (i21 & 1073741824) != 0 ? model.B : i3;
            int i92 = (i21 & Integer.MIN_VALUE) != 0 ? model.C : i5;
            int i96 = (i22 & 1) != 0 ? model.D : i6;
            py0.a aVar2 = (i22 & 2) != 0 ? model.E : aVar;
            Parcelable parcelable = model.F;
            qv0.k positionInGroup = model.G;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(statusList, "statusList");
            Intrinsics.checkNotNullParameter(colorsVariant, "colorsVariant");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            return new Model(listId, mainImage3, title, titleStyle, i59, clause6, lfVar, clause5, i33, i43, cVar2, z3, appearance, state, tags, mfVar, statusList, bfVar, colorsVariant, gfVar, obj3, positionInBox, cVar3, cVar4, cVar5, cVar6, null, i66, i74, i92, i96, aVar2, parcelable, positionInGroup);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final bf getF53239r() {
            return this.f53239r;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getF53234l() {
            return this.f53234l;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final ef getF53240s() {
            return this.f53240s;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getE() {
            return this.f53234l;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final gf getF53241t() {
            return this.f53241t;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final MainImage getF53229b() {
            return this.f53229b;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final int getI() {
            return this.i;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF53230c() {
            return this.f53230c;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final int getF53233j() {
            return this.f53233j;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getE() {
            return this.e;
        }

        public final boolean J() {
            return Intrinsics.f(this.f53235m, ze.f55694a);
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final b getF53236n() {
            return this.f53236n;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final List getF53238q() {
            return this.f53238q;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final Clause getF53232h() {
            return this.f53232h;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final lf getF53231g() {
            return this.f53231g;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final List getO() {
            return this.o;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final mf getF53237p() {
            return this.f53237p;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public final of getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public final c getK() {
            return this.k;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.G = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new RowDelegate(null, null, 7);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51917h() {
            return this.u;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51913a() {
            return this.f53228a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Clause getF() {
            return this.f;
        }

        @Override // gx0.a
        public final py0.d d() {
            return new py0.c(this.f53230c);
        }

        @Override // koi.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final qv0.j z(Object oldItem) {
            pf pfVar;
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            MainImage mainImage = model.f53229b;
            c cVar = model.k;
            boolean z3 = !Intrinsics.f(mainImage, this.f53229b);
            boolean z4 = !Intrinsics.f(model.f53230c, this.f53230c);
            boolean z6 = model.d != this.d;
            boolean z11 = !Intrinsics.f(model.f53237p, this.f53237p);
            boolean z12 = model.e != this.e;
            boolean z29 = !Intrinsics.f(model.f, this.f);
            boolean z31 = !Intrinsics.f(model.f53231g, this.f53231g);
            boolean z41 = !Intrinsics.f(model.f53232h, this.f53232h);
            boolean z49 = model.i != this.i;
            boolean z54 = model.f53233j != this.f53233j;
            c cVar2 = this.k;
            boolean z74 = !Intrinsics.f(cVar, cVar2);
            if (model.f53234l != this.f53234l) {
                pfVar = null;
                z = true;
            } else {
                pfVar = null;
                z = false;
            }
            pf pfVar2 = pfVar;
            boolean z83 = !Intrinsics.f(model.f53235m, this.f53235m);
            boolean zM = or0.b.m(this, (qv0.l) oldItem);
            boolean z89 = !Intrinsics.f(model.f53236n, this.f53236n);
            boolean z96 = !Intrinsics.f(model.o, this.o);
            boolean z100 = !Intrinsics.f(model.f53238q, this.f53238q);
            bf bfVar = model.f53239r;
            Object obj2 = bfVar != null ? bfVar.f53728a : pfVar2;
            bf bfVar2 = this.f53239r;
            boolean z101 = !Intrinsics.f(obj2, bfVar2 != null ? bfVar2.f53728a : pfVar2);
            boolean z102 = model.f53240s != this.f53240s;
            boolean z103 = !Intrinsics.f(model.f53241t, this.f53241t);
            boolean z104 = !true;
            pf pfVar3 = cVar instanceof pf ? (pf) cVar : pfVar2;
            pf pfVar4 = cVar2 instanceof pf ? (pf) cVar2 : pfVar2;
            return new lb0(z3, z11, z4, false, z6, z12, z29, z31, z41, z49, z54, z74, z, z83, zM, z89, z96, z100, false, z101, z102, z103, z104, (pfVar3 != null ? pfVar3.f54595h : pfVar2) != (pfVar4 != null ? pfVar4.f54595h : pfVar2));
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53228a, model.f53228a) && Intrinsics.f(this.f53229b, model.f53229b) && Intrinsics.f(this.f53230c, model.f53230c) && this.d == model.d && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53231g, model.f53231g) && Intrinsics.f(this.f53232h, model.f53232h) && this.i == model.i && this.f53233j == model.f53233j && Intrinsics.f(this.k, model.k) && this.f53234l == model.f53234l && Intrinsics.f(this.f53235m, model.f53235m) && Intrinsics.f(this.f53236n, model.f53236n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53237p, model.f53237p) && Intrinsics.f(this.f53238q, model.f53238q) && Intrinsics.f(this.f53239r, model.f53239r) && this.f53240s == model.f53240s && Intrinsics.f(this.f53241t, model.f53241t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && Intrinsics.f(this.f53242w, model.f53242w) && Intrinsics.f(this.f53243x, model.f53243x) && Intrinsics.f(this.f53244y, model.f53244y) && Intrinsics.f(this.z, model.z) && Intrinsics.f(null, null) && this.A == model.A && this.B == model.B && this.C == model.C && this.D == model.D && Intrinsics.f(this.E, model.E) && Intrinsics.f(this.F, model.F) && this.G == model.G;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getO() {
            return this.A;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getK() {
            return this.G;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.A = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.F;
        }

        public final int hashCode() {
            int iHashCode = this.f53228a.hashCode() * 31;
            MainImage mainImage = this.f53229b;
            int iB = j6.a.b(this.e, (this.d.hashCode() + p.a.a((iHashCode + (mainImage == null ? 0 : mainImage.hashCode())) * 31, 31, this.f53230c)) * 31, 31);
            Clause clause = this.f;
            int iHashCode2 = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            lf lfVar = this.f53231g;
            int iHashCode3 = (iHashCode2 + (lfVar == null ? 0 : lfVar.hashCode())) * 31;
            Clause clause2 = this.f53232h;
            int iB2 = j6.a.b(this.f53233j, j6.a.b(this.i, (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31), 31);
            c cVar = this.k;
            int iD = p.a.d((this.f53236n.hashCode() + ((this.f53235m.hashCode() + j6.a.c((iB2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f53234l)) * 31)) * 31, 31, this.o);
            mf mfVar = this.f53237p;
            int iD2 = p.a.d((iD + (mfVar == null ? 0 : mfVar.hashCode())) * 29791, 31, this.f53238q);
            bf bfVar = this.f53239r;
            int iHashCode4 = (this.f53240s.hashCode() + ((iD2 + (bfVar == null ? 0 : bfVar.hashCode())) * 31)) * 31;
            gf gfVar = this.f53241t;
            int iHashCode5 = (iHashCode4 + (gfVar == null ? 0 : Integer.hashCode(gfVar.f54219a))) * 31;
            Object obj2 = this.u;
            int i = h30.l.i(this.v, (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
            p31.c cVar2 = this.f53242w;
            int iHashCode6 = (i + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53243x;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53244y;
            int iHashCode8 = (iHashCode7 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            p31.c cVar5 = this.z;
            int iB3 = j6.a.b(this.D, j6.a.b(this.C, j6.a.b(this.B, j6.a.b(this.A, (((iHashCode8 + (cVar5 == null ? 0 : cVar5.hashCode())) * 31) + 0) * 31, 31), 31), 31), 31);
            py0.a aVar = this.E;
            int iHashCode9 = (iB3 + (aVar == null ? 0 : aVar.f240640a.hashCode())) * 31;
            Parcelable parcelable = this.F;
            return this.G.hashCode() + ((iHashCode9 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f53242w;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.v = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51919l() {
            return this.f53243x;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53244y = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51922p() {
            return this.B;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51924r() {
            return this.D;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.B = i;
        }

        @Override // s31.c
        public final hx7.i p() {
            return null;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51918j() {
            return this.v;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51921n() {
            return this.z;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51920m() {
            return this.f53244y;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53242w = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.F = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51923q() {
            return this.C;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53243x = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.z = cVar;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final af getF53235m() {
            return this.f53235m;
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "Landroid/os/Parcelable;", "CountdownTimer", "Image56", "Image40", "Image24", "NestedImage", "IndentedImage", "Avatar", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Avatar;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$CountdownTimer;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Image24;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Image40;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Image56;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$IndentedImage;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$NestedImage;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class MainImage implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$CountdownTimer;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CountdownTimer extends MainImage {

                @NotNull
                public static final Parcelable.Creator<CountdownTimer> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CountdownTimerImage f53248a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CircleBadgeModel f53249b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f53250c;
                public final boolean d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CountdownTimer((CountdownTimerImage) parcel.readParcelable(CountdownTimer.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(CountdownTimer.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new CountdownTimer[i];
                    }
                }

                public CountdownTimer(CountdownTimerImage image, CircleBadgeModel circleBadgeModel, boolean z, boolean z3) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f53248a = image;
                    this.f53249b = circleBadgeModel;
                    this.f53250c = z;
                    this.d = z3;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.d;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: a */
                public final Image getF53263a() {
                    return this.f53248a;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final CircleBadgeModel getF53249b() {
                    return this.f53249b;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final CountdownTimerImage getF53248a() {
                    return this.f53248a;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final boolean getF53250c() {
                    return this.f53250c;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof CountdownTimer)) {
                        return false;
                    }
                    CountdownTimer countdownTimer = (CountdownTimer) obj2;
                    return Intrinsics.f(this.f53248a, countdownTimer.f53248a) && Intrinsics.f(this.f53249b, countdownTimer.f53249b) && this.f53250c == countdownTimer.f53250c && this.d == countdownTimer.d;
                }

                public final int hashCode() {
                    int iHashCode = this.f53248a.hashCode() * 31;
                    CircleBadgeModel circleBadgeModel = this.f53249b;
                    return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31, this.f53250c);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53248a, i);
                    dest.writeParcelable(this.f53249b, i);
                    dest.writeInt(this.f53250c ? 1 : 0);
                    dest.writeInt(this.d ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$IndentedImage;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class IndentedImage extends MainImage {

                @NotNull
                public static final Parcelable.Creator<IndentedImage> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f53260a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f53261b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CircleBadgeModel f53262c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new IndentedImage((Image) parcel.readParcelable(IndentedImage.class.getClassLoader()), parcel.readInt() != 0, (CircleBadgeModel) parcel.readParcelable(IndentedImage.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new IndentedImage[i];
                    }
                }

                public IndentedImage(Image image, boolean z, CircleBadgeModel circleBadgeModel) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f53260a = image;
                    this.f53261b = z;
                    this.f53262c = circleBadgeModel;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.f53261b;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Image getF53263a() {
                    return this.f53260a;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final CircleBadgeModel getF53262c() {
                    return this.f53262c;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof IndentedImage)) {
                        return false;
                    }
                    IndentedImage indentedImage = (IndentedImage) obj2;
                    return Intrinsics.f(this.f53260a, indentedImage.f53260a) && this.f53261b == indentedImage.f53261b && Intrinsics.f(this.f53262c, indentedImage.f53262c);
                }

                public final int hashCode() {
                    int iC = j6.a.c(this.f53260a.hashCode() * 31, 31, this.f53261b);
                    CircleBadgeModel circleBadgeModel = this.f53262c;
                    return iC + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53260a, i);
                    dest.writeInt(this.f53261b ? 1 : 0);
                    dest.writeParcelable(this.f53262c, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$NestedImage;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/hf", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class NestedImage extends MainImage {

                @NotNull
                public static final Parcelable.Creator<NestedImage> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f53263a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final hf f53264b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f53265c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new NestedImage((Image) parcel.readParcelable(NestedImage.class.getClassLoader()), hf.valueOf(parcel.readString()), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new NestedImage[i];
                    }
                }

                public NestedImage(Image image, hf iconType, boolean z) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(iconType, "iconType");
                    this.f53263a = image;
                    this.f53264b = iconType;
                    this.f53265c = z;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.f53265c;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Image getF53263a() {
                    return this.f53263a;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final hf getF53264b() {
                    return this.f53264b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof NestedImage)) {
                        return false;
                    }
                    NestedImage nestedImage = (NestedImage) obj2;
                    return Intrinsics.f(this.f53263a, nestedImage.f53263a) && this.f53264b == nestedImage.f53264b && this.f53265c == nestedImage.f53265c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f53265c) + ((this.f53264b.hashCode() + (this.f53263a.hashCode() * 31)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53263a, i);
                    dest.writeString(this.f53264b.name());
                    dest.writeInt(this.f53265c ? 1 : 0);
                }
            }

            /* JADX INFO: renamed from: X0 */
            public abstract boolean getF53265c();

            /* JADX INFO: renamed from: a */
            public Image getF53263a() {
                return null;
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Image40;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image40 extends MainImage {

                @NotNull
                public static final Parcelable.Creator<Image40> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f53254a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CircleBadgeModel f53255b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ProgressStyle f53256c;
                public final boolean d;
                public final NewBadgeContent e;
                public final boolean f;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image40((Image) parcel.readParcelable(Image40.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Image40.class.getClassLoader()), parcel.readInt() == 0 ? null : ProgressStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (NewBadgeContent) parcel.readParcelable(Image40.class.getClassLoader()), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Image40[i];
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public Image40(Image image, Image image2, ProgressStyle progressStyle, boolean z, int i) {
                    ProgressStyle progressStyle2 = (i & 4) != 0 ? null : progressStyle;
                    boolean z3 = (i & 8) != 0 ? false : z;
                    Intrinsics.checkNotNullParameter(image, "image");
                    this(image, image2 != null ? new RawImageBadge(image2) : null, progressStyle2, z3, null, false, 16);
                }

                public static Image40 b(Image40 image40, CircleIconBadge circleIconBadge, int i) {
                    Image image = image40.f53254a;
                    CircleBadgeModel circleBadgeModel = circleIconBadge;
                    if ((i & 2) != 0) {
                        circleBadgeModel = image40.f53255b;
                    }
                    CircleBadgeModel circleBadgeModel2 = circleBadgeModel;
                    ProgressStyle progressStyle = image40.f53256c;
                    boolean z = (i & 8) != 0 ? image40.d : true;
                    NewBadgeContent newBadgeContent = image40.e;
                    boolean z3 = image40.f;
                    image40.getClass();
                    Intrinsics.checkNotNullParameter(image, "image");
                    return new Image40(image, circleBadgeModel2, progressStyle, z, newBadgeContent, z3);
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.f;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Image getF53263a() {
                    return this.f53254a;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final NewBadgeContent getE() {
                    return this.e;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final CircleBadgeModel getF53255b() {
                    return this.f53255b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final boolean getD() {
                    return this.d;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Image40)) {
                        return false;
                    }
                    Image40 image40 = (Image40) obj2;
                    return Intrinsics.f(this.f53254a, image40.f53254a) && Intrinsics.f(this.f53255b, image40.f53255b) && Intrinsics.f(this.f53256c, image40.f53256c) && this.d == image40.d && Intrinsics.f(this.e, image40.e) && this.f == image40.f;
                }

                public final int hashCode() {
                    int iHashCode = this.f53254a.hashCode() * 31;
                    CircleBadgeModel circleBadgeModel = this.f53255b;
                    int iHashCode2 = (iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
                    ProgressStyle progressStyle = this.f53256c;
                    int iC = j6.a.c((iHashCode2 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31, 31, this.d);
                    NewBadgeContent newBadgeContent = this.e;
                    return Boolean.hashCode(this.f) + ((iC + (newBadgeContent != null ? newBadgeContent.hashCode() : 0)) * 31);
                }

                /* JADX INFO: renamed from: j, reason: from getter */
                public final ProgressStyle getF53256c() {
                    return this.f53256c;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53254a, i);
                    dest.writeParcelable(this.f53255b, i);
                    ProgressStyle progressStyle = this.f53256c;
                    if (progressStyle == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        progressStyle.writeToParcel(dest, i);
                    }
                    dest.writeInt(this.d ? 1 : 0);
                    dest.writeParcelable(this.e, i);
                    dest.writeInt(this.f ? 1 : 0);
                }

                public Image40(Image image, CircleBadgeModel circleBadgeModel, ProgressStyle progressStyle, boolean z, NewBadgeContent newBadgeContent, boolean z3) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f53254a = image;
                    this.f53255b = circleBadgeModel;
                    this.f53256c = progressStyle;
                    this.d = z;
                    this.e = newBadgeContent;
                    this.f = z3;
                }

                public /* synthetic */ Image40(Image image, CircleBadgeModel circleBadgeModel, ProgressStyle progressStyle, boolean z, NewBadgeContent newBadgeContent, boolean z3, int i) {
                    this(image, (i & 2) != 0 ? null : circleBadgeModel, (i & 4) != 0 ? null : progressStyle, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : newBadgeContent, (i & 32) != 0 ? false : z3);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Image56;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image56 extends MainImage {

                @NotNull
                public static final Parcelable.Creator<Image56> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f53257a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CircleBadgeModel f53258b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f53259c;
                public final boolean d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image56((Image) parcel.readParcelable(Image56.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Image56.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Image56[i];
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public Image56(Image image, Image image2) {
                    this(image, (CircleBadgeModel) (image2 != null ? new RawImageBadge(image2) : null), false, false);
                    Intrinsics.checkNotNullParameter(image, "image");
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.d;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Image getF53263a() {
                    return this.f53257a;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final CircleBadgeModel getF53258b() {
                    return this.f53258b;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final boolean getF53259c() {
                    return this.f53259c;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Image56)) {
                        return false;
                    }
                    Image56 image56 = (Image56) obj2;
                    return Intrinsics.f(this.f53257a, image56.f53257a) && Intrinsics.f(this.f53258b, image56.f53258b) && this.f53259c == image56.f53259c && this.d == image56.d;
                }

                public final int hashCode() {
                    int iHashCode = this.f53257a.hashCode() * 31;
                    CircleBadgeModel circleBadgeModel = this.f53258b;
                    return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31, this.f53259c);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53257a, i);
                    dest.writeParcelable(this.f53258b, i);
                    dest.writeInt(this.f53259c ? 1 : 0);
                    dest.writeInt(this.d ? 1 : 0);
                }

                public Image56(Image image, CircleBadgeModel circleBadgeModel, boolean z, boolean z3) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f53257a = image;
                    this.f53258b = circleBadgeModel;
                    this.f53259c = z;
                    this.d = z3;
                }

                public /* synthetic */ Image56(Image image, CircleBadgeModel circleBadgeModel, boolean z, int i) {
                    this(image, (i & 2) != 0 ? null : circleBadgeModel, (i & 4) != 0 ? false : z, false);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Avatar;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Avatar extends MainImage {

                @NotNull
                public static final Parcelable.Creator<Avatar> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AvatarModel f53245a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final mx0.i1 f53246b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f53247c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Avatar((AvatarModel) parcel.readParcelable(Avatar.class.getClassLoader()), mx0.i1.valueOf(parcel.readString()), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Avatar[i];
                    }
                }

                public Avatar(AvatarModel avatarModel, mx0.i1 style, boolean z) {
                    Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
                    Intrinsics.checkNotNullParameter(style, "style");
                    this.f53245a = avatarModel;
                    this.f53246b = style;
                    this.f53247c = z;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.f53247c;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final mx0.i1 getF53246b() {
                    return this.f53246b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Avatar)) {
                        return false;
                    }
                    Avatar avatar = (Avatar) obj2;
                    return Intrinsics.f(this.f53245a, avatar.f53245a) && this.f53246b == avatar.f53246b && this.f53247c == avatar.f53247c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f53247c) + ((this.f53246b.hashCode() + (this.f53245a.hashCode() * 31)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53245a, i);
                    dest.writeString(this.f53246b.name());
                    dest.writeInt(this.f53247c ? 1 : 0);
                }

                public /* synthetic */ Avatar(AvatarModel avatarModel, mx0.i1 i1Var, int i) {
                    this(avatarModel, (i & 2) != 0 ? mx0.i1.SIZE_40_40 : i1Var, false);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage$Image24;", "Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model$MainImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image24 extends MainImage {

                @NotNull
                public static final Parcelable.Creator<Image24> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Image f53251a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f53252b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f53253c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image24((Image) parcel.readParcelable(Image24.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Image24[i];
                    }
                }

                public Image24(Image image, boolean z, boolean z3) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f53251a = image;
                    this.f53252b = z;
                    this.f53253c = z3;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: X0, reason: from getter */
                public final boolean getF53265c() {
                    return this.f53252b;
                }

                @Override // com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Image getF53263a() {
                    return this.f53251a;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final boolean getF53253c() {
                    return this.f53253c;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Image24)) {
                        return false;
                    }
                    Image24 image24 = (Image24) obj2;
                    return Intrinsics.f(this.f53251a, image24.f53251a) && this.f53252b == image24.f53252b && this.f53253c == image24.f53253c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f53253c) + j6.a.c(this.f53251a.hashCode() * 31, 31, this.f53252b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f53251a, i);
                    dest.writeInt(this.f53252b ? 1 : 0);
                    dest.writeInt(this.f53253c ? 1 : 0);
                }

                public /* synthetic */ Image24(Image image, boolean z, boolean z3, int i) {
                    this(image, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z3);
                }
            }
        }

        public Model(String str, MainImage mainImage, Clause clause, of ofVar, int i, Clause clause2, lf lfVar, Clause clause3, int i2, int i3, c cVar, boolean z, af afVar, b bVar, List list, mf mfVar, List list2, bf bfVar, ef efVar, gf gfVar, Object obj2, qv0.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, p31.c cVar6, int i5, int i6, int i21, int i22, Parcelable parcelable, int i32, int i33) {
            this(str, mainImage, clause, (i32 & 8) != 0 ? of.DEFAULT : ofVar, (i32 & 16) != 0 ? Integer.MAX_VALUE : i, clause2, (i32 & 64) != 0 ? null : lfVar, (i32 & 128) != 0 ? null : clause3, (i32 & 256) != 0 ? 8 : i2, (i32 & 512) != 0 ? 8 : i3, (i32 & 1024) != 0 ? null : cVar, (i32 & 2048) != 0 ? true : z, (i32 & 4096) != 0 ? xe.f55602a : afVar, (i32 & 8192) != 0 ? b.c.f53268a : bVar, (i32 & 16384) != 0 ? zhm.f0.f322471a : list, (32768 & i32) != 0 ? null : mfVar, (262144 & i32) != 0 ? zhm.f0.f322471a : list2, (524288 & i32) != 0 ? null : bfVar, (1048576 & i32) != 0 ? ef.DEFAULT : efVar, (2097152 & i32) != 0 ? null : gfVar, (4194304 & i32) != 0 ? null : obj2, (8388608 & i32) != 0 ? c.d.f249513a : cVar2, (16777216 & i32) != 0 ? null : cVar3, (33554432 & i32) != 0 ? null : cVar4, (67108864 & i32) != 0 ? null : cVar5, (134217728 & i32) != 0 ? null : cVar6, null, (536870912 & i32) != 0 ? R$attr.uikit_dp16 : i5, (1073741824 & i32) != 0 ? R$attr.uikit_dp16 : i6, (i32 & Integer.MIN_VALUE) != 0 ? R$attr.uikit_dp16 : i21, (i33 & 1) != 0 ? R$attr.uikit_dp16 : i22, null, (i33 & 4) != 0 ? null : parcelable, qv0.k.OutOfGroup);
        }

        public Model(String listId, Image image, ff ffVar, ProgressStyle progressStyle, Clause title, Clause clause, Clause clause2, lf lfVar, int i, c cVar, boolean z, boolean z3, Image image2, b bVar, ArrayList arrayList, df dfVar, ef efVar, Object obj2, AnalyticsContext analyticsContext, int i2, int i3, int i5, int i6, int i21) {
            MainImage image24;
            Image image3 = (i21 & 2) != 0 ? null : image;
            ff imageSize = (i21 & 4) != 0 ? ff.DP_40 : ffVar;
            ProgressStyle progressStyle2 = (i21 & 8) != 0 ? null : progressStyle;
            of titleStyle = of.DEFAULT;
            int i22 = (i21 & 64) != 0 ? Integer.MAX_VALUE : 2;
            Clause clause3 = (i21 & 128) != 0 ? null : clause;
            Clause clause4 = (i21 & 256) != 0 ? null : clause2;
            lf lfVar2 = (i21 & 512) != 0 ? null : lfVar;
            int i32 = (i21 & 1024) != 0 ? 8 : i;
            c cVar2 = (i21 & 2048) != 0 ? null : cVar;
            boolean z4 = (i21 & 4096) != 0 ? true : z;
            boolean z6 = (i21 & 8192) != 0 ? false : z3;
            Image image4 = (i21 & 16384) != 0 ? null : image2;
            b state = (i21 & 32768) != 0 ? b.c.f53268a : bVar;
            List tags = (i21 & 65536) != 0 ? zhm.f0.f322471a : arrayList;
            zhm.f0 statusList = zhm.f0.f322471a;
            df dfVar2 = (i21 & PKIFailureInfo.badSenderNonce) != 0 ? null : dfVar;
            ef colorsVariant = (i21 & 4194304) != 0 ? ef.DEFAULT : efVar;
            Object obj3 = (i21 & 16777216) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i21 & 33554432) != 0 ? null : analyticsContext;
            int i33 = (i21 & 67108864) != 0 ? R$attr.uikit_dp16 : i2;
            int i43 = (i21 & 134217728) != 0 ? R$attr.uikit_dp16 : i3;
            int i59 = (i21 & 268435456) != 0 ? R$attr.uikit_dp16 : i5;
            int i66 = (i21 & PKIFailureInfo.duplicateCertReq) != 0 ? R$attr.uikit_dp16 : i6;
            Image image5 = image3;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(statusList, "statusList");
            Intrinsics.checkNotNullParameter(colorsVariant, "colorsVariant");
            if (image5 != null) {
                int i74 = xf.f55603a[imageSize.ordinal()];
                if (i74 == 1) {
                    boolean z11 = false;
                    image24 = new MainImage.Image24(image5, z11, z11, 6);
                } else if (i74 == 2) {
                    image24 = new MainImage.Image40(image5, image4, progressStyle2, false, 24);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                image24 = null;
            }
            af.Companion.getClass();
            df dfVar3 = dfVar2;
            ef efVar2 = colorsVariant;
            MainImage mainImage = image24;
            this(listId, mainImage, title, titleStyle, i22, clause3, lfVar2, clause4, i32, 0, cVar2, z4, z6 ? ze.f55694a : xe.f55602a, state, tags, null, statusList, dfVar3 != null ? new bf(dfVar3) : null, efVar2, null, obj3, c.d.f249513a, null, null, null, null, i33, i43, i59, i66, analyticsContext2, 520094208, 10);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, MainImage mainImage, Clause title, of ofVar, int i, Clause clause, Clause clause2, lf lfVar, int i2, c cVar, boolean z, List list, boolean z3, b bVar, List list2, mf mfVar, bf bfVar, ef efVar, gf gfVar, Object obj2, Parcelable parcelable, int i3, int i5, int i6, int i21, int i22) {
            MainImage mainImage2 = (i22 & 2) != 0 ? null : mainImage;
            of titleStyle = (i22 & 8) != 0 ? of.DEFAULT : ofVar;
            int i32 = (i22 & 16) != 0 ? Integer.MAX_VALUE : i;
            Clause clause3 = (i22 & 32) != 0 ? null : clause;
            Clause clause4 = (i22 & 64) != 0 ? null : clause2;
            lf lfVar2 = (i22 & 128) != 0 ? null : lfVar;
            int i33 = (i22 & 256) != 0 ? 8 : i2;
            int i43 = (i22 & 512) != 0 ? 8 : 1;
            c cVar2 = (i22 & 1024) != 0 ? null : cVar;
            boolean z4 = (i22 & 2048) != 0 ? true : z;
            List statusList = (i22 & 4096) != 0 ? zhm.f0.f322471a : list;
            boolean z6 = (i22 & 8192) != 0 ? false : z3;
            b state = (i22 & 16384) != 0 ? b.c.f53268a : bVar;
            List tags = (32768 & i22) != 0 ? zhm.f0.f322471a : list2;
            mf mfVar2 = (i22 & 65536) != 0 ? null : mfVar;
            bf bfVar2 = (i22 & 524288) != 0 ? null : bfVar;
            ef colorsVariant = (i22 & PKIFailureInfo.badCertTemplate) != 0 ? ef.DEFAULT : efVar;
            gf gfVar2 = (i22 & PKIFailureInfo.badSenderNonce) != 0 ? null : gfVar;
            Object obj3 = (i22 & 4194304) != 0 ? null : obj2;
            Parcelable parcelable2 = (i22 & 8388608) != 0 ? null : parcelable;
            int i59 = (i22 & 16777216) != 0 ? R$attr.uikit_dp16 : i3;
            int i66 = (i22 & 33554432) != 0 ? R$attr.uikit_dp16 : i5;
            int i74 = (i22 & 67108864) != 0 ? R$attr.uikit_dp16 : i6;
            int i92 = (i22 & 134217728) != 0 ? R$attr.uikit_dp16 : i21;
            boolean z11 = z6;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(statusList, "statusList");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(colorsVariant, "colorsVariant");
            af.Companion.getClass();
            this(listId, mainImage2, title, titleStyle, i32, clause3, lfVar2, clause4, i33, i43, cVar2, z4, z11 ? ze.f55694a : xe.f55602a, state, tags, mfVar2, statusList, bfVar2, colorsVariant, gfVar2, obj3, c.d.f249513a, null, null, null, null, i59, i66, i74, i92, parcelable2, 520093696, 8);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.RowDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public RowDelegate() {
        this(null, null, 7);
    }

    public static zf A(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zf(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_row));
    }

    public static CompositeClause B(lf lfVar) {
        com.revolut.core.ui_kit.models.i iVar;
        aim.e eVarB = zhm.u.b();
        Clause clauseA = lfVar.a();
        int i = ag.f[lfVar.b().ordinal()];
        if (i == 1) {
            iVar = com.revolut.core.ui_kit.models.i.SMALL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = com.revolut.core.ui_kit.models.i.MEDIUM;
        }
        eVarB.add(new LabelBadgeInternalClause(new LabelBadgeInternalClause.Type.Inline(clauseA, iVar)));
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), zhm.u.a(eVarB));
    }

    public static void C(View view, Model model) {
        or0.u.k(view).n0().a(view, model, new py0.c(model.getF53230c()));
    }

    public static void D(zf zfVar, Model.MainImage mainImage, ef efVar) {
        rd0.e.r(zfVar.N(), mainImage instanceof Model.MainImage.Image24 ? new yp0.o(yp0.n.FACTOR_100) : efVar == ef.ACTIONABLE ? v : null);
    }

    public static void r(zf zfVar, Model model) {
        View view = zfVar.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
        if (model.getF() == null && model.getF53238q().isEmpty()) {
            constraintSetL.connect(zfVar.K().getId(), 3, 0, 3);
            constraintSetL.connect(zfVar.K().getId(), 4, 0, 4);
        } else {
            constraintSetL.connect(zfVar.K().getId(), 3, zfVar.U().getId(), 3);
            constraintSetL.clear(zfVar.K().getId(), 4);
        }
        constraintSetL.applyTo(constraintLayout);
    }

    public static void s(zf zfVar) {
        View view = zfVar.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
        View viewF = zfVar.F();
        if (viewF.getVisibility() != 0) {
            viewF = null;
        }
        if (viewF != null) {
            constraintSetL.connect(zfVar.K().getId(), 3, viewF.getId(), 3);
            constraintSetL.connect(zfVar.K().getId(), 4, viewF.getId(), 4);
        } else {
            constraintSetL.connect(zfVar.K().getId(), 3, 0, 3);
            constraintSetL.clear(zfVar.K().getId(), 4);
        }
        constraintSetL.applyTo(constraintLayout);
    }

    public static void t(zf zfVar, Model model) {
        TagsView tagsViewS;
        OverlappedIconsView overlappedIconsViewI;
        View view = zfVar.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
        float f = (zfVar.P().getVisibility() == 8 && ((tagsViewS = zfVar.S()) == null || tagsViewS.getVisibility() == 8) && ((overlappedIconsViewI = zfVar.I()) == null || overlappedIconsViewI.getVisibility() == 8)) ? 0.5f : BitmapDescriptorFactory.HUE_RED;
        constraintSetL.setVerticalBias(R$id.row_mainImage, f);
        AvatarView avatarViewH = zfVar.H();
        if (avatarViewH != null) {
            constraintSetL.setVerticalBias(avatarViewH.getId(), f);
        }
        Model.c k = model.getK();
        boolean z = true;
        if (!(k instanceof qf) ? !(k instanceof rf) || ((rf) k).d() == null : ((qf) k).d() == null) {
            z = false;
        }
        View viewF = zfVar.F();
        if (viewF.getVisibility() != 0) {
            viewF = null;
        }
        if (zfVar.P().getVisibility() == 8 && zfVar.Z().getVisibility() == 0 && zfVar.a0().getVisibility() == 8) {
            constraintSetL.connect(zfVar.U().getId(), 3, 0, 3);
            constraintSetL.connect(zfVar.U().getId(), 4, 0, 4);
            constraintSetL.connect(zfVar.Z().getId(), 3, zfVar.W().getId(), 3);
            constraintSetL.connect(zfVar.Z().getId(), 4, zfVar.J().getId(), 4);
        } else if (zfVar.P().getVisibility() == 8 && zfVar.Z().getVisibility() == 0 && zfVar.a0().getVisibility() == 0) {
            constraintSetL.connect(zfVar.U().getId(), 3, zfVar.W().getId(), 3);
            constraintSetL.connect(zfVar.U().getId(), 4, zfVar.J().getId(), 3);
            constraintSetL.connect(zfVar.Z().getId(), 3, zfVar.W().getId(), 3);
            constraintSetL.connect(zfVar.Z().getId(), 4, zfVar.a0().getId(), 3);
        } else if (zfVar.P().getVisibility() == 8 && viewF != null && z) {
            constraintSetL.connect(zfVar.U().getId(), 3, viewF.getId(), 3);
            constraintSetL.clear(zfVar.U().getId(), 4);
        } else if (zfVar.P().getVisibility() == 0 && z) {
            constraintSetL.connect(zfVar.U().getId(), 3, 0, 3);
            constraintSetL.connect(zfVar.U().getId(), 4, zfVar.P().getId(), 3);
            constraintSetL.clear(zfVar.P().getId(), 4);
        } else {
            constraintSetL.connect(zfVar.U().getId(), 3, 0, 3);
            constraintSetL.connect(zfVar.U().getId(), 4, zfVar.P().getId(), 3);
            constraintSetL.connect(zfVar.Z().getId(), 3, 0, 3);
            constraintSetL.connect(zfVar.Z().getId(), 4, zfVar.a0().getId(), 3);
        }
        constraintSetL.applyTo(constraintLayout);
    }

    public static void u(SmallActionButton smallActionButton, pf pfVar) {
        AnimationRequest animationRequestC = pfVar.c();
        if (animationRequestC == null || animationRequestC.getF57724a()) {
            if (animationRequestC == null) {
                smallActionButton.getGlowHighlightManager().a();
                return;
            }
            return;
        }
        animationRequestC.b();
        smallActionButton.getGlowHighlightManager().a();
        ie7.a aVar = new ie7.a(smallActionButton, 15);
        if (smallActionButton.isLaidOut()) {
            aVar.invoke();
        } else {
            smallActionButton.post(new fp0.l(aVar, 12));
        }
    }

    public static void v(TextView textView, int i) {
        if (i != textView.getMaxLines()) {
            textView.setSingleLine(i == 1);
            textView.setMaxLines(i);
        }
    }

    public static void y(zf zfVar, ImageView imageView, Image image) {
        View view = zfVar.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), image, imageView, null, null, 12);
        imageView.setVisibility(image != null ? 0 : 8);
        if (image == null) {
            imageView.setBackground(null);
            return;
        }
        Context context = zfVar.N().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context)), null, null));
    }

    @Override // koi.k
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder g(ViewGroup viewGroup) {
        return A(viewGroup);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        zf zfVar = (zf) holder;
        ViewGroup viewGroup = (ViewGroup) zfVar.K().b(R$layout.internal_delegate_row_editable_amount);
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R$id.row_valueEditableAmount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            w((MaskedTextInputEditText) viewFindViewById);
        }
        ViewGroup viewGroup2 = (ViewGroup) zfVar.K().b(R$layout.internal_delegate_row_editable_number);
        if (viewGroup2 != null) {
            View viewFindViewById2 = viewGroup2.findViewById(R$id.row_valueEditableNumber);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            x((MaskedTextInputEditText) viewFindViewById2);
        }
        super.onViewRecycled(holder);
    }

    public final void w(MaskedTextInputEditText maskedTextInputEditText) {
        WeakHashMap weakHashMap = this.f;
        yz0.b bVar = (yz0.b) weakHashMap.get(maskedTextInputEditText);
        if (bVar != null) {
            bVar.a();
        }
        weakHashMap.remove(maskedTextInputEditText);
        maskedTextInputEditText.setMaskingDelegate(null);
    }

    public final void x(MaskedTextInputEditText maskedTextInputEditText) {
        WeakHashMap weakHashMap = this.f53217g;
        yz0.b bVar = (yz0.b) weakHashMap.get(maskedTextInputEditText);
        if (bVar != null) {
            bVar.a();
        }
        weakHashMap.remove(maskedTextInputEditText);
        maskedTextInputEditText.setMaskingDelegate(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ec  */
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
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.revolut.core.ui_kit.delegates.zf r48, com.revolut.core.ui_kit.delegates.RowDelegate.Model r49, int r50, java.util.List r51) {
        /*
            Method dump skipped, instruction units count: 3424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.RowDelegate.q(com.revolut.core.ui_kit.delegates.zf, com.revolut.core.ui_kit.delegates.RowDelegate$Model, int, java.util.List):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowDelegate(Function2 function2, Function2 function22, int i) {
        super(R$layout.internal_delegate_row, new akg.d(21));
        function2 = (i & 1) != 0 ? null : function2;
        function22 = (i & 2) != 0 ? null : function22;
        this.d = function2;
        this.e = function22;
        this.f = new WeakHashMap();
        this.f53217g = new WeakHashMap();
        this.f53218h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f53219j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f53220l = v0.a.d("create(...)");
        this.f53221m = v0.a.d("create(...)");
        this.f53222n = v0.a.d("create(...)");
        this.o = new e01.a();
        this.f53223p = v0.a.d("create(...)");
        this.f53224q = v0.a.d("create(...)");
        this.f53225r = v0.a.d("create(...)");
        ihm.f fVarD = v0.a.d("create(...)");
        this.f53226s = fVarD;
        this.f53227t = v0.a.d("create(...)");
        this.u = new ald.o(1, fVarD, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 4);
    }
}

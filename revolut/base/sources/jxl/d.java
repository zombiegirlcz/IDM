package jxl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.delegates.CardDesignViewDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.ui_kit.card_scene.R$id;
import com.revolut.ui_kit.card_scene.R$layout;
import ip0.o5;
import ip0.ue0;
import ip0.we0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import vkm.q;
import z4l.j;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends FrameLayout implements jxl.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nxl.b f179251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f179253c;
    public final CardDesignViewDelegate d;
    public final SimpleMediaDelegate e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f179254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewPager2 f179255h;
    public final LinkedHashMap i;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(d dVar, nxl.b bVar) {
        nxl.a aVar;
        Object next;
        Object obj2;
        dVar.f179251a = bVar;
        dVar.setCardVideoBackgroundModels(bVar);
        dVar.getViewPagerAdapter().c(dVar.getCardItems());
        Iterator it8 = bVar.f220581b.iterator();
        while (true) {
            aVar = null;
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((nxl.a) next).f220577a, bVar.f220582c)) {
                    break;
                }
            }
        }
        nxl.a aVar2 = (nxl.a) next;
        if (aVar2 == null) {
            aVar2 = (nxl.a) d0.d0(bVar.f220581b);
        }
        if (aVar2 != null) {
            String str = aVar2.f220577a;
            dVar.setCurrentDesign(str);
            String str2 = (String) dVar.f179253c.getValue();
            ViewPager2 viewPager2 = dVar.f179255h;
            nxl.b bVar2 = dVar.f179251a;
            if (bVar2 != null) {
                Iterator it9 = bVar2.f220581b.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    if (Intrinsics.f(((nxl.a) next2).f220577a, str2)) {
                        obj2 = next2;
                        break;
                    }
                }
                aVar = (nxl.a) obj2;
            }
            if (aVar != null) {
                String str3 = aVar.f220577a;
                nxl.b bVar3 = dVar.f179251a;
                if (bVar3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIndexOf = bVar3.f220581b.indexOf(aVar);
                if (viewPager2.getCurrentItem() != iIndexOf) {
                    viewPager2.setCurrentItem(iIndexOf, false);
                } else {
                    dVar.setCurrentDesign(str3);
                    dVar.setVideoBackground(str3);
                }
            }
            dVar.setVideoBackground(str);
        }
    }

    private final List<o5> getCardItems() {
        nxl.b bVar = this.f179251a;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList<nxl.a> arrayList = bVar.f220581b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (nxl.a aVar : arrayList) {
            arrayList2.add(new o5(aVar.f220577a, aVar.f220578b));
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j getRecyclerViewAdapter() {
        return (j) this.f179254g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j getViewPagerAdapter() {
        return (j) this.f.getValue();
    }

    private final void setCardVideoBackgroundModels(nxl.b bVar) {
        for (nxl.a aVar : bVar.f220581b) {
            UrlVideo urlVideo = aVar.f220579c;
            if (urlVideo != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.i.put(aVar.f220577a, new we0("VIDEO_BACKGROUND_ID", new ue0(UrlVideo.a(urlVideo, false, oz0.b.FIT, null, LDSFile.EF_SOD_TAG), (int) (kli.a.z(c8g.c.G(context2), context) + 52))));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentDesign(String str) {
        this.f179253c.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoBackground(String str) {
        we0 we0Var;
        getRecyclerViewAdapter().d();
        nxl.b bVar = this.f179251a;
        nxl.a aVar = null;
        Object obj2 = null;
        if (bVar != null) {
            Iterator it8 = bVar.f220581b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((nxl.a) next).f220577a, str)) {
                    obj2 = next;
                    break;
                }
            }
            aVar = (nxl.a) obj2;
        }
        if (aVar == null || aVar.f220579c == null || (we0Var = (we0) this.i.get(str)) == null) {
            return;
        }
        getRecyclerViewAdapter().c(u.c(we0Var));
    }

    @Override // jxl.a
    public final j2 a() {
        return this.f179253c;
    }

    @Override // jxl.a
    public final void b(nxl.b cardImageGroup) {
        Intrinsics.checkNotNullParameter(cardImageGroup, "cardImageGroup");
        post(new d0.c(this, cardImageGroup, 29));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        this.f179255h.setPageTransformer(new c((int) Math.abs(((i - (this.f179252b * 0.63076925f)) * 0.5f) + kli.a.k(r2, 8.0f))));
    }

    @Override // jxl.a
    public void setCardMetrics(@NotNull nxl.c cardMetrics) {
        Intrinsics.checkNotNullParameter(cardMetrics, "cardMetrics");
        int i = cardMetrics.f220584b;
        ViewPager2 viewPager2 = this.f179255h;
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i >= 0 && i != marginLayoutParams.topMargin) {
            marginLayoutParams.topMargin = i;
            viewPager2.setLayoutParams(marginLayoutParams);
        }
        int i2 = cardMetrics.f220583a;
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        ViewGroup.LayoutParams layoutParams2 = viewPager2.getLayoutParams();
        if (layoutParams2.height != i2) {
            layoutParams2.height = i2;
            viewPager2.setLayoutParams(layoutParams2);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f179252b = i2 - kli.a.k(context, 40.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f179253c = q.c("");
        q.c("");
        e eVar = new e(this);
        this.d = new CardDesignViewDelegate();
        this.e = new SimpleMediaDelegate();
        final int i2 = 0;
        this.f = te0.w.y0(new Function0(this) { // from class: jxl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f179249b;

            {
                this.f179249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new j(7, u.c(this.f179249b.d), false);
                    default:
                        return new j(7, u.c(this.f179249b.e), false);
                }
            }
        });
        final int i3 = 1;
        this.f179254g = te0.w.y0(new Function0(this) { // from class: jxl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f179249b;

            {
                this.f179249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new j(7, u.c(this.f179249b.d), false);
                    default:
                        return new j(7, u.c(this.f179249b.e), false);
                }
            }
        });
        this.i = new LinkedHashMap();
        View.inflate(context, R$layout.view_card_design_carousel, this);
        View viewFindViewById = findViewById(R$id.cardDesignCarouselView_cardDesignViewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById;
        this.f179255h = viewPager2;
        View viewFindViewById2 = findViewById(R$id.cardDesignCarouselView_backgroundRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        viewPager2.setAdapter(getViewPagerAdapter());
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.registerOnPageChangeCallback(eVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(getRecyclerViewAdapter());
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

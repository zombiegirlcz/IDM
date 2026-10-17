package yr0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends PopupWindow implements h {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f316076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f316077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iv0.s f316078c;
    public final k d;
    public final a e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f316079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f316080h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f316081j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f316082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f316083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f316084n;
    public View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, ArrayList sections, mw0.c cVar) {
        a aVar;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sections, "items");
        int iK = kli.a.k(context, 10.0f);
        this.f316076a = iK;
        int iK2 = kli.a.k(context, 16.0f) - iK;
        iK2 = iK2 < 0 ? 0 : iK2;
        this.f316077b = iK2;
        qv0.h hVar = qv0.h.EXTRA_LARGE;
        iv0.s sVar = new iv0.s(kli.a.k(context, hVar.a()), true);
        this.f316078c = sVar;
        k kVar = new k(context, null);
        kVar.setClipToOutline(true);
        kVar.setOutlineProvider(sVar);
        kVar.setBackgroundColor(kli.a.s(R$attr.uikit_colorPopoverBackground, context));
        a(kVar);
        kVar.setCallback(this);
        Intrinsics.checkNotNullParameter(sections, "sections");
        kVar.c(null, sections);
        this.d = kVar;
        if (cVar != null) {
            aVar = new a(context, null);
            aVar.setClipToOutline(true);
            aVar.setOutlineProvider(new iv0.s(hVar.a(), true));
            a(aVar);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = foh.i.j(4);
            aVar.setLayoutParams(layoutParams);
            aVar.setEmojiBarData(cVar.f209284a, true, cVar.f209285b);
        } else {
            if (cVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = null;
        }
        this.e = aVar;
        l lVar = new l(context);
        lVar.setOrientation(1);
        if (aVar != null) {
            lVar.addView(aVar);
        }
        lVar.addView(kVar, -2, -2);
        this.f = lVar;
        int i = iK2 + iK;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.popupMenuWindow_root);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(i, iK, i, iK);
        frameLayout.setOnClickListener(new wk.a(this, 2));
        frameLayout.setSoundEffectsEnabled(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        frameLayout.addView(lVar, layoutParams2);
        frameLayout.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 29));
        setContentView(frameLayout);
        setBackgroundDrawable(null);
        setFocusable(true);
        setInputMethodMode(2);
        setHeight(-1);
        setWidth(-1);
    }

    public final void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewGroup.setOutlineAmbientShadowColor(kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorPopupShadow, context));
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        viewGroup.setOutlineSpotShadowColor(kli.a.s(R$attr.uikit_colorBlack_60, context2));
        viewGroup.setElevation(this.f316076a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r7) {
        /*
            r6 = this;
            yr0.m r0 = yr0.o.Companion
            android.view.View r1 = r6.getContentView()
            int r1 = r1.getWidth()
            int r2 = r6.f316076a
            int r2 = r2 * 2
            int r2 = r2 + r7
            int r7 = r6.i
            int r3 = r6.f316079g
            r0.getClass()
            int r1 = r1 - r2
            int r0 = r6.f316077b
            int r4 = r1 - r0
            r7 = r7 & 7
            r5 = 1
            if (r7 == r5) goto L25
            r5 = 5
            if (r7 == r5) goto L28
        L23:
            int r3 = r3 - r2
            goto L28
        L25:
            int r2 = r2 / 2
            goto L23
        L28:
            if (r4 < r0) goto L2f
            int r7 = kotlin.ranges.f.g(r3, r0, r4)
            goto L34
        L2f:
            int r7 = r1 / 2
            if (r7 >= 0) goto L34
            r7 = 0
        L34:
            int r7 = r7 - r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yr0.o.b(int):int");
    }

    public final int c(int i) {
        m mVar = Companion;
        int height = getContentView().getHeight();
        int i2 = (this.f316076a * 2) + i;
        int i3 = this.i;
        int i5 = this.f316080h;
        mVar.getClass();
        int i6 = i3 & 112;
        if (i6 == 16) {
            int i21 = height - i2;
            if (i21 >= 0) {
                return kotlin.ranges.f.g(i5 - (i2 / 2), 0, i21);
            }
        } else {
            if (i6 != 80) {
                int i22 = height - i2;
                return i5 > i22 ? i22 : i5;
            }
            int i32 = i5 - i2;
            if (i32 >= 0) {
                return i32;
            }
        }
        return 0;
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        WindowInsets rootWindowInsets;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View rootView = parent.getRootView();
        int i5 = (rootView == null || (rootWindowInsets = rootView.getRootWindowInsets()) == null) ? 0 : WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets).getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime()).top;
        this.f316079g = i2;
        this.f316080h = i3 - i5;
        this.i = i;
        super.showAtLocation(parent, 0, 0, 0);
    }
}

package vt0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f291898b;
    public final View f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        u.z(this.f291898b, 0, insets2.top, 0, 0, false, 29);
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, Insets.NONE).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        WindowInsets windowInsets = windowInsetsCompatBuild.toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    public final void setCloseButtonClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f291898b.setOnNavigationButtonClickListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_light_prompt_full_screen_loading, this);
        View viewFindViewById = findViewById(R$id.lightPromptLoading_navbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        BasicNavBar basicNavBar = (BasicNavBar) viewFindViewById;
        this.f291898b = basicNavBar;
        View viewFindViewById2 = findViewById(R$id.lightPromptLoading_closeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = viewFindViewById2;
        basicNavBar.setVisibility(0);
        viewFindViewById2.setVisibility(8);
        basicNavBar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        View viewFindViewById3 = findViewById(R$id.lightPromptLoading_headerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        io3.h.s((ShimmerConstraintLayout) viewFindViewById3);
        z4l.j jVar = new z4l.j(7, zhm.u.c(new RowLoadingDelegate()), false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.lightPromptLoading_rowsRecycler);
        recyclerView.setAdapter(jVar);
        recyclerView.addItemDecoration(new o31.b());
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(nb0.a(pb0.Companion, String.valueOf(i2), false, 6));
        }
        jVar.c(arrayList);
        setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
        ViewUtils.requestApplyInsetsWhenAttached(this);
    }

    public /* synthetic */ m(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

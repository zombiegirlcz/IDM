package mx0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.delegates.SelectableIconDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q4 extends ConstraintLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f209952b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SelectableIconDelegate f209953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f209954h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RecyclerView f209955j;
    public final z4l.j k;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_closeable_icon_selection, this);
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f209952b = fVar;
        this.f = v0.a.d("create(...)");
        SelectableIconDelegate selectableIconDelegate = new SelectableIconDelegate(true);
        this.f209953g = selectableIconDelegate;
        ImageButton closeButtonView = (ImageButton) findViewById(R$id.iconSelectionExtended_closeButton);
        View viewFindViewById = findViewById(R$id.iconSelectionExtended_closeButtonBackgroundSolid);
        this.f209954h = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iconSelectionExtended_closeButtonBackgroundGradient);
        this.i = viewFindViewById2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.iconSelectionExtended_iconsScroller);
        this.f209955j = recyclerView;
        z4l.j jVar = new z4l.j(7, zhm.u.c(selectableIconDelegate), false);
        this.k = jVar;
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        int iS = kli.a.s(R$attr.uikit_windowBackground, context);
        viewFindViewById.setBackground(new ColorDrawable(iS));
        viewFindViewById2.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{iS, 0}));
        int iK = kli.a.k(context, 4.0f);
        Intrinsics.checkNotNullExpressionValue(closeButtonView, "closeButtonView");
        or0.u.l(closeButtonView, iK, iK, iK, iK);
        closeButtonView.setImageResource(R$drawable.uikit_icn_24_revert_left);
        closeButtonView.setImageTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorForeground, context)));
        closeButtonView.setOnClickListener(new ip0.g0(this, 26));
        selectableIconDelegate.d.subscribe(new s2(new mt9.c(context, this, 11), 12));
        Intrinsics.checkNotNullExpressionValue(closeButtonView, "closeButtonView");
        pd.b.h(closeButtonView, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q4(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

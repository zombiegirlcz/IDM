package jpi;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.CollapsibleButtonBehavior;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerCoordinatorLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.common.ui.R$styleable;
import com.revolut.uicomponent.R$dimen;
import com.revolut.uicomponent.R$style;
import com.revolut.uicomponent.toolbar.app_bar.RevolutAppBarLayout;
import hpi.c;
import hpi.g;
import kotlin.jvm.internal.Intrinsics;
import wpi.d;
import xpi.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hpi.a f177290b;

    public a() {
        this((Object) null);
    }

    public final LargeActionButton a() {
        hpi.a aVar = this.f177290b;
        if (aVar == null) {
            Intrinsics.r("layoutBuilder");
            throw null;
        }
        LargeActionButton largeActionButton = aVar.f;
        if (largeActionButton != null) {
            return largeActionButton;
        }
        throw new IllegalStateException("bottomButton hasn't been setup");
    }

    public final NavBarWithToolbar b() {
        hpi.a aVar = this.f177290b;
        if (aVar == null) {
            Intrinsics.r("layoutBuilder");
            throw null;
        }
        NavBarWithToolbar navBarWithToolbar = aVar.d;
        if (navBarWithToolbar != null) {
            return navBarWithToolbar;
        }
        throw new IllegalStateException("NavBar with toolbar hasn't been setup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(ContextWrapper context, c configuration) {
        int id10;
        Activity activity;
        ViewGroup viewGroup;
        int i;
        ViewGroup viewGroup2;
        View viewL;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f177290b = new hpi.a(context, configuration, this.f177289a);
        Activity activityM = kli.a.m(context);
        if (activityM == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        hpi.a aVar = this.f177290b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (aVar == null) {
            Intrinsics.r("layoutBuilder");
            throw null;
        }
        Context context2 = aVar.f154544a;
        c cVar = aVar.f154545b;
        cVar.getClass();
        if (cVar.f154550c == null && cVar.f == null && cVar.f154552h == null && cVar.f154551g == null && cVar.k == null && cVar.i == null && cVar.f154553j == null) {
            viewL = aVar.L();
            RecyclerView recyclerView = viewL instanceof RecyclerView ? (RecyclerView) viewL : null;
            if (recyclerView != null) {
                aVar.e = recyclerView;
            }
            activity = activityM;
        } else {
            int i2 = 0;
            ViewGroup legacyContentContainerCoordinatorLayout = new LegacyContentContainerCoordinatorLayout(context2, objArr5 == true ? 1 : 0, 6, i2);
            legacyContentContainerCoordinatorLayout.setId(R$id.root_container);
            aVar.M(R$attr.uikit_windowBackground, legacyContentContainerCoordinatorLayout);
            ViewGroup viewGroupL = aVar.L();
            ViewGroup.LayoutParams layoutParams = viewGroupL.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(new NavBarScrollingViewBehavior());
            RecyclerView recyclerView2 = viewGroupL instanceof RecyclerView ? (RecyclerView) viewGroupL : null;
            if (recyclerView2 != null) {
                aVar.e = recyclerView2;
            }
            legacyContentContainerCoordinatorLayout.addView(viewGroupL);
            f fVar = cVar.f;
            d dVar = cVar.f154551g;
            vpi.d dVar2 = cVar.f154552h;
            int i3 = 2;
            if (fVar != null) {
                NavBarWithToolbar navBarWithToolbar = new NavBarWithToolbar(context2, null);
                navBarWithToolbar.setId(fVar.f307977a);
                navBarWithToolbar.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
                navBarWithToolbar.setAlwaysExpanded(fVar.f307978b);
                aVar.d = navBarWithToolbar;
                legacyContentContainerCoordinatorLayout.addView(navBarWithToolbar);
            } else if (dVar != null) {
                View navBarWithBigTile = new NavBarWithBigTile(context2, null);
                navBarWithBigTile.setId(dVar.f299343a);
                navBarWithBigTile.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
                legacyContentContainerCoordinatorLayout.addView(navBarWithBigTile);
            } else if (dVar2 != null) {
                View navBarWithAvatar = new NavBarWithAvatar(context2, null);
                navBarWithAvatar.setId(dVar2.f291222a);
                navBarWithAvatar.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
                legacyContentContainerCoordinatorLayout.addView(navBarWithAvatar);
            } else {
                View revolutAppBarLayout = new RevolutAppBarLayout(context2, objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
                revolutAppBarLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
                Context context3 = revolutAppBarLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                revolutAppBarLayout.setBackgroundResource(kli.a.x(R$attr.uikit_colorBackground, context3));
                legacyContentContainerCoordinatorLayout.addView(revolutAppBarLayout);
            }
            if (cVar.i == null && cVar.f154553j == null && cVar.f154550c == null && cVar.k == null) {
                activity = activityM;
                viewGroup2 = legacyContentContainerCoordinatorLayout;
            } else {
                ConstraintLayout constraintLayout = new ConstraintLayout(context2);
                constraintLayout.setId(R$id.bottom_layout);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(4);
                constraintLayout.setLayoutTransition(layoutTransition);
                CoordinatorLayout.LayoutParams layoutParams2 = new CoordinatorLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 80;
                if (cVar.i != null) {
                    layoutParams2.setBehavior(new CollapsibleButtonBehavior(null, null));
                }
                constraintLayout.setLayoutParams(layoutParams2);
                g gVar = cVar.k;
                if (gVar != null) {
                    KeyboardSuggestionsView keyboardSuggestionsView = new KeyboardSuggestionsView(context2, objArr4 == true ? 1 : 0, 6, i2);
                    keyboardSuggestionsView.setId(gVar.f154558a);
                    keyboardSuggestionsView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                    constraintLayout.addView(keyboardSuggestionsView);
                    int id11 = keyboardSuggestionsView.getId();
                    ConstraintSet constraintSet = new ConstraintSet();
                    constraintSet.clone(constraintLayout);
                    constraintSet.connect(id11, 4, 0, 4);
                    constraintSet.applyTo(constraintLayout);
                    id10 = keyboardSuggestionsView.getId();
                } else {
                    id10 = 0;
                }
                Barrier barrier = new Barrier(context2);
                barrier.setId(R$id.footerBarrier);
                barrier.setType(2);
                barrier.setReferencedIds(cVar.k != null ? new int[]{0, id10} : new int[]{0});
                int id12 = barrier.getId();
                constraintLayout.addView(barrier);
                CharSequence charSequence = cVar.f154550c;
                if (charSequence != null) {
                    LargeActionButton.ButtonStyle buttonStyle = cVar.d;
                    LargeActionButton largeActionButton = new LargeActionButton(context2, objArr3 == true ? 1 : 0, 6, i2);
                    largeActionButton.setId(R$id.next_button);
                    TypedArray typedArrayObtainStyledAttributes = largeActionButton.getContext().getTheme().obtainStyledAttributes(R$style.Style_Button_Default, R$styleable.Style_Button_Default);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Style_Button_Default_android_layout_marginLeft, -1);
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Style_Button_Default_android_layout_marginRight, -1);
                    activity = activityM;
                    int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Style_Button_Default_android_layout_marginBottom, -1);
                    viewGroup = legacyContentContainerCoordinatorLayout;
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = dimensionPixelSize;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = dimensionPixelSize2;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = dimensionPixelSize3;
                    largeActionButton.setLayoutParams(layoutParams3);
                    largeActionButton.o(buttonStyle);
                    largeActionButton.setText(charSequence);
                    hpi.a.K(constraintLayout, largeActionButton, id12);
                    aVar.f = largeActionButton;
                    id12 = largeActionButton.getId();
                } else {
                    activity = activityM;
                    viewGroup = legacyContentContainerCoordinatorLayout;
                }
                if (cVar.i != null) {
                    TwinVerticalButton twinVerticalButton = new TwinVerticalButton(aVar.f154544a, null, 0, 14, 0);
                    iqi.g gVar2 = cVar.i;
                    if (gVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    twinVerticalButton.setId(gVar2.f167871a);
                    twinVerticalButton.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                    hpi.a.K(constraintLayout, twinVerticalButton, id12);
                    id12 = twinVerticalButton.getId();
                }
                if (cVar.f154553j != null) {
                    i = 0;
                    TwinHorizontalButton twinHorizontalButton = new TwinHorizontalButton(context2, null, 0, 14);
                    jqi.d dVar3 = cVar.f154553j;
                    if (dVar3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    twinHorizontalButton.setId(dVar3.f177728a);
                    twinHorizontalButton.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                    hpi.a.K(constraintLayout, twinHorizontalButton, id12);
                    id12 = twinHorizontalButton.getId();
                } else {
                    i = 0;
                }
                if (!cVar.e) {
                    aVar.M(R$attr.uikit_windowBackground, constraintLayout);
                }
                if (cVar.f154549b != null) {
                    TypefaceTextView typefaceTextView = new TypefaceTextView(new ContextThemeWrapper(context2, R$style.BottomNoteText), null, R$style.BottomNoteText);
                    typefaceTextView.setId(R$id.note_above_bottom_button);
                    typefaceTextView.setGravity(17);
                    ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (cVar.i == null && cVar.f154553j == null) ? typefaceTextView.getContext().getResources().getDimensionPixelSize(R$dimen.padding16) : i;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = typefaceTextView.getContext().getResources().getDimensionPixelSize(R$dimen.padding16);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = typefaceTextView.getContext().getResources().getDimensionPixelSize(R$dimen.padding32);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = typefaceTextView.getContext().getResources().getDimensionPixelSize(R$dimen.padding32);
                    typefaceTextView.setGravity(17);
                    typefaceTextView.setLayoutParams(layoutParams4);
                    Context context4 = typefaceTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    typefaceTextView.setTypeface(v01.f.b(context4, "R_Regular"));
                    typefaceTextView.setText("");
                    hpi.a.K(constraintLayout, typefaceTextView, id12);
                    typefaceTextView.getId();
                }
                viewGroup2 = viewGroup;
                viewGroup2.addView(constraintLayout);
            }
            viewL = viewGroup2;
        }
        activity.setContentView(viewL, new ViewGroup.LayoutParams(-1, -1));
    }

    public a(int i) {
        this.f177289a = i;
    }

    public /* synthetic */ a(Object obj2) {
        this(R$id.fragment_container);
    }
}

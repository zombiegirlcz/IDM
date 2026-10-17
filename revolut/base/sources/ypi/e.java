package ypi;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import bp0.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core_ui_custom_font.TypefaceButton;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import efm.r;
import ix0.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends fsi.c implements i {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fsi.b f315916t = new fsi.b("NEXT_BUTTON_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f315917h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f01.c f315918j;
    public final ty0.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f315919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f315920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.b f315921n;
    public final ihm.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f315922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f315923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TypefaceTextView f315924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public rr0.f f315925s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h nextButtonConfiguration, Activity activity, f01.c uiKitResources, ty0.c clauseDisplayer) {
        super(f315916t);
        Intrinsics.checkNotNullParameter(nextButtonConfiguration, "nextButtonConfiguration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        this.f315917h = nextButtonConfiguration;
        this.i = activity;
        this.f315918j = uiKitResources;
        this.k = clauseDisplayer;
        this.f315919l = v0.a.d("create(...)");
        this.f315920m = v0.a.d("create(...)");
        this.f315921n = j6.a.h("create(...)");
        this.o = j6.a.h("create(...)");
    }

    @Override // fsi.a
    public final void I() {
        View viewFindViewById;
        h hVar = this.f315917h;
        Integer num = hVar.f315926a;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        Activity activity = this.i;
        this.f315922p = activity.findViewById(iIntValue);
        Integer num2 = hVar.f315927b;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            viewFindViewById = activity.findViewById(iIntValue2);
            if (viewFindViewById == null) {
                throw new IllegalArgumentException(p.a.p("view with id = ", activity.getResources().getResourceName(iIntValue2), " not found"));
            }
        } else {
            viewFindViewById = null;
        }
        this.f315923q = viewFindViewById;
        Integer num3 = hVar.f315928c;
        this.f315924r = num3 != null ? (TypefaceTextView) activity.findViewById(num3.intValue()) : null;
        View view = this.f315922p;
        if (!(view instanceof LargeActionButton) && view != null) {
            view.setOnClickListener(new hqi.c(this, 3));
        }
        View view2 = this.f315922p;
        if (view2 != null) {
            final int i = 0;
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: ypi.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f315915b;

                {
                    this.f315915b = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33) {
                    switch (i) {
                        case 0:
                            int i43 = i6 - i3;
                            e eVar = this.f315915b;
                            eVar.f315921n.onNext(Integer.valueOf(i43));
                            if (eVar.f315917h.f315927b == null) {
                                eVar.o.onNext(Integer.valueOf(i43));
                            }
                            break;
                        default:
                            this.f315915b.o.onNext(Integer.valueOf(i6 - i3));
                            break;
                    }
                }
            });
        }
        View view3 = this.f315923q;
        if (view3 != null) {
            final int i2 = 1;
            view3.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: ypi.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f315915b;

                {
                    this.f315915b = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view32, int i22, int i3, int i5, int i6, int i21, int i222, int i32, int i33) {
                    switch (i2) {
                        case 0:
                            int i43 = i6 - i3;
                            e eVar = this.f315915b;
                            eVar.f315921n.onNext(Integer.valueOf(i43));
                            if (eVar.f315917h.f315927b == null) {
                                eVar.o.onNext(Integer.valueOf(i43));
                            }
                            break;
                        default:
                            this.f315915b.o.onNext(Integer.valueOf(i6 - i3));
                            break;
                    }
                }
            });
        }
    }

    @Override // ypi.i
    public final r a() {
        r rVarHide = this.o.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // ypi.i
    public final void d(boolean z) {
        TypefaceTextView typefaceTextView = this.f315924r;
        if (typefaceTextView != null) {
            typefaceTextView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // ypi.i
    public final r e() {
        return this.f315920m;
    }

    @Override // ypi.i
    public final void f(Clause clause) {
        View view = this.f315922p;
        if (view instanceof LargeActionButton) {
            ((LargeActionButton) view).setText(clause);
            return;
        }
        if (!(view instanceof TypefaceButton)) {
            throw new IllegalArgumentException(j6.a.q("Not supported NextButton type: ", view != null ? view.getClass().getSimpleName() : null));
        }
        ((TypefaceButton) view).setText(clause != null ? this.f315918j.b(clause) : null);
    }

    @Override // ypi.i
    public final void g() {
        View view = this.f315923q;
        if (view != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        }
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        rr0.f fVar = this.f315925s;
        if (fVar != null) {
            fVar.b(false);
        }
        super.onDestroy();
    }

    @Override // ypi.i
    public final r s() {
        ihm.f fVar;
        View view = this.f315922p;
        LargeActionButton largeActionButton = view instanceof LargeActionButton ? (LargeActionButton) view : null;
        return (largeActionButton == null || (fVar = largeActionButton.o) == null) ? this.f315919l : fVar;
    }

    @Override // ypi.i
    public final void setAnalyticsContext(Parcelable parcelable) {
        KeyEvent.Callback callback = this.f315922p;
        if (!(callback instanceof TrackableItem)) {
            throw new IllegalArgumentException(j6.a.q("Not supported NextButton type: ", callback != null ? callback.getClass().getSimpleName() : null));
        }
        ((TrackableItem) callback).setAnalyticsContext(parcelable);
    }

    @Override // ypi.i
    public final void setEnabled(boolean z) {
        View view = this.f315922p;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // ypi.i
    public final void setLoading(boolean z) {
        rr0.f fVarV = this.f315925s;
        if (fVarV == null) {
            View view = this.f315922p;
            if (!(view instanceof LargeActionButton)) {
                throw new IllegalArgumentException(j6.a.q("Not supported NextButton type: ", view != null ? view.getClass().getSimpleName() : null));
            }
            fVarV = ((LargeActionButton) view).A.V();
            this.f315925s = fVarV;
        }
        fVarV.b(z);
    }

    @Override // ypi.i
    public final void setVisible(boolean z) {
        View view = this.f315922p;
        if (view != null) {
            w01.k.e(view, z);
        }
    }

    @Override // ypi.i
    public final void t(k note) {
        Intrinsics.checkNotNullParameter(note, "note");
        TypefaceTextView typefaceTextView = this.f315924r;
        if (typefaceTextView != null) {
            typefaceTextView.setMovementMethod(c0.f169220a);
            ((y) this.k).l(note.a(), typefaceTextView, new yea.l(this.f315920m), ty0.d.f275448a);
        }
    }

    @Override // ypi.i
    public final void v(LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        View view = this.f315922p;
        if (view instanceof LargeActionButton) {
            ((LargeActionButton) view).o(style);
        } else if (view instanceof TypefaceButton) {
            throw new IllegalStateException("Legacy button is not supported");
        }
    }
}

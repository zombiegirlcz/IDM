package et0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$style;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends AppCompatTextView {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq0.t f129114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Clause f129115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f129116c;
    public final eq4.g d;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMessage$ui_kit_components_release$default(t0 t0Var, Clause clause, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        t0Var.setMessage$ui_kit_components_release(clause, function0);
    }

    public final void setHeightListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        jq0.t tVar = this.f129114a;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        tVar.d = listener;
    }

    public final void setMessage$ui_kit_components_release(Clause clause, Function0<Unit> function0) {
        if (Intrinsics.f(clause, this.f129115b)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.f129115b = clause;
        jq0.t tVar = this.f129114a;
        if (clause == null) {
            tVar.a(300L, new a3l.b(4, function0), false);
            return;
        }
        setMovementMethod(ix0.c0.f169220a);
        ty0.c.b(or0.u.k(this).b0(), clause, this, this.d, null, 8);
        tVar.a(300L, function0, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129114a = new jq0.t(this);
        this.f129116c = v0.a.d("create(...)");
        this.d = new eq4.g(this, 19);
        setGravity(1);
        int iK = kli.a.k(context, 8.0f);
        setPadding(0, iK, 0, iK);
        setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        setVisibility(8);
    }

    public /* synthetic */ t0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$style.InternalTextAppearance_Fca_Disclaimer_Emphasised);
    }
}

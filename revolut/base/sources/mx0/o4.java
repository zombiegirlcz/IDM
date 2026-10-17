package mx0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class o4 extends RecyclerView {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f209883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final koi.h f209884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jq0.t f209885c;
    public boolean d;
    public p4 e;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o4(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setContent$default(o4 o4Var, List list, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        o4Var.setContent(list, function0);
    }

    public final void c(List list, Function0 function0) {
        if (Intrinsics.f(list, this.f209883a)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.f209883a = list;
        boolean zIsEmpty = list.isEmpty();
        jq0.t tVar = this.f209885c;
        if (zIsEmpty) {
            tVar.a(400L, new a3l.b(7, function0), false);
            return;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        if (!it8.hasNext()) {
            this.f209884b.c(arrayList);
            tVar.a(400L, function0, true);
        } else {
            if (it8.next() != null) {
                throw new ClassCastException();
            }
            zhm.v.j(list);
            throw null;
        }
    }

    public final void setContent(@NotNull List<Object> suggestions, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        if (this.d) {
            this.e = new p4(suggestions, function0);
        } else {
            c(suggestions, function0);
        }
    }

    public final void setDeferredUpdatesMode$ui_kit_components_release(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        p4 p4Var = this.e;
        if (z || p4Var == null) {
            return;
        }
        this.e = null;
        c(p4Var.f209922a, p4Var.f209923b);
    }

    public final void setHeightListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        jq0.t tVar = this.f209885c;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        tVar.d = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o4(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209883a = zhm.f0.f322471a;
        SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
        koi.c cVar = new koi.c(0);
        cVar.a(smallActionButtonDelegate);
        koi.h hVar = new koi.h(cVar, false, false, 4);
        this.f209884b = hVar;
        this.f209885c = new jq0.t(this);
        setAdapter(hVar);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setItemAnimator(null);
        setVisibility(8);
    }

    public /* synthetic */ o4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

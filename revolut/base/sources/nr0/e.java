package nr0;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import aw0.o9;
import bp0.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo0.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import noi.l;
import or0.u;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f218511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f218512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f218513c;
    public final wy0.a d;
    public final h e;
    public final ex0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f218514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f218515h;
    public h01.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ifm.c f218516j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ifm.c f218517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f218518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ifm.c f218519n;

    public e(View view, c staticLayoutFactory, Function0 invalidationCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(staticLayoutFactory, "staticLayoutFactory");
        Intrinsics.checkNotNullParameter(invalidationCallback, "invalidationCallback");
        this.f218511a = view;
        this.f218512b = staticLayoutFactory;
        this.f218513c = invalidationCallback;
        wy0.a aVarK = u.k(view);
        this.d = aVarK;
        h.Companion.getClass();
        this.e = h.a.a();
        ty0.c cVarB0 = aVarK.b0();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f = ((y) cVarB0).r(context);
        this.f218514g = new LinkedHashMap();
        this.i = aVarK.Z().a();
        view.addOnAttachStateChangeListener(this);
    }

    public final void a() {
        this.f218514g.clear();
    }

    public final Layout b(Clause clause, TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        b bVar = (b) this.f218514g.get(clause);
        d dVarA = bVar != null ? bVar.a(textPaint) : null;
        if (dVarA == null) {
            throw new IllegalArgumentException(new IllegalArgumentException("Cannot find value for clause = " + clause + " and paint=" + textPaint).toString());
        }
        StaticLayout staticLayout = dVarA.f218509b;
        if (staticLayout != null) {
            return staticLayout;
        }
        SpannableStringBuilder text = bVar.f218503a;
        if (text == null) {
            ty0.c cVarB0 = this.d.b0();
            Context context = this.f218511a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            text = ty0.c.a(cVarB0, clause, context, null, this.e.d ? ty0.b.FORCE_LINKS : ty0.b.DEFAULT, null, null, Constants.TAG_PCI_PED_CHECKSUM);
            bVar.f218503a = text;
        }
        c cVar = this.f218512b;
        int i = cVar.f218506b;
        int i2 = cVar.f218505a;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        float desiredWidth = Layout.getDesiredWidth(text, textPaint);
        int iC = rim.d.c(desiredWidth);
        if (iC < desiredWidth) {
            iC++;
        }
        int iMin = i2 > 0 ? i2 : i > 0 ? Math.min(i, iC) : iC;
        StaticLayout staticLayoutA = cVar.a(text, textPaint, iMin);
        if (i2 < 1 && ((1 > i || i >= iC) && cVar.e == null)) {
            int i3 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < text.length(); i6++) {
                if (text.charAt(i6) == '\n') {
                    i5++;
                }
            }
            int i21 = i5 + 1;
            while (staticLayoutA.getLineCount() != i21 && i3 < 4) {
                i3++;
                iMin++;
                staticLayoutA = cVar.a(text, textPaint, iMin);
            }
        }
        dVarA.f218509b = staticLayoutA;
        return staticLayoutA;
    }

    public final Layout c(String text, TextPaint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        return b(new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), paint);
    }

    public final void d() {
        Iterator it8 = this.f218514g.entrySet().iterator();
        while (it8.hasNext()) {
            b bVar = (b) ((Map.Entry) it8.next()).getValue();
            bVar.f218503a = null;
            Iterator it9 = bVar.f218504b.iterator();
            while (it9.hasNext()) {
                ((d) it9.next()).f218509b = null;
            }
        }
        this.f218513c.invoke();
    }

    public final void e(Clause clause, TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (clause == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f218514g;
        b bVar = (b) linkedHashMap.get(clause);
        if (bVar == null) {
            return;
        }
        ArrayList arrayList = bVar.f218504b;
        d holder = bVar.a(paint);
        if (holder == null) {
            return;
        }
        int i = holder.f218510c - 1;
        holder.f218510c = i;
        if (i <= 0) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            arrayList.remove(holder);
        }
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((d) it8.next()).f218510c > 0) {
                    return;
                }
            }
        }
        linkedHashMap.remove(clause);
        wy0.a aVar = this.d;
        if (((y) aVar.b0()).h(clause)) {
            this.f218515h--;
        }
        if (((y) aVar.b0()).i(clause)) {
            this.k--;
        }
        if (((y) aVar.b0()).t(clause)) {
            this.f218518m--;
        }
    }

    public final void f(Clause clause, TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (clause == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f218514g;
        Object bVar = linkedHashMap.get(clause);
        if (bVar == null) {
            bVar = new b(clause);
            linkedHashMap.put(clause, bVar);
            wy0.a aVar = this.d;
            if (((y) aVar.b0()).h(clause)) {
                this.f218515h++;
            }
            if (((y) aVar.b0()).i(clause)) {
                this.k++;
            }
            if (((y) aVar.b0()).t(clause)) {
                this.f218518m++;
            }
        }
        b bVar2 = (b) bVar;
        d holder = bVar2.a(paint);
        if (holder == null) {
            holder = new d(paint);
            Intrinsics.checkNotNullParameter(holder, "holder");
            bVar2.f218504b.add(holder);
        }
        holder.f218510c++;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f218516j = this.d.Z().c().subscribe(new l(6, new a(this, 0)));
        this.f218517l = this.f.f130332b.subscribe(new l(7, new a(this, 1)));
        this.f218519n = this.e.f176841b.subscribe(new l(8, new a(this, 2)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ifm.c cVar = this.f218516j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f218516j = null;
        ifm.c cVar2 = this.f218517l;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.f218517l = null;
        ifm.c cVar3 = this.f218519n;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.f218519n = null;
    }

    public /* synthetic */ e(View view, Function0 function0) {
        this(view, new c(), function0);
    }
}

package tyl;

import a08.f0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nmb.v;
import org.jetbrains.annotations.NotNull;
import py0.f;
import syl.g;
import syl.h;
import syl.l;
import te0.w;
import tnb.g0;
import twl.o;
import tx0.p4;
import z4l.j;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements g, l {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f275721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f275722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f275723c;
    public final Function2 d;
    public final CharSequence e;
    public final CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f275724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ni1.a f275725h;
    public final q31.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q31.d f275726j;
    public final q31.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AlertDialog f275727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ifm.b f275728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f0 f275729n;
    public final RateDelegate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f275730p;

    public d(Context context, List items, js7.c cVar, v vVar, CharSequence charSequence, CharSequence charSequence2, boolean z, ni1.a aVar, int i) {
        Function1 itemClickListener = cVar;
        itemClickListener = (i & 4) != 0 ? new tyg.g(1) : itemClickListener;
        Function2 rateItemClickListener = vVar;
        rateItemClickListener = (i & 8) != 0 ? new tw8.g(12) : rateItemClickListener;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        Intrinsics.checkNotNullParameter(rateItemClickListener, "rateItemClickListener");
        this.f275721a = context;
        this.f275722b = items;
        this.f275723c = itemClickListener;
        this.d = rateItemClickListener;
        this.e = charSequence;
        this.f = charSequence2;
        this.f275724g = z;
        this.f275725h = aVar;
        this.i = q31.d.p(wyl.b.f301309a, new q31.b());
        this.f275726j = q31.d.p(wyl.b.f301310b, new q31.b());
        this.k = q31.d.p(wyl.b.d, new q31.b());
        ifm.b bVar = new ifm.b();
        this.f275728m = bVar;
        RateDelegate rateDelegate = new RateDelegate();
        r rVarHide = rateDelegate.f53140c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        p4 p4Var = new p4(this, 8);
        r rVarOnErrorResumeNext = rVarHide.onErrorResumeNext(new g0(new t33.r(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o(1, p4Var), new o(1, c.f275720a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(bVar, cVarSubscribe);
        this.o = rateDelegate;
        this.f275730p = w.y0(new a(this, 0));
    }

    @Override // syl.g
    public final void a(h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        AlertDialog alertDialog = this.f275727l;
        if (alertDialog == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        alertDialog.dismiss();
        f0 f0Var = this.f275729n;
        if (f0Var != null) {
            f0Var.a(model);
        }
    }

    @Override // syl.g
    public final void b(h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        AlertDialog alertDialog = this.f275727l;
        if (alertDialog == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        alertDialog.dismiss();
        f0 f0Var = this.f275729n;
        if (f0Var != null) {
            f0Var.b(model);
        }
    }

    public final void c() {
        f fVarN0 = jh.d.f(this.f275721a).n0();
        AlertDialog alertDialog = this.f275727l;
        if (alertDialog == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        fVarN0.c(alertDialog);
        AlertDialog alertDialog2 = this.f275727l;
        if (alertDialog2 != null) {
            alertDialog2.hide();
        } else {
            Intrinsics.r("dialog");
            throw null;
        }
    }

    public final void d(f0 f0Var) {
        this.f275729n = f0Var;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    public final d e() {
        Context context = this.f275721a;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        boolean z = true;
        if (activity != null && activity.isFinishing()) {
            return null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_recycler, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(R$id.recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView parent = (RecyclerView) viewFindViewById;
        parent.setHasFixedSize(true);
        parent.setLayoutManager(new LinearLayoutManager(parent.getContext()));
        parent.addItemDecoration(new o31.b());
        CharSequence charSequence = this.f;
        CharSequence text = this.e;
        if (text != null) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i = (charSequence == null || charSequence.length() == 0) ? 16 : 8;
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(text, "text");
            wyl.a aVar = new wyl.a();
            View viewInflate2 = LayoutInflater.from(context2).inflate(R$layout.decoration_dialog_title, (ViewGroup) parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            aVar.f301307a = viewInflate2;
            int iK = kli.a.k(context2, 24.0f);
            viewInflate2.setPadding(iK, iK, iK, kli.a.k(context2, i));
            ((TextView) viewInflate2.findViewById(R$id.title)).setText(text);
            parent.addItemDecoration(aVar);
        }
        parent.setOverScrollMode(2);
        ?? r87 = this.f275730p;
        parent.setAdapter((j) r87.getValue());
        j jVar = (j) r87.getValue();
        if (charSequence == null) {
            charSequence = "";
        }
        if (text != null && text.length() != 0) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        List list = this.f275722b;
        q31.d dVar = this.i;
        if (length > 0) {
            arrayList.add(new syl.d(charSequence, !z ? dVar : this.k, !list.isEmpty() ? this.f275726j : dVar));
        }
        Object objO0 = d0.o0(list);
        o31.c cVar = objO0 instanceof o31.c ? (o31.c) objO0 : null;
        if (cVar != null) {
            cVar.u(dVar);
        }
        Object objD0 = d0.d0(list);
        o31.c cVar2 = objD0 instanceof o31.c ? (o31.c) objD0 : null;
        if (cVar2 != null && cVar2.getF52307j() == null && z && charSequence.length() == 0) {
            cVar2.s(dVar);
        }
        arrayList.addAll(list);
        jVar.c(arrayList);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(viewInflate).setCancelable(this.f275724g).setOnDismissListener(new bqi.a(this, 2)).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        this.f275727l = alertDialogCreate;
        if (alertDialogCreate == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        AlertDialog alertDialog = this.f275727l;
        if (alertDialog == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        alertDialog.show();
        this.f275727l = alertDialog;
        jh.d.f(context).n0().g(alertDialog, null, "dialog", null, null);
        return this;
    }
}

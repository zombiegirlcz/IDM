package ryc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.Spannable;
import android.widget.TextView;
import ce9.m;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import cpi.g;
import e7l.g;
import efm.r;
import fgm.p;
import igm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import ix0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import pfm.h;
import s9b.n;
import tf1.i0;
import tf1.l0;
import ufm.i;
import v30.c0;
import vkm.q;
import wf6.w;
import wim.z;
import xo8.u;
import yb.a0;
import yb.s;
import z1i.l;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.v;
import zhm.z0;
import zjh.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements o, p, yil.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f258289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f258290b;

    public /* synthetic */ a(Object obj2, Object obj3) {
        this.f258289a = obj2;
        this.f258290b = obj3;
    }

    public static boolean d(PackageManager packageManager, ui0.b app) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(app, "app");
        return packageManager.getLaunchIntentForPackage(app.f280278a) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206 A[EDGE_INSN: B:76:0x0206->B:78:0x020b BREAK  A[LOOP:1: B:62:0x00e6->B:100:?]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List g(ryc.a r36, uqh.z r37, boolean r38, boolean r39, final boolean r40, int r41) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ryc.a.g(ryc.a, uqh.z, boolean, boolean, boolean, int):java.util.List");
    }

    public h a(PaymentGroup group, oq9.o owner, Map billsSplits) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(billsSplits, "billsSplits");
        ufm.c cVar = new ufm.c(new w(billsSplits, this, owner), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        h hVar = new h(new i(cVar, new u(28, new xpe.c(this, group, 10)), 0), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        return ((igm.c) this.f258289a).apply(this.f258290b, obj2);
    }

    public yb.p b() {
        return new yb.p((s) this.f258289a, (a0) this.f258290b);
    }

    public Map c(c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Object obj2 = ((d4m.a) this.f258290b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        Map map = (Map) ((ue0.c) obj2).T2("intro_" + feedType, z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
        return map == null ? r0.g() : map;
    }

    public boolean e() {
        rh0.b bVar = (rh0.b) this.f258290b;
        return cp5.c.j(bVar) && bVar.a().isGooglePlayServicesAvailable(bVar.f254292a) == 0;
    }

    public Unit f(Activity activity, ui0.b bVar) {
        PackageManager packageManager = activity.getPackageManager();
        String str = bVar.f280278a;
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            activity.startActivityForResult(launchIntentForPackage, 0);
            return Unit.f186387a;
        }
        String packageName = activity.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d?id=" + str));
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", packageName);
        if (intent.resolveActivity(packageManager) != null) {
            activity.startActivityForResult(intent, 0);
            return Unit.f186387a;
        }
        activity.startActivityForResult(((g) this.f258289a).u(bVar), 0);
        return Unit.f186387a;
    }

    @Override // yil.a
    public String generate() {
        String str = (String) this.f258290b;
        this.f258290b = null;
        return str == null ? ((yil.a) this.f258289a).generate() : str;
    }

    public r h(final a0h.b params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        tzg.i iVar = (tzg.i) this.f258289a;
        List assetTypesParameters = params.f385b;
        x8h.c0 c0Var = (x8h.c0) iVar;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        j jVar = c0Var.f303330a;
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        r rVarW = nim.a.w(u1.d(((w4l.f) jVar.f322839a).f(assetTypesParameters, z), nim.a.w(((ik3.c) c0Var.f303331b).k(g.b.f123407a), new x8h.h(3))), new x8h.d(c0Var, 9));
        final int i = 0;
        r rVarW2 = nim.a.w(rVarW, new Function1(this) { // from class: x8h.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ryc.a f303343b;

            {
                this.f303343b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                vel.h hVar;
                switch (i) {
                    case 0:
                        xzg.s content = (xzg.s) obj2;
                        Intrinsics.checkNotNullParameter(content, "content");
                        a0h.a section = params.f384a;
                        this.f303343b.getClass();
                        Intrinsics.checkNotNullParameter(content, "<this>");
                        Intrinsics.checkNotNullParameter(section, "section");
                        int i2 = h0.f303346a[section.ordinal()];
                        if (i2 == 1) {
                            return content.f310028b;
                        }
                        if (i2 == 2) {
                            return content.d;
                        }
                        if (i2 == 3) {
                            return content.f310027a;
                        }
                        if (i2 == 4) {
                            return content.f310029c;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        List mostOwnedAssets = (List) obj2;
                        Intrinsics.checkNotNullParameter(mostOwnedAssets, "mostOwnedAssets");
                        e9h.d dVar = (e9h.d) this.f303343b.f258290b;
                        List list = mostOwnedAssets;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (true) {
                            Set setI = null;
                            if (!it8.hasNext()) {
                                h0h.a aVar = h0h.a.ONE_DAY;
                                Iterator it9 = params.f385b.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (next instanceof xzg.b) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                xzg.b bVar = (xzg.b) next;
                                if (bVar != null) {
                                    List list2 = bVar.f309972a;
                                    setI = z0.i(list2.contains(xzg.a.CFD) ? nel.z.CFD : null, list2.contains(xzg.a.BOND) ? nel.z.BOND : null, nel.z.ADR, nel.z.ETF, nel.z.ETN, nel.z.ETC, nel.z.EQUITY, nel.z.WARRANT, nel.z.SPAC, nel.z.UNSPECIFIED);
                                }
                                return h0h.b.a(dVar, arrayList, aVar, setI, false, 8);
                            }
                            xzg.r rVar = (xzg.r) it8.next();
                            String str = rVar.f310023b;
                            int i3 = h0.f303347b[rVar.f310024c.ordinal()];
                            if (i3 == 1) {
                                hVar = vel.h.STOCK;
                            } else {
                                if (i3 != 2 && i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hVar = vel.h.CURRENCY;
                            }
                            arrayList.add(new vel.g(str, hVar, (dj0.d) null, 12));
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        return pd.b.r(rVarW2, new Function1(this) { // from class: x8h.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ryc.a f303343b;

            {
                this.f303343b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                vel.h hVar;
                switch (i2) {
                    case 0:
                        xzg.s content = (xzg.s) obj2;
                        Intrinsics.checkNotNullParameter(content, "content");
                        a0h.a section = params.f384a;
                        this.f303343b.getClass();
                        Intrinsics.checkNotNullParameter(content, "<this>");
                        Intrinsics.checkNotNullParameter(section, "section");
                        int i22 = h0.f303346a[section.ordinal()];
                        if (i22 == 1) {
                            return content.f310028b;
                        }
                        if (i22 == 2) {
                            return content.d;
                        }
                        if (i22 == 3) {
                            return content.f310027a;
                        }
                        if (i22 == 4) {
                            return content.f310029c;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        List mostOwnedAssets = (List) obj2;
                        Intrinsics.checkNotNullParameter(mostOwnedAssets, "mostOwnedAssets");
                        e9h.d dVar = (e9h.d) this.f303343b.f258290b;
                        List list = mostOwnedAssets;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (true) {
                            Set setI = null;
                            if (!it8.hasNext()) {
                                h0h.a aVar = h0h.a.ONE_DAY;
                                Iterator it9 = params.f385b.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (next instanceof xzg.b) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                xzg.b bVar = (xzg.b) next;
                                if (bVar != null) {
                                    List list2 = bVar.f309972a;
                                    setI = z0.i(list2.contains(xzg.a.CFD) ? nel.z.CFD : null, list2.contains(xzg.a.BOND) ? nel.z.BOND : null, nel.z.ADR, nel.z.ETF, nel.z.ETN, nel.z.ETC, nel.z.EQUITY, nel.z.WARRANT, nel.z.SPAC, nel.z.UNSPECIFIED);
                                }
                                return h0h.b.a(dVar, arrayList, aVar, setI, false, 8);
                            }
                            xzg.r rVar = (xzg.r) it8.next();
                            String str = rVar.f310023b;
                            int i3 = h0.f303347b[rVar.f310024c.ordinal()];
                            if (i3 == 1) {
                                hVar = vel.h.STOCK;
                            } else {
                                if (i3 != 2 && i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hVar = vel.h.CURRENCY;
                            }
                            arrayList.add(new vel.g(str, hVar, (dj0.d) null, 12));
                        }
                        break;
                }
            }
        });
    }

    public Flow i() {
        y2b.e eVar = (y2b.e) this.f258290b;
        String strA = eVar.a();
        if (strA == null) {
            return q.q(nim.a.v(kge.d.w((kge.d) this.f258289a, eVar.b(), eVar.g()), new l(16)));
        }
        od0.i.Companion.getClass();
        return new go.g(zi0.c.P(od0.h.a(strA), false, null, 3), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Flow j() {
        Object[] objArr;
        l0 l0Var = (l0) this.f258289a;
        List productIds = (List) this.f258290b;
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = productIds.iterator();
        while (true) {
            i0 i0Var = null;
            objArr = 0;
            if (!it8.hasNext()) {
                break;
            }
            qf1.l lVar = (qf1.l) it8.next();
            mf1.b bVar = (mf1.b) l0Var.f270179b.get(lVar);
            if (bVar != null) {
                i0Var = new i0(bVar.b(), lVar, 1);
            } else {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "WidgetFlowHelper", "No enable state provider for " + lVar, null, h0Var);
            }
            if (i0Var != null) {
                arrayList.add(i0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return new go.g(tf1.o0.f270192a, 2);
        }
        return q.Q(new j23.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 24), new n((Continuation) (objArr == true ? 1 : 0), (Object) this, 25));
    }

    public void k(Clause clause) {
        TextView textView = (TextView) this.f258289a;
        if (clause == null) {
            textView.setVisibility(8);
            return;
        }
        ty0.c.b(or0.u.k(textView).b0(), clause, (TextView) this.f258289a, new su0.c(1, (ihm.f) this.f258290b, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 24), null, 8);
        textView.setVisibility(0);
        textView.setMovementMethod(ix0.c0.f169220a);
        textView.setTag(R$id.navBarWithToolbar_headerDisclaimerSticky, clause);
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), b0.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj2 : spans) {
                ((b0) obj2).k = textView.getCurrentTextColor();
            }
        }
        if (textView.getBackground() == null) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setBackground(hx7.q.a(context));
        }
    }

    public void l(s sVar) {
        this.f258289a = sVar;
    }

    public void m(a0 a0Var) {
        this.f258290b = a0Var;
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        ((p) this.f258289a).onError(th10);
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        ((p) this.f258289a).onSubscribe(disposable);
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        p pVar = (p) this.f258289a;
        try {
            ((pl.p) ((tgm.d) this.f258290b).f271208c).accept(obj2);
            pVar.onSuccess(obj2);
        } catch (Throwable th10) {
            m.F(th10);
            pVar.onError(th10);
        }
    }

    public a(String codeChallenge, yil.a wrappedCodeGenerator) {
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(wrappedCodeGenerator, "wrappedCodeGenerator");
        this.f258289a = wrappedCodeGenerator;
        this.f258290b = codeChallenge;
    }

    public a(l0 widgetFlowHelper) {
        Intrinsics.checkNotNullParameter(widgetFlowHelper, "widgetFlowHelper");
        this.f258289a = widgetFlowHelper;
        this.f258290b = v.k(qf1.l.SAVINGS, qf1.l.POCKET);
    }

    public a(cpi.g storeIntentProvider, rh0.b mobileServicesAvailabilityManager) {
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        Intrinsics.checkNotNullParameter(mobileServicesAvailabilityManager, "mobileServicesAvailabilityManager");
        this.f258289a = storeIntentProvider;
        this.f258290b = mobileServicesAvailabilityManager;
    }

    public a(mq9.f paymentsGroupsInteractor, ang.f userInteractor, sr9.a requestMapper) {
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(requestMapper, "requestMapper");
        this.f258289a = paymentsGroupsInteractor;
        this.f258290b = userInteractor;
    }

    public a(tzg.i mostOwnedAssetsInteractor, e9h.d performanceAssetsTransformer) {
        Intrinsics.checkNotNullParameter(mostOwnedAssetsInteractor, "mostOwnedAssetsInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        this.f258289a = mostOwnedAssetsInteractor;
        this.f258290b = performanceAssetsTransformer;
    }

    public a(TextView headerDisclaimerSticky) {
        Intrinsics.checkNotNullParameter(headerDisclaimerSticky, "headerDisclaimerSticky");
        this.f258289a = headerDisclaimerSticky;
        this.f258290b = v0.a.d("create(...)");
    }

    public a(uqh.c0 screenerResultMapper, uqh.d0 searchResultMapper) {
        Intrinsics.checkNotNullParameter(screenerResultMapper, "screenerResultMapper");
        Intrinsics.checkNotNullParameter(searchResultMapper, "searchResultMapper");
        this.f258289a = screenerResultMapper;
        this.f258290b = searchResultMapper;
    }
}

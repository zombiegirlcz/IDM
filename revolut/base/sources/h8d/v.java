package h8d;

import android.net.Uri;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.faq.domain.model.FaqSearchSuggestedCompletion;
import com.revolut.core.model.faq.FaqAction;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.common.ExternalDestination;
import h8d.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import wf0.a0;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends jki.g implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f150011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f150012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f150013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lde.n f150014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f150015t;
    public final m u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(jki.p stateMapper, a0 faqSearchInteractor, f80.a uriHelper, n60.a keyboardExtension, lde.n sharedHelpWidgetsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(faqSearchInteractor, "faqSearchInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f150011p = faqSearchInteractor;
        this.f150012q = uriHelper;
        this.f150013r = keyboardExtension;
        this.f150014s = sharedHelpWidgetsInteractor;
        this.f150015t = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        m.Companion.getClass();
        this.u = m.e;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        t tVar = new t(0, this, continuation);
        z1 z1Var = this.f150015t;
        yji.l.a1(this, z1Var, null, null, tVar, 3);
        yji.l.a1(this, new amh.w(vkm.q.Q(t1.d(vkm.q.q(z1Var), 250L), new s(0, this, continuation)), 12), null, null, new t(1, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(t1.d(vkm.q.q(z1Var), 250L), new s(1, this, continuation)), null, null, new t(2, this, continuation), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2(Object obj2, String listId) {
        Object objA;
        Intrinsics.checkNotNullParameter(listId, "listId");
        x xVar = obj2 instanceof x ? (x) obj2 : null;
        if (xVar == null) {
            return;
        }
        Object obj3 = xVar.f150017a;
        this.f150013r.R();
        if (!(obj3 instanceof FaqAction)) {
            if (obj3 instanceof FaqMetaData) {
                F1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((FaqMetaData) obj3).f51419a, 6), (SharedFaqDestination.PassthroughData) null, false, 14));
                return;
            }
            boolean z = obj3 instanceof FaqSearchSuggestedCompletion;
            z1 z1Var = this.f150015t;
            if (!z) {
                if (obj3 instanceof w.b) {
                    z1Var.k(o.a(((m) t2()).f149996a, ((m) t2()).f149996a.f150001c + 1, 11));
                    return;
                }
                return;
            } else {
                String str = ((FaqSearchSuggestedCompletion) obj3).f51381a;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                String strD = kotlin.text.a0.D(str, "{", "", false);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                z1Var.k(new o(d0.F0(kotlin.text.a0.D(strD, "}", "", false)).toString(), 0, true, true));
                return;
            }
        }
        f80.a aVar = this.f150012q;
        String str2 = ((FaqAction) obj3).f51418c;
        if (str2 == null) {
            return;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = ((f80.b) aVar).f(str2);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        Uri uri2 = (Uri) objA;
        if (uri2 == null) {
            return;
        }
        String queryParameter = uri2.getQueryParameter("key");
        if (queryParameter != null && !d0.W(queryParameter)) {
            F1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(queryParameter, 6), (SharedFaqDestination.PassthroughData) null, false, 14));
        } else {
            if (C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) aVar).f(str2), 0, null, 494)) instanceof aii.w) {
                return;
            }
            C1(new ExternalDestination.Browser(str2, null));
        }
    }
}

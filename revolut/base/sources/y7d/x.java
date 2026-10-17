package y7d;

import b6i.d0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.faq.domain.model.ai.SearchResult;
import com.revolut.core.faq.domain.model.ai.Summarisation;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import tjf.k0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends jki.g implements n {

    @NotNull
    public static final u Companion = new u();
    public long A;
    public boolean B;
    public final l C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final toh.d f311494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wli.x f311495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k18.c f311496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ep6.n f311497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f311498t;
    public final lde.n u;
    public final l80.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x8d.a f311499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f311500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tim.d f311501y;
    public a2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jki.p stateMapper, toh.d aiSearchInteractor, wli.x deeplinkHandler, k18.c faqProvider, ep6.n feedbackExtension, n60.a keyboardControllerExtension, lde.n sharedHelpWidgetsInteractor, l80.h timeProvider, x8d.a topLevelFaqExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(aiSearchInteractor, "aiSearchInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(topLevelFaqExtension, "topLevelFaqExtension");
        this.f311494p = aiSearchInteractor;
        this.f311495q = deeplinkHandler;
        this.f311496r = faqProvider;
        this.f311497s = feedbackExtension;
        this.f311498t = keyboardControllerExtension;
        this.u = sharedHelpWidgetsInteractor;
        this.v = timeProvider;
        this.f311499w = topLevelFaqExtension;
        this.f311500x = vkm.q.c("");
        this.f311501y = new tim.d((int) 1, (int) 0);
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Data data = new Data(null, null, false, 7, null);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.C = new l("", data, k.ENTRY, null, new Data(null, null, true, 3, null), "", false, false, new Data(null, null, true, 3, null), this.A);
    }

    public static String y2(l lVar) {
        Summarisation summarisation;
        String strO;
        SearchResult searchResult = lVar.d;
        if (searchResult != null && (summarisation = searchResult.d) != null && (strO = com.google.android.gms.internal.mlkit_vision_face.a.o(summarisation.f51385a, "\n\n", summarisation.f51386b)) != null) {
            return strO;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public final void A2() {
        String str = ((l) t2()).f311472a;
        if (str.length() == 0) {
            return;
        }
        x2(new y66.p(12));
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.z = null;
        long j2 = this.A + 1;
        this.A = j2;
        x2(new nxc.a(j2, 24));
        l2(new d0(this, str, continuation, 12), new yi5.b(26));
        this.f311498t.Q();
    }

    public final void B2(CharSequence query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String string = query.toString();
        if (Intrinsics.f(((l) t2()).f311472a, string)) {
            return;
        }
        this.B = false;
        this.f311500x.setValue(string);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        v vVar = new v(this, continuation, 4);
        j2 j2Var = this.f311500x;
        yji.l.a1(this, j2Var, null, null, vVar, 3);
        yji.l.a1(this, new k0(vkm.q.Q(t1.d(j2Var, 250L), new y4f.o(continuation, this, 7)), 5), null, null, new v(this, continuation, 1), 3);
        yji.l.a1(this, this.f311496r.w(false), null, null, new v(this, continuation, 2), 3);
        yji.l.a1(this, this.f311497s.F1(), null, null, new v(this, continuation, 3), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.C;
    }

    public final void z2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        boolean z = obj2 instanceof FaqNodeBase;
        x8d.a aVar = this.f311499w;
        if (z) {
            aVar.e3((FaqNodeBase) obj2, null);
        } else if (obj2 instanceof FaqMetaData) {
            aVar.f3(((FaqMetaData) obj2).f51419a);
        }
    }
}

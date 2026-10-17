package klf;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kkf.b4;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import tof.q6;
import tof.r9;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TransactionContext f185488t = new TransactionContext(new Priority.HIGH("Transaction details screen"), null, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.i f185490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f185491c;
    public final k61.a d;
    public final ylg.b e;
    public final osg.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final snf.l0 f185492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pa7.a f185493h;
    public final znf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f185494j;
    public final AtomicReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile String f185495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f185496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f185497n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f185498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f185499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f185500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f185501s;

    public h0(CoroutineScope coroutineScope, k71.i transactionDescriptor, com.revolut.domain.interactors.transactions.a transactionsInteractor, k61.a transferInteractor, ylg.b userInteractor, osg.b walletInteractor, snf.l0 accountDetector, pa7.a hiddenAccountsInteractor, znf.c refundsInfoProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountDetector, "accountDetector");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(refundsInfoProvider, "refundsInfoProvider");
        this.f185489a = coroutineScope;
        this.f185490b = transactionDescriptor;
        this.f185491c = transactionsInteractor;
        this.d = transferInteractor;
        this.e = userInteractor;
        this.f = walletInteractor;
        this.f185492g = accountDetector;
        this.f185493h = hiddenAccountsInteractor;
        this.i = refundsInfoProvider;
        this.f185494j = transactionDescriptor.a();
        this.k = new AtomicReference(qk.d.j(transactionDescriptor));
        final int i = 0;
        this.f185496m = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i2 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i2, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i2)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
        final int i2 = 1;
        this.f185497n = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i22 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i22, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i22)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
        final int i3 = 2;
        this.o = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i22 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i22, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i22)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
        final int i5 = 3;
        this.f185498p = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i22 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i22, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i22)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
        final int i6 = 4;
        this.f185499q = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i22 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i22, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i22)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
        final int i21 = 5;
        this.f185500r = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i22 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i22, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i22)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
        final int i22 = 6;
        this.f185501s = yhm.j.b(new Function0(this) { // from class: klf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f185559b;

            {
                this.f185559b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        h0 h0Var = this.f185559b;
                        return edl.a.r(vkm.q.q(new vkm.y(new kb7.c(h0Var, null, 19), new vkm.t0(new w(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(h0Var.f185491c, new r9(h0Var.f185494j), null, null, TransactionsSort.STARTED_DATE_DESC, h0.f185488t, 6)), zhm.h0.f322473a), h0Var, 1), 1))), h0Var.f185489a);
                    case 1:
                        h0 h0Var2 = this.f185559b;
                        com.revolut.domain.interactors.transactions.a aVar = h0Var2.f185491c;
                        String groupId = h0Var2.f185494j;
                        q6 q6VarK = qk.d.k(h0Var2.f185490b);
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        xif.o oVar = (xif.o) ((mjf.b0) aVar).f205984c;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 24, null), new w(rd0.e.n(new vkm.v1(new s56.d0(28, groupId, q6VarK, oVar, loadingStrategy, (Continuation) null)), zhm.h0.f322473a), h0Var2, 0))), h0Var2.f185489a);
                    case 2:
                        h0 h0Var3 = this.f185559b;
                        return edl.a.r(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((wsg.n) h0Var3.f).R()), zhm.h0.f322473a), 23)), h0Var3.f185489a);
                    case 3:
                        h0 h0Var4 = this.f185559b;
                        jhi.b bVarG = mo3.a.g(rd0.e.b(((ang.f) h0Var4.e).k(false)), null, new b4(7), 1);
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(bVarG, oji.e.f225788b), h0Var4.f185489a);
                    case 4:
                        h0 h0Var5 = this.f185559b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 26, continuation), vkm.q.Q(h0Var5.d(), new a0(continuation, h0Var5, 1))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), h0Var5.f185489a);
                    case 5:
                        kkk.u uVar = new kkk.u(5);
                        h0 h0Var6 = this.f185559b;
                        int i222 = 2;
                        Continuation continuation2 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(i222, 27, continuation2), vkm.q.Q(h0Var6.h(uVar), new a0(continuation2, h0Var6, i222)))), h0Var6.f185489a);
                    default:
                        h0 h0Var7 = this.f185559b;
                        Continuation continuation3 = null;
                        return edl.a.r(vkm.q.q(new vkm.y(new g2d.c(2, 25, continuation3), vkm.q.Q(h0Var7.d(), new a0(continuation3, h0Var7, 0)))), h0Var7.f185489a);
                }
            }
        });
    }

    public static final Object a(h0 h0Var, final List list, final Function1 function1) {
        String str = h0Var.f185494j;
        Object obj2 = null;
        if (list.isEmpty()) {
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TransactionDetailsCommonDataSource", j6.a.q("Can't select transaction leg: got empty list; groupId: ", str), null, h0Var2);
            return null;
        }
        String str2 = (String) h0Var.k.updateAndGet(new UnaryOperator() { // from class: klf.r
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                String str3 = (String) obj3;
                if (str3 != null) {
                    return str3;
                }
                List list2 = list;
                Function1 function12 = function1;
                return (String) function12.invoke(zhm.d0.b0(zhm.d0.P0(list2, new k2j.d(function12, 2))));
            }
        });
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(function1.invoke(next), str2)) {
                obj2 = next;
                break;
            }
        }
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList.add((String) function1.invoke(it9.next()));
        }
        StringBuilder sbM = v0.a.m("Can't find requested transaction leg, probably wrong [groupId, legId] pair; groupId: ", str, ", legId: ", str2, ", found legs: ");
        sbM.append(arrayList);
        sbM.append(")");
        throw new IllegalArgumentException(sbM.toString());
    }

    public final tof.a3 b() {
        return (tof.a3) zhm.d0.o0(d().d());
    }

    public final SharedFlow c() {
        return (SharedFlow) this.f185497n.getValue();
    }

    public final SharedFlow d() {
        return (SharedFlow) this.f185496m.getValue();
    }

    public final SharedFlow e() {
        return (SharedFlow) this.o.getValue();
    }

    public final Flow f(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return vkm.q.q(new cxe.u(c(), block, 5));
    }

    public final bo8.w g() {
        return ((wa7.m) this.f185493h).j();
    }

    public final Flow h(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return vkm.q.q(new cxe.u(d(), block, 6));
    }

    public final Flow i() {
        return (Flow) this.f185500r.getValue();
    }

    public final Flow j() {
        return (Flow) this.f185498p.getValue();
    }

    public final void k() {
        skm.e0.C(this.f185489a, null, null, new k7c.l0(this, null, 19), 3);
    }
}

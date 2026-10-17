package q6;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import ch.qos.logback.core.net.SyslogConstants;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.api.UCubePaymentRequest;
import com.youTransactor.uCube.rpc.CardReaderType;
import com.youTransactor.uCube.rpc.Currency;
import com.youTransactor.uCube.rpc.TransactionType;
import dj0.d;
import efm.u;
import h30.l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sa1.e;
import sa1.h;
import sa1.r;
import sa1.v;
import sa1.x;
import tfm.z0;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class c implements CallbackToFutureAdapter.Resolver, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f242438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f242439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f242440c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f242438a = obj2;
        this.f242439b = obj3;
        this.f242440c = obj4;
        this.d = obj5;
        this.e = obj6;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        Currency currency;
        v vVar = (v) this.f242438a;
        d dVar = (d) this.f242439b;
        List list = (List) this.f242440c;
        List list2 = (List) this.d;
        lal.a aVar = (lal.a) this.e;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        vVar.getClass();
        long j2 = dVar.f115082a;
        xi0.b bVar = dVar.f115083b;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        xi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, xi0.b.f306276m)) {
            currency = r.f261242a;
        } else if (Intrinsics.f(bVar, xi0.b.d)) {
            currency = r.f261243b;
        } else if (Intrinsics.f(bVar, xi0.b.e)) {
            currency = r.f261244c;
        } else if (Intrinsics.f(bVar, xi0.b.f306282t)) {
            currency = r.d;
        } else if (Intrinsics.f(bVar, xi0.b.f306272g)) {
            currency = r.e;
        } else if (Intrinsics.f(bVar, xi0.b.f306273h)) {
            currency = r.f;
        } else if (Intrinsics.f(bVar, xi0.b.f306284x)) {
            currency = r.f261245g;
        } else if (Intrinsics.f(bVar, xi0.b.f306274j)) {
            currency = r.f261246h;
        } else if (Intrinsics.f(bVar, xi0.b.f306281s)) {
            currency = r.i;
        } else if (Intrinsics.f(bVar, xi0.b.f306285y)) {
            currency = r.f261247j;
        } else if (Intrinsics.f(bVar, xi0.b.k)) {
            currency = r.k;
        } else if (Intrinsics.f(bVar, xi0.b.f306280r)) {
            currency = r.f261248l;
        } else if (Intrinsics.f(bVar, xi0.b.i)) {
            currency = r.f261249m;
        } else if (Intrinsics.f(bVar, xi0.b.u)) {
            currency = r.f261250n;
        } else if (Intrinsics.f(bVar, xi0.b.f)) {
            currency = r.o;
        } else if (Intrinsics.f(bVar, xi0.b.o)) {
            currency = r.f261251p;
        } else if (Intrinsics.f(bVar, xi0.b.f306283w)) {
            currency = r.f261252q;
        } else if (Intrinsics.f(bVar, xi0.b.z)) {
            currency = r.f261253r;
        } else if (Intrinsics.f(bVar, xi0.b.f306277n)) {
            currency = r.f261254s;
        } else if (Intrinsics.f(bVar, xi0.b.f306275l)) {
            currency = r.f261255t;
        } else if (Intrinsics.f(bVar, xi0.b.B)) {
            currency = r.u;
        } else {
            if (!Intrinsics.f(bVar, xi0.b.A)) {
                throw new IllegalStateException(l.r("Unsupported currency ", bVar.f306286a));
            }
            currency = r.v;
        }
        UCubePaymentRequest cardWaitTimeout = new UCubePaymentRequest(j2, currency, TransactionType.PURCHASE, zhm.v.k(CardReaderType.NFC, CardReaderType.ICC), new h(aVar), zhm.u.c("en")).setCardWaitTimeout(SyslogConstants.LOG_CLOCK);
        int[] iArrC1 = d0.c1(list);
        UCubePaymentRequest authorizationPlainTags = cardWaitTimeout.setAuthorizationPlainTags(Arrays.copyOf(iArrC1, iArrC1.length));
        int[] iArrC12 = d0.c1(list2);
        UCubePaymentRequest forceDebug = authorizationPlainTags.setAuthorizationSecuredTags(Arrays.copyOf(iArrC12, iArrC12.length)).setApplicationSelectionTask(new e()).setSkipCardRemoval(true).setSkipStartingSteps(true).setRetrieveF5Tag(true).setForceDebug(false);
        Intrinsics.checkNotNullExpressionValue(forceDebug, "setForceDebug(...)");
        vVar.f261258a = UCubeAPI.pay(forceDebug, new x(emitter, vVar, aVar));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return OperationKt.launchOperation$lambda$2((Executor) this.f242438a, (Tracer) this.f242439b, (String) this.f242440c, (Function0) this.d, (MutableLiveData) this.e, completer);
    }
}

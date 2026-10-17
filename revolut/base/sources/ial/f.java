package ial;

import com.revolut.shared.feature.suspicious_transaction.impl.data.service.SuspiciousTransactionService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import i9g.e0;
import i9g.f0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ral.o;
import ral.q;
import ufm.i;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements hal.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionService f160059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f160060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f160061c;
    public final w4l.f d;
    public final w4l.f e;

    public f(SuspiciousTransactionService transactionsService, j memoryCache) {
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f160059a = transactionsService;
        this.f160060b = memoryCache;
        final int i = 3;
        Function2 function2 = new Function2(this) { // from class: ial.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f160054b;

            {
                this.f160054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List transactionDetails = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f160054b.f160060b.f("KEY_SUSPICIOUS_TRANSACTIONS", transactionDetails);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<ral.j> suspiciousTransactionBanner = this.f160054b.f160059a.getSuspiciousTransactionBanner(params.f160055a, params.f160056b);
                        f0 f0Var = new f0(25, new e0(18));
                        suspiciousTransactionBanner.getClass();
                        i iVar = new i(suspiciousTransactionBanner, f0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<q> suspiciousTransactionDialog = this.f160054b.f160059a.getSuspiciousTransactionDialog((String) pair.f186385a, (Map) pair.f186386b);
                        f0 f0Var2 = new f0(24, new e0(17));
                        suspiciousTransactionDialog.getClass();
                        i iVar2 = new i(suspiciousTransactionDialog, f0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<o>> knownSuspiciousTransactionIds = this.f160054b.f160059a.getKnownSuspiciousTransactionIds();
                        f0 f0Var3 = new f0(23, new e0(16));
                        knownSuspiciousTransactionIds.getClass();
                        i iVar3 = new i(knownSuspiciousTransactionIds, f0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        };
        final int i2 = 0;
        a aVar = new a(this, 0);
        Function2 function22 = new Function2(this) { // from class: ial.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f160054b;

            {
                this.f160054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List transactionDetails = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f160054b.f160060b.f("KEY_SUSPICIOUS_TRANSACTIONS", transactionDetails);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<ral.j> suspiciousTransactionBanner = this.f160054b.f160059a.getSuspiciousTransactionBanner(params.f160055a, params.f160056b);
                        f0 f0Var = new f0(25, new e0(18));
                        suspiciousTransactionBanner.getClass();
                        i iVar = new i(suspiciousTransactionBanner, f0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<q> suspiciousTransactionDialog = this.f160054b.f160059a.getSuspiciousTransactionDialog((String) pair.f186385a, (Map) pair.f186386b);
                        f0 f0Var2 = new f0(24, new e0(17));
                        suspiciousTransactionDialog.getClass();
                        i iVar2 = new i(suspiciousTransactionDialog, f0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<o>> knownSuspiciousTransactionIds = this.f160054b.f160059a.getKnownSuspiciousTransactionIds();
                        f0 f0Var3 = new f0(23, new e0(16));
                        knownSuspiciousTransactionIds.getClass();
                        i iVar3 = new i(knownSuspiciousTransactionIds, f0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        };
        final int i3 = 1;
        this.f160061c = new w4l.f(function2, aVar, function22, null, null, new a(this, 1), null, null, Constants.TAG_EMV_L2_CHECKSUM);
        this.d = new w4l.f(new Function2(this) { // from class: ial.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f160054b;

            {
                this.f160054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List transactionDetails = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f160054b.f160060b.f("KEY_SUSPICIOUS_TRANSACTIONS", transactionDetails);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<ral.j> suspiciousTransactionBanner = this.f160054b.f160059a.getSuspiciousTransactionBanner(params.f160055a, params.f160056b);
                        f0 f0Var = new f0(25, new e0(18));
                        suspiciousTransactionBanner.getClass();
                        i iVar = new i(suspiciousTransactionBanner, f0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<q> suspiciousTransactionDialog = this.f160054b.f160059a.getSuspiciousTransactionDialog((String) pair.f186385a, (Map) pair.f186386b);
                        f0 f0Var2 = new f0(24, new e0(17));
                        suspiciousTransactionDialog.getClass();
                        i iVar2 = new i(suspiciousTransactionDialog, f0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<o>> knownSuspiciousTransactionIds = this.f160054b.f160059a.getKnownSuspiciousTransactionIds();
                        f0 f0Var3 = new f0(23, new e0(16));
                        knownSuspiciousTransactionIds.getClass();
                        i iVar3 = new i(knownSuspiciousTransactionIds, f0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, null, null, 254);
        final int i5 = 2;
        this.e = new w4l.f(new Function2(this) { // from class: ial.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f160054b;

            {
                this.f160054b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        List transactionDetails = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f160054b.f160060b.f("KEY_SUSPICIOUS_TRANSACTIONS", transactionDetails);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<ral.j> suspiciousTransactionBanner = this.f160054b.f160059a.getSuspiciousTransactionBanner(params.f160055a, params.f160056b);
                        f0 f0Var = new f0(25, new e0(18));
                        suspiciousTransactionBanner.getClass();
                        i iVar = new i(suspiciousTransactionBanner, f0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<q> suspiciousTransactionDialog = this.f160054b.f160059a.getSuspiciousTransactionDialog((String) pair.f186385a, (Map) pair.f186386b);
                        f0 f0Var2 = new f0(24, new e0(17));
                        suspiciousTransactionDialog.getClass();
                        i iVar2 = new i(suspiciousTransactionDialog, f0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<o>> knownSuspiciousTransactionIds = this.f160054b.f160059a.getKnownSuspiciousTransactionIds();
                        f0 f0Var3 = new f0(23, new e0(16));
                        knownSuspiciousTransactionIds.getClass();
                        i iVar3 = new i(knownSuspiciousTransactionIds, f0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, null, null, 254);
    }
}

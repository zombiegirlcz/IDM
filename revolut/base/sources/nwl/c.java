package nwl;

import android.content.Intent;
import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f220010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f220011c;

    public /* synthetic */ c(l lVar, Intent intent, int i) {
        this.f220009a = i;
        this.f220010b = lVar;
        this.f220011c = intent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f220009a;
        final Intent intent = this.f220011c;
        final l lVar = this.f220010b;
        switch (i) {
            case 0:
                Pair it8 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "<get-first>(...)");
                final boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Object obj4 = it8.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "<get-second>(...)");
                final boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                try {
                    lVar.O(intent, zBooleanValue, zBooleanValue2);
                    break;
                } catch (Throwable th10) {
                    IllegalStateException illegalStateException = new IllegalStateException(v1.c.u("handleLoginProcess failed: ", th10), th10);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "LoginActivityPresenter", null, illegalStateException, h0Var);
                    Object obj5 = lVar.f220025j.get();
                    Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                    r rVarT = ((mli.e) obj5).a(false).y(hhm.f.f152431c).t(hfm.c.a());
                    Intrinsics.checkNotNullExpressionValue(rVarT, "observeOn(...)");
                    Function0 function0 = new Function0() { // from class: nwl.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            lVar.O(intent, zBooleanValue, zBooleanValue2);
                            return Unit.f186387a;
                        }
                    };
                    e eVar = new e(lVar, 0);
                    pfm.a aVar = new pfm.a(rVarT, new gn.b(6, new ne0.e(new BreadcrumbException(), 13)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                    Intrinsics.checkNotNullExpressionValue(aVar.w(new bo.e(7, eVar), new c86.f(8, function0)), "subscribe(...)");
                }
                return Unit.f186387a;
            default:
                Boolean handled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(handled, "handled");
                return !handled.booleanValue() ? lVar.S(intent).w() : rfm.h.f253943a;
        }
    }
}

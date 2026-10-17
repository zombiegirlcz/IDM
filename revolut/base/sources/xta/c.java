package xta;

import com.revolut.feature.rating.impl.extension.AppRatingException;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pfm.f;
import rp0.p0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f308795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f308795w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f308795w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Exception throwable;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        d dVar = this.f308795w;
        try {
            if (i == 0) {
                o.b(obj2);
                try {
                    f fVarB = dVar.f308797m.b();
                    this.u = "positiveRate";
                    this.v = 1;
                    if (nim.a.a(fVarB, this) == aVar) {
                        return aVar;
                    }
                    str = "positiveRate";
                } catch (Exception e) {
                    str = "positiveRate";
                    throwable = e;
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    AppRatingException appRatingException = new AppRatingException(str, throwable);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, appRatingException, h0Var);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.u;
                try {
                    o.b(obj2);
                } catch (Exception e2) {
                    throwable = e2;
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    AppRatingException appRatingException2 = new AppRatingException(str, throwable);
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, appRatingException2, h0Var2);
                }
            }
            Unit unit = Unit.f186387a;
        } catch (CancellationException unused) {
        }
        try {
            dVar.A2(dVar.f308799p.b(null));
            Unit unit2 = Unit.f186387a;
        } catch (CancellationException unused2) {
        } catch (Exception throwable2) {
            Intrinsics.checkNotNullParameter(throwable2, "throwable");
            AppRatingException appRatingException3 = new AppRatingException("startAppReview", throwable2);
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, appRatingException3, h0Var3);
        }
        d.Z2(dVar);
        return Unit.f186387a;
    }
}

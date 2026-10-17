package xta;

import cc7.l;
import com.revolut.feature.rating.impl.extension.AppRatingException;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.f;
import wli.x;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f308802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f308803x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308803x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f308803x, continuation, 0);
            case 1:
                return new e(this.f308803x, continuation, 1);
            case 2:
                return new e(this.f308803x, continuation, 2);
            default:
                return new e(this.f308803x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        Exception throwable;
        int i = this.u;
        l lVar = this.f308803x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f308802w;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        try {
                            f fVarA = ((yta.b) lVar.f22957n).a();
                            this.v = "negativeRate";
                            this.f308802w = 1;
                            if (nim.a.a(fVarA, this) == aVar) {
                                return aVar;
                            }
                            str = "negativeRate";
                        } catch (Exception e) {
                            e = e;
                            str = "negativeRate";
                            Exception throwable2 = e;
                            Intrinsics.checkNotNullParameter(throwable2, "throwable");
                            AppRatingException appRatingException = new AppRatingException(str, throwable2);
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException, h0Var);
                            return null;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = this.v;
                        try {
                            o.b(obj2);
                        } catch (Exception e2) {
                            e = e2;
                            Exception throwable22 = e;
                            Intrinsics.checkNotNullParameter(throwable22, "throwable");
                            AppRatingException appRatingException2 = new AppRatingException(str, throwable22);
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException2, h0Var2);
                            return null;
                        }
                    }
                    return Unit.f186387a;
                } catch (CancellationException e4) {
                    throw e4;
                }
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f308802w;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        try {
                            f fVarB = ((yta.b) lVar.f22957n).b();
                            this.v = "positiveRate";
                            this.f308802w = 1;
                            if (nim.a.a(fVarB, this) == aVar2) {
                                return aVar2;
                            }
                            str2 = "positiveRate";
                        } catch (Exception e5) {
                            e = e5;
                            str2 = "positiveRate";
                            Exception throwable3 = e;
                            Intrinsics.checkNotNullParameter(throwable3, "throwable");
                            AppRatingException appRatingException3 = new AppRatingException(str2, throwable3);
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException3, h0Var3);
                            return null;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = this.v;
                        try {
                            o.b(obj2);
                        } catch (Exception e6) {
                            e = e6;
                            Exception throwable32 = e;
                            Intrinsics.checkNotNullParameter(throwable32, "throwable");
                            AppRatingException appRatingException32 = new AppRatingException(str2, throwable32);
                            h0 h0Var32 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList32 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException32, h0Var32);
                            return null;
                        }
                    }
                    return Unit.f186387a;
                } catch (CancellationException e22) {
                    throw e22;
                }
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.f308802w;
                try {
                    if (i5 == 0) {
                        o.b(obj2);
                        try {
                            pfm.a aVarC = ((yta.b) lVar.f22957n).c();
                            this.v = "postponeRate";
                            this.f308802w = 1;
                            if (nim.a.a(aVarC, this) == aVar3) {
                                return aVar3;
                            }
                            str3 = "postponeRate";
                        } catch (Exception e33) {
                            e = e33;
                            str3 = "postponeRate";
                            Exception throwable4 = e;
                            Intrinsics.checkNotNullParameter(throwable4, "throwable");
                            AppRatingException appRatingException4 = new AppRatingException(str3, throwable4);
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException4, h0Var4);
                            return null;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = this.v;
                        try {
                            o.b(obj2);
                        } catch (Exception e35) {
                            e = e35;
                            Exception throwable42 = e;
                            Intrinsics.checkNotNullParameter(throwable42, "throwable");
                            AppRatingException appRatingException42 = new AppRatingException(str3, throwable42);
                            h0 h0Var42 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList42 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException42, h0Var42);
                            return null;
                        }
                    }
                    return Unit.f186387a;
                } catch (CancellationException e41) {
                    throw e41;
                }
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.f308802w;
                if (i6 == 0) {
                    o.b(obj2);
                    try {
                        x xVar = (x) lVar.o;
                        ((dqk.f) lVar.f22959q).getClass();
                        this.v = "handleDeeplink";
                        this.f308802w = 1;
                        try {
                            try {
                                Object objX1 = lg0.b.x1(xVar, "revolut://app/form/48001d04-56d2-447f-b51b-00457fc61dbc", null, null, this, 6);
                                if (objX1 == aVar4) {
                                    return aVar4;
                                }
                                str4 = "handleDeeplink";
                                obj2 = objX1;
                            } catch (CancellationException e45) {
                                e = e45;
                                throw e;
                            }
                        } catch (Exception e47) {
                            e = e47;
                            str4 = "handleDeeplink";
                            throwable = e;
                            Intrinsics.checkNotNullParameter(throwable, "throwable");
                            AppRatingException appRatingException5 = new AppRatingException(str4, throwable);
                            h0 h0Var5 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, appRatingException5, h0Var5);
                            return null;
                        }
                    } catch (CancellationException e70) {
                        e = e70;
                        throw e;
                    } catch (Exception e74) {
                        e = e74;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = this.v;
                    try {
                        o.b(obj2);
                    } catch (CancellationException e83) {
                        throw e83;
                    } catch (Exception e90) {
                        throwable = e90;
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        AppRatingException appRatingException52 = new AppRatingException(str4, throwable);
                        h0 h0Var52 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList52 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, appRatingException52, h0Var52);
                        return null;
                    }
                }
                try {
                    return (Boolean) obj2;
                } catch (Exception e100) {
                    e = e100;
                    throwable = e;
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    AppRatingException appRatingException522 = new AppRatingException(str4, throwable);
                    h0 h0Var522 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList522 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, appRatingException522, h0Var522);
                    return null;
                }
        }
    }
}

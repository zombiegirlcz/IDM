package ke7;

import android.os.SystemClock;
import com.revolut.feature.in_app_calls.ActiveCallData;
import com.revolut.feature.in_app_calls.CallInviteData;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f183037w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f183037w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f183037w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f183037w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((InAppCallStateWithData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((fe7.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(inAppCallStateWithData);
                final w wVar = this.f183037w;
                cli.y yVar = wVar.f183046x;
                final be7.a aVar2 = inAppCallStateWithData.f74785a;
                ActiveCallData activeCallData = inAppCallStateWithData.f;
                Long lValueOf = activeCallData != null ? Long.valueOf(activeCallData.f74771a) : null;
                CallInviteData callInviteData = inAppCallStateWithData.e;
                final String str = callInviteData != null ? callInviteData.f74776b : null;
                final String str2 = callInviteData != null ? callInviteData.f74777c : null;
                final String str3 = callInviteData != null ? callInviteData.d : null;
                final boolean z = inAppCallStateWithData.f74789h;
                switch (t.f183036a[aVar2.ordinal()]) {
                    case 1:
                    case 2:
                        final int i = 0;
                        wVar.H2(yVar, new Function1() { // from class: ke7.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i) {
                                    case 0:
                                        n update = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return n.a(update, null, aVar2, false, null, str, str2, str3, z, 13);
                                    case 1:
                                        n update2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return n.a(update2, i.f183017a, aVar2, false, null, str, str2, str3, z, 12);
                                    case 2:
                                        n update3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update3, "$this$update");
                                        return n.a(update3, k.f183019a, aVar2, false, null, str, str2, str3, z, 12);
                                    default:
                                        n update4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update4, "$this$update");
                                        return n.a(update4, j.f183018a, aVar2, false, null, str, str2, str3, z, 12);
                                }
                            }
                        });
                        break;
                    case 3:
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            ((l80.f) wVar.f183044t).getClass();
                            final long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
                            final String str4 = str;
                            final String str5 = str2;
                            wVar.H2(yVar, new Function1() { // from class: ke7.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    n update = (n) obj3;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    wVar.u.getClass();
                                    return n.a(update, new l(SystemClock.elapsedRealtime() + jCurrentTimeMillis), aVar2, false, null, str4, str5, str3, z, 12);
                                }
                            });
                        }
                        break;
                    case 4:
                        final int i2 = 1;
                        wVar.H2(yVar, new Function1() { // from class: ke7.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i2) {
                                    case 0:
                                        n update = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return n.a(update, null, aVar2, false, null, str, str2, str3, z, 13);
                                    case 1:
                                        n update2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return n.a(update2, i.f183017a, aVar2, false, null, str, str2, str3, z, 12);
                                    case 2:
                                        n update3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update3, "$this$update");
                                        return n.a(update3, k.f183019a, aVar2, false, null, str, str2, str3, z, 12);
                                    default:
                                        n update4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update4, "$this$update");
                                        return n.a(update4, j.f183018a, aVar2, false, null, str, str2, str3, z, 12);
                                }
                            }
                        });
                        break;
                    case 5:
                        final int i3 = 2;
                        wVar.H2(yVar, new Function1() { // from class: ke7.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i3) {
                                    case 0:
                                        n update = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return n.a(update, null, aVar2, false, null, str, str2, str3, z, 13);
                                    case 1:
                                        n update2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return n.a(update2, i.f183017a, aVar2, false, null, str, str2, str3, z, 12);
                                    case 2:
                                        n update3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update3, "$this$update");
                                        return n.a(update3, k.f183019a, aVar2, false, null, str, str2, str3, z, 12);
                                    default:
                                        n update4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update4, "$this$update");
                                        return n.a(update4, j.f183018a, aVar2, false, null, str, str2, str3, z, 12);
                                }
                            }
                        });
                        break;
                    case 6:
                        final int i5 = 3;
                        wVar.H2(yVar, new Function1() { // from class: ke7.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i5) {
                                    case 0:
                                        n update = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return n.a(update, null, aVar2, false, null, str, str2, str3, z, 13);
                                    case 1:
                                        n update2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return n.a(update2, i.f183017a, aVar2, false, null, str, str2, str3, z, 12);
                                    case 2:
                                        n update3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update3, "$this$update");
                                        return n.a(update3, k.f183019a, aVar2, false, null, str, str2, str3, z, 12);
                                    default:
                                        n update4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(update4, "$this$update");
                                        return n.a(update4, j.f183018a, aVar2, false, null, str, str2, str3, z, 12);
                                }
                            }
                        });
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                fe7.a aVar3 = (fe7.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (aVar3 != null) {
                    w wVar2 = this.f183037w;
                    wVar2.H2(wVar2.f183046x, new v(aVar3, 0));
                }
                return Unit.f186387a;
        }
    }
}

package i5d;

import androidx.room.util.DBUtil;
import g5d.d;
import g5d.e;
import g5d.g;
import gim.i;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f158806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f158807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f158808y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158806w = cVar;
        this.f158807x = str;
        this.f158808y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f158806w, this.f158807x, this.f158808y, continuation, 0);
            default:
                return new b(this.f158806w, this.f158807x, this.f158808y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                c cVar = this.f158806w;
                Instant instantA = cVar.f158810b.a();
                d dVar = cVar.f158809a;
                long epochMilli = instantA.atOffset(ZoneOffset.UTC).plus(3L, (TemporalUnit) ChronoUnit.MONTHS).toInstant().toEpochMilli();
                long epochMilli2 = instantA.toEpochMilli();
                this.v = 1;
                g gVar = (g) dVar;
                Object objPerformInTransactionSuspending = DBUtil.performInTransactionSuspending(gVar.f140763a, new e(gVar, this.f158807x, this.f158808y, epochMilli, epochMilli2, 0), this);
                return objPerformInTransactionSuspending == aVar ? aVar : objPerformInTransactionSuspending;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar2 = this.f158806w;
                    Instant instantA2 = cVar2.f158810b.a();
                    d dVar2 = cVar2.f158809a;
                    long epochMilli3 = instantA2.atOffset(ZoneOffset.UTC).plus(3L, (TemporalUnit) ChronoUnit.MONTHS).toInstant().toEpochMilli();
                    long epochMilli4 = instantA2.toEpochMilli();
                    this.v = 1;
                    g gVar2 = (g) dVar2;
                    if (DBUtil.performInTransactionSuspending(gVar2.f140763a, new e(gVar2, this.f158807x, this.f158808y, epochMilli3, epochMilli4, 1), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package l40;

import com.revolut.chat.domain.model.ChatMode;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f191988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f191989c;

    public /* synthetic */ b(q qVar, r rVar, int i) {
        this.f191987a = i;
        this.f191988b = qVar;
        this.f191989c = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f191987a;
        r rVar = this.f191989c;
        q qVar = this.f191988b;
        switch (i) {
            case 0:
                r7a.i result = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i2 = 27;
                if (result instanceof r7a.h) {
                    qVar.getClass();
                    qVar.T2(new m(qVar, rVar, null), new yi5.b(i2));
                } else if ((result instanceof r7a.e) || (result instanceof r7a.f)) {
                    if (qVar.f192017q.c("android.permission.RECORD_AUDIO")) {
                        qVar.T2(new m(qVar, rVar, null), new yi5.b(i2));
                    }
                } else {
                    if (!(result instanceof r7a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException("Unhandled secondary click");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                }
                return Unit.f186387a;
            default:
                String str = ((m40.e) obj2).f202617a;
                ChatMode chatMode = rVar.f192021a;
                c0 feedType = rVar.f192022b;
                UUID uuid = rVar.f192023c;
                Intrinsics.checkNotNullParameter(chatMode, "chatMode");
                Intrinsics.checkNotNullParameter(feedType, "feedType");
                q.g3(qVar, new r(chatMode, feedType, uuid, str));
                return Unit.f186387a;
        }
    }
}

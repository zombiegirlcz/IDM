package np8;

import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditContract$State;
import java.time.ZonedDateTime;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import nn3.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b f218163b;

    public /* synthetic */ f(com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar, int i) {
        this.f218162a = i;
        this.f218163b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f218162a) {
            case 0:
                xp8.i result = (xp8.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar = this.f218163b;
                bVar.H2(bVar.u, new z(result, 27));
                bVar.l2(new x(bVar, null, 27), new yi5.b(26));
                return Unit.f186387a;
            default:
                c cVar = c.Create;
                dp8.d dVar = dp8.d.ONE_OFF;
                ZonedDateTime zonedDateTimeK = ((l80.f) this.f218163b.f77367p).k();
                dj0.d.Companion.getClass();
                return new ChallengesEditContract$State(null, cVar, "", "", dj0.d.e, zonedDateTimeK, dVar);
        }
    }
}

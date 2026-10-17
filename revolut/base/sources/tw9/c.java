package tw9;

import android.app.Activity;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.profile.impl.R$string;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCard;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import tqh.j;
import vkm.j2;
import yhm.o;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ProfileDetailsCard v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ProfileDetailsCard profileDetailsCard, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = profileDetailsCard;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ProfileDetailsCard profileDetailsCard = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) profileDetailsCard.R.getValue();
                String username = ((d) ((j2) iVar.f274966t.f22677a).getValue()).f274954a;
                f01.c cVar = iVar.f274963q;
                int i2 = R$string.payments_profile_sharing_username;
                iVar.f274962p.getClass();
                Intrinsics.checkNotNullParameter(username, "username");
                String string = cVar.b(new TextLocalisedClause(i2, u.c(new TextClause(j6.a.q("revolut.me/", username), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString();
                tqi.g gVar = iVar.o;
                tqi.c cVar2 = new tqi.c(null, string, null, null, 91);
                m70.a.c(t0.f186434a);
                iVar.C1(u0.b(gVar.g(cVar2, "")));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) profileDetailsCard.R.getValue();
                Activity activity = profileDetailsCard.m2();
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                iVar2.l2(new j(iVar2, activity, null, 17), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}

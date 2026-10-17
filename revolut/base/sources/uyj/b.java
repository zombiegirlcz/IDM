package uyj;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ ShareRewardsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShareRewardsScreen shareRewardsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = shareRewardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.f101772a0.getValue();
        byte[] bArr = ((d) iVar.t2()).f284427a;
        if (bArr != null) {
            LearnShareReward learnShareReward = iVar.f284434p.f101773a;
            iVar.C1(new BridgeDestination(iVar.f284437s.g(new tqi.c(null, learnShareReward.f78032b, new tqi.b("image.jpg", bArr), "image/jpeg", 51), learnShareReward.f78032b)));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("No cached image to share reward. Cannot open share with empty image");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}

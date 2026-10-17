package ay2;

import com.revolut.feature.cards.models.design.CardDesignLockInfo;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f11028a;

    public b(h hVar) {
        this.f11028a = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        e93.f design = (e93.f) obj2;
        ChecklistChallenge challenge = (ChecklistChallenge) obj3;
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        return new CardDesignLockInfo.Challenge(design.c(), challenge, ((pg3.b) this.f11028a.f11038b).b(challenge));
    }
}

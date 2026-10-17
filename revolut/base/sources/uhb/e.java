package uhb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280191a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b f280192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f280193c;

    public /* synthetic */ e(com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar, Ref$BooleanRef ref$BooleanRef) {
        this.f280192b = bVar;
        this.f280193c = ref$BooleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f280191a) {
            case 0:
                if (!this.f280193c.f186407a) {
                    oki.h.D2(this.f280192b.f83056x);
                }
                break;
            default:
                Ref$BooleanRef ref$BooleanRef = this.f280193c;
                com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar = this.f280192b;
                bVar.l2(new u2i.g(ref$BooleanRef, bVar, null, 20), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ e(Ref$BooleanRef ref$BooleanRef, com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar) {
        this.f280193c = ref$BooleanRef;
        this.f280192b = bVar;
    }
}

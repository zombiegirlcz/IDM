package d34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qu3.m;
import s04.g;
import st3.u;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f110911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f110912x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f110911w = eVar;
        this.f110912x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f110911w, this.f110912x, continuation, 0);
            default:
                return new c(this.f110911w, this.f110912x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [s04.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [s04.e] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                e eVar = this.f110911w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = eVar.f110914a;
                    this.v = 1;
                    obj2 = creditPluginsService.confirmOutstandingDebtsV2(this.f110912x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return eVar.f110916c.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                e eVar2 = this.f110911w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = eVar2.f110914a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getOutstandingDebtsIntroConfig(this.f110912x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                u dto = (u) obj2;
                g gVar = eVar2.f110915b;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return new m(dr3.g.c(gVar.f258838a, dto, new Function1(gVar, dto, 0) { // from class: s04.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f258836a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f258837b;

                    {
                        this.f258836a = i;
                        this.f258837b = dto;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        String str = (String) obj3;
                        switch (this.f258836a) {
                            case 0:
                                st3.c primaryButton = this.f258837b.getPrimaryButton();
                                return g.a(str, primaryButton != null ? primaryButton.getActionUrl() : null);
                            default:
                                st3.c secondaryButton = this.f258837b.getSecondaryButton();
                                return g.a(str, secondaryButton != null ? secondaryButton.getActionUrl() : null);
                        }
                    }
                }, new Function1(gVar, dto, 1) { // from class: s04.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f258836a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f258837b;

                    {
                        this.f258836a = i;
                        this.f258837b = dto;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        String str = (String) obj3;
                        switch (this.f258836a) {
                            case 0:
                                st3.c primaryButton = this.f258837b.getPrimaryButton();
                                return g.a(str, primaryButton != null ? primaryButton.getActionUrl() : null);
                            default:
                                st3.c secondaryButton = this.f258837b.getSecondaryButton();
                                return g.a(str, secondaryButton != null ? secondaryButton.getActionUrl() : null);
                        }
                    }
                }, 8));
        }
    }
}

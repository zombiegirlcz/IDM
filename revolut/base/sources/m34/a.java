package m34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dr3.g;
import ft3.h1;
import g14.c;
import g14.f;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import r10.d;
import st3.u;
import uy3.e;
import uy3.j;
import x04.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f202277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f202278x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f202277w = cVar;
        this.f202278x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f202277w, this.f202278x, continuation, 0);
            case 1:
                return new a(this.f202277w, this.f202278x, continuation, 1);
            default:
                return new a(this.f202277w, this.f202278x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f202277w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = cVar.f;
                    String str = this.f202278x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.getHomeInsuranceConfiguration(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                g14.a dto = (g14.a) obj2;
                g gVar = cVar.f202283b.f139531a;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return new uy3.b(gVar.a(dto.getIntro(), new g1.c(3)), g.c(gVar, dto.getDisclaimer(), null, null, 14));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f202277w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = cVar2.f;
                    String str2 = this.f202278x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getHomeInsuranceDocumentsUploadConfiguration(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                g14.g dto2 = (g14.g) obj2;
                d dVar = cVar2.e;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                u requirements = dto2.getRequirements();
                return new j(requirements != null ? g.c((g) dVar.f250818a, requirements, null, null, 14) : null, ((h) dVar.f250819b).a(dto2.getDocumentsUpload()));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                c cVar3 = this.f202277w;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = cVar3.f;
                    String str3 = this.f202278x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService3.getHomeInsurancePartnerConfiguration(str3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                g14.c dto3 = (g14.c) obj2;
                g14.d dVar2 = cVar3.f202284c;
                Intrinsics.checkNotNullParameter(dto3, "dto");
                if (dto3 instanceof c.a) {
                    return new uy3.c(f.a(((c.a) dto3).getContent()));
                }
                if (!(dto3 instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c.b bVar = (c.b) dto3;
                String url2 = bVar.getUrl();
                c.b.a continuePopup = bVar.getContinuePopup();
                return new e(url2, continuePopup != null ? new uy3.d(continuePopup.getTitle(), continuePopup.getDescription(), continuePopup.getPrimaryButtonTitle(), continuePopup.getSecondaryButtonTitle()) : null, bVar.getSuccessPopupTitle());
        }
    }
}

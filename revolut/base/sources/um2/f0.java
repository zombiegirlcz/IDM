package um2;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SandboxAppearance;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b f281193w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281193w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(this.f281193w, continuation, 0);
                f0Var.v = obj2;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(this.f281193w, continuation, 1);
                f0Var2.v = obj2;
                return f0Var2;
            default:
                f0 f0Var3 = new f0(this.f281193w, continuation, 2);
                f0Var3.v = obj2;
                return f0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = this.f281193w;
        switch (i) {
            case 0:
                ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = (ThemeCustomisationContract$SandboxAppearance) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.B, new ud3.n(themeCustomisationContract$SandboxAppearance, 29));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.B, new ud3.a0(data, 25));
                break;
            default:
                k0 k0Var = bVar.A;
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = (ThemeCustomisationContract$ThemeInfo) data2.getContent();
                Continuation continuation = null;
                GlobalThemeDeclaration globalThemeDeclaration = themeCustomisationContract$ThemeInfo != null ? themeCustomisationContract$ThemeInfo.f63780c : null;
                bVar.H2(bVar.B, new toh.h(data2, 23, globalThemeDeclaration, bVar));
                if (globalThemeDeclaration != null) {
                    bVar.l2(new u2i.g(bVar, globalThemeDeclaration, continuation, 27), new yi5.b(26));
                }
                if (bVar.o.f63761g && !k0Var.f281205b && data2.getContent() != null) {
                    k0Var.f281205b = true;
                    bVar.J2();
                }
                break;
        }
        return Unit.f186387a;
    }
}

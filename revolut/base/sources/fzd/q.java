package fzd;

import com.revolut.feature.statements.api.models.CustomisationSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f139159b;

    public /* synthetic */ q(u uVar, int i) {
        this.f139158a = i;
        this.f139159b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139158a) {
            case 0:
                u uVar = this.f139159b;
                cli.y yVar = uVar.u;
                s7a.a0 output = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                c0 c0Var = output.f260599a;
                nzd.a aVar = c0Var instanceof nzd.a ? (nzd.a) c0Var : null;
                if (aVar != null) {
                    uVar.H2(yVar, new n(CustomisationSelection.copy$default(((j) ((j2) yVar.f22677a).getValue()).f139144b, null, aVar.f221022a, null, false, null, null, null, null, null, 509, null), 1));
                }
                break;
            default:
                u uVar2 = this.f139159b;
                cli.y yVar2 = uVar2.u;
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.c) {
                    CustomisationSelection customisationSelection = ((j) ((j2) yVar2.f22677a).getValue()).f139144b;
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = ((h1j.c) bVar).f148579a;
                    aVar2.getClass();
                    uVar2.H2(yVar2, new n(CustomisationSelection.copy$default(customisationSelection, null, null, xi0.a.a(str), false, null, null, null, null, null, 507, null), 2));
                }
                break;
        }
        return Unit.f186387a;
    }
}

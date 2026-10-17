package l0c;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsController;
import com.revolut.feature.terms.api.model.Terms;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import knd.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsReadTermsController f191211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(RevPointsReadTermsController revPointsReadTermsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191211w = revPointsReadTermsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f191211w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f191211w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsReadTermsController revPointsReadTermsController = this.f191211w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                KProperty[] kPropertyArr = RevPointsReadTermsController.T;
                revPointsReadTermsController.d3().e.setDescriptionVisibility((zBooleanValue || revPointsReadTermsController.K.f83849a.f84101c == null) ? 4 : 0);
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = revPointsReadTermsController.d();
                Intrinsics.h(listId);
                u uVar = (u) kVarE3;
                y yVar = uVar.f191230t;
                tqi.g gVar = uVar.f191228r;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("DOWNLOAD_BUTTON_LIST_ID")) {
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    Terms terms = ((j) j2Var.getValue()).f191212a;
                    if (terms != null) {
                        String str = terms.f90359h;
                        Object content = ((j) j2Var2.getValue()).f191213b.getContent();
                        Continuation continuation = null;
                        p pVar = content instanceof p ? (p) content : null;
                        File file = pVar != null ? pVar.f191218a : null;
                        String str2 = terms.d;
                        Object content2 = ((j) j2Var2.getValue()).f191213b.getContent();
                        o oVar = content2 instanceof o ? (o) content2 : null;
                        File file2 = oVar != null ? oVar.f191217a : null;
                        if (file != null) {
                            uVar.C1(u0.b(tqi.g.d(gVar, str, file, "application/pdf", 8)));
                        } else if (str2 != null) {
                            uVar.n2(new h0(uVar, str2, terms, continuation, 16), new whi.b(6));
                        } else if (file2 != null) {
                            uVar.C1(u0.b(tqi.g.d(gVar, str, file2, "text/html", 8)));
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Unable to load terms content for provided input data");
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            Unit unit = Unit.f186387a;
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}

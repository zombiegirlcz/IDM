package wol;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerController;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wgb.v;
import wnc.x;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ QrDisplayerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(QrDisplayerController qrDisplayerController, Continuation continuation) {
        super(2, continuation);
        this.v = qrDisplayerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = (t) this.v.R.getValue();
        String listId = suggestion.f53492a;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        y yVar = tVar.u;
        l lVar = ((m) ((j2) yVar.f22677a).getValue()).f298969a;
        Continuation continuation = null;
        i iVar = lVar instanceof i ? (i) lVar : null;
        if (iVar != null && (str = iVar.f298966b) != null) {
            switch (listId.hashCode()) {
                case -1969248922:
                    if (listId.equals("ID_DEBUG_REFRESH_BUTTON")) {
                        tVar.H2(yVar, new x(22));
                        tVar.C2(o.f298972a);
                    }
                    break;
                case -1327224894:
                    if (listId.equals("ID_DEBUG_SKIP_BUTTON")) {
                        String challengeId = tVar.f298980s.f106687a.f106100c;
                        if (challengeId != null) {
                            tVar.f298981t.getClass();
                            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        }
                        tVar.X1(new mii.h(new TextClause("[DEV] There is no QR Auto Completion destination available", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "SHOT_ID_NO_AUTO_COMPLETE_IMPL_ERROR"));
                    }
                    break;
                case -393716468:
                    if (listId.equals("ID_DEBUG_COPY_BUTTON")) {
                        tVar.f298978q.c(null, str, false, new vt3.a(tVar, 29));
                    }
                    break;
                case 32275607:
                    if (listId.equals("ID_DEBUG_OPEN_BUTTON")) {
                        tVar.n2(new v(tVar, str, continuation, 19), new whi.b(6));
                    }
                    break;
            }
        }
        return Unit.f186387a;
    }
}

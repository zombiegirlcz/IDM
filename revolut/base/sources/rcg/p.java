package rcg;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.f1;
import rp0.k1;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f253262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f253262w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f253262w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            pfm.r rVarA = qVar.o.a(this.f253262w);
            this.u = 1;
            if (nim.a.a(rVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ((k1) qVar.f253263p).d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "FAVORITES_GRID_DIALOG", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_added_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_heart, (Integer) null, (Integer) null, new Integer(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, f1.ABOVE_ANCHOR_VIEW, null, Constants.TAG_EMV_L2_CHECKSUM));
        return Unit.f186387a;
    }
}

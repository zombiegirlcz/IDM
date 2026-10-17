package h6i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function3 {
    public /* synthetic */ RevPointsPocketInfo u;
    public /* synthetic */ List v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        m mVar = new m(3, (Continuation) obj4);
        mVar.u = (RevPointsPocketInfo) obj2;
        mVar.v = (List) obj3;
        return mVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RevPointsPocketInfo revPointsPocketInfo = this.u;
        List list = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new AccountWrapper(j8l.a.REV_POINTS_POCKET, new TextLocalisedClause(R$string.rev_points_pocket_move_money_title, null, null, 14), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), new AccountSource.RevPointsPocketSource(revPointsPocketInfo, list), null);
    }
}

package v78;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior.accounts.impl.R$string;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import sf8.m;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = this.v;
        j60.a aVar2 = gVar.f286574q;
        Intrinsics.h(list);
        List<m> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (m mVar : list2) {
            arrayList.add(new AccountCellItemDelegate.Model(mVar.f262360a, Intrinsics.f(mVar.f262361b, gVar.f286573p.f76701a), (Image) new ContactImage(mVar.f262361b, (String) null, (String) null, (String) null, (String) null, mVar.b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), (Clause) new TextClause(mVar.f262362c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) null, new RowDelegate.Model.c.b(new MoneyClause(mVar.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), (ProgressStyle) null, (Object) mVar, (Parcelable) null, 128880));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        aVar2.x(new y(arrayList, new t(new TextLocalisedClause(R$string.junior_widgets_small_account_widget_customization_selector_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }
}

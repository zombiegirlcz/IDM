package qi3;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f246632b;

    public /* synthetic */ c(l lVar, int i) {
        this.f246631a = i;
        this.f246632b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f246631a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List items = (List) pair.f186385a;
                String str = (String) pair.f186386b;
                l lVar = this.f246632b;
                s sVar = (s) lVar.L();
                if (sVar != null) {
                    Intrinsics.h(items);
                    ChooserActivity chooserActivity = (ChooserActivity) sVar;
                    Intrinsics.checkNotNullParameter(items, "items");
                    ((z4l.j) chooserActivity.D0.getValue()).c(items);
                    Iterator it8 = items.iterator();
                    int i = 0;
                    while (true) {
                        if (it8.hasNext()) {
                            koi.j jVar = (koi.j) it8.next();
                            if (!(jVar instanceof RowDelegate.Model ? ((RowDelegate.Model) jVar).J() : jVar instanceof AccountCellItemDelegate.Model ? ((AccountCellItemDelegate.Model) jVar).f51553b : false)) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    if (!(i > 2)) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        ((RecyclerView) chooserActivity.f65884r0.getValue(chooserActivity, ChooserActivity.E0[0])).scrollToPosition(numValueOf.intValue() - 2);
                    }
                }
                String message = lVar.f246645q.b(new TextLocalisedClause(((ChooserConfiguration) lVar.f246641l).f65896l, u.c(str), null, 12)).toString();
                s sVar2 = (s) lVar.L();
                if (sVar2 != null) {
                    boolean zIsEmpty = items.isEmpty();
                    ChooserActivity chooserActivity2 = (ChooserActivity) sVar2;
                    j90.a aVar = chooserActivity2.f65885s0;
                    Intrinsics.checkNotNullParameter(message, "message");
                    KProperty[] kPropertyArr = ChooserActivity.E0;
                    w01.k.e((TypefaceTextView) aVar.getValue(chooserActivity2, kPropertyArr[1]), zIsEmpty);
                    ((TypefaceTextView) aVar.getValue(chooserActivity2, kPropertyArr[1])).setText(message);
                    ((RecyclerView) chooserActivity2.f65884r0.getValue(chooserActivity2, kPropertyArr[0])).setVisibility(zIsEmpty ? 4 : 0);
                }
                return Unit.f186387a;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                l lVar2 = this.f246632b;
                efm.b bVarH = mo3.a.u(o70.a.g(lVar2.f246640j.b()), lVar2.f246644p, true).h(f9b.f.a(lVar2.i));
                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                return ue0.e.v(bVarH);
            case 2:
                l lVar3 = this.f246632b;
                efm.b bVarH2 = mo3.a.u(o70.a.g(lVar3.f246640j.a()), lVar3.f246644p, true).h(f9b.f.a(lVar3.i));
                Intrinsics.checkNotNullExpressionValue(bVarH2, "compose(...)");
                return bVarH2;
            case 3:
                opi.d.c(this.f246632b.o);
                return Unit.f186387a;
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                String dialogId = (String) pair2.f186385a;
                ((Boolean) pair2.f186386b).getClass();
                l lVar4 = this.f246632b;
                lVar4.f246640j.getClass();
                Intrinsics.checkNotNullParameter(dialogId, "dialogId");
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mo3.a.u(o70.a.g(mVar), lVar4.f246644p, true).h(f9b.f.a(lVar4.i));
        }
    }
}

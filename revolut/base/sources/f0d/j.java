package f0d;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import efm.d0;
import gzc.r;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import ozc.t;
import te0.w;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f131089b;

    public /* synthetic */ j(q qVar, int i) {
        this.f131088a = i;
        this.f131089b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        String str;
        switch (this.f131088a) {
            case 0:
                InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(textData, "textData");
                q qVar = this.f131089b;
                d0 d0VarFirstOrError = ((t) qVar.f131100j).z3().firstOrError();
                ey7.a aVar = new ey7.a(new k(0), 13);
                d0VarFirstOrError.getClass();
                return new pfm.a(new rfm.j(d0VarFirstOrError, aVar, 0), new ey7.a(new l(qVar, textData, 0), 14), 3);
            case 1:
                d question = (d) obj2;
                Intrinsics.checkNotNullParameter(question, "question");
                pfm.h hVar = new pfm.h(new m(this.f131089b, question, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar.g(w.h(question));
            case 2:
                d dVar = (d) obj2;
                Intrinsics.checkNotNullParameter(dVar, "<destruct>");
                r question2 = dVar.f131084a;
                gzc.c cVar = dVar.f131085b;
                ((i) this.f131089b.k).getClass();
                Intrinsics.checkNotNullParameter(question2, "question");
                int i = h.f131087a[question2.f148031a.ordinal()];
                if (i == 1) {
                    TextClause textClause = new TextClause(question2.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    if (cVar == null || (str = cVar.f147989b) == null) {
                        str = question2.f148034g;
                    }
                    String str2 = str;
                    InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_TEXT_ID", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    return u.c(model);
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new Throwable("Unsupported question type");
                }
                Map map = question2.f148035h;
                if (map == null) {
                    return f0.f322471a;
                }
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    arrayList.add(new InputChecklistDelegate.Model(j6.a.q("OPTION_TYPE_LIST_ID", str3), new TextClause((String) entry.getValue(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(cVar != null ? cVar.f147989b : null, str3), false, null, iq.RADIO_BUTTON, null, null, str3, null, 0, 0, 0, 523992));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 3:
                List list = (List) obj2;
                rri.a aVar2 = (f) this.f131089b.L();
                if (aVar2 != null) {
                    Intrinsics.h(list);
                    ((BaseLayoutBuilderFragment) aVar2).setItems(list);
                }
                return Unit.f186387a;
            case 4:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qri.b) this.f131089b.f131101l).m();
            default:
                InputChecklistDelegate.Model model2 = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                q qVar2 = this.f131089b;
                d0 d0VarFirstOrError2 = ((t) qVar2.f131100j).z3().firstOrError();
                ey7.a aVar3 = new ey7.a(new k(1), 15);
                d0VarFirstOrError2.getClass();
                return new pfm.a(new rfm.j(d0VarFirstOrError2, aVar3, 0), new ey7.a(new l(qVar2, model2, 1), 16), 3);
        }
    }
}

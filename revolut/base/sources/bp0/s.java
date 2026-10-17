package bp0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function3 f17516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Clause f17517c;

    public /* synthetic */ s(Function3 function3, Clause clause, int i) {
        this.f17515a = i;
        this.f17516b = function3;
        this.f17517c = clause;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f17515a) {
            case 0:
                String url2 = (String) obj2;
                String title = (String) obj3;
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(title, "title");
                Function3 function3 = this.f17516b;
                if (function3 != null) {
                    function3.invoke(new Click(30, (Integer) null, (Object) null, url2, false), title, this.f17517c);
                }
                return Boolean.TRUE;
            case 1:
                String url3 = (String) obj2;
                String title2 = (String) obj3;
                Intrinsics.checkNotNullParameter(url3, "url");
                Intrinsics.checkNotNullParameter(title2, "title");
                Function3 function32 = this.f17516b;
                if (function32 != null) {
                    Clause clause = this.f17517c;
                    int i = 28;
                    function32.invoke(new Click(i, (Integer) null, ((HtmlLocalisedClause) clause).e, url3, false), title2, clause);
                }
                return Boolean.TRUE;
            case 2:
                String url4 = (String) obj2;
                String title3 = (String) obj3;
                Intrinsics.checkNotNullParameter(url4, "url");
                Intrinsics.checkNotNullParameter(title3, "title");
                Function3 function33 = this.f17516b;
                if (function33 != null) {
                    Clause clause2 = this.f17517c;
                    int i2 = 28;
                    function33.invoke(new Click(i2, (Integer) null, ((HtmlClause) clause2).e, url4, false), title3, clause2);
                }
                return Boolean.TRUE;
            default:
                String url5 = (String) obj2;
                String text = (String) obj3;
                Intrinsics.checkNotNullParameter(url5, "url");
                Intrinsics.checkNotNullParameter(text, "text");
                Function3 function34 = this.f17516b;
                if (function34 != null) {
                    Clause clause3 = this.f17517c;
                    int i3 = 28;
                    function34.invoke(new Click(i3, (Integer) null, ((HtmlClause) clause3).e, url5, false), text, clause3);
                }
                return Unit.f186387a;
        }
    }
}

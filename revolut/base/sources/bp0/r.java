package bp0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17514b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f17513a = i;
        this.f17514b = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object params, Object domain) {
        switch (this.f17513a) {
            case 0:
                Function1 function1 = (Function1) this.f17514b;
                Click click = (Click) obj2;
                String text = (String) params;
                Clause clause = (Clause) domain;
                Intrinsics.checkNotNullParameter(click, "click");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(clause, "clause");
                function1.invoke(new ty0.a(click.f57743a, text, clause, click.f57744b));
                return Unit.f186387a;
            case 1:
                ekg.g gVar = (ekg.g) this.f17514b;
                AppTheme content = (AppTheme) obj2;
                ((Boolean) params).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                return new xjg.l(content, gVar.f.d());
            default:
                jpf.a aVar = (jpf.a) this.f17514b;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((w4l.f) aVar.f177268b).j(params, domain);
                return Unit.f186387a;
        }
    }
}

package fzd;

import com.revolut.feature.statements.api.models.CustomisationParameters;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139152a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f139153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f139154c;

    public /* synthetic */ o(u uVar, List list) {
        this.f139154c = uVar;
        this.f139153b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139152a) {
            case 0:
                izd.g result = (izd.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                u uVar = this.f139154c;
                x xVar = uVar.f139164r;
                xVar.g3(new lzd.c(result.f169874a, result.f169875b));
                List listP0 = d0.P0(this.f139153b, new fad.i(result, 3));
                cli.y yVar = uVar.u;
                CustomisationParameters customisationParameters = (CustomisationParameters) ((j) ((j2) yVar.f22677a).getValue()).f139143a.getContent();
                if (customisationParameters != null) {
                    xVar.f3(listP0);
                    uVar.H2(yVar, new fv6.r(zi0.c.P(CustomisationParameters.copy$default(customisationParameters, null, null, listP0, null, null, 27, null), false, null, 3), 13));
                }
                break;
            default:
                gzd.f result2 = (gzd.f) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                List listP02 = d0.P0(this.f139153b, new fad.i(result2, 2));
                u uVar2 = this.f139154c;
                z zVar = uVar2.f139165s;
                zVar.f3(result2.f148056a);
                cli.y yVar2 = uVar2.u;
                CustomisationParameters customisationParameters2 = (CustomisationParameters) ((j) ((j2) yVar2.f22677a).getValue()).f139143a.getContent();
                if (customisationParameters2 != null) {
                    zVar.e3(listP02);
                    uVar2.H2(yVar2, new fpk.b(customisationParameters2, listP02, 26));
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ o(List list, u uVar) {
        this.f139153b = list;
        this.f139154c = uVar;
    }
}

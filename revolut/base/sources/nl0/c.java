package nl0;

import com.revolut.domain.models.openbanking.ConsentAccount;
import do3.n;
import do3.q;
import ip0.pb0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import nl0.f;
import plc.p;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216973a;

    public /* synthetic */ c(int i) {
        this.f216973a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f216973a) {
            case 0:
                MatchResult it8 = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return "<br>";
            case 1:
                MatchResult it9 = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return "";
            case 2:
                return v0.a.h(a10.b.n((MatchResult) obj2, "it", 4), "<li>", "</li>");
            case 3:
                MatchResult matchResult = (MatchResult) obj2;
                Object objN = a10.b.n(matchResult, "it", 1);
                Object obj3 = matchResult.c().get(4);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(objN);
                sb6.append(obj3);
                return sb6.toString();
            case 4:
                MatchResult matchResult2 = (MatchResult) obj2;
                return a10.b.n(matchResult2, "it", 1) + "<b>" + matchResult2.c().get(3) + "</b>";
            case 5:
                MatchResult matchResult3 = (MatchResult) obj2;
                Object objN2 = a10.b.n(matchResult3, "it", 1);
                Object obj4 = matchResult3.c().get(3);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(objN2);
                sb9.append(obj4);
                return sb9.toString();
            case 6:
                return v0.a.h(a10.b.n((MatchResult) obj2, "it", 2), "<i>", "</i>");
            case 7:
                return v0.a.h(a10.b.n((MatchResult) obj2, "it", 2), "<b>", "</b>");
            case 8:
                return (CharSequence) a10.b.n((MatchResult) obj2, "it", 2);
            case 9:
                MatchResult matchResult4 = (MatchResult) obj2;
                return a10.b.n(matchResult4, "it", 1) + "<i>" + matchResult4.c().get(3) + "</i>";
            case 10:
                MatchResult matchResult5 = (MatchResult) obj2;
                Object objN3 = a10.b.n(matchResult5, "it", 1);
                Object obj5 = matchResult5.c().get(3);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(objN3);
                sb10.append(obj5);
                return sb10.toString();
            case 11:
                return (CharSequence) a10.b.n((MatchResult) obj2, "it", 2);
            case 12:
                MatchResult matchResult6 = (MatchResult) obj2;
                return a10.b.n(matchResult6, "it", 1) + "<strike>" + matchResult6.c().get(3) + "</strike>";
            case 13:
                MatchResult matchResult7 = (MatchResult) obj2;
                Object objN4 = a10.b.n(matchResult7, "it", 1);
                Object obj6 = matchResult7.c().get(3);
                StringBuilder sb11 = new StringBuilder();
                sb11.append(objN4);
                sb11.append(obj6);
                return sb11.toString();
            case 14:
                return v0.a.h(a10.b.n((MatchResult) obj2, "it", 2), "<strike>", "</strike>");
            case 15:
                return (CharSequence) a10.b.n((MatchResult) obj2, "it", 2);
            case 16:
                MatchResult matchResult8 = (MatchResult) obj2;
                int length = ((String) a10.b.n(matchResult8, "it", 1)).length() - 1;
                Object obj7 = matchResult8.c().get(2);
                StringBuilder sb12 = new StringBuilder("<h");
                sb12.append(length);
                sb12.append(">");
                sb12.append(obj7);
                sb12.append("</h");
                return j6.a.v(sb12, ">", length);
            case 17:
                return (CharSequence) a10.b.n((MatchResult) obj2, "it", 2);
            case 18:
                MatchResult it10 = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                f.a aVar = f.Companion;
                String str = (String) it10.c().get(2);
                aVar.getClass();
                return "<a href=\"" + f.a.b(str) + "\">" + it10.c().get(1) + "</a>";
            case 19:
                ConsentAccount account = (ConsentAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return account.f60371c;
            case 20:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return "ROBO_ACCOUNT_INFORMATION";
            case 21:
                String str2 = (String) obj2;
                return a10.b.t(str2, "it", "TEMPLATE_", str2);
            case 22:
                alc.b params = (alc.b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return pyd.c.g0(params);
            case 23:
                alc.c params2 = (alc.c) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                String[] elements = {"TEMPLATE_PERFORMANCE_CHART", params2.f6190a, params2.f6191b.toString(), params2.f6192c};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
            case 24:
                p params3 = (p) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return j6.a.q("TEMPLATES_", params3.a());
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new pb0("INVEST_BUY_BLOCK_LOADING_ITEM_ID");
            case 26:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return iii.c.c(5);
            case 27:
                n it13 = (n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return q.y(it13);
            case 28:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a it14 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f89925c;
            default:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a it15 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f89926g;
        }
    }
}

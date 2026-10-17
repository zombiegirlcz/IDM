package o29;

import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import efm.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f221574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f221575c;
    public final /* synthetic */ i19.f d;

    public /* synthetic */ p(u uVar, String str, i19.f fVar, int i) {
        this.f221573a = i;
        this.f221574b = uVar;
        this.f221575c = str;
        this.d = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f221573a) {
            case 0:
                g19.c homeFeed = (g19.c) obj2;
                Intrinsics.checkNotNullParameter(homeFeed, "homeFeed");
                Intrinsics.checkNotNullParameter(homeFeed, "<this>");
                List list = homeFeed.f139567b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (((j19.k) it8.next()).b() != null) {
                            u uVar = this.f221574b;
                            LifestyleHomeService lifestyleHomeService = uVar.f221584a;
                            String str = homeFeed.f139566a;
                            Intrinsics.checkNotNullParameter(homeFeed, "<this>");
                            i19.f refreshStrategyType = this.d;
                            Intrinsics.checkNotNullParameter(refreshStrategyType, "refreshStrategyType");
                            List list2 = homeFeed.f139567b;
                            ArrayList<j19.k> arrayList = new ArrayList();
                            Iterator it9 = list2.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (j19.k kVar : arrayList) {
                                        j19.a aVarA = kVar.a();
                                        g29.e eVar = aVarA != null ? new g29.e(kVar.getId(), aVarA) : null;
                                        if (eVar != null) {
                                            arrayList2.add(eVar);
                                        }
                                    }
                                    g29.f fVar = new g29.f(arrayList2);
                                    String str2 = this.f221575c;
                                    d0<i19.c> d0VarRefreshHomeContent = lifestyleHomeService.refreshHomeContent(str2, str, fVar);
                                    o28.g gVar = new o28.g(new neg.q(uVar, 18, str2, homeFeed), 9);
                                    d0VarRefreshHomeContent.getClass();
                                    ufm.i iVar = new ufm.i(d0VarRefreshHomeContent, gVar, 0);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                    break;
                                } else {
                                    Object next = it9.next();
                                    i19.g gVarB = ((j19.k) next).b();
                                    if ((gVarB != null ? gVarB.f157597a : null) == refreshStrategyType) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                f19.g suggestedForYou = (f19.g) obj2;
                Intrinsics.checkNotNullParameter(suggestedForYou, "suggestedForYou");
                if (d8l.d.o(suggestedForYou)) {
                    u uVar2 = this.f221574b;
                    LifestyleHomeService lifestyleHomeService2 = uVar2.f221584a;
                    String str3 = suggestedForYou.f131191a;
                    g29.f fVarK = d8l.d.K(suggestedForYou, this.d);
                    String str4 = this.f221575c;
                    d0<i19.c> d0VarRefreshHomeContent2 = lifestyleHomeService2.refreshHomeContent(str4, str3, fVarK);
                    o28.g gVar2 = new o28.g(new q(uVar2, str4, suggestedForYou, 1), 10);
                    d0VarRefreshHomeContent2.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarRefreshHomeContent2, gVar2, 0);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                }
                break;
            default:
                f19.g homeHeader = (f19.g) obj2;
                Intrinsics.checkNotNullParameter(homeHeader, "homeHeader");
                if (d8l.d.o(homeHeader)) {
                    u uVar3 = this.f221574b;
                    LifestyleHomeService lifestyleHomeService3 = uVar3.f221584a;
                    String str5 = homeHeader.f131191a;
                    g29.f fVarK2 = d8l.d.K(homeHeader, this.d);
                    String str6 = this.f221575c;
                    d0<i19.c> d0VarRefreshHomeContent3 = lifestyleHomeService3.refreshHomeContent(str6, str5, fVarK2);
                    o28.g gVar3 = new o28.g(new q(uVar3, str6, homeHeader, 0), 8);
                    d0VarRefreshHomeContent3.getClass();
                    ufm.i iVar3 = new ufm.i(d0VarRefreshHomeContent3, gVar3, 0);
                    Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                }
                break;
        }
        return d0.m(Boolean.FALSE);
    }
}

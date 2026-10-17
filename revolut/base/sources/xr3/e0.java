package xr3;

import com.revolut.feature.credit.application.impl.repositories.CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V1$storageCacheType$1;
import com.revolut.feature.credit.application.impl.repositories.CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V2$storageCacheType$1;
import dx4.a1;
import dx4.y0;
import ft3.d1;
import ft3.g1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f308211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308211w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f308211w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            default:
                e0 e0Var2 = new e0(this.f308211w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((b0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((c0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        fs3.f fVar;
        a1 a1VarA;
        a1 a1VarA2;
        ?? arrayList2;
        a1 a1VarA3;
        int i = this.u;
        f0 f0Var = this.f308211w;
        switch (i) {
            case 0:
                b0 b0Var = (b0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar = f0Var.f308216c;
                b0Var.getClass();
                Type type = new CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V1$storageCacheType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                List<tr3.f> list = (List) cVar.T2("PRIMARY_ENTRY_POINTS_KEY", type);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (tr3.f fVar2 : list) {
                    Intrinsics.checkNotNullParameter(fVar2, "<this>");
                    d1 d1VarG = g1.g(fVar2.getProductType(), fVar2.getProductSubtype(), null);
                    if (d1VarG == null) {
                        fVar = null;
                    } else {
                        String title = fVar2.getTitle();
                        String subtitle = fVar2.getSubtitle();
                        List tags = fVar2.getTags();
                        if (tags != null) {
                            List<tr3.d> list2 = tags;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            for (tr3.d dVar : list2) {
                                Intrinsics.checkNotNullParameter(dVar, "<this>");
                                String icon = dVar.getIcon();
                                if (icon != null) {
                                    a1.Companion.getClass();
                                    a1VarA = y0.a(icon);
                                } else {
                                    a1VarA = null;
                                }
                                arrayList.add(new fs3.d(a1VarA, dVar.getText()));
                            }
                        } else {
                            arrayList = zhm.f0.f322471a;
                        }
                        fVar = new fs3.f(d1VarG, title, subtitle, arrayList);
                    }
                    if (fVar != null) {
                        arrayList3.add(fVar);
                    }
                }
                return arrayList3;
            default:
                c0 c0Var = (c0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar2 = f0Var.f308216c;
                String str = c0Var.f308207b;
                Type type2 = new CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V2$storageCacheType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                List<tr3.g> list3 = (List) cVar2.T2(str, type2);
                if (list3 == null) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (tr3.g gVar : list3) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    fs3.b type3 = gVar.getType();
                    String title2 = gVar.getTitle();
                    String subtitle2 = gVar.getSubtitle();
                    String icon2 = gVar.getIcon();
                    if (icon2 != null) {
                        a1.Companion.getClass();
                        a1VarA2 = y0.a(icon2);
                    } else {
                        a1VarA2 = null;
                    }
                    String tutorialCampaign = gVar.getTutorialCampaign();
                    List tags2 = gVar.getTags();
                    if (tags2 != null) {
                        List<tr3.d> list4 = tags2;
                        arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (tr3.d dVar2 : list4) {
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            String icon3 = dVar2.getIcon();
                            if (icon3 != null) {
                                a1.Companion.getClass();
                                a1VarA3 = y0.a(icon3);
                            } else {
                                a1VarA3 = null;
                            }
                            arrayList2.add(new fs3.d(a1VarA3, dVar2.getText()));
                        }
                    } else {
                        arrayList2 = zhm.f0.f322471a;
                    }
                    arrayList4.add(new fs3.i(type3, title2, subtitle2, a1VarA2, tutorialCampaign, arrayList2));
                }
                return arrayList4;
        }
    }
}

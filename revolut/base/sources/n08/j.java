package n08;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import f08.b;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f210902b;

    public /* synthetic */ j(c0 c0Var, int i) {
        this.f210901a = i;
        this.f210902b = c0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n08.j.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        c0 c0Var = this.f210902b;
        g08.p pVar = c0Var.f210891p;
        CellDetailsActionDelegate.Model cell = (CellDetailsActionDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(cell, "cell");
        String str = cell.f51781a;
        int iHashCode = str.hashCode();
        if (iHashCode != -2025428043) {
            if (iHashCode != 1048204490) {
                if (iHashCode == 1385627855 && str.equals("POLICY_NUMBER_CELL_ID")) {
                    u08.a aVar = c0Var.f210897x;
                    Object obj3 = cell.f51787l;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                    return aVar.a((String) obj3);
                }
            } else if (str.equals("POLICY_UNTIL_CELL_ID")) {
                return c0Var.S(new rp0.y(pVar.a(), new rp0.t(new TextLocalisedClause(R$string.pets_policy_detail_cells_covered_until_details_name, null, null, 14), new TextLocalisedClause(R$string.pets_policy_detail_cells_covered_until_details_value_no_args, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "DEFAULT_LEGACY_DIALOG_DELEGATES_KEY", null, null, null, 3832));
            }
        } else if (str.equals("POLICY_PRICE_CELL_ID")) {
            return c0Var.S(new rp0.y(pVar.a(), new rp0.t(new TextLocalisedClause(R$string.pets_policy_detail_cells_vet_fee_coverage_details_name, null, null, 14), new TextLocalisedClause(R$string.pets_policy_detail_cells_vet_fee_coverage_details_value, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "DEFAULT_LEGACY_DIALOG_DELEGATES_KEY", null, null, null, 3832));
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    private final Object c(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        d dVar = (d) pair.f186386b;
        c0 c0Var = this.f210902b;
        f08.a aVar = c0Var.f210889m;
        int i = m.f210906a[dVar.ordinal()];
        if (i == 1) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            efm.b bVarC0 = c0Var.v.c0(b.C0768b.f131006a);
            d mode = d.DEFAULT;
            f08.h hVar = (f08.h) aVar;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(mode, "mode");
            return bVarC0.e(te0.w.z0(((f08.k) hVar.f131015h).z0(), mode));
        }
        pfm.h hVarR = c0Var.R();
        d mode2 = d.DEFAULT;
        f08.h hVar2 = (f08.h) aVar;
        hVar2.getClass();
        Intrinsics.checkNotNullParameter(mode2, "mode");
        pfm.a aVarE = hVarR.e(te0.w.z0(((f08.k) hVar2.f131015h).z0(), mode2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    private final Object d(Object obj2) {
        g picture;
        e eVar = (e) ((Pair) obj2).f186385a;
        f08.a aVar = this.f210902b.f210889m;
        zw7.d0 d0Var = eVar.f210899a;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        if (d0Var.f325766c == null || (picture = g.CUSTOM) == null) {
            picture = g.DEFAULT;
        }
        f08.h hVar = (f08.h) aVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(picture, "picture");
        f08.k kVar = (f08.k) hVar.f131015h;
        kVar.e.getValue(kVar, f08.k.f131021g[3]).set(picture);
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        mm.d dVar = this.f210902b.v;
        um0 model = (um0) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f166695a;
        boolean zF = Intrinsics.f(str, "ID_CONFIRM_CANCELLATION");
        b.a aVar = b.a.f131005a;
        if (zF) {
            pfm.a aVarE = dVar.c0(aVar).e(dVar.c0(b.c.f131007a));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            return aVarE;
        }
        if (Intrinsics.f(str, "ID_CANCEL_CANCELLATION")) {
            return dVar.c0(aVar);
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0c89, code lost:
    
        if (r4.equals("REMOVE_PROFILE_ACTION_ID") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0cc5, code lost:
    
        if (r4.equals("REMOVE_INCOMPLETE_PROFILE_BANNER_ACTION_ID") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0cd8, code lost:
    
        return r0.v.c0(f08.b.C0768b.f131006a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0d39, code lost:
    
        if (r4.equals("INFO_DIALOG_LARGE_BUTTON_LIST_ID") == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0d42, code lost:
    
        if (r4.equals("COVERAGE_INFO_LARGE_BUTTON_LISTT_ID") == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:?, code lost:
    
        return ((opi.b) r0.f210895t).O();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e1  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 3626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n08.j.invoke(java.lang.Object):java.lang.Object");
    }
}

package q92;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit.core.R$string;
import com.revolut.retail.feature.features.api.exception.JuniorAccountFeatureDisabledException;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pwa.m;
import ybl.h;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243638a;

    public /* synthetic */ f(int i) {
        this.f243638a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f243638a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new b((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 1:
                Throwable th10 = (Throwable) obj2;
                if (((Boolean) obj3) == null) {
                    return th10;
                }
                return null;
            case 2:
                Throwable error = (Throwable) obj2;
                AdditionalCardholdersState additionalCardholdersState = (AdditionalCardholdersState) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (additionalCardholdersState == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pair == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                o35.c cVar = (o35.c) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (cVar == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar == null) {
                    return error5;
                }
                return null;
            case 7:
                Throwable error6 = (Throwable) obj2;
                g05.d dVar = (g05.d) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dVar == null) {
                    return error6;
                }
                return null;
            case 8:
                Throwable error7 = (Throwable) obj2;
                pd5.d dVar2 = (pd5.d) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (dVar2 == null) {
                    return error7;
                }
                return null;
            case 9:
                Throwable error8 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool2 == null) {
                    return error8;
                }
                return null;
            case 10:
                Throwable error9 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool3 == null) {
                    return error9;
                }
                return null;
            case 11:
                Throwable error10 = (Throwable) obj2;
                l71.d dVar3 = (l71.d) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (dVar3 == null) {
                    return error10;
                }
                return null;
            case 12:
                Throwable error11 = (Throwable) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (pair2 == null) {
                    return error11;
                }
                return null;
            case 13:
                Throwable error12 = (Throwable) obj2;
                lf8.c cVar2 = (lf8.c) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (cVar2 != null || (error12 instanceof JuniorAccountFeatureDisabledException)) {
                    return null;
                }
                return error12;
            case 14:
                Throwable error13 = (Throwable) obj2;
                o35.c cVar3 = (o35.c) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (cVar3 == null) {
                    return error13;
                }
                return null;
            case 15:
                Throwable error14 = (Throwable) obj2;
                Boolean bool4 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (bool4 == null) {
                    return error14;
                }
                return null;
            case 16:
                Throwable error15 = (Throwable) obj2;
                Boolean bool5 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (bool5 == null) {
                    return error15;
                }
                return null;
            case 17:
                Throwable error16 = (Throwable) obj2;
                Boolean bool6 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (bool6 == null) {
                    return error16;
                }
                return null;
            case 18:
                Throwable error17 = (Throwable) obj2;
                Boolean bool7 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error17, "error");
                if (bool7 == null) {
                    return error17;
                }
                return null;
            case 19:
                Throwable error18 = (Throwable) obj2;
                wi0.b bVar = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(error18, "error");
                if (bVar == null) {
                    return error18;
                }
                return null;
            case 20:
                Boolean isAvailable = (Boolean) obj2;
                wi0.b countryCode = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(isAvailable, "isAvailable");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                if (!isAvailable.booleanValue()) {
                    return f0.f322471a;
                }
                p97.a aVarA = t97.c.a(t97.d.REFINANCING_MORTGAGE);
                wi0.b.Companion.getClass();
                return u.c(p97.a.a(aVarA, 0, Intrinsics.f(countryCode, wi0.b.f297781v1) ? new TextLocalisedClause(R$string.credit_get_credit_refinancing_mortgage_title_lt, null, null, 14) : new TextLocalisedClause(R$string.credit_get_credit_refinancing_mortgage_title, null, null, 14), null, null, null, null, 123));
            case 21:
                Throwable error19 = (Throwable) obj2;
                g95.c cVar4 = (g95.c) obj3;
                Intrinsics.checkNotNullParameter(error19, "error");
                if (cVar4 == null) {
                    return error19;
                }
                return null;
            case 22:
                Throwable error20 = (Throwable) obj2;
                i iVar2 = (i) obj3;
                Intrinsics.checkNotNullParameter(error20, "error");
                if (iVar2 != null) {
                    return error20;
                }
                return null;
            case 23:
                Throwable error21 = (Throwable) obj2;
                Boolean bool8 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error21, "error");
                if (bool8 == null) {
                    return error21;
                }
                return null;
            case 24:
                Throwable error22 = (Throwable) obj2;
                Boolean bool9 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error22, "error");
                if (bool9 == null) {
                    return error22;
                }
                return null;
            case 25:
                Throwable error23 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error23, "error");
                if (list == null) {
                    return error23;
                }
                return null;
            case 26:
                Throwable error24 = (Throwable) obj2;
                i iVar3 = (i) obj3;
                Intrinsics.checkNotNullParameter(error24, "error");
                if (iVar3 == null) {
                    return error24;
                }
                return null;
            case 27:
                Throwable error25 = (Throwable) obj2;
                m mVar = (m) obj3;
                Intrinsics.checkNotNullParameter(error25, "error");
                if (mVar == null) {
                    return error25;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                ((Boolean) obj2).booleanValue();
                f0 f0Var = f0.f322471a;
                return new h(f0Var, f0Var);
        }
    }
}

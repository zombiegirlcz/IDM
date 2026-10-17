package nd;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.ActionSelectedCondition;
import com.revolut.feature.backend_flow.domain.models.BooleanCondition;
import com.revolut.feature.backend_flow.domain.models.Condition;
import com.revolut.feature.backend_flow.domain.models.MoneyRangeCondition;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.Transition;
import com.revolut.feature.backend_flow.domain.models.UnsupportedCondition;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ChooserActivityDestination;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.wealth.resources.R$string;
import dej.h0;
import dej.t1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Provider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import q90.h4;
import q90.j4;
import q90.n2;
import q90.o3;
import q90.q0;
import ulm.x1;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements q, r8.h, zzu, kfm.o, x1, vh.d {
    public o(t90.i conditionsMapper, v90.h statusDialogScreenMapper) {
        Intrinsics.checkNotNullParameter(conditionsMapper, "conditionsMapper");
        Intrinsics.checkNotNullParameter(statusDialogScreenMapper, "statusDialogScreenMapper");
    }

    public static String g(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    public static ActivityNavigateCommand h(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.DIAL", null, null, null, Uri.parse("tel:" + a0.D(phone, "[^\\d.]", "", false)), 14), null, null, null, 0, null, null, null, null, false, 1022);
    }

    public static ActivityNavigateCommand i(String title, String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ActivityNavigateCommand(new ChooserActivityDestination("android.intent.action.SEND", null, title, 12), null, r0.k(new Pair("android.intent.extra.TEXT", message), new Pair("android.intent.extra.SUBJECT", title)), null, 0, null, null, null, null, false, 1018);
    }

    @Override // nd.q
    public Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        return s6e.o.f260302a.invoke(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // vh.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yh.b b(java.lang.String r21, vh.a r22, int r23, int r24, aim.f r25) {
        /*
            Method dump skipped, instruction units count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.o.b(java.lang.String, vh.a, int, int, aim.f):yh.b");
    }

    @Override // r8.h
    public void c(r8.j jVar) {
    }

    @Override // r8.h
    public void d(r8.j jVar) {
        jVar.onStart();
    }

    public BigDecimal e(BigDecimal max, BigDecimal min) {
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(min, "min");
        BigDecimal bigDecimalSubtract = max.subtract(min);
        BigDecimal ZERO = BigDecimal.ZERO;
        if (Intrinsics.f(bigDecimalSubtract, ZERO)) {
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal value = bigDecimalSubtract.divide(bigDecimalValueOf, 16, RoundingMode.HALF_UP);
        Intrinsics.h(value);
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.equals(ZERO)) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        double dDoubleValue = value.doubleValue();
        Double dValueOf = Math.abs(dDoubleValue) <= Double.MAX_VALUE ? Double.valueOf(dDoubleValue) : null;
        if (dValueOf == null) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        double dDoubleValue2 = dValueOf.doubleValue();
        double dFloor = Math.floor(Math.log10(dDoubleValue2));
        double dPow = dDoubleValue2 / Math.pow(10.0d, dFloor);
        return new BigDecimal(String.valueOf(Math.pow(10.0d, dFloor) * (dPow < 1.5d ? 1.0d : dPow < 3.0d ? 2.0d : dPow < 7.0d ? 5.0d : 10.0d)));
    }

    public Clause f(soh.i value, zph.k position) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(position, "position");
        int iScale = value.f264839a.scale();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(position, "position");
        int i2 = zph.n.f324310b[value.f264841c.ordinal()];
        if (i2 == 1) {
            return zph.m.a(value, iScale);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = zph.n.f324309a[position.ordinal()];
        if (i3 == 1) {
            i = R$string.screener_section_value_min_opened;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.screener_section_value_max_opened;
        }
        return new TextLocalisedClause(i, zhm.u.c(zph.m.a(value, iScale)), null, 12);
    }

    public AnalyticsContext j(t1 subscription, List installationStates) {
        Object next;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : installationStates) {
            if (obj2 instanceof h0) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h0) next).f113546a.f100423a, subscription.e.f100440a)) {
                break;
            }
        }
        h0 h0Var = (h0) next;
        if (h0Var != null) {
            return new AnalyticsContext(vnj.a.a(h0Var.f113546a));
        }
        return null;
    }

    public Transition k(h4 transition) {
        Parcelable unsupportedCondition;
        Intrinsics.checkNotNullParameter(transition, "transition");
        List listB = transition.getConditions();
        if (listB == null) {
            listB = f0.f322471a;
        }
        List<q0> list = listB;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (q0 condition : list) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            if (condition instanceof q90.a0) {
                q90.a0 a0Var = (q90.a0) condition;
                unsupportedCondition = new BooleanCondition(a0Var.getItemId(), a0Var.getValue());
            } else if (condition instanceof n2) {
                n2 n2Var = (n2) condition;
                String strD = n2Var.getItemId();
                long jA = n2Var.getAmountFrom();
                long jB = n2Var.getAmountTo();
                List listC = n2Var.getCurrencies();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listC, 10));
                Iterator it8 = listC.iterator();
                while (it8.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it8.next(), arrayList2);
                }
                unsupportedCondition = new MoneyRangeCondition(jA, jB, strD, arrayList2);
            } else if (condition instanceof q90.b) {
                unsupportedCondition = new ActionSelectedCondition(((q90.b) condition).getItemId());
            } else {
                if (!(condition instanceof j4)) {
                    throw new NoWhenBranchMatchedException();
                }
                unsupportedCondition = new UnsupportedCondition(((j4) condition).f243379a);
            }
            arrayList.add(unsupportedCondition);
        }
        String strE = transition.getId();
        String strA = transition.getConditionStrategy();
        Map mapD = transition.getExternalView();
        o3 o3VarC = transition.getEndDialog();
        return new Transition(arrayList, strE, strA, mapD, o3VarC != null ? v90.h.c(o3VarC) : null);
    }

    public gef.b l(lef.c dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        LocalDateTime localDateTimeY = oi0.d.Y(dto.getCreatedSince());
        boolean zB = dto.getLast();
        List listC = dto.getTransactions();
        ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            arrayList.add(oef.a.a((lef.e) it8.next()));
        }
        return new gef.b(localDateTimeY, zB, arrayList);
    }

    public h4 m(Transition transition) {
        q0 j4Var;
        Intrinsics.checkNotNullParameter(transition, "transition");
        String str = transition.f63709b;
        ArrayList<Condition> arrayList = transition.f63708a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (Condition condition : arrayList) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            if (condition instanceof BooleanCondition) {
                BooleanCondition booleanCondition = (BooleanCondition) condition;
                j4Var = new q90.a0(booleanCondition.f63321a, booleanCondition.f63322b);
            } else if (condition instanceof MoneyRangeCondition) {
                MoneyRangeCondition moneyRangeCondition = (MoneyRangeCondition) condition;
                String str2 = moneyRangeCondition.f63535a;
                long j2 = moneyRangeCondition.f63536b;
                long j3 = moneyRangeCondition.f63537c;
                ArrayList arrayList3 = moneyRangeCondition.d;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((xi0.b) it8.next()).f306286a);
                }
                j4Var = new n2(j2, j3, str2, arrayList4);
            } else if (condition instanceof ActionSelectedCondition) {
                j4Var = new q90.b(((ActionSelectedCondition) condition).f63232a);
            } else {
                if (!(condition instanceof UnsupportedCondition)) {
                    throw new NoWhenBranchMatchedException();
                }
                j4Var = new j4(((UnsupportedCondition) condition).f63717a);
            }
            arrayList2.add(j4Var);
        }
        String str3 = transition.f63710c;
        Map map = transition.d;
        StatusDialogScreen statusDialogScreen = transition.e;
        return new h4(arrayList2, str, str3, map, statusDialogScreen != null ? v90.h.d(statusDialogScreen) : null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj2) {
        return ((com.google.mlkit.vision.text.a) obj2).j();
    }

    public o(vnj.a esimAnalyticsContextBuilder) {
        Intrinsics.checkNotNullParameter(esimAnalyticsContextBuilder, "esimAnalyticsContextBuilder");
    }

    public o(mil.a extensionProvider, mil.a mapperProvider) {
        Intrinsics.checkNotNullParameter(extensionProvider, "extensionProvider");
        Intrinsics.checkNotNullParameter(mapperProvider, "mapperProvider");
    }

    public o(ejk.b pricingPlanFooterTextBuilder) {
        Intrinsics.checkNotNullParameter(pricingPlanFooterTextBuilder, "pricingPlanFooterTextBuilder");
    }

    public o(rwk.d niceNumberCalculator) {
        Intrinsics.checkNotNullParameter(niceNumberCalculator, "niceNumberCalculator");
    }

    public o() {
    }

    public o(sqi.a imagePickerUtils, zk0.b fileSystemRepository, Context context) {
        Intrinsics.checkNotNullParameter(imagePickerUtils, "imagePickerUtils");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public o(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
    }

    public o(n rangeLabelMapper, zph.m clauseMapper) {
        Intrinsics.checkNotNullParameter(rangeLabelMapper, "rangeLabelMapper");
        Intrinsics.checkNotNullParameter(clauseMapper, "clauseMapper");
    }
}

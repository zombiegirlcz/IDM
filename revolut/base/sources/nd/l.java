package nd;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.IBinder;
import android.os.IInterface;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.Intrinsics;
import zc.b0;
import zda.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements q, n7a.a, b0, ce.f, kotlin.coroutines.f {
    public /* synthetic */ l() {
    }

    public static void b(x2m.f fVar, ArrayList arrayList) {
        Integer numA = vc.o.a(fVar.a());
        Integer numA2 = vc.o.a(fVar.c());
        if (numA != null) {
            int iIntValue = numA.intValue();
            if (!arrayList.isEmpty()) {
                Context context = ((Button) arrayList.get(0)).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iIntValue, ContextCompat.getColor(context, com.revolut.revolut.feature_fourthline_impl.R.color.tdcoreekyc__grey300)});
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    ((Button) it8.next()).setBackgroundTintList(colorStateList);
                }
            }
        }
        if (numA2 != null) {
            int iIntValue2 = numA2.intValue();
            if (arrayList.isEmpty()) {
                return;
            }
            Context context2 = ((Button) arrayList.get(0)).getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iIntValue2, ContextCompat.getColor(context2, com.revolut.revolut.feature_fourthline_impl.R.color.tdcoreekyc__white)});
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                ((Button) it9.next()).setTextColor(colorStateList2);
            }
        }
    }

    public static TextLocalisedClause d(BigDecimal bigDecimal, int i, int i2, int i3) {
        int iD = xqi.a.d(bigDecimal, true, RoundingMode.HALF_EVEN);
        if (iD > 0) {
            i = i3;
        } else if (iD >= 0) {
            i = i2;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    @Override // nd.q
    public Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // zc.b0
    public Object c(IBinder iBinder) {
        int i = zc.s.f320996b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof zc.t ? (zc.t) iInterfaceQueryLocalInterface : new zc.r(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    public mda.c e(a0 currencyAccountInfoEntity) {
        Intrinsics.checkNotNullParameter(currencyAccountInfoEntity, "currencyAccountInfoEntity");
        zda.o oVar = currencyAccountInfoEntity.f321359c;
        String str = currencyAccountInfoEntity.f321358b;
        String str2 = currencyAccountInfoEntity.f321357a;
        if (oVar != null) {
            xi0.b.Companion.getClass();
            xi0.b bVarA = xi0.a.a(str2);
            wi0.b.Companion.getClass();
            return new mda.b(bVarA, wi0.a.a(str), uda.a.b(currencyAccountInfoEntity.f321359c));
        }
        xi0.b.Companion.getClass();
        xi0.b bVarA2 = xi0.a.a(str2);
        wi0.b.Companion.getClass();
        return new mda.a(wi0.a.a(str), bVarA2);
    }

    @Override // ce.f
    public Object m(ce.v vVar) {
        return new rh.g((rh.h) vVar.a(rh.h.class), (ch.d) vVar.a(ch.d.class));
    }

    public l(xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
    }

    public l(pxb.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
    }

    public l(t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
    }

    public l(vz9.m moneyActionBarFirstSmallButtonIconMapper) {
        Intrinsics.checkNotNullParameter(moneyActionBarFirstSmallButtonIconMapper, "moneyActionBarFirstSmallButtonIconMapper");
    }

    public l(y1j.c savingsBalanceWrapperToLegalProductAccountTypeMapper) {
        Intrinsics.checkNotNullParameter(savingsBalanceWrapperToLegalProductAccountTypeMapper, "savingsBalanceWrapperToLegalProductAccountTypeMapper");
    }

    public l(xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
    }

    public l(q4j.c nameElementsUtils, n4j.c utils) {
        Intrinsics.checkNotNullParameter(nameElementsUtils, "nameElementsUtils");
        Intrinsics.checkNotNullParameter(utils, "utils");
    }

    public l(uda.a pocketMapper) {
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
    }

    public l(vq2.a interactor, wq2.a mapper, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }
}

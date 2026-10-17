package h1a;

import android.content.Context;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillFeatureConfig;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import tof.a3;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements uri.a {
    public static void d(m mVar, SplitBillFeatureConfig.ChooseBills chooseBills) {
        SplitBillsFeatureConfig.Companion companion = SplitBillsFeatureConfig.INSTANCE;
        List list = chooseBills != null ? chooseBills.f79821a : null;
        if (list == null) {
            list = f0.f322471a;
        }
        x0a.a aVar = chooseBills != null ? chooseBills.f79822b : null;
        companion.getClass();
        mVar.c(new FeatureCommand(SplitBillsFeatureConfig.Companion.a(list, aVar)));
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof SplitBillFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        List listC;
        SplitBillFeatureConfig config = (SplitBillFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof SplitBillFeatureConfig.ChooseBills) {
            d(navigator, (SplitBillFeatureConfig.ChooseBills) config);
            return;
        }
        if (config instanceof SplitBillFeatureConfig.ChooseBillsEmpty) {
            d(navigator, null);
            return;
        }
        if (!(config instanceof SplitBillFeatureConfig.ChooseContacts)) {
            throw new NoWhenBranchMatchedException();
        }
        SplitBillFeatureConfig.ChooseContacts chooseContacts = (SplitBillFeatureConfig.ChooseContacts) config;
        a3 a3Var = chooseContacts.e;
        if (a3Var == null || (listC = u.c(new BillType.TransactionBill(a3Var))) == null) {
            listC = f0.f322471a;
        }
        List list = listC;
        navigator.c(new FeatureCommand(new SplitBillsFeatureConfig(list.isEmpty() ? SplitBillConfiguration.Empty.f79815a : new SplitBillConfiguration.WithBills(list, chooseContacts.d, chooseContacts.f79824a, chooseContacts.f79825b, chooseContacts.f), null)));
    }
}

package com.revolut.feature.security_hub.impl.repository;

import auc.n;
import auc.o;
import auc.p;
import com.revolut.feature.security_hub.impl.interactor.FeatureItem;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.ReadOnlyDialog;
import cuc.e;
import cuc.f;
import cuc.g;
import cuc.h;
import dj0.d;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static ArrayList a(List dtoList) {
        h hVar;
        LimitValue amount;
        LimitValue amount2;
        ArrayList arrayList;
        LimitValue limitValue;
        ArrayList arrayList2;
        OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown;
        int i;
        ReadOnlyDialog readOnlyDialog;
        Iterator it8;
        h hVar2;
        LimitValue amount3;
        Intrinsics.checkNotNullParameter(dtoList, "dtoList");
        List list = dtoList;
        int i2 = 10;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            n nVar = (n) it9.next();
            String type = nVar.getType();
            h[] hVarArrValues = h.values();
            int length = hVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i3];
                if (a0.z(hVar.name(), type, true)) {
                    break;
                }
                i3++;
            }
            if (hVar == null) {
                hVar = h.UNKNOWN;
            }
            Long max = nVar.getMax();
            long jLongValue = max != null ? max.longValue() : 0L;
            Long used = nVar.getUsed();
            long jLongValue2 = used != null ? used.longValue() : 0L;
            f fVarValueOf = f.valueOf(nVar.getStatus());
            h hVar3 = h.COUNT;
            if (hVar == hVar3) {
                amount = new LimitValue.Counter(jLongValue);
            } else {
                xi0.a aVar = xi0.b.Companion;
                String currency = nVar.getCurrency();
                if (currency == null) {
                    throw new IllegalArgumentException(("Currency required for " + hVar + " limit").toString());
                }
                aVar.getClass();
                amount = new LimitValue.Amount(new d(jLongValue, xi0.a.a(currency)));
            }
            if (hVar == hVar3) {
                amount2 = new LimitValue.Counter(jLongValue2);
            } else {
                xi0.a aVar2 = xi0.b.Companion;
                String currency2 = nVar.getCurrency();
                if (currency2 == null) {
                    throw new IllegalArgumentException(("Currency required for " + hVar + " limit").toString());
                }
                aVar2.getClass();
                amount2 = new LimitValue.Amount(new d(jLongValue2, xi0.a.a(currency2)));
            }
            LimitValue limitValue2 = amount2;
            String timeOfDay = nVar.getTimeOfDay();
            g gVarValueOf = timeOfDay != null ? g.valueOf(timeOfDay) : null;
            String name = nVar.getName();
            String label = nVar.getLabel();
            String description = nVar.getDescription();
            String icon = nVar.getIcon();
            e eVarValueOf = e.valueOf(nVar.getCategory());
            List applyingTo = nVar.getApplyingTo();
            if (applyingTo != null) {
                List<auc.a> list2 = applyingTo;
                ArrayList arrayList4 = new ArrayList(w.t(list2, i2));
                for (auc.a aVar3 : list2) {
                    arrayList4.add(new FeatureItem(aVar3.getIcon(), aVar3.getText()));
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            Long maxPossibleValue = nVar.getMaxPossibleValue();
            if (maxPossibleValue != null) {
                long jLongValue3 = maxPossibleValue.longValue();
                if (hVar == h.COUNT) {
                    amount3 = new LimitValue.Counter(jLongValue3);
                } else {
                    xi0.a aVar4 = xi0.b.Companion;
                    String currency3 = nVar.getCurrency();
                    if (currency3 == null) {
                        throw new IllegalArgumentException("Currency required for maxPossibleValue");
                    }
                    aVar4.getClass();
                    amount3 = new LimitValue.Amount(new d(jLongValue3, xi0.a.a(currency3)));
                }
                limitValue = amount3;
            } else {
                limitValue = null;
            }
            Integer activationMinDelayHours = nVar.getActivationMinDelayHours();
            Integer activationMaxDelayHours = nVar.getActivationMaxDelayHours();
            boolean zF = Intrinsics.f(nVar.getRemoveAllowed(), Boolean.TRUE);
            List<o> groupConfig = nVar.getGroupConfig();
            if (groupConfig != null) {
                ArrayList arrayList5 = new ArrayList();
                for (o oVar : groupConfig) {
                    String type2 = oVar.getType();
                    h[] hVarArrValues2 = h.values();
                    int length2 = hVarArrValues2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            it8 = it9;
                            hVar2 = null;
                            break;
                        }
                        h hVar4 = hVarArrValues2[i5];
                        it8 = it9;
                        if (a0.z(hVar4.name(), type2, true)) {
                            hVar2 = hVar4;
                            break;
                        }
                        i5++;
                        it9 = it8;
                    }
                    OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = hVar2 != null ? new OutboundTransactionLimitGroupConfig(oVar.getName(), hVar2, oVar.getLabel(), oVar.getIcon()) : null;
                    if (outboundTransactionLimitGroupConfig != null) {
                        arrayList5.add(outboundTransactionLimitGroupConfig);
                    }
                    it9 = it8;
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            Iterator it10 = it9;
            auc.f deviceCooldown = nVar.getDeviceCooldown();
            if (deviceCooldown != null) {
                Duration duration = Duration.parse(deviceCooldown.getPeriod());
                Intrinsics.checkNotNullExpressionValue(duration, "parse(...)");
                outboundTransactionLimitDeviceCooldown = new OutboundTransactionLimitDeviceCooldown(duration, oi0.d.Y(deviceCooldown.getFinishAt()));
            } else {
                outboundTransactionLimitDeviceCooldown = null;
            }
            Boolean jointAccount = nVar.getJointAccount();
            Boolean readOnly = nVar.getReadOnly();
            boolean zBooleanValue = readOnly != null ? readOnly.booleanValue() : false;
            String editDeeplink = nVar.getEditDeeplink();
            p readOnlyDialog2 = nVar.getReadOnlyDialog();
            if (readOnlyDialog2 != null) {
                String title = readOnlyDialog2.getTitle();
                String subtitle = readOnlyDialog2.getSubtitle();
                List<p.b> items = readOnlyDialog2.getItems();
                i = 10;
                ArrayList arrayList6 = new ArrayList(w.t(items, 10));
                for (p.b bVar : items) {
                    arrayList6.add(new ReadOnlyDialog.Item(bVar.getIcon(), bVar.getTitle(), bVar.getSubtitle()));
                }
                p.a button = readOnlyDialog2.getButton();
                readOnlyDialog = new ReadOnlyDialog(title, subtitle, arrayList6, button != null ? new ReadOnlyDialog.Button(button.getTitle(), button.getDeeplink()) : null);
            } else {
                i = 10;
                readOnlyDialog = null;
            }
            arrayList3.add(new OutboundTransactionLimit(fVarValueOf, amount, limitValue2, gVarValueOf, name, label, description, icon, hVar, eVarValueOf, arrayList, limitValue, activationMinDelayHours, activationMaxDelayHours, zF, arrayList2, outboundTransactionLimitDeviceCooldown, jointAccount, readOnlyDialog, zBooleanValue, editDeeplink));
            i2 = i;
            it9 = it10;
        }
        return arrayList3;
    }
}

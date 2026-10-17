package jo4;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelTextStyle;
import io4.f;
import io4.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import tl4.c;
import tl4.d;
import tl4.e;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r1v12, types: [yhm.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    public static final CreditCardCellModel a(f fVar) throws Throwable {
        CreditCardDialogModel creditCardDialogModelA;
        Object objA;
        d dVar;
        d dVar2;
        CreditCardCellModel.Accessory actionAccessory;
        Object objA2;
        c cVar;
        c cVar2;
        Object objA3;
        e eVar;
        e eVar2;
        Object objA4;
        d dVar3;
        d dVar4;
        CreditCardDialogModel creditCardDialogModel;
        ?? A;
        Object objA5;
        e eVar3;
        e eVar4;
        Object objA6;
        tl4.f fVar2;
        tl4.f fVar3;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String id10 = fVar.getId();
        String label = fVar.getLabel();
        io4.e accessory = fVar.getAccessory();
        if (accessory instanceof io4.d) {
            io4.d dVar5 = (io4.d) accessory;
            String topValue = dVar5.getTopValue();
            String topValueTextStyle = dVar5.getTopValueTextStyle();
            if (topValueTextStyle != null) {
                try {
                    m.Companion companion = m.INSTANCE;
                    e[] eVarArrValues = e.values();
                    int length = eVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            eVar4 = null;
                            break;
                        }
                        e eVar5 = eVarArrValues[i];
                        if (a0.z(eVar5.name(), topValueTextStyle, true)) {
                            eVar4 = eVar5;
                            break;
                        }
                        i++;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA5 = o.a(th10);
                }
                if (eVar4 == null) {
                    throw new IllegalStateException("Unsupported enum value: " + topValueTextStyle + " for " + o0.f186429a.b(e.class).m());
                }
                objA5 = eVar4;
                Throwable thA = m.a(objA5);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                boolean z = objA5 instanceof n;
                Object obj2 = objA5;
                if (z) {
                    obj2 = null;
                }
                eVar3 = (e) ((Enum) obj2);
            } else {
                eVar3 = null;
            }
            CreditCardModelTextStyle creditCardModelTextStyle = new CreditCardModelTextStyle(null, eVar3);
            String bottomValue = dVar5.getBottomValue();
            String bottomValueStyle = dVar5.getBottomValueStyle();
            if (bottomValueStyle != null) {
                try {
                    m.Companion companion3 = m.INSTANCE;
                    tl4.f[] fVarArrValues = tl4.f.values();
                    int length2 = fVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            fVar3 = null;
                            break;
                        }
                        tl4.f fVar4 = fVarArrValues[i2];
                        if (a0.z(fVar4.name(), bottomValueStyle, true)) {
                            fVar3 = fVar4;
                            break;
                        }
                        i2++;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th11) {
                    m.Companion companion4 = m.INSTANCE;
                    objA6 = o.a(th11);
                }
                if (fVar3 == null) {
                    throw new IllegalStateException("Unsupported enum value: " + bottomValueStyle + " for " + o0.f186429a.b(tl4.f.class).m());
                }
                objA6 = fVar3;
                Throwable thA2 = m.a(objA6);
                if (thA2 != null) {
                    hx7.e.n(thA2);
                }
                boolean z3 = objA6 instanceof n;
                Object obj3 = objA6;
                if (z3) {
                    obj3 = null;
                }
                fVar2 = (tl4.f) ((Enum) obj3);
            } else {
                fVar2 = null;
            }
            actionAccessory = new CreditCardCellModel.Accessory.LabelsAccessory(topValue, creditCardModelTextStyle, bottomValue, new CreditCardModelTextStyle(fVar2, null));
            creditCardDialogModelA = null;
        } else if (accessory instanceof io4.c) {
            io4.c cVar3 = (io4.c) accessory;
            String text = cVar3.getText();
            String textColor = cVar3.getTextColor();
            if (textColor != null) {
                try {
                    m.Companion companion5 = m.INSTANCE;
                    c[] cVarArrValues = c.values();
                    int length3 = cVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            cVar2 = null;
                            break;
                        }
                        c cVar4 = cVarArrValues[i3];
                        if (a0.z(cVar4.name(), textColor, true)) {
                            cVar2 = cVar4;
                            break;
                        }
                        i3++;
                    }
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th12) {
                    m.Companion companion6 = m.INSTANCE;
                    objA2 = o.a(th12);
                }
                if (cVar2 == null) {
                    throw new IllegalStateException("Unsupported enum value: " + textColor + " for " + o0.f186429a.b(c.class).m());
                }
                objA2 = cVar2;
                Throwable thA3 = m.a(objA2);
                if (thA3 != null) {
                    hx7.e.n(thA3);
                }
                boolean z4 = objA2 instanceof n;
                Object obj4 = objA2;
                if (z4) {
                    obj4 = null;
                }
                cVar = (c) ((Enum) obj4);
            } else {
                cVar = null;
            }
            String textStyle = cVar3.getTextStyle();
            if (textStyle != null) {
                try {
                    m.Companion companion7 = m.INSTANCE;
                    e[] eVarArrValues2 = e.values();
                    int length4 = eVarArrValues2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length4) {
                            eVar2 = null;
                            break;
                        }
                        e eVar6 = eVarArrValues2[i5];
                        if (a0.z(eVar6.name(), textStyle, true)) {
                            eVar2 = eVar6;
                            break;
                        }
                        i5++;
                    }
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th13) {
                    m.Companion companion8 = m.INSTANCE;
                    objA3 = o.a(th13);
                }
                if (eVar2 == null) {
                    throw new IllegalStateException("Unsupported enum value: " + textStyle + " for " + o0.f186429a.b(e.class).m());
                }
                objA3 = eVar2;
                Throwable thA4 = m.a(objA3);
                if (thA4 != null) {
                    hx7.e.n(thA4);
                }
                boolean z6 = objA3 instanceof n;
                Object obj5 = objA3;
                if (z6) {
                    obj5 = null;
                }
                eVar = (e) ((Enum) obj5);
            } else {
                eVar = null;
            }
            creditCardDialogModelA = null;
            CreditCardModelTextStyle creditCardModelTextStyle2 = new CreditCardModelTextStyle(null, eVar);
            String icon = cVar3.getIcon();
            if (icon != null) {
                try {
                    m.Companion companion9 = m.INSTANCE;
                    d[] dVarArrValues = d.values();
                    int length5 = dVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length5) {
                            dVar4 = null;
                            break;
                        }
                        d dVar6 = dVarArrValues[i6];
                        if (a0.z(dVar6.name(), icon, true)) {
                            dVar4 = dVar6;
                            break;
                        }
                        i6++;
                    }
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th14) {
                    m.Companion companion10 = m.INSTANCE;
                    objA4 = o.a(th14);
                }
                if (dVar4 == null) {
                    throw new IllegalStateException("Unsupported enum value: " + icon + " for " + o0.f186429a.b(d.class).m());
                }
                objA4 = dVar4;
                Throwable thA5 = m.a(objA4);
                if (thA5 != null) {
                    hx7.e.n(thA5);
                }
                boolean z11 = objA4 instanceof n;
                Object obj6 = objA4;
                if (z11) {
                    obj6 = null;
                }
                dVar3 = (d) ((Enum) obj6);
            } else {
                dVar3 = null;
            }
            actionAccessory = new CreditCardCellModel.Accessory.IconWithLabelAccessory(text, cVar, creditCardModelTextStyle2, dVar3);
        } else {
            creditCardDialogModelA = null;
            if (!(accessory instanceof io4.b)) {
                throw new NoWhenBranchMatchedException();
            }
            io4.b bVar = (io4.b) accessory;
            String value = bVar.getValue();
            String icon2 = bVar.getIcon();
            if (icon2 != null) {
                try {
                    m.Companion companion11 = m.INSTANCE;
                    d[] dVarArrValues2 = d.values();
                    int length6 = dVarArrValues2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= length6) {
                            dVar2 = null;
                            break;
                        }
                        d dVar7 = dVarArrValues2[i21];
                        if (a0.z(dVar7.name(), icon2, true)) {
                            dVar2 = dVar7;
                            break;
                        }
                        i21++;
                    }
                } catch (CancellationException e22) {
                    throw e22;
                } catch (Throwable th15) {
                    m.Companion companion12 = m.INSTANCE;
                    objA = o.a(th15);
                }
                if (dVar2 == null) {
                    throw new IllegalStateException("Unsupported enum value: " + icon2 + " for " + o0.f186429a.b(d.class).m());
                }
                objA = dVar2;
                Throwable thA6 = m.a(objA);
                if (thA6 != null) {
                    hx7.e.n(thA6);
                }
                boolean z12 = objA instanceof n;
                Object obj7 = objA;
                if (z12) {
                    obj7 = null;
                }
                dVar = (d) ((Enum) obj7);
            } else {
                dVar = null;
            }
            actionAccessory = new CreditCardCellModel.Accessory.ActionAccessory(value, dVar, b.a(bVar.getAction()));
        }
        g dialogue = fVar.getDialogue();
        if (dialogue != null) {
            creditCardDialogModel = creditCardDialogModelA;
            creditCardDialogModelA = hx7.b.A(dialogue);
        } else {
            creditCardDialogModel = creditCardDialogModelA;
        }
        Integer indentLevel = fVar.getIndentLevel();
        try {
            m.Companion companion13 = m.INSTANCE;
            List nestedItems = fVar.getNestedItems();
            if (nestedItems != null) {
                List list = nestedItems;
                A = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    A.add(a((f) it8.next()));
                }
            } else {
                A = creditCardDialogModel;
            }
        } catch (CancellationException e33) {
            throw e33;
        } catch (Throwable th16) {
            m.Companion companion14 = m.INSTANCE;
            A = o.a(th16);
        }
        Throwable thA7 = m.a(A);
        if (thA7 != null) {
            hx7.e.n(thA7);
        }
        return new CreditCardCellModel(id10, label, actionAccessory, creditCardDialogModelA, indentLevel, (List) (A instanceof n ? creditCardDialogModel : A), false);
    }

    public static final f b(CreditCardCellModel creditCardCellModel) {
        io4.e bVar;
        e eVar;
        Intrinsics.checkNotNullParameter(creditCardCellModel, "<this>");
        String str = creditCardCellModel.f68828a;
        String str2 = creditCardCellModel.f68829b;
        CreditCardCellModel.Accessory accessory = creditCardCellModel.f68830c;
        ArrayList arrayList = null;
        if (accessory instanceof CreditCardCellModel.Accessory.LabelsAccessory) {
            CreditCardCellModel.Accessory.LabelsAccessory labelsAccessory = (CreditCardCellModel.Accessory.LabelsAccessory) accessory;
            String str3 = labelsAccessory.f68838a;
            String str4 = labelsAccessory.f68840c;
            e eVar2 = labelsAccessory.f68839b.f68857b;
            String strName = eVar2 != null ? eVar2.name() : null;
            tl4.f fVar = labelsAccessory.d.f68856a;
            bVar = new io4.d(str3, strName, str4, fVar != null ? fVar.name() : null);
        } else if (accessory instanceof CreditCardCellModel.Accessory.IconWithLabelAccessory) {
            CreditCardCellModel.Accessory.IconWithLabelAccessory iconWithLabelAccessory = (CreditCardCellModel.Accessory.IconWithLabelAccessory) accessory;
            String str5 = iconWithLabelAccessory.f68835a;
            c cVar = iconWithLabelAccessory.f68836b;
            String strName2 = cVar != null ? cVar.name() : null;
            CreditCardModelTextStyle creditCardModelTextStyle = iconWithLabelAccessory.f68837c;
            String strName3 = (creditCardModelTextStyle == null || (eVar = creditCardModelTextStyle.f68857b) == null) ? null : eVar.name();
            d dVar = iconWithLabelAccessory.d;
            bVar = new io4.c(str5, dVar != null ? dVar.name() : null, strName3, strName2);
        } else {
            if (!(accessory instanceof CreditCardCellModel.Accessory.ActionAccessory)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditCardCellModel.Accessory.ActionAccessory actionAccessory = (CreditCardCellModel.Accessory.ActionAccessory) accessory;
            String str6 = actionAccessory.f68832a;
            d dVar2 = actionAccessory.f68833b;
            bVar = new io4.b(b.b(actionAccessory.f68834c), str6, dVar2 != null ? dVar2.name() : null);
        }
        CreditCardDialogModel creditCardDialogModel = creditCardCellModel.d;
        g gVarD = creditCardDialogModel != null ? hx7.b.D(creditCardDialogModel) : null;
        Integer num = creditCardCellModel.e;
        List list = creditCardCellModel.f;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((CreditCardCellModel) it8.next()));
            }
        }
        return new f(str, str2, bVar, gVarD, num, arrayList);
    }
}

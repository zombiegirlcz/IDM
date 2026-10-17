package i4k;

import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.mapper.StructuredReferenceItemsMapper$ReferenceMaskConfig;
import e4k.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f158533a;

    public n(yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f158533a = transferAmountMapper;
    }

    public static FixedTabsDelegate.Model b(TransferNote.StructuredNote transferNote, List referenceOptions) {
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        Intrinsics.checkNotNullParameter(transferNote, "transferNote");
        List<RemittanceReferenceOption> list = referenceOptions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (RemittanceReferenceOption remittanceReferenceOption : list) {
            arrayList.add(new FixedTabs.Item(remittanceReferenceOption.getType(), new TextClause(remittanceReferenceOption.getLabel(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (AnalyticsContext) null, 12));
        }
        return new FixedTabsDelegate.Model("ITEM_REFERENCE_OPTIONS_TABS_ID", arrayList, transferNote.f101984a, false, null, SyslogConstants.LOG_CLOCK);
    }

    public final List a(List referenceOptions, TransferNote.StructuredNote structuredNote, ArrayList errors, i0 i0Var) {
        Object next;
        nh nhVarG;
        Object next2;
        Clause textClause;
        int i;
        TextClause textClause2;
        TransferNote.StructuredNote.ReferenceValue referenceValue;
        TransferNote.StructuredNote transferNote = structuredNote;
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        Intrinsics.checkNotNullParameter(transferNote, "transferNote");
        Intrinsics.checkNotNullParameter(errors, "errors");
        String str = transferNote.f101984a;
        Iterator it8 = referenceOptions.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((RemittanceReferenceOption) next).getType(), str)) {
                break;
            }
        }
        RemittanceReferenceOption remittanceReferenceOption = (RemittanceReferenceOption) next;
        if (remittanceReferenceOption == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "StructuredReferenceItemsMapper", j6.a.q("Unknown selected reference option ID: ", str), null, null, 16);
            return f0.f322471a;
        }
        int i2 = 1;
        if (i0Var == null || remittanceReferenceOption.getFields().size() != 1) {
            nhVarG = null;
            break;
        }
        List fields = remittanceReferenceOption.getFields();
        if (!(fields instanceof Collection) || !fields.isEmpty()) {
            Iterator it9 = fields.iterator();
            while (it9.hasNext()) {
                if (((RemittanceReferenceField) it9.next()).T()) {
                    nhVarG = null;
                    break;
                }
            }
        }
        nhVarG = ((ppf.c) this.f158533a).g(i0Var.f122605b, i0Var.f122604a);
        List fields2 = remittanceReferenceOption.getFields();
        ArrayList<RemittanceReferenceField> arrayList = new ArrayList();
        for (Object obj2 : fields2) {
            if (!((RemittanceReferenceField) obj2).getHiddenInput()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (RemittanceReferenceField remittanceReferenceField : arrayList) {
            Iterator it10 = errors.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it10.next();
                if (Intrinsics.f(((d5k.h) next2).f111428a.getType(), remittanceReferenceField.getType())) {
                    break;
                }
            }
            d5k.h hVar = (d5k.h) next2;
            TextLocalisedClause textLocalisedClause = hVar != null ? hVar.f111429b : null;
            String strQ = j6.a.q("ITEM_REFERENCE_FIELD_INPUT_ID_", remittanceReferenceField.getType());
            TextClause textClause3 = new TextClause(remittanceReferenceField.getLabel(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Map mapB = transferNote.b();
            TextClause textClause4 = (mapB == null || (referenceValue = (TransferNote.StructuredNote.ReferenceValue) mapB.get(remittanceReferenceField.getType())) == null) ? null : new TextClause(referenceValue.f101986a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (textLocalisedClause == null) {
                String description = remittanceReferenceField.getDescription();
                textClause = description != null ? new TextClause(description, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            } else {
                textClause = textLocalisedClause;
            }
            int i3 = m.f158532a[remittanceReferenceField.getInputType().ordinal()];
            if (i3 != i2) {
                i = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 16385;
            }
            int i5 = i;
            String inputMask = remittanceReferenceField.getInputMask();
            StructuredReferenceItemsMapper$ReferenceMaskConfig structuredReferenceItemsMapper$ReferenceMaskConfig = inputMask != null ? new StructuredReferenceItemsMapper$ReferenceMaskConfig(remittanceReferenceField.getType(), inputMask) : null;
            String input = remittanceReferenceField.getInputMask();
            if (input != null) {
                Object obj3 = o.f158534a;
                Intrinsics.checkNotNullParameter(input, "input");
                StringBuilder sb6 = new StringBuilder();
                int i6 = 0;
                boolean z = false;
                while (i6 < input.length()) {
                    char cCharAt = input.charAt(i6);
                    int i21 = i6;
                    Character[] elements = {Character.valueOf(CoreConstants.CURLY_LEFT), Character.valueOf(CoreConstants.CURLY_RIGHT)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    if (kotlin.collections.d.y0(elements).contains(Character.valueOf(cCharAt))) {
                        Unit unit = Unit.f186387a;
                    } else if (cCharAt == '[') {
                        Unit unit2 = Unit.f186387a;
                        z = true;
                    } else if (cCharAt == ']') {
                        Unit unit3 = Unit.f186387a;
                        z = false;
                    } else if (z) {
                        Character[] elements2 = {'0', '9'};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        if (kotlin.collections.d.y0(elements2).contains(Character.valueOf(cCharAt))) {
                            sb6.append("#");
                        } else {
                            Character[] elements3 = {'A', 'a'};
                            Intrinsics.checkNotNullParameter(elements3, "elements");
                            if (kotlin.collections.d.y0(elements3).contains(Character.valueOf(cCharAt))) {
                                sb6.append("X");
                            } else {
                                Character[] elements4 = {Character.valueOf(CoreConstants.DASH_CHAR), '_'};
                                Intrinsics.checkNotNullParameter(elements4, "elements");
                                if (kotlin.collections.d.y0(elements4).contains(Character.valueOf(cCharAt))) {
                                    sb6.append("∗");
                                } else if (cCharAt == 8230) {
                                    m70.a.t(t0.f186434a);
                                    sb6.append(" ");
                                    sb6.append(cCharAt);
                                } else {
                                    sb6.append((char) 8727);
                                }
                            }
                        }
                    } else {
                        sb6.append(cCharAt);
                    }
                    i6 = i21 + 1;
                }
                String string = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                textClause2 = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                textClause2 = null;
            }
            InputTextDelegate.Model model = new InputTextDelegate.Model(strQ, textClause4, textClause3, textClause2, remittanceReferenceField.getInputMask() != null, textClause, null, null, null, null, null, false, null, null, textLocalisedClause != null, remittanceReferenceField.getEditable(), i5, 0, null, false, false, null, true, null, false, false, false, structuredReferenceItemsMapper$ReferenceMaskConfig, null, 0, -539361440, 65023);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            transferNote = structuredNote;
            i2 = 1;
        }
        if (nhVarG == null) {
            return arrayList2;
        }
        List listD1 = d0.d1(d0.j1(arrayList2, u.c(nhVarG)));
        return listD1 == null ? f0.f322471a : listD1;
    }
}

package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import a94.d;
import a94.k;
import av7.l;
import b4b.z;
import b94.i;
import b94.n;
import b94.q;
import b94.t;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jli.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oki.h;
import org.bouncycastle.asn1.BERTags;
import qu3.e;
import qu3.f;
import vkm.j2;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements n {
    public final DebtDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xw3.a f67490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw3.c f67491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f67492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.a f67493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f67494t;
    public final w80.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67495w;

    public a(cli.n stateMapper, DebtDetailsControllerContract$InputData inputData, b debtDetailsFormFactory, xw3.a debtsInteractor, hw3.c actionPathInteractor, d debtTypeMapper, n60.a keyboardControllerExtension, k debtsControllerModelExtension, w80.b amountFormatter) {
        b94.h hVar;
        Map mapK;
        TextLocalisedClause textLocalisedClause = debtDetailsFormFactory.f67496a;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(debtDetailsFormFactory, "debtDetailsFormFactory");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        Intrinsics.checkNotNullParameter(debtTypeMapper, "debtTypeMapper");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(debtsControllerModelExtension, "debtsControllerModelExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = inputData;
        this.f67490p = debtsInteractor;
        this.f67491q = actionPathInteractor;
        this.f67492r = debtTypeMapper;
        this.f67493s = keyboardControllerExtension;
        this.f67494t = debtsControllerModelExtension;
        this.u = amountFormatter;
        if (inputData instanceof DebtDetailsControllerContract$InputData.AddNewDebt) {
            i iVar = i.ADD_NEW;
            DebtDetailsControllerContract$InputData.AddNewDebt addNewDebt = (DebtDetailsControllerContract$InputData.AddNewDebt) inputData;
            pu3.d debtType = addNewDebt.f67467a;
            xi0.b currency = addNewDebt.f67469c;
            Intrinsics.checkNotNullParameter(debtType, "debtType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_monthly_repayment, null, null, 14);
            switch (t.f13663a[debtType.ordinal()]) {
                case 1:
                    Pair pair = new Pair("FIELD_ID_CREDIT_PROVIDER", new DetailsInputForm.DetailsInputField.TextField(textLocalisedClause, textLocalisedClause));
                    TextLocalisedClause textLocalisedClause3 = debtDetailsFormFactory.f67497b;
                    Pair pair2 = new Pair("FIELD_ID_AMOUNT", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_AMOUNT", textLocalisedClause3, null, textLocalisedClause3, null, currency, true, true));
                    Pair pair3 = new Pair("FIELD_ID_MONTHLY_REPAYMENT_AMOUNT", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_MONTHLY_REPAYMENT_AMOUNT", textLocalisedClause2, null, textLocalisedClause2, null, currency, true, true));
                    TextLocalisedClause textLocalisedClause4 = debtDetailsFormFactory.e;
                    EnumEntries enumEntriesA = f.a();
                    ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
                    Iterator<E> it8 = enumEntriesA.iterator();
                    while (it8.hasNext()) {
                        String lowerCase = ((f) it8.next()).name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        arrayList.add(g.b(lowerCase));
                    }
                    mapK = r0.k(pair, pair2, pair3, new Pair("FIELD_ID_LOAN_TYPE", new DetailsInputForm.DetailsInputField.DropdownField("FIELD_ID_LOAN_TYPE", textLocalisedClause4, null, arrayList, true, true)));
                    break;
                case 2:
                    Pair pair4 = new Pair("FIELD_ID_CREDIT_PROVIDER", new DetailsInputForm.DetailsInputField.TextField(textLocalisedClause, textLocalisedClause));
                    TextLocalisedClause textLocalisedClause5 = debtDetailsFormFactory.f67497b;
                    mapK = r0.k(pair4, new Pair("FIELD_ID_CURRENT_BALANCE", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_CURRENT_BALANCE", textLocalisedClause5, null, textLocalisedClause5, null, currency, true, true)), new Pair("FIELD_ID_MONTHLY_REPAYMENT_AMOUNT", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_MONTHLY_REPAYMENT_AMOUNT", textLocalisedClause2, null, textLocalisedClause2, null, currency, true, true)));
                    break;
                case 3:
                    Pair pair5 = new Pair("FIELD_ID_CREDIT_PROVIDER", new DetailsInputForm.DetailsInputField.TextField(textLocalisedClause, textLocalisedClause));
                    TextLocalisedClause textLocalisedClause6 = debtDetailsFormFactory.f67498c;
                    Pair pair6 = new Pair("FIELD_ID_AMOUNT", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_AMOUNT", textLocalisedClause6, null, textLocalisedClause6, null, currency, true, true));
                    TextLocalisedClause textLocalisedClause7 = debtDetailsFormFactory.d;
                    mapK = r0.k(pair5, pair6, new Pair("FIELD_ID_CURRENT_BALANCE", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_CURRENT_BALANCE", textLocalisedClause7, null, textLocalisedClause7, null, currency, true, true)));
                    break;
                case 4:
                case 5:
                case 6:
                    Pair pair7 = new Pair("FIELD_ID_CREDIT_PROVIDER", new DetailsInputForm.DetailsInputField.TextField(textLocalisedClause, textLocalisedClause));
                    TextLocalisedClause textLocalisedClause8 = debtDetailsFormFactory.f67498c;
                    mapK = r0.k(pair7, new Pair("FIELD_ID_AMOUNT", new DetailsInputForm.DetailsInputField.MoneyField("FIELD_ID_AMOUNT", textLocalisedClause8, null, textLocalisedClause8, null, currency, true, true)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            hVar = new b94.h(iVar, null, debtType, false, new DetailsInputForm(mapK), ((DebtDetailsControllerContract$InputData.AddNewDebt) this.o).f67468b, 160);
        } else {
            if (!(inputData instanceof DebtDetailsControllerContract$InputData.UpdateDebt)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar2 = i.UPDATE;
            e eVar = ((DebtDetailsControllerContract$InputData.UpdateDebt) inputData).f67470a;
            hVar = new b94.h(iVar2, eVar.f249200a, eVar.f249201b, eVar.f249205j, debtDetailsFormFactory.a(eVar), null, BERTags.FLAGS);
        }
        this.v = mra.d.b(this, hVar, stateMapper, null, false, 12);
        this.f67495w = hx7.e.a(this, new b7d.c(this, 4));
    }

    public final DetailsInputForm I2() {
        return ((b94.h) ((j2) this.v.f22677a).getValue()).e;
    }

    /* JADX WARN: Type inference failed for: r1v112, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v130, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v150, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v170, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v190, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v212, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, java.util.Map] */
    public final void J2() {
        String str;
        String str2;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l22;
        Long l31;
        String str3;
        f fVar;
        f fVar2;
        String str4;
        String str5;
        Long l37;
        Long l39;
        Long l51;
        Long l52;
        Long l60;
        Long l66;
        String str6;
        f fVar3;
        Boolean boolValueOf;
        Boolean bool;
        f fVar4;
        y yVar = this.v;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        int i = q.f13658a[((b94.h) j2Var.getValue()).f13645a.ordinal()];
        int i2 = 0;
        Continuation continuation = null;
        if (i == 1) {
            pu3.d dVar = ((b94.h) j2Var2.getValue()).f13647c;
            DetailsInputForm.DetailsInputField detailsInputField = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_CREDIT_PROVIDER");
            if (detailsInputField != null) {
                if (detailsInputField instanceof DetailsInputForm.DetailsInputField.TextField) {
                    str = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField).e;
                } else if (detailsInputField instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                    Object obj2 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField).e;
                    if (!(obj2 == null)) {
                        obj2 = null;
                    }
                    str = (String) obj2;
                } else if (detailsInputField instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                    boolean z = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField).f67477c;
                    str2 = null;
                } else {
                    if (!(detailsInputField instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField).f67480c;
                }
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DetailsInputForm.DetailsInputField detailsInputField2 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_AMOUNT");
            if (detailsInputField2 != null) {
                if (detailsInputField2 instanceof DetailsInputForm.DetailsInputField.TextField) {
                    Object obj3 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField2).e;
                    if (!(obj3 == null)) {
                        obj3 = null;
                    }
                    l2 = (Long) obj3;
                } else if (detailsInputField2 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                    l2 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField2).e;
                } else if (detailsInputField2 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                    boolean z3 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField2).f67477c;
                    l3 = null;
                } else {
                    if (!(detailsInputField2 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj4 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField2).f67480c;
                    if (!(obj4 == null)) {
                        obj4 = null;
                    }
                    l2 = (Long) obj4;
                }
                l3 = l2;
            } else {
                l3 = null;
            }
            DetailsInputForm.DetailsInputField detailsInputField3 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_CURRENT_BALANCE");
            if (detailsInputField3 != null) {
                if (detailsInputField3 instanceof DetailsInputForm.DetailsInputField.TextField) {
                    Object obj5 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField3).e;
                    if (!(obj5 == null)) {
                        obj5 = null;
                    }
                    l4 = (Long) obj5;
                } else if (detailsInputField3 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                    l4 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField3).e;
                } else if (detailsInputField3 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                    boolean z4 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField3).f67477c;
                    l5 = null;
                } else {
                    if (!(detailsInputField3 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj6 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField3).f67480c;
                    if (!(obj6 == null)) {
                        obj6 = null;
                    }
                    l4 = (Long) obj6;
                }
                l5 = l4;
            } else {
                l5 = null;
            }
            DetailsInputForm.DetailsInputField detailsInputField4 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_MONTHLY_REPAYMENT_AMOUNT");
            if (detailsInputField4 != null) {
                if (detailsInputField4 instanceof DetailsInputForm.DetailsInputField.TextField) {
                    Object obj7 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField4).e;
                    if (!(obj7 == null)) {
                        obj7 = null;
                    }
                    l22 = (Long) obj7;
                } else if (detailsInputField4 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                    l22 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField4).e;
                } else if (detailsInputField4 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                    boolean z6 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField4).f67477c;
                    l31 = null;
                } else {
                    if (!(detailsInputField4 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj8 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField4).f67480c;
                    if (!(obj8 == null)) {
                        obj8 = null;
                    }
                    l22 = (Long) obj8;
                }
                l31 = l22;
            } else {
                l31 = null;
            }
            DetailsInputForm.DetailsInputField detailsInputField5 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_LOAN_TYPE");
            if (detailsInputField5 == null) {
                str3 = null;
            } else if (detailsInputField5 instanceof DetailsInputForm.DetailsInputField.TextField) {
                str3 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField5).e;
                if (str3 == null) {
                    str3 = null;
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (detailsInputField5 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                    Long l69 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField5).e;
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                if (detailsInputField5 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                    boolean z11 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField5).f67477c;
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                if (!(detailsInputField5 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField5).f67480c;
                if (str3 == null) {
                    str3 = null;
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            if (str3 != null) {
                f[] fVarArrValues = f.values();
                int length = fVarArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        fVar2 = null;
                        break;
                    }
                    fVar2 = fVarArrValues[i2];
                    if (a0.z(fVar2.name(), str3, true)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                fVar = fVar2;
            } else {
                fVar = null;
            }
            n2(new l(this, new qu3.a(dVar, str2, l3, l5, l31, fVar), continuation, 22), new whi.b(6));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String str7 = ((b94.h) j2Var2.getValue()).f13646b;
        if (str7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        pu3.d dVar2 = ((b94.h) j2Var2.getValue()).f13647c;
        DetailsInputForm.DetailsInputField detailsInputField6 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_CREDIT_PROVIDER");
        if (detailsInputField6 != null) {
            if (detailsInputField6 instanceof DetailsInputForm.DetailsInputField.TextField) {
                str4 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField6).e;
            } else if (detailsInputField6 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                Object obj9 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField6).e;
                if (!(obj9 == null)) {
                    obj9 = null;
                }
                str4 = (String) obj9;
            } else if (detailsInputField6 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                boolean z12 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField6).f67477c;
                str5 = null;
            } else {
                if (!(detailsInputField6 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                str4 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField6).f67480c;
            }
            str5 = str4;
        } else {
            str5 = null;
        }
        if (str5 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DetailsInputForm.DetailsInputField detailsInputField7 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_AMOUNT");
        if (detailsInputField7 != null) {
            if (detailsInputField7 instanceof DetailsInputForm.DetailsInputField.TextField) {
                Object obj10 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField7).e;
                if (!(obj10 == null)) {
                    obj10 = null;
                }
                l37 = (Long) obj10;
            } else if (detailsInputField7 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                l37 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField7).e;
            } else if (detailsInputField7 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                boolean z29 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField7).f67477c;
                l39 = null;
            } else {
                if (!(detailsInputField7 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj11 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField7).f67480c;
                if (!(obj11 == null)) {
                    obj11 = null;
                }
                l37 = (Long) obj11;
            }
            l39 = l37;
        } else {
            l39 = null;
        }
        DetailsInputForm.DetailsInputField detailsInputField8 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_CURRENT_BALANCE");
        if (detailsInputField8 != null) {
            if (detailsInputField8 instanceof DetailsInputForm.DetailsInputField.TextField) {
                Object obj12 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField8).e;
                if (!(obj12 == null)) {
                    obj12 = null;
                }
                l51 = (Long) obj12;
            } else if (detailsInputField8 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                l51 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField8).e;
            } else if (detailsInputField8 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                boolean z31 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField8).f67477c;
                l52 = null;
            } else {
                if (!(detailsInputField8 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj13 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField8).f67480c;
                if (!(obj13 == null)) {
                    obj13 = null;
                }
                l51 = (Long) obj13;
            }
            l52 = l51;
        } else {
            l52 = null;
        }
        DetailsInputForm.DetailsInputField detailsInputField9 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_MONTHLY_REPAYMENT_AMOUNT");
        if (detailsInputField9 != null) {
            if (detailsInputField9 instanceof DetailsInputForm.DetailsInputField.TextField) {
                Object obj14 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField9).e;
                if (!(obj14 == null)) {
                    obj14 = null;
                }
                l60 = (Long) obj14;
            } else if (detailsInputField9 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                l60 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField9).e;
            } else if (detailsInputField9 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                boolean z41 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField9).f67477c;
                l66 = null;
            } else {
                if (!(detailsInputField9 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj15 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField9).f67480c;
                if (!(obj15 == null)) {
                    obj15 = null;
                }
                l60 = (Long) obj15;
            }
            l66 = l60;
        } else {
            l66 = null;
        }
        DetailsInputForm.DetailsInputField detailsInputField10 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_LOAN_TYPE");
        if (detailsInputField10 == null) {
            str6 = null;
        } else if (detailsInputField10 instanceof DetailsInputForm.DetailsInputField.TextField) {
            str6 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField10).e;
            if (str6 == null) {
                str6 = null;
            }
            if (str6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            if (detailsInputField10 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                Long l79 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField10).e;
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (detailsInputField10 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                boolean z49 = ((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField10).f67477c;
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (!(detailsInputField10 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                throw new NoWhenBranchMatchedException();
            }
            str6 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField10).f67480c;
            if (str6 == null) {
                str6 = null;
            }
            if (str6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (str6 != null) {
            f[] fVarArrValues2 = f.values();
            int length2 = fVarArrValues2.length;
            while (true) {
                if (i2 >= length2) {
                    fVar4 = null;
                    break;
                }
                fVar4 = fVarArrValues2[i2];
                if (a0.z(fVar4.name(), str6, true)) {
                    break;
                } else {
                    i2++;
                }
            }
            fVar3 = fVar4;
        } else {
            fVar3 = null;
        }
        DetailsInputForm.DetailsInputField detailsInputField11 = (DetailsInputForm.DetailsInputField) I2().f67474a.get("FIELD_ID_IS_REPAID");
        if (detailsInputField11 == null) {
            bool = null;
        } else {
            if (detailsInputField11 instanceof DetailsInputForm.DetailsInputField.TextField) {
                Object obj16 = ((DetailsInputForm.DetailsInputField.TextField) detailsInputField11).e;
                if (!(obj16 == null)) {
                    obj16 = null;
                }
                boolValueOf = (Boolean) obj16;
            } else if (detailsInputField11 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                Object obj17 = ((DetailsInputForm.DetailsInputField.MoneyField) detailsInputField11).e;
                if (!(obj17 == null)) {
                    obj17 = null;
                }
                boolValueOf = (Boolean) obj17;
            } else if (detailsInputField11 instanceof DetailsInputForm.DetailsInputField.CheckboxField) {
                boolValueOf = Boolean.valueOf(((DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField11).f67477c);
            } else {
                if (!(detailsInputField11 instanceof DetailsInputForm.DetailsInputField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj18 = ((DetailsInputForm.DetailsInputField.DropdownField) detailsInputField11).f67480c;
                if (!(obj18 == null)) {
                    obj18 = null;
                }
                boolValueOf = (Boolean) obj18;
            }
            bool = boolValueOf;
        }
        n2(new l(this, new qu3.n(str7, dVar2, str5, l39, l52, l66, fVar3, bool), continuation, 23), new whi.b(6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67495w;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void K2(DetailsInputForm.DetailsInputField detailsInputField) {
        DetailsInputForm detailsInputFormI2 = I2();
        LinkedHashMap inputFields = foh.i.w(detailsInputField.getF67486a(), detailsInputField, I2().f67474a);
        detailsInputFormI2.getClass();
        Intrinsics.checkNotNullParameter(inputFields, "inputFields");
        H2(this.v, new z(new DetailsInputForm(inputFields), 28));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    @Override // yji.l
    public final void T1(long j2) {
        Object next;
        y yVar = this.v;
        if (((b94.h) ((j2) yVar.f22677a).getValue()).f == null) {
            Iterator it8 = I2().f67474a.values().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                DetailsInputForm.DetailsInputField detailsInputField = (DetailsInputForm.DetailsInputField) next;
                if (detailsInputField.getF67489g() && detailsInputField.getF() && detailsInputField.getValue() == null) {
                    break;
                }
            }
            DetailsInputForm.DetailsInputField detailsInputField2 = (DetailsInputForm.DetailsInputField) next;
            String f67486a = detailsInputField2 != null ? detailsInputField2.getF67486a() : null;
            if (f67486a != null) {
                H2(yVar, new ak7.g(f67486a, 25));
                this.f67493s.S(false);
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}

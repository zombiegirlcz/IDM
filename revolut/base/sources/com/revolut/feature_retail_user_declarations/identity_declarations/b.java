package com.revolut.feature_retail_user_declarations.identity_declarations;

import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowContract$StepResult;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import com.revolut.shared.feature.user_declarations.api.models.NativeName;
import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityDataPointValue;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import obi.h;
import obi.i;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kvh.a f97694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityDeclarationsFlowInputData f97695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTimeFormatter f97696c;

    public b(kvh.a dataPointNameMapper, IdentityDeclarationsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(dataPointNameMapper, "dataPointNameMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f97694a = dataPointNameMapper;
        this.f97695b = inputData;
        this.f97696c = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public final void a(String str, ril.a aVar, HashSet hashSet, ArrayList arrayList) {
        if (!hashSet.contains(aVar)) {
            str = null;
        }
        if (str != null) {
            arrayList.add(new EligibilityDataPointValue.StringDataPointValue(c(aVar), str));
        }
    }

    public final String b(ril.a aVar) {
        Object next;
        Iterator it8 = this.f97695b.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((DataPoint) next).f105375a == aVar) {
                break;
            }
        }
        DataPoint dataPoint = (DataPoint) next;
        if (dataPoint != null) {
            return dataPoint.f105377c;
        }
        return null;
    }

    public final String c(ril.a value) {
        this.f97694a.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        return value.name();
    }

    public final ArrayList d(Collection results) {
        Unit unit;
        String str;
        Intrinsics.checkNotNullParameter(results, "results");
        List list = this.f97695b.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((DataPoint) it8.next()).f105375a);
        }
        HashSet hashSetB1 = d0.b1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = results.iterator();
        while (it9.hasNext()) {
            IdentityDeclarationsFlowContract$StepResult identityDeclarationsFlowContract$StepResult = (IdentityDeclarationsFlowContract$StepResult) it9.next();
            if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.DateOfBirth) {
                a(((IdentityDeclarationsFlowContract$StepResult.DateOfBirth) identityDeclarationsFlowContract$StepResult).f97658a.format(this.f97696c), ril.a.DATE_OF_BIRTH, hashSetB1, arrayList2);
            } else if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.Name) {
                ril.a aVar = ril.a.NAME;
                if (hashSetB1.contains(aVar)) {
                    String strC = c(aVar);
                    String strB = b(aVar);
                    IdentityDeclarationsFlowContract$StepResult.Name name = (IdentityDeclarationsFlowContract$StepResult.Name) identityDeclarationsFlowContract$StepResult;
                    arrayList2.add(new EligibilityDataPointValue.NameDataPointValue(strC, strB, name.f97660a, name.f97661b, name.f97662c, name.d, name.e, name.f));
                }
                IdentityDeclarationsFlowContract$StepResult.Name name2 = (IdentityDeclarationsFlowContract$StepResult.Name) identityDeclarationsFlowContract$StepResult;
                String str2 = name2.d;
                ril.a aVar2 = ril.a.ALIAS;
                String strB2 = b(aVar2);
                if (str2 == null || strB2 == null) {
                    unit = null;
                } else {
                    arrayList2.add(new EligibilityDataPointValue.NameDataPointValue(220, c(aVar2), strB2, null, null, str2));
                    unit = Unit.f186387a;
                }
                if (unit == null) {
                    a(str2, aVar2, hashSetB1, arrayList2);
                }
                NativeName nativeName = name2.f97663g;
                ril.a aVar3 = ril.a.NATIVE_NAME;
                String strB3 = b(aVar3);
                if (nativeName != null && strB3 != null) {
                    arrayList2.add(new EligibilityDataPointValue.NameDataPointValue(240, c(aVar3), strB3, nativeName.f105041a, nativeName.f105042b, null));
                }
                a(name2.f97660a, ril.a.FIRST_NAME, hashSetB1, arrayList2);
                a(name2.f97661b, ril.a.LAST_NAME, hashSetB1, arrayList2);
                a(name2.f97662c, ril.a.MIDDLE_NAME, hashSetB1, arrayList2);
                a(name2.e, ril.a.FIRST_SURNAME, hashSetB1, arrayList2);
                a(name2.f, ril.a.SECOND_SURNAME, hashSetB1, arrayList2);
            } else if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.Occupation) {
                String lowerCase = ((IdentityDeclarationsFlowContract$StepResult.Occupation) identityDeclarationsFlowContract$StepResult).f97664a.getCode().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                a(lowerCase, ril.a.OCCUPATION, hashSetB1, arrayList2);
            } else if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.Gender) {
                int i = i.f223965a[((IdentityDeclarationsFlowContract$StepResult.Gender) identityDeclarationsFlowContract$StepResult).f97659a.ordinal()];
                if (i == 1) {
                    str = "MALE";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "FEMALE";
                }
                a(str, ril.a.GENDER, hashSetB1, arrayList2);
            } else if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth) {
                ril.a aVar4 = ril.a.PLACE_OF_BIRTH;
                if (hashSetB1.contains(aVar4)) {
                    String strC2 = c(aVar4);
                    PlaceOfBirthFlowOutputData.Success success = ((IdentityDeclarationsFlowContract$StepResult.PlaceOfBirth) identityDeclarationsFlowContract$StepResult).f97667a;
                    arrayList2.add(new EligibilityDataPointValue.PlaceOfBirthDataPointValue(strC2, success.f105029a.f297794a, success.f105030b));
                }
            } else if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount) {
                ril.a aVar5 = ril.a.ACCOUNT_PURPOSES;
                if (hashSetB1.contains(aVar5)) {
                    arrayList2.add(new EligibilityDataPointValue.PurposeOfAccountDataPointValue(c(aVar5), ((IdentityDeclarationsFlowContract$StepResult.PurposeOfAccount) identityDeclarationsFlowContract$StepResult).f97668a));
                }
            } else if (identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.AcceptedTerms) {
                ril.a aVar6 = ril.a.ACCEPTED_TERMS;
                if (hashSetB1.contains(aVar6)) {
                    String strC3 = c(aVar6);
                    IdentityDeclarationsFlowContract$StepResult.AcceptedTerms acceptedTerms = (IdentityDeclarationsFlowContract$StepResult.AcceptedTerms) identityDeclarationsFlowContract$StepResult;
                    List<Terms> list2 = acceptedTerms.f97656a;
                    ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                    for (Terms terms : list2) {
                        String str3 = terms.f90355a;
                        String str4 = terms.f.f90390a;
                        String str5 = terms.i;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList3.add(new EligibilityDataPointValue.AcceptedTermsDataPointValue.AcceptedTermsReference(str3, str4, str5));
                    }
                    arrayList2.add(new EligibilityDataPointValue.AcceptedTermsDataPointValue(strC3, new EligibilityDataPointValue.AcceptedTermsDataPointValue.AcceptedTermsValue(acceptedTerms.f97657b, arrayList3)));
                }
            } else {
                if (!(identityDeclarationsFlowContract$StepResult instanceof IdentityDeclarationsFlowContract$StepResult.PersonalCode)) {
                    throw new NoWhenBranchMatchedException();
                }
                ril.a aVar7 = ril.a.PERSONAL_CODE;
                if (hashSetB1.contains(aVar7)) {
                    IdentityDeclarationsFlowContract$StepResult.PersonalCode personalCode = (IdentityDeclarationsFlowContract$StepResult.PersonalCode) identityDeclarationsFlowContract$StepResult;
                    arrayList2.add(new EligibilityDataPointValue.PersonalCodeValue(c(aVar7), personalCode.f97665a.f297794a, personalCode.f97666b));
                }
            }
        }
        return arrayList2;
    }
}

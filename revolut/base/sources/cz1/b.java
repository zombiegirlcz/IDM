package cz1;

import com.revolut.feature.apm.core.models.payments_authorisations.AmountType;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmendment;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;
import com.revolut.feature.apm.core.models.payments_authorisations.Changes;
import com.revolut.feature.apm.core.models.payments_authorisations.ExecutionType;
import com.revolut.feature.apm.core.models.payments_authorisations.FieldChange;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetailsAmendment;
import com.revolut.feature.apm.core.models.payments_authorisations.Purpose;
import dz1.m;
import dz1.n;
import dz1.p;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.CopyOnWriteArrayList;
import k02.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import n14.e;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final ApmPaymentAuthorisationAmendment a(dz1.a aVar) {
        j02.a aVar2;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod;
        Object newValue;
        FieldChange valueUpdated;
        Object newValue2;
        Object newValue3;
        FieldChange valueUpdated2;
        m mVar;
        ExecutionType executionType;
        Object newValue4;
        FieldChange valueUpdated3;
        FieldChange fieldChange;
        AuthorisationFrequency authorisationFrequency;
        Object newValue5;
        FieldChange valueUpdated4;
        Changes changes;
        PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment payToPaymentMethodDetailsAmendment;
        Object newValue6;
        FieldChange valueUpdated5;
        Object newValue7;
        FieldChange valueUpdated6;
        Object newValue8;
        FieldChange valueUpdated7;
        Object newValue9;
        FieldChange valueUpdated8;
        Object newValue10;
        AmountType amountType;
        FieldChange valueUpdated9;
        Object newValue11;
        FieldChange valueUpdated10;
        Object newValue12;
        FieldChange valueUpdated11;
        Object newValue13;
        Object newValue14;
        Object newValue15;
        FieldChange valueUpdated12;
        PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo;
        Object newValue16;
        FieldChange valueUpdated13;
        Object newValue17;
        FieldChange valueUpdated14;
        p pVar;
        Purpose purpose;
        Object newValue18;
        FieldChange valueUpdated15;
        Object newValue19;
        Object newValue20;
        FieldChange fieldChange2;
        FieldChange valueUpdated16;
        Changes changes2;
        PaymentMethodDetailsAmendment.UpiPaymentMethodDetailsAmendment upiPaymentMethodDetailsAmendment;
        Object newValue21;
        FieldChange valueUpdated17;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String state = aVar.getState();
        j02.a[] aVarArrValues = j02.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar2 = null;
                break;
            }
            aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), state, true)) {
                break;
            }
            i++;
        }
        String paymentMethod = aVar.getPaymentMethod();
        ApmPaymentAuthorisationPaymentMethod[] apmPaymentAuthorisationPaymentMethodArrValues = ApmPaymentAuthorisationPaymentMethod.values();
        int length2 = apmPaymentAuthorisationPaymentMethodArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                apmPaymentAuthorisationPaymentMethod = null;
                break;
            }
            ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod2 = apmPaymentAuthorisationPaymentMethodArrValues[i2];
            if (a0.z(apmPaymentAuthorisationPaymentMethod2.name(), paymentMethod, true)) {
                apmPaymentAuthorisationPaymentMethod = apmPaymentAuthorisationPaymentMethod2;
                break;
            }
            i2++;
        }
        if (aVar2 == null || apmPaymentAuthorisationPaymentMethod == null) {
            String id10 = aVar.getId();
            String state2 = aVar.getState();
            String paymentMethod2 = aVar.getPaymentMethod();
            StringBuilder sbM = v0.a.m("Unexpected parse Dto to Domain Model for AmendmentSummary id=", id10, " state = ", state2, " paymentMethod = ");
            sbM.append(paymentMethod2);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbM.toString());
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        String id11 = aVar.getId();
        LocalDate localDateI = oc.c.I(aVar.getCreatedDate());
        Long acceptanceExpirationDate = aVar.getAcceptanceExpirationDate();
        LocalDate localDateI2 = acceptanceExpirationDate != null ? oc.c.I(acceptanceExpirationDate.longValue()) : null;
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummaryA = l02.c.a(aVar.getPaymentAuthorisation());
        m changes3 = aVar.getChanges();
        Intrinsics.checkNotNullParameter(changes3, "<this>");
        n amountChanges = changes3.getAmountChanges();
        FieldChange fieldChange3 = FieldChange.Removed.f62020a;
        FieldChange.NoChange noChange = FieldChange.NoChange.f62019a;
        if (amountChanges == null) {
            valueUpdated = noChange;
        } else if (amountChanges.getPresent() && (newValue = amountChanges.getNewValue()) != null) {
            jo3.a it8 = (jo3.a) newValue;
            Intrinsics.checkNotNullParameter(it8, "it");
            valueUpdated = new FieldChange.ValueUpdated(mo3.a.o(it8));
        } else {
            valueUpdated = fieldChange3;
        }
        n expirationDateChanges = changes3.getExpirationDateChanges();
        FieldChange valueUpdated18 = expirationDateChanges == null ? noChange : (expirationDateChanges.getPresent() && (newValue2 = expirationDateChanges.getNewValue()) != null) ? new FieldChange.ValueUpdated(oi0.d.Y(((Long) newValue2).longValue())) : fieldChange3;
        n executionTypeChanges = changes3.getExecutionTypeChanges();
        if (executionTypeChanges == null) {
            mVar = changes3;
            valueUpdated2 = noChange;
        } else if (executionTypeChanges.getPresent() && (newValue3 = executionTypeChanges.getNewValue()) != null) {
            String it9 = (String) newValue3;
            Intrinsics.checkNotNullParameter(it9, "it");
            ExecutionType[] executionTypeArrValues = ExecutionType.values();
            int length3 = executionTypeArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    mVar = changes3;
                    executionType = null;
                    break;
                }
                ExecutionType executionType2 = executionTypeArrValues[i3];
                mVar = changes3;
                ExecutionType[] executionTypeArr = executionTypeArrValues;
                if (a0.z(executionType2.name(), it9, true)) {
                    executionType = executionType2;
                    break;
                }
                i3++;
                changes3 = mVar;
                executionTypeArrValues = executionTypeArr;
            }
            valueUpdated2 = new FieldChange.ValueUpdated(executionType);
        } else {
            mVar = changes3;
            valueUpdated2 = fieldChange3;
        }
        n periodChanges = mVar.getPeriodChanges();
        if (periodChanges == null) {
            fieldChange = fieldChange3;
            valueUpdated3 = noChange;
        } else if (periodChanges.getPresent() && (newValue4 = periodChanges.getNewValue()) != null) {
            String it10 = (String) newValue4;
            Intrinsics.checkNotNullParameter(it10, "it");
            AuthorisationFrequency[] authorisationFrequencyArrValues = AuthorisationFrequency.values();
            int length4 = authorisationFrequencyArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    fieldChange = fieldChange3;
                    authorisationFrequency = null;
                    break;
                }
                AuthorisationFrequency authorisationFrequency2 = authorisationFrequencyArrValues[i5];
                AuthorisationFrequency[] authorisationFrequencyArr = authorisationFrequencyArrValues;
                fieldChange = fieldChange3;
                if (a0.z(authorisationFrequency2.name(), it10, true)) {
                    authorisationFrequency = authorisationFrequency2;
                    break;
                }
                i5++;
                authorisationFrequencyArrValues = authorisationFrequencyArr;
                fieldChange3 = fieldChange;
            }
            valueUpdated3 = new FieldChange.ValueUpdated(authorisationFrequency);
        } else {
            valueUpdated3 = fieldChange3;
            fieldChange = valueUpdated3;
        }
        n paymentAmountsChanges = mVar.getPaymentAmountsChanges();
        if (paymentAmountsChanges == null) {
            valueUpdated4 = noChange;
        } else if (paymentAmountsChanges.getPresent() && (newValue5 = paymentAmountsChanges.getNewValue()) != null) {
            k02.a it11 = (k02.a) newValue5;
            Intrinsics.checkNotNullParameter(it11, "it");
            valueUpdated4 = new FieldChange.ValueUpdated(e.F(it11));
        } else {
            valueUpdated4 = fieldChange;
        }
        switch (apmPaymentAuthorisationPaymentMethod == null ? -1 : a.f110139a[apmPaymentAuthorisationPaymentMethod.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                changes2 = null;
                return new ApmPaymentAuthorisationAmendment(id11, aVar2, localDateI, localDateI2, apmPaymentAuthorisationPaymentMethod, apmPaymentAuthorisationSummaryA, changes2);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                FieldChange fieldChange4 = valueUpdated3;
                FieldChange fieldChange5 = valueUpdated2;
                int i6 = 0;
                p paymentMethodDetailsChanges = mVar.getPaymentMethodDetailsChanges();
                if (paymentMethodDetailsChanges != null) {
                    Intrinsics.checkNotNullParameter(paymentMethodDetailsChanges, "<this>");
                    n descriptionChanges = paymentMethodDetailsChanges.getDescriptionChanges();
                    if (descriptionChanges == null) {
                        valueUpdated5 = noChange;
                    } else if (descriptionChanges.getPresent() && (newValue6 = descriptionChanges.getNewValue()) != null) {
                        String it12 = (String) newValue6;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        valueUpdated5 = new FieldChange.ValueUpdated(it12);
                    } else {
                        valueUpdated5 = fieldChange;
                    }
                    n creditorChanges = paymentMethodDetailsChanges.getCreditorChanges();
                    if (creditorChanges == null) {
                        valueUpdated6 = noChange;
                    } else if (creditorChanges.getPresent() && (newValue7 = creditorChanges.getNewValue()) != null) {
                        c.b it13 = (c.b) newValue7;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        valueUpdated6 = new FieldChange.ValueUpdated(l02.b.b(it13));
                    } else {
                        valueUpdated6 = fieldChange;
                    }
                    n firstAmountChanges = paymentMethodDetailsChanges.getFirstAmountChanges();
                    if (firstAmountChanges == null) {
                        valueUpdated7 = noChange;
                    } else if (firstAmountChanges.getPresent() && (newValue8 = firstAmountChanges.getNewValue()) != null) {
                        jo3.a it14 = (jo3.a) newValue8;
                        Intrinsics.checkNotNullParameter(it14, "it");
                        valueUpdated7 = new FieldChange.ValueUpdated(mo3.a.o(it14));
                    } else {
                        valueUpdated7 = fieldChange;
                    }
                    n lastAmountChanges = paymentMethodDetailsChanges.getLastAmountChanges();
                    if (lastAmountChanges == null) {
                        valueUpdated8 = noChange;
                    } else if (lastAmountChanges.getPresent() && (newValue9 = lastAmountChanges.getNewValue()) != null) {
                        jo3.a it15 = (jo3.a) newValue9;
                        Intrinsics.checkNotNullParameter(it15, "it");
                        valueUpdated8 = new FieldChange.ValueUpdated(mo3.a.o(it15));
                    } else {
                        valueUpdated8 = fieldChange;
                    }
                    n amountTypeChanges = paymentMethodDetailsChanges.getAmountTypeChanges();
                    if (amountTypeChanges == null) {
                        valueUpdated9 = noChange;
                    } else if (amountTypeChanges.getPresent() && (newValue10 = amountTypeChanges.getNewValue()) != null) {
                        String it16 = (String) newValue10;
                        Intrinsics.checkNotNullParameter(it16, "it");
                        AmountType[] amountTypeArrValues = AmountType.values();
                        int length5 = amountTypeArrValues.length;
                        while (true) {
                            if (i6 < length5) {
                                AmountType amountType2 = amountTypeArrValues[i6];
                                int i21 = length5;
                                int i22 = i6;
                                if (a0.z(amountType2.name(), it16, true)) {
                                    amountType = amountType2;
                                } else {
                                    i6 = i22 + 1;
                                    length5 = i21;
                                }
                            } else {
                                amountType = null;
                            }
                        }
                        valueUpdated9 = new FieldChange.ValueUpdated(amountType);
                    } else {
                        valueUpdated9 = fieldChange;
                    }
                    n firstTransactionDateChanges = paymentMethodDetailsChanges.getFirstTransactionDateChanges();
                    if (firstTransactionDateChanges == null) {
                        valueUpdated10 = noChange;
                    } else if (firstTransactionDateChanges.getPresent() && (newValue11 = firstTransactionDateChanges.getNewValue()) != null) {
                        String it17 = (String) newValue11;
                        Intrinsics.checkNotNullParameter(it17, "it");
                        valueUpdated10 = new FieldChange.ValueUpdated(LocalDate.parse(it17));
                    } else {
                        valueUpdated10 = fieldChange;
                    }
                    n lastTransactionDateChanges = paymentMethodDetailsChanges.getLastTransactionDateChanges();
                    if (lastTransactionDateChanges == null) {
                        valueUpdated11 = noChange;
                    } else if (lastTransactionDateChanges.getPresent() && (newValue12 = lastTransactionDateChanges.getNewValue()) != null) {
                        String it18 = (String) newValue12;
                        Intrinsics.checkNotNullParameter(it18, "it");
                        valueUpdated11 = new FieldChange.ValueUpdated(LocalDate.parse(it18));
                    } else {
                        valueUpdated11 = fieldChange;
                    }
                    n countPerPeriodChanges = paymentMethodDetailsChanges.getCountPerPeriodChanges();
                    FieldChange valueUpdated19 = countPerPeriodChanges == null ? noChange : (countPerPeriodChanges.getPresent() && (newValue13 = countPerPeriodChanges.getNewValue()) != null) ? new FieldChange.ValueUpdated((Integer) newValue13) : fieldChange;
                    n pointInTimeChanges = paymentMethodDetailsChanges.getPointInTimeChanges();
                    FieldChange valueUpdated20 = pointInTimeChanges == null ? noChange : (pointInTimeChanges.getPresent() && (newValue14 = pointInTimeChanges.getNewValue()) != null) ? new FieldChange.ValueUpdated((Integer) newValue14) : fieldChange;
                    n paymentNotAllowedBeforeChanges = paymentMethodDetailsChanges.getPaymentNotAllowedBeforeChanges();
                    if (paymentNotAllowedBeforeChanges == null) {
                        valueUpdated12 = noChange;
                    } else if (paymentNotAllowedBeforeChanges.getPresent() && (newValue15 = paymentNotAllowedBeforeChanges.getNewValue()) != null) {
                        String it19 = (String) newValue15;
                        Intrinsics.checkNotNullParameter(it19, "it");
                        valueUpdated12 = new FieldChange.ValueUpdated(LocalTime.parse(it19));
                    } else {
                        valueUpdated12 = fieldChange;
                    }
                    Intrinsics.checkNotNullParameter(paymentMethodDetailsChanges, "<this>");
                    if (paymentMethodDetailsChanges.getShortDescriptionChanges() == null && paymentMethodDetailsChanges.getPurposeChanges() == null && paymentMethodDetailsChanges.getReferenceChanges() == null && paymentMethodDetailsChanges.getTransferArrangementChanges() == null && paymentMethodDetailsChanges.getExpirationExtendedAutomaticallyChanges() == null) {
                        amendmentAdditionalInfo = null;
                    } else {
                        n shortDescriptionChanges = paymentMethodDetailsChanges.getShortDescriptionChanges();
                        if (shortDescriptionChanges == null) {
                            valueUpdated13 = noChange;
                        } else if (shortDescriptionChanges.getPresent() && (newValue16 = shortDescriptionChanges.getNewValue()) != null) {
                            String it20 = (String) newValue16;
                            Intrinsics.checkNotNullParameter(it20, "it");
                            valueUpdated13 = new FieldChange.ValueUpdated(it20);
                        } else {
                            valueUpdated13 = fieldChange;
                        }
                        n purposeChanges = paymentMethodDetailsChanges.getPurposeChanges();
                        if (purposeChanges == null) {
                            pVar = paymentMethodDetailsChanges;
                            valueUpdated14 = noChange;
                        } else if (purposeChanges.getPresent() && (newValue17 = purposeChanges.getNewValue()) != null) {
                            String it21 = (String) newValue17;
                            Intrinsics.checkNotNullParameter(it21, "it");
                            Purpose[] purposeArrValues = Purpose.values();
                            int length6 = purposeArrValues.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length6) {
                                    purpose = purposeArrValues[i32];
                                    Purpose[] purposeArr = purposeArrValues;
                                    pVar = paymentMethodDetailsChanges;
                                    if (!a0.z(purpose.name(), it21, true)) {
                                        i32++;
                                        purposeArrValues = purposeArr;
                                        paymentMethodDetailsChanges = pVar;
                                    }
                                } else {
                                    pVar = paymentMethodDetailsChanges;
                                    purpose = null;
                                }
                            }
                            valueUpdated14 = new FieldChange.ValueUpdated(purpose);
                        } else {
                            pVar = paymentMethodDetailsChanges;
                            valueUpdated14 = fieldChange;
                        }
                        n transferArrangementChanges = pVar.getTransferArrangementChanges();
                        if (transferArrangementChanges == null) {
                            valueUpdated15 = noChange;
                        } else if (transferArrangementChanges.getPresent() && (newValue18 = transferArrangementChanges.getNewValue()) != null) {
                            String it22 = (String) newValue18;
                            Intrinsics.checkNotNullParameter(it22, "it");
                            valueUpdated15 = new FieldChange.ValueUpdated(it22);
                        } else {
                            valueUpdated15 = fieldChange;
                        }
                        n expirationExtendedAutomaticallyChanges = pVar.getExpirationExtendedAutomaticallyChanges();
                        FieldChange valueUpdated21 = expirationExtendedAutomaticallyChanges == null ? noChange : (expirationExtendedAutomaticallyChanges.getPresent() && (newValue19 = expirationExtendedAutomaticallyChanges.getNewValue()) != null) ? new FieldChange.ValueUpdated((Boolean) newValue19) : fieldChange;
                        n referenceChanges = pVar.getReferenceChanges();
                        if (referenceChanges == null) {
                            fieldChange2 = valueUpdated14;
                            valueUpdated16 = noChange;
                        } else if (referenceChanges.getPresent() && (newValue20 = referenceChanges.getNewValue()) != null) {
                            String it23 = (String) newValue20;
                            Intrinsics.checkNotNullParameter(it23, "it");
                            fieldChange2 = valueUpdated14;
                            valueUpdated16 = new FieldChange.ValueUpdated(it23);
                        } else {
                            fieldChange2 = valueUpdated14;
                            valueUpdated16 = fieldChange;
                        }
                        amendmentAdditionalInfo = new PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo(valueUpdated13, fieldChange2, valueUpdated15, valueUpdated21, valueUpdated16);
                    }
                    payToPaymentMethodDetailsAmendment = new PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment(valueUpdated5, valueUpdated6, valueUpdated7, valueUpdated8, valueUpdated9, valueUpdated10, valueUpdated11, valueUpdated19, valueUpdated20, valueUpdated12, amendmentAdditionalInfo);
                } else {
                    payToPaymentMethodDetailsAmendment = null;
                }
                changes = new Changes(valueUpdated, valueUpdated18, fieldChange5, fieldChange4, valueUpdated4, payToPaymentMethodDetailsAmendment);
                changes2 = changes;
                return new ApmPaymentAuthorisationAmendment(id11, aVar2, localDateI, localDateI2, apmPaymentAuthorisationPaymentMethod, apmPaymentAuthorisationSummaryA, changes2);
            case 2:
                p paymentMethodDetailsChanges2 = mVar.getPaymentMethodDetailsChanges();
                if (paymentMethodDetailsChanges2 != null) {
                    Intrinsics.checkNotNullParameter(paymentMethodDetailsChanges2, "<this>");
                    n descriptionChanges2 = paymentMethodDetailsChanges2.getDescriptionChanges();
                    if (descriptionChanges2 == null) {
                        valueUpdated17 = noChange;
                    } else if (descriptionChanges2.getPresent() && (newValue21 = descriptionChanges2.getNewValue()) != null) {
                        String it24 = (String) newValue21;
                        Intrinsics.checkNotNullParameter(it24, "it");
                        valueUpdated17 = new FieldChange.ValueUpdated(it24);
                    } else {
                        valueUpdated17 = fieldChange;
                    }
                    upiPaymentMethodDetailsAmendment = new PaymentMethodDetailsAmendment.UpiPaymentMethodDetailsAmendment(valueUpdated17);
                } else {
                    upiPaymentMethodDetailsAmendment = null;
                }
                changes = new Changes(valueUpdated, valueUpdated18, valueUpdated2, valueUpdated3, valueUpdated4, upiPaymentMethodDetailsAmendment);
                changes2 = changes;
                return new ApmPaymentAuthorisationAmendment(id11, aVar2, localDateI, localDateI2, apmPaymentAuthorisationPaymentMethod, apmPaymentAuthorisationSummaryA, changes2);
        }
    }
}

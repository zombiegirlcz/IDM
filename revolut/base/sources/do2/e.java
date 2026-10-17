package do2;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreenContract$InputData;
import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import d27.g0;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import s7a.a0;
import s7a.c0;
import s7a.x;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wi0.b bVar;
        wi0.b bVar2;
        String str;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        String listId = model.f52580a;
        final q qVar = (q) iVarE3;
        y yVar = qVar.f116393s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        final String strE0 = d0.e0(listId, "ID_FORM_FIELD_");
        fo2.b bVarJ2 = qVar.J2(strE0);
        if (bVarJ2 == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Click on unrecognised field: ", strE0));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            final int i = 2;
            if (bVarJ2 instanceof com.revolut.feature.bank_account_switching.impl.ui.form.domain.a) {
                com.revolut.feature.bank_account_switching.impl.ui.form.domain.a aVar2 = (com.revolut.feature.bank_account_switching.impl.ui.form.domain.a) bVarJ2;
                FormFieldValue formFieldValue = (FormFieldValue) ((g) ((j2) yVar.f22677a).getValue()).f116375b.b().get(strE0);
                ViewController viewControllerE1 = qVar.e1(new o39.a(new DateInputInputData(aVar2.f63927b, (formFieldValue == null || !(formFieldValue instanceof FormFieldValue.DateField)) ? null : ((FormFieldValue.DateField) formFieldValue).f63913a)));
                Function1 block = new Function1() { // from class: do2.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i) {
                            case 0:
                                a0 data = (a0) obj3;
                                Intrinsics.checkNotNullParameter(data, "data");
                                c0 c0Var = data.f260599a;
                                if (c0Var instanceof go2.e) {
                                    FormFieldValue.DropdownField dropdownField = new FormFieldValue.DropdownField(((go2.e) c0Var).f145079a);
                                    q qVar2 = qVar;
                                    qVar2.H2(qVar2.f116393s, new g0(qVar2, 20, strE0, dropdownField));
                                }
                                break;
                            case 1:
                                ho2.f result = (ho2.f) obj3;
                                Intrinsics.checkNotNullParameter(result, "result");
                                FormFieldValue.PhoneNumberField phoneNumberField = new FormFieldValue.PhoneNumberField(result.f154208b, result.f154209c, result.f154207a);
                                q qVar3 = qVar;
                                qVar3.H2(qVar3.f116393s, new g0(qVar3, 20, strE0, phoneNumberField));
                                break;
                            default:
                                o39.d result2 = (o39.d) obj3;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof o39.c) {
                                    LocalDate localDate = ((o39.c) result2).f221710a;
                                    q qVar4 = qVar;
                                    ZoneId zoneIdOf = ZoneId.of(((l80.f) qVar4.f116391q).a());
                                    Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
                                    qVar4.H2(qVar4.f116393s, new g0(qVar4, 20, strE0, new FormFieldValue.DateField(localDate, zoneIdOf)));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                qVar.C1(new com.revolut.kompot.common.b(viewControllerE1, (ModalDestination.Style) null, 6));
            } else if (bVarJ2 instanceof com.revolut.feature.bank_account_switching.impl.ui.form.domain.d) {
                com.revolut.feature.bank_account_switching.impl.ui.form.domain.d dVar = (com.revolut.feature.bank_account_switching.impl.ui.form.domain.d) bVarJ2;
                FormFieldValue formFieldValue2 = (FormFieldValue) ((g) ((j2) yVar.f22677a).getValue()).f116375b.b().get(strE0);
                FormFieldValue.PhoneNumberField phoneNumberField = formFieldValue2 instanceof FormFieldValue.PhoneNumberField ? (FormFieldValue.PhoneNumberField) formFieldValue2 : null;
                final int i2 = 1;
                if (phoneNumberField == null || (bVar2 = phoneNumberField.f63918a) == null) {
                    int i3 = m.f116385a[qVar.o.f63905a.ordinal()];
                    if (i3 == 1) {
                        wi0.b.Companion.getClass();
                        bVar = wi0.b.h2;
                    } else if (i3 == 2) {
                        wi0.b.Companion.getClass();
                        bVar = wi0.b.p0;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wi0.b.Companion.getClass();
                        bVar = wi0.b.f297760n0;
                    }
                    bVar2 = bVar;
                }
                String str2 = dVar.f63939b;
                if (phoneNumberField == null || (str = phoneNumberField.f63920c) == null) {
                    m70.a.c(t0.f186434a);
                    str = "";
                }
                PhoneNumberInputScreen phoneNumberInputScreen = new PhoneNumberInputScreen(new PhoneNumberInputScreenContract$InputData(str2, str, bVar2));
                Function1 block2 = new Function1() { // from class: do2.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                a0 data = (a0) obj3;
                                Intrinsics.checkNotNullParameter(data, "data");
                                c0 c0Var = data.f260599a;
                                if (c0Var instanceof go2.e) {
                                    FormFieldValue.DropdownField dropdownField = new FormFieldValue.DropdownField(((go2.e) c0Var).f145079a);
                                    q qVar2 = qVar;
                                    qVar2.H2(qVar2.f116393s, new g0(qVar2, 20, strE0, dropdownField));
                                }
                                break;
                            case 1:
                                ho2.f result = (ho2.f) obj3;
                                Intrinsics.checkNotNullParameter(result, "result");
                                FormFieldValue.PhoneNumberField phoneNumberField2 = new FormFieldValue.PhoneNumberField(result.f154208b, result.f154209c, result.f154207a);
                                q qVar3 = qVar;
                                qVar3.H2(qVar3.f116393s, new g0(qVar3, 20, strE0, phoneNumberField2));
                                break;
                            default:
                                o39.d result2 = (o39.d) obj3;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof o39.c) {
                                    LocalDate localDate = ((o39.c) result2).f221710a;
                                    q qVar4 = qVar;
                                    ZoneId zoneIdOf = ZoneId.of(((l80.f) qVar4.f116391q).a());
                                    Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
                                    qVar4.H2(qVar4.f116393s, new g0(qVar4, 20, strE0, new FormFieldValue.DateField(localDate, zoneIdOf)));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                phoneNumberInputScreen.H = block2;
                qVar.C1(new com.revolut.kompot.common.b(phoneNumberInputScreen, (ModalDestination.Style) null, 6));
            } else if (bVarJ2 instanceof com.revolut.feature.bank_account_switching.impl.ui.form.domain.b) {
                com.revolut.feature.bank_account_switching.impl.ui.form.domain.b bVar3 = (com.revolut.feature.bank_account_switching.impl.ui.form.domain.b) bVarJ2;
                FormFieldValue formFieldValue3 = (FormFieldValue) ((g) ((j2) yVar.f22677a).getValue()).f116375b.b().get(strE0);
                FormFieldValue.DropdownField dropdownField = formFieldValue3 instanceof FormFieldValue.DropdownField ? (FormFieldValue.DropdownField) formFieldValue3 : null;
                String str3 = dropdownField != null ? dropdownField.f63917b : null;
                TextClause textClause = new TextClause(bVar3.f63930b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = bVar3.f;
                final int i5 = 0;
                qVar.f2(new PickerController(new x(textClause, null, null, null, false, null, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, null, str3, null, null, true, null, null, null, null, null, 2138963454), new go2.c(bVar3)), ModalDestination.Style.POPUP.f98311a, new Function1() { // from class: do2.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i5) {
                            case 0:
                                a0 data = (a0) obj3;
                                Intrinsics.checkNotNullParameter(data, "data");
                                c0 c0Var = data.f260599a;
                                if (c0Var instanceof go2.e) {
                                    FormFieldValue.DropdownField dropdownField2 = new FormFieldValue.DropdownField(((go2.e) c0Var).f145079a);
                                    q qVar2 = qVar;
                                    qVar2.H2(qVar2.f116393s, new g0(qVar2, 20, strE0, dropdownField2));
                                }
                                break;
                            case 1:
                                ho2.f result = (ho2.f) obj3;
                                Intrinsics.checkNotNullParameter(result, "result");
                                FormFieldValue.PhoneNumberField phoneNumberField2 = new FormFieldValue.PhoneNumberField(result.f154208b, result.f154209c, result.f154207a);
                                q qVar3 = qVar;
                                qVar3.H2(qVar3.f116393s, new g0(qVar3, 20, strE0, phoneNumberField2));
                                break;
                            default:
                                o39.d result2 = (o39.d) obj3;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof o39.c) {
                                    LocalDate localDate = ((o39.c) result2).f221710a;
                                    q qVar4 = qVar;
                                    ZoneId zoneIdOf = ZoneId.of(((l80.f) qVar4.f116391q).a());
                                    Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
                                    qVar4.H2(qVar4.f116393s, new g0(qVar4, 20, strE0, new FormFieldValue.DateField(localDate, zoneIdOf)));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            }
        }
        return Unit.f186387a;
    }
}

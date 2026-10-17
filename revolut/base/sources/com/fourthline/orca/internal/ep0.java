package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gb1;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ep0 implements nb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp0 f28219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gb1 f28220b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[uo0.values().length];
            try {
                iArr[uo0.f34146b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uo0.f34147c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uo0.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uo0.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uo0.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uo0.f34148g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ep0(bp0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f28219a = repository;
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_poa_type_header, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_poa_type_label_type, 0, 2, null);
        m80.b bVar = new m80.b(false);
        m80.a.C0250a c0250a = new m80.a.C0250a(null, 1, null);
        this.f28220b = new gb1(dVarA, dVarA2, a(repository.a()), null, new gb1.a(c81.a.a(aVar, R.string.step_poa_type_footer_no_poa, 0, 2, null), c81.a.a(aVar, R.string.shared_button_exit, 0, 2, null)), bVar, c0250a);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public gb1 getInitialState() {
        return this.f28220b;
    }

    @Override // com.fourthline.orca.internal.nb1
    public /* bridge */ Function1 a(boolean z) {
        return super.a(z);
    }

    @Override // com.fourthline.orca.internal.nb1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Function1 a(uo0 uo0Var) {
        return super.a((Object) uo0Var);
    }

    @Override // com.fourthline.orca.internal.nb1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c81 b(uo0 type) {
        Object next;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = this.f28219a.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((wo0) next).getId() == type) {
                break;
            }
        }
        wo0 wo0Var = (wo0) next;
        Integer validityInDays = wo0Var != null ? wo0Var.getValidityInDays() : null;
        if (validityInDays != null) {
            return c81.f27404a.a(R.string.step_poa_type_document_hint_text, String.valueOf(validityInDays.intValue()));
        }
        return null;
    }

    private final List a(List list) {
        c81.d dVarA;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            wo0 wo0Var = (wo0) it8.next();
            gb1.d dVar = gb1.d.f28841b;
            gb1.c cVar = gb1.c.f28837a;
            uo0 id10 = wo0Var.getId();
            int[] iArr = a.$EnumSwitchMapping$0;
            c81.d dVarA2 = null;
            switch (iArr[id10.ordinal()]) {
                case 1:
                    dVarA = c81.a.a(c81.f27404a, R.string.step_poa_type_document_type_UtilityBill, 0, 2, null);
                    break;
                case 2:
                    dVarA = c81.a.a(c81.f27404a, R.string.step_poa_type_document_type_TaxInvoice, 0, 2, null);
                    break;
                case 3:
                    dVarA = c81.a.a(c81.f27404a, R.string.step_poa_type_document_type_benefit_statement, 0, 2, null);
                    break;
                case 4:
                    dVarA = c81.a.a(c81.f27404a, R.string.step_poa_type_document_type_proof_of_housing, 0, 2, null);
                    break;
                case 5:
                    dVarA = c81.a.a(c81.f27404a, R.string.step_poa_type_document_type_Bankstatement, 0, 2, null);
                    break;
                case 6:
                    dVarA = c81.a.a(c81.f27404a, R.string.step_poa_type_document_type_other, 0, 2, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[wo0Var.getId().ordinal()]) {
                case 1:
                    dVarA2 = c81.f27404a.a(R.string.step_poa_type_document_type_UtilityBill_description, R.string.shared_radio_document_type_utility_bill_accessibility);
                    break;
                case 2:
                    dVarA2 = c81.f27404a.a(R.string.step_poa_type_document_type_TaxInvoice_description, R.string.shared_radio_document_type_tax_invoice_accessibility);
                    break;
                case 3:
                    dVarA2 = c81.f27404a.a(R.string.step_poa_type_document_type_benefit_statement_description, R.string.shared_radio_document_type_benefit_statement_accessibility);
                    break;
                case 4:
                    dVarA2 = c81.f27404a.a(R.string.step_poa_type_document_type_proof_of_housing_description, R.string.shared_radio_document_type_proof_of_housing_accessibility);
                    break;
                case 5:
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new gb1.b(dVar, cVar, dVarA, dVarA2, null, null, wo0Var.getId(), 16, null));
        }
        return arrayList;
    }
}

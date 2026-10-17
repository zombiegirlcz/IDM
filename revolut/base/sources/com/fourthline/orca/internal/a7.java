package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gb1;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a7 implements nb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb1 f26717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f26718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gb1 f26719c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v6.values().length];
            try {
                iArr[v6.f34255c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v6.f34254b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v6.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a7(lb1 repository, v10 imageServiceLocator) {
        Object next;
        gb1.a aVar;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f26717a = repository;
        this.f26718b = imageServiceLocator;
        List supportedTypes = repository.getSupportedTypes();
        c81.a aVar2 = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar2, R.string.step_bav_type_header, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar2, R.string.step_bav_type_label_payment_method, 0, 2, null);
        c81.d dVarA3 = c81.a.a(aVar2, R.string.step_bav_type_hint_instructions, 0, 2, null);
        Iterator it8 = supportedTypes.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((t5) next).getName() == v6.f34255c) {
                    break;
                }
            }
        }
        if (((t5) next) != null) {
            c81.a aVar3 = c81.f27404a;
            aVar = new gb1.a(c81.a.a(aVar3, R.string.shared_footer_sepa, 0, 2, null), c81.a.a(aVar3, R.string.shared_button_read_more, 0, 2, null));
        } else {
            aVar = null;
        }
        this.f26719c = new gb1(dVarA, dVarA2, a(supportedTypes), dVarA3, aVar, new m80.b(false), new m80.a.C0250a(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.nb1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* bridge */ c81 b(t5 t5Var) {
        return super.b((Object) t5Var);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public gb1 getInitialState() {
        return this.f26719c;
    }

    @Override // com.fourthline.orca.internal.nb1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Function1 a(t5 t5Var) {
        return super.a((Object) t5Var);
    }

    @Override // com.fourthline.orca.internal.nb1
    public /* bridge */ Function1 a(boolean z) {
        return super.a(z);
    }

    private final List a(List list) {
        c81.d dVarA;
        c81 c81VarA;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            t5 t5Var = (t5) it8.next();
            gb1.d dVar = gb1.d.f28841b;
            gb1.c cVar = gb1.c.f28838b;
            v6 name = t5Var.getName();
            int[] iArr = a.$EnumSwitchMapping$0;
            int i = iArr[name.ordinal()];
            if (i == 1) {
                dVarA = c81.a.a(c81.f27404a, R.string.step_bav_type_payment_method_Sepa, 0, 2, null);
            } else if (i == 2) {
                dVarA = c81.a.a(c81.f27404a, R.string.step_bav_type_payment_method_Online, 0, 2, null);
            } else if (i == 3) {
                dVarA = c81.a.a(c81.f27404a, R.string.step_bav_type_payment_method_Manual, 0, 2, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = iArr[t5Var.getName().ordinal()];
            if (i2 == 1) {
                c81.a aVar = c81.f27404a;
                String str = String.format(Locale.ROOT, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) t5Var.getAmount()) / 100.0d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                c81VarA = aVar.a(R.string.step_bav_type_payment_method_Sepa_description, str);
            } else if (i2 == 2) {
                c81.a aVar2 = c81.f27404a;
                String str2 = String.format(Locale.ROOT, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) t5Var.getAmount()) / 100.0d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                c81VarA = aVar2.a(R.string.step_bav_type_payment_method_Online_description, str2);
            } else if (i2 == 3) {
                c81VarA = c81.a.a(c81.f27404a, R.string.step_bav_type_payment_method_Manual_description, 0, 2, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new gb1.b(dVar, cVar, dVarA, c81VarA, null, t5Var.getFast() ? this.f26718b.a(r10.Y0) : null, t5Var, 16, null));
        }
        return arrayList;
    }
}

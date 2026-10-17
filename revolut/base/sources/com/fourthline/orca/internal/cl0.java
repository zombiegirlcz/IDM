package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class cl0 implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f27499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xj0 f27500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l81 f27501c;
    private final vc1 d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cl0(Function0 workflowIdProvider, xj0 dataBundle, l81 tinBundle, vc1 tinBundleIsValidUseCase) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        this.f27499a = workflowIdProvider;
        this.f27500b = dataBundle;
        this.f27501c = tinBundle;
        this.d = tinBundleIsValidUseCase;
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        List listC = zhm.u.c(rc1.d);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            i10 i10VarA = l8.a(this.f27500b, (String) this.f27499a.invoke(), (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listC, arrayList, null, null, 12, null);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a(ny nyVar) {
        List<rc1> listL = zhm.v.l(((nyVar instanceof j91) && a((j91) nyVar)) ? rc1.f : null);
        if (listL.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (rc1 rc1Var : listL) {
            i10 i10VarA = a.$EnumSwitchMapping$0[rc1Var.ordinal()] == 1 ? l8.a(this.f27501c, (String) this.f27499a.invoke(), rc1Var) : null;
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listL, arrayList, null, null, 12, null);
    }

    private final boolean a(j91 j91Var) {
        return Intrinsics.f(j91Var.getIsTinCaptureRequired(), Boolean.FALSE) && this.d.a(true);
    }
}

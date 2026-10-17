package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o91 implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f31608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l81 f31609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj f31610c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rc1.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o91(Function0 workflowIdProvider, l81 dataBundle, gj documentBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        this.f31608a = workflowIdProvider;
        this.f31609b = dataBundle;
        this.f31610c = documentBundle;
    }

    @Override // com.fourthline.orca.internal.ic1
    public /* bridge */ h10 a(ny nyVar) {
        return super.a(nyVar);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        List listK = zhm.v.k(rc1.e, rc1.f);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            i10 i10VarA = a((String) this.f31608a.invoke(), (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listK, arrayList, null, null, 12, null);
    }

    private final i10 a(String str, rc1 rc1Var) {
        int i = a.$EnumSwitchMapping$0[rc1Var.ordinal()];
        if (i == 1) {
            return l8.a(this.f31609b, str, rc1Var);
        }
        if (i != 2) {
            return null;
        }
        return hj.a(this.f31610c, str, rc1Var);
    }
}

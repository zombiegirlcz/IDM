package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public final class qc implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f32383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eb f32384b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.f32696m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qc(Function0 workflowIdProvider, eb dataBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        this.f32383a = workflowIdProvider;
        this.f32384b = dataBundle;
    }

    @Override // com.fourthline.orca.internal.ic1
    public /* bridge */ h10 a(ny nyVar) {
        return super.a(nyVar);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        List listC = zhm.u.c(rc1.f32696m);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            i10 i10VarA = a((String) this.f32383a.invoke(), (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listC, arrayList, null, null, 12, null);
    }

    private final i10 a(String str, rc1 rc1Var) {
        Pair pairA;
        if (a.$EnumSwitchMapping$0[rc1Var.ordinal()] != 1 || (pairA = pc1.a(this.f32384b)) == null) {
            return null;
        }
        WorkflowResults.IDV.Contacts contacts = (WorkflowResults.IDV.Contacts) pairA.f186385a;
        rc rcVar = (rc) pairA.f186386b;
        Json jsonA = s40.a();
        jsonA.getClass();
        return new i10(rc1Var, new qy("contactDataUpload", str, jsonA.c(rc.INSTANCE.serializer(), rcVar)), contacts);
    }
}

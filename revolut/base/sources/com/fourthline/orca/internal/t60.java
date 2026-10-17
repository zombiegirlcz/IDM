package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class t60 implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f33233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceMetadata f33234b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.f32694j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public t60(Function0 workflowIdProvider, DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        this.f33233a = workflowIdProvider;
        this.f33234b = deviceMetadata;
    }

    @Override // com.fourthline.orca.internal.ic1
    public /* bridge */ h10 a(ny nyVar) {
        return super.a(nyVar);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        List listC = zhm.u.c(rc1.f32694j);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            i10 i10VarA = a((String) this.f33233a.invoke(), (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listC, arrayList, null, null, 12, null);
    }

    private final i10 a(String str, rc1 rc1Var) {
        Pair pairA;
        if (a.$EnumSwitchMapping$0[rc1Var.ordinal()] != 1 || (pairA = pc1.a(this.f33234b)) == null) {
            return null;
        }
        return new i10(rc1Var, new qy("geolocationDataUpload", str, s40.a().c(b00.INSTANCE.serializer(), (b00) pairA.f186386b)), (WorkflowResults.IDV.Geolocation) pairA.f186385a);
    }
}

package fi0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wdi.f;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eim.c f135281b;

    public /* synthetic */ a(eim.c cVar, int i) {
        this.f135280a = i;
        this.f135281b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f135280a;
        eim.c cVar = this.f135281b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj2;
                if (num != null && num.intValue() == 0) {
                    z = true;
                }
                m.Companion companion = m.INSTANCE;
                cVar.resumeWith(Boolean.valueOf(z));
                break;
            case 1:
                bpf.c outputData = (bpf.c) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                m.Companion companion2 = m.INSTANCE;
                cVar.resumeWith(outputData);
                break;
            default:
                f outputData2 = (f) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                m.Companion companion3 = m.INSTANCE;
                cVar.resumeWith(Boolean.valueOf(outputData2 == f.CONFIRM_CLICK));
                break;
        }
        return Unit.f186387a;
    }
}

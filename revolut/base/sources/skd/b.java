package skd;

import akl.p;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tkd.l;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SlotChecklist f263819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f263820c;

    public /* synthetic */ b(SlotChecklist slotChecklist, i iVar, int i) {
        this.f263818a = i;
        this.f263819b = slotChecklist;
        this.f263820c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f263818a) {
            case 0:
                SlotChecklist other = (SlotChecklist) obj2;
                Intrinsics.checkNotNullParameter(other, "other");
                SlotChecklist slotChecklist = this.f263819b;
                String f87270a = slotChecklist.getF87261a().getF87270a();
                String f87270a2 = other.getF87261a().getF87270a();
                boolean z = f87270a.length() > 0 && f87270a2.length() > 0;
                this.f263820c.e.getClass();
                return Boolean.valueOf(z ? Intrinsics.f(f87270a, f87270a2) : Intrinsics.f(other.getF87261a().getF87271b(), slotChecklist.getF87261a().getF87271b()));
            default:
                l slotsData = (l) obj2;
                Intrinsics.checkNotNullParameter(slotsData, "slotsData");
                ArrayList arrayListF1 = d0.f1(slotsData.f);
                return arrayListF1.removeIf(new p(new b(this.f263819b, this.f263820c, 0), 22)) ? l.a(slotsData, null, null, null, null, arrayListF1, null, 95) : slotsData;
        }
    }
}

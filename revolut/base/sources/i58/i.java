package i58;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import ip0.iq;
import ip0.jq;
import j38.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k58.a f158789a;

    public i(k58.a relationshipTextProvider) {
        Intrinsics.checkNotNullParameter(relationshipTextProvider, "relationshipTextProvider");
        this.f158789a = relationshipTextProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jki.p
    public final m a(jki.i iVar) {
        Iterator it8;
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        this.f158789a.getClass();
        a.b bVar = a.b.f170986a;
        Clause clauseA = k58.a.a(bVar);
        iq iqVar = iq.RADIO_BUTTON;
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("JOINT_MARRIED_OR_CIVIL", clauseA, false, false, null, iqVar, null, null, bVar, null, 0, 0, 0, 523992);
        a.C0967a c0967a = a.C0967a.f170985a;
        int i = 0;
        int i2 = 523992;
        boolean z = false;
        InputChecklistDelegate.a aVar = null;
        jq jqVar = null;
        ResourceImage resourceImage = null;
        AnalyticsContext analyticsContext = null;
        int i3 = 0;
        int i5 = 0;
        InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model("JOINT_FAMILY", k58.a.a(c0967a), 0 == true ? 1 : 0, z, aVar, iqVar, jqVar, resourceImage, c0967a, analyticsContext, i3, i5, i, i2);
        a.c cVar = a.c.f170987a;
        List listK = v.k(model, model2, new InputChecklistDelegate.Model("JOINT_OTHER", k58.a.a(cVar), 0 == true ? 1 : 0, z, aVar, iqVar, jqVar, resourceImage, cVar, analyticsContext, i3, i5, i, i2));
        j38.a aVar2 = domainState.f158782a;
        List list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            InputChecklistDelegate.Model model3 = (InputChecklistDelegate.Model) it9.next();
            if (Intrinsics.f(model3.i, aVar2)) {
                String listId = model3.f52519a;
                Clause text = model3.f52520b;
                boolean z3 = model3.d;
                InputChecklistDelegate.a type = model3.e;
                iq checkType = model3.f;
                jq jqVar2 = model3.f52522g;
                Image image = model3.f52523h;
                Object obj2 = model3.i;
                Parcelable parcelable = model3.f52524j;
                int i6 = model3.k;
                int i21 = model3.f52525l;
                int i22 = model3.f52526m;
                int i32 = model3.f52527n;
                qv0.c positionInBox = model3.o;
                it8 = it9;
                p31.c cVar2 = model3.f52528p;
                p31.c cVar3 = model3.f52529q;
                p31.c cVar4 = model3.f52530r;
                p31.c cVar5 = model3.f52531s;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(checkType, "checkType");
                Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
                model3 = new InputChecklistDelegate.Model(listId, text, true, z3, type, checkType, jqVar2, image, obj2, parcelable, i6, i21, i22, i32, positionInBox, cVar2, cVar3, cVar4, cVar5);
            } else {
                it8 = it9;
            }
            arrayList.add(model3);
            it9 = it8;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new c(arrayList, domainState.f158782a != null);
    }
}

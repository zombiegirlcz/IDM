package n14;

import kotlin.jvm.internal.Intrinsics;
import z14.b;

/* JADX INFO: loaded from: classes22.dex */
public abstract class j {
    public static final mv3.d a(b.a aVar) {
        mv3.c cVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String text = aVar.getText();
        mv3.b bVar = mv3.c.Companion;
        String rawName = aVar.getAction();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(rawName, "rawName");
        mv3.c[] cVarArrValues = mv3.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (Intrinsics.f(cVar.name(), rawName)) {
                break;
            }
            i++;
        }
        if (cVar == null) {
            cVar = mv3.c.UNKNOWN;
        }
        return new mv3.d(text, cVar);
    }

    public static final mv3.f b(z14.d dVar) {
        mv3.g gVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String id10 = dVar.getId();
        boolean eligible = dVar.getEligible();
        boolean selected = dVar.getSelected();
        z14.e eligibilityConditions = dVar.getEligibilityConditions();
        if (eligibilityConditions != null) {
            Intrinsics.checkNotNullParameter(eligibilityConditions, "<this>");
            gVar = new mv3.g(eligibilityConditions.getDuration());
        } else {
            gVar = null;
        }
        return new mv3.f(id10, eligible, selected, gVar);
    }
}

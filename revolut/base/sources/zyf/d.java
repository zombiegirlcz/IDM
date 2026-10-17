package zyf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import myf.v;
import qzf.z;
import rzf.o;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f326458a = r0.k(new Pair("AUDIO", v.AUDIO), new Pair("WRITTEN", v.WRITTEN), new Pair("GUIDE", v.GUIDE));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperienceLanguage a(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        String id10 = zVar.getId();
        String label = zVar.getLabel();
        List guideTypes = zVar.getGuideTypes();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = guideTypes.iterator();
        while (it8.hasNext()) {
            v vVar = (v) u1.v((String) it8.next(), f326458a);
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return new TravelExperienceLanguage(id10, label, arrayList);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperienceLanguage b(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String id10 = oVar.getId();
        String label = oVar.getLabel();
        List guideTypes = oVar.getGuideTypes();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = guideTypes.iterator();
        while (it8.hasNext()) {
            v vVar = (v) u1.v((String) it8.next(), f326458a);
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return new TravelExperienceLanguage(id10, label, arrayList);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final o c(TravelExperienceLanguage travelExperienceLanguage) {
        Intrinsics.checkNotNullParameter(travelExperienceLanguage, "<this>");
        String str = travelExperienceLanguage.f92823a;
        String str2 = travelExperienceLanguage.f92824b;
        ArrayList arrayList = travelExperienceLanguage.f92825c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(u1.g((v) it8.next(), f326458a));
        }
        return new o(str, str2, arrayList2);
    }
}

package q2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperienceLocationPickerScreenContract$InputData f241652p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, TravelExperienceLocationPickerScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f241652p = inputData;
    }

    @Override // jki.g
    public final jki.i r2() {
        TravelExperienceLocationPickerScreenContract$InputData travelExperienceLocationPickerScreenContract$InputData = this.f241652p;
        List list = travelExperienceLocationPickerScreenContract$InputData.f93085b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((TravelExperienceBookingQuestion.Value) it8.next()).f92798a);
        }
        String str = travelExperienceLocationPickerScreenContract$InputData.f93084a;
        List list2 = travelExperienceLocationPickerScreenContract$InputData.f93086c;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list2) {
            linkedHashMap.put(((TravelExperienceLocation) obj2).f92826a, obj2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            TravelExperienceLocation travelExperienceLocation = (TravelExperienceLocation) linkedHashMap.get((String) it9.next());
            if (travelExperienceLocation != null) {
                arrayList2.add(travelExperienceLocation);
            }
        }
        return new c(str, travelExperienceLocationPickerScreenContract$InputData.d, arrayList, arrayList2);
    }
}

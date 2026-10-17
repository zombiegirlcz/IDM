package xl3;

import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ml3.i;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    public static ArrayList a(List deviceContacts, Map trustedUsers) {
        i iVarA;
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(deviceContacts, "deviceContacts");
        Intrinsics.checkNotNullParameter(trustedUsers, "trustedUsers");
        List<DeviceContact> list = deviceContacts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (DeviceContact deviceContact : list) {
            ql3.a aVar = (ql3.a) trustedUsers.get(deviceContact.f65992c);
            if (aVar == null) {
                m70.a.c(t0.f186434a);
                iVarA = hx7.i.A(deviceContact, "", null, null, "", false, false, do3.b.FULL.getId(), null, null, null, null);
            } else {
                String registeredAs = aVar.getRegisteredAs();
                String username = aVar.getUsername();
                String code = aVar.getCode();
                String country = aVar.getCountry();
                boolean newlyJoined = aVar.getNewlyJoined();
                String appMode = aVar.getAppMode();
                String pricePlan = aVar.getPricePlan();
                String customerType = aVar.getCustomerType();
                Long joinDate = aVar.getJoinDate();
                String birthday = aVar.getBirthday();
                iVarA = hx7.i.A(deviceContact, registeredAs, username, code, country, true, newlyJoined, appMode, pricePlan, customerType, joinDate, (birthday == null || (localDate = LocalDate.parse(birthday)) == null) ? null : localDate.toString());
            }
            arrayList.add(iVarA);
        }
        return arrayList;
    }
}

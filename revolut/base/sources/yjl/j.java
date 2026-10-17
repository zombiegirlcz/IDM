package yjl;

import com.revolut.sso.api.models.ConsentChallenge;
import java.util.ArrayList;
import java.util.List;
import jkl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {
    public static final ConsentChallenge.Client a(t0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ConsentChallenge.Client(aVar.getName(), aVar.getIconUri());
    }

    public static final ConsentChallenge.Device b(t0.d dVar) {
        com.revolut.sso.api.models.b bVar;
        String strV0;
        String string;
        String strZ0;
        String string2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String name = dVar.getName();
        String ip2 = dVar.getIp();
        t0.d.b.EnumC0997b status = dVar.getLocation().getStatus();
        int i = status == null ? -1 : i.f314546a[status.ordinal()];
        Double dValueOf = null;
        if (i == -1) {
            bVar = null;
        } else if (i == 1) {
            bVar = com.revolut.sso.api.models.b.PENDING_CONSENTING_DEVICE_LOCATION;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = com.revolut.sso.api.models.b.PENDING_VERIFICATION;
        }
        String address = dVar.getLocation().getAddress();
        String latlon = dVar.getLocation().getLatlon();
        Double dValueOf2 = (latlon == null || (strZ0 = d0.z0(latlon, ",", latlon)) == null || (string2 = d0.F0(strZ0).toString()) == null) ? null : Double.valueOf(Double.parseDouble(string2));
        String latlon2 = dVar.getLocation().getLatlon();
        if (latlon2 != null && (strV0 = d0.v0(latlon2, ",", latlon2)) != null && (string = d0.F0(strV0).toString()) != null) {
            dValueOf = Double.valueOf(Double.parseDouble(string));
        }
        return new ConsentChallenge.Device(name, ip2, new ConsentChallenge.Device.Location(bVar, address, dValueOf2, dValueOf));
    }

    public static final ConsentChallenge.Operation c(t0.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String title = eVar.getTitle();
        String subtitle = eVar.getSubtitle();
        String subject = eVar.getSubject();
        List<t0.e.b> properties = eVar.getProperties();
        ArrayList arrayList = new ArrayList(zhm.w.t(properties, 10));
        for (t0.e.b bVar : properties) {
            arrayList.add(new ConsentChallenge.Operation.Property(bVar.getName(), bVar.getKey(), bVar.getValue()));
        }
        return new ConsentChallenge.Operation(title, subtitle, subject, arrayList);
    }
}

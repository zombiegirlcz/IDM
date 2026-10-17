package ip8;

import dp8.d;
import dp8.h;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f167679a = r0.k(new Pair("PLANNED", h.PLANNED), new Pair("COMPLETED", h.COMPLETED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f167680b = r0.k(new Pair("ONE_OFF", d.ONE_OFF), new Pair("DAILY", d.DAILY), new Pair("WEEKLY", d.WEEKLY), new Pair("MONTHLY", d.MONTHLY));

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final dp8.b a(kp8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String juniorId = aVar.getJuniorId();
        String coparentId = aVar.getCoparentId();
        String name = aVar.getName();
        h hVar = (h) u1.u(aVar.getState(), f167679a);
        dj0.d dVarV = hx7.a.v(aVar.getReward());
        String iconUrl = aVar.getIconUrl();
        String description = aVar.getDescription();
        DateTime dateTime = new DateTime(aVar.getCreatedDate());
        Long completedDate = aVar.getCompletedDate();
        DateTime dateTime2 = completedDate != null ? new DateTime(completedDate.longValue()) : null;
        Long startDate = aVar.getStartDate();
        return new dp8.b(id10, juniorId, coparentId, name, hVar, dVarV, iconUrl, description, dateTime, dateTime2, startDate != null ? new DateTime(startDate.longValue()) : null, (d) u1.u(aVar.getFrequency(), f167680b));
    }
}

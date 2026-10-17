package ic9;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import w89.c;
import w89.e;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f160221a = q0.c(new Pair("NO_CHAT_TICKETS_EXIST", e.NO_CHAT_TICKETS_EXIST));

    public static final c a(hc9.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title = aVar.getTitle();
        String link = aVar.getLink();
        String displayCondition = aVar.getDisplayCondition();
        return new c(title, link, displayCondition != null ? (e) u1.v(displayCondition, f160221a) : null);
    }
}

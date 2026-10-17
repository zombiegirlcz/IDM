package tri;

import ihm.f;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityQueue f273800a = new PriorityQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f273801b = v0.a.d("create(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f273802c = true;

    public final void a(Object token, Function0 action) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(action, "action");
        b bVar = b.VIEW;
        sx4.b bVar2 = new sx4.b(token, 1);
        PriorityQueue priorityQueue = this.f273800a;
        a0.D(priorityQueue, bVar2);
        priorityQueue.add(new a(token.hashCode(), action, bVar, DateTime.now().getMillis()));
    }

    public final void b(Object token) {
        Object next;
        Intrinsics.checkNotNullParameter(token, "token");
        int iHashCode = token.hashCode();
        PriorityQueue priorityQueue = this.f273800a;
        Iterator it8 = priorityQueue.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((a) next).b() == iHashCode) {
                    break;
                }
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            priorityQueue.remove(aVar);
        }
    }
}

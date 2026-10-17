package eg;

import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f125453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f125454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque f125455c;
    public final h1 d;

    public i1(CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f125453a = backgroundDispatcher;
        this.f125455c = new LinkedBlockingDeque(20);
        this.d = new h1(this);
    }

    public static final Message a(i1 i1Var, ArrayList arrayList, int i) {
        Object obj2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((Message) obj3).what == i) {
                arrayList2.add(obj3);
            }
        }
        Iterator it8 = arrayList2.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it8.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (Message) obj2;
    }

    public final void b(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = this.f125455c;
        if (!linkedBlockingDeque.offer(message)) {
            String str = "Failed to enqueue message " + message.what + ". Dropping.";
            return;
        }
        String str2 = "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size();
    }

    public final void c(int i) {
        ArrayList arrayList = new ArrayList();
        this.f125455c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        skm.e0.C(skm.e0.c(this.f125453a), null, null, new afe.a(this, arrayList, (Continuation) null, 5), 3);
    }
}

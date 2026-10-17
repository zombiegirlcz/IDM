package tg;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends Handler implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f271013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Condition f271014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f271015c;
    public final LinkedList d;
    public final LinkedList e;
    public final LinkedList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedList f271016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f271017h;
    public final /* synthetic */ m i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar) {
        super(Looper.getMainLooper());
        this.i = mVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f271013a = reentrantLock;
        this.f271014b = reentrantLock.newCondition();
        this.f271015c = new LinkedList();
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.f271016g = new LinkedList();
    }

    public final void a(boolean z, h hVar) {
        ReentrantLock reentrantLock = this.f271013a;
        reentrantLock.lock();
        sendEmptyMessage(0);
        if (z) {
            this.d.add(hVar);
        } else {
            this.f271015c.add(hVar);
        }
        reentrantLock.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f271013a
            r0.lock()     // Catch: java.lang.Throwable -> L30
            java.util.LinkedList r1 = r2.f271015c     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.util.LinkedList r1 = r2.d     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.util.LinkedList r1 = r2.f     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.util.LinkedList r1 = r2.e     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.util.LinkedList r1 = r2.f271016g     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L2e
            goto L32
        L2e:
            r1 = 0
            goto L33
        L30:
            r1 = move-exception
            goto L37
        L32:
            r1 = 1
        L33:
            r0.unlock()
            return r1
        L37:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.i.b():boolean");
    }

    public final void c() {
        LinkedList linkedList = this.f;
        boolean zIsEmpty = linkedList.isEmpty();
        m mVar = this.i;
        if (!zIsEmpty) {
            Marker marker = (Marker) linkedList.poll();
            mVar.i.V(marker);
            mVar.f271034l.V(marker);
            mVar.f271030c.f253989a.c(marker);
            return;
        }
        LinkedList linkedList2 = this.f271016g;
        if (!linkedList2.isEmpty()) {
            g gVar = (g) linkedList2.poll();
            gVar.getClass();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.setInterpolator(m.f271027r);
            valueAnimatorOfFloat.addUpdateListener(gVar);
            valueAnimatorOfFloat.addListener(gVar);
            valueAnimatorOfFloat.start();
            return;
        }
        LinkedList linkedList3 = this.d;
        if (!linkedList3.isEmpty()) {
            h.a((h) linkedList3.poll(), this);
            return;
        }
        LinkedList linkedList4 = this.f271015c;
        if (!linkedList4.isEmpty()) {
            h.a((h) linkedList4.poll(), this);
            return;
        }
        LinkedList linkedList5 = this.e;
        if (linkedList5.isEmpty()) {
            return;
        }
        Marker marker2 = (Marker) linkedList5.poll();
        mVar.i.V(marker2);
        mVar.f271034l.V(marker2);
        mVar.f271030c.f253989a.c(marker2);
    }

    public final void d(boolean z, Marker marker) {
        ReentrantLock reentrantLock = this.f271013a;
        reentrantLock.lock();
        sendEmptyMessage(0);
        if (z) {
            this.f.add(marker);
        } else {
            this.e.add(marker);
        }
        reentrantLock.unlock();
    }

    public final void e() {
        while (b()) {
            sendEmptyMessage(0);
            ReentrantLock reentrantLock = this.f271013a;
            reentrantLock.lock();
            try {
                try {
                    if (b()) {
                        this.f271014b.await();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.f271017h) {
            Looper.myQueue().addIdleHandler(this);
            this.f271017h = true;
        }
        removeMessages(0);
        ReentrantLock reentrantLock = this.f271013a;
        reentrantLock.lock();
        for (int i = 0; i < 10; i++) {
            try {
                c();
            } catch (Throwable th10) {
                reentrantLock.unlock();
                throw th10;
            }
        }
        if (b()) {
            sendEmptyMessageDelayed(0, 10L);
        } else {
            this.f271017h = false;
            Looper.myQueue().removeIdleHandler(this);
            this.f271014b.signalAll();
        }
        reentrantLock.unlock();
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        sendEmptyMessage(0);
        return true;
    }
}

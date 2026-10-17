package gcm;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements g0, b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142764a;

    public /* synthetic */ m(int i) {
        this.f142764a = i;
    }

    @Override // gcm.g0
    public int a(d dVar, int i, Object obj2, int i2) {
        switch (this.f142764a) {
            case 1:
                break;
            case 2:
                dVar.n(i);
                break;
            case 3:
                dVar.k((byte[]) obj2, i2, i);
                break;
            case 4:
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i);
                dVar.j(byteBuffer);
                byteBuffer.limit(iLimit);
                break;
            default:
                dVar.i((OutputStream) obj2, i);
                break;
        }
        return 0;
    }

    @Override // gcm.b6
    public void b(Object obj2) {
        switch (this.f142764a) {
            case 7:
                ((ExecutorService) ((Executor) obj2)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj2).shutdown();
                break;
        }
    }

    @Override // gcm.b6
    public Object create() {
        switch (this.f142764a) {
            case 7:
                return Executors.newCachedThreadPool(p1.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, p1.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    public String toString() {
        switch (this.f142764a) {
            case 7:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    public m(n nVar) {
        this.f142764a = 0;
    }
}

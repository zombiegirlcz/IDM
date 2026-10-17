package retrofit2.mock;

import a68.f;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import okhttp3.ResponseBody;
import retrofit2.Response;
import ulm.b1;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkBehavior {
    private static final int DEFAULT_DELAY_MS = 2000;
    private static final int DEFAULT_ERROR_PERCENT = 0;
    private static final int DEFAULT_FAILURE_PERCENT = 3;
    private static final int DEFAULT_VARIANCE_PERCENT = 40;
    private final Random random;
    private volatile long delayMs = 2000;
    private volatile int variancePercent = 40;
    private volatile int failurePercent = 3;
    private volatile int errorPercent = 0;
    private volatile Callable<Response<?>> errorFactory = new f(15);
    private volatile Throwable failureException = new MockRetrofitIOException();

    private NetworkBehavior(Random random) {
        this.random = random;
        this.failureException.setStackTrace(new StackTraceElement[0]);
    }

    private static void checkPercentageValidity(int i, String str) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException(str);
        }
    }

    public static NetworkBehavior create() {
        return new NetworkBehavior(new Random());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$new$0() throws Exception {
        return Response.error(500, ResponseBody.create((b1) null, new byte[0]));
    }

    public long calculateDelay(TimeUnit timeUnit) {
        float f = this.variancePercent / 100.0f;
        float f4 = 1.0f - f;
        return TimeUnit.MILLISECONDS.convert((long) (this.delayMs * ((this.random.nextFloat() * ((f + 1.0f) - f4)) + f4)), timeUnit);
    }

    public boolean calculateIsError() {
        return this.random.nextInt(100) < this.errorPercent;
    }

    public boolean calculateIsFailure() {
        return this.random.nextInt(100) < this.failurePercent;
    }

    public Response<?> createErrorResponse() {
        try {
            Response<?> responseCall = this.errorFactory.call();
            if (responseCall == null) {
                throw new IllegalStateException("Error factory returned null.");
            }
            if (responseCall.isSuccessful()) {
                throw new IllegalStateException("Error factory returned successful response.");
            }
            return responseCall;
        } catch (Exception e) {
            throw new IllegalStateException("Error factory threw an exception.", e);
        }
    }

    public long delay(TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.convert(this.delayMs, timeUnit);
    }

    public int errorPercent() {
        return this.errorPercent;
    }

    public Throwable failureException() {
        return this.failureException;
    }

    public int failurePercent() {
        return this.failurePercent;
    }

    public void setDelay(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Amount must be positive value.");
        }
        this.delayMs = timeUnit.toMillis(j2);
    }

    public void setErrorFactory(Callable<Response<?>> callable) {
        if (callable == null) {
            throw new NullPointerException("errorFactory == null");
        }
        this.errorFactory = callable;
    }

    public void setErrorPercent(int i) {
        checkPercentageValidity(i, "Error percentage must be between 0 and 100.");
        this.errorPercent = i;
    }

    public void setFailureException(Throwable th10) {
        if (th10 == null) {
            throw new NullPointerException("exception == null");
        }
        this.failureException = th10;
    }

    public void setFailurePercent(int i) {
        checkPercentageValidity(i, "Failure percentage must be between 0 and 100.");
        this.failurePercent = i;
    }

    public void setVariancePercent(int i) {
        checkPercentageValidity(i, "Variance percentage must be between 0 and 100.");
        this.variancePercent = i;
    }

    public int variancePercent() {
        return this.variancePercent;
    }

    public static NetworkBehavior create(Random random) {
        if (random != null) {
            return new NetworkBehavior(random);
        }
        throw new NullPointerException("random == null");
    }
}

package df;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f113738b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f113739c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfm.c f113740a;

    public j(dfm.c cVar) {
        this.f113740a = cVar;
    }

    public final boolean a(ef.a aVar) {
        if (TextUtils.isEmpty(aVar.f125244c)) {
            return true;
        }
        long j2 = aVar.f + aVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f113740a.getClass();
        return j2 < timeUnit.toSeconds(System.currentTimeMillis()) + f113738b;
    }
}

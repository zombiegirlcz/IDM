package oa1;

import com.youTransactor.uCube.log.ILogger;
import fa1.k;
import fa1.w;
import ihm.f;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f223499a = v0.a.d("create(...)");

    public static w a(String str, String str2, Exception exc2, k kVar) {
        DateTime dateTimeNow = DateTime.now(DateTimeZone.UTC);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str + "- " + str2);
        if (exc2 != null) {
            sb6.append(", error=" + exc2);
        }
        String string = sb6.toString();
        Intrinsics.h(dateTimeNow);
        return new w(dateTimeNow, string, kVar);
    }

    @Override // com.youTransactor.uCube.log.ILogger
    public final void d(String tag2, String message) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (l.f172594a) {
            return;
        }
        this.f223499a.onNext(a(tag2, message, null, k.INFO));
    }

    @Override // com.youTransactor.uCube.log.ILogger
    public final void e(String tag2, String message, Exception exc2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f223499a.onNext(a(tag2, message, exc2, k.ERROR));
    }

    @Override // com.youTransactor.uCube.log.ILogger
    public final void w(String tag2, String message) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        d(tag2, message);
    }
}

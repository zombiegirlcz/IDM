package zzj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    public void a(ArrayList articles) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        b(DateTime.now().minusDays(6).getMillis());
        h(articles);
    }

    public abstract void b(long j2);

    public abstract e c(String str, boolean z);

    public abstract List d(String str, boolean z, long j2, long j3, int i);

    public abstract List e(int i, long j2, long j3, String str, String str2);

    public abstract List f(int i);

    public abstract List g(int i, long j2, long j3, String str, String str2);

    public abstract void h(ArrayList arrayList);

    public abstract void i(e eVar);
}

package n8i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f213461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f213462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f213463c;

    public q(Data content, Data topupData, o scheduleConfig) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(topupData, "topupData");
        Intrinsics.checkNotNullParameter(scheduleConfig, "scheduleConfig");
        this.f213461a = content;
        this.f213462b = topupData;
        this.f213463c = scheduleConfig;
    }

    public static q a(q qVar, Data content, Data topupData, o scheduleConfig, int i) {
        if ((i & 1) != 0) {
            content = qVar.f213461a;
        }
        if ((i & 2) != 0) {
            topupData = qVar.f213462b;
        }
        if ((i & 4) != 0) {
            scheduleConfig = qVar.f213463c;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(topupData, "topupData");
        Intrinsics.checkNotNullParameter(scheduleConfig, "scheduleConfig");
        return new q(content, topupData, scheduleConfig);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f213461a, qVar.f213461a) && Intrinsics.f(this.f213462b, qVar.f213462b) && Intrinsics.f(this.f213463c, qVar.f213463c);
    }

    public final int hashCode() {
        return this.f213463c.hashCode() + kii.e.c(this.f213462b, this.f213461a.hashCode() * 31, 31);
    }
}

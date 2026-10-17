package mbm;

import java.util.function.Function;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f204245a;

    public /* synthetic */ c(long j2) {
        this.f204245a = j2;
    }

    public static c a(long j2) {
        if (j2 >= 1) {
            return new c(j2);
        }
        throw new IllegalArgumentException(p.a.n(j2, "Illegal argument interval: ", " millis is less than 1"));
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        long jIntValue = ((Integer) obj2).intValue();
        if (jIntValue >= 1) {
            return Long.valueOf(this.f204245a);
        }
        throw new IllegalArgumentException(p.a.m(jIntValue, "Illegal argument attempt: "));
    }
}

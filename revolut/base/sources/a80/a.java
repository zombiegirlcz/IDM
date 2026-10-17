package a80;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq4.j;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1981c;

    public /* synthetic */ a(long j2, long j3, int i) {
        this.f1979a = i;
        this.f1980b = j2;
        this.f1981c = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f1979a) {
            case 0:
                File it8 = (File) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                long jLastModified = it8.lastModified();
                return Boolean.valueOf(jLastModified != 0 && this.f1980b - jLastModified >= this.f1981c);
            default:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, Long.valueOf(this.f1980b), Long.valueOf(this.f1981c), false, false, 57);
        }
    }
}

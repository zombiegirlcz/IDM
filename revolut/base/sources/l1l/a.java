package l1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements yqi.f {

    @NotNull
    public static final C1087a Companion = new C1087a();

    /* JADX INFO: renamed from: l1l.a$a, reason: collision with other inner class name */
    public static final class C1087a {
        private C1087a() {
        }
    }

    public static yqi.d a(b validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        hrf.e eVar = (hrf.e) validationData.f191576b.getContent();
        if (validationData.f191576b.getLoading() || eVar == null) {
            return new yqi.d(validationData, trf.a.f273792a);
        }
        long j2 = validationData.f191575a.f115082a;
        if (j2 != 0 && !eVar.f154815b) {
            if (Math.abs(j2) % ((long) Math.pow(10.0d, r1.f115083b.c())) != 0) {
                return new yqi.d(validationData, j1l.a.f170634a);
            }
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((b) obj2);
    }
}

package twj;

import java.util.concurrent.Callable;
import o0j.p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f275032b;

    public /* synthetic */ b(f fVar, int i) {
        this.f275031a = i;
        this.f275032b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f275031a) {
            case 0:
                return Boolean.valueOf(j6.a.k(String.class, this.f275032b.f275039c, "device_fingerprint") != null);
            default:
                rwj.d dVar = (rwj.d) j6.a.k(rwj.d.class, this.f275032b.f275039c, "user_phone_data");
                if (dVar != null) {
                    return new p(dVar.getPhoneCountryCode(), dVar.getPhoneCode(), dVar.getPhoneNumber());
                }
                return null;
        }
    }
}

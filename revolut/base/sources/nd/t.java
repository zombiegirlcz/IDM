package nd;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes17.dex */
public final class t extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f214270a;

    public t(u uVar) {
        this.f214270a = uVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        u uVar = this.f214270a;
        try {
            j jVar = j.f214262c;
            Mac mac = (Mac) jVar.f214263a.e(uVar.f214272b);
            mac.init(uVar.f214273c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}

package ie;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f160528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f160529b;

    public k(u uVar, oe.c cVar) {
        this.f160528a = uVar;
        this.f160529b = new j(cVar);
    }

    public final void a(String str) {
        j jVar = this.f160529b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f160526b, str)) {
                j.a(jVar.f160525a, str, jVar.f160527c);
                jVar.f160526b = str;
            }
        }
    }
}

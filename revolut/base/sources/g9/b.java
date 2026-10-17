package g9;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.m;
import java.io.Closeable;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends m {
    public final b d;
    public twg.c e;
    public b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f141417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f141418h;
    public boolean i;

    public b(int i, b bVar, twg.c cVar) {
        this.f26179b = i;
        this.d = bVar;
        this.e = cVar;
        this.f26180c = -1;
    }

    @Override // com.fasterxml.jackson.core.m
    public final String a() {
        return this.f141417g;
    }

    public final int e(String str) throws JsonGenerationException {
        if (this.f26179b != 2 || this.i) {
            return 4;
        }
        this.i = true;
        this.f141417g = str;
        twg.c cVar = this.e;
        if (cVar == null || !cVar.D(str)) {
            return this.f26180c < 0 ? 0 : 1;
        }
        Closeable closeable = (Closeable) cVar.f275017a;
        throw new JsonGenerationException(p.a.p("Duplicate field '", str, "'"), closeable instanceof h ? (h) closeable : null);
    }

    public b(int i, b bVar, twg.c cVar, Object obj2) {
        this.f26179b = i;
        this.d = bVar;
        this.e = cVar;
        this.f26180c = -1;
        this.f141418h = obj2;
    }
}

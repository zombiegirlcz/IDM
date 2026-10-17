package hgm;

import c8g.c;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f152193b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f152192a = i;
        this.f152193b = obj2;
    }

    @Override // c8g.c
    public final c a(Serializable serializable) {
        switch (this.f152192a) {
            case 0:
                ((PrintStream) this.f152193b).print(serializable);
                break;
            default:
                ((PrintWriter) this.f152193b).print(serializable);
                break;
        }
        return this;
    }
}

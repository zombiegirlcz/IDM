package l8;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f192711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f192712c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f192710a = i;
        this.f192711b = obj2;
        this.f192712c = obj3;
    }

    @Override // c8.m
    public final boolean a(Object obj2, c8.k kVar) {
        switch (this.f192710a) {
            case 0:
                return ((c8.m) this.f192711b).a(obj2, kVar);
            case 1:
                return "android.resource".equals(((Uri) obj2).getScheme());
            default:
                return true;
        }
    }

    @Override // c8.m
    public final e8.e0 b(Object obj2, int i, int i2, c8.k kVar) {
        boolean z;
        x xVar;
        switch (this.f192710a) {
            case 0:
                return c.b((Resources) this.f192712c, ((c8.m) this.f192711b).b(obj2, i, i2, kVar));
            case 1:
                e8.e0 e0VarC = ((n8.d) this.f192711b).c((Uri) obj2, kVar);
                if (e0VarC == null) {
                    return null;
                }
                return r.a((f8.a) this.f192712c, (Drawable) ((n8.c) e0VarC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj2;
                if (inputStream instanceof x) {
                    xVar = (x) inputStream;
                    z = false;
                } else {
                    z = true;
                    xVar = new x(inputStream, (f8.f) this.f192712c);
                }
                y8.e eVarD = y8.e.d(xVar);
                com.google.protobuf.a aVar = new com.google.protobuf.a(eVarD);
                jid.z zVar = new jid.z(xVar, eVarD, 6);
                try {
                    p pVar = (p) this.f192711b;
                    c cVarA = pVar.a(new jpc.e(aVar, pVar.d, pVar.f192747c), i, i2, kVar, zVar);
                    eVarD.release();
                    if (z) {
                        xVar.release();
                    }
                    return cVarA;
                } finally {
                }
        }
    }

    public a(Resources resources, c8.m mVar) {
        this.f192710a = 0;
        this.f192712c = resources;
        this.f192711b = mVar;
    }
}

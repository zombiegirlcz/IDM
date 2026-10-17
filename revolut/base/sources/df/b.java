package df;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f113722b;

    public /* synthetic */ b(d dVar, int i) {
        this.f113721a = i;
        this.f113722b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        ef.a aVarH;
        ef.a aVarF;
        switch (this.f113721a) {
            case 0:
                this.f113722b.a();
                return;
            case 1:
                this.f113722b.a();
                return;
            default:
                d dVar = this.f113722b;
                Object obj2 = d.f113725m;
                synchronized (obj2) {
                    try {
                        pd.g gVar = dVar.f113726a;
                        gVar.a();
                        cpi.g gVarG = cpi.g.g(gVar.f235023a);
                        try {
                            aVarH = dVar.f113728c.H();
                            if (gVarG != null) {
                                gVarG.I();
                            }
                        } catch (Throwable th10) {
                            if (gVarG != null) {
                                gVarG.I();
                            }
                            throw th10;
                        }
                    } finally {
                    }
                }
                try {
                    ef.c cVar = aVarH.f125243b;
                    ef.c cVar2 = ef.c.REGISTER_ERROR;
                    if (cVar == cVar2) {
                        aVarF = dVar.f(aVarH);
                    } else {
                        if (cVar == ef.c.UNREGISTERED) {
                            aVarF = dVar.f(aVarH);
                        } else if (!dVar.d.a(aVarH)) {
                            return;
                        } else {
                            aVarF = dVar.b(aVarH);
                        }
                    }
                    synchronized (obj2) {
                        try {
                            pd.g gVar2 = dVar.f113726a;
                            gVar2.a();
                            cpi.g gVarG2 = cpi.g.g(gVar2.f235023a);
                            try {
                                dVar.f113728c.w(aVarF);
                                if (gVarG2 != null) {
                                    gVarG2.I();
                                }
                            } catch (Throwable th11) {
                                if (gVarG2 != null) {
                                    gVarG2.I();
                                }
                                throw th11;
                            }
                        } finally {
                        }
                    }
                    synchronized (dVar) {
                        if (dVar.k.size() != 0 && !TextUtils.equals(aVarH.f125242a, aVarF.f125242a)) {
                            Iterator it8 = dVar.k.iterator();
                            if (it8.hasNext()) {
                                a0.d.B(it8.next());
                                throw null;
                            }
                        }
                    }
                    if (aVarF.f125243b == ef.c.REGISTERED) {
                        String str = aVarF.f125242a;
                        synchronized (dVar) {
                            dVar.f113731j = str;
                        }
                    }
                    ef.c cVar3 = aVarF.f125243b;
                    if (cVar3 == cVar2) {
                        dVar.g(new FirebaseInstallationsException());
                        return;
                    } else if (cVar3 == ef.c.NOT_GENERATED || cVar3 == ef.c.ATTEMPT_MIGRATION) {
                        dVar.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        dVar.h(aVarF);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    dVar.g(e);
                    return;
                }
        }
    }
}

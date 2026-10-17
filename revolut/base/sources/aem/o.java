package aem;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class o extends nem.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3758a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f3759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kem.i f3760c;
    public final /* synthetic */ Object d;

    public o(fem.d dVar, kem.i iVar, Object obj2) {
        this.d = obj2;
        kem.s sVar = dVar.f134659c;
        List list = kem.u.f183239a;
        String strG = sVar.g("Content-Length");
        this.f3759b = strG != null ? Long.valueOf(Long.parseLong(strG)) : null;
        if (iVar == null) {
            kem.i iVar2 = kem.e.f183196a;
            iVar = kem.e.f183197b;
        }
        this.f3760c = iVar;
    }

    @Override // nem.c
    public final Long a() {
        switch (this.f3758a) {
        }
        return this.f3759b;
    }

    @Override // nem.c
    public final kem.i b() {
        switch (this.f3758a) {
        }
        return this.f3760c;
    }

    public o(sem.f fVar, kem.i iVar, Object obj2) {
        this.d = obj2;
        kem.s sVar = ((fem.d) fVar.f262233a).f134659c;
        List list = kem.u.f183239a;
        String strG = sVar.g("Content-Length");
        this.f3759b = strG != null ? Long.valueOf(Long.parseLong(strG)) : null;
        if (iVar == null) {
            kem.i iVar2 = kem.e.f183196a;
            iVar = kem.e.f183197b;
        }
        this.f3760c = iVar;
    }
}

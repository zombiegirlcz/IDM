package zi1;

import ang.f;
import cj1.k;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ulm.p0;
import yhm.j;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f322492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cj1.c f322493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f322494c;
    public final f d;
    public final Lazy e;

    public d(k addressRepository, cj1.c addressAutocompleteRepository, fk3.a configurationInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(addressAutocompleteRepository, "addressAutocompleteRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f322492a = addressRepository;
        this.f322493b = addressAutocompleteRepository;
        this.f322494c = configurationInteractor;
        this.d = userInteractor;
        this.e = j.b(new p0(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zi1.c
            if (r0 == 0) goto L13
            r0 = r6
            zi1.c r0 = (zi1.c) r0
            int r1 = r0.f322491x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322491x = r1
            goto L18
        L13:
            zi1.c r0 = new zi1.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322491x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            fk3.a r6 = r4.f322494c
            ik3.c r6 = (ik3.c) r6
            efm.d0 r6 = r6.p()
            r0.u = r5
            r0.f322491x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            e7l.f r6 = (e7l.f) r6
            java.util.List r6 = r6.h()
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r5 = wi0.a.a(r5)
            boolean r5 = r6.contains(r5)
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zi1.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}

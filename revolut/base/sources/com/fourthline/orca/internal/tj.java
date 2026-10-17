package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class tj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f33784a;

    private tj(rj rjVar) {
        this.f33784a = rjVar;
    }

    public static wf b(rj rjVar) {
        wf wfVarA = rjVar.a();
        vc.s.k(wfVarA);
        return wfVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wf get() {
        return b(this.f33784a);
    }

    public static tj a(rj rjVar) {
        return new tj(rjVar);
    }
}

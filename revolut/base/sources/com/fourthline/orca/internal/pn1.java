package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pn1 implements zc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32007b;

    public /* synthetic */ pn1(Object obj2, int i) {
        this.f32006a = i;
        this.f32007b = obj2;
    }

    @Override // com.fourthline.orca.internal.zc0
    public final boolean a(fd fdVar) {
        switch (this.f32006a) {
            case 0:
                return hp.a((hp) this.f32007b, fdVar);
            default:
                return rj.a((rj) this.f32007b, fdVar);
        }
    }
}

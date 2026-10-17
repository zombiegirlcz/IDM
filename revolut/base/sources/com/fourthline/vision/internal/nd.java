package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class nd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36603a;

    private nd(ed edVar) {
        this.f36603a = edVar;
    }

    public static be b(ed edVar) {
        be beVarProvideTriggerRepository = edVar.provideTriggerRepository();
        vc.s.k(beVarProvideTriggerRepository);
        return beVarProvideTriggerRepository;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public be get() {
        return b(this.f36603a);
    }

    public static nd a(ed edVar) {
        return new nd(edVar);
    }
}

package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class o0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0[] f49395a;

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final boolean isSupported(Class cls) {
        for (t0 t0Var : this.f49395a) {
            if (t0Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final f1 messageInfoFor(Class cls) {
        for (t0 t0Var : this.f49395a) {
            if (t0Var.isSupported(cls)) {
                return t0Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

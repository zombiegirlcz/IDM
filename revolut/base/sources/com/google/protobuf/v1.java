package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2[] f49807a;

    @Override // com.google.protobuf.b2
    public final boolean isSupported(Class cls) {
        for (b2 b2Var : this.f49807a) {
            if (b2Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.b2
    public final r2 messageInfoFor(Class cls) {
        for (b2 b2Var : this.f49807a) {
            if (b2Var.isSupported(cls)) {
                return b2Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

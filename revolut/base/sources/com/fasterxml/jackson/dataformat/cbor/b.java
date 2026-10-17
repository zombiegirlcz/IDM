package com.fasterxml.jackson.dataformat.cbor;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends com.fasterxml.jackson.core.e {
    static {
        d[] dVarArrValues = d.values();
        if (dVarArrValues.length > 0) {
            d dVar = dVarArrValues[0];
            throw null;
        }
        for (c cVar : c.values()) {
            boolean z = cVar._defaultState;
        }
    }

    public b() {
        super(null);
    }

    @Override // com.fasterxml.jackson.core.e
    public final f9.d c(f9.c cVar, boolean z) {
        return super.c(cVar, false);
    }

    public final e e(byte[] bArr) {
        h9.b bVar;
        int length = bArr.length;
        f9.d dVarC = super.c(new f9.c(0, length, bArr, false), true);
        h9.b bVar2 = this.f26168a;
        AtomicReference atomicReference = bVar2.f150070b;
        int mask = com.fasterxml.jackson.core.d.CANONICALIZE_FIELD_NAMES.getMask();
        int i = this.f26169b;
        if ((mask & i) != 0) {
            bVar = new h9.b(bVar2, bVar2.f150071c, (h9.a) atomicReference.get(), (com.fasterxml.jackson.core.d.INTERN_FIELD_NAMES.getMask() & i) != 0, (com.fasterxml.jackson.core.d.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask() & i) != 0);
        } else {
            bVar = new h9.b((h9.a) atomicReference.get());
        }
        return new e(dVarC, this.f26170c, bVar, bArr, length, false);
    }
}

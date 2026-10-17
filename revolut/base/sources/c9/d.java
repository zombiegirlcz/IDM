package c9;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends c {
    public d() {
        super(0);
        ((e) this.f22248b).f22258p = false;
    }

    @Override // c9.c
    public final c d(TypedArray typedArray) {
        e eVar = (e) this.f22248b;
        super.d(typedArray);
        if (typedArray.hasValue(2)) {
            o(typedArray.getColor(2, eVar.e));
        }
        if (typedArray.hasValue(12)) {
            eVar.d = typedArray.getColor(12, eVar.d);
        }
        return this;
    }

    @Override // c9.c
    public final c e() {
        return this;
    }

    public final void o(int i) {
        e eVar = (e) this.f22248b;
        eVar.e = (i & 16777215) | (eVar.e & (-16777216));
    }

    public final void p(int i) {
        ((e) this.f22248b).d = i;
    }
}

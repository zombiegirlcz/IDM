package iri;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import nkm.t;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f168049a;

    @Override // iri.m
    public void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f168049a = true;
        Iterator it8 = v0().iterator();
        while (it8.hasNext()) {
            ((te0.e) it8.next()).g(bundle);
        }
    }

    @Override // iri.m
    public void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (this.f168049a) {
            return;
        }
        Iterator it8 = v0().iterator();
        while (it8.hasNext()) {
            ((te0.e) it8.next()).f(bundle);
        }
        u0(bundle);
    }

    public void u0(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    public Sequence v0() {
        return t.d();
    }
}

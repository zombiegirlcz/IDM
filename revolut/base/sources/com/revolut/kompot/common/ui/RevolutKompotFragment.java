package com.revolut.kompot.common.ui;

import akg.d;
import android.os.Bundle;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import gki.f;
import gki.i;
import gki.n;
import j70.a;
import jji.g;
import kji.h;
import kotlin.Metadata;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ui/RevolutKompotFragment;", "Lcom/revolut/kompot/entry_point/fragment/KompotFragment;", "<init>", "()V", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutKompotFragment extends KompotFragment {
    public abstract a A();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.q(this, new f(new h()), f.f144402b);
        s.q(this, new n(new d(24)), n.f144408b);
        s.q(this, new i(new g(A())), i.f144404b);
    }
}

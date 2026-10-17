package kgm;

import igm.q;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184016a;

    public a(int i) {
        this.f184016a = i;
    }

    @Override // igm.q
    public final Object get() {
        return new ArrayList(this.f184016a);
    }
}

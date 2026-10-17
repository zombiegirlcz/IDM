package zql;

import arl.c;
import e4m.e;
import zy4.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324501a;

    public /* synthetic */ a(int i) {
        this.f324501a = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f324501a) {
            case 0:
                return new c();
            default:
                return new d();
        }
    }
}

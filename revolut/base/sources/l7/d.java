package l7;

import g7.m;
import g7.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f192417a;

    public d() {
        this.f192417a = new ArrayList();
    }

    @Override // l7.g
    public g7.e a() {
        ArrayList arrayList = this.f192417a;
        return ((s7.a) arrayList.get(0)).c() ? new n(arrayList) : new m(arrayList);
    }

    @Override // l7.g
    public List b() {
        return this.f192417a;
    }

    @Override // l7.g
    public boolean isStatic() {
        ArrayList arrayList = this.f192417a;
        return arrayList.size() == 1 && ((s7.a) arrayList.get(0)).c();
    }

    public d(ArrayList arrayList) {
        this.f192417a = arrayList;
    }
}

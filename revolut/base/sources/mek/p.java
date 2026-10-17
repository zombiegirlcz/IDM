package mek;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pod_nominees.impl.edit.d f204717b;

    public /* synthetic */ p(com.revolut.retail.feature.pod_nominees.impl.edit.d dVar, int i) {
        this.f204716a = i;
        this.f204717b = dVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f204716a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f204717b.f102605n.getClass();
                return qek.a.a();
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f204717b.f102605n.getClass();
                return qek.a.b();
            case 2:
                this.f204717b.f102605n.getClass();
                return qek.a.a();
            default:
                this.f204717b.f102605n.getClass();
                return qek.a.b();
        }
    }
}

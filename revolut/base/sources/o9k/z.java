package o9k;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class z implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f223382b;

    public /* synthetic */ z(j0 j0Var, int i) {
        this.f223381a = i;
        this.f223382b = j0Var;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        int i = this.f223381a;
        j0 j0Var = this.f223382b;
        Throwable throwable = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var2);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var3);
                break;
        }
        return ((w0) j0Var.f223324n).Z2(throwable);
    }
}

package a5k;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1461b;

    public /* synthetic */ j(t tVar, int i) {
        this.f1460a = i;
        this.f1461b = tVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        int i = this.f1460a;
        t tVar = this.f1461b;
        Throwable throwable = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var2);
                break;
        }
        return tVar.f1486l.Z2(throwable);
    }
}

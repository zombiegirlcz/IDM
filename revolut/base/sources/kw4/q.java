package kw4;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f190242a;

    public q(z zVar) {
        this.f190242a = zVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
        this.f190242a.f190252p.getClass();
        return vt4.b.a();
    }
}

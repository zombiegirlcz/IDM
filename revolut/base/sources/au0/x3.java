package au0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 implements ix0.b1, p7.g0, yc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9432b;

    public /* synthetic */ x3(int i, int i2) {
        this.f9431a = i2;
        this.f9432b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    @Override // p7.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(q7.d r21, float r22) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.x3.a(q7.d, float):java.lang.Object");
    }

    @Override // yc.g
    public vc.c e(vc.c cVar) {
        int i = this.f9432b;
        int i2 = yc.a.f312389p;
        if (cVar == null) {
            return null;
        }
        int i3 = cVar.f287571a;
        long j2 = cVar.d;
        long j3 = cVar.e;
        List list = cVar.f;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        List list2 = cVar.f287574g;
        return vc.c.a(i3, 6, i, j2, j3, arrayList, list2 != null ? new ArrayList(list2) : new ArrayList());
    }

    @Override // ix0.b1
    public int getBottom() {
        switch (this.f9431a) {
            case 0:
                return this.f9432b;
            default:
                return -this.f9432b;
        }
    }

    public x3(Context context) {
        this.f9431a = 2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9432b = kli.a.k(context, 56.0f);
    }

    public x3(y3 y3Var) {
        this.f9431a = 0;
        this.f9432b = -com.google.android.gms.internal.mlkit_vision_face.a.a(y3Var.f9442a, "getContext(...)", 16.0f);
    }
}

package o29;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f221577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f221578c;
    public final /* synthetic */ f19.g d;

    public /* synthetic */ q(u uVar, String str, f19.g gVar, int i) {
        this.f221576a = i;
        this.f221577b = uVar;
        this.f221578c = str;
        this.d = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i19.c refreshedContent = (i19.c) obj2;
        switch (this.f221576a) {
            case 0:
                Intrinsics.checkNotNullParameter(refreshedContent, "contentUpdate");
                w4l.f fVar = this.f221577b.f221588h;
                f19.g gVar = this.d;
                Intrinsics.h(gVar);
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(refreshedContent, "refreshedContent");
                fVar.j(this.f221578c, f19.g.a(gVar, d8l.d.M(gVar.f131192b, refreshedContent)));
                break;
            default:
                Intrinsics.checkNotNullParameter(refreshedContent, "contentUpdate");
                w4l.f fVar2 = this.f221577b.i;
                f19.g gVar2 = this.d;
                Intrinsics.h(gVar2);
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                Intrinsics.checkNotNullParameter(refreshedContent, "refreshedContent");
                fVar2.j(this.f221578c, f19.g.a(gVar2, d8l.d.M(gVar2.f131192b, refreshedContent)));
                break;
        }
        return d0.m(Boolean.TRUE);
    }
}

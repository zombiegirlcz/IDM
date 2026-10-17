package hl6;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gjl.a f153008b;

    public /* synthetic */ v(gjl.a aVar, int i) {
        this.f153007a = i;
        this.f153008b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f153007a) {
            case 0:
                return g.a((g) obj2, null, this.f153008b.f144306a, null, null, null, 29);
            default:
                return xpl.c.a((xpl.c) obj2, null, this.f153008b.f144306a, 1);
        }
    }
}

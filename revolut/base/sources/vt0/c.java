package vt0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f291855b;

    public /* synthetic */ c(d dVar, int i) {
        this.f291854a = i;
        this.f291855b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291854a) {
            case 0:
                return d.c(this.f291855b, (jv0.m) obj2);
            default:
                return d.a(this.f291855b);
        }
    }
}

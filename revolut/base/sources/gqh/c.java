package gqh;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f145724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ moh.a f145725c;

    public /* synthetic */ c(String str, moh.a aVar, int i) {
        this.f145723a = i;
        this.f145724b = str;
        this.f145725c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f145723a) {
            case 0:
                return f.a((f) obj2, this.f145724b, this.f145725c, null, 4);
            default:
                return wph.n.a((wph.n) obj2, this.f145724b, this.f145725c, null, null, 25);
        }
    }
}

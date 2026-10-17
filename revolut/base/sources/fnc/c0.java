package fnc;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ doc.j f136626b;

    public /* synthetic */ c0(doc.j jVar, int i) {
        this.f136625a = i;
        this.f136626b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136625a) {
            case 0:
                return m.a((m) obj2, null, false, this.f136626b, null, null, null, null, null, null, null, null, null, 4091);
            default:
                return inc.e.a((inc.e) obj2, null, null, this.f136626b, false, null, 27);
        }
    }
}

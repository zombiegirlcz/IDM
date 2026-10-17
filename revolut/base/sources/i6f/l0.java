package i6f;

import kotlin.jvm.functions.Function1;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t6f.h f158945b;

    public /* synthetic */ l0(t6f.h hVar, int i) {
        this.f158944a = i;
        this.f158945b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158944a) {
            case 0:
                return t.a((t) obj2, null, null, this.f158945b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139);
            default:
                return j8f.j.a((j8f.j) obj2, null, this.f158945b, null, null, null, null, null, ISO781611.SMT_TAG);
        }
    }
}

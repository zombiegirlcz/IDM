package i6f;

import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r6f.e f158947b;

    public /* synthetic */ m0(r6f.e eVar, int i) {
        this.f158946a = i;
        this.f158947b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158946a) {
            case 0:
                return t.a((t) obj2, null, null, null, this.f158947b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
            case 1:
                return j8f.j.a((j8f.j) obj2, null, null, null, this.f158947b, null, null, null, LDSFile.EF_SOD_TAG);
            default:
                return n8f.h.a((n8f.h) obj2, null, null, null, this.f158947b, null, null, 55);
        }
    }
}

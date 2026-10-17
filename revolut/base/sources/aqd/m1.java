package aqd;

import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uib.a f8376b;

    public /* synthetic */ m1(uib.a aVar, int i) {
        this.f8375a = i;
        this.f8376b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8375a) {
            case 0:
                return t.a((t) obj2, null, null, null, this.f8376b.f280366a, false, null, null, LDSFile.EF_SOD_TAG);
            default:
                return vpd.d.a((vpd.d) obj2, null, null, this.f8376b.f280366a, 3);
        }
    }
}

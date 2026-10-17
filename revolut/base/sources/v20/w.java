package v20;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v30.j f285584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f285585c;
    public final /* synthetic */ UUID d;

    public /* synthetic */ w(v30.j jVar, f0 f0Var, UUID uuid, int i) {
        this.f285583a = i;
        this.f285584b = jVar;
        this.f285585c = f0Var;
        this.d = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285583a) {
            case 0:
                v30.j jVar = this.f285584b;
                if (jVar != null) {
                    this.f285585c.f285394r.k(this.d, jVar);
                }
                break;
            default:
                v30.j jVar2 = this.f285584b;
                if (jVar2 != null) {
                    this.f285585c.r(this.d, jVar2);
                }
                break;
        }
        return Unit.f186387a;
    }
}

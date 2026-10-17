package zfc;

import kotlin.jvm.functions.Function0;
import zc0.z;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f321919b;

    public /* synthetic */ a(d dVar, int i) {
        this.f321918a = i;
        this.f321919b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f321918a) {
            case 0:
                return nim.a.v(this.f321919b.f321923b.a(), new z(23));
            case 1:
                return nim.a.v(this.f321919b.f321923b.a(), new z(25));
            default:
                return nim.a.v(this.f321919b.f321923b.a(), new z(26));
        }
    }
}

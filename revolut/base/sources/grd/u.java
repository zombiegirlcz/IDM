package grd;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f146016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f146017c;

    public /* synthetic */ u(Set set, Set set2, int i) {
        this.f146015a = i;
        this.f146016b = set;
        this.f146017c = set2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f146015a) {
            case 0:
                return a.a((a) obj2, null, null, null, null, null, null, false, null, this.f146016b, this.f146017c, 8191);
            case 1:
                return srd.a.a((srd.a) obj2, null, false, this.f146016b, this.f146017c, 15);
            default:
                return urd.a.a((urd.a) obj2, null, null, 0, null, this.f146016b, this.f146017c, 63);
        }
    }
}

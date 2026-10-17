package xf;

import com.google.protobuf.a1;
import com.google.protobuf.b1;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304722a;

    @Override // com.google.protobuf.b1
    public final a1 findValueByNumber(int i) {
        switch (this.f304722a) {
            case 0:
                return d0.a(i);
            case 1:
                return e0.a(i);
            default:
                return x0.a(i);
        }
    }
}
